/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedThroughputDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedThroughputDescriptionMarshaller {

    private static final MarshallingInfo<java.util.Date> LASTINCREASEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastIncreaseDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTDECREASEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastDecreaseDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> NUMBEROFDECREASESTODAY_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDecreasesToday").build();
    private static final MarshallingInfo<Long> READCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadCapacityUnits").build();
    private static final MarshallingInfo<Long> WRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteCapacityUnits").build();

    private static final ProvisionedThroughputDescriptionMarshaller instance = new ProvisionedThroughputDescriptionMarshaller();

    public static ProvisionedThroughputDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedThroughputDescription provisionedThroughputDescription, ProtocolMarshaller protocolMarshaller) {

        if (provisionedThroughputDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedThroughputDescription.getLastIncreaseDateTime(), LASTINCREASEDATETIME_BINDING);
            protocolMarshaller.marshall(provisionedThroughputDescription.getLastDecreaseDateTime(), LASTDECREASEDATETIME_BINDING);
            protocolMarshaller.marshall(provisionedThroughputDescription.getNumberOfDecreasesToday(), NUMBEROFDECREASESTODAY_BINDING);
            protocolMarshaller.marshall(provisionedThroughputDescription.getReadCapacityUnits(), READCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(provisionedThroughputDescription.getWriteCapacityUnits(), WRITECAPACITYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
