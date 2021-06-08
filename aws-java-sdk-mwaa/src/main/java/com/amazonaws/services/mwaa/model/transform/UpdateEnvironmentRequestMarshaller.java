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
package com.amazonaws.services.mwaa.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mwaa.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateEnvironmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateEnvironmentRequestMarshaller {

    private static final MarshallingInfo<Map> AIRFLOWCONFIGURATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AirflowConfigurationOptions").build();
    private static final MarshallingInfo<String> AIRFLOWVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AirflowVersion").build();
    private static final MarshallingInfo<String> DAGS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DagS3Path").build();
    private static final MarshallingInfo<String> ENVIRONMENTCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentClass").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingConfiguration").build();
    private static final MarshallingInfo<Integer> MAXWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxWorkers").build();
    private static final MarshallingInfo<Integer> MINWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinWorkers").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkConfiguration").build();
    private static final MarshallingInfo<String> PLUGINSS3OBJECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PluginsS3ObjectVersion").build();
    private static final MarshallingInfo<String> PLUGINSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PluginsS3Path").build();
    private static final MarshallingInfo<String> REQUIREMENTSS3OBJECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequirementsS3ObjectVersion").build();
    private static final MarshallingInfo<String> REQUIREMENTSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequirementsS3Path").build();
    private static final MarshallingInfo<Integer> SCHEDULERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Schedulers").build();
    private static final MarshallingInfo<String> SOURCEBUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBucketArn").build();
    private static final MarshallingInfo<String> WEBSERVERACCESSMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebserverAccessMode").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCEWINDOWSTART_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceWindowStart").build();

    private static final UpdateEnvironmentRequestMarshaller instance = new UpdateEnvironmentRequestMarshaller();

    public static UpdateEnvironmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateEnvironmentRequest updateEnvironmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateEnvironmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateEnvironmentRequest.getAirflowConfigurationOptions(), AIRFLOWCONFIGURATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getAirflowVersion(), AIRFLOWVERSION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getDagS3Path(), DAGS3PATH_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getEnvironmentClass(), ENVIRONMENTCLASS_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getLoggingConfiguration(), LOGGINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getMaxWorkers(), MAXWORKERS_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getMinWorkers(), MINWORKERS_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getPluginsS3ObjectVersion(), PLUGINSS3OBJECTVERSION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getPluginsS3Path(), PLUGINSS3PATH_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getRequirementsS3ObjectVersion(), REQUIREMENTSS3OBJECTVERSION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getRequirementsS3Path(), REQUIREMENTSS3PATH_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getSchedulers(), SCHEDULERS_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getSourceBucketArn(), SOURCEBUCKETARN_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getWebserverAccessMode(), WEBSERVERACCESSMODE_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getWeeklyMaintenanceWindowStart(), WEEKLYMAINTENANCEWINDOWSTART_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
