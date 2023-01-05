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
 * DataQualityRulesetListDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityRulesetListDetailsMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TARGETTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTable").build();
    private static final MarshallingInfo<String> RECOMMENDATIONRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationRunId").build();
    private static final MarshallingInfo<Integer> RULECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleCount").build();

    private static final DataQualityRulesetListDetailsMarshaller instance = new DataQualityRulesetListDetailsMarshaller();

    public static DataQualityRulesetListDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityRulesetListDetails dataQualityRulesetListDetails, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityRulesetListDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getCreatedOn(), CREATEDON_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getLastModifiedOn(), LASTMODIFIEDON_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getTargetTable(), TARGETTABLE_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getRecommendationRunId(), RECOMMENDATIONRUNID_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetListDetails.getRuleCount(), RULECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
