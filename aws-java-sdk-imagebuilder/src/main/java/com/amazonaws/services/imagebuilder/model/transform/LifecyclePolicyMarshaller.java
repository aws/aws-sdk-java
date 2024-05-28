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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRole").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> POLICYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("policyDetails").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceSelection").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateCreated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATEUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATELASTRUN_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateLastRun").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final LifecyclePolicyMarshaller instance = new LifecyclePolicyMarshaller();

    public static LifecyclePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicy lifecyclePolicy, ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicy.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getName(), NAME_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getPolicyDetails(), POLICYDETAILS_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getResourceSelection(), RESOURCESELECTION_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDateUpdated(), DATEUPDATED_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getDateLastRun(), DATELASTRUN_BINDING);
            protocolMarshaller.marshall(lifecyclePolicy.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
