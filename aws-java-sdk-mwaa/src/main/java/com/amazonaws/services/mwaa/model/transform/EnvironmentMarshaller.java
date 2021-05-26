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
 * EnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentMarshaller {

    private static final MarshallingInfo<Map> AIRFLOWCONFIGURATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AirflowConfigurationOptions").build();
    private static final MarshallingInfo<String> AIRFLOWVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AirflowVersion").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DAGS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DagS3Path").build();
    private static final MarshallingInfo<String> ENVIRONMENTCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnvironmentClass").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKey").build();
    private static final MarshallingInfo<StructuredPojo> LASTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdate").build();
    private static final MarshallingInfo<StructuredPojo> LOGGINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingConfiguration").build();
    private static final MarshallingInfo<Integer> MAXWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxWorkers").build();
    private static final MarshallingInfo<Integer> MINWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinWorkers").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
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
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<String> SOURCEBUCKETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBucketArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> WEBSERVERACCESSMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebserverAccessMode").build();
    private static final MarshallingInfo<String> WEBSERVERURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebserverUrl").build();
    private static final MarshallingInfo<String> WEEKLYMAINTENANCEWINDOWSTART_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WeeklyMaintenanceWindowStart").build();

    private static final EnvironmentMarshaller instance = new EnvironmentMarshaller();

    public static EnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Environment environment, ProtocolMarshaller protocolMarshaller) {

        if (environment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environment.getAirflowConfigurationOptions(), AIRFLOWCONFIGURATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(environment.getAirflowVersion(), AIRFLOWVERSION_BINDING);
            protocolMarshaller.marshall(environment.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(environment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environment.getDagS3Path(), DAGS3PATH_BINDING);
            protocolMarshaller.marshall(environment.getEnvironmentClass(), ENVIRONMENTCLASS_BINDING);
            protocolMarshaller.marshall(environment.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(environment.getKmsKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(environment.getLastUpdate(), LASTUPDATE_BINDING);
            protocolMarshaller.marshall(environment.getLoggingConfiguration(), LOGGINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(environment.getMaxWorkers(), MAXWORKERS_BINDING);
            protocolMarshaller.marshall(environment.getMinWorkers(), MINWORKERS_BINDING);
            protocolMarshaller.marshall(environment.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environment.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(environment.getPluginsS3ObjectVersion(), PLUGINSS3OBJECTVERSION_BINDING);
            protocolMarshaller.marshall(environment.getPluginsS3Path(), PLUGINSS3PATH_BINDING);
            protocolMarshaller.marshall(environment.getRequirementsS3ObjectVersion(), REQUIREMENTSS3OBJECTVERSION_BINDING);
            protocolMarshaller.marshall(environment.getRequirementsS3Path(), REQUIREMENTSS3PATH_BINDING);
            protocolMarshaller.marshall(environment.getSchedulers(), SCHEDULERS_BINDING);
            protocolMarshaller.marshall(environment.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(environment.getSourceBucketArn(), SOURCEBUCKETARN_BINDING);
            protocolMarshaller.marshall(environment.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(environment.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(environment.getWebserverAccessMode(), WEBSERVERACCESSMODE_BINDING);
            protocolMarshaller.marshall(environment.getWebserverUrl(), WEBSERVERURL_BINDING);
            protocolMarshaller.marshall(environment.getWeeklyMaintenanceWindowStart(), WEEKLYMAINTENANCEWINDOWSTART_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
