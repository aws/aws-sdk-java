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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuditContextMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuditContextMarshaller {

    private static final MarshallingInfo<String> ADDITIONALAUDITCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalAuditContext").build();
    private static final MarshallingInfo<List> REQUESTEDCOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedColumns").build();
    private static final MarshallingInfo<Boolean> ALLCOLUMNSREQUESTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllColumnsRequested").build();

    private static final AuditContextMarshaller instance = new AuditContextMarshaller();

    public static AuditContextMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuditContext auditContext, ProtocolMarshaller protocolMarshaller) {

        if (auditContext == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(auditContext.getAdditionalAuditContext(), ADDITIONALAUDITCONTEXT_BINDING);
            protocolMarshaller.marshall(auditContext.getRequestedColumns(), REQUESTEDCOLUMNS_BINDING);
            protocolMarshaller.marshall(auditContext.getAllColumnsRequested(), ALLCOLUMNSREQUESTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
