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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataQualityResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityResultMarshaller {

    private static final MarshallingInfo<String> RESULTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResultId").build();
    private static final MarshallingInfo<Double> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Score").build();
    private static final MarshallingInfo<StructuredPojo> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<String> RULESETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RulesetName").build();
    private static final MarshallingInfo<String> EVALUATIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationContext").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> JOBRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobRunId").build();
    private static final MarshallingInfo<String> RULESETEVALUATIONRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RulesetEvaluationRunId").build();
    private static final MarshallingInfo<List> RULERESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleResults").build();

    private static final DataQualityResultMarshaller instance = new DataQualityResultMarshaller();

    public static DataQualityResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityResult dataQualityResult, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityResult.getResultId(), RESULTID_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getScore(), SCORE_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getRulesetName(), RULESETNAME_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getEvaluationContext(), EVALUATIONCONTEXT_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getCompletedOn(), COMPLETEDON_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getJobRunId(), JOBRUNID_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getRulesetEvaluationRunId(), RULESETEVALUATIONRUNID_BINDING);
            protocolMarshaller.marshall(dataQualityResult.getRuleResults(), RULERESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
