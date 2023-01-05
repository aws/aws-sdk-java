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
package com.amazonaws.services.private5g;

import javax.annotation.Generated;

import com.amazonaws.services.private5g.model.*;

/**
 * Interface for accessing AWS Private 5G asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.private5g.AbstractAWSPrivate5GAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Private 5G is a managed service that makes it easy to deploy, operate, and scale your own private
 * mobile network at your on-premises location. Private 5G provides the pre-configured hardware and software for mobile
 * networks, helps automate setup, and scales capacity on demand to support additional devices as needed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPrivate5GAsync extends AWSPrivate5G {

    /**
     * <p>
     * Acknowledges that the specified network order was received.
     * </p>
     * 
     * @param acknowledgeOrderReceiptRequest
     * @return A Java Future containing the result of the AcknowledgeOrderReceipt operation returned by the service.
     * @sample AWSPrivate5GAsync.AcknowledgeOrderReceipt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/AcknowledgeOrderReceipt"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcknowledgeOrderReceiptResult> acknowledgeOrderReceiptAsync(AcknowledgeOrderReceiptRequest acknowledgeOrderReceiptRequest);

    /**
     * <p>
     * Acknowledges that the specified network order was received.
     * </p>
     * 
     * @param acknowledgeOrderReceiptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcknowledgeOrderReceipt operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.AcknowledgeOrderReceipt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/AcknowledgeOrderReceipt"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcknowledgeOrderReceiptResult> acknowledgeOrderReceiptAsync(AcknowledgeOrderReceiptRequest acknowledgeOrderReceiptRequest,
            com.amazonaws.handlers.AsyncHandler<AcknowledgeOrderReceiptRequest, AcknowledgeOrderReceiptResult> asyncHandler);

    /**
     * <p>
     * Activates the specified device identifier.
     * </p>
     * 
     * @param activateDeviceIdentifierRequest
     * @return A Java Future containing the result of the ActivateDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsync.ActivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateDeviceIdentifierResult> activateDeviceIdentifierAsync(ActivateDeviceIdentifierRequest activateDeviceIdentifierRequest);

    /**
     * <p>
     * Activates the specified device identifier.
     * </p>
     * 
     * @param activateDeviceIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ActivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateDeviceIdentifierResult> activateDeviceIdentifierAsync(ActivateDeviceIdentifierRequest activateDeviceIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateDeviceIdentifierRequest, ActivateDeviceIdentifierResult> asyncHandler);

    /**
     * <p>
     * Activates the specified network site.
     * </p>
     * 
     * @param activateNetworkSiteRequest
     * @return A Java Future containing the result of the ActivateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsync.ActivateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateNetworkSiteResult> activateNetworkSiteAsync(ActivateNetworkSiteRequest activateNetworkSiteRequest);

    /**
     * <p>
     * Activates the specified network site.
     * </p>
     * 
     * @param activateNetworkSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ActivateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateNetworkSiteResult> activateNetworkSiteAsync(ActivateNetworkSiteRequest activateNetworkSiteRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateNetworkSiteRequest, ActivateNetworkSiteResult> asyncHandler);

    /**
     * <p>
     * Configures the specified network resource.
     * </p>
     * <p>
     * Use this action to specify the geographic position of the hardware. You must provide Certified Professional
     * Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html">Radio units</a> in the
     * <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param configureAccessPointRequest
     * @return A Java Future containing the result of the ConfigureAccessPoint operation returned by the service.
     * @sample AWSPrivate5GAsync.ConfigureAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureAccessPointResult> configureAccessPointAsync(ConfigureAccessPointRequest configureAccessPointRequest);

    /**
     * <p>
     * Configures the specified network resource.
     * </p>
     * <p>
     * Use this action to specify the geographic position of the hardware. You must provide Certified Professional
     * Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html">Radio units</a> in the
     * <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param configureAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfigureAccessPoint operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ConfigureAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureAccessPointResult> configureAccessPointAsync(ConfigureAccessPointRequest configureAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<ConfigureAccessPointRequest, ConfigureAccessPointResult> asyncHandler);

    /**
     * <p>
     * Creates a network.
     * </p>
     * 
     * @param createNetworkRequest
     * @return A Java Future containing the result of the CreateNetwork operation returned by the service.
     * @sample AWSPrivate5GAsync.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest createNetworkRequest);

    /**
     * <p>
     * Creates a network.
     * </p>
     * 
     * @param createNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetwork operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest createNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkRequest, CreateNetworkResult> asyncHandler);

    /**
     * <p>
     * Creates a network site.
     * </p>
     * 
     * @param createNetworkSiteRequest
     * @return A Java Future containing the result of the CreateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsync.CreateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkSiteResult> createNetworkSiteAsync(CreateNetworkSiteRequest createNetworkSiteRequest);

    /**
     * <p>
     * Creates a network site.
     * </p>
     * 
     * @param createNetworkSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.CreateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNetworkSiteResult> createNetworkSiteAsync(CreateNetworkSiteRequest createNetworkSiteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNetworkSiteRequest, CreateNetworkSiteResult> asyncHandler);

    /**
     * <p>
     * Deactivates the specified device identifier.
     * </p>
     * 
     * @param deactivateDeviceIdentifierRequest
     * @return A Java Future containing the result of the DeactivateDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsync.DeactivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeactivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateDeviceIdentifierResult> deactivateDeviceIdentifierAsync(
            DeactivateDeviceIdentifierRequest deactivateDeviceIdentifierRequest);

    /**
     * <p>
     * Deactivates the specified device identifier.
     * </p>
     * 
     * @param deactivateDeviceIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeactivateDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.DeactivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeactivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateDeviceIdentifierResult> deactivateDeviceIdentifierAsync(
            DeactivateDeviceIdentifierRequest deactivateDeviceIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivateDeviceIdentifierRequest, DeactivateDeviceIdentifierResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified network. You must delete network sites before you delete the network. For more information,
     * see <a href="https://docs.aws.amazon.com/private-networks/latest/APIReference/API_DeleteNetworkSite.html">
     * DeleteNetworkSite</a> in the <i>API Reference for Amazon Web Services Private 5G</i>.
     * </p>
     * 
     * @param deleteNetworkRequest
     * @return A Java Future containing the result of the DeleteNetwork operation returned by the service.
     * @sample AWSPrivate5GAsync.DeleteNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkResult> deleteNetworkAsync(DeleteNetworkRequest deleteNetworkRequest);

    /**
     * <p>
     * Deletes the specified network. You must delete network sites before you delete the network. For more information,
     * see <a href="https://docs.aws.amazon.com/private-networks/latest/APIReference/API_DeleteNetworkSite.html">
     * DeleteNetworkSite</a> in the <i>API Reference for Amazon Web Services Private 5G</i>.
     * </p>
     * 
     * @param deleteNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetwork operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.DeleteNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkResult> deleteNetworkAsync(DeleteNetworkRequest deleteNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkRequest, DeleteNetworkResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible
     * for minimum charges. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/hardware-maintenance.html">Hardware
     * returns</a> in the <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param deleteNetworkSiteRequest
     * @return A Java Future containing the result of the DeleteNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsync.DeleteNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkSiteResult> deleteNetworkSiteAsync(DeleteNetworkSiteRequest deleteNetworkSiteRequest);

    /**
     * <p>
     * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible
     * for minimum charges. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/hardware-maintenance.html">Hardware
     * returns</a> in the <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param deleteNetworkSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.DeleteNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNetworkSiteResult> deleteNetworkSiteAsync(DeleteNetworkSiteRequest deleteNetworkSiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNetworkSiteRequest, DeleteNetworkSiteResult> asyncHandler);

    /**
     * <p>
     * Gets the specified device identifier.
     * </p>
     * 
     * @param getDeviceIdentifierRequest
     * @return A Java Future containing the result of the GetDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsync.GetDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceIdentifierResult> getDeviceIdentifierAsync(GetDeviceIdentifierRequest getDeviceIdentifierRequest);

    /**
     * <p>
     * Gets the specified device identifier.
     * </p>
     * 
     * @param getDeviceIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceIdentifier operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.GetDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceIdentifierResult> getDeviceIdentifierAsync(GetDeviceIdentifierRequest getDeviceIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceIdentifierRequest, GetDeviceIdentifierResult> asyncHandler);

    /**
     * <p>
     * Gets the specified network.
     * </p>
     * 
     * @param getNetworkRequest
     * @return A Java Future containing the result of the GetNetwork operation returned by the service.
     * @sample AWSPrivate5GAsync.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetwork" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest getNetworkRequest);

    /**
     * <p>
     * Gets the specified network.
     * </p>
     * 
     * @param getNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetwork operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetwork" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest getNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkRequest, GetNetworkResult> asyncHandler);

    /**
     * <p>
     * Gets the specified network resource.
     * </p>
     * 
     * @param getNetworkResourceRequest
     * @return A Java Future containing the result of the GetNetworkResource operation returned by the service.
     * @sample AWSPrivate5GAsync.GetNetworkResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceResult> getNetworkResourceAsync(GetNetworkResourceRequest getNetworkResourceRequest);

    /**
     * <p>
     * Gets the specified network resource.
     * </p>
     * 
     * @param getNetworkResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkResource operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.GetNetworkResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceResult> getNetworkResourceAsync(GetNetworkResourceRequest getNetworkResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkResourceRequest, GetNetworkResourceResult> asyncHandler);

    /**
     * <p>
     * Gets the specified network site.
     * </p>
     * 
     * @param getNetworkSiteRequest
     * @return A Java Future containing the result of the GetNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsync.GetNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkSite" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkSiteResult> getNetworkSiteAsync(GetNetworkSiteRequest getNetworkSiteRequest);

    /**
     * <p>
     * Gets the specified network site.
     * </p>
     * 
     * @param getNetworkSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.GetNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkSite" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkSiteResult> getNetworkSiteAsync(GetNetworkSiteRequest getNetworkSiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkSiteRequest, GetNetworkSiteResult> asyncHandler);

    /**
     * <p>
     * Gets the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return A Java Future containing the result of the GetOrder operation returned by the service.
     * @sample AWSPrivate5GAsync.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOrderResult> getOrderAsync(GetOrderRequest getOrderRequest);

    /**
     * <p>
     * Gets the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrder operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOrderResult> getOrderAsync(GetOrderRequest getOrderRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrderRequest, GetOrderResult> asyncHandler);

    /**
     * <p>
     * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic
     * group.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you specify multiple filters, filters are joined with an OR, and the request </code>
     * </pre>
     * <p>
     * returns results that match all of the specified filters.
     * </p>
     * </p>
     * 
     * @param listDeviceIdentifiersRequest
     * @return A Java Future containing the result of the ListDeviceIdentifiers operation returned by the service.
     * @sample AWSPrivate5GAsync.ListDeviceIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListDeviceIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceIdentifiersResult> listDeviceIdentifiersAsync(ListDeviceIdentifiersRequest listDeviceIdentifiersRequest);

    /**
     * <p>
     * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic
     * group.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you specify multiple filters, filters are joined with an OR, and the request </code>
     * </pre>
     * <p>
     * returns results that match all of the specified filters.
     * </p>
     * </p>
     * 
     * @param listDeviceIdentifiersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeviceIdentifiers operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListDeviceIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListDeviceIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeviceIdentifiersResult> listDeviceIdentifiersAsync(ListDeviceIdentifiersRequest listDeviceIdentifiersRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeviceIdentifiersRequest, ListDeviceIdentifiersResult> asyncHandler);

    /**
     * <p>
     * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order or the status of network resources.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listNetworkResourcesRequest
     * @return A Java Future containing the result of the ListNetworkResources operation returned by the service.
     * @sample AWSPrivate5GAsync.ListNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkResourcesResult> listNetworkResourcesAsync(ListNetworkResourcesRequest listNetworkResourcesRequest);

    /**
     * <p>
     * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order or the status of network resources.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listNetworkResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworkResources operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkResourcesResult> listNetworkResourcesAsync(ListNetworkResourcesRequest listNetworkResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworkResourcesRequest, ListNetworkResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match
     * the status of the network site.
     * </p>
     * 
     * @param listNetworkSitesRequest
     * @return A Java Future containing the result of the ListNetworkSites operation returned by the service.
     * @sample AWSPrivate5GAsync.ListNetworkSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkSites"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkSitesResult> listNetworkSitesAsync(ListNetworkSitesRequest listNetworkSitesRequest);

    /**
     * <p>
     * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match
     * the status of the network site.
     * </p>
     * 
     * @param listNetworkSitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworkSites operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListNetworkSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkSites"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworkSitesResult> listNetworkSitesAsync(ListNetworkSitesRequest listNetworkSitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworkSitesRequest, ListNetworkSitesResult> asyncHandler);

    /**
     * <p>
     * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the
     * status of the network.
     * </p>
     * 
     * @param listNetworksRequest
     * @return A Java Future containing the result of the ListNetworks operation returned by the service.
     * @sample AWSPrivate5GAsync.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest listNetworksRequest);

    /**
     * <p>
     * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the
     * status of the network.
     * </p>
     * 
     * @param listNetworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNetworks operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest listNetworksRequest,
            com.amazonaws.handlers.AsyncHandler<ListNetworksRequest, ListNetworksResult> asyncHandler);

    /**
     * <p>
     * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the
     * Amazon Resource Name (ARN) of the network site or the status of the order.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listOrdersRequest
     * @return A Java Future containing the result of the ListOrders operation returned by the service.
     * @sample AWSPrivate5GAsync.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(ListOrdersRequest listOrdersRequest);

    /**
     * <p>
     * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the
     * Amazon Resource Name (ARN) of the network site or the status of the order.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listOrdersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrders operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(ListOrdersRequest listOrdersRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrdersRequest, ListOrdersResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPrivate5GAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Checks the health of the service.
     * </p>
     * 
     * @param pingRequest
     * @return A Java Future containing the result of the Ping operation returned by the service.
     * @sample AWSPrivate5GAsync.Ping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Ping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PingResult> pingAsync(PingRequest pingRequest);

    /**
     * <p>
     * Checks the health of the service.
     * </p>
     * 
     * @param pingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Ping operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.Ping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Ping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PingResult> pingAsync(PingRequest pingRequest, com.amazonaws.handlers.AsyncHandler<PingRequest, PingResult> asyncHandler);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPrivate5GAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPrivate5GAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified network site.
     * </p>
     * 
     * @param updateNetworkSiteRequest
     * @return A Java Future containing the result of the UpdateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsync.UpdateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSiteResult> updateNetworkSiteAsync(UpdateNetworkSiteRequest updateNetworkSiteRequest);

    /**
     * <p>
     * Updates the specified network site.
     * </p>
     * 
     * @param updateNetworkSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkSite operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.UpdateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSiteResult> updateNetworkSiteAsync(UpdateNetworkSiteRequest updateNetworkSiteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkSiteRequest, UpdateNetworkSiteResult> asyncHandler);

    /**
     * <p>
     * Updates the specified network site plan.
     * </p>
     * 
     * @param updateNetworkSitePlanRequest
     * @return A Java Future containing the result of the UpdateNetworkSitePlan operation returned by the service.
     * @sample AWSPrivate5GAsync.UpdateNetworkSitePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSitePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSitePlanResult> updateNetworkSitePlanAsync(UpdateNetworkSitePlanRequest updateNetworkSitePlanRequest);

    /**
     * <p>
     * Updates the specified network site plan.
     * </p>
     * 
     * @param updateNetworkSitePlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkSitePlan operation returned by the service.
     * @sample AWSPrivate5GAsyncHandler.UpdateNetworkSitePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSitePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkSitePlanResult> updateNetworkSitePlanAsync(UpdateNetworkSitePlanRequest updateNetworkSitePlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkSitePlanRequest, UpdateNetworkSitePlanResult> asyncHandler);

}
