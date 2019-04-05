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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateNotebookInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNotebookInstanceRequestMarshaller {

    private static final MarshallingInfo<String> NOTEBOOKINSTANCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotebookInstanceName").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> LIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LifecycleConfigName").build();
    private static final MarshallingInfo<Boolean> DISASSOCIATELIFECYCLECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisassociateLifecycleConfig").build();
    private static final MarshallingInfo<Integer> VOLUMESIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeSizeInGB").build();
    private static final MarshallingInfo<String> DEFAULTCODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultCodeRepository").build();
    private static final MarshallingInfo<List> ADDITIONALCODEREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalCodeRepositories").build();
    private static final MarshallingInfo<List> ACCELERATORTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorTypes").build();
    private static final MarshallingInfo<Boolean> DISASSOCIATEACCELERATORTYPES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisassociateAcceleratorTypes").build();
    private static final MarshallingInfo<Boolean> DISASSOCIATEDEFAULTCODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisassociateDefaultCodeRepository").build();
    private static final MarshallingInfo<Boolean> DISASSOCIATEADDITIONALCODEREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisassociateAdditionalCodeRepositories").build();
    private static final MarshallingInfo<String> ROOTACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootAccess").build();

    private static final UpdateNotebookInstanceRequestMarshaller instance = new UpdateNotebookInstanceRequestMarshaller();

    public static UpdateNotebookInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNotebookInstanceRequest updateNotebookInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNotebookInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getNotebookInstanceName(), NOTEBOOKINSTANCENAME_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getLifecycleConfigName(), LIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getDisassociateLifecycleConfig(), DISASSOCIATELIFECYCLECONFIG_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getVolumeSizeInGB(), VOLUMESIZEINGB_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getDefaultCodeRepository(), DEFAULTCODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getAdditionalCodeRepositories(), ADDITIONALCODEREPOSITORIES_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getAcceleratorTypes(), ACCELERATORTYPES_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getDisassociateAcceleratorTypes(), DISASSOCIATEACCELERATORTYPES_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getDisassociateDefaultCodeRepository(), DISASSOCIATEDEFAULTCODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getDisassociateAdditionalCodeRepositories(),
                    DISASSOCIATEADDITIONALCODEREPOSITORIES_BINDING);
            protocolMarshaller.marshall(updateNotebookInstanceRequest.getRootAccess(), ROOTACCESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
