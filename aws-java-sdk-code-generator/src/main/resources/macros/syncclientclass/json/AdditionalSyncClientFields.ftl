<#macro content serviceModelRoot>
<#local customConfig = serviceModelRoot.customizationConfig/>
    private static final ${serviceModelRoot.metadata.protocolFactory} protocolFactory = new ${serviceModelRoot.metadata.protocolFactory}(new JsonClientMetadata()
        .withProtocolVersion("${serviceModelRoot.metadata.jsonVersion}")
        .withSupportsCbor(${serviceModelRoot.metadata.cborProtocol?c})
        .withSupportsIon(${serviceModelRoot.metadata.ionProtocol?c})
        <#if serviceModelRoot.metadata.contentType?? && !customConfig.contentTypeOverride??>
        .withContentTypeOverride("${serviceModelRoot.metadata.contentType}")
        <#elseif customConfig.contentTypeOverride??>
        .withContentTypeOverride("${customConfig.contentTypeOverride}")
        </#if>
        <#list serviceModelRoot.shapes?values as shapeModel>
            <#if shapeModel.type == "Exception">
                .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("${shapeModel.errorCode}")
                    .withExceptionUnmarshaller(${serviceModelRoot.transformPackage}.${shapeModel.shapeName}Unmarshaller.getInstance()))
            </#if>
        </#list>
        .withBaseServiceExceptionClass(${serviceModelRoot.sdkModeledExceptionBaseFqcn}.class)
        );
</#macro>
