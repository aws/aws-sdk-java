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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceMarshaller
 */
public class InstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Instance instance, StructuredJsonGenerator jsonGenerator) {

        if (instance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instance.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(instance.getId());
            }
            if (instance.getEc2InstanceId() != null) {
                jsonGenerator.writeFieldName("Ec2InstanceId").writeValue(instance.getEc2InstanceId());
            }
            if (instance.getPublicDnsName() != null) {
                jsonGenerator.writeFieldName("PublicDnsName").writeValue(instance.getPublicDnsName());
            }
            if (instance.getPublicIpAddress() != null) {
                jsonGenerator.writeFieldName("PublicIpAddress").writeValue(instance.getPublicIpAddress());
            }
            if (instance.getPrivateDnsName() != null) {
                jsonGenerator.writeFieldName("PrivateDnsName").writeValue(instance.getPrivateDnsName());
            }
            if (instance.getPrivateIpAddress() != null) {
                jsonGenerator.writeFieldName("PrivateIpAddress").writeValue(instance.getPrivateIpAddress());
            }
            if (instance.getStatus() != null) {
                jsonGenerator.writeFieldName("Status");
                InstanceStatusJsonMarshaller.getInstance().marshall(instance.getStatus(), jsonGenerator);
            }
            if (instance.getInstanceGroupId() != null) {
                jsonGenerator.writeFieldName("InstanceGroupId").writeValue(instance.getInstanceGroupId());
            }

            com.amazonaws.internal.SdkInternalList<EbsVolume> ebsVolumesList = (com.amazonaws.internal.SdkInternalList<EbsVolume>) instance.getEbsVolumes();
            if (!ebsVolumesList.isEmpty() || !ebsVolumesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EbsVolumes");
                jsonGenerator.writeStartArray();
                for (EbsVolume ebsVolumesListValue : ebsVolumesList) {
                    if (ebsVolumesListValue != null) {

                        EbsVolumeJsonMarshaller.getInstance().marshall(ebsVolumesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }

}
