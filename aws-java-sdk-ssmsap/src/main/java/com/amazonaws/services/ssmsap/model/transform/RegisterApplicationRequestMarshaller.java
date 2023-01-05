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
package com.amazonaws.services.ssmsap.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmsap.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterApplicationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> APPLICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationType").build();
    private static final MarshallingInfo<List> INSTANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Instances").build();
    private static final MarshallingInfo<String> SAPINSTANCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SapInstanceNumber").build();
    private static final MarshallingInfo<String> SID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sid").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<List> CREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Credentials").build();

    private static final RegisterApplicationRequestMarshaller instance = new RegisterApplicationRequestMarshaller();

    public static RegisterApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterApplicationRequest registerApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerApplicationRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getApplicationType(), APPLICATIONTYPE_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getInstances(), INSTANCES_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getSapInstanceNumber(), SAPINSTANCENUMBER_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getSid(), SID_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(registerApplicationRequest.getCredentials(), CREDENTIALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
