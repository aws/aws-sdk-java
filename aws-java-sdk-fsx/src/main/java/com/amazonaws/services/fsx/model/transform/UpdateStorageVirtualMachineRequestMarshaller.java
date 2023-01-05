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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateStorageVirtualMachineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateStorageVirtualMachineRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIVEDIRECTORYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDirectoryConfiguration").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> STORAGEVIRTUALMACHINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageVirtualMachineId").build();
    private static final MarshallingInfo<String> SVMADMINPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SvmAdminPassword").build();

    private static final UpdateStorageVirtualMachineRequestMarshaller instance = new UpdateStorageVirtualMachineRequestMarshaller();

    public static UpdateStorageVirtualMachineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateStorageVirtualMachineRequest updateStorageVirtualMachineRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateStorageVirtualMachineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateStorageVirtualMachineRequest.getActiveDirectoryConfiguration(), ACTIVEDIRECTORYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateStorageVirtualMachineRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(updateStorageVirtualMachineRequest.getStorageVirtualMachineId(), STORAGEVIRTUALMACHINEID_BINDING);
            protocolMarshaller.marshall(updateStorageVirtualMachineRequest.getSvmAdminPassword(), SVMADMINPASSWORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
