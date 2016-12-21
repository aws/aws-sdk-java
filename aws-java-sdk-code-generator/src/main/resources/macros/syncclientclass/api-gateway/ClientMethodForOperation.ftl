<#macro content metadata operationModel>

    ${operationModel.getSyncDocumentation(metadata)!""}
    @Override
    <#if operationModel.deprecated>
        @Deprecated
    </#if>
    public ${operationModel.syncReturnType} ${operationModel.methodName}(${operationModel.input.variableType} ${operationModel.input.variableName}) {
        HttpResponseHandler<${operationModel.returnType.returnType}> responseHandler =
            protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(${(!operationModel.hasBlobMemberAsPayload)?c})
                <#if operationModel.outputShape??>
                .withHasStreamingSuccessResponse(${operationModel.outputShape.hasStreamingMember?c})
                <#else>
                .withHasStreamingSuccessResponse(false)
                </#if>
            , new ${operationModel.syncReturnType}${metadata.unmarshallerClassSuffix}());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
        <#if operationModel.exceptions??>
            <#list operationModel.exceptions as exception>
                new JsonErrorShapeMetadata()
                    .withModeledClass(${exception.exceptionName}.class)
                    .withHttpStatusCode(${exception.httpStatusCode})<#sep>, </#sep>
            </#list>
        </#if>
        );

        return clientHandler.execute(
                new ClientExecutionParams<${operationModel.input.variableType}, ${operationModel.returnType.returnType}>()
                        .withMarshaller(<@RequestMarshallerCreation.content operationModel />)
                        .withResponseHandler(responseHandler)
                        .withErrorResponseHandler(errorResponseHandler)
                        .withInput(${operationModel.input.variableName}));
    }
</#macro>
