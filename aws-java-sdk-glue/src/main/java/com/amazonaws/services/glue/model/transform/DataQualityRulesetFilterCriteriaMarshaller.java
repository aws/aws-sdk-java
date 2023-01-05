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
 * DataQualityRulesetFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataQualityRulesetFilterCriteriaMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> CREATEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TARGETTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetTable").build();

    private static final DataQualityRulesetFilterCriteriaMarshaller instance = new DataQualityRulesetFilterCriteriaMarshaller();

    public static DataQualityRulesetFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataQualityRulesetFilterCriteria dataQualityRulesetFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (dataQualityRulesetFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getName(), NAME_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getCreatedBefore(), CREATEDBEFORE_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getCreatedAfter(), CREATEDAFTER_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getLastModifiedBefore(), LASTMODIFIEDBEFORE_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getLastModifiedAfter(), LASTMODIFIEDAFTER_BINDING);
            protocolMarshaller.marshall(dataQualityRulesetFilterCriteria.getTargetTable(), TARGETTABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
