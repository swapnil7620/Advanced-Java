<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random"%> <!--   -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<!-- <h1>Welcome to my JSP page</h1>  --> 
	<%!int n1, n2, sum, num; // Angular bracket , percentage symbol  exclamention mark is used for global variable declaration
	 boolean isPrime = true;

	double areaCircle(int radius) {
		return Math.PI * radius * radius;
	}%>
	<% // To Write the java code we need to use (Angular , Percentage symbol)
	n1 = Integer.parseInt(request.getParameter("t1"));
	n2 = Integer.parseInt(request.getParameter("t2"));
	num  =   Integer.parseInt(request.getParameter("t3"));
	
	sum = n1 + n2;
	
	if (num <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }


    if (isPrime) {
        System.out.println(num + " is a prime number.");
      
    } else {
        System.out.println(num + " is not a prime number.");
    }
	
    
	
	//out.print(sum);
	%>
	<!--  
	<%@ include file="header.html"%> --> <!--  Angular bracket , percentage symbol  , @ ,  include use to fetch file overall data  -->
	<h1>
		The Result is
		<%=sum%></h1>
	<%
	Random random = new Random();
	n1 = random.nextInt(100);
	%>

	<h1>
		The Area of Circle of radius
		<%=n1%>
		is
		<%=areaCircle(n1)%></h1> <!-- Angular bracket , percentage symbol and = operator are use to write small java code inside the HTML tag  -->
	<h2> The Given Number  : <%=num%> is prime ? <br>ans : <%=isPrime %> </h2>
	<%@ include file="header.html"%>
	<%@ include file="header2.html"%>
	<%@ include file="functions.jsp"%>
	
	<h1><%= test() %></h1>
	<h1><%= test() %></h1>
</body>
</html>