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
 * Welcome to the Zonal Shift API Reference Guide for Amazon Route 53 Application Recovery Controller (Route 53 ARC).
 * </p>
 * <p>
 * You can start a zonal shift to move traffic for a load balancer resource away from an Availability Zone to help your
 * application recover quickly from an impairment in an Availability Zone. For example, you can recover your application
 * from a developer's bad code deployment or from an Amazon Web Services infrastructure failure in a single Availability
 * Zone.
 * </p>
 * <p>
 * You can also configure zonal autoshift for a load balancer resource. Zonal autoshift is a capability in Route 53 ARC
 * where Amazon Web Services shifts away application resource traffic from an Availability Zone, on your behalf, to help
 * reduce your time to recovery during events. Amazon Web Services shifts away traffic for resources that are enabled
 * for zonal autoshift whenever Amazon Web Services determines that there's an issue in the Availability Zone that could
 * potentially affect customers.
 * </p>
 * <p>
 * To ensure that zonal autoshift is safe for your application, you must also configure practice runs when you enable
 * zonal autoshift for a resource. Practice runs start weekly zonal shifts for a resource, to shift traffic for the
 * resource out of an Availability Zone. Practice runs make sure, on a regular basis, that you have enough capacity in
 * all the Availability Zones in an Amazon Web Services Region for your application to continue to operate normally when
 * traffic for a resource is shifted away from one Availability Zone.
 * </p>
 * <important>
 * <p>
 * You must prescale resource capacity in all Availability Zones in the Region where your application is deployed,
 * before you configure practice runs or enable zonal autoshift for a resource. You should not rely on scaling on demand
 * when an autoshift or practice run starts.
 * </p>
 * </important>
 * <p>
 * For more information about using zonal shift and zonal autoshift, see the <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSARCZonalShiftAsync extends AWSARCZonalShift {

    /**
     * <p>
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller. To cancel the zonal shift, specify the
     * zonal shift ID.
     * </p>
     * <p>
     * A zonal shift can be one that you've started for a resource in your Amazon Web Services account in an Amazon Web
     * Services Region, or it can be a zonal shift started by a practice run with zonal autoshift.
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
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller. To cancel the zonal shift, specify the
     * zonal shift ID.
     * </p>
     * <p>
     * A zonal shift can be one that you've started for a resource in your Amazon Web Services account in an Amazon Web
     * Services Region, or it can be a zonal shift started by a practice run with zonal autoshift.
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
     * A practice run configuration for zonal autoshift is required when you enable zonal autoshift. A practice run
     * configuration includes specifications for blocked dates and blocked time windows, and for Amazon CloudWatch
     * alarms that you create to use with practice runs. The alarms that you specify are an <i>outcome alarm</i>, to
     * monitor application health during practice runs and, optionally, a <i>blocking alarm</i>, to block practice runs
     * from starting.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html"> Considerations
     * when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createPracticeRunConfigurationRequest
     * @return A Java Future containing the result of the CreatePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsync.CreatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePracticeRunConfigurationResult> createPracticeRunConfigurationAsync(
            CreatePracticeRunConfigurationRequest createPracticeRunConfigurationRequest);

    /**
     * <p>
     * A practice run configuration for zonal autoshift is required when you enable zonal autoshift. A practice run
     * configuration includes specifications for blocked dates and blocked time windows, and for Amazon CloudWatch
     * alarms that you create to use with practice runs. The alarms that you specify are an <i>outcome alarm</i>, to
     * monitor application health during practice runs and, optionally, a <i>blocking alarm</i>, to block practice runs
     * from starting.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html"> Considerations
     * when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createPracticeRunConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsyncHandler.CreatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePracticeRunConfigurationResult> createPracticeRunConfigurationAsync(
            CreatePracticeRunConfigurationRequest createPracticeRunConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePracticeRunConfigurationRequest, CreatePracticeRunConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the practice run configuration for a resource. Before you can delete a practice run configuration for a
     * resource., you must disable zonal autoshift for the resource. Practice runs must be configured for zonal
     * autoshift to be enabled.
     * </p>
     * 
     * @param deletePracticeRunConfigurationRequest
     * @return A Java Future containing the result of the DeletePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsync.DeletePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/DeletePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePracticeRunConfigurationResult> deletePracticeRunConfigurationAsync(
            DeletePracticeRunConfigurationRequest deletePracticeRunConfigurationRequest);

    /**
     * <p>
     * Deletes the practice run configuration for a resource. Before you can delete a practice run configuration for a
     * resource., you must disable zonal autoshift for the resource. Practice runs must be configured for zonal
     * autoshift to be enabled.
     * </p>
     * 
     * @param deletePracticeRunConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsyncHandler.DeletePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/DeletePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePracticeRunConfigurationResult> deletePracticeRunConfigurationAsync(
            DeletePracticeRunConfigurationRequest deletePracticeRunConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePracticeRunConfigurationRequest, DeletePracticeRunConfigurationResult> asyncHandler);

    /**
     * <p>
     * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application
     * Recovery Controller in this Amazon Web Services Region. Resources that are registered for zonal shifts are
     * managed resources in Route 53 ARC. You can start zonal shifts and configure zonal autoshift for managed
     * resources.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift or configure zonal autoshift for Network Load Balancers and
     * Application Load Balancers with cross-zone load balancing turned off.
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
     * Recovery Controller in this Amazon Web Services Region. Resources that are registered for zonal shifts are
     * managed resources in Route 53 ARC. You can start zonal shifts and configure zonal autoshift for managed
     * resources.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift or configure zonal autoshift for Network Load Balancers and
     * Application Load Balancers with cross-zone load balancing turned off.
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
     * Returns the active autoshifts for a specified resource.
     * </p>
     * 
     * @param listAutoshiftsRequest
     * @return A Java Future containing the result of the ListAutoshifts operation returned by the service.
     * @sample AWSARCZonalShiftAsync.ListAutoshifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListAutoshifts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAutoshiftsResult> listAutoshiftsAsync(ListAutoshiftsRequest listAutoshiftsRequest);

    /**
     * <p>
     * Returns the active autoshifts for a specified resource.
     * </p>
     * 
     * @param listAutoshiftsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAutoshifts operation returned by the service.
     * @sample AWSARCZonalShiftAsyncHandler.ListAutoshifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListAutoshifts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAutoshiftsResult> listAutoshiftsAsync(ListAutoshiftsRequest listAutoshiftsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAutoshiftsRequest, ListAutoshiftsResult> asyncHandler);

    /**
     * <p>
     * Lists all the resources in your Amazon Web Services account in this Amazon Web Services Region that are managed
     * for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information
     * includes the zonal autoshift status for the resource, as well as the Amazon Resource Name (ARN), the Availability
     * Zones that each resource is deployed in, and the resource name.
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
     * Lists all the resources in your Amazon Web Services account in this Amazon Web Services Region that are managed
     * for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information
     * includes the zonal autoshift status for the resource, as well as the Amazon Resource Name (ARN), the Availability
     * Zones that each resource is deployed in, and the resource name.
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
     * Lists all active and completed zonal shifts in Amazon Route 53 Application Recovery Controller in your Amazon Web
     * Services account in this Amazon Web Services Region. <code>ListZonalShifts</code> returns customer-started zonal
     * shifts, as well as practice run zonal shifts that Route 53 ARC started on your behalf for zonal autoshift.
     * </p>
     * <p>
     * The <code>ListZonalShifts</code> operation does not list autoshifts. For more information about listing
     * autoshifts, see <a
     * href="https://docs.aws.amazon.com/arc-zonal-shift/latest/api/API_ListAutoshifts.html">"&gt;ListAutoshifts</a>.
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
     * Lists all active and completed zonal shifts in Amazon Route 53 Application Recovery Controller in your Amazon Web
     * Services account in this Amazon Web Services Region. <code>ListZonalShifts</code> returns customer-started zonal
     * shifts, as well as practice run zonal shifts that Route 53 ARC started on your behalf for zonal autoshift.
     * </p>
     * <p>
     * The <code>ListZonalShifts</code> operation does not list autoshifts. For more information about listing
     * autoshifts, see <a
     * href="https://docs.aws.amazon.com/arc-zonal-shift/latest/api/API_ListAutoshifts.html">"&gt;ListAutoshifts</a>.
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
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in an Amazon Web
     * Services Region, to help your application recover immediately, for example, from a developer's bad code
     * deployment or from an Amazon Web Services infrastructure failure in a single Availability Zone. You can start a
     * zonal shift in Route 53 ARC only for managed resources in your Amazon Web Services account in an Amazon Web
     * Services Region. Resources are automatically registered with Route 53 ARC by Amazon Web Services services.
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
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in an Amazon Web
     * Services Region, to help your application recover immediately, for example, from a developer's bad code
     * deployment or from an Amazon Web Services infrastructure failure in a single Availability Zone. You can start a
     * zonal shift in Route 53 ARC only for managed resources in your Amazon Web Services account in an Amazon Web
     * Services Region. Resources are automatically registered with Route 53 ARC by Amazon Web Services services.
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
     * Update a practice run configuration to change one or more of the following: add, change, or remove the blocking
     * alarm; change the outcome alarm; or add, change, or remove blocking dates or time windows.
     * </p>
     * 
     * @param updatePracticeRunConfigurationRequest
     * @return A Java Future containing the result of the UpdatePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsync.UpdatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePracticeRunConfigurationResult> updatePracticeRunConfigurationAsync(
            UpdatePracticeRunConfigurationRequest updatePracticeRunConfigurationRequest);

    /**
     * <p>
     * Update a practice run configuration to change one or more of the following: add, change, or remove the blocking
     * alarm; change the outcome alarm; or add, change, or remove blocking dates or time windows.
     * </p>
     * 
     * @param updatePracticeRunConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePracticeRunConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsyncHandler.UpdatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePracticeRunConfigurationResult> updatePracticeRunConfigurationAsync(
            UpdatePracticeRunConfigurationRequest updatePracticeRunConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePracticeRunConfigurationRequest, UpdatePracticeRunConfigurationResult> asyncHandler);

    /**
     * <p>
     * You can update the zonal autoshift status for a resource, to enable or disable zonal autoshift. When zonal
     * autoshift is <code>ENABLED</code>, Amazon Web Services shifts away resource traffic from an Availability Zone, on
     * your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * 
     * @param updateZonalAutoshiftConfigurationRequest
     * @return A Java Future containing the result of the UpdateZonalAutoshiftConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsync.UpdateZonalAutoshiftConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalAutoshiftConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateZonalAutoshiftConfigurationResult> updateZonalAutoshiftConfigurationAsync(
            UpdateZonalAutoshiftConfigurationRequest updateZonalAutoshiftConfigurationRequest);

    /**
     * <p>
     * You can update the zonal autoshift status for a resource, to enable or disable zonal autoshift. When zonal
     * autoshift is <code>ENABLED</code>, Amazon Web Services shifts away resource traffic from an Availability Zone, on
     * your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * 
     * @param updateZonalAutoshiftConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateZonalAutoshiftConfiguration operation returned by the
     *         service.
     * @sample AWSARCZonalShiftAsyncHandler.UpdateZonalAutoshiftConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalAutoshiftConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateZonalAutoshiftConfigurationResult> updateZonalAutoshiftConfigurationAsync(
            UpdateZonalAutoshiftConfigurationRequest updateZonalAutoshiftConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateZonalAutoshiftConfigurationRequest, UpdateZonalAutoshiftConfigurationResult> asyncHandler);

    /**
     * <p>
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your Amazon Web Services
     * account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal
     * shift.
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
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your Amazon Web Services
     * account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal
     * shift.
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
