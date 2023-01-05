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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubrefactorspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UriPathRouteInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UriPathRouteInputMarshaller {

    private static final MarshallingInfo<String> ACTIVATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivationState").build();
    private static final MarshallingInfo<Boolean> INCLUDECHILDPATHS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeChildPaths").build();
    private static final MarshallingInfo<List> METHODS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Methods").build();
    private static final MarshallingInfo<String> SOURCEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourcePath").build();

    private static final UriPathRouteInputMarshaller instance = new UriPathRouteInputMarshaller();

    public static UriPathRouteInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UriPathRouteInput uriPathRouteInput, ProtocolMarshaller protocolMarshaller) {

        if (uriPathRouteInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(uriPathRouteInput.getActivationState(), ACTIVATIONSTATE_BINDING);
            protocolMarshaller.marshall(uriPathRouteInput.getIncludeChildPaths(), INCLUDECHILDPATHS_BINDING);
            protocolMarshaller.marshall(uriPathRouteInput.getMethods(), METHODS_BINDING);
            protocolMarshaller.marshall(uriPathRouteInput.getSourcePath(), SOURCEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
