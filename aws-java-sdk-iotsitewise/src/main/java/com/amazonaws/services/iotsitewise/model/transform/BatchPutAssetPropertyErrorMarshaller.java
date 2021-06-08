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
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchPutAssetPropertyErrorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchPutAssetPropertyErrorMarshaller {

    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorCode").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();
    private static final MarshallingInfo<List> TIMESTAMPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timestamps").build();

    private static final BatchPutAssetPropertyErrorMarshaller instance = new BatchPutAssetPropertyErrorMarshaller();

    public static BatchPutAssetPropertyErrorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchPutAssetPropertyError batchPutAssetPropertyError, ProtocolMarshaller protocolMarshaller) {

        if (batchPutAssetPropertyError == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchPutAssetPropertyError.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(batchPutAssetPropertyError.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(batchPutAssetPropertyError.getTimestamps(), TIMESTAMPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
