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

package com.amazonaws.codegen;

import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.service.ServiceMetadata;
import com.amazonaws.codegen.model.service.ServiceModel;

/**
 * Constructs the metadata that is required for generating the java client from the service meta
 * data.
 */
final class AddMetadata {

    public static Metadata constructMetadata(ServiceModel serviceModel,
                                             BasicCodeGenConfig codeGenConfig,
                                             CustomizationConfig customizationConfig) {
        final Metadata metadata = new Metadata();

        final ServiceMetadata serviceMetadata = serviceModel.getMetadata();
        final String interfaceName = codeGenConfig.getInterfaceName();
        final String packageName = codeGenConfig.getPackageName();
        final String asyncInterface = Utils
                .getAsyncInterfaceName(interfaceName);

        metadata.withApiVersion(serviceMetadata.getApiVersion())
                .withAsyncClient(Utils.getClientName(asyncInterface))
                .withAsyncInterface(asyncInterface)
                .withDefaultEndpoint(codeGenConfig.getEndpoint())
                .withDefaultEndpointWithoutHttpProtocol(
                        Utils.getDefaultEndpointWithoutHttpProtocol(codeGenConfig.getEndpoint()))
                .withDocumentation(serviceModel.getDocumentation())
                .withPackageName(packageName)
                .withPackagePath(packageName.replace(".", "/"))
                .withServiceAbbreviation(serviceMetadata.getServiceAbbreviation())
                .withServiceFullName(serviceMetadata.getServiceFullName())
                .withSyncClient(Utils.getClientName(interfaceName))
                .withSyncInterface(interfaceName)
                .withProtocol(Protocol.fromValue(serviceMetadata.getProtocol()))
                .withJsonVersion(serviceMetadata.getJsonVersion())
                .withEndpointPrefix(serviceMetadata.getEndpointPrefix())
                .withSigningName(serviceMetadata.getSigningName());

        final String jsonVersion = getJsonVersion(metadata, serviceMetadata);
        metadata.setJsonVersion(jsonVersion);

        // TODO: iterate through all the operations and check whether any of
        // them accept stream input
        metadata.setHasApiWithStreamInput(false);
        return metadata;
    }

    private static String getJsonVersion(Metadata metadata, ServiceMetadata serviceMetadata) {
        // TODO this should be defaulted in the C2J build tool
        if (serviceMetadata.getJsonVersion() == null && metadata.isJsonProtocol()) {
            return "1.1";
        } else {
            return serviceMetadata.getJsonVersion();
        }
    }
}
