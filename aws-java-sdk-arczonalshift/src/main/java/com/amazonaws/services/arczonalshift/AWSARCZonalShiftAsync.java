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
 * Interface for accessing AWS ARC - Zonal Shift asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.arczonalshift.AbstractAWSARCZonalShiftAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the API Reference Guide for the zonal shift feature of Amazon Route 53 Application Recovery Controller. This
 * guide is for developers who need detailed information about zonal shift API actions, data types, and errors.
 * </p>
 * <p>
 * Zonal shift is in preview release for Amazon Route 53 Application Recovery Controller and is subject to change.
 * </p>
 * <p>
 * Zonal shift in Route 53 ARC enables you to move traffic for a load balancer resource away from an Availability Zone.
 * Starting a zonal shift helps your application recover immediately, for example, from a developer's bad code
 * deployment or from an AWS infrastructure failure in a single Availability Zone, reducing the impact and time lost
 * from an issue in one zone.
 * </p>
 * <p>
 * Supported AWS resources are automatically registered with Route 53 ARC. Resources that are registered for zonal
 * shifts in Route 53 ARC are managed resources in Route 53 ARC. You can start a zonal shift for any managed resource in
 * your account in a Region. At this time, you can only start a zonal shift for Network Load Balancers and Application
 * Load Balancers with cross-zone load balancing turned off.
 * </p>
 * <p>
 * Zonal shifts are temporary. You must specify an expiration when you start a zonal shift, of up to three days
 * initially. If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
 * new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
 * to the Availability Zone.
 * </p>
 * <p>
 * For more information about using zonal shift, see the <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSARCZonalShiftAsync extends AWSARCZonalShift {

    /**
     * <p>
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller that you've started for a resource in
     * your AWS account in an AWS Region.
     * </p>
     * 
     * @param cancelZonalShiftRequest
     * @return A Java Future containing the result of the CancelZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsync.CancelZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CancelZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest cancelZonalShiftRequest);

    /**
     * <p>
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller that you've started for a resource in
     * your AWS account in an AWS Region.
     * </p>
     * 
     * @param cancelZonalShiftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.CancelZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CancelZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest cancelZonalShiftRequest,
            com.amazonaws.handlers.AsyncHandler<CancelZonalShiftRequest, CancelZonalShiftResult> asyncHandler);

    /**
     * <p>
     * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application
     * Recovery Controller in this AWS Region. Resources that are registered for zonal shifts are managed resources in
     * Route 53 ARC.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param getManagedResourceRequest
     * @return A Java Future containing the result of the GetManagedResource operation returned by the service.
     * @sample AWSARCZonalShiftAsync.GetManagedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest getManagedResourceRequest);

    /**
     * <p>
     * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application
     * Recovery Controller in this AWS Region. Resources that are registered for zonal shifts are managed resources in
     * Route 53 ARC.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param getManagedResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetManagedResource operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.GetManagedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest getManagedResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetManagedResourceRequest, GetManagedResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all the resources in your AWS account in this AWS Region that are managed for zonal shifts in Amazon Route
     * 53 Application Recovery Controller, and information about them. The information includes their Amazon Resource
     * Names (ARNs), the Availability Zones the resources are deployed in, and the resource name.
     * </p>
     * 
     * @param listManagedResourcesRequest
     * @return A Java Future containing the result of the ListManagedResources operation returned by the service.
     * @sample AWSARCZonalShiftAsync.ListManagedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListManagedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest listManagedResourcesRequest);

    /**
     * <p>
     * Lists all the resources in your AWS account in this AWS Region that are managed for zonal shifts in Amazon Route
     * 53 Application Recovery Controller, and information about them. The information includes their Amazon Resource
     * Names (ARNs), the Availability Zones the resources are deployed in, and the resource name.
     * </p>
     * 
     * @param listManagedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListManagedResources operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.ListManagedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListManagedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest listManagedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListManagedResourcesRequest, ListManagedResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists all the active zonal shifts in Amazon Route 53 Application Recovery Controller in your AWS account in this
     * AWS Region.
     * </p>
     * 
     * @param listZonalShiftsRequest
     * @return A Java Future containing the result of the ListZonalShifts operation returned by the service.
     * @sample AWSARCZonalShiftAsync.ListZonalShifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListZonalShifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest listZonalShiftsRequest);

    /**
     * <p>
     * Lists all the active zonal shifts in Amazon Route 53 Application Recovery Controller in your AWS account in this
     * AWS Region.
     * </p>
     * 
     * @param listZonalShiftsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListZonalShifts operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.ListZonalShifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListZonalShifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest listZonalShiftsRequest,
            com.amazonaws.handlers.AsyncHandler<ListZonalShiftsRequest, ListZonalShiftsResult> asyncHandler);

    /**
     * <p>
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in a AWS Region,
     * to help your application recover immediately, for example, from a developer's bad code deployment or from an AWS
     * infrastructure failure in a single Availability Zone. You can start a zonal shift in Route 53 ARC only for
     * managed resources in your account in an AWS Region. Resources are automatically registered with Route 53 ARC by
     * AWS services.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * <p>
     * When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal
     * shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes,
     * for existing, in-progress connections in the Availability Zone to complete.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-shift.html">Zonal
     * shift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param startZonalShiftRequest
     * @return A Java Future containing the result of the StartZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsync.StartZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/StartZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest startZonalShiftRequest);

    /**
     * <p>
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in a AWS Region,
     * to help your application recover immediately, for example, from a developer's bad code deployment or from an AWS
     * infrastructure failure in a single Availability Zone. You can start a zonal shift in Route 53 ARC only for
     * managed resources in your account in an AWS Region. Resources are automatically registered with Route 53 ARC by
     * AWS services.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * <p>
     * When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal
     * shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes,
     * for existing, in-progress connections in the Availability Zone to complete.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-shift.html">Zonal
     * shift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param startZonalShiftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.StartZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/StartZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest startZonalShiftRequest,
            com.amazonaws.handlers.AsyncHandler<StartZonalShiftRequest, StartZonalShiftResult> asyncHandler);

    /**
     * <p>
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your AWS account. You can
     * update a zonal shift to set a new expiration, or edit or replace the comment for the zonal shift.
     * </p>
     * 
     * @param updateZonalShiftRequest
     * @return A Java Future containing the result of the UpdateZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsync.UpdateZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest updateZonalShiftRequest);

    /**
     * <p>
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your AWS account. You can
     * update a zonal shift to set a new expiration, or edit or replace the comment for the zonal shift.
     * </p>
     * 
     * @param updateZonalShiftRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateZonalShift operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.UpdateZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest updateZonalShiftRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateZonalShiftRequest, UpdateZonalShiftResult> asyncHandler);

}
