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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QnAKendraConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QnAKendraConfigurationMarshaller {

    private static final MarshallingInfo<String> KENDRAINDEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kendraIndex").build();
    private static final MarshallingInfo<Boolean> QUERYFILTERSTRINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryFilterStringEnabled").build();
    private static final MarshallingInfo<String> QUERYFILTERSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("queryFilterString").build();
    private static final MarshallingInfo<Boolean> EXACTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exactResponse").build();

    private static final QnAKendraConfigurationMarshaller instance = new QnAKendraConfigurationMarshaller();

    public static QnAKendraConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QnAKendraConfiguration qnAKendraConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (qnAKendraConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(qnAKendraConfiguration.getKendraIndex(), KENDRAINDEX_BINDING);
            protocolMarshaller.marshall(qnAKendraConfiguration.getQueryFilterStringEnabled(), QUERYFILTERSTRINGENABLED_BINDING);
            protocolMarshaller.marshall(qnAKendraConfiguration.getQueryFilterString(), QUERYFILTERSTRING_BINDING);
            protocolMarshaller.marshall(qnAKendraConfiguration.getExactResponse(), EXACTRESPONSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
