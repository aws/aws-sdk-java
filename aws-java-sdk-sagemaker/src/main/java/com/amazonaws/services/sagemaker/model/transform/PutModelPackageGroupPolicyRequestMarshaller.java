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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutModelPackageGroupPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutModelPackageGroupPolicyRequestMarshaller {

    private static final MarshallingInfo<String> MODELPACKAGEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageGroupName").build();
    private static final MarshallingInfo<String> RESOURCEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcePolicy").build();

    private static final PutModelPackageGroupPolicyRequestMarshaller instance = new PutModelPackageGroupPolicyRequestMarshaller();

    public static PutModelPackageGroupPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutModelPackageGroupPolicyRequest putModelPackageGroupPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putModelPackageGroupPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putModelPackageGroupPolicyRequest.getModelPackageGroupName(), MODELPACKAGEGROUPNAME_BINDING);
            protocolMarshaller.marshall(putModelPackageGroupPolicyRequest.getResourcePolicy(), RESOURCEPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
