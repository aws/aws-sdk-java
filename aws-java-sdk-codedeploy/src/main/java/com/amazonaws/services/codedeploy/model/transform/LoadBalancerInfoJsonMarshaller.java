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
 * LoadBalancerInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(LoadBalancerInfo loadBalancerInfo, StructuredJsonGenerator jsonGenerator) {

        if (loadBalancerInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<ELBInfo> elbInfoListList = (com.amazonaws.internal.SdkInternalList<ELBInfo>) loadBalancerInfo
                    .getElbInfoList();
            if (!elbInfoListList.isEmpty() || !elbInfoListList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("elbInfoList");
                jsonGenerator.writeStartArray();
                for (ELBInfo elbInfoListListValue : elbInfoListList) {
                    if (elbInfoListListValue != null) {

                        ELBInfoJsonMarshaller.getInstance().marshall(elbInfoListListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LoadBalancerInfoJsonMarshaller instance;

    public static LoadBalancerInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerInfoJsonMarshaller();
        return instance;
    }

}
