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
package com.amazonaws.services.forecast.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WhatIfAnalysisSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WhatIfAnalysisSummaryMarshaller {

    private static final MarshallingInfo<String> WHATIFANALYSISARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfAnalysisArn").build();
    private static final MarshallingInfo<String> WHATIFANALYSISNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WhatIfAnalysisName").build();
    private static final MarshallingInfo<String> FORECASTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModificationTime").timestampFormat("unixTimestamp").build();

    private static final WhatIfAnalysisSummaryMarshaller instance = new WhatIfAnalysisSummaryMarshaller();

    public static WhatIfAnalysisSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WhatIfAnalysisSummary whatIfAnalysisSummary, ProtocolMarshaller protocolMarshaller) {

        if (whatIfAnalysisSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(whatIfAnalysisSummary.getWhatIfAnalysisArn(), WHATIFANALYSISARN_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getWhatIfAnalysisName(), WHATIFANALYSISNAME_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getForecastArn(), FORECASTARN_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(whatIfAnalysisSummary.getLastModificationTime(), LASTMODIFICATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
