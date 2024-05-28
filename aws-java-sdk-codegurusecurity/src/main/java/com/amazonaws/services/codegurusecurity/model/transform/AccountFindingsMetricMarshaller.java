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
package com.amazonaws.services.codegurusecurity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codegurusecurity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountFindingsMetricMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountFindingsMetricMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOSEDFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("closedFindings").build();
    private static final MarshallingInfo<java.util.Date> DATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("date").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> MEANTIMETOCLOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("meanTimeToClose").build();
    private static final MarshallingInfo<StructuredPojo> NEWFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newFindings").build();
    private static final MarshallingInfo<StructuredPojo> OPENFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openFindings").build();

    private static final AccountFindingsMetricMarshaller instance = new AccountFindingsMetricMarshaller();

    public static AccountFindingsMetricMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountFindingsMetric accountFindingsMetric, ProtocolMarshaller protocolMarshaller) {

        if (accountFindingsMetric == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountFindingsMetric.getClosedFindings(), CLOSEDFINDINGS_BINDING);
            protocolMarshaller.marshall(accountFindingsMetric.getDate(), DATE_BINDING);
            protocolMarshaller.marshall(accountFindingsMetric.getMeanTimeToClose(), MEANTIMETOCLOSE_BINDING);
            protocolMarshaller.marshall(accountFindingsMetric.getNewFindings(), NEWFINDINGS_BINDING);
            protocolMarshaller.marshall(accountFindingsMetric.getOpenFindings(), OPENFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
