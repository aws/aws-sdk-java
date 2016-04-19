package com.amazonaws.codegen.customization.processors;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.model.config.customization.MetadataConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.service.ServiceMetadata;
import com.amazonaws.codegen.model.service.ServiceModel;

/**
 * This processor handles preprocess modifications to service metadata and
 * postprocess modifications to intermediate model metadata.
 */
public class MetadataModifiersProcessor implements CodegenCustomizationProcessor {

    private final MetadataConfig metadataConfig;

    MetadataModifiersProcessor(MetadataConfig metadataConfig) {
        this.metadataConfig = metadataConfig;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        if (metadataConfig == null) return;

        ServiceMetadata serviceMetadata = serviceModel.getMetadata();

        String customProtocol = metadataConfig.getProtocol();
        if (customProtocol != null) {
            serviceMetadata.setProtocol(customProtocol);
        }

    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        if (metadataConfig == null) return;

        Metadata metadata = intermediateModel.getMetadata();

        String jsonContentVersion = metadataConfig.getJsonContentVersion();
        if (jsonContentVersion != null) {
            metadata.setJsonContentVersion(jsonContentVersion);
        }
    }

}
