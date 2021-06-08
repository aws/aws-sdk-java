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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gluedatabrew.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<java.util.Date> CREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> JOBNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobNames").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> CRONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CronExpression").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();

    private static final ScheduleMarshaller instance = new ScheduleMarshaller();

    public static ScheduleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Schedule schedule, ProtocolMarshaller protocolMarshaller) {

        if (schedule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(schedule.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(schedule.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(schedule.getCreateDate(), CREATEDATE_BINDING);
            protocolMarshaller.marshall(schedule.getJobNames(), JOBNAMES_BINDING);
            protocolMarshaller.marshall(schedule.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(schedule.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(schedule.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(schedule.getCronExpression(), CRONEXPRESSION_BINDING);
            protocolMarshaller.marshall(schedule.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(schedule.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
