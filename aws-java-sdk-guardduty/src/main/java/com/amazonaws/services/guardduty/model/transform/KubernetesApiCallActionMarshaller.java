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
package com.amazonaws.services.guardduty.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KubernetesApiCallActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KubernetesApiCallActionMarshaller {

    private static final MarshallingInfo<String> REQUESTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestUri").build();
    private static final MarshallingInfo<String> VERB_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("verb").build();
    private static final MarshallingInfo<List> SOURCEIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sourceIps").build();
    private static final MarshallingInfo<String> USERAGENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userAgent").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEIPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteIpDetails").build();
    private static final MarshallingInfo<Integer> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusCode").build();
    private static final MarshallingInfo<String> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameters").build();

    private static final KubernetesApiCallActionMarshaller instance = new KubernetesApiCallActionMarshaller();

    public static KubernetesApiCallActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KubernetesApiCallAction kubernetesApiCallAction, ProtocolMarshaller protocolMarshaller) {

        if (kubernetesApiCallAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kubernetesApiCallAction.getRequestUri(), REQUESTURI_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getVerb(), VERB_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getSourceIps(), SOURCEIPS_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getUserAgent(), USERAGENT_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getRemoteIpDetails(), REMOTEIPDETAILS_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getStatusCode(), STATUSCODE_BINDING);
            protocolMarshaller.marshall(kubernetesApiCallAction.getParameters(), PARAMETERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
