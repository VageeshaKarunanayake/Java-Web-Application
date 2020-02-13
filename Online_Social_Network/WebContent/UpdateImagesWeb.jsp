<%@ page import="Database.images,java.util.*" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="UploadPage/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="UploadPage/assets/css/styles.css">

	<script>
function myFunction(){
    var x = document.getElementById("myFile");
    var txt = "";
    if ('files' in x) {
        if (x.files.length == 0) {
            txt = "Select one or more files.";
        } else {
            for (var i = 0; i < x.files.length; i++) {
                txt += "<br><strong>" + (i+1) + ". file</strong><br>";
                var file = x.files[i];
                if ('name' in file) {
                    txt += "name: " + file.name + "<br>";
                }
                if ('size' in file) {
                    txt += "size: " + file.size + " bytes <br>";
                }
            }
        }
    } 
    else {
        if (x.value == "") {
            txt += "Select one or more files.";
        } else {
            txt += "The files property is not supported by your browser!";
            txt  += "<br>The path of the selected file: " + x.value; // 
        }
    }
    document.getElementById("select").innerHTML = txt;
}
</script>
	</head>

<body onload="myFunction()">
    <div class="col-md-6">
        <div class="checkbox">
        <form method="POST" action="UpdateImages.jsp">
        <% String email = (String)session.getAttribute("LogDetails"); 
			ArrayList<String> NumSet = images.GetNum(email);
				for(String Num : NumSet) {%>
            <label>
                <input type="checkbox" name="DelImages" value ="<%=Num%>"><%=Num%> Image</label><br>
                <%}%>
        <button class="btn btn-default" type="submit">Delete </button>
        </form>
        </div>
    </div>
    <div class="col-md-6">
        <form method="POST" action="UpdateImages.jsp">
		<input type="file" accept="image/*" required="" multiple="" id="myFile" name="Images" onchange="myFunction()">
		<p id="select"></p>
		<button class="btn btn-default" type="submit">Upload</button>
		</form>
    </div>
    <div style="float: right;margin-right: 70px">
    	<button class="btn btn-default" type="button" onclick="location.href='ImagesWeb.jsp';">Done</button>
    </div>
    <script src="UploadPage/assets/js/jquery.min.js"></script>
    <script src="UploadPage/assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>