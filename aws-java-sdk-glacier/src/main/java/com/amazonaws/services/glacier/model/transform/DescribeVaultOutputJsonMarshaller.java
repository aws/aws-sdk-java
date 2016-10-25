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
package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeVaultOutputMarshaller
 */
public class DescribeVaultOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DescribeVaultOutput describeVaultOutput, StructuredJsonGenerator jsonGenerator) {

        if (describeVaultOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (describeVaultOutput.getVaultARN() != null) {
                jsonGenerator.writeFieldName("VaultARN").writeValue(describeVaultOutput.getVaultARN());
            }
            if (describeVaultOutput.getVaultName() != null) {
                jsonGenerator.writeFieldName("VaultName").writeValue(describeVaultOutput.getVaultName());
            }
            if (describeVaultOutput.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(describeVaultOutput.getCreationDate());
            }
            if (describeVaultOutput.getLastInventoryDate() != null) {
                jsonGenerator.writeFieldName("LastInventoryDate").writeValue(describeVaultOutput.getLastInventoryDate());
            }
            if (describeVaultOutput.getNumberOfArchives() != null) {
                jsonGenerator.writeFieldName("NumberOfArchives").writeValue(describeVaultOutput.getNumberOfArchives());
            }
            if (describeVaultOutput.getSizeInBytes() != null) {
                jsonGenerator.writeFieldName("SizeInBytes").writeValue(describeVaultOutput.getSizeInBytes());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DescribeVaultOutputJsonMarshaller instance;

    public static DescribeVaultOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribeVaultOutputJsonMarshaller();
        return instance;
    }

}
