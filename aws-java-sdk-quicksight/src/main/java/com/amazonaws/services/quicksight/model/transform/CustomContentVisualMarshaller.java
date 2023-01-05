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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomContentVisualMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomContentVisualMarshaller {

    private static final MarshallingInfo<String> VISUALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VisualId").build();
    private static final MarshallingInfo<StructuredPojo> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Title").build();
    private static final MarshallingInfo<StructuredPojo> SUBTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subtitle").build();
    private static final MarshallingInfo<StructuredPojo> CHARTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChartConfiguration").build();
    private static final MarshallingInfo<List> ACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Actions").build();
    private static final MarshallingInfo<String> DATASETIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSetIdentifier").build();

    private static final CustomContentVisualMarshaller instance = new CustomContentVisualMarshaller();

    public static CustomContentVisualMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomContentVisual customContentVisual, ProtocolMarshaller protocolMarshaller) {

        if (customContentVisual == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customContentVisual.getVisualId(), VISUALID_BINDING);
            protocolMarshaller.marshall(customContentVisual.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(customContentVisual.getSubtitle(), SUBTITLE_BINDING);
            protocolMarshaller.marshall(customContentVisual.getChartConfiguration(), CHARTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(customContentVisual.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(customContentVisual.getDataSetIdentifier(), DATASETIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
