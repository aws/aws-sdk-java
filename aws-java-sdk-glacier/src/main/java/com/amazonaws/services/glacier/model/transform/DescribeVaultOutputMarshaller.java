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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeVaultOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeVaultOutputMarshaller {

    private static final MarshallingInfo<String> VAULTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VaultARN").build();
    private static final MarshallingInfo<String> VAULTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VaultName").build();
    private static final MarshallingInfo<String> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").build();
    private static final MarshallingInfo<String> LASTINVENTORYDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastInventoryDate").build();
    private static final MarshallingInfo<Long> NUMBEROFARCHIVES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfArchives").build();
    private static final MarshallingInfo<Long> SIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SizeInBytes").build();

    private static final DescribeVaultOutputMarshaller instance = new DescribeVaultOutputMarshaller();

    public static DescribeVaultOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeVaultOutput describeVaultOutput, ProtocolMarshaller protocolMarshaller) {

        if (describeVaultOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeVaultOutput.getVaultARN(), VAULTARN_BINDING);
            protocolMarshaller.marshall(describeVaultOutput.getVaultName(), VAULTNAME_BINDING);
            protocolMarshaller.marshall(describeVaultOutput.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(describeVaultOutput.getLastInventoryDate(), LASTINVENTORYDATE_BINDING);
            protocolMarshaller.marshall(describeVaultOutput.getNumberOfArchives(), NUMBEROFARCHIVES_BINDING);
            protocolMarshaller.marshall(describeVaultOutput.getSizeInBytes(), SIZEINBYTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
