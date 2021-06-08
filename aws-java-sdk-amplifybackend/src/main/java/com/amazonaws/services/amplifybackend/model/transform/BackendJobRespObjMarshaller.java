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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackendJobRespObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackendJobRespObjMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> BACKENDENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backendEnvironmentName").build();
    private static final MarshallingInfo<String> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").build();
    private static final MarshallingInfo<String> ERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("error").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operation").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").build();

    private static final BackendJobRespObjMarshaller instance = new BackendJobRespObjMarshaller();

    public static BackendJobRespObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackendJobRespObj backendJobRespObj, ProtocolMarshaller protocolMarshaller) {

        if (backendJobRespObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backendJobRespObj.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getBackendEnvironmentName(), BACKENDENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getError(), ERROR_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(backendJobRespObj.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
