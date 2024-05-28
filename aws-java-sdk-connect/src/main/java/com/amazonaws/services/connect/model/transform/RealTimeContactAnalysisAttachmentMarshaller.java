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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeContactAnalysisAttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeContactAnalysisAttachmentMarshaller {

    private static final MarshallingInfo<String> ATTACHMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentName").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentType").build();
    private static final MarshallingInfo<String> ATTACHMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final RealTimeContactAnalysisAttachmentMarshaller instance = new RealTimeContactAnalysisAttachmentMarshaller();

    public static RealTimeContactAnalysisAttachmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeContactAnalysisAttachment realTimeContactAnalysisAttachment, ProtocolMarshaller protocolMarshaller) {

        if (realTimeContactAnalysisAttachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeContactAnalysisAttachment.getAttachmentName(), ATTACHMENTNAME_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisAttachment.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisAttachment.getAttachmentId(), ATTACHMENTID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisAttachment.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
