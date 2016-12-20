<#macro content metadata operationModel>

    ${operationModel.getSyncDocumentation(metadata)!""}
    @Override

    <#if operationModel.deprecated>
        @Deprecated
    </#if>
    public ${operationModel.syncReturnType} ${operationModel.methodName}(${operationModel.input.variableType} ${operationModel.input.variableName}) {

        ExecutionContext executionContext = createExecutionContext(${operationModel.input.variableName});
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<${operationModel.input.variableType}> request = null;
        Response<${operationModel.syncReturnType?cap_first}> response = null;

        <#if operationModel.input.streamPropertyName?has_content >
            final InputStream isOrig = ${operationModel.input.variableName}.get${operationModel.input.streamPropertyName?cap_first}();
        </#if>
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = <@RequestMarshallerCreation.content operationModel />.marshall(
                    super.beforeMarshalling(${operationModel.input.variableName}));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            <#if operationModel.returnType??>
                <@ResponseHandlerCreation.content operationModel, metadata, "new ${operationModel.syncReturnType}${metadata.unmarshallerClassSuffix}()", operationModel.returnType.returnType />
                response = <@ClientInvokeMethodInvocation.content operationModel />


                <#-- This macro is used in glacier for wrapping the response streams -->

                <#if WrapResponseStreamMacro?has_content>
                    <@WrapResponseStreamMacro.content operationModel/>
                </#if>

                return response.getAwsResponse();
            <#else>
                <@ResponseHandlerCreation.content operationModel, metadata, "null", "Void" />
                <@ClientInvokeMethodInvocation.content operationModel />
            </#if>

        } finally {
            <#if operationModel.input.streamPropertyName?has_content >
                // Restore the original input stream, so that the caller
                // (who is responsible) can close it
                ${operationModel.input.variableName}.set${operationModel.input.streamPropertyName?cap_first}(isOrig);
            </#if>

            endClientExecution(awsRequestMetrics, request, response);
        }
    }
</#macro>
