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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GroupTypeMarshaller
 */
public class GroupTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GroupType groupType, StructuredJsonGenerator jsonGenerator) {

        if (groupType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (groupType.getGroupName() != null) {
                jsonGenerator.writeFieldName("GroupName").writeValue(groupType.getGroupName());
            }
            if (groupType.getUserPoolId() != null) {
                jsonGenerator.writeFieldName("UserPoolId").writeValue(groupType.getUserPoolId());
            }
            if (groupType.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(groupType.getDescription());
            }
            if (groupType.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(groupType.getRoleArn());
            }
            if (groupType.getPrecedence() != null) {
                jsonGenerator.writeFieldName("Precedence").writeValue(groupType.getPrecedence());
            }
            if (groupType.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(groupType.getLastModifiedDate());
            }
            if (groupType.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(groupType.getCreationDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GroupTypeJsonMarshaller instance;

    public static GroupTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GroupTypeJsonMarshaller();
        return instance;
    }

}
