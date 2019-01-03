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
package com.amazonaws.services.workdocs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workdocs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivityMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeStamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ISINDIRECTACTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsIndirectActivity").build();
    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();
    private static final MarshallingInfo<StructuredPojo> INITIATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Initiator").build();
    private static final MarshallingInfo<StructuredPojo> PARTICIPANTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Participants").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceMetadata").build();
    private static final MarshallingInfo<StructuredPojo> ORIGINALPARENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginalParent").build();
    private static final MarshallingInfo<StructuredPojo> COMMENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CommentMetadata").build();

    private static final ActivityMarshaller instance = new ActivityMarshaller();

    public static ActivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Activity activity, ProtocolMarshaller protocolMarshaller) {

        if (activity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activity.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(activity.getTimeStamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(activity.getIsIndirectActivity(), ISINDIRECTACTIVITY_BINDING);
            protocolMarshaller.marshall(activity.getOrganizationId(), ORGANIZATIONID_BINDING);
            protocolMarshaller.marshall(activity.getInitiator(), INITIATOR_BINDING);
            protocolMarshaller.marshall(activity.getParticipants(), PARTICIPANTS_BINDING);
            protocolMarshaller.marshall(activity.getResourceMetadata(), RESOURCEMETADATA_BINDING);
            protocolMarshaller.marshall(activity.getOriginalParent(), ORIGINALPARENT_BINDING);
            protocolMarshaller.marshall(activity.getCommentMetadata(), COMMENTMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
