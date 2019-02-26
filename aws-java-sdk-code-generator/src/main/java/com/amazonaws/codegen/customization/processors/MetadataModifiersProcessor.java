/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
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

        String contentType = metadataConfig.getContentType();
        if (contentType != null) {
            metadata.setContentType(contentType);
        }
    }

}
