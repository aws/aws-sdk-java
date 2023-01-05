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
package com.amazonaws.services.memorydb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.memorydb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClusterPendingUpdatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClusterPendingUpdatesMarshaller {

    private static final MarshallingInfo<StructuredPojo> RESHARDING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resharding").build();
    private static final MarshallingInfo<StructuredPojo> ACLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ACLs").build();
    private static final MarshallingInfo<List> SERVICEUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceUpdates").build();

    private static final ClusterPendingUpdatesMarshaller instance = new ClusterPendingUpdatesMarshaller();

    public static ClusterPendingUpdatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClusterPendingUpdates clusterPendingUpdates, ProtocolMarshaller protocolMarshaller) {

        if (clusterPendingUpdates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clusterPendingUpdates.getResharding(), RESHARDING_BINDING);
            protocolMarshaller.marshall(clusterPendingUpdates.getACLs(), ACLS_BINDING);
            protocolMarshaller.marshall(clusterPendingUpdates.getServiceUpdates(), SERVICEUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
