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
package com.amazonaws.services.iotsitewise;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;

/**
 * Interface for accessing AWS IoT SiteWise asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotsitewise.AbstractAWSIoTSiteWiseAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the AWS IoT SiteWise API Reference. AWS IoT SiteWise is an AWS service that connects <a
 * href="https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications">Industrial Internet of Things
 * (IIoT)</a> devices to the power of the AWS Cloud. For more information, see the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/">AWS IoT SiteWise User Guide</a>. For information
 * about AWS IoT SiteWise quotas, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT SiteWise
 * User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTSiteWiseAsync extends AWSIoTSiteWise {

    /**
     * <p>
     * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html">Associating
     * assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @return A Java Future containing the result of the AssociateAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.AssociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAssetsResult> associateAssetsAsync(AssociateAssetsRequest associateAssetsRequest);

    /**
     * <p>
     * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html">Associating
     * assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.AssociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAssetsResult> associateAssetsAsync(AssociateAssetsRequest associateAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAssetsRequest, AssociateAssetsResult> asyncHandler);

    /**
     * <p>
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @return A Java Future containing the result of the BatchAssociateProjectAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.BatchAssociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchAssociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateProjectAssetsResult> batchAssociateProjectAssetsAsync(
            BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest);

    /**
     * <p>
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateProjectAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.BatchAssociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchAssociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateProjectAssetsResult> batchAssociateProjectAssetsAsync(
            BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateProjectAssetsRequest, BatchAssociateProjectAssetsResult> asyncHandler);

    /**
     * <p>
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @return A Java Future containing the result of the BatchDisassociateProjectAssets operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsync.BatchDisassociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchDisassociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateProjectAssetsResult> batchDisassociateProjectAssetsAsync(
            BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest);

    /**
     * <p>
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateProjectAssets operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsyncHandler.BatchDisassociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchDisassociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateProjectAssetsResult> batchDisassociateProjectAssetsAsync(
            BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateProjectAssetsRequest, BatchDisassociateProjectAssetsResult> asyncHandler);

    /**
     * <p>
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data
     * point. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html">Ingesting data using the API</a>
     * in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 7 days
     * in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the
     * inclusive range of [-7 days, +5 minutes] and returns a <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a
     * different quality. For example, if you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * <p>
     * AWS IoT SiteWise authorizes access to each <code>BatchPutAssetPropertyValue</code> entry individually. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-batchputassetpropertyvalue-action"
     * >BatchPutAssetPropertyValue authorization</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @return A Java Future containing the result of the BatchPutAssetPropertyValue operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.BatchPutAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutAssetPropertyValueResult> batchPutAssetPropertyValueAsync(
            BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest);

    /**
     * <p>
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data
     * point. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html">Ingesting data using the API</a>
     * in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 7 days
     * in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the
     * inclusive range of [-7 days, +5 minutes] and returns a <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a
     * different quality. For example, if you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * <p>
     * AWS IoT SiteWise authorizes access to each <code>BatchPutAssetPropertyValue</code> entry individually. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-batchputassetpropertyvalue-action"
     * >BatchPutAssetPropertyValue authorization</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutAssetPropertyValue operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.BatchPutAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutAssetPropertyValueResult> batchPutAssetPropertyValueAsync(
            BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutAssetPropertyValueRequest, BatchPutAssetPropertyValueResult> asyncHandler);

    /**
     * <p>
     * Creates an access policy that grants the specified identity (AWS SSO user, AWS SSO group, or IAM user) access to
     * the specified AWS IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return A Java Future containing the result of the CreateAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest createAccessPolicyRequest);

    /**
     * <p>
     * Creates an access policy that grants the specified identity (AWS SSO user, AWS SSO group, or IAM user) access to
     * the specified AWS IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest createAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPolicyRequest, CreateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates an asset from an existing asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html">Creating assets</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest);

    /**
     * <p>
     * Creates an asset from an existing asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html">Creating assets</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetResult> createAssetAsync(CreateAssetRequest createAssetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetRequest, CreateAssetResult> asyncHandler);

    /**
     * <p>
     * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models.
     * With asset models, you can easily create assets of the same type that have standardized definitions. Each asset
     * created from a model inherits the asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html">Defining asset models</a> in
     * the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @return A Java Future containing the result of the CreateAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetModelResult> createAssetModelAsync(CreateAssetModelRequest createAssetModelRequest);

    /**
     * <p>
     * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models.
     * With asset models, you can easily create assets of the same type that have standardized definitions. Each asset
     * created from a model inherits the asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html">Defining asset models</a> in
     * the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssetModelResult> createAssetModelAsync(CreateAssetModelRequest createAssetModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssetModelRequest, CreateAssetModelResult> asyncHandler);

    /**
     * <p>
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @return A Java Future containing the result of the CreateDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest createDashboardRequest);

    /**
     * <p>
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest createDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDashboardRequest, CreateDashboardResult> asyncHandler);

    /**
     * <p>
     * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to
     * AWS IoT SiteWise. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html">Ingesting data using a
     * gateway</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @return A Java Future containing the result of the CreateGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest createGatewayRequest);

    /**
     * <p>
     * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to
     * AWS IoT SiteWise. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html">Ingesting data using a
     * gateway</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest createGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler);

    /**
     * <p>
     * Creates a portal, which can contain projects and dashboards. AWS IoT SiteWise Monitor uses AWS SSO or IAM to
     * authenticate portal users and manage user permissions.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one identity to that portal. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or removing portal administrators</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @return A Java Future containing the result of the CreatePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest createPortalRequest);

    /**
     * <p>
     * Creates a portal, which can contain projects and dashboards. AWS IoT SiteWise Monitor uses AWS SSO or IAM to
     * authenticate portal users and manage user permissions.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one identity to that portal. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or removing portal administrators</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePortalResult> createPortalAsync(CreatePortalRequest createPortalRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortalRequest, CreatePortalResult> asyncHandler);

    /**
     * @param createPresignedPortalUrlRequest
     * @return A Java Future containing the result of the CreatePresignedPortalUrl operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreatePresignedPortalUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePresignedPortalUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedPortalUrlResult> createPresignedPortalUrlAsync(CreatePresignedPortalUrlRequest createPresignedPortalUrlRequest);

    /**
     * @param createPresignedPortalUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePresignedPortalUrl operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreatePresignedPortalUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePresignedPortalUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedPortalUrlResult> createPresignedPortalUrlAsync(CreatePresignedPortalUrlRequest createPresignedPortalUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedPortalUrlRequest, CreatePresignedPortalUrlResult> asyncHandler);

    /**
     * <p>
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes an access policy that grants the specified identity access to the specified AWS IoT SiteWise Monitor
     * resource. You can use this operation to revoke access to an AWS IoT SiteWise Monitor resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return A Java Future containing the result of the DeleteAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest deleteAccessPolicyRequest);

    /**
     * <p>
     * Deletes an access policy that grants the specified identity access to the specified AWS IoT SiteWise Monitor
     * resource. You can use this operation to revoke access to an AWS IoT SiteWise Monitor resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest deleteAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPolicyRequest, DeleteAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an asset. This action can't be undone. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can't delete an asset that's associated to another asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DisassociateAssets.html"
     * >DisassociateAssets</a>.
     * </p>
     * </note>
     * 
     * @param deleteAssetRequest
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * Deletes an asset. This action can't be undone. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can't delete an asset that's associated to another asset. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DisassociateAssets.html"
     * >DisassociateAssets</a>.
     * </p>
     * </note>
     * 
     * @param deleteAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler);

    /**
     * <p>
     * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model
     * before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model that you want to delete. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @return A Java Future containing the result of the DeleteAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetModelResult> deleteAssetModelAsync(DeleteAssetModelRequest deleteAssetModelRequest);

    /**
     * <p>
     * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model
     * before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model that you want to delete. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetModelResult> deleteAssetModelAsync(DeleteAssetModelRequest deleteAssetModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetModelRequest, DeleteAssetModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return A Java Future containing the result of the DeleteDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest deleteDashboardRequest);

    /**
     * <p>
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest deleteDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDashboardRequest, DeleteDashboardResult> asyncHandler);

    /**
     * <p>
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your
     * gateway's file system.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your
     * gateway's file system.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler);

    /**
     * <p>
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @return A Java Future containing the result of the DeletePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeletePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest deletePortalRequest);

    /**
     * <p>
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeletePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePortalResult> deletePortalAsync(DeletePortalRequest deletePortalRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortalRequest, DeletePortalResult> asyncHandler);

    /**
     * <p>
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Describes an access policy, which specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @return A Java Future containing the result of the DescribeAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessPolicyResult> describeAccessPolicyAsync(DescribeAccessPolicyRequest describeAccessPolicyRequest);

    /**
     * <p>
     * Describes an access policy, which specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessPolicyResult> describeAccessPolicyAsync(DescribeAccessPolicyRequest describeAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessPolicyRequest, DescribeAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @return A Java Future containing the result of the DescribeAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest describeAssetRequest);

    /**
     * <p>
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetResult> describeAssetAsync(DescribeAssetRequest describeAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetRequest, DescribeAssetResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @return A Java Future containing the result of the DescribeAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetModelResult> describeAssetModelAsync(DescribeAssetModelRequest describeAssetModelRequest);

    /**
     * <p>
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetModelResult> describeAssetModelAsync(DescribeAssetModelRequest describeAssetModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetModelRequest, DescribeAssetModelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an asset property.
     * </p>
     * <note>
     * <p>
     * When you call this operation for an attribute property, this response includes the default attribute value that
     * you define in the asset model. If you update the default value in the model, this operation's response includes
     * the new default value.
     * </p>
     * </note>
     * <p>
     * This operation doesn't return the value of the asset property. To get the value of an asset property, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_GetAssetPropertyValue.html">
     * GetAssetPropertyValue</a>.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @return A Java Future containing the result of the DescribeAssetProperty operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetPropertyResult> describeAssetPropertyAsync(DescribeAssetPropertyRequest describeAssetPropertyRequest);

    /**
     * <p>
     * Retrieves information about an asset property.
     * </p>
     * <note>
     * <p>
     * When you call this operation for an attribute property, this response includes the default attribute value that
     * you define in the asset model. If you update the default value in the model, this operation's response includes
     * the new default value.
     * </p>
     * </note>
     * <p>
     * This operation doesn't return the value of the asset property. To get the value of an asset property, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_GetAssetPropertyValue.html">
     * GetAssetPropertyValue</a>.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssetProperty operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetPropertyResult> describeAssetPropertyAsync(DescribeAssetPropertyRequest describeAssetPropertyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetPropertyRequest, DescribeAssetPropertyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return A Java Future containing the result of the DescribeDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest describeDashboardRequest);

    /**
     * <p>
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest describeDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardRequest, DescribeDashboardResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the default encryption configuration for the AWS account in the default or specified
     * region. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param describeDefaultEncryptionConfigurationRequest
     * @return A Java Future containing the result of the DescribeDefaultEncryptionConfiguration operation returned by
     *         the service.
     * @sample AWSIoTSiteWiseAsync.DescribeDefaultEncryptionConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDefaultEncryptionConfigurationResult> describeDefaultEncryptionConfigurationAsync(
            DescribeDefaultEncryptionConfigurationRequest describeDefaultEncryptionConfigurationRequest);

    /**
     * <p>
     * Retrieves information about the default encryption configuration for the AWS account in the default or specified
     * region. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param describeDefaultEncryptionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDefaultEncryptionConfiguration operation returned by
     *         the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeDefaultEncryptionConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDefaultEncryptionConfigurationResult> describeDefaultEncryptionConfigurationAsync(
            DescribeDefaultEncryptionConfigurationRequest describeDefaultEncryptionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultEncryptionConfigurationRequest, DescribeDefaultEncryptionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @return A Java Future containing the result of the DescribeGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(DescribeGatewayRequest describeGatewayRequest);

    /**
     * <p>
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGateway" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(DescribeGatewayRequest describeGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGatewayRequest, DescribeGatewayResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a gateway capability configuration. Each gateway capability defines data sources for
     * a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA
     * sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability
     * configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param describeGatewayCapabilityConfigurationRequest
     * @return A Java Future containing the result of the DescribeGatewayCapabilityConfiguration operation returned by
     *         the service.
     * @sample AWSIoTSiteWiseAsync.DescribeGatewayCapabilityConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayCapabilityConfigurationResult> describeGatewayCapabilityConfigurationAsync(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest);

    /**
     * <p>
     * Retrieves information about a gateway capability configuration. Each gateway capability defines data sources for
     * a gateway. A capability configuration can contain multiple data source configurations. If you define OPC-UA
     * sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored in one capability
     * configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param describeGatewayCapabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGatewayCapabilityConfiguration operation returned by
     *         the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeGatewayCapabilityConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGatewayCapabilityConfigurationResult> describeGatewayCapabilityConfigurationAsync(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGatewayCapabilityConfigurationRequest, DescribeGatewayCapabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @return A Java Future containing the result of the DescribePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePortalResult> describePortalAsync(DescribePortalRequest describePortalRequest);

    /**
     * <p>
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePortalResult> describePortalAsync(DescribePortalRequest describePortalRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePortalRequest, DescribePortalResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @return A Java Future containing the result of the DisassociateAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.DisassociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DisassociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAssetsResult> disassociateAssetsAsync(DisassociateAssetsRequest disassociateAssetsRequest);

    /**
     * <p>
     * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.DisassociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DisassociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAssetsResult> disassociateAssetsAsync(DisassociateAssetsRequest disassociateAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAssetsRequest, DisassociateAssetsResult> asyncHandler);

    /**
     * <p>
     * Gets aggregated values for an asset property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates">Querying
     * aggregates</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyAggregatesRequest
     * @return A Java Future containing the result of the GetAssetPropertyAggregates operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.GetAssetPropertyAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyAggregatesResult> getAssetPropertyAggregatesAsync(
            GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest);

    /**
     * <p>
     * Gets aggregated values for an asset property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates">Querying
     * aggregates</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyAggregatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssetPropertyAggregates operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.GetAssetPropertyAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyAggregatesResult> getAssetPropertyAggregatesAsync(
            GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetPropertyAggregatesRequest, GetAssetPropertyAggregatesResult> asyncHandler);

    /**
     * <p>
     * Gets an asset property's current value. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying current values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueRequest
     * @return A Java Future containing the result of the GetAssetPropertyValue operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.GetAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyValueResult> getAssetPropertyValueAsync(GetAssetPropertyValueRequest getAssetPropertyValueRequest);

    /**
     * <p>
     * Gets an asset property's current value. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying current values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssetPropertyValue operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.GetAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyValueResult> getAssetPropertyValueAsync(GetAssetPropertyValueRequest getAssetPropertyValueRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetPropertyValueRequest, GetAssetPropertyValueResult> asyncHandler);

    /**
     * <p>
     * Gets the history of an asset property's values. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying historical values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueHistoryRequest
     * @return A Java Future containing the result of the GetAssetPropertyValueHistory operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsync.GetAssetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyValueHistoryResult> getAssetPropertyValueHistoryAsync(
            GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest);

    /**
     * <p>
     * Gets the history of an asset property's values. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying historical values</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset property's alias, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssetPropertyValueHistory operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsyncHandler.GetAssetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssetPropertyValueHistoryResult> getAssetPropertyValueHistoryAsync(
            GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetPropertyValueHistoryRequest, GetAssetPropertyValueHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of access policies for an identity (an AWS SSO user, an AWS SSO group, or an IAM user)
     * or an AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest);

    /**
     * <p>
     * Retrieves a paginated list of access policies for an identity (an AWS SSO user, an AWS SSO group, or an IAM user)
     * or an AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPolicies operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest listAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @return A Java Future containing the result of the ListAssetModels operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListAssetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetModelsResult> listAssetModelsAsync(ListAssetModelsRequest listAssetModelsRequest);

    /**
     * <p>
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetModels operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListAssetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetModelsResult> listAssetModelsAsync(ListAssetModelsRequest listAssetModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetModelsRequest, ListAssetModelsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of asset relationships for an asset. You can use this operation to identify an asset's
     * root asset and all associated assets between that asset and its root.
     * </p>
     * 
     * @param listAssetRelationshipsRequest
     * @return A Java Future containing the result of the ListAssetRelationships operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListAssetRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetRelationshipsResult> listAssetRelationshipsAsync(ListAssetRelationshipsRequest listAssetRelationshipsRequest);

    /**
     * <p>
     * Retrieves a paginated list of asset relationships for an asset. You can use this operation to identify an asset's
     * root asset and all associated assets between that asset and its root.
     * </p>
     * 
     * @param listAssetRelationshipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetRelationships operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListAssetRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetRelationshipsResult> listAssetRelationshipsAsync(ListAssetRelationshipsRequest listAssetRelationshipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetRelationshipsRequest, ListAssetRelationshipsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of asset summaries.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List assets based on a specific asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * List top-level assets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't use this operation to list all assets. To retrieve summaries for all of your assets, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_ListAssetModels.html">ListAssetModels</a>
     * to get all of your asset model IDs. Then, use ListAssets to get all assets for each asset model.
     * </p>
     * 
     * @param listAssetsRequest
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of asset summaries.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List assets based on a specific asset model.
     * </p>
     * </li>
     * <li>
     * <p>
     * List top-level assets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't use this operation to list all assets. To retrieve summaries for all of your assets, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_ListAssetModels.html">ListAssetModels</a>
     * to get all of your asset model IDs. Then, use ListAssets to get all assets for each asset model.
     * </p>
     * 
     * @param listAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of associated assets.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List child assets associated to a parent asset by a hierarchy that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * List an asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAssociatedAssetsRequest
     * @return A Java Future containing the result of the ListAssociatedAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListAssociatedAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssociatedAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAssetsResult> listAssociatedAssetsAsync(ListAssociatedAssetsRequest listAssociatedAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of associated assets.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List child assets associated to a parent asset by a hierarchy that you specify.
     * </p>
     * </li>
     * <li>
     * <p>
     * List an asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAssociatedAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListAssociatedAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssociatedAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedAssetsResult> listAssociatedAssetsAsync(ListAssociatedAssetsRequest listAssociatedAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedAssetsRequest, ListAssociatedAssetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest);

    /**
     * <p>
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGateways operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListGateways" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest,
            com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return A Java Future containing the result of the ListPortals operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest listPortalsRequest);

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortals operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPortalsResult> listPortalsAsync(ListPortalsRequest listPortalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPortalsRequest, ListPortalsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @return A Java Future containing the result of the ListProjectAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjectAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectAssetsResult> listProjectAssetsAsync(ListProjectAssetsRequest listProjectAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjectAssets operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjectAssets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectAssetsResult> listProjectAssetsAsync(ListProjectAssetsRequest listProjectAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectAssetsRequest, ListProjectAssetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets the default encryption configuration for the AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param putDefaultEncryptionConfigurationRequest
     * @return A Java Future containing the result of the PutDefaultEncryptionConfiguration operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsync.PutDefaultEncryptionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDefaultEncryptionConfigurationResult> putDefaultEncryptionConfigurationAsync(
            PutDefaultEncryptionConfigurationRequest putDefaultEncryptionConfigurationRequest);

    /**
     * <p>
     * Sets the default encryption configuration for the AWS account. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/key-management.html">Key management</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param putDefaultEncryptionConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDefaultEncryptionConfiguration operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsyncHandler.PutDefaultEncryptionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutDefaultEncryptionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDefaultEncryptionConfigurationResult> putDefaultEncryptionConfigurationAsync(
            PutDefaultEncryptionConfigurationRequest putDefaultEncryptionConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutDefaultEncryptionConfigurationRequest, PutDefaultEncryptionConfigurationResult> asyncHandler);

    /**
     * <p>
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing access policy that specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return A Java Future containing the result of the UpdateAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest updateAccessPolicyRequest);

    /**
     * <p>
     * Updates an existing access policy that specifies an identity's access to an AWS IoT SiteWise Monitor portal or
     * project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessPolicy operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest updateAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessPolicyRequest, UpdateAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Updates an asset's name. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @return A Java Future containing the result of the UpdateAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest updateAssetRequest);

    /**
     * <p>
     * Updates an asset's name. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAsset operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest updateAssetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssetRequest, UpdateAssetResult> asyncHandler);

    /**
     * <p>
     * Updates an asset model and all of the assets that were created from the model. Each asset created from the model
     * inherits the updated asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the existing model with the provided model. To avoid deleting your asset model's
     * properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model, AWS IoT SiteWise deletes all previous data for that property. If
     * you remove a hierarchy definition from an asset model, AWS IoT SiteWise disassociates every asset associated with
     * that hierarchy. You can't change the type or data type of an existing property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @return A Java Future containing the result of the UpdateAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetModelResult> updateAssetModelAsync(UpdateAssetModelRequest updateAssetModelRequest);

    /**
     * <p>
     * Updates an asset model and all of the assets that were created from the model. Each asset created from the model
     * inherits the updated asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating assets
     * and models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the existing model with the provided model. To avoid deleting your asset model's
     * properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model, AWS IoT SiteWise deletes all previous data for that property. If
     * you remove a hierarchy definition from an asset model, AWS IoT SiteWise disassociates every asset associated with
     * that hierarchy. You can't change the type or data type of an existing property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssetModel operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetModelResult> updateAssetModelAsync(UpdateAssetModelRequest updateAssetModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssetModelRequest, UpdateAssetModelResult> asyncHandler);

    /**
     * <p>
     * Updates an asset property's alias and notification state.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the property's existing alias and notification state. To keep your existing property's
     * alias or notification state, you must include the existing values in the UpdateAssetProperty request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetProperty.html"
     * >DescribeAssetProperty</a>.
     * </p>
     * </important>
     * 
     * @param updateAssetPropertyRequest
     * @return A Java Future containing the result of the UpdateAssetProperty operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetPropertyResult> updateAssetPropertyAsync(UpdateAssetPropertyRequest updateAssetPropertyRequest);

    /**
     * <p>
     * Updates an asset property's alias and notification state.
     * </p>
     * <important>
     * <p>
     * This operation overwrites the property's existing alias and notification state. To keep your existing property's
     * alias or notification state, you must include the existing values in the UpdateAssetProperty request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetProperty.html"
     * >DescribeAssetProperty</a>.
     * </p>
     * </important>
     * 
     * @param updateAssetPropertyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssetProperty operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetPropertyResult> updateAssetPropertyAsync(UpdateAssetPropertyRequest updateAssetPropertyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssetPropertyRequest, UpdateAssetPropertyResult> asyncHandler);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return A Java Future containing the result of the UpdateDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest updateDashboardRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDashboard operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest updateDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDashboardRequest, UpdateDashboardResult> asyncHandler);

    /**
     * <p>
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return A Java Future containing the result of the UpdateGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest updateGatewayRequest);

    /**
     * <p>
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGateway operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayResult> updateGatewayAsync(UpdateGatewayRequest updateGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayRequest, UpdateGatewayResult> asyncHandler);

    /**
     * <p>
     * Updates a gateway capability configuration or defines a new capability configuration. Each gateway capability
     * defines data sources for a gateway. A capability configuration can contain multiple data source configurations.
     * If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored
     * in one capability configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param updateGatewayCapabilityConfigurationRequest
     * @return A Java Future containing the result of the UpdateGatewayCapabilityConfiguration operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsync.UpdateGatewayCapabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayCapabilityConfigurationResult> updateGatewayCapabilityConfigurationAsync(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest);

    /**
     * <p>
     * Updates a gateway capability configuration or defines a new capability configuration. Each gateway capability
     * defines data sources for a gateway. A capability configuration can contain multiple data source configurations.
     * If you define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all of your OPC-UA sources are stored
     * in one capability configuration. To list all capability configurations for a gateway, use <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html">DescribeGateway</a>.
     * </p>
     * 
     * @param updateGatewayCapabilityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewayCapabilityConfiguration operation returned by the
     *         service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateGatewayCapabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGatewayCapabilityConfigurationResult> updateGatewayCapabilityConfigurationAsync(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayCapabilityConfigurationRequest, UpdateGatewayCapabilityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return A Java Future containing the result of the UpdatePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest updatePortalRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePortal operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortalResult> updatePortalAsync(UpdatePortalRequest updatePortalRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePortalRequest, UpdatePortalResult> asyncHandler);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSIoTSiteWiseAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

}
