<#macro content serviceModelRoot>
    private void init() {
        <#if serviceModelRoot.endpointOperation?has_content>
        if (endpointDiscoveryEnabled) {
            cache = new ${serviceModelRoot.metadata.syncInterface}EndpointCache(this);
        }
        </#if>
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
<#if serviceModelRoot.metadata.defaultEndpoint?has_content>
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("${serviceModelRoot.metadata.defaultEndpoint}");
</#if>
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/${serviceModelRoot.metadata.packagePath}/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/${serviceModelRoot.metadata.packagePath}/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }
</#macro>
