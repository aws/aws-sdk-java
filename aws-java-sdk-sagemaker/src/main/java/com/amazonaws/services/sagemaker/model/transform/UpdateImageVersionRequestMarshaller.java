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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateImageVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateImageVersionRequestMarshaller {

    private static final MarshallingInfo<String> IMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageName").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alias").build();
    private static final MarshallingInfo<Integer> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<List> ALIASESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AliasesToAdd").build();
    private static final MarshallingInfo<List> ALIASESTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AliasesToDelete").build();
    private static final MarshallingInfo<String> VENDORGUIDANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VendorGuidance").build();
    private static final MarshallingInfo<String> JOBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobType").build();
    private static final MarshallingInfo<String> MLFRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MLFramework").build();
    private static final MarshallingInfo<String> PROGRAMMINGLANG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgrammingLang").build();
    private static final MarshallingInfo<String> PROCESSOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Processor").build();
    private static final MarshallingInfo<Boolean> HOROVOD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Horovod").build();
    private static final MarshallingInfo<String> RELEASENOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseNotes").build();

    private static final UpdateImageVersionRequestMarshaller instance = new UpdateImageVersionRequestMarshaller();

    public static UpdateImageVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateImageVersionRequest updateImageVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateImageVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateImageVersionRequest.getImageName(), IMAGENAME_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getAliasesToAdd(), ALIASESTOADD_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getAliasesToDelete(), ALIASESTODELETE_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getVendorGuidance(), VENDORGUIDANCE_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getJobType(), JOBTYPE_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getMLFramework(), MLFRAMEWORK_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getProgrammingLang(), PROGRAMMINGLANG_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getProcessor(), PROCESSOR_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getHorovod(), HOROVOD_BINDING);
            protocolMarshaller.marshall(updateImageVersionRequest.getReleaseNotes(), RELEASENOTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
