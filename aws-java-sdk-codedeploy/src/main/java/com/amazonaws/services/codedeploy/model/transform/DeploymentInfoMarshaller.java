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
package com.amazonaws.services.codedeploy.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeploymentInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeploymentInfoMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationName").build();
    private static final MarshallingInfo<String> DEPLOYMENTGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentGroupName").build();
    private static final MarshallingInfo<String> DEPLOYMENTCONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfigName").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<StructuredPojo> PREVIOUSREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("previousRevision").build();
    private static final MarshallingInfo<StructuredPojo> REVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revision").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInformation").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completeTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTOVERVIEW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentOverview").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> CREATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("creator").build();
    private static final MarshallingInfo<Boolean> IGNOREAPPLICATIONSTOPFAILURES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ignoreApplicationStopFailures").build();
    private static final MarshallingInfo<StructuredPojo> AUTOROLLBACKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRollbackConfiguration").build();
    private static final MarshallingInfo<Boolean> UPDATEOUTDATEDINSTANCESONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateOutdatedInstancesOnly").build();
    private static final MarshallingInfo<StructuredPojo> ROLLBACKINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rollbackInfo").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStyle").build();
    private static final MarshallingInfo<StructuredPojo> TARGETINSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstances").build();
    private static final MarshallingInfo<Boolean> INSTANCETERMINATIONWAITTIMESTARTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceTerminationWaitTimeStarted").build();
    private static final MarshallingInfo<StructuredPojo> BLUEGREENDEPLOYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blueGreenDeploymentConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LOADBALANCERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loadBalancerInfo").build();
    private static final MarshallingInfo<String> ADDITIONALDEPLOYMENTSTATUSINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalDeploymentStatusInfo").build();
    private static final MarshallingInfo<String> FILEEXISTSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fileExistsBehavior").build();
    private static final MarshallingInfo<List> DEPLOYMENTSTATUSMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentStatusMessages").build();
    private static final MarshallingInfo<String> COMPUTEPLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computePlatform").build();

    private static final DeploymentInfoMarshaller instance = new DeploymentInfoMarshaller();

    public static DeploymentInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeploymentInfo deploymentInfo, ProtocolMarshaller protocolMarshaller) {

        if (deploymentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deploymentInfo.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentGroupName(), DEPLOYMENTGROUPNAME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentConfigName(), DEPLOYMENTCONFIGNAME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getPreviousRevision(), PREVIOUSREVISION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getRevision(), REVISION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getErrorInformation(), ERRORINFORMATION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getCompleteTime(), COMPLETETIME_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentOverview(), DEPLOYMENTOVERVIEW_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getCreator(), CREATOR_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getIgnoreApplicationStopFailures(), IGNOREAPPLICATIONSTOPFAILURES_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getAutoRollbackConfiguration(), AUTOROLLBACKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getUpdateOutdatedInstancesOnly(), UPDATEOUTDATEDINSTANCESONLY_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getRollbackInfo(), ROLLBACKINFO_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentStyle(), DEPLOYMENTSTYLE_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getTargetInstances(), TARGETINSTANCES_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getInstanceTerminationWaitTimeStarted(), INSTANCETERMINATIONWAITTIMESTARTED_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getBlueGreenDeploymentConfiguration(), BLUEGREENDEPLOYMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getLoadBalancerInfo(), LOADBALANCERINFO_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getAdditionalDeploymentStatusInfo(), ADDITIONALDEPLOYMENTSTATUSINFO_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getFileExistsBehavior(), FILEEXISTSBEHAVIOR_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getDeploymentStatusMessages(), DEPLOYMENTSTATUSMESSAGES_BINDING);
            protocolMarshaller.marshall(deploymentInfo.getComputePlatform(), COMPUTEPLATFORM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
