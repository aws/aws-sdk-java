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
package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RedshiftDatabaseCredentialsMarshaller
 */
public class RedshiftDatabaseCredentialsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RedshiftDatabaseCredentials redshiftDatabaseCredentials, StructuredJsonGenerator jsonGenerator) {

        if (redshiftDatabaseCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (redshiftDatabaseCredentials.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(redshiftDatabaseCredentials.getUsername());
            }
            if (redshiftDatabaseCredentials.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(redshiftDatabaseCredentials.getPassword());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDatabaseCredentialsJsonMarshaller instance;

    public static RedshiftDatabaseCredentialsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDatabaseCredentialsJsonMarshaller();
        return instance;
    }

}
