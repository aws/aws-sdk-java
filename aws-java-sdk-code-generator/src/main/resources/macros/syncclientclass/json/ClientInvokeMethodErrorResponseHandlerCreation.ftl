<#--
    Glacier has a special JsonErrorResponseHandler to handle a differently named error type field.
    This macro is overriden in the Glacier client.
-->
<#macro content>
   JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(jsonErrorUnmarshallers);
</#macro>
