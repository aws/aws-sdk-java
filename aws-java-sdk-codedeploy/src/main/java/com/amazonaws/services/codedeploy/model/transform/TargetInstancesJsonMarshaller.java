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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.json.*;

/**
 * TargetInstancesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetInstancesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TargetInstances targetInstances, StructuredJsonGenerator jsonGenerator) {

        if (targetInstances == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<EC2TagFilter> tagFiltersList = (com.amazonaws.internal.SdkInternalList<EC2TagFilter>) targetInstances
                    .getTagFilters();
            if (!tagFiltersList.isEmpty() || !tagFiltersList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tagFilters");
                jsonGenerator.writeStartArray();
                for (EC2TagFilter tagFiltersListValue : tagFiltersList) {
                    if (tagFiltersListValue != null) {

                        EC2TagFilterJsonMarshaller.getInstance().marshall(tagFiltersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> autoScalingGroupsList = (com.amazonaws.internal.SdkInternalList<String>) targetInstances
                    .getAutoScalingGroups();
            if (!autoScalingGroupsList.isEmpty() || !autoScalingGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("autoScalingGroups");
                jsonGenerator.writeStartArray();
                for (String autoScalingGroupsListValue : autoScalingGroupsList) {
                    if (autoScalingGroupsListValue != null) {
                        jsonGenerator.writeValue(autoScalingGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TargetInstancesJsonMarshaller instance;

    public static TargetInstancesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetInstancesJsonMarshaller();
        return instance;
    }

}
