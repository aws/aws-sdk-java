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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataCollectionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataCollectionDetailsMarshaller {

    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> FAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("failed").build();
    private static final MarshallingInfo<Integer> INPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inProgress").build();
    private static final MarshallingInfo<Integer> SERVERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("servers").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<Integer> SUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("success").build();

    private static final DataCollectionDetailsMarshaller instance = new DataCollectionDetailsMarshaller();

    public static DataCollectionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataCollectionDetails dataCollectionDetails, ProtocolMarshaller protocolMarshaller) {

        if (dataCollectionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataCollectionDetails.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getFailed(), FAILED_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getInProgress(), INPROGRESS_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getServers(), SERVERS_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(dataCollectionDetails.getSuccess(), SUCCESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
