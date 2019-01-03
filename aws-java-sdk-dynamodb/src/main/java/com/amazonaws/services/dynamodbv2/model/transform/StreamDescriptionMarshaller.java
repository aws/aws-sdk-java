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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StreamDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StreamDescriptionMarshaller {

    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamArn").build();
    private static final MarshallingInfo<String> STREAMLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamLabel").build();
    private static final MarshallingInfo<String> STREAMSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamStatus").build();
    private static final MarshallingInfo<String> STREAMVIEWTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamViewType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONREQUESTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationRequestDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<List> KEYSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeySchema").build();
    private static final MarshallingInfo<List> SHARDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shards").build();
    private static final MarshallingInfo<String> LASTEVALUATEDSHARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastEvaluatedShardId").build();

    private static final StreamDescriptionMarshaller instance = new StreamDescriptionMarshaller();

    public static StreamDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StreamDescription streamDescription, ProtocolMarshaller protocolMarshaller) {

        if (streamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(streamDescription.getStreamArn(), STREAMARN_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamLabel(), STREAMLABEL_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamStatus(), STREAMSTATUS_BINDING);
            protocolMarshaller.marshall(streamDescription.getStreamViewType(), STREAMVIEWTYPE_BINDING);
            protocolMarshaller.marshall(streamDescription.getCreationRequestDateTime(), CREATIONREQUESTDATETIME_BINDING);
            protocolMarshaller.marshall(streamDescription.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(streamDescription.getKeySchema(), KEYSCHEMA_BINDING);
            protocolMarshaller.marshall(streamDescription.getShards(), SHARDS_BINDING);
            protocolMarshaller.marshall(streamDescription.getLastEvaluatedShardId(), LASTEVALUATEDSHARDID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
