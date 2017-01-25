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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DifferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferenceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Difference difference, StructuredJsonGenerator jsonGenerator) {

        if (difference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (difference.getBeforeBlob() != null) {
                jsonGenerator.writeFieldName("beforeBlob");
                BlobMetadataJsonMarshaller.getInstance().marshall(difference.getBeforeBlob(), jsonGenerator);
            }
            if (difference.getAfterBlob() != null) {
                jsonGenerator.writeFieldName("afterBlob");
                BlobMetadataJsonMarshaller.getInstance().marshall(difference.getAfterBlob(), jsonGenerator);
            }
            if (difference.getChangeType() != null) {
                jsonGenerator.writeFieldName("changeType").writeValue(difference.getChangeType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DifferenceJsonMarshaller instance;

    public static DifferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DifferenceJsonMarshaller();
        return instance;
    }

}
