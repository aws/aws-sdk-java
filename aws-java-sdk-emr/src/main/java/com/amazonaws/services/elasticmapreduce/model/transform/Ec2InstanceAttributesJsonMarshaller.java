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
 * Ec2InstanceAttributesMarshaller
 */
public class Ec2InstanceAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Ec2InstanceAttributes ec2InstanceAttributes, StructuredJsonGenerator jsonGenerator) {

        if (ec2InstanceAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (ec2InstanceAttributes.getEc2KeyName() != null) {
                jsonGenerator.writeFieldName("Ec2KeyName").writeValue(ec2InstanceAttributes.getEc2KeyName());
            }
            if (ec2InstanceAttributes.getEc2SubnetId() != null) {
                jsonGenerator.writeFieldName("Ec2SubnetId").writeValue(ec2InstanceAttributes.getEc2SubnetId());
            }
            if (ec2InstanceAttributes.getEc2AvailabilityZone() != null) {
                jsonGenerator.writeFieldName("Ec2AvailabilityZone").writeValue(ec2InstanceAttributes.getEc2AvailabilityZone());
            }
            if (ec2InstanceAttributes.getIamInstanceProfile() != null) {
                jsonGenerator.writeFieldName("IamInstanceProfile").writeValue(ec2InstanceAttributes.getIamInstanceProfile());
            }
            if (ec2InstanceAttributes.getEmrManagedMasterSecurityGroup() != null) {
                jsonGenerator.writeFieldName("EmrManagedMasterSecurityGroup").writeValue(ec2InstanceAttributes.getEmrManagedMasterSecurityGroup());
            }
            if (ec2InstanceAttributes.getEmrManagedSlaveSecurityGroup() != null) {
                jsonGenerator.writeFieldName("EmrManagedSlaveSecurityGroup").writeValue(ec2InstanceAttributes.getEmrManagedSlaveSecurityGroup());
            }
            if (ec2InstanceAttributes.getServiceAccessSecurityGroup() != null) {
                jsonGenerator.writeFieldName("ServiceAccessSecurityGroup").writeValue(ec2InstanceAttributes.getServiceAccessSecurityGroup());
            }

            com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) ec2InstanceAttributes
                    .getAdditionalMasterSecurityGroups();
            if (!additionalMasterSecurityGroupsList.isEmpty() || !additionalMasterSecurityGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AdditionalMasterSecurityGroups");
                jsonGenerator.writeStartArray();
                for (String additionalMasterSecurityGroupsListValue : additionalMasterSecurityGroupsList) {
                    if (additionalMasterSecurityGroupsListValue != null) {
                        jsonGenerator.writeValue(additionalMasterSecurityGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) ec2InstanceAttributes
                    .getAdditionalSlaveSecurityGroups();
            if (!additionalSlaveSecurityGroupsList.isEmpty() || !additionalSlaveSecurityGroupsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AdditionalSlaveSecurityGroups");
                jsonGenerator.writeStartArray();
                for (String additionalSlaveSecurityGroupsListValue : additionalSlaveSecurityGroupsList) {
                    if (additionalSlaveSecurityGroupsListValue != null) {
                        jsonGenerator.writeValue(additionalSlaveSecurityGroupsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static Ec2InstanceAttributesJsonMarshaller instance;

    public static Ec2InstanceAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAttributesJsonMarshaller();
        return instance;
    }

}
