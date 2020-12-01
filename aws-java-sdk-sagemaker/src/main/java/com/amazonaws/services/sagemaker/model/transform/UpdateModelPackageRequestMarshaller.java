/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UpdateModelPackageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateModelPackageRequestMarshaller {

    private static final MarshallingInfo<String> MODELPACKAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageArn").build();
    private static final MarshallingInfo<String> MODELAPPROVALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelApprovalStatus").build();
    private static final MarshallingInfo<String> APPROVALDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalDescription").build();

    private static final UpdateModelPackageRequestMarshaller instance = new UpdateModelPackageRequestMarshaller();

    public static UpdateModelPackageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateModelPackageRequest updateModelPackageRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateModelPackageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateModelPackageRequest.getModelPackageArn(), MODELPACKAGEARN_BINDING);
            protocolMarshaller.marshall(updateModelPackageRequest.getModelApprovalStatus(), MODELAPPROVALSTATUS_BINDING);
            protocolMarshaller.marshall(updateModelPackageRequest.getApprovalDescription(), APPROVALDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
