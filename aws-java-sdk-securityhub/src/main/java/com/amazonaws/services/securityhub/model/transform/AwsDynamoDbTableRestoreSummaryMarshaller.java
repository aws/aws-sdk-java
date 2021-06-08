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
 * AwsDynamoDbTableRestoreSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableRestoreSummaryMarshaller {

    private static final MarshallingInfo<String> SOURCEBACKUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceBackupArn").build();
    private static final MarshallingInfo<String> SOURCETABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceTableArn").build();
    private static final MarshallingInfo<String> RESTOREDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreDateTime").build();
    private static final MarshallingInfo<Boolean> RESTOREINPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreInProgress").build();

    private static final AwsDynamoDbTableRestoreSummaryMarshaller instance = new AwsDynamoDbTableRestoreSummaryMarshaller();

    public static AwsDynamoDbTableRestoreSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableRestoreSummary awsDynamoDbTableRestoreSummary, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableRestoreSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableRestoreSummary.getSourceBackupArn(), SOURCEBACKUPARN_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableRestoreSummary.getSourceTableArn(), SOURCETABLEARN_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableRestoreSummary.getRestoreDateTime(), RESTOREDATETIME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableRestoreSummary.getRestoreInProgress(), RESTOREINPROGRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
