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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateEvaluationFormRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateEvaluationFormRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("InstanceId").build();
    private static final MarshallingInfo<String> EVALUATIONFORMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EvaluationFormId").build();
    private static final MarshallingInfo<Integer> EVALUATIONFORMVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationFormVersion").build();
    private static final MarshallingInfo<Boolean> CREATENEWVERSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateNewVersion").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> ITEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Items").build();
    private static final MarshallingInfo<StructuredPojo> SCORINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScoringStrategy").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateEvaluationFormRequestMarshaller instance = new UpdateEvaluationFormRequestMarshaller();

    public static UpdateEvaluationFormRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateEvaluationFormRequest updateEvaluationFormRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateEvaluationFormRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateEvaluationFormRequest.getInstanceId(), INSTANCEID_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getEvaluationFormId(), EVALUATIONFORMID_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getEvaluationFormVersion(), EVALUATIONFORMVERSION_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getCreateNewVersion(), CREATENEWVERSION_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getItems(), ITEMS_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getScoringStrategy(), SCORINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(updateEvaluationFormRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
