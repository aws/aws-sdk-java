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
package com.amazonaws.services.networkmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttachmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttachmentMarshaller {

    private static final MarshallingInfo<String> CORENETWORKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkId").build();
    private static final MarshallingInfo<String> CORENETWORKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreNetworkArn").build();
    private static final MarshallingInfo<String> ATTACHMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentId").build();
    private static final MarshallingInfo<String> OWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccountId").build();
    private static final MarshallingInfo<String> ATTACHMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentType").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> EDGELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeLocation").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<Integer> ATTACHMENTPOLICYRULENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttachmentPolicyRuleNumber").build();
    private static final MarshallingInfo<String> SEGMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentName").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> PROPOSEDSEGMENTCHANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProposedSegmentChange").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("unixTimestamp").build();

    private static final AttachmentMarshaller instance = new AttachmentMarshaller();

    public static AttachmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Attachment attachment, ProtocolMarshaller protocolMarshaller) {

        if (attachment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attachment.getCoreNetworkId(), CORENETWORKID_BINDING);
            protocolMarshaller.marshall(attachment.getCoreNetworkArn(), CORENETWORKARN_BINDING);
            protocolMarshaller.marshall(attachment.getAttachmentId(), ATTACHMENTID_BINDING);
            protocolMarshaller.marshall(attachment.getOwnerAccountId(), OWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(attachment.getAttachmentType(), ATTACHMENTTYPE_BINDING);
            protocolMarshaller.marshall(attachment.getState(), STATE_BINDING);
            protocolMarshaller.marshall(attachment.getEdgeLocation(), EDGELOCATION_BINDING);
            protocolMarshaller.marshall(attachment.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(attachment.getAttachmentPolicyRuleNumber(), ATTACHMENTPOLICYRULENUMBER_BINDING);
            protocolMarshaller.marshall(attachment.getSegmentName(), SEGMENTNAME_BINDING);
            protocolMarshaller.marshall(attachment.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(attachment.getProposedSegmentChange(), PROPOSEDSEGMENTCHANGE_BINDING);
            protocolMarshaller.marshall(attachment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(attachment.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
