/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RateBasedStatementCustomKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RateBasedStatementCustomKeyMarshaller {

    private static final MarshallingInfo<StructuredPojo> HEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Header").build();
    private static final MarshallingInfo<StructuredPojo> COOKIE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Cookie").build();
    private static final MarshallingInfo<StructuredPojo> QUERYARGUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryArgument").build();
    private static final MarshallingInfo<StructuredPojo> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<StructuredPojo> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HTTPMethod").build();
    private static final MarshallingInfo<StructuredPojo> FORWARDEDIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForwardedIP").build();
    private static final MarshallingInfo<StructuredPojo> IP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IP").build();
    private static final MarshallingInfo<StructuredPojo> LABELNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelNamespace").build();
    private static final MarshallingInfo<StructuredPojo> URIPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UriPath").build();

    private static final RateBasedStatementCustomKeyMarshaller instance = new RateBasedStatementCustomKeyMarshaller();

    public static RateBasedStatementCustomKeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RateBasedStatementCustomKey rateBasedStatementCustomKey, ProtocolMarshaller protocolMarshaller) {

        if (rateBasedStatementCustomKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getHeader(), HEADER_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getCookie(), COOKIE_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getQueryArgument(), QUERYARGUMENT_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getHTTPMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getForwardedIP(), FORWARDEDIP_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getIP(), IP_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getLabelNamespace(), LABELNAMESPACE_BINDING);
            protocolMarshaller.marshall(rateBasedStatementCustomKey.getUriPath(), URIPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
