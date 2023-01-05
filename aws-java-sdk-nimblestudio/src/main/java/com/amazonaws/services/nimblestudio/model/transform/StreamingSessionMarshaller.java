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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamingSessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamingSessionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> AUTOMATICTERMINATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("automaticTerminationMode").build();
    private static final MarshallingInfo<String> BACKUPMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backupMode").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> EC2INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceType").build();
    private static final MarshallingInfo<String> LAUNCHPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchProfileId").build();
    private static final MarshallingInfo<Integer> MAXBACKUPSTORETAIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBackupsToRetain").build();
    private static final MarshallingInfo<String> OWNEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ownedBy").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<String> SESSIONPERSISTENCEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionPersistenceMode").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STARTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedBy").build();
    private static final MarshallingInfo<String> STARTEDFROMBACKUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedFromBackupId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusCode").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<java.util.Date> STOPAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> STOPPEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stoppedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> STOPPEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stoppedBy").build();
    private static final MarshallingInfo<String> STREAMINGIMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streamingImageId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<java.util.Date> TERMINATEAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terminateAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();
    private static final MarshallingInfo<StructuredPojo> VOLUMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeConfiguration").build();
    private static final MarshallingInfo<String> VOLUMERETENTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeRetentionMode").build();

    private static final StreamingSessionMarshaller instance = new StreamingSessionMarshaller();

    public static StreamingSessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamingSession streamingSession, ProtocolMarshaller protocolMarshaller) {

        if (streamingSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamingSession.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(streamingSession.getAutomaticTerminationMode(), AUTOMATICTERMINATIONMODE_BINDING);
            protocolMarshaller.marshall(streamingSession.getBackupMode(), BACKUPMODE_BINDING);
            protocolMarshaller.marshall(streamingSession.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(streamingSession.getEc2InstanceType(), EC2INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(streamingSession.getLaunchProfileId(), LAUNCHPROFILEID_BINDING);
            protocolMarshaller.marshall(streamingSession.getMaxBackupsToRetain(), MAXBACKUPSTORETAIN_BINDING);
            protocolMarshaller.marshall(streamingSession.getOwnedBy(), OWNEDBY_BINDING);
            protocolMarshaller.marshall(streamingSession.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(streamingSession.getSessionPersistenceMode(), SESSIONPERSISTENCEMODE_BINDING);
            protocolMarshaller.marshall(streamingSession.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getStartedBy(), STARTEDBY_BINDING);
            protocolMarshaller.marshall(streamingSession.getStartedFromBackupId(), STARTEDFROMBACKUPID_BINDING);
            protocolMarshaller.marshall(streamingSession.getState(), STATE_BINDING);
            protocolMarshaller.marshall(streamingSession.getStatusCode(), STATUSCODE_BINDING);
            protocolMarshaller.marshall(streamingSession.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(streamingSession.getStopAt(), STOPAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getStoppedAt(), STOPPEDAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getStoppedBy(), STOPPEDBY_BINDING);
            protocolMarshaller.marshall(streamingSession.getStreamingImageId(), STREAMINGIMAGEID_BINDING);
            protocolMarshaller.marshall(streamingSession.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(streamingSession.getTerminateAt(), TERMINATEAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(streamingSession.getUpdatedBy(), UPDATEDBY_BINDING);
            protocolMarshaller.marshall(streamingSession.getVolumeConfiguration(), VOLUMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(streamingSession.getVolumeRetentionMode(), VOLUMERETENTIONMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
