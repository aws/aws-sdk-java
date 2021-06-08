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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsDynamoDbTableProvisionedThroughputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableProvisionedThroughputMarshaller {

    private static final MarshallingInfo<String> LASTDECREASEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastDecreaseDateTime").build();
    private static final MarshallingInfo<String> LASTINCREASEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastIncreaseDateTime").build();
    private static final MarshallingInfo<Integer> NUMBEROFDECREASESTODAY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDecreasesToday").build();
    private static final MarshallingInfo<Integer> READCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadCapacityUnits").build();
    private static final MarshallingInfo<Integer> WRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteCapacityUnits").build();

    private static final AwsDynamoDbTableProvisionedThroughputMarshaller instance = new AwsDynamoDbTableProvisionedThroughputMarshaller();

    public static AwsDynamoDbTableProvisionedThroughputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableProvisionedThroughput awsDynamoDbTableProvisionedThroughput, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableProvisionedThroughput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableProvisionedThroughput.getLastDecreaseDateTime(), LASTDECREASEDATETIME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableProvisionedThroughput.getLastIncreaseDateTime(), LASTINCREASEDATETIME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableProvisionedThroughput.getNumberOfDecreasesToday(), NUMBEROFDECREASESTODAY_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableProvisionedThroughput.getReadCapacityUnits(), READCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableProvisionedThroughput.getWriteCapacityUnits(), WRITECAPACITYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
