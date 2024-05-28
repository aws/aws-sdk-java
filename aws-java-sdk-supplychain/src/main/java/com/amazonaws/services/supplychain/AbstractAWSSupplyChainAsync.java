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
package com.amazonaws.services.supplychain;

import javax.annotation.Generated;

import com.amazonaws.services.supplychain.model.*;

/**
 * Abstract implementation of {@code AWSSupplyChainAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSupplyChainAsync extends AbstractAWSSupplyChain implements AWSSupplyChainAsync {

    protected AbstractAWSSupplyChainAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(CreateBillOfMaterialsImportJobRequest request) {

        return createBillOfMaterialsImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBillOfMaterialsImportJobResult> createBillOfMaterialsImportJobAsync(CreateBillOfMaterialsImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBillOfMaterialsImportJobRequest, CreateBillOfMaterialsImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(GetBillOfMaterialsImportJobRequest request) {

        return getBillOfMaterialsImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBillOfMaterialsImportJobResult> getBillOfMaterialsImportJobAsync(GetBillOfMaterialsImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBillOfMaterialsImportJobRequest, GetBillOfMaterialsImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(SendDataIntegrationEventRequest request) {

        return sendDataIntegrationEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendDataIntegrationEventResult> sendDataIntegrationEventAsync(SendDataIntegrationEventRequest request,
            com.amazonaws.handlers.AsyncHandler<SendDataIntegrationEventRequest, SendDataIntegrationEventResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
