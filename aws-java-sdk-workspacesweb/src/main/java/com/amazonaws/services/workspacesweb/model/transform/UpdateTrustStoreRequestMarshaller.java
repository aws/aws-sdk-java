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
package com.amazonaws.services.workspacesweb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTrustStoreRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTrustStoreRequestMarshaller {

    private static final MarshallingInfo<List> CERTIFICATESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificatesToAdd").build();
    private static final MarshallingInfo<List> CERTIFICATESTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificatesToDelete").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> TRUSTSTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.GREEDY_PATH).marshallLocationName("trustStoreArn").build();

    private static final UpdateTrustStoreRequestMarshaller instance = new UpdateTrustStoreRequestMarshaller();

    public static UpdateTrustStoreRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTrustStoreRequest updateTrustStoreRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTrustStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTrustStoreRequest.getCertificatesToAdd(), CERTIFICATESTOADD_BINDING);
            protocolMarshaller.marshall(updateTrustStoreRequest.getCertificatesToDelete(), CERTIFICATESTODELETE_BINDING);
            protocolMarshaller.marshall(updateTrustStoreRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateTrustStoreRequest.getTrustStoreArn(), TRUSTSTOREARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
