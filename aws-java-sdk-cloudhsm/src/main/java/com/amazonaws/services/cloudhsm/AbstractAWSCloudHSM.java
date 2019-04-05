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
package com.amazonaws.services.cloudhsm;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSCloudHSM}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudHSM implements AWSCloudHSM {

    protected AbstractAWSCloudHSM() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateHapgResult createHapg(CreateHapgRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateHsmResult createHsm(CreateHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLunaClientResult createLunaClient(CreateLunaClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHapgResult deleteHapg(DeleteHapgRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHsmResult deleteHsm(DeleteHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLunaClientResult deleteLunaClient(DeleteLunaClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHapgResult describeHapg(DescribeHapgRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHsmResult describeHsm(DescribeHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeHsmResult describeHsm() {
        return describeHsm(new DescribeHsmRequest());
    }

    @Override
    public DescribeLunaClientResult describeLunaClient(DescribeLunaClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLunaClientResult describeLunaClient() {
        return describeLunaClient(new DescribeLunaClientRequest());
    }

    @Override
    public GetConfigResult getConfig(GetConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAvailableZonesResult listAvailableZones(ListAvailableZonesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAvailableZonesResult listAvailableZones() {
        return listAvailableZones(new ListAvailableZonesRequest());
    }

    @Override
    public ListHapgsResult listHapgs(ListHapgsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListHapgsResult listHapgs() {
        return listHapgs(new ListHapgsRequest());
    }

    @Override
    public ListHsmsResult listHsms(ListHsmsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListHsmsResult listHsms() {
        return listHsms(new ListHsmsRequest());
    }

    @Override
    public ListLunaClientsResult listLunaClients(ListLunaClientsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLunaClientsResult listLunaClients() {
        return listLunaClients(new ListLunaClientsRequest());
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyHapgResult modifyHapg(ModifyHapgRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyHsmResult modifyHsm(ModifyHsmRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyLunaClientResult modifyLunaClient(ModifyLunaClientRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
