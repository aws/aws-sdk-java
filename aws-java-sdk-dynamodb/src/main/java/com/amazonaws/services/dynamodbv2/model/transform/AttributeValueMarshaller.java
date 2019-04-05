/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttributeValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeValueMarshaller {

    private static final MarshallingInfo<String> S_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S").build();
    private static final MarshallingInfo<String> N_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("N").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> B_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("B").build();
    private static final MarshallingInfo<List> SS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SS").build();
    private static final MarshallingInfo<List> NS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NS").build();
    private static final MarshallingInfo<List> BS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BS").build();
    private static final MarshallingInfo<Map> M_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("M").build();
    private static final MarshallingInfo<List> L_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("L").build();
    private static final MarshallingInfo<Boolean> NULL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NULL").build();
    private static final MarshallingInfo<Boolean> BOOL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BOOL").build();

    private static final AttributeValueMarshaller instance = new AttributeValueMarshaller();

    public static AttributeValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeValue attributeValue, ProtocolMarshaller protocolMarshaller) {

        if (attributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeValue.getS(), S_BINDING);
            protocolMarshaller.marshall(attributeValue.getN(), N_BINDING);
            protocolMarshaller.marshall(attributeValue.getB(), B_BINDING);
            protocolMarshaller.marshall(attributeValue.getSS(), SS_BINDING);
            protocolMarshaller.marshall(attributeValue.getNS(), NS_BINDING);
            protocolMarshaller.marshall(attributeValue.getBS(), BS_BINDING);
            protocolMarshaller.marshall(attributeValue.getM(), M_BINDING);
            protocolMarshaller.marshall(attributeValue.getL(), L_BINDING);
            protocolMarshaller.marshall(attributeValue.getNULL(), NULL_BINDING);
            protocolMarshaller.marshall(attributeValue.getBOOL(), BOOL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
