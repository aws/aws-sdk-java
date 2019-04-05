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
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterContainerInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterContainerInstanceRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cluster").build();
    private static final MarshallingInfo<String> INSTANCEIDENTITYDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceIdentityDocument").build();
    private static final MarshallingInfo<String> INSTANCEIDENTITYDOCUMENTSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceIdentityDocumentSignature").build();
    private static final MarshallingInfo<List> TOTALRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalResources").build();
    private static final MarshallingInfo<StructuredPojo> VERSIONINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionInfo").build();
    private static final MarshallingInfo<String> CONTAINERINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerInstanceArn").build();
    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<List> PLATFORMDEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformDevices").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final RegisterContainerInstanceRequestMarshaller instance = new RegisterContainerInstanceRequestMarshaller();

    public static RegisterContainerInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterContainerInstanceRequest registerContainerInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerContainerInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerContainerInstanceRequest.getCluster(), CLUSTER_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getInstanceIdentityDocument(), INSTANCEIDENTITYDOCUMENT_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getInstanceIdentityDocumentSignature(), INSTANCEIDENTITYDOCUMENTSIGNATURE_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getTotalResources(), TOTALRESOURCES_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getVersionInfo(), VERSIONINFO_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getContainerInstanceArn(), CONTAINERINSTANCEARN_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getPlatformDevices(), PLATFORMDEVICES_BINDING);
            protocolMarshaller.marshall(registerContainerInstanceRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
