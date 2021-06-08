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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GluePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GluePolicyMarshaller {

    private static final MarshallingInfo<String> POLICYINJSON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyInJson").build();
    private static final MarshallingInfo<String> POLICYHASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyHash").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTime").timestampFormat("unixTimestamp").build();

    private static final GluePolicyMarshaller instance = new GluePolicyMarshaller();

    public static GluePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GluePolicy gluePolicy, ProtocolMarshaller protocolMarshaller) {

        if (gluePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gluePolicy.getPolicyInJson(), POLICYINJSON_BINDING);
            protocolMarshaller.marshall(gluePolicy.getPolicyHash(), POLICYHASH_BINDING);
            protocolMarshaller.marshall(gluePolicy.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(gluePolicy.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
