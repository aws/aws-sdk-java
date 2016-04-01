<#--
    Glacier has a special JsonErrorResponseHandler to handle a differently named error type field.
    This macro is overriden in the Glacier client.
-->
<#macro content metadata>
   JsonErrorResponseHandlerV2 errorResponseHandler = SdkJsonProtocolFactory
   .createErrorResponseHandler(jsonErrorUnmarshallers, ${metadata.cborProtocol?c});
</#macro>
