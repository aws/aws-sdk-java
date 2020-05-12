/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.services.iotsitewise.waiters.AWSIoTSiteWiseWaiters;

/**
 * Interface for accessing AWS IoT SiteWise.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotsitewise.AbstractAWSIoTSiteWise} instead.
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
public interface AWSIoTSiteWise {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotsitewise";

    /**
     * <p>
     * Associates a child asset with the given parent asset through a hierarchy defined in the parent asset's model. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html">Associating
     * Assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @return Result of the AssociateAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.AssociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AssociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateAssetsResult associateAssets(AssociateAssetsRequest associateAssetsRequest);

    /**
     * <p>
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @return Result of the BatchAssociateProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.BatchAssociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchAssociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateProjectAssetsResult batchAssociateProjectAssets(BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest);

    /**
     * <p>
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @return Result of the BatchDisassociateProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.BatchDisassociateProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchDisassociateProjectAssets"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateProjectAssetsResult batchDisassociateProjectAssets(BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest);

    /**
     * <p>
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is a timestamp-quality-value (TQV) data
     * point. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html">Ingesting Data Using the API</a>
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
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have a timestamp of no more than 15
     * minutes in the past and no more than 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of the
     * inclusive range of [-15, +5] minutes and returns a <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate timestamps unless the newer TQV has a
     * different quality. For example, if you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @return Result of the BatchPutAssetPropertyValue operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.BatchPutAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchPutAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    BatchPutAssetPropertyValueResult batchPutAssetPropertyValue(BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest);

    /**
     * <p>
     * Creates an access policy that grants the specified AWS Single Sign-On user or group access to the specified AWS
     * IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return Result of the CreateAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAccessPolicyResult createAccessPolicy(CreateAccessPolicyRequest createAccessPolicyRequest);

    /**
     * <p>
     * Creates an asset from an existing asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html">Creating Assets</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @return Result of the CreateAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.CreateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssetResult createAsset(CreateAssetRequest createAssetRequest);

    /**
     * <p>
     * Creates an asset model from specified property and hierarchy definitions. You create assets from asset models.
     * With asset models, you can easily create assets of the same type that have standardized definitions. Each asset
     * created from a model inherits the asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html">Defining Asset Models</a> in
     * the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @return Result of the CreateAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.CreateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAssetModelResult createAssetModel(CreateAssetModelRequest createAssetModelRequest);

    /**
     * <p>
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @return Result of the CreateDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest);

    /**
     * <p>
     * Creates a gateway, which is a virtual or edge device that delivers industrial data streams from local servers to
     * AWS IoT SiteWise. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html">Ingesting data using a
     * gateway</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @return Result of the CreateGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGatewayResult createGateway(CreateGatewayRequest createGatewayRequest);

    /**
     * <p>
     * Creates a portal, which can contain projects and dashboards. Before you can create a portal, you must configure
     * AWS Single Sign-On in the current Region. AWS IoT SiteWise Monitor uses AWS SSO to manage user permissions. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso">Enabling AWS
     * SSO</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one AWS SSO user or group to that portal. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or Removing Portal Administrators</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @return Result of the CreatePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePortalResult createPortal(CreatePortalRequest createPortalRequest);

    /**
     * <p>
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Deletes an access policy that grants the specified AWS Single Sign-On identity access to the specified AWS IoT
     * SiteWise Monitor resource. You can use this action to revoke access to an AWS IoT SiteWise Monitor resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return Result of the DeleteAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAccessPolicyResult deleteAccessPolicy(DeleteAccessPolicyRequest deleteAccessPolicyRequest);

    /**
     * <p>
     * Deletes an asset. This action can't be undone. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting Assets
     * and Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
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
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * Deletes an asset model. This action can't be undone. You must delete all assets created from an asset model
     * before you can delete the model. Also, you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model that you want to delete. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html">Deleting Assets
     * and Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @return Result of the DeleteAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeleteAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAssetModelResult deleteAssetModel(DeleteAssetModelRequest deleteAssetModelRequest);

    /**
     * <p>
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return Result of the DeleteDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest);

    /**
     * <p>
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some of the gateway's files remain in your
     * gateway's file system. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-retention.html">Data retention</a> in the
     * <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteGateway" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @return Result of the DeletePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DeletePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeletePortal" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePortalResult deletePortal(DeletePortalRequest deletePortalRequest);

    /**
     * <p>
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Describes an access policy, which specifies an AWS SSO user or group's access to an AWS IoT SiteWise Monitor
     * portal or project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @return Result of the DescribeAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccessPolicyResult describeAccessPolicy(DescribeAccessPolicyRequest describeAccessPolicyRequest);

    /**
     * <p>
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @return Result of the DescribeAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAsset" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAssetResult describeAsset(DescribeAssetRequest describeAssetRequest);

    /**
     * <p>
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @return Result of the DescribeAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAssetModelResult describeAssetModel(DescribeAssetModelRequest describeAssetModelRequest);

    /**
     * <p>
     * Retrieves information about an asset's property.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @return Result of the DescribeAssetProperty operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAssetPropertyResult describeAssetProperty(DescribeAssetPropertyRequest describeAssetPropertyRequest);

    /**
     * <p>
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return Result of the DescribeDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDashboardResult describeDashboard(DescribeDashboardRequest describeDashboardRequest);

    /**
     * <p>
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @return Result of the DescribeGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGateway" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGatewayResult describeGateway(DescribeGatewayRequest describeGatewayRequest);

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
     * @return Result of the DescribeGatewayCapabilityConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeGatewayCapabilityConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGatewayCapabilityConfigurationResult describeGatewayCapabilityConfiguration(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest);

    /**
     * <p>
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @return Result of the DescribePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribePortal" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePortalResult describePortal(DescribePortalRequest describePortalRequest);

    /**
     * <p>
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Disassociates a child asset from the given parent asset through a hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @return Result of the DisassociateAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.DisassociateAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DisassociateAssets" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateAssetsResult disassociateAssets(DisassociateAssetsRequest disassociateAssetsRequest);

    /**
     * <p>
     * Gets aggregated values for an asset property. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates">Querying
     * Aggregated Property Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
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
     * @return Result of the GetAssetPropertyAggregates operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssetPropertyAggregatesResult getAssetPropertyAggregates(GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest);

    /**
     * <p>
     * Gets an asset property's current value. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying Current Property Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
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
     * @return Result of the GetAssetPropertyValue operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyValue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValue"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssetPropertyValueResult getAssetPropertyValue(GetAssetPropertyValueRequest getAssetPropertyValueRequest);

    /**
     * <p>
     * Gets the history of an asset property's values. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying Historical Property Values</a> in the <i>AWS IoT SiteWise User Guide</i>.
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
     * @return Result of the GetAssetPropertyValueHistory operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ServiceUnavailableException
     *         The requested service is unavailable.
     * @sample AWSIoTSiteWise.GetAssetPropertyValueHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValueHistory"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssetPropertyValueHistoryResult getAssetPropertyValueHistory(GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest);

    /**
     * <p>
     * Retrieves a paginated list of access policies for an AWS SSO identity (a user or group) or an AWS IoT SiteWise
     * Monitor resource (a portal or project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return Result of the ListAccessPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAccessPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest);

    /**
     * <p>
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @return Result of the ListAssetModels operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssetModelsResult listAssetModels(ListAssetModelsRequest listAssetModelsRequest);

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
     * @return Result of the ListAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    ListAssetsResult listAssets(ListAssetsRequest listAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of the assets associated to a parent asset (<code>assetId</code>) by a given hierarchy
     * (<code>hierarchyId</code>).
     * </p>
     * 
     * @param listAssociatedAssetsRequest
     * @return Result of the ListAssociatedAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListAssociatedAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssociatedAssets"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedAssetsResult listAssociatedAssets(ListAssociatedAssetsRequest listAssociatedAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return Result of the ListDashboards operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest);

    /**
     * <p>
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListGateways" target="_top">AWS API
     *      Documentation</a>
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return Result of the ListPortals operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListPortals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListPortals" target="_top">AWS API
     *      Documentation</a>
     */
    ListPortalsResult listPortals(ListPortalsRequest listPortalsRequest);

    /**
     * <p>
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @return Result of the ListProjectAssets operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListProjectAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjectAssets" target="_top">AWS
     *      API Documentation</a>
     */
    ListProjectAssetsResult listProjectAssets(ListProjectAssetsRequest listProjectAssetsRequest);

    /**
     * <p>
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws TooManyTagsException
     *         You've reached the limit for the number of tags allowed for a resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions">Tag naming limits
     *         and requirements</a> in the <i>AWS General Reference</i>.
     * @sample AWSIoTSiteWise.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSIoTSiteWise.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing access policy that specifies an AWS SSO user or group's access to an AWS IoT SiteWise Monitor
     * portal or project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return Result of the UpdateAccessPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAccessPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAccessPolicyResult updateAccessPolicy(UpdateAccessPolicyRequest updateAccessPolicyRequest);

    /**
     * <p>
     * Updates an asset's name. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating Assets
     * and Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @return Result of the UpdateAsset operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest);

    /**
     * <p>
     * Updates an asset model and all of the assets that were created from the model. Each asset created from the model
     * inherits the updated asset model's property and hierarchy definitions. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html">Updating Assets
     * and Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This action overwrites the existing model with the provided model. To avoid deleting your asset model's
     * properties or hierarchies, you must include their IDs and definitions in the updated asset model payload. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model or update a property's formula expression, AWS IoT SiteWise deletes
     * all previous data for that property. If you remove a hierarchy definition from an asset model, AWS IoT SiteWise
     * disassociates every asset associated with that hierarchy. You can't change the type or data type of an existing
     * property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @return Result of the UpdateAssetModel operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAssetModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetModel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAssetModelResult updateAssetModel(UpdateAssetModelRequest updateAssetModelRequest);

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
     * @return Result of the UpdateAssetProperty operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdateAssetProperty
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetProperty"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssetPropertyResult updateAssetProperty(UpdateAssetPropertyRequest updateAssetPropertyRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return Result of the UpdateDashboard operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest);

    /**
     * <p>
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return Result of the UpdateGateway operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGateway" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGatewayResult updateGateway(UpdateGatewayRequest updateGatewayRequest);

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
     * @return Result of the UpdateGatewayCapabilityConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws LimitExceededException
     *         You've reached the limit for a resource. For example, this can occur if you're trying to associate more
     *         than the allowed number of child assets or attempting to create more than the allowed number of
     *         properties for an asset model.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateGatewayCapabilityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateGatewayCapabilityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGatewayCapabilityConfigurationResult updateGatewayCapabilityConfiguration(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return Result of the UpdatePortal operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @throws ConflictingOperationException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSIoTSiteWise.UpdatePortal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePortalResult updatePortal(UpdatePortalRequest updatePortalRequest);

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InvalidRequestException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters. Check your request and try again.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws InternalFailureException
     *         AWS IoT SiteWise can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a rate limit. For example, you might have exceeded the number of AWS IoT SiteWise
     *         assets that can be created per second, the allowed number of messages per second, and so on.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     * @sample AWSIoTSiteWise.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AWSIoTSiteWiseWaiters waiters();

}
