/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TerminateProvisionedProductRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TerminateProvisionedProductRequestMarshaller {

    private static final MarshallingInfo<String> PROVISIONEDPRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductName").build();
    private static final MarshallingInfo<String> PROVISIONEDPRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedProductId").build();
    private static final MarshallingInfo<String> TERMINATETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminateToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Boolean> IGNOREERRORS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IgnoreErrors").build();
    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();

    private static final TerminateProvisionedProductRequestMarshaller instance = new TerminateProvisionedProductRequestMarshaller();

    public static TerminateProvisionedProductRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TerminateProvisionedProductRequest terminateProvisionedProductRequest, ProtocolMarshaller protocolMarshaller) {

        if (terminateProvisionedProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(terminateProvisionedProductRequest.getProvisionedProductName(), PROVISIONEDPRODUCTNAME_BINDING);
            protocolMarshaller.marshall(terminateProvisionedProductRequest.getProvisionedProductId(), PROVISIONEDPRODUCTID_BINDING);
            protocolMarshaller.marshall(terminateProvisionedProductRequest.getTerminateToken(), TERMINATETOKEN_BINDING);
            protocolMarshaller.marshall(terminateProvisionedProductRequest.getIgnoreErrors(), IGNOREERRORS_BINDING);
            protocolMarshaller.marshall(terminateProvisionedProductRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
