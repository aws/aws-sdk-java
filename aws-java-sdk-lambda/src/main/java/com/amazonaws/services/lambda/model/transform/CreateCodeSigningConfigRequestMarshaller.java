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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCodeSigningConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCodeSigningConfigRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> ALLOWEDPUBLISHERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedPublishers").build();
    private static final MarshallingInfo<StructuredPojo> CODESIGNINGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CodeSigningPolicies").build();

    private static final CreateCodeSigningConfigRequestMarshaller instance = new CreateCodeSigningConfigRequestMarshaller();

    public static CreateCodeSigningConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCodeSigningConfigRequest createCodeSigningConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCodeSigningConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCodeSigningConfigRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createCodeSigningConfigRequest.getAllowedPublishers(), ALLOWEDPUBLISHERS_BINDING);
            protocolMarshaller.marshall(createCodeSigningConfigRequest.getCodeSigningPolicies(), CODESIGNINGPOLICIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
