<#--
    Glacier has a special JsonErrorResponseHandler to handle a differently named error type field.
    This macro is overridden in the Glacier client.
-->
<#macro content metadata customizationConfig awsQueryCompatible>
   HttpResponseHandler<AmazonServiceException> errorResponseHandler =
       protocolFactory.createErrorResponseHandler(
           new JsonErrorResponseMetadata()
           <#if customizationConfig.customErrorCodeFieldName?? >
               .withCustomErrorCodeFieldName("${customizationConfig.customErrorCodeFieldName}")
           </#if>
           <#if awsQueryCompatible?? >
               .withAwsQueryCompatibleErrorMapping(ImmutableMapParameter.<String, String>builder()
               <#list awsQueryCompatible?keys as key>
                   .put("${key}", "${awsQueryCompatible[key].code}")
               </#list>
               .build())
           </#if>
       );
</#macro>
