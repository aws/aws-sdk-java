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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecurityGroupRemediationActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecurityGroupRemediationActionMarshaller {

    private static final MarshallingInfo<String> REMEDIATIONACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationActionType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> REMEDIATIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemediationResult").build();
    private static final MarshallingInfo<Boolean> ISDEFAULTACTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsDefaultAction").build();

    private static final SecurityGroupRemediationActionMarshaller instance = new SecurityGroupRemediationActionMarshaller();

    public static SecurityGroupRemediationActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecurityGroupRemediationAction securityGroupRemediationAction, ProtocolMarshaller protocolMarshaller) {

        if (securityGroupRemediationAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(securityGroupRemediationAction.getRemediationActionType(), REMEDIATIONACTIONTYPE_BINDING);
            protocolMarshaller.marshall(securityGroupRemediationAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(securityGroupRemediationAction.getRemediationResult(), REMEDIATIONRESULT_BINDING);
            protocolMarshaller.marshall(securityGroupRemediationAction.getIsDefaultAction(), ISDEFAULTACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
