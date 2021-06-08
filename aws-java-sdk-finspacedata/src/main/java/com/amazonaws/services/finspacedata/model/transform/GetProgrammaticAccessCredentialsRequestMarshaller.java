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
package com.amazonaws.services.finspacedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetProgrammaticAccessCredentialsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetProgrammaticAccessCredentialsRequestMarshaller {

    private static final MarshallingInfo<Long> DURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("durationInMinutes").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("environmentId").build();

    private static final GetProgrammaticAccessCredentialsRequestMarshaller instance = new GetProgrammaticAccessCredentialsRequestMarshaller();

    public static GetProgrammaticAccessCredentialsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getProgrammaticAccessCredentialsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getProgrammaticAccessCredentialsRequest.getDurationInMinutes(), DURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(getProgrammaticAccessCredentialsRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
