/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.serverlessapplicationrepository.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCloudFormationChangeSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCloudFormationChangeSetRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<List> PARAMETEROVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterOverrides").build();
    private static final MarshallingInfo<String> SEMANTICVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("semanticVersion").build();
    private static final MarshallingInfo<String> STACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stackName").build();

    private static final CreateCloudFormationChangeSetRequestMarshaller instance = new CreateCloudFormationChangeSetRequestMarshaller();

    public static CreateCloudFormationChangeSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCloudFormationChangeSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCloudFormationChangeSetRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(createCloudFormationChangeSetRequest.getParameterOverrides(), PARAMETEROVERRIDES_BINDING);
            protocolMarshaller.marshall(createCloudFormationChangeSetRequest.getSemanticVersion(), SEMANTICVERSION_BINDING);
            protocolMarshaller.marshall(createCloudFormationChangeSetRequest.getStackName(), STACKNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
