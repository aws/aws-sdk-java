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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BehaviorModelTrainingSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BehaviorModelTrainingSummaryMarshaller {

    private static final MarshallingInfo<String> SECURITYPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityProfileName").build();
    private static final MarshallingInfo<String> BEHAVIORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("behaviorName").build();
    private static final MarshallingInfo<java.util.Date> TRAININGDATACOLLECTIONSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataCollectionStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MODELSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelStatus").build();
    private static final MarshallingInfo<Double> DATAPOINTSCOLLECTIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datapointsCollectionPercentage").build();
    private static final MarshallingInfo<java.util.Date> LASTMODELREFRESHDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModelRefreshDate").timestampFormat("unixTimestamp").build();

    private static final BehaviorModelTrainingSummaryMarshaller instance = new BehaviorModelTrainingSummaryMarshaller();

    public static BehaviorModelTrainingSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BehaviorModelTrainingSummary behaviorModelTrainingSummary, ProtocolMarshaller protocolMarshaller) {

        if (behaviorModelTrainingSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getSecurityProfileName(), SECURITYPROFILENAME_BINDING);
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getBehaviorName(), BEHAVIORNAME_BINDING);
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getTrainingDataCollectionStartDate(), TRAININGDATACOLLECTIONSTARTDATE_BINDING);
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getModelStatus(), MODELSTATUS_BINDING);
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getDatapointsCollectionPercentage(), DATAPOINTSCOLLECTIONPERCENTAGE_BINDING);
            protocolMarshaller.marshall(behaviorModelTrainingSummary.getLastModelRefreshDate(), LASTMODELREFRESHDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
