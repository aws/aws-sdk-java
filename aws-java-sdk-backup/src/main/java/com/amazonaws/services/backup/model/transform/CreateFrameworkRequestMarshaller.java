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
package com.amazonaws.services.backup.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFrameworkRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFrameworkRequestMarshaller {

    private static final MarshallingInfo<String> FRAMEWORKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkName").build();
    private static final MarshallingInfo<String> FRAMEWORKDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkDescription").build();
    private static final MarshallingInfo<List> FRAMEWORKCONTROLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkControls").build();
    private static final MarshallingInfo<String> IDEMPOTENCYTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdempotencyToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> FRAMEWORKTAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FrameworkTags").build();

    private static final CreateFrameworkRequestMarshaller instance = new CreateFrameworkRequestMarshaller();

    public static CreateFrameworkRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFrameworkRequest createFrameworkRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFrameworkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFrameworkRequest.getFrameworkName(), FRAMEWORKNAME_BINDING);
            protocolMarshaller.marshall(createFrameworkRequest.getFrameworkDescription(), FRAMEWORKDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFrameworkRequest.getFrameworkControls(), FRAMEWORKCONTROLS_BINDING);
            protocolMarshaller.marshall(createFrameworkRequest.getIdempotencyToken(), IDEMPOTENCYTOKEN_BINDING);
            protocolMarshaller.marshall(createFrameworkRequest.getFrameworkTags(), FRAMEWORKTAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
