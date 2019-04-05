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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RunJobFlowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RunJobFlowRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> LOGURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogUri").build();
    private static final MarshallingInfo<String> ADDITIONALINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalInfo").build();
    private static final MarshallingInfo<String> AMIVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmiVersion").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseLabel").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Instances").build();
    private static final MarshallingInfo<List> STEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Steps").build();
    private static final MarshallingInfo<List> BOOTSTRAPACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BootstrapActions").build();
    private static final MarshallingInfo<List> SUPPORTEDPRODUCTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedProducts").build();
    private static final MarshallingInfo<List> NEWSUPPORTEDPRODUCTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewSupportedProducts").build();
    private static final MarshallingInfo<List> APPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Applications").build();
    private static final MarshallingInfo<List> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configurations").build();
    private static final MarshallingInfo<Boolean> VISIBLETOALLUSERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibleToAllUsers").build();
    private static final MarshallingInfo<String> JOBFLOWROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JobFlowRole").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<String> AUTOSCALINGROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingRole").build();
    private static final MarshallingInfo<String> SCALEDOWNBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleDownBehavior").build();
    private static final MarshallingInfo<String> CUSTOMAMIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomAmiId").build();
    private static final MarshallingInfo<Integer> EBSROOTVOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsRootVolumeSize").build();
    private static final MarshallingInfo<String> REPOUPGRADEONBOOT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepoUpgradeOnBoot").build();
    private static final MarshallingInfo<StructuredPojo> KERBEROSATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KerberosAttributes").build();

    private static final RunJobFlowRequestMarshaller instance = new RunJobFlowRequestMarshaller();

    public static RunJobFlowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RunJobFlowRequest runJobFlowRequest, ProtocolMarshaller protocolMarshaller) {

        if (runJobFlowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(runJobFlowRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getLogUri(), LOGURI_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getAdditionalInfo(), ADDITIONALINFO_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getAmiVersion(), AMIVERSION_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getInstances(), INSTANCES_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getSteps(), STEPS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getBootstrapActions(), BOOTSTRAPACTIONS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getSupportedProducts(), SUPPORTEDPRODUCTS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getNewSupportedProducts(), NEWSUPPORTEDPRODUCTS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getApplications(), APPLICATIONS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getConfigurations(), CONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getVisibleToAllUsers(), VISIBLETOALLUSERS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getJobFlowRole(), JOBFLOWROLE_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getAutoScalingRole(), AUTOSCALINGROLE_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getScaleDownBehavior(), SCALEDOWNBEHAVIOR_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getCustomAmiId(), CUSTOMAMIID_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getEbsRootVolumeSize(), EBSROOTVOLUMESIZE_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getRepoUpgradeOnBoot(), REPOUPGRADEONBOOT_BINDING);
            protocolMarshaller.marshall(runJobFlowRequest.getKerberosAttributes(), KERBEROSATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
