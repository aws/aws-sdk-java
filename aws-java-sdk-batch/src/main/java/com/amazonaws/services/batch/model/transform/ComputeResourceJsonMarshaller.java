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
 * ComputeResourceMarshaller
 */
public class ComputeResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ComputeResource computeResource, StructuredJsonGenerator jsonGenerator) {

        if (computeResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (computeResource.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(computeResource.getType());
            }
            if (computeResource.getMinvCpus() != null) {
                jsonGenerator.writeFieldName("minvCpus").writeValue(computeResource.getMinvCpus());
            }
            if (computeResource.getMaxvCpus() != null) {
                jsonGenerator.writeFieldName("maxvCpus").writeValue(computeResource.getMaxvCpus());
            }
            if (computeResource.getDesiredvCpus() != null) {
                jsonGenerator.writeFieldName("desiredvCpus").writeValue(computeResource.getDesiredvCpus());
            }

            java.util.List<String> instanceTypesList = computeResource.getInstanceTypes();
            if (instanceTypesList != null) {
                jsonGenerator.writeFieldName("instanceTypes");
                jsonGenerator.writeStartArray();
                for (String instanceTypesListValue : instanceTypesList) {
                    if (instanceTypesListValue != null) {
                        jsonGenerator.writeValue(instanceTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> subnetsList = computeResource.getSubnets();
            if (subnetsList != null) {
                jsonGenerator.writeFieldName("subnets");
                jsonGenerator.writeStartArray();
                for (String subnetsListValue : subnetsList) {
                    if (subnetsListValue != null) {
                        jsonGenerator.writeValue(subnetsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> securityGroupIdsList = computeResource.getSecurityGroupIds();
            if (securityGroupIdsList != null) {
                jsonGenerator.writeFieldName("securityGroupIds");
                jsonGenerator.writeStartArray();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(securityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (computeResource.getEc2KeyPair() != null) {
                jsonGenerator.writeFieldName("ec2KeyPair").writeValue(computeResource.getEc2KeyPair());
            }
            if (computeResource.getInstanceRole() != null) {
                jsonGenerator.writeFieldName("instanceRole").writeValue(computeResource.getInstanceRole());
            }

            java.util.Map<String, String> tagsMap = computeResource.getTags();
            if (tagsMap != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap.entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (computeResource.getBidPercentage() != null) {
                jsonGenerator.writeFieldName("bidPercentage").writeValue(computeResource.getBidPercentage());
            }
            if (computeResource.getSpotIamFleetRole() != null) {
                jsonGenerator.writeFieldName("spotIamFleetRole").writeValue(computeResource.getSpotIamFleetRole());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ComputeResourceJsonMarshaller instance;

    public static ComputeResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComputeResourceJsonMarshaller();
        return instance;
    }

}
