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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RunMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<java.util.Date> STARTED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("started").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopped").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> COUNTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("counters").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<Integer> TOTALJOBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalJobs").build();
    private static final MarshallingInfo<Integer> COMPLETEDJOBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completedJobs").build();
    private static final MarshallingInfo<String> BILLINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingMethod").build();
    private static final MarshallingInfo<StructuredPojo> DEVICEMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceMinutes").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkProfile").build();
    private static final MarshallingInfo<String> PARSINGRESULTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parsingResultUrl").build();
    private static final MarshallingInfo<String> RESULTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resultCode").build();
    private static final MarshallingInfo<Integer> SEED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("seed").build();
    private static final MarshallingInfo<String> APPUPLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appUpload").build();
    private static final MarshallingInfo<Integer> EVENTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventCount").build();
    private static final MarshallingInfo<Integer> JOBTIMEOUTMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobTimeoutMinutes").build();
    private static final MarshallingInfo<String> DEVICEPOOLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("devicePoolArn").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("locale").build();
    private static final MarshallingInfo<StructuredPojo> RADIOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("radios").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMERARTIFACTPATHS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerArtifactPaths").build();
    private static final MarshallingInfo<String> WEBURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("webUrl").build();
    private static final MarshallingInfo<Boolean> SKIPAPPRESIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skipAppResign").build();
    private static final MarshallingInfo<String> TESTSPECARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testSpecArn").build();
    private static final MarshallingInfo<StructuredPojo> DEVICESELECTIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceSelectionResult").build();

    private static final RunMarshaller instance = new RunMarshaller();

    public static RunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Run run, ProtocolMarshaller protocolMarshaller) {

        if (run == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(run.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(run.getName(), NAME_BINDING);
            protocolMarshaller.marshall(run.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(run.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(run.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(run.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(run.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(run.getStarted(), STARTED_BINDING);
            protocolMarshaller.marshall(run.getStopped(), STOPPED_BINDING);
            protocolMarshaller.marshall(run.getCounters(), COUNTERS_BINDING);
            protocolMarshaller.marshall(run.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(run.getTotalJobs(), TOTALJOBS_BINDING);
            protocolMarshaller.marshall(run.getCompletedJobs(), COMPLETEDJOBS_BINDING);
            protocolMarshaller.marshall(run.getBillingMethod(), BILLINGMETHOD_BINDING);
            protocolMarshaller.marshall(run.getDeviceMinutes(), DEVICEMINUTES_BINDING);
            protocolMarshaller.marshall(run.getNetworkProfile(), NETWORKPROFILE_BINDING);
            protocolMarshaller.marshall(run.getParsingResultUrl(), PARSINGRESULTURL_BINDING);
            protocolMarshaller.marshall(run.getResultCode(), RESULTCODE_BINDING);
            protocolMarshaller.marshall(run.getSeed(), SEED_BINDING);
            protocolMarshaller.marshall(run.getAppUpload(), APPUPLOAD_BINDING);
            protocolMarshaller.marshall(run.getEventCount(), EVENTCOUNT_BINDING);
            protocolMarshaller.marshall(run.getJobTimeoutMinutes(), JOBTIMEOUTMINUTES_BINDING);
            protocolMarshaller.marshall(run.getDevicePoolArn(), DEVICEPOOLARN_BINDING);
            protocolMarshaller.marshall(run.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(run.getRadios(), RADIOS_BINDING);
            protocolMarshaller.marshall(run.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(run.getCustomerArtifactPaths(), CUSTOMERARTIFACTPATHS_BINDING);
            protocolMarshaller.marshall(run.getWebUrl(), WEBURL_BINDING);
            protocolMarshaller.marshall(run.getSkipAppResign(), SKIPAPPRESIGN_BINDING);
            protocolMarshaller.marshall(run.getTestSpecArn(), TESTSPECARN_BINDING);
            protocolMarshaller.marshall(run.getDeviceSelectionResult(), DEVICESELECTIONRESULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
