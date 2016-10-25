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
 * MFAOptionTypeMarshaller
 */
public class MFAOptionTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MFAOptionType mFAOptionType, StructuredJsonGenerator jsonGenerator) {

        if (mFAOptionType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (mFAOptionType.getDeliveryMedium() != null) {
                jsonGenerator.writeFieldName("DeliveryMedium").writeValue(mFAOptionType.getDeliveryMedium());
            }
            if (mFAOptionType.getAttributeName() != null) {
                jsonGenerator.writeFieldName("AttributeName").writeValue(mFAOptionType.getAttributeName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MFAOptionTypeJsonMarshaller instance;

    public static MFAOptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MFAOptionTypeJsonMarshaller();
        return instance;
    }

}
