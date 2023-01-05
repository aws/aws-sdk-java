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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportPlanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportPlanMarshaller {

    private static final MarshallingInfo<String> REPORTPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportPlanArn").build();
    private static final MarshallingInfo<String> REPORTPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportPlanName").build();
    private static final MarshallingInfo<String> REPORTPLANDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportPlanDescription").build();
    private static final MarshallingInfo<StructuredPojo> REPORTSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportSetting").build();
    private static final MarshallingInfo<StructuredPojo> REPORTDELIVERYCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportDeliveryChannel").build();
    private static final MarshallingInfo<String> DEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTATTEMPTEDEXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAttemptedExecutionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULEXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulExecutionTime").timestampFormat("unixTimestamp").build();

    private static final ReportPlanMarshaller instance = new ReportPlanMarshaller();

    public static ReportPlanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportPlan reportPlan, ProtocolMarshaller protocolMarshaller) {

        if (reportPlan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportPlan.getReportPlanArn(), REPORTPLANARN_BINDING);
            protocolMarshaller.marshall(reportPlan.getReportPlanName(), REPORTPLANNAME_BINDING);
            protocolMarshaller.marshall(reportPlan.getReportPlanDescription(), REPORTPLANDESCRIPTION_BINDING);
            protocolMarshaller.marshall(reportPlan.getReportSetting(), REPORTSETTING_BINDING);
            protocolMarshaller.marshall(reportPlan.getReportDeliveryChannel(), REPORTDELIVERYCHANNEL_BINDING);
            protocolMarshaller.marshall(reportPlan.getDeploymentStatus(), DEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(reportPlan.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(reportPlan.getLastAttemptedExecutionTime(), LASTATTEMPTEDEXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(reportPlan.getLastSuccessfulExecutionTime(), LASTSUCCESSFULEXECUTIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
