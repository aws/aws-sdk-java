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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsSageMakerNotebookInstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSageMakerNotebookInstanceDetailsMarshaller {

    private static final MarshallingInfo<List> ACCELERATORTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorTypes").build();
    private static final MarshallingInfo<List> ADDITIONALCODEREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalCodeRepositories").build();
    private static final MarshallingInfo<String> DEFAULTCODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultCodeRepository").build();
    private static final MarshallingInfo<String> DIRECTINTERNETACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectInternetAccess").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEMETADATASERVICECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMetadataServiceConfiguration").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceId").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceArn").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceLifecycleConfigName").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceName").build();
    private static final MarshallingInfo<String> NOTEBOOKINSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceStatus").build();
    private static final MarshallingInfo<String> PLATFORMIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlatformIdentifier").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> ROOTACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootAccess").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();
    private static final MarshallingInfo<Integer> VOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeSizeInGB").build();

    private static final AwsSageMakerNotebookInstanceDetailsMarshaller instance = new AwsSageMakerNotebookInstanceDetailsMarshaller();

    public static AwsSageMakerNotebookInstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSageMakerNotebookInstanceDetails awsSageMakerNotebookInstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsSageMakerNotebookInstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getAcceleratorTypes(), ACCELERATORTYPES_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getAdditionalCodeRepositories(), ADDITIONALCODEREPOSITORIES_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getDefaultCodeRepository(), DEFAULTCODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getDirectInternetAccess(), DIRECTINTERNETACCESS_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getInstanceMetadataServiceConfiguration(),
                    INSTANCEMETADATASERVICECONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getNotebookInstanceArn(), NOTEBOOKINSTANCEARN_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getNotebookInstanceLifecycleConfigName(),
                    NOTEBOOKINSTANCELIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getNotebookInstanceName(), NOTEBOOKINSTANCENAME_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getNotebookInstanceStatus(), NOTEBOOKINSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getPlatformIdentifier(), PLATFORMIDENTIFIER_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getRootAccess(), ROOTACCESS_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getUrl(), URL_BINDING);
            protocolMarshaller.marshall(awsSageMakerNotebookInstanceDetails.getVolumeSizeInGB(), VOLUMESIZEINGB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
