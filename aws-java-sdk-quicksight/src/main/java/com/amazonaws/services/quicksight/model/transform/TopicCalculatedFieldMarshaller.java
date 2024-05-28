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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopicCalculatedFieldMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopicCalculatedFieldMarshaller {

    private static final MarshallingInfo<String> CALCULATEDFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedFieldName").build();
    private static final MarshallingInfo<String> CALCULATEDFIELDDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedFieldDescription").build();
    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Expression").build();
    private static final MarshallingInfo<List> CALCULATEDFIELDSYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedFieldSynonyms").build();
    private static final MarshallingInfo<Boolean> ISINCLUDEDINTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsIncludedInTopic").build();
    private static final MarshallingInfo<Boolean> DISABLEINDEXING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableIndexing").build();
    private static final MarshallingInfo<String> COLUMNDATAROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnDataRole").build();
    private static final MarshallingInfo<String> TIMEGRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeGranularity").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTFORMATTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultFormatting").build();
    private static final MarshallingInfo<String> AGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Aggregation").build();
    private static final MarshallingInfo<StructuredPojo> COMPARATIVEORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComparativeOrder").build();
    private static final MarshallingInfo<StructuredPojo> SEMANTICTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SemanticType").build();
    private static final MarshallingInfo<List> ALLOWEDAGGREGATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedAggregations").build();
    private static final MarshallingInfo<List> NOTALLOWEDAGGREGATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotAllowedAggregations").build();
    private static final MarshallingInfo<Boolean> NEVERAGGREGATEINFILTER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NeverAggregateInFilter").build();
    private static final MarshallingInfo<List> CELLVALUESYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CellValueSynonyms").build();
    private static final MarshallingInfo<Boolean> NONADDITIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonAdditive").build();

    private static final TopicCalculatedFieldMarshaller instance = new TopicCalculatedFieldMarshaller();

    public static TopicCalculatedFieldMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopicCalculatedField topicCalculatedField, ProtocolMarshaller protocolMarshaller) {

        if (topicCalculatedField == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topicCalculatedField.getCalculatedFieldName(), CALCULATEDFIELDNAME_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getCalculatedFieldDescription(), CALCULATEDFIELDDESCRIPTION_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getExpression(), EXPRESSION_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getCalculatedFieldSynonyms(), CALCULATEDFIELDSYNONYMS_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getIsIncludedInTopic(), ISINCLUDEDINTOPIC_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getDisableIndexing(), DISABLEINDEXING_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getColumnDataRole(), COLUMNDATAROLE_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getTimeGranularity(), TIMEGRANULARITY_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getDefaultFormatting(), DEFAULTFORMATTING_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getAggregation(), AGGREGATION_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getComparativeOrder(), COMPARATIVEORDER_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getSemanticType(), SEMANTICTYPE_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getAllowedAggregations(), ALLOWEDAGGREGATIONS_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getNotAllowedAggregations(), NOTALLOWEDAGGREGATIONS_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getNeverAggregateInFilter(), NEVERAGGREGATEINFILTER_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getCellValueSynonyms(), CELLVALUESYNONYMS_BINDING);
            protocolMarshaller.marshall(topicCalculatedField.getNonAdditive(), NONADDITIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
