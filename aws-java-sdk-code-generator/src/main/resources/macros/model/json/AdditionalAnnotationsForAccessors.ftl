<#macro content shapeType memberModel>
    <#-- 
     JSON and Rest-JSON have a generic exception unmarshaller that uses Jackson databind.
     We explicitly mark each field with it's member name which is how it will appear on the wire
     to handle different casing conventions from service to service (or even shape to shape
     within in the same service although no service should be doing this but it is possible to 
     do in the model definition). 
     -->
    <#if shapeType == "Exception">
        @com.fasterxml.jackson.annotation.JsonProperty("${memberModel.http.unmarshallLocationName}")
    </#if>
</#macro>