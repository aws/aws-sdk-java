<#macro content serviceModelRoot>
    private void init() {
<#list serviceModelRoot.shapes?values as shapeModel>
    <#if shapeModel.type == "Exception">
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(${serviceModelRoot.metadata.packageName}.model.${shapeModel.shapeName}.class, "${shapeModel.errorCode}"));
    </#if>
</#list>
        jsonErrorUnmarshallers.add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
<#if serviceModelRoot.metadata.defaultEndpoint?has_content>
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("${serviceModelRoot.metadata.defaultEndpoint}");
</#if>
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/${serviceModelRoot.metadata.packagePath}/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/${serviceModelRoot.metadata.packagePath}/request.handler2s"));
    }
</#macro>
