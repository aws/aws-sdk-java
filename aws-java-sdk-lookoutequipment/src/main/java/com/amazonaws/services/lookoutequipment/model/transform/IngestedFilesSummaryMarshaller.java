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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IngestedFilesSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IngestedFilesSummaryMarshaller {

    private static final MarshallingInfo<Integer> TOTALNUMBEROFFILES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfFiles").build();
    private static final MarshallingInfo<Integer> INGESTEDNUMBEROFFILES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngestedNumberOfFiles").build();
    private static final MarshallingInfo<List> DISCARDEDFILES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DiscardedFiles").build();

    private static final IngestedFilesSummaryMarshaller instance = new IngestedFilesSummaryMarshaller();

    public static IngestedFilesSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IngestedFilesSummary ingestedFilesSummary, ProtocolMarshaller protocolMarshaller) {

        if (ingestedFilesSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ingestedFilesSummary.getTotalNumberOfFiles(), TOTALNUMBEROFFILES_BINDING);
            protocolMarshaller.marshall(ingestedFilesSummary.getIngestedNumberOfFiles(), INGESTEDNUMBEROFFILES_BINDING);
            protocolMarshaller.marshall(ingestedFilesSummary.getDiscardedFiles(), DISCARDEDFILES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
