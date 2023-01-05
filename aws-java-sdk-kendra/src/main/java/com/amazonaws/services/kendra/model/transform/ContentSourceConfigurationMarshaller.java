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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContentSourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContentSourceConfigurationMarshaller {

    private static final MarshallingInfo<List> DATASOURCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSourceIds").build();
    private static final MarshallingInfo<List> FAQIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FaqIds").build();
    private static final MarshallingInfo<Boolean> DIRECTPUTCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectPutContent").build();

    private static final ContentSourceConfigurationMarshaller instance = new ContentSourceConfigurationMarshaller();

    public static ContentSourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContentSourceConfiguration contentSourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (contentSourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contentSourceConfiguration.getDataSourceIds(), DATASOURCEIDS_BINDING);
            protocolMarshaller.marshall(contentSourceConfiguration.getFaqIds(), FAQIDS_BINDING);
            protocolMarshaller.marshall(contentSourceConfiguration.getDirectPutContent(), DIRECTPUTCONTENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
