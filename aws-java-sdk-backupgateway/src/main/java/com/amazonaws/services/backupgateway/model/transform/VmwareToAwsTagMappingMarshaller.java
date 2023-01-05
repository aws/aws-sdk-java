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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backupgateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VmwareToAwsTagMappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VmwareToAwsTagMappingMarshaller {

    private static final MarshallingInfo<String> AWSTAGKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AwsTagKey").build();
    private static final MarshallingInfo<String> AWSTAGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsTagValue").build();
    private static final MarshallingInfo<String> VMWARECATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VmwareCategory").build();
    private static final MarshallingInfo<String> VMWARETAGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VmwareTagName").build();

    private static final VmwareToAwsTagMappingMarshaller instance = new VmwareToAwsTagMappingMarshaller();

    public static VmwareToAwsTagMappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VmwareToAwsTagMapping vmwareToAwsTagMapping, ProtocolMarshaller protocolMarshaller) {

        if (vmwareToAwsTagMapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vmwareToAwsTagMapping.getAwsTagKey(), AWSTAGKEY_BINDING);
            protocolMarshaller.marshall(vmwareToAwsTagMapping.getAwsTagValue(), AWSTAGVALUE_BINDING);
            protocolMarshaller.marshall(vmwareToAwsTagMapping.getVmwareCategory(), VMWARECATEGORY_BINDING);
            protocolMarshaller.marshall(vmwareToAwsTagMapping.getVmwareTagName(), VMWARETAGNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
