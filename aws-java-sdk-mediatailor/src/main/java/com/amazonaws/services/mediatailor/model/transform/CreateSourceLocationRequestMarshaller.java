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
package com.amazonaws.services.mediatailor.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSourceLocationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSourceLocationRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCESSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTSEGMENTDELIVERYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSegmentDeliveryConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HTTPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HttpConfiguration").build();
    private static final MarshallingInfo<String> SOURCELOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("sourceLocationName").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateSourceLocationRequestMarshaller instance = new CreateSourceLocationRequestMarshaller();

    public static CreateSourceLocationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSourceLocationRequest createSourceLocationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSourceLocationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSourceLocationRequest.getAccessConfiguration(), ACCESSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createSourceLocationRequest.getDefaultSegmentDeliveryConfiguration(), DEFAULTSEGMENTDELIVERYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createSourceLocationRequest.getHttpConfiguration(), HTTPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createSourceLocationRequest.getSourceLocationName(), SOURCELOCATIONNAME_BINDING);
            protocolMarshaller.marshall(createSourceLocationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
