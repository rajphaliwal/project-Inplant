<%-- 
    Document   : epos
    Created on : Apr 5, 2015, 12:23:29 PM
    Author     : Raj-HP
    17251
--%>

<%@page import="java.util.Map"%>
<%@page import="hibernate.pojo.TblPlant"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../../js/jquery-min.js" type="text/javascript"></script>
        <script src="../../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../../js/placeholder.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Epos</title>
        <script>
            var i;
            function showtimestamp()
            {
                document.getElementById("time").style.display = "block";
                document.getElementById("timestamp").style.display = "block";
                document.getElementById("Bothway").value = "1";
            }
            function hidetimestamp()
            {
                document.getElementById("time").style.display = "none";
                document.getElementById("timestamp").style.display = "none";
                document.getElementById("Bothway").value = "0";
            }
            function eposaction(button)
            {
                var number = /^\d+$/;
                var a = document.forms["epos"]["ITerminalId"].value;
                if (!number.test(a))
                {
                    alert("Terminal Id : Expected Integer");
                    return;
                }
                var b = document.forms["epos"]["IMachineId"].value;
                if (!number.test(b))
                {
                    alert("Machine Id : Expected Integer");
                    return;
                }
                var c = document.forms["epos"]["IGateNo"].value;
                if (!number.test(c))
                {
                    alert("Gate No : Expected Integer");
                    return;
                }
                if (button.id === "add")
                    document.epos.action = "insertepos";
                else if (button.id === "next")
                    document.epos.action = "inserteposnext";
                document.epos.submit();
            }
            function skipepos()
            {
                document.epos.action = "skipepos";
                document.epos.submit();
            }
        </script>
    </head>
    <%
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map sesion = (Map) ActionContext.getContext().getSession();
        hibernate.pojo.TblUsers user = (hibernate.pojo.TblUsers) sesion.get("user");
    %>
    <div class="container">
        <div class="row">
            <div class="jumbotron">
                <h2 style="text-align: center">Epos</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-offset-4 jumbotron"> 
                <form name="epos" action="" method="post">
                    <input  type="hidden" name="IPlantId" value="<% out.print(user.getTblPlant().getIPlantId().toString());%>"/>
                    <div class="form-group">
                        <label>Terminal Id:</label>  
                        <input type="text" class="form-control" name="ITerminalId" placeholder="Enter Terminal Id" onfocus="hide(this)" onblur="show(this, 'Enter Terminal Id')"/><br>
                        <label>Machine Id: </label> 
                        <input type="text" class="form-control" name="IMachineId" placeholder="Enter Machine Id" onfocus="hide(this)" onblur="show(this, 'Enter Machine Id')"/><br>
                        <label>Gate Number:  </label>
                        <input type="text" class="form-control" name="IGateNo" placeholder="Enter Gate No" onfocus="hide(this)" onblur="show(this, 'Enter Gate No')"/><br>
                        <label>Gateway Name: </label>
                        <input type="text" class="form-control" name="TGatewayName" placeholder="Enter Gateway Name" onfocus="hide(this)" onblur="show(this, 'Enter Gateway Name')"/><br>
                        <label>Location:    </label>
                        <input type="text" class="form-control" name="TLocation" placeholder="Enter Location" onfocus="hide(this)" onblur="show(this, 'Enter Location')"/><br>
                        <label>Function:	</label>  
                        <input type="radio" class="radio" name="BBothways" value="single" checked onClick="hidetimestamp()"/>Single Way<br>
                        <input type="radio" class="radio" name="BBothways" value="bothway" onClick="showtimestamp()" />Bothway<br>
                        <input type="hidden" name="Bothway" id="Bothway" value="0">
                        <label id="timestamp" style="display:none;">Timestamp:</label>

                        <input type="text" class="form-control" id="time" name="ITimeInBetween" value="0" style="display:none;" />

                        <input type="button" class="btn btn-info btn-success col-sm-12" name="add" id="add" value="Add More Epos" onClick = "eposaction(this)" />
                        <div>&nbsp;</div>
                        <input type="button" class="btn btn-success btn-success col-sm-12" name="next" id="next" value="Submit And Next Page" onClick = "eposaction(this)" />
                        <div>&nbsp;</div>
                        <input type="button" value="Skip" class="btn btn-info col-sm-12" onClick = "skipepos()" />
                    </div>
                </form>
            </div>
        </div>
    </div>
</html>
