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
package com.amazonaws.services.codeguruprofiler.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeguruprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutPermissionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutPermissionRequestMarshaller {

    private static final MarshallingInfo<String> ACTIONGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("actionGroup").build();
    private static final MarshallingInfo<List> PRINCIPALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("principals").build();
    private static final MarshallingInfo<String> PROFILINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("profilingGroupName").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revisionId").build();

    private static final PutPermissionRequestMarshaller instance = new PutPermissionRequestMarshaller();

    public static PutPermissionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutPermissionRequest putPermissionRequest, ProtocolMarshaller protocolMarshaller) {

        if (putPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putPermissionRequest.getActionGroup(), ACTIONGROUP_BINDING);
            protocolMarshaller.marshall(putPermissionRequest.getPrincipals(), PRINCIPALS_BINDING);
            protocolMarshaller.marshall(putPermissionRequest.getProfilingGroupName(), PROFILINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(putPermissionRequest.getRevisionId(), REVISIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
