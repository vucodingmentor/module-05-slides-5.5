<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project Manager</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
		crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" 
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" 
		crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" 
		crossorigin="anonymous"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Manage Project</h2>
   <hr />
   <input type="button" value="Add"
    onclick="window.location.href='add'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Project List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Name</th>
       <th>Size</th>
       <th>Action</th>
      </tr>

       <!-- loop over and print our projects -->
       <c:forEach var="project" items="${projects}">
	       <!-- construct an "update" link with project id -->
	       <c:url var="editLink" value="/project/edit">
	        <c:param name="id" value="${project.id}" />
	       </c:url>
	       <!-- construct an "delete" link with project id -->
	       <c:url var="removeLink" value="/project/remove">
	        <c:param name="id" value="${project.id}" />
	       </c:url>
	
	       <tr>
	        <td>${project.name}</td>
	        <td>${project.size}</td>
	        <td>
	         <!-- display the update link --> 
	         <a href="${editLink}">Edit</a>
	         | <a href="${removeLink}"
	  			onclick="if (!(confirm('Are you sure want to remove it?'))) return false">
	         		Remove
	        	</a>
	        </td>
	       </tr>
      </c:forEach>
     </table>
    </div>
   </div>
  </div>
 </div>
</body>
</html>