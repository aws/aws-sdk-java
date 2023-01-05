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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListCheckDetailsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCheckDetailsRequestMarshaller {

    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> LENSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LensArn").build();
    private static final MarshallingInfo<String> PILLARID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PillarId").build();
    private static final MarshallingInfo<String> QUESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuestionId").build();
    private static final MarshallingInfo<String> CHOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChoiceId").build();

    private static final ListCheckDetailsRequestMarshaller instance = new ListCheckDetailsRequestMarshaller();

    public static ListCheckDetailsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCheckDetailsRequest listCheckDetailsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listCheckDetailsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCheckDetailsRequest.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getLensArn(), LENSARN_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getPillarId(), PILLARID_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getQuestionId(), QUESTIONID_BINDING);
            protocolMarshaller.marshall(listCheckDetailsRequest.getChoiceId(), CHOICEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
