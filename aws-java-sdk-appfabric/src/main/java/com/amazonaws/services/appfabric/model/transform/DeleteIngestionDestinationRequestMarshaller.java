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
package com.amazonaws.services.appfabric.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appfabric.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteIngestionDestinationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteIngestionDestinationRequestMarshaller {

    private static final MarshallingInfo<String> APPBUNDLEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appBundleIdentifier").build();
    private static final MarshallingInfo<String> INGESTIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ingestionIdentifier").build();
    private static final MarshallingInfo<String> INGESTIONDESTINATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ingestionDestinationIdentifier").build();

    private static final DeleteIngestionDestinationRequestMarshaller instance = new DeleteIngestionDestinationRequestMarshaller();

    public static DeleteIngestionDestinationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteIngestionDestinationRequest deleteIngestionDestinationRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteIngestionDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteIngestionDestinationRequest.getAppBundleIdentifier(), APPBUNDLEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(deleteIngestionDestinationRequest.getIngestionIdentifier(), INGESTIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(deleteIngestionDestinationRequest.getIngestionDestinationIdentifier(), INGESTIONDESTINATIONIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
