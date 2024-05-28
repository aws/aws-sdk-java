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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpensearchConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpensearchConfigurationMarshaller {

    private static final MarshallingInfo<String> DOMAINENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainEndpoint").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("indexName").build();
    private static final MarshallingInfo<Boolean> EXACTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exactResponse").build();
    private static final MarshallingInfo<StructuredPojo> EXACTRESPONSEFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exactResponseFields").build();
    private static final MarshallingInfo<List> INCLUDEFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("includeFields").build();

    private static final OpensearchConfigurationMarshaller instance = new OpensearchConfigurationMarshaller();

    public static OpensearchConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpensearchConfiguration opensearchConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (opensearchConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(opensearchConfiguration.getDomainEndpoint(), DOMAINENDPOINT_BINDING);
            protocolMarshaller.marshall(opensearchConfiguration.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(opensearchConfiguration.getExactResponse(), EXACTRESPONSE_BINDING);
            protocolMarshaller.marshall(opensearchConfiguration.getExactResponseFields(), EXACTRESPONSEFIELDS_BINDING);
            protocolMarshaller.marshall(opensearchConfiguration.getIncludeFields(), INCLUDEFIELDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
