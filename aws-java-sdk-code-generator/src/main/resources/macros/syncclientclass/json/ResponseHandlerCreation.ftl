<#macro content operationModel metadata unmarshallerReference outputType>
    JsonResponseHandler<${outputType}> responseHandler = new JsonResponseHandler<${outputType}>(${unmarshallerReference});
    responseHandler.setIsPayloadJson(${(!operationModel.hasBlobMemberAsPayload)?c});
</#macro>
