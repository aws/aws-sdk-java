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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAuditSuppressionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAuditSuppressionRequestMarshaller {

    private static final MarshallingInfo<String> CHECKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checkName").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceIdentifier").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> SUPPRESSINDEFINITELY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressIndefinitely").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateAuditSuppressionRequestMarshaller instance = new CreateAuditSuppressionRequestMarshaller();

    public static CreateAuditSuppressionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAuditSuppressionRequest createAuditSuppressionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAuditSuppressionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAuditSuppressionRequest.getCheckName(), CHECKNAME_BINDING);
            protocolMarshaller.marshall(createAuditSuppressionRequest.getResourceIdentifier(), RESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createAuditSuppressionRequest.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(createAuditSuppressionRequest.getSuppressIndefinitely(), SUPPRESSINDEFINITELY_BINDING);
            protocolMarshaller.marshall(createAuditSuppressionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAuditSuppressionRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
