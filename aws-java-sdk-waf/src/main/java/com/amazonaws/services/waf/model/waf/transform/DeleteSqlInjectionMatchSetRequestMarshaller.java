/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.waf.model.waf.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.waf.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteSqlInjectionMatchSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteSqlInjectionMatchSetRequestMarshaller {

    private static final MarshallingInfo<String> SQLINJECTIONMATCHSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqlInjectionMatchSetId").build();
    private static final MarshallingInfo<String> CHANGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeToken").build();

    private static final DeleteSqlInjectionMatchSetRequestMarshaller instance = new DeleteSqlInjectionMatchSetRequestMarshaller();

    public static DeleteSqlInjectionMatchSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteSqlInjectionMatchSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteSqlInjectionMatchSetRequest.getSqlInjectionMatchSetId(), SQLINJECTIONMATCHSETID_BINDING);
            protocolMarshaller.marshall(deleteSqlInjectionMatchSetRequest.getChangeToken(), CHANGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
