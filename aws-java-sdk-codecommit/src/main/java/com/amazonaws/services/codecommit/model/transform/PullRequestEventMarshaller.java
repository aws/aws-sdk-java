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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PullRequestEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PullRequestEventMarshaller {

    private static final MarshallingInfo<String> PULLREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestId").build();
    private static final MarshallingInfo<java.util.Date> EVENTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PULLREQUESTEVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestEventType").build();
    private static final MarshallingInfo<String> ACTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actorArn").build();
    private static final MarshallingInfo<StructuredPojo> PULLREQUESTCREATEDEVENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestCreatedEventMetadata").build();
    private static final MarshallingInfo<StructuredPojo> PULLREQUESTSTATUSCHANGEDEVENTMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestStatusChangedEventMetadata").build();
    private static final MarshallingInfo<StructuredPojo> PULLREQUESTSOURCEREFERENCEUPDATEDEVENTMETADATA_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pullRequestSourceReferenceUpdatedEventMetadata").build();
    private static final MarshallingInfo<StructuredPojo> PULLREQUESTMERGEDSTATECHANGEDEVENTMETADATA_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pullRequestMergedStateChangedEventMetadata")
            .build();

    private static final PullRequestEventMarshaller instance = new PullRequestEventMarshaller();

    public static PullRequestEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PullRequestEvent pullRequestEvent, ProtocolMarshaller protocolMarshaller) {

        if (pullRequestEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestId(), PULLREQUESTID_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getEventDate(), EVENTDATE_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestEventType(), PULLREQUESTEVENTTYPE_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getActorArn(), ACTORARN_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestCreatedEventMetadata(), PULLREQUESTCREATEDEVENTMETADATA_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestStatusChangedEventMetadata(), PULLREQUESTSTATUSCHANGEDEVENTMETADATA_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestSourceReferenceUpdatedEventMetadata(),
                    PULLREQUESTSOURCEREFERENCEUPDATEDEVENTMETADATA_BINDING);
            protocolMarshaller.marshall(pullRequestEvent.getPullRequestMergedStateChangedEventMetadata(), PULLREQUESTMERGEDSTATECHANGEDEVENTMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
