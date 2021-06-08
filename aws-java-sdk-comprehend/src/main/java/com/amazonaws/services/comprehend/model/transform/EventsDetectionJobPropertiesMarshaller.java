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
package com.amazonaws.services.comprehend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventsDetectionJobPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventsDetectionJobPropertiesMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobStatus").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<java.util.Date> SUBMITTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubmitTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDataConfig").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<List> TARGETEVENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetEventTypes").build();

    private static final EventsDetectionJobPropertiesMarshaller instance = new EventsDetectionJobPropertiesMarshaller();

    public static EventsDetectionJobPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventsDetectionJobProperties eventsDetectionJobProperties, ProtocolMarshaller protocolMarshaller) {

        if (eventsDetectionJobProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventsDetectionJobProperties.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getJobStatus(), JOBSTATUS_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getSubmitTime(), SUBMITTIME_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(eventsDetectionJobProperties.getTargetEventTypes(), TARGETEVENTTYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
