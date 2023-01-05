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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataQualityRulesetEvaluationRunDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityRulesetEvaluationRunDescriptionMarshaller {

    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RunId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();

    private static final DataQualityRulesetEvaluationRunDescriptionMarshaller instance = new DataQualityRulesetEvaluationRunDescriptionMarshaller();

    public static DataQualityRulesetEvaluationRunDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityRulesetEvaluationRunDescription dataQualityRulesetEvaluationRunDescription, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityRulesetEvaluationRunDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityRulesetEvaluationRunDescription.getRunId(), RUNID_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetEvaluationRunDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetEvaluationRunDescription.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetEvaluationRunDescription.getDataSource(), DATASOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
