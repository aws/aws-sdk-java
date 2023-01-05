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
 * WordCloudVisualMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WordCloudVisualMarshaller {

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
    private static final MarshallingInfo<List> COLUMNHIERARCHIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnHierarchies").build();

    private static final WordCloudVisualMarshaller instance = new WordCloudVisualMarshaller();

    public static WordCloudVisualMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WordCloudVisual wordCloudVisual, ProtocolMarshaller protocolMarshaller) {

        if (wordCloudVisual == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wordCloudVisual.getVisualId(), VISUALID_BINDING);
            protocolMarshaller.marshall(wordCloudVisual.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(wordCloudVisual.getSubtitle(), SUBTITLE_BINDING);
            protocolMarshaller.marshall(wordCloudVisual.getChartConfiguration(), CHARTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(wordCloudVisual.getActions(), ACTIONS_BINDING);
            protocolMarshaller.marshall(wordCloudVisual.getColumnHierarchies(), COLUMNHIERARCHIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
