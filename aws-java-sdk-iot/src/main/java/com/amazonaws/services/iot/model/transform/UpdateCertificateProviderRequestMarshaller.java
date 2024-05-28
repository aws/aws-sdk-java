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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateCertificateProviderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateCertificateProviderRequestMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("certificateProviderName").build();
    private static final MarshallingInfo<String> LAMBDAFUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionArn").build();
    private static final MarshallingInfo<List> ACCOUNTDEFAULTFOROPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountDefaultForOperations").build();

    private static final UpdateCertificateProviderRequestMarshaller instance = new UpdateCertificateProviderRequestMarshaller();

    public static UpdateCertificateProviderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateCertificateProviderRequest updateCertificateProviderRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateCertificateProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateCertificateProviderRequest.getCertificateProviderName(), CERTIFICATEPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(updateCertificateProviderRequest.getLambdaFunctionArn(), LAMBDAFUNCTIONARN_BINDING);
            protocolMarshaller.marshall(updateCertificateProviderRequest.getAccountDefaultForOperations(), ACCOUNTDEFAULTFOROPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
