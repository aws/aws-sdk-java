<#macro content operationModel metadata unmarshallerReference outputType>
    JsonResponseHandler<${outputType}> responseHandler =
    SdkJsonProtocolFactory.createResponseHandler(${unmarshallerReference},${metadata.cborProtocol?c});
    responseHandler.setIsPayloadJson(${(!operationModel.hasBlobMemberAsPayload)?c});
</#macro>
