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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTableToPointInTimeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTableToPointInTimeRequestMarshaller {

    private static final MarshallingInfo<String> SOURCETABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceTableName").build();
    private static final MarshallingInfo<String> TARGETTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTableName").build();
    private static final MarshallingInfo<Boolean> USELATESTRESTORABLETIME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseLatestRestorableTime").build();
    private static final MarshallingInfo<java.util.Date> RESTOREDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreDateTime").timestampFormat("unixTimestamp").build();

    private static final RestoreTableToPointInTimeRequestMarshaller instance = new RestoreTableToPointInTimeRequestMarshaller();

    public static RestoreTableToPointInTimeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest, ProtocolMarshaller protocolMarshaller) {

        if (restoreTableToPointInTimeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTableToPointInTimeRequest.getSourceTableName(), SOURCETABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableToPointInTimeRequest.getTargetTableName(), TARGETTABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableToPointInTimeRequest.getUseLatestRestorableTime(), USELATESTRESTORABLETIME_BINDING);
            protocolMarshaller.marshall(restoreTableToPointInTimeRequest.getRestoreDateTime(), RESTOREDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
