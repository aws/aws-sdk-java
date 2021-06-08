<#macro content metadata operationModel customConfig>

    ${operationModel.getSyncDocumentation(metadata)!""}
    @Override

    <#if operationModel.deprecated>
        @Deprecated
    </#if>
    public ${operationModel.syncReturnType} ${operationModel.methodName}(${operationModel.input.variableType} request) {
        request = beforeClientExecution(request);
        <#if operationModel.returnType??>
            return execute${operationModel.methodName?cap_first}(request);
        <#else>
            execute${operationModel.methodName?cap_first}(request);
        </#if>
    }

    @SdkInternalApi
    final ${operationModel.syncReturnType} execute${operationModel.methodName?cap_first}(${operationModel.input.variableType} ${operationModel.input.variableName}) {

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
                <#-- This macro is used in s3 control -->
                <#if S3ArnableFieldMacro?has_content>
                    <@S3ArnableFieldMacro.content operationModel customConfig/>
                </#if>
                request = <@RequestMarshallerCreation.content operationModel />.marshall(
                    super.beforeMarshalling(${operationModel.input.variableName}));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "${metadata.serviceId}");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "${operationModel.operationName}");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
                <#if customConfig.s3ArnableFields??&&customConfig.s3ArnableFields["${operationModel.input.variableType}"]??>
                    request.addHandlerContext(S3ControlHandlerContextKey.S3_ARNABLE_FIELD, new S3ArnableField().withArn(arn));
                </#if>

                <#if operationModel.hasRequiresLengthInInput() >
                    request.addHandlerContext(HandlerContextKey.REQUIRES_LENGTH, Boolean.TRUE);
                </#if>
                <#if operationModel.inputShape?? && operationModel.inputShape.hasStreamingMember >
                    request.addHandlerContext(HandlerContextKey.HAS_STREAMING_INPUT, Boolean.TRUE);
                </#if>

            } finally {
                  awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            <#if operationModel.endpointDiscovery?has_content && operationModel.endpointDiscovery.required == true>
                URI cachedEndpoint = null;
                if (endpointDiscoveryEnabled) {
                    DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                    <#if operationModel.inputShape.endpointDiscoveryMembers?has_content>
                    discoveryRequest.setOperation("${operationModel.operationName}");
                    Map<String, String> discoveryIdentifiers = new HashMap<String, String>();
                    <#list operationModel.inputShape.endpointDiscoveryMembers as edMember>
                    discoveryIdentifiers.put("${edMember}", ${operationModel.input.variableName}.get${edMember?cap_first}());
                    </#list>
                    discoveryRequest.setIdentifiers(discoveryIdentifiers);
                    </#if>
                    cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, ${operationModel.endpointDiscovery.required?c}, endpoint);
                }
            </#if>
            <#if operationModel.endpointDiscovery?has_content && operationModel.endpointDiscovery.required == false>
                URI cachedEndpoint = null;
                if (endpointDiscoveryEnabled) {
                    cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), false, endpoint);
                }
            </#if>


           <#if operationModel.endpointTrait?has_content>
               URI endpointTraitHost = null;
               if (!clientConfiguration.isDisableHostPrefixInjection()) {
                   <#local inputShape = operationModel.inputShape />
                   <#local hostPrefixProcessor = operationModel.getHostPrefixProcessor() />
                   <#list hostPrefixProcessor.c2jNames as memberName>
                       <#local memberShape = inputShape.getMemberByC2jName(memberName) />
                       ValidationUtils.assertStringNotEmpty(${operationModel.input.variableName}.${memberShape.getterMethodName}(), "${memberName}");
                       HostnameValidator.validateHostnameCompliant(${operationModel.input.variableName}.${memberShape.getterMethodName}(), "${memberName}", "${operationModel.input.variableName}");
                   </#list>

                   String hostPrefix = "${operationModel.endpointTrait.hostPrefix}";
                   String resolvedHostPrefix = String.format("${hostPrefixProcessor.hostWithStringSpecifier}"
                   <#list hostPrefixProcessor.c2jNames as memberName>
                        <#local memberShape = inputShape.getMemberByC2jName(memberName) />
                        , ${operationModel.input.variableName}.${memberShape.getterMethodName}()
                   </#list>
                        );

                   endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
               }
           </#if>

            <#if operationModel.returnType??>
                <@ResponseHandlerCreation.content customConfig, operationModel, metadata, "new ${operationModel.syncReturnType}${metadata.unmarshallerClassSuffix}()", operationModel.returnType.returnType />
                response = <@ClientInvokeMethodInvocation.content operationModel />


                <#if customConfig.serviceClientHoldInputStream
                     && operationModel.outputShape??
                     && operationModel.outputShape.hasStreamingMember>
                    response.getAwsResponse().${operationModel.outputShape.payloadMember.setterMethodName}(
                    new com.amazonaws.util.ServiceClientHolderInputStream(response.getAwsResponse().${operationModel.outputShape.payloadMember.getterMethodName}(),
                                                     this));

                </#if>

                <#if operationModel.outputShape?? && operationModel.outputShape.hasStreamingMember >
                    request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);
                </#if>

                <#-- This macro is used in glacier for wrapping the response streams -->
                <#if WrapResponseStreamMacro?has_content>
                    <@WrapResponseStreamMacro.content operationModel/>
                </#if>

                return response.getAwsResponse();
            <#else>
                <@ResponseHandlerCreation.content customConfig, operationModel, metadata, "null", "Void" />
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
