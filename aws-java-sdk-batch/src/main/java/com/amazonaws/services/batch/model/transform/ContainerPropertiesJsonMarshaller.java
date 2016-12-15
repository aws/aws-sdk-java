/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.batch.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ContainerPropertiesMarshaller
 */
public class ContainerPropertiesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerProperties containerProperties, StructuredJsonGenerator jsonGenerator) {

        if (containerProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerProperties.getImage() != null) {
                jsonGenerator.writeFieldName("image").writeValue(containerProperties.getImage());
            }
            if (containerProperties.getVcpus() != null) {
                jsonGenerator.writeFieldName("vcpus").writeValue(containerProperties.getVcpus());
            }
            if (containerProperties.getMemory() != null) {
                jsonGenerator.writeFieldName("memory").writeValue(containerProperties.getMemory());
            }

            java.util.List<String> commandList = containerProperties.getCommand();
            if (commandList != null) {
                jsonGenerator.writeFieldName("command");
                jsonGenerator.writeStartArray();
                for (String commandListValue : commandList) {
                    if (commandListValue != null) {
                        jsonGenerator.writeValue(commandListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerProperties.getJobRoleArn() != null) {
                jsonGenerator.writeFieldName("jobRoleArn").writeValue(containerProperties.getJobRoleArn());
            }

            java.util.List<Volume> volumesList = containerProperties.getVolumes();
            if (volumesList != null) {
                jsonGenerator.writeFieldName("volumes");
                jsonGenerator.writeStartArray();
                for (Volume volumesListValue : volumesList) {
                    if (volumesListValue != null) {

                        VolumeJsonMarshaller.getInstance().marshall(volumesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<KeyValuePair> environmentList = containerProperties.getEnvironment();
            if (environmentList != null) {
                jsonGenerator.writeFieldName("environment");
                jsonGenerator.writeStartArray();
                for (KeyValuePair environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        KeyValuePairJsonMarshaller.getInstance().marshall(environmentListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<MountPoint> mountPointsList = containerProperties.getMountPoints();
            if (mountPointsList != null) {
                jsonGenerator.writeFieldName("mountPoints");
                jsonGenerator.writeStartArray();
                for (MountPoint mountPointsListValue : mountPointsList) {
                    if (mountPointsListValue != null) {

                        MountPointJsonMarshaller.getInstance().marshall(mountPointsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerProperties.getReadonlyRootFilesystem() != null) {
                jsonGenerator.writeFieldName("readonlyRootFilesystem").writeValue(containerProperties.getReadonlyRootFilesystem());
            }
            if (containerProperties.getPrivileged() != null) {
                jsonGenerator.writeFieldName("privileged").writeValue(containerProperties.getPrivileged());
            }

            java.util.List<Ulimit> ulimitsList = containerProperties.getUlimits();
            if (ulimitsList != null) {
                jsonGenerator.writeFieldName("ulimits");
                jsonGenerator.writeStartArray();
                for (Ulimit ulimitsListValue : ulimitsList) {
                    if (ulimitsListValue != null) {

                        UlimitJsonMarshaller.getInstance().marshall(ulimitsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (containerProperties.getUser() != null) {
                jsonGenerator.writeFieldName("user").writeValue(containerProperties.getUser());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerPropertiesJsonMarshaller instance;

    public static ContainerPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerPropertiesJsonMarshaller();
        return instance;
    }

}
