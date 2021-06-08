/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentReviewerResponseSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentReviewerResponseSourceMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REVIEWSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReviewStatus").build();
    private static final MarshallingInfo<List> COMMENT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Comment").build();
    private static final MarshallingInfo<String> REVIEWER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reviewer").build();

    private static final DocumentReviewerResponseSourceMarshaller instance = new DocumentReviewerResponseSourceMarshaller();

    public static DocumentReviewerResponseSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentReviewerResponseSource documentReviewerResponseSource, ProtocolMarshaller protocolMarshaller) {

        if (documentReviewerResponseSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentReviewerResponseSource.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(documentReviewerResponseSource.getUpdatedTime(), UPDATEDTIME_BINDING);
            protocolMarshaller.marshall(documentReviewerResponseSource.getReviewStatus(), REVIEWSTATUS_BINDING);
            protocolMarshaller.marshall(documentReviewerResponseSource.getComment(), COMMENT_BINDING);
            protocolMarshaller.marshall(documentReviewerResponseSource.getReviewer(), REVIEWER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
