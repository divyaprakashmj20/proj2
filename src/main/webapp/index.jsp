<html>
<title>Login</title>
<body>
    <h2>Calculator</h2><br>
    <h3> Number 1 </h3> <input type="text" name="num1" id="num1" size=10>
    <h1>+</h1>
    <h3> Number 2 </h3> <input type="text" name="num2" id="num2" size=10>
    <h1>=</h1>
    <button type="button" onclick="validate()" id="but"> Calculate Sum</button>
    <h3> Answer </h3> <input type="text" name="ans" id="ans" width="100" readonly>



    <script type="text/javascript">
        var x = document.getElementById("num1");
        var y = document.getElementById("num2");


        function validate() {
            var a = Number(x.value);
            var b = Number(y.value);
            

            if (isNaN(a) || isNaN(b)) {
                document.getElementById("ans").value = "not a number";
            } 
            else if(x.value=="" || y.value==""){
            	document.getElementById("ans").value = "input required";
            }
            else {
                document.getElementById("ans").value = a + b;
            }
        }
    </script>
</body>

</html>