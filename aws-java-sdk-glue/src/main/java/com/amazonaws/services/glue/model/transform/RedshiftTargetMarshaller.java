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
 * RedshiftTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftTargetMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Table").build();
    private static final MarshallingInfo<String> REDSHIFTTMPDIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftTmpDir").build();
    private static final MarshallingInfo<String> TMPDIRIAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TmpDirIAMRole").build();
    private static final MarshallingInfo<StructuredPojo> UPSERTREDSHIFTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpsertRedshiftOptions").build();

    private static final RedshiftTargetMarshaller instance = new RedshiftTargetMarshaller();

    public static RedshiftTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftTarget redshiftTarget, ProtocolMarshaller protocolMarshaller) {

        if (redshiftTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftTarget.getName(), NAME_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getRedshiftTmpDir(), REDSHIFTTMPDIR_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getTmpDirIAMRole(), TMPDIRIAMROLE_BINDING);
            protocolMarshaller.marshall(redshiftTarget.getUpsertRedshiftOptions(), UPSERTREDSHIFTOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
