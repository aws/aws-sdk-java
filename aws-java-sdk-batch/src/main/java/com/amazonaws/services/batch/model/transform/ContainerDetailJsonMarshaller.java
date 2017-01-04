/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ContainerDetailMarshaller
 */
public class ContainerDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContainerDetail containerDetail, StructuredJsonGenerator jsonGenerator) {

        if (containerDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (containerDetail.getImage() != null) {
                jsonGenerator.writeFieldName("image").writeValue(containerDetail.getImage());
            }
            if (containerDetail.getVcpus() != null) {
                jsonGenerator.writeFieldName("vcpus").writeValue(containerDetail.getVcpus());
            }
            if (containerDetail.getMemory() != null) {
                jsonGenerator.writeFieldName("memory").writeValue(containerDetail.getMemory());
            }

            java.util.List<String> commandList = containerDetail.getCommand();
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
            if (containerDetail.getJobRoleArn() != null) {
                jsonGenerator.writeFieldName("jobRoleArn").writeValue(containerDetail.getJobRoleArn());
            }

            java.util.List<Volume> volumesList = containerDetail.getVolumes();
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

            java.util.List<KeyValuePair> environmentList = containerDetail.getEnvironment();
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

            java.util.List<MountPoint> mountPointsList = containerDetail.getMountPoints();
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
            if (containerDetail.getReadonlyRootFilesystem() != null) {
                jsonGenerator.writeFieldName("readonlyRootFilesystem").writeValue(containerDetail.getReadonlyRootFilesystem());
            }

            java.util.List<Ulimit> ulimitsList = containerDetail.getUlimits();
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
            if (containerDetail.getPrivileged() != null) {
                jsonGenerator.writeFieldName("privileged").writeValue(containerDetail.getPrivileged());
            }
            if (containerDetail.getUser() != null) {
                jsonGenerator.writeFieldName("user").writeValue(containerDetail.getUser());
            }
            if (containerDetail.getExitCode() != null) {
                jsonGenerator.writeFieldName("exitCode").writeValue(containerDetail.getExitCode());
            }
            if (containerDetail.getReason() != null) {
                jsonGenerator.writeFieldName("reason").writeValue(containerDetail.getReason());
            }
            if (containerDetail.getContainerInstanceArn() != null) {
                jsonGenerator.writeFieldName("containerInstanceArn").writeValue(containerDetail.getContainerInstanceArn());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContainerDetailJsonMarshaller instance;

    public static ContainerDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDetailJsonMarshaller();
        return instance;
    }

}
