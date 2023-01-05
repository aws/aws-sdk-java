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
package com.amazonaws.services.codebuild.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateProjectVisibilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProjectVisibilityRequestMarshaller {

    private static final MarshallingInfo<String> PROJECTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectArn").build();
    private static final MarshallingInfo<String> PROJECTVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectVisibility").build();
    private static final MarshallingInfo<String> RESOURCEACCESSROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceAccessRole").build();

    private static final UpdateProjectVisibilityRequestMarshaller instance = new UpdateProjectVisibilityRequestMarshaller();

    public static UpdateProjectVisibilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProjectVisibilityRequest updateProjectVisibilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProjectVisibilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProjectVisibilityRequest.getProjectArn(), PROJECTARN_BINDING);
            protocolMarshaller.marshall(updateProjectVisibilityRequest.getProjectVisibility(), PROJECTVISIBILITY_BINDING);
            protocolMarshaller.marshall(updateProjectVisibilityRequest.getResourceAccessRole(), RESOURCEACCESSROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
