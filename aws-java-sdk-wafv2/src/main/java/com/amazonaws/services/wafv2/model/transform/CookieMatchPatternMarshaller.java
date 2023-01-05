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
package com.amazonaws.services.wafv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wafv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CookieMatchPatternMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CookieMatchPatternMarshaller {

    private static final MarshallingInfo<StructuredPojo> ALL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("All").build();
    private static final MarshallingInfo<List> INCLUDEDCOOKIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludedCookies").build();
    private static final MarshallingInfo<List> EXCLUDEDCOOKIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludedCookies").build();

    private static final CookieMatchPatternMarshaller instance = new CookieMatchPatternMarshaller();

    public static CookieMatchPatternMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CookieMatchPattern cookieMatchPattern, ProtocolMarshaller protocolMarshaller) {

        if (cookieMatchPattern == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cookieMatchPattern.getAll(), ALL_BINDING);
            protocolMarshaller.marshall(cookieMatchPattern.getIncludedCookies(), INCLUDEDCOOKIES_BINDING);
            protocolMarshaller.marshall(cookieMatchPattern.getExcludedCookies(), EXCLUDEDCOOKIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
