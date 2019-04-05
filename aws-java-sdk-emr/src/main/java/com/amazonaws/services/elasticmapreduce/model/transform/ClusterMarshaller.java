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
 * ClusterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> EC2INSTANCEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2InstanceAttributes").build();
    private static final MarshallingInfo<String> INSTANCECOLLECTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCollectionType").build();
    private static final MarshallingInfo<String> LOGURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogUri").build();
    private static final MarshallingInfo<String> REQUESTEDAMIVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedAmiVersion").build();
    private static final MarshallingInfo<String> RUNNINGAMIVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningAmiVersion").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseLabel").build();
    private static final MarshallingInfo<Boolean> AUTOTERMINATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoTerminate").build();
    private static final MarshallingInfo<Boolean> TERMINATIONPROTECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationProtected").build();
    private static final MarshallingInfo<Boolean> VISIBLETOALLUSERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibleToAllUsers").build();
    private static final MarshallingInfo<List> APPLICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Applications").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<Integer> NORMALIZEDINSTANCEHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NormalizedInstanceHours").build();
    private static final MarshallingInfo<String> MASTERPUBLICDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MasterPublicDnsName").build();
    private static final MarshallingInfo<List> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configurations").build();
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

    private static final ClusterMarshaller instance = new ClusterMarshaller();

    public static ClusterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Cluster cluster, ProtocolMarshaller protocolMarshaller) {

        if (cluster == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cluster.getId(), ID_BINDING);
            protocolMarshaller.marshall(cluster.getName(), NAME_BINDING);
            protocolMarshaller.marshall(cluster.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(cluster.getEc2InstanceAttributes(), EC2INSTANCEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(cluster.getInstanceCollectionType(), INSTANCECOLLECTIONTYPE_BINDING);
            protocolMarshaller.marshall(cluster.getLogUri(), LOGURI_BINDING);
            protocolMarshaller.marshall(cluster.getRequestedAmiVersion(), REQUESTEDAMIVERSION_BINDING);
            protocolMarshaller.marshall(cluster.getRunningAmiVersion(), RUNNINGAMIVERSION_BINDING);
            protocolMarshaller.marshall(cluster.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(cluster.getAutoTerminate(), AUTOTERMINATE_BINDING);
            protocolMarshaller.marshall(cluster.getTerminationProtected(), TERMINATIONPROTECTED_BINDING);
            protocolMarshaller.marshall(cluster.getVisibleToAllUsers(), VISIBLETOALLUSERS_BINDING);
            protocolMarshaller.marshall(cluster.getApplications(), APPLICATIONS_BINDING);
            protocolMarshaller.marshall(cluster.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(cluster.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(cluster.getNormalizedInstanceHours(), NORMALIZEDINSTANCEHOURS_BINDING);
            protocolMarshaller.marshall(cluster.getMasterPublicDnsName(), MASTERPUBLICDNSNAME_BINDING);
            protocolMarshaller.marshall(cluster.getConfigurations(), CONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(cluster.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(cluster.getAutoScalingRole(), AUTOSCALINGROLE_BINDING);
            protocolMarshaller.marshall(cluster.getScaleDownBehavior(), SCALEDOWNBEHAVIOR_BINDING);
            protocolMarshaller.marshall(cluster.getCustomAmiId(), CUSTOMAMIID_BINDING);
            protocolMarshaller.marshall(cluster.getEbsRootVolumeSize(), EBSROOTVOLUMESIZE_BINDING);
            protocolMarshaller.marshall(cluster.getRepoUpgradeOnBoot(), REPOUPGRADEONBOOT_BINDING);
            protocolMarshaller.marshall(cluster.getKerberosAttributes(), KERBEROSATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
