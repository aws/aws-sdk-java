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
package com.amazonaws.services.backupgateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backupgateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutHypervisorPropertyMappingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutHypervisorPropertyMappingsRequestMarshaller {

    private static final MarshallingInfo<String> HYPERVISORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HypervisorArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<List> VMWARETOAWSTAGMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VmwareToAwsTagMappings").build();

    private static final PutHypervisorPropertyMappingsRequestMarshaller instance = new PutHypervisorPropertyMappingsRequestMarshaller();

    public static PutHypervisorPropertyMappingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutHypervisorPropertyMappingsRequest putHypervisorPropertyMappingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (putHypervisorPropertyMappingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putHypervisorPropertyMappingsRequest.getHypervisorArn(), HYPERVISORARN_BINDING);
            protocolMarshaller.marshall(putHypervisorPropertyMappingsRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(putHypervisorPropertyMappingsRequest.getVmwareToAwsTagMappings(), VMWARETOAWSTAGMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
