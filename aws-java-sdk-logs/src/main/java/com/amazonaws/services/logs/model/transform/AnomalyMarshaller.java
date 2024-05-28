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
package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AnomalyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AnomalyMarshaller {

    private static final MarshallingInfo<String> ANOMALYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("anomalyId").build();
    private static final MarshallingInfo<String> PATTERNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("patternId").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyDetectorArn").build();
    private static final MarshallingInfo<String> PATTERNSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patternString").build();
    private static final MarshallingInfo<String> PATTERNREGEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patternRegex").build();
    private static final MarshallingInfo<String> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("priority").build();
    private static final MarshallingInfo<Long> FIRSTSEEN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("firstSeen").build();
    private static final MarshallingInfo<Long> LASTSEEN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lastSeen").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<Map> HISTOGRAM_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("histogram").build();
    private static final MarshallingInfo<List> LOGSAMPLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logSamples").build();
    private static final MarshallingInfo<List> PATTERNTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("patternTokens").build();
    private static final MarshallingInfo<List> LOGGROUPARNLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logGroupArnList").build();
    private static final MarshallingInfo<Boolean> SUPPRESSED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressed").build();
    private static final MarshallingInfo<Long> SUPPRESSEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressedDate").build();
    private static final MarshallingInfo<Long> SUPPRESSEDUNTIL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressedUntil").build();
    private static final MarshallingInfo<Boolean> ISPATTERNLEVELSUPPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isPatternLevelSuppression").build();

    private static final AnomalyMarshaller instance = new AnomalyMarshaller();

    public static AnomalyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Anomaly anomaly, ProtocolMarshaller protocolMarshaller) {

        if (anomaly == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(anomaly.getAnomalyId(), ANOMALYID_BINDING);
            protocolMarshaller.marshall(anomaly.getPatternId(), PATTERNID_BINDING);
            protocolMarshaller.marshall(anomaly.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(anomaly.getPatternString(), PATTERNSTRING_BINDING);
            protocolMarshaller.marshall(anomaly.getPatternRegex(), PATTERNREGEX_BINDING);
            protocolMarshaller.marshall(anomaly.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(anomaly.getFirstSeen(), FIRSTSEEN_BINDING);
            protocolMarshaller.marshall(anomaly.getLastSeen(), LASTSEEN_BINDING);
            protocolMarshaller.marshall(anomaly.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(anomaly.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(anomaly.getState(), STATE_BINDING);
            protocolMarshaller.marshall(anomaly.getHistogram(), HISTOGRAM_BINDING);
            protocolMarshaller.marshall(anomaly.getLogSamples(), LOGSAMPLES_BINDING);
            protocolMarshaller.marshall(anomaly.getPatternTokens(), PATTERNTOKENS_BINDING);
            protocolMarshaller.marshall(anomaly.getLogGroupArnList(), LOGGROUPARNLIST_BINDING);
            protocolMarshaller.marshall(anomaly.getSuppressed(), SUPPRESSED_BINDING);
            protocolMarshaller.marshall(anomaly.getSuppressedDate(), SUPPRESSEDDATE_BINDING);
            protocolMarshaller.marshall(anomaly.getSuppressedUntil(), SUPPRESSEDUNTIL_BINDING);
            protocolMarshaller.marshall(anomaly.getIsPatternLevelSuppression(), ISPATTERNLEVELSUPPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
