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
package com.amazonaws.services.arczonalshift;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;

/**
 * Abstract implementation of {@code AWSARCZonalShiftAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSARCZonalShiftAsync extends AbstractAWSARCZonalShift implements AWSARCZonalShiftAsync {

    protected AbstractAWSARCZonalShiftAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest request) {

        return cancelZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelZonalShiftRequest, CancelZonalShiftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest request) {

        return getManagedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetManagedResourceRequest, GetManagedResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest request) {

        return listManagedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListManagedResourcesRequest, ListManagedResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest request) {

        return listZonalShiftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListZonalShiftsRequest, ListZonalShiftsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest request) {

        return startZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest request,
            com.amazonaws.handlers.AsyncHandler<StartZonalShiftRequest, StartZonalShiftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest request) {

        return updateZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateZonalShiftRequest, UpdateZonalShiftResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
