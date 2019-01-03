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
package com.amazonaws.services.secretsmanager.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.secretsmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecretListEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecretListEntryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ARN").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> ROTATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationEnabled").build();
    private static final MarshallingInfo<String> ROTATIONLAMBDAARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationLambdaARN").build();
    private static final MarshallingInfo<StructuredPojo> ROTATIONRULES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RotationRules").build();
    private static final MarshallingInfo<java.util.Date> LASTROTATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRotatedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTCHANGEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastChangedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTACCESSEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAccessedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Map> SECRETVERSIONSTOSTAGES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretVersionsToStages").build();

    private static final SecretListEntryMarshaller instance = new SecretListEntryMarshaller();

    public static SecretListEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecretListEntry secretListEntry, ProtocolMarshaller protocolMarshaller) {

        if (secretListEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(secretListEntry.getARN(), ARN_BINDING);
            protocolMarshaller.marshall(secretListEntry.getName(), NAME_BINDING);
            protocolMarshaller.marshall(secretListEntry.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(secretListEntry.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(secretListEntry.getRotationEnabled(), ROTATIONENABLED_BINDING);
            protocolMarshaller.marshall(secretListEntry.getRotationLambdaARN(), ROTATIONLAMBDAARN_BINDING);
            protocolMarshaller.marshall(secretListEntry.getRotationRules(), ROTATIONRULES_BINDING);
            protocolMarshaller.marshall(secretListEntry.getLastRotatedDate(), LASTROTATEDDATE_BINDING);
            protocolMarshaller.marshall(secretListEntry.getLastChangedDate(), LASTCHANGEDDATE_BINDING);
            protocolMarshaller.marshall(secretListEntry.getLastAccessedDate(), LASTACCESSEDDATE_BINDING);
            protocolMarshaller.marshall(secretListEntry.getDeletedDate(), DELETEDDATE_BINDING);
            protocolMarshaller.marshall(secretListEntry.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(secretListEntry.getSecretVersionsToStages(), SECRETVERSIONSTOSTAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
