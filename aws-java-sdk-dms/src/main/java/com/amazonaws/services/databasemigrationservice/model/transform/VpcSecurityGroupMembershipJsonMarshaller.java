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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.json.*;

/**
 * VpcSecurityGroupMembershipMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcSecurityGroupMembershipJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VpcSecurityGroupMembership vpcSecurityGroupMembership, StructuredJsonGenerator jsonGenerator) {

        if (vpcSecurityGroupMembership == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (vpcSecurityGroupMembership.getVpcSecurityGroupId() != null) {
                jsonGenerator.writeFieldName("VpcSecurityGroupId").writeValue(vpcSecurityGroupMembership.getVpcSecurityGroupId());
            }
            if (vpcSecurityGroupMembership.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(vpcSecurityGroupMembership.getStatus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VpcSecurityGroupMembershipJsonMarshaller instance;

    public static VpcSecurityGroupMembershipJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcSecurityGroupMembershipJsonMarshaller();
        return instance;
    }

}
