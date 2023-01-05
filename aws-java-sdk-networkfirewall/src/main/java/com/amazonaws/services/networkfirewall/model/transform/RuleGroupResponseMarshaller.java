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
package com.amazonaws.services.networkfirewall.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleGroupResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleGroupResponseMarshaller {

    private static final MarshallingInfo<String> RULEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupArn").build();
    private static final MarshallingInfo<String> RULEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupName").build();
    private static final MarshallingInfo<String> RULEGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Integer> CAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capacity").build();
    private static final MarshallingInfo<String> RULEGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuleGroupStatus").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Integer> CONSUMEDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumedCapacity").build();
    private static final MarshallingInfo<Integer> NUMBEROFASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAssociations").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceMetadata").build();
    private static final MarshallingInfo<String> SNSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SnsTopic").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();

    private static final RuleGroupResponseMarshaller instance = new RuleGroupResponseMarshaller();

    public static RuleGroupResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleGroupResponse ruleGroupResponse, ProtocolMarshaller protocolMarshaller) {

        if (ruleGroupResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleGroupResponse.getRuleGroupArn(), RULEGROUPARN_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getRuleGroupName(), RULEGROUPNAME_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getRuleGroupId(), RULEGROUPID_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getCapacity(), CAPACITY_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getRuleGroupStatus(), RULEGROUPSTATUS_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getConsumedCapacity(), CONSUMEDCAPACITY_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getNumberOfAssociations(), NUMBEROFASSOCIATIONS_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getSourceMetadata(), SOURCEMETADATA_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getSnsTopic(), SNSTOPIC_BINDING);
            protocolMarshaller.marshall(ruleGroupResponse.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
