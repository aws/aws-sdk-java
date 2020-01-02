/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appconfig.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentSummaryMarshaller {

    private static final MarshallingInfo<Integer> DEPLOYMENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentNumber").build();
    private static final MarshallingInfo<String> CONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationName").build();
    private static final MarshallingInfo<String> CONFIGURATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationVersion").build();
    private static final MarshallingInfo<Integer> DEPLOYMENTDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentDurationInMinutes").build();
    private static final MarshallingInfo<String> GROWTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthType").build();
    private static final MarshallingInfo<Float> GROWTHFACTOR_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthFactor").build();
    private static final MarshallingInfo<Integer> FINALBAKETIMEINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FinalBakeTimeInMinutes").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<Float> PERCENTAGECOMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PercentageComplete").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedAt").timestampFormat("iso8601").build();

    private static final DeploymentSummaryMarshaller instance = new DeploymentSummaryMarshaller();

    public static DeploymentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentSummary deploymentSummary, ProtocolMarshaller protocolMarshaller) {

        if (deploymentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentSummary.getDeploymentNumber(), DEPLOYMENTNUMBER_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getConfigurationVersion(), CONFIGURATIONVERSION_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getDeploymentDurationInMinutes(), DEPLOYMENTDURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getGrowthType(), GROWTHTYPE_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getGrowthFactor(), GROWTHFACTOR_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getFinalBakeTimeInMinutes(), FINALBAKETIMEINMINUTES_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getState(), STATE_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getPercentageComplete(), PERCENTAGECOMPLETE_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(deploymentSummary.getCompletedAt(), COMPLETEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
