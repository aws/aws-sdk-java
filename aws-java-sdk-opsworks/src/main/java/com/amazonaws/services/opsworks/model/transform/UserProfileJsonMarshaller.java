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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UserProfileMarshaller
 */
public class UserProfileJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UserProfile userProfile, StructuredJsonGenerator jsonGenerator) {

        if (userProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (userProfile.getIamUserArn() != null) {
                jsonGenerator.writeFieldName("IamUserArn").writeValue(userProfile.getIamUserArn());
            }
            if (userProfile.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(userProfile.getName());
            }
            if (userProfile.getSshUsername() != null) {
                jsonGenerator.writeFieldName("SshUsername").writeValue(userProfile.getSshUsername());
            }
            if (userProfile.getSshPublicKey() != null) {
                jsonGenerator.writeFieldName("SshPublicKey").writeValue(userProfile.getSshPublicKey());
            }
            if (userProfile.getAllowSelfManagement() != null) {
                jsonGenerator.writeFieldName("AllowSelfManagement").writeValue(userProfile.getAllowSelfManagement());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UserProfileJsonMarshaller instance;

    public static UserProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserProfileJsonMarshaller();
        return instance;
    }

}
