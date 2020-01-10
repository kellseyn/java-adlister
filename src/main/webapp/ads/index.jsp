<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="ad" items="${AdList}">
    <h2>${ad.title}</h2>
    <h4>${ad.description}</h4>


</c:forEach>