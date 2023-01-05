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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStudioLifecycleConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStudioLifecycleConfigRequestMarshaller {

    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigName").build();
    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigContent").build();
    private static final MarshallingInfo<String> STUDIOLIFECYCLECONFIGAPPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StudioLifecycleConfigAppType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateStudioLifecycleConfigRequestMarshaller instance = new CreateStudioLifecycleConfigRequestMarshaller();

    public static CreateStudioLifecycleConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStudioLifecycleConfigRequest createStudioLifecycleConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStudioLifecycleConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStudioLifecycleConfigRequest.getStudioLifecycleConfigName(), STUDIOLIFECYCLECONFIGNAME_BINDING);
            protocolMarshaller.marshall(createStudioLifecycleConfigRequest.getStudioLifecycleConfigContent(), STUDIOLIFECYCLECONFIGCONTENT_BINDING);
            protocolMarshaller.marshall(createStudioLifecycleConfigRequest.getStudioLifecycleConfigAppType(), STUDIOLIFECYCLECONFIGAPPTYPE_BINDING);
            protocolMarshaller.marshall(createStudioLifecycleConfigRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
