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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StudioLifecycleConfigDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StudioLifecycleConfigDetailsMarshaller {

    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigArn").build();
    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGAPPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigAppType").build();

    private static final StudioLifecycleConfigDetailsMarshaller instance = new StudioLifecycleConfigDetailsMarshaller();

    public static StudioLifecycleConfigDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StudioLifecycleConfigDetails studioLifecycleConfigDetails, ProtocolMarshaller protocolMarshaller) {

        if (studioLifecycleConfigDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(studioLifecycleConfigDetails.getStudioLifecycleConfigArn(), STUDIOLIFECYCLECONFIGARN_BINDING);
            protocolMarshaller.marshall(studioLifecycleConfigDetails.getStudioLifecycleConfigName(), STUDIOLIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(studioLifecycleConfigDetails.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(studioLifecycleConfigDetails.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(studioLifecycleConfigDetails.getStudioLifecycleConfigAppType(), STUDIOLIFECYCLECONFIGAPPTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
