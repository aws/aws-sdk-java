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
package com.amazonaws.services.lightsail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteRelationalDatabaseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteRelationalDatabaseRequestMarshaller {

    private static final MarshallingInfo<String> RELATIONALDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseName").build();
    private static final MarshallingInfo<Boolean> SKIPFINALSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skipFinalSnapshot").build();
    private static final MarshallingInfo<String> FINALRELATIONALDATABASESNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("finalRelationalDatabaseSnapshotName").build();

    private static final DeleteRelationalDatabaseRequestMarshaller instance = new DeleteRelationalDatabaseRequestMarshaller();

    public static DeleteRelationalDatabaseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteRelationalDatabaseRequest deleteRelationalDatabaseRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteRelationalDatabaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteRelationalDatabaseRequest.getRelationalDatabaseName(), RELATIONALDATABASENAME_BINDING);
            protocolMarshaller.marshall(deleteRelationalDatabaseRequest.getSkipFinalSnapshot(), SKIPFINALSNAPSHOT_BINDING);
            protocolMarshaller.marshall(deleteRelationalDatabaseRequest.getFinalRelationalDatabaseSnapshotName(), FINALRELATIONALDATABASESNAPSHOTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
