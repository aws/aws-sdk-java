<#--
    Glacier has a special JsonErrorResponseHandler to handle a differently named error type field.
    This macro is overridden in the Glacier client.
-->
<#macro content metadata customizationConfig>
   HttpResponseHandler<AmazonServiceException> errorResponseHandler =
       protocolFactory.createErrorResponseHandler(
           new JsonErrorResponseMetadata()
           <#if customizationConfig.customErrorCodeFieldName?? >
               .withCustomErrorCodeFieldName("${customizationConfig.customErrorCodeFieldName}")
           </#if>
       );
</#macro>
