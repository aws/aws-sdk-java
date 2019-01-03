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
 * ListBackupsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListBackupsRequestMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<java.util.Date> TIMERANGELOWERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeRangeLowerBound").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> TIMERANGEUPPERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeRangeUpperBound").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXCLUSIVESTARTBACKUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusiveStartBackupArn").build();
    private static final MarshallingInfo<String> BACKUPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupType").build();

    private static final ListBackupsRequestMarshaller instance = new ListBackupsRequestMarshaller();

    public static ListBackupsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListBackupsRequest listBackupsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listBackupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listBackupsRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(listBackupsRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(listBackupsRequest.getTimeRangeLowerBound(), TIMERANGELOWERBOUND_BINDING);
            protocolMarshaller.marshall(listBackupsRequest.getTimeRangeUpperBound(), TIMERANGEUPPERBOUND_BINDING);
            protocolMarshaller.marshall(listBackupsRequest.getExclusiveStartBackupArn(), EXCLUSIVESTARTBACKUPARN_BINDING);
            protocolMarshaller.marshall(listBackupsRequest.getBackupType(), BACKUPTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
