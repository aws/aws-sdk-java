/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CheckCertificateRevocationStatusActionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CheckCertificateRevocationStatusActionsMarshaller {

    private static final MarshallingInfo<String> REVOKEDSTATUSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevokedStatusAction").build();
    private static final MarshallingInfo<String> UNKNOWNSTATUSACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnknownStatusAction").build();

    private static final CheckCertificateRevocationStatusActionsMarshaller instance = new CheckCertificateRevocationStatusActionsMarshaller();

    public static CheckCertificateRevocationStatusActionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CheckCertificateRevocationStatusActions checkCertificateRevocationStatusActions, ProtocolMarshaller protocolMarshaller) {

        if (checkCertificateRevocationStatusActions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(checkCertificateRevocationStatusActions.getRevokedStatusAction(), REVOKEDSTATUSACTION_BINDING);
            protocolMarshaller.marshall(checkCertificateRevocationStatusActions.getUnknownStatusAction(), UNKNOWNSTATUSACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
