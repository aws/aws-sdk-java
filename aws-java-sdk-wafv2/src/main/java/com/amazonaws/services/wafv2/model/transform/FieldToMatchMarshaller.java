/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * FieldToMatchMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldToMatchMarshaller {

    private static final MarshallingInfo<StructuredPojo> SINGLEHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SingleHeader").build();
    private static final MarshallingInfo<StructuredPojo> SINGLEQUERYARGUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SingleQueryArgument").build();
    private static final MarshallingInfo<StructuredPojo> ALLQUERYARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllQueryArguments").build();
    private static final MarshallingInfo<StructuredPojo> URIPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UriPath").build();
    private static final MarshallingInfo<StructuredPojo> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<StructuredPojo> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Body").build();
    private static final MarshallingInfo<StructuredPojo> METHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Method").build();

    private static final FieldToMatchMarshaller instance = new FieldToMatchMarshaller();

    public static FieldToMatchMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldToMatch fieldToMatch, ProtocolMarshaller protocolMarshaller) {

        if (fieldToMatch == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldToMatch.getSingleHeader(), SINGLEHEADER_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getSingleQueryArgument(), SINGLEQUERYARGUMENT_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getAllQueryArguments(), ALLQUERYARGUMENTS_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getUriPath(), URIPATH_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(fieldToMatch.getMethod(), METHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
