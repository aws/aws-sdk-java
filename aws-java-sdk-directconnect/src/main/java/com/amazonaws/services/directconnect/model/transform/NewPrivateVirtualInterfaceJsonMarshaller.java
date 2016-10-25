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
 * NewPrivateVirtualInterfaceMarshaller
 */
public class NewPrivateVirtualInterfaceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NewPrivateVirtualInterface newPrivateVirtualInterface, StructuredJsonGenerator jsonGenerator) {

        if (newPrivateVirtualInterface == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (newPrivateVirtualInterface.getVirtualInterfaceName() != null) {
                jsonGenerator.writeFieldName("virtualInterfaceName").writeValue(newPrivateVirtualInterface.getVirtualInterfaceName());
            }
            if (newPrivateVirtualInterface.getVlan() != null) {
                jsonGenerator.writeFieldName("vlan").writeValue(newPrivateVirtualInterface.getVlan());
            }
            if (newPrivateVirtualInterface.getAsn() != null) {
                jsonGenerator.writeFieldName("asn").writeValue(newPrivateVirtualInterface.getAsn());
            }
            if (newPrivateVirtualInterface.getAuthKey() != null) {
                jsonGenerator.writeFieldName("authKey").writeValue(newPrivateVirtualInterface.getAuthKey());
            }
            if (newPrivateVirtualInterface.getAmazonAddress() != null) {
                jsonGenerator.writeFieldName("amazonAddress").writeValue(newPrivateVirtualInterface.getAmazonAddress());
            }
            if (newPrivateVirtualInterface.getCustomerAddress() != null) {
                jsonGenerator.writeFieldName("customerAddress").writeValue(newPrivateVirtualInterface.getCustomerAddress());
            }
            if (newPrivateVirtualInterface.getVirtualGatewayId() != null) {
                jsonGenerator.writeFieldName("virtualGatewayId").writeValue(newPrivateVirtualInterface.getVirtualGatewayId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NewPrivateVirtualInterfaceJsonMarshaller instance;

    public static NewPrivateVirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewPrivateVirtualInterfaceJsonMarshaller();
        return instance;
    }

}
