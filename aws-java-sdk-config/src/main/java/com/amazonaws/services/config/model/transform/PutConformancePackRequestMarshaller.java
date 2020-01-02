/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutConformancePackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutConformancePackRequestMarshaller {

    private static final MarshallingInfo<String> CONFORMANCEPACKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackName").build();
    private static final MarshallingInfo<String> TEMPLATES3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateS3Uri").build();
    private static final MarshallingInfo<String> TEMPLATEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateBody").build();
    private static final MarshallingInfo<String> DELIVERYS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3Bucket").build();
    private static final MarshallingInfo<String> DELIVERYS3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeliveryS3KeyPrefix").build();
    private static final MarshallingInfo<List> CONFORMANCEPACKINPUTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConformancePackInputParameters").build();

    private static final PutConformancePackRequestMarshaller instance = new PutConformancePackRequestMarshaller();

    public static PutConformancePackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutConformancePackRequest putConformancePackRequest, ProtocolMarshaller protocolMarshaller) {

        if (putConformancePackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putConformancePackRequest.getConformancePackName(), CONFORMANCEPACKNAME_BINDING);
            protocolMarshaller.marshall(putConformancePackRequest.getTemplateS3Uri(), TEMPLATES3URI_BINDING);
            protocolMarshaller.marshall(putConformancePackRequest.getTemplateBody(), TEMPLATEBODY_BINDING);
            protocolMarshaller.marshall(putConformancePackRequest.getDeliveryS3Bucket(), DELIVERYS3BUCKET_BINDING);
            protocolMarshaller.marshall(putConformancePackRequest.getDeliveryS3KeyPrefix(), DELIVERYS3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(putConformancePackRequest.getConformancePackInputParameters(), CONFORMANCEPACKINPUTPARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
