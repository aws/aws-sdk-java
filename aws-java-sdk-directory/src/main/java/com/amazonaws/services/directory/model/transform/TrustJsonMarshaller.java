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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TrustMarshaller
 */
public class TrustJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Trust trust, StructuredJsonGenerator jsonGenerator) {

        if (trust == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (trust.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(trust.getDirectoryId());
            }
            if (trust.getTrustId() != null) {
                jsonGenerator.writeFieldName("TrustId").writeValue(trust.getTrustId());
            }
            if (trust.getRemoteDomainName() != null) {
                jsonGenerator.writeFieldName("RemoteDomainName").writeValue(trust.getRemoteDomainName());
            }
            if (trust.getTrustType() != null) {
                jsonGenerator.writeFieldName("TrustType").writeValue(trust.getTrustType());
            }
            if (trust.getTrustDirection() != null) {
                jsonGenerator.writeFieldName("TrustDirection").writeValue(trust.getTrustDirection());
            }
            if (trust.getTrustState() != null) {
                jsonGenerator.writeFieldName("TrustState").writeValue(trust.getTrustState());
            }
            if (trust.getCreatedDateTime() != null) {
                jsonGenerator.writeFieldName("CreatedDateTime").writeValue(trust.getCreatedDateTime());
            }
            if (trust.getLastUpdatedDateTime() != null) {
                jsonGenerator.writeFieldName("LastUpdatedDateTime").writeValue(trust.getLastUpdatedDateTime());
            }
            if (trust.getStateLastUpdatedDateTime() != null) {
                jsonGenerator.writeFieldName("StateLastUpdatedDateTime").writeValue(trust.getStateLastUpdatedDateTime());
            }
            if (trust.getTrustStateReason() != null) {
                jsonGenerator.writeFieldName("TrustStateReason").writeValue(trust.getTrustStateReason());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TrustJsonMarshaller instance;

    public static TrustJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustJsonMarshaller();
        return instance;
    }

}
