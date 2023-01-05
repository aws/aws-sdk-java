/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReferenceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReferenceSummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Url").build();
    private static final MarshallingInfo<StructuredPojo> ATTACHMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Attachment").build();
    private static final MarshallingInfo<StructuredPojo> STRING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("String").build();
    private static final MarshallingInfo<StructuredPojo> NUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Number").build();
    private static final MarshallingInfo<StructuredPojo> DATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Date").build();
    private static final MarshallingInfo<StructuredPojo> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Email").build();

    private static final ReferenceSummaryMarshaller instance = new ReferenceSummaryMarshaller();

    public static ReferenceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReferenceSummary referenceSummary, ProtocolMarshaller protocolMarshaller) {

        if (referenceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(referenceSummary.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(referenceSummary.getAttachment(), ATTACHMENT_BINDING);
            protocolMarshaller.marshall(referenceSummary.getString(), STRING_BINDING);
            protocolMarshaller.marshall(referenceSummary.getNumber(), NUMBER_BINDING);
            protocolMarshaller.marshall(referenceSummary.getDate(), DATE_BINDING);
            protocolMarshaller.marshall(referenceSummary.getEmail(), EMAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
