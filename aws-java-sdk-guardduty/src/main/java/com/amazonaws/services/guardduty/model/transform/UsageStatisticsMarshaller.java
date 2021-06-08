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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UsageStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UsageStatisticsMarshaller {

    private static final MarshallingInfo<List> SUMBYACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sumByAccount").build();
    private static final MarshallingInfo<List> SUMBYDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sumByDataSource").build();
    private static final MarshallingInfo<List> SUMBYRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sumByResource").build();
    private static final MarshallingInfo<List> TOPRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("topResources").build();

    private static final UsageStatisticsMarshaller instance = new UsageStatisticsMarshaller();

    public static UsageStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UsageStatistics usageStatistics, ProtocolMarshaller protocolMarshaller) {

        if (usageStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(usageStatistics.getSumByAccount(), SUMBYACCOUNT_BINDING);
            protocolMarshaller.marshall(usageStatistics.getSumByDataSource(), SUMBYDATASOURCE_BINDING);
            protocolMarshaller.marshall(usageStatistics.getSumByResource(), SUMBYRESOURCE_BINDING);
            protocolMarshaller.marshall(usageStatistics.getTopResources(), TOPRESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
