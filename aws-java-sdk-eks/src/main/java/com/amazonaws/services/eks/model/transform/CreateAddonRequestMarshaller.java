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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAddonRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAddonRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ADDONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("addonName").build();
    private static final MarshallingInfo<String> ADDONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addonVersion").build();
    private static final MarshallingInfo<String> SERVICEACCOUNTROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceAccountRoleArn").build();
    private static final MarshallingInfo<String> RESOLVECONFLICTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolveConflicts").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateAddonRequestMarshaller instance = new CreateAddonRequestMarshaller();

    public static CreateAddonRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAddonRequest createAddonRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAddonRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAddonRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getAddonName(), ADDONNAME_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getAddonVersion(), ADDONVERSION_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getServiceAccountRoleArn(), SERVICEACCOUNTROLEARN_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getResolveConflicts(), RESOLVECONFLICTS_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createAddonRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
