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

package com.amazonaws.codegen.model.intermediate;

import java.util.Map;

import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntermediateModel {

    /**
     * This is used for all service clients unless overridden in the Customizations file.
     */
    private static final String DEFAULT_CLIENT_CONFIG_FACTORY = "ClientConfigurationFactory";

    private final Metadata metadata;

    private final Map<String, OperationModel> operations;

    private final Map<String, ShapeModel> shapes;

    private final CustomizationConfig customizationConfig;

    private final ServiceExamples examples;

    public IntermediateModel(
            @JsonProperty("metadata") Metadata metadata,
            @JsonProperty("operations") Map<String, OperationModel> operations,
            @JsonProperty("shapes") Map<String, ShapeModel> shapes,
            @JsonProperty("customizationConfig") CustomizationConfig customizationConfig,
            @JsonProperty("serviceExamples") ServiceExamples examples) {
        this.metadata = metadata;
        this.operations = operations;
        this.shapes = shapes;
        this.customizationConfig = customizationConfig;
        this.examples = examples;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Map<String, OperationModel> getOperations() {
        return operations;
    }

    public Map<String, ShapeModel> getShapes() {
        return shapes;
    }

    public CustomizationConfig getCustomizationConfig() {
        return customizationConfig;
    }
    
    public ServiceExamples getExamples() {
    	return examples;
    }

    /**
     * ClientConfigurationFactory to use when producing default client configuration for the client.
     */
    public String getClientConfigFactory() {
        if (customizationConfig.getCustomClientConfigFactory() == null) {
            return DEFAULT_CLIENT_CONFIG_FACTORY;
        }
        return customizationConfig.getCustomClientConfigFactory();
    }
}
