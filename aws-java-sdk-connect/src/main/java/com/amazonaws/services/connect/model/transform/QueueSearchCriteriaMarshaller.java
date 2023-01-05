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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueueSearchCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueueSearchCriteriaMarshaller {

    private static final MarshallingInfo<List> ORCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrConditions").build();
    private static final MarshallingInfo<List> ANDCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AndConditions").build();
    private static final MarshallingInfo<StructuredPojo> STRINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringCondition").build();
    private static final MarshallingInfo<String> QUEUETYPECONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueTypeCondition").build();

    private static final QueueSearchCriteriaMarshaller instance = new QueueSearchCriteriaMarshaller();

    public static QueueSearchCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueueSearchCriteria queueSearchCriteria, ProtocolMarshaller protocolMarshaller) {

        if (queueSearchCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queueSearchCriteria.getOrConditions(), ORCONDITIONS_BINDING);
            protocolMarshaller.marshall(queueSearchCriteria.getAndConditions(), ANDCONDITIONS_BINDING);
            protocolMarshaller.marshall(queueSearchCriteria.getStringCondition(), STRINGCONDITION_BINDING);
            protocolMarshaller.marshall(queueSearchCriteria.getQueueTypeCondition(), QUEUETYPECONDITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
