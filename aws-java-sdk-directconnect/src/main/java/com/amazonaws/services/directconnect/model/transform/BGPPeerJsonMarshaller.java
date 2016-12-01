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
 * BGPPeerMarshaller
 */
public class BGPPeerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BGPPeer bGPPeer, StructuredJsonGenerator jsonGenerator) {

        if (bGPPeer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (bGPPeer.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(bGPPeer.getAsn());
            }
            if (bGPPeer.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(bGPPeer.getAuthKey());
            }
            if (bGPPeer.getAddressFamily() != null) {
                jsonGenerator.writeFieldName("addressFamily").writeValue(bGPPeer.getAddressFamily());
            }
            if (bGPPeer.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(bGPPeer.getAmazonAddress());
            }
            if (bGPPeer.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(bGPPeer.getCustomerAddress());
            }
            if (bGPPeer.getBgpPeerState() != null) {
                jsonGenerator.writeFieldName("bgpPeerState").writeValue(bGPPeer.getBgpPeerState());
            }
            if (bGPPeer.getBgpStatus() != null) {
                jsonGenerator.writeFieldName("bgpStatus").writeValue(bGPPeer.getBgpStatus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BGPPeerJsonMarshaller instance;

    public static BGPPeerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BGPPeerJsonMarshaller();
        return instance;
    }

}
