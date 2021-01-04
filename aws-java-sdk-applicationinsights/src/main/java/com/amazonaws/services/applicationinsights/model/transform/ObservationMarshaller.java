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
package com.amazonaws.services.applicationinsights.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationinsights.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObservationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObservationMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceARN").build();
    private static final MarshallingInfo<String> LOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogGroup").build();
    private static final MarshallingInfo<java.util.Date> LINETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LineTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LOGTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogText").build();
    private static final MarshallingInfo<String> LOGFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogFilter").build();
    private static final MarshallingInfo<String> METRICNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricNamespace").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<Double> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Value").build();
    private static final MarshallingInfo<String> CLOUDWATCHEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchEventId").build();
    private static final MarshallingInfo<String> CLOUDWATCHEVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchEventSource").build();
    private static final MarshallingInfo<String> CLOUDWATCHEVENTDETAILTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchEventDetailType").build();
    private static final MarshallingInfo<String> HEALTHEVENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventArn").build();
    private static final MarshallingInfo<String> HEALTHSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthService").build();
    private static final MarshallingInfo<String> HEALTHEVENTTYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventTypeCode").build();
    private static final MarshallingInfo<String> HEALTHEVENTTYPECATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventTypeCategory").build();
    private static final MarshallingInfo<String> HEALTHEVENTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthEventDescription").build();
    private static final MarshallingInfo<String> CODEDEPLOYDEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeDeployDeploymentId").build();
    private static final MarshallingInfo<String> CODEDEPLOYDEPLOYMENTGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeDeployDeploymentGroup").build();
    private static final MarshallingInfo<String> CODEDEPLOYSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeDeployState").build();
    private static final MarshallingInfo<String> CODEDEPLOYAPPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeDeployApplication").build();
    private static final MarshallingInfo<String> CODEDEPLOYINSTANCEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeDeployInstanceGroupId").build();
    private static final MarshallingInfo<String> EC2STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ec2State").build();
    private static final MarshallingInfo<String> RDSEVENTCATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RdsEventCategories").build();
    private static final MarshallingInfo<String> RDSEVENTMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RdsEventMessage").build();
    private static final MarshallingInfo<String> S3EVENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3EventName").build();
    private static final MarshallingInfo<String> STATESEXECUTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatesExecutionArn").build();
    private static final MarshallingInfo<String> STATESARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StatesArn").build();
    private static final MarshallingInfo<String> STATESSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatesStatus").build();
    private static final MarshallingInfo<String> STATESINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatesInput").build();
    private static final MarshallingInfo<String> EBSEVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EbsEvent").build();
    private static final MarshallingInfo<String> EBSRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EbsResult").build();
    private static final MarshallingInfo<String> EBSCAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EbsCause").build();
    private static final MarshallingInfo<String> EBSREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsRequestId").build();
    private static final MarshallingInfo<Integer> XRAYFAULTPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayFaultPercent").build();
    private static final MarshallingInfo<Integer> XRAYTHROTTLEPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayThrottlePercent").build();
    private static final MarshallingInfo<Integer> XRAYERRORPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayErrorPercent").build();
    private static final MarshallingInfo<Integer> XRAYREQUESTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayRequestCount").build();
    private static final MarshallingInfo<Long> XRAYREQUESTAVERAGELATENCY_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayRequestAverageLatency").build();
    private static final MarshallingInfo<String> XRAYNODENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayNodeName").build();
    private static final MarshallingInfo<String> XRAYNODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XRayNodeType").build();

    private static final ObservationMarshaller instance = new ObservationMarshaller();

    public static ObservationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Observation observation, ProtocolMarshaller protocolMarshaller) {

        if (observation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(observation.getId(), ID_BINDING);
            protocolMarshaller.marshall(observation.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(observation.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(observation.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(observation.getSourceARN(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(observation.getLogGroup(), LOGGROUP_BINDING);
            protocolMarshaller.marshall(observation.getLineTime(), LINETIME_BINDING);
            protocolMarshaller.marshall(observation.getLogText(), LOGTEXT_BINDING);
            protocolMarshaller.marshall(observation.getLogFilter(), LOGFILTER_BINDING);
            protocolMarshaller.marshall(observation.getMetricNamespace(), METRICNAMESPACE_BINDING);
            protocolMarshaller.marshall(observation.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(observation.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(observation.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(observation.getCloudWatchEventId(), CLOUDWATCHEVENTID_BINDING);
            protocolMarshaller.marshall(observation.getCloudWatchEventSource(), CLOUDWATCHEVENTSOURCE_BINDING);
            protocolMarshaller.marshall(observation.getCloudWatchEventDetailType(), CLOUDWATCHEVENTDETAILTYPE_BINDING);
            protocolMarshaller.marshall(observation.getHealthEventArn(), HEALTHEVENTARN_BINDING);
            protocolMarshaller.marshall(observation.getHealthService(), HEALTHSERVICE_BINDING);
            protocolMarshaller.marshall(observation.getHealthEventTypeCode(), HEALTHEVENTTYPECODE_BINDING);
            protocolMarshaller.marshall(observation.getHealthEventTypeCategory(), HEALTHEVENTTYPECATEGORY_BINDING);
            protocolMarshaller.marshall(observation.getHealthEventDescription(), HEALTHEVENTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(observation.getCodeDeployDeploymentId(), CODEDEPLOYDEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(observation.getCodeDeployDeploymentGroup(), CODEDEPLOYDEPLOYMENTGROUP_BINDING);
            protocolMarshaller.marshall(observation.getCodeDeployState(), CODEDEPLOYSTATE_BINDING);
            protocolMarshaller.marshall(observation.getCodeDeployApplication(), CODEDEPLOYAPPLICATION_BINDING);
            protocolMarshaller.marshall(observation.getCodeDeployInstanceGroupId(), CODEDEPLOYINSTANCEGROUPID_BINDING);
            protocolMarshaller.marshall(observation.getEc2State(), EC2STATE_BINDING);
            protocolMarshaller.marshall(observation.getRdsEventCategories(), RDSEVENTCATEGORIES_BINDING);
            protocolMarshaller.marshall(observation.getRdsEventMessage(), RDSEVENTMESSAGE_BINDING);
            protocolMarshaller.marshall(observation.getS3EventName(), S3EVENTNAME_BINDING);
            protocolMarshaller.marshall(observation.getStatesExecutionArn(), STATESEXECUTIONARN_BINDING);
            protocolMarshaller.marshall(observation.getStatesArn(), STATESARN_BINDING);
            protocolMarshaller.marshall(observation.getStatesStatus(), STATESSTATUS_BINDING);
            protocolMarshaller.marshall(observation.getStatesInput(), STATESINPUT_BINDING);
            protocolMarshaller.marshall(observation.getEbsEvent(), EBSEVENT_BINDING);
            protocolMarshaller.marshall(observation.getEbsResult(), EBSRESULT_BINDING);
            protocolMarshaller.marshall(observation.getEbsCause(), EBSCAUSE_BINDING);
            protocolMarshaller.marshall(observation.getEbsRequestId(), EBSREQUESTID_BINDING);
            protocolMarshaller.marshall(observation.getXRayFaultPercent(), XRAYFAULTPERCENT_BINDING);
            protocolMarshaller.marshall(observation.getXRayThrottlePercent(), XRAYTHROTTLEPERCENT_BINDING);
            protocolMarshaller.marshall(observation.getXRayErrorPercent(), XRAYERRORPERCENT_BINDING);
            protocolMarshaller.marshall(observation.getXRayRequestCount(), XRAYREQUESTCOUNT_BINDING);
            protocolMarshaller.marshall(observation.getXRayRequestAverageLatency(), XRAYREQUESTAVERAGELATENCY_BINDING);
            protocolMarshaller.marshall(observation.getXRayNodeName(), XRAYNODENAME_BINDING);
            protocolMarshaller.marshall(observation.getXRayNodeType(), XRAYNODETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
