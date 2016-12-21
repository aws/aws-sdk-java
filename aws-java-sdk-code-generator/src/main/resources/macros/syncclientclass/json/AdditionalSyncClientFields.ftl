<#macro content serviceModelRoot>
    private final ${serviceModelRoot.metadata.protocolFactory} protocolFactory = new ${serviceModelRoot.metadata.protocolFactory}(new JsonClientMetadata()
        .withProtocolVersion("${serviceModelRoot.metadata.jsonVersion}")
        .withSupportsCbor(${serviceModelRoot.metadata.cborProtocol?c})
        .withSupportsIon(${serviceModelRoot.metadata.ionProtocol?c})
        <#if serviceModelRoot.metadata.contentType??>
        .withContentTypeOverride("${serviceModelRoot.metadata.contentType}")
        </#if>
        <#list serviceModelRoot.shapes?values as shapeModel>
            <#if shapeModel.type == "Exception">
                .addErrorMetadata(new JsonErrorShapeMetadata()
                    .withErrorCode("${shapeModel.errorCode}")
                    .withModeledClass(${serviceModelRoot.metadata.packageName}.model.${shapeModel.shapeName}.class))
            </#if>
        </#list>
        .withBaseServiceExceptionClass(${serviceModelRoot.sdkModeledExceptionBaseFqcn}.class)
        );
</#macro>
