/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Ec2InstanceAttributesMarshaller
 */
public class Ec2InstanceAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Ec2InstanceAttributes ec2InstanceAttributes,
            JSONWriter jsonWriter) {
        if (ec2InstanceAttributes == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (ec2InstanceAttributes.getEc2KeyName() != null) {
                jsonWriter.key("Ec2KeyName").value(
                        ec2InstanceAttributes.getEc2KeyName());
            }

            if (ec2InstanceAttributes.getEc2SubnetId() != null) {
                jsonWriter.key("Ec2SubnetId").value(
                        ec2InstanceAttributes.getEc2SubnetId());
            }

            if (ec2InstanceAttributes.getEc2AvailabilityZone() != null) {
                jsonWriter.key("Ec2AvailabilityZone").value(
                        ec2InstanceAttributes.getEc2AvailabilityZone());
            }

            if (ec2InstanceAttributes.getIamInstanceProfile() != null) {
                jsonWriter.key("IamInstanceProfile").value(
                        ec2InstanceAttributes.getIamInstanceProfile());
            }

            if (ec2InstanceAttributes.getEmrManagedMasterSecurityGroup() != null) {
                jsonWriter.key("EmrManagedMasterSecurityGroup").value(
                        ec2InstanceAttributes
                                .getEmrManagedMasterSecurityGroup());
            }

            if (ec2InstanceAttributes.getEmrManagedSlaveSecurityGroup() != null) {
                jsonWriter.key("EmrManagedSlaveSecurityGroup")
                        .value(ec2InstanceAttributes
                                .getEmrManagedSlaveSecurityGroup());
            }

            if (ec2InstanceAttributes.getServiceAccessSecurityGroup() != null) {
                jsonWriter.key("ServiceAccessSecurityGroup").value(
                        ec2InstanceAttributes.getServiceAccessSecurityGroup());
            }

            com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) ec2InstanceAttributes
                    .getAdditionalMasterSecurityGroups();
            if (!additionalMasterSecurityGroupsList.isEmpty()
                    || !additionalMasterSecurityGroupsList.isAutoConstruct()) {
                jsonWriter.key("AdditionalMasterSecurityGroups");
                jsonWriter.array();
                for (String additionalMasterSecurityGroupsListValue : additionalMasterSecurityGroupsList) {
                    if (additionalMasterSecurityGroupsListValue != null) {
                        jsonWriter
                                .value(additionalMasterSecurityGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) ec2InstanceAttributes
                    .getAdditionalSlaveSecurityGroups();
            if (!additionalSlaveSecurityGroupsList.isEmpty()
                    || !additionalSlaveSecurityGroupsList.isAutoConstruct()) {
                jsonWriter.key("AdditionalSlaveSecurityGroups");
                jsonWriter.array();
                for (String additionalSlaveSecurityGroupsListValue : additionalSlaveSecurityGroupsList) {
                    if (additionalSlaveSecurityGroupsListValue != null) {
                        jsonWriter
                                .value(additionalSlaveSecurityGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static Ec2InstanceAttributesJsonMarshaller instance;

    public static Ec2InstanceAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAttributesJsonMarshaller();
        return instance;
    }

}
