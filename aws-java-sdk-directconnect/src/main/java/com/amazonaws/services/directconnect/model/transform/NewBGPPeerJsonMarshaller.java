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
package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * NewBGPPeerMarshaller
 */
public class NewBGPPeerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NewBGPPeer newBGPPeer, StructuredJsonGenerator jsonGenerator) {

        if (newBGPPeer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (newBGPPeer.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(newBGPPeer.getAsn());
            }
            if (newBGPPeer.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(newBGPPeer.getAuthKey());
            }
            if (newBGPPeer.getAddressFamily() != null) {
                jsonGenerator.writeFieldName("addressFamily").writeValue(newBGPPeer.getAddressFamily());
            }
            if (newBGPPeer.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(newBGPPeer.getAmazonAddress());
            }
            if (newBGPPeer.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(newBGPPeer.getCustomerAddress());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NewBGPPeerJsonMarshaller instance;

    public static NewBGPPeerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewBGPPeerJsonMarshaller();
        return instance;
    }

}
