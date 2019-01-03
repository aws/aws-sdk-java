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
package com.amazonaws.services.servicecatalog;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;

/**
 * Interface for accessing AWS Service Catalog asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicecatalog.AbstractAWSServiceCatalogAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Service Catalog</fullname>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> enables organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
 * familiar with the terminology discussed in <a
 * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html">AWS Service Catalog
 * Concepts</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServiceCatalogAsync extends AWSServiceCatalog {

    /**
     * <p>
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return A Java Future containing the result of the AcceptPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.AcceptPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AcceptPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest acceptPortfolioShareRequest);

    /**
     * <p>
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.AcceptPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AcceptPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest acceptPortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptPortfolioShareRequest, AcceptPortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @return A Java Future containing the result of the AssociatePrincipalWithPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.AssociatePrincipalWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociatePrincipalWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest);

    /**
     * <p>
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePrincipalWithPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.AssociatePrincipalWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociatePrincipalWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePrincipalWithPortfolioRequest, AssociatePrincipalWithPortfolioResult> asyncHandler);

    /**
     * <p>
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return A Java Future containing the result of the AssociateProductWithPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.AssociateProductWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateProductWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest);

    /**
     * <p>
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateProductWithPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.AssociateProductWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateProductWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProductWithPortfolioRequest, AssociateProductWithPortfolioResult> asyncHandler);

    /**
     * <p>
     * Associates a self-service action with a provisioning artifact.
     * </p>
     * 
     * @param associateServiceActionWithProvisioningArtifactRequest
     * @return A Java Future containing the result of the AssociateServiceActionWithProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsync.AssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceActionWithProvisioningArtifactResult> associateServiceActionWithProvisioningArtifactAsync(
            AssociateServiceActionWithProvisioningArtifactRequest associateServiceActionWithProvisioningArtifactRequest);

    /**
     * <p>
     * Associates a self-service action with a provisioning artifact.
     * </p>
     * 
     * @param associateServiceActionWithProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateServiceActionWithProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.AssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateServiceActionWithProvisioningArtifactResult> associateServiceActionWithProvisioningArtifactAsync(
            AssociateServiceActionWithProvisioningArtifactRequest associateServiceActionWithProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateServiceActionWithProvisioningArtifactRequest, AssociateServiceActionWithProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Associate the specified TagOption with the specified portfolio or product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @return A Java Future containing the result of the AssociateTagOptionWithResource operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.AssociateTagOptionWithResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateTagOptionWithResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTagOptionWithResourceResult> associateTagOptionWithResourceAsync(
            AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest);

    /**
     * <p>
     * Associate the specified TagOption with the specified portfolio or product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTagOptionWithResource operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.AssociateTagOptionWithResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateTagOptionWithResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTagOptionWithResourceResult> associateTagOptionWithResourceAsync(
            AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTagOptionWithResourceRequest, AssociateTagOptionWithResourceResult> asyncHandler);

    /**
     * <p>
     * Associates multiple self-service actions with provisioning artifacts.
     * </p>
     * 
     * @param batchAssociateServiceActionWithProvisioningArtifactRequest
     * @return A Java Future containing the result of the BatchAssociateServiceActionWithProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsync.BatchAssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchAssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateServiceActionWithProvisioningArtifactResult> batchAssociateServiceActionWithProvisioningArtifactAsync(
            BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest);

    /**
     * <p>
     * Associates multiple self-service actions with provisioning artifacts.
     * </p>
     * 
     * @param batchAssociateServiceActionWithProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateServiceActionWithProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.BatchAssociateServiceActionWithProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchAssociateServiceActionWithProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateServiceActionWithProvisioningArtifactResult> batchAssociateServiceActionWithProvisioningArtifactAsync(
            BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateServiceActionWithProvisioningArtifactRequest, BatchAssociateServiceActionWithProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     * </p>
     * 
     * @param batchDisassociateServiceActionFromProvisioningArtifactRequest
     * @return A Java Future containing the result of the BatchDisassociateServiceActionFromProvisioningArtifact
     *         operation returned by the service.
     * @sample AWSServiceCatalogAsync.BatchDisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchDisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateServiceActionFromProvisioningArtifactResult> batchDisassociateServiceActionFromProvisioningArtifactAsync(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest batchDisassociateServiceActionFromProvisioningArtifactRequest);

    /**
     * <p>
     * Disassociates a batch of self-service actions from the specified provisioning artifact.
     * </p>
     * 
     * @param batchDisassociateServiceActionFromProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateServiceActionFromProvisioningArtifact
     *         operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.BatchDisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/BatchDisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateServiceActionFromProvisioningArtifactResult> batchDisassociateServiceActionFromProvisioningArtifactAsync(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest batchDisassociateServiceActionFromProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateServiceActionFromProvisioningArtifactRequest, BatchDisassociateServiceActionFromProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Copies the specified source product to the specified target product or a new product.
     * </p>
     * <p>
     * You can copy a product to the same account or another account. You can copy a product to the same region or
     * another region.
     * </p>
     * <p>
     * This operation is performed asynchronously. To track the progress of the operation, use
     * <a>DescribeCopyProductStatus</a>.
     * </p>
     * 
     * @param copyProductRequest
     * @return A Java Future containing the result of the CopyProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.CopyProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyProductResult> copyProductAsync(CopyProductRequest copyProductRequest);

    /**
     * <p>
     * Copies the specified source product to the specified target product or a new product.
     * </p>
     * <p>
     * You can copy a product to the same account or another account. You can copy a product to the same region or
     * another region.
     * </p>
     * <p>
     * This operation is performed asynchronously. To track the progress of the operation, use
     * <a>DescribeCopyProductStatus</a>.
     * </p>
     * 
     * @param copyProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CopyProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyProductResult> copyProductAsync(CopyProductRequest copyProductRequest,
            com.amazonaws.handlers.AsyncHandler<CopyProductRequest, CopyProductResult> asyncHandler);

    /**
     * <p>
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return A Java Future containing the result of the CreateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest createConstraintRequest);

    /**
     * <p>
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest createConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConstraintRequest, CreateConstraintResult> asyncHandler);

    /**
     * <p>
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return A Java Future containing the result of the CreatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest createPortfolioRequest);

    /**
     * <p>
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest createPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioRequest, CreatePortfolioResult> asyncHandler);

    /**
     * <p>
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node
     * can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
     * create a portfolio share to an organization node.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return A Java Future containing the result of the CreatePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreatePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest createPortfolioShareRequest);

    /**
     * <p>
     * Shares the specified portfolio with the specified account or organization node. Shares to an organization node
     * can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
     * create a portfolio share to an organization node.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreatePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest createPortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioShareRequest, CreatePortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @return A Java Future containing the result of the CreateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest createProductRequest);

    /**
     * <p>
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest createProductRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProductRequest, CreateProductResult> asyncHandler);

    /**
     * <p>
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
     * (when updating a provisioned product) when the plan is executed.
     * </p>
     * <p>
     * You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
     * product status must be AVAILBLE or TAINTED.
     * </p>
     * <p>
     * To view the resource changes in the change set, use <a>DescribeProvisionedProductPlan</a>. To create or modify
     * the provisioned product, use <a>ExecuteProvisionedProductPlan</a>.
     * </p>
     * 
     * @param createProvisionedProductPlanRequest
     * @return A Java Future containing the result of the CreateProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.CreateProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisionedProductPlanResult> createProvisionedProductPlanAsync(
            CreateProvisionedProductPlanRequest createProvisionedProductPlanRequest);

    /**
     * <p>
     * Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
     * (when updating a provisioned product) when the plan is executed.
     * </p>
     * <p>
     * You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
     * product status must be AVAILBLE or TAINTED.
     * </p>
     * <p>
     * To view the resource changes in the change set, use <a>DescribeProvisionedProductPlan</a>. To create or modify
     * the provisioned product, use <a>ExecuteProvisionedProductPlan</a>.
     * </p>
     * 
     * @param createProvisionedProductPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.CreateProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisionedProductPlanResult> createProvisionedProductPlanAsync(
            CreateProvisionedProductPlanRequest createProvisionedProductPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProvisionedProductPlanRequest, CreateProvisionedProductPlanResult> asyncHandler);

    /**
     * <p>
     * Creates a provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest);

    /**
     * <p>
     * Creates a provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProvisioningArtifactRequest, CreateProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Creates a self-service action.
     * </p>
     * 
     * @param createServiceActionRequest
     * @return A Java Future containing the result of the CreateServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceActionResult> createServiceActionAsync(CreateServiceActionRequest createServiceActionRequest);

    /**
     * <p>
     * Creates a self-service action.
     * </p>
     * 
     * @param createServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceActionResult> createServiceActionAsync(CreateServiceActionRequest createServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceActionRequest, CreateServiceActionResult> asyncHandler);

    /**
     * <p>
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @return A Java Future containing the result of the CreateTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTagOptionResult> createTagOptionAsync(CreateTagOptionRequest createTagOptionRequest);

    /**
     * <p>
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTagOptionResult> createTagOptionAsync(CreateTagOptionRequest createTagOptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagOptionRequest, CreateTagOptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return A Java Future containing the result of the DeleteConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest deleteConstraintRequest);

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest deleteConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConstraintRequest, DeleteConstraintResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified portfolio.
     * </p>
     * <p>
     * You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
     * shared accounts.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return A Java Future containing the result of the DeletePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeletePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest deletePortfolioRequest);

    /**
     * <p>
     * Deletes the specified portfolio.
     * </p>
     * <p>
     * You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
     * shared accounts.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeletePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest deletePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioRequest, DeletePortfolioResult> asyncHandler);

    /**
     * <p>
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
     * node can only be deleted by the master account of an Organization.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return A Java Future containing the result of the DeletePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeletePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest deletePortfolioShareRequest);

    /**
     * <p>
     * Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
     * node can only be deleted by the master account of an Organization.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeletePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest deletePortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioShareRequest, DeletePortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return A Java Future containing the result of the DeleteProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest deleteProductRequest);

    /**
     * <p>
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest deleteProductRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProductRequest, DeleteProductResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified plan.
     * </p>
     * 
     * @param deleteProvisionedProductPlanRequest
     * @return A Java Future containing the result of the DeleteProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DeleteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedProductPlanResult> deleteProvisionedProductPlanAsync(
            DeleteProvisionedProductPlanRequest deleteProvisionedProductPlanRequest);

    /**
     * <p>
     * Deletes the specified plan.
     * </p>
     * 
     * @param deleteProvisionedProductPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisionedProductPlanResult> deleteProvisionedProductPlanAsync(
            DeleteProvisionedProductPlanRequest deleteProvisionedProductPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisionedProductPlanRequest, DeleteProvisionedProductPlanResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
     * the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest);

    /**
     * <p>
     * Deletes the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
     * the last provisioning artifact for a product, because a product must have at least one provisioning artifact.
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisioningArtifactRequest, DeleteProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Deletes a self-service action.
     * </p>
     * 
     * @param deleteServiceActionRequest
     * @return A Java Future containing the result of the DeleteServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceActionResult> deleteServiceActionAsync(DeleteServiceActionRequest deleteServiceActionRequest);

    /**
     * <p>
     * Deletes a self-service action.
     * </p>
     * 
     * @param deleteServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceActionResult> deleteServiceActionAsync(DeleteServiceActionRequest deleteServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceActionRequest, DeleteServiceActionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified TagOption.
     * </p>
     * <p>
     * You cannot delete a TagOption if it is associated with a product or portfolio.
     * </p>
     * 
     * @param deleteTagOptionRequest
     * @return A Java Future containing the result of the DeleteTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagOptionResult> deleteTagOptionAsync(DeleteTagOptionRequest deleteTagOptionRequest);

    /**
     * <p>
     * Deletes the specified TagOption.
     * </p>
     * <p>
     * You cannot delete a TagOption if it is associated with a product or portfolio.
     * </p>
     * 
     * @param deleteTagOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagOptionResult> deleteTagOptionAsync(DeleteTagOptionRequest deleteTagOptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagOptionRequest, DeleteTagOptionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return A Java Future containing the result of the DescribeConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest describeConstraintRequest);

    /**
     * <p>
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest describeConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConstraintRequest, DescribeConstraintResult> asyncHandler);

    /**
     * <p>
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @return A Java Future containing the result of the DescribeCopyProductStatus operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeCopyProductStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeCopyProductStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCopyProductStatusResult> describeCopyProductStatusAsync(
            DescribeCopyProductStatusRequest describeCopyProductStatusRequest);

    /**
     * <p>
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCopyProductStatus operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeCopyProductStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeCopyProductStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCopyProductStatusResult> describeCopyProductStatusAsync(
            DescribeCopyProductStatusRequest describeCopyProductStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCopyProductStatusRequest, DescribeCopyProductStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return A Java Future containing the result of the DescribePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest describePortfolioRequest);

    /**
     * <p>
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest describePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePortfolioRequest, DescribePortfolioResult> asyncHandler);

    /**
     * <p>
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in
     * the organization.
     * </p>
     * 
     * @param describePortfolioShareStatusRequest
     * @return A Java Future containing the result of the DescribePortfolioShareStatus operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribePortfolioShareStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShareStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePortfolioShareStatusResult> describePortfolioShareStatusAsync(
            DescribePortfolioShareStatusRequest describePortfolioShareStatusRequest);

    /**
     * <p>
     * Gets the status of the specified portfolio share operation. This API can only be called by the master account in
     * the organization.
     * </p>
     * 
     * @param describePortfolioShareStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePortfolioShareStatus operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DescribePortfolioShareStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShareStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePortfolioShareStatusResult> describePortfolioShareStatusAsync(
            DescribePortfolioShareStatusRequest describePortfolioShareStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePortfolioShareStatusRequest, DescribePortfolioShareStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @return A Java Future containing the result of the DescribeProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest describeProductRequest);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest describeProductRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified product. This operation is run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProductAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest describeProductAsAdminRequest);

    /**
     * <p>
     * Gets information about the specified product. This operation is run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProductAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest describeProductAsAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductAsAdminRequest, DescribeProductAsAdminResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return A Java Future containing the result of the DescribeProductView operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProductView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest describeProductViewRequest);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProductView operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProductView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest describeProductViewRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @return A Java Future containing the result of the DescribeProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisionedProductResult> describeProvisionedProductAsync(
            DescribeProvisionedProductRequest describeProvisionedProductRequest);

    /**
     * <p>
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisionedProductResult> describeProvisionedProductAsync(
            DescribeProvisionedProductRequest describeProvisionedProductRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisionedProductRequest, DescribeProvisionedProductResult> asyncHandler);

    /**
     * <p>
     * Gets information about the resource changes for the specified plan.
     * </p>
     * 
     * @param describeProvisionedProductPlanRequest
     * @return A Java Future containing the result of the DescribeProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribeProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisionedProductPlanResult> describeProvisionedProductPlanAsync(
            DescribeProvisionedProductPlanRequest describeProvisionedProductPlanRequest);

    /**
     * <p>
     * Gets information about the resource changes for the specified plan.
     * </p>
     * 
     * @param describeProvisionedProductPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisionedProductPlanResult> describeProvisionedProductPlanAsync(
            DescribeProvisionedProductPlanRequest describeProvisionedProductPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisionedProductPlanRequest, DescribeProvisionedProductPlanResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return A Java Future containing the result of the DescribeProvisioningArtifact operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribeProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest);

    /**
     * <p>
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProvisioningArtifact operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningArtifactRequest, DescribeProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Gets information about the configuration required to provision the specified product using the specified
     * provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
     * The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
     * <a>ProvisionProduct</a>, do not include conflicted TagOption keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>". Tag the provisioned
     * product with the value <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return A Java Future containing the result of the DescribeProvisioningParameters operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribeProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest);

    /**
     * <p>
     * Gets information about the configuration required to provision the specified product using the specified
     * provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
     * The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
     * <a>ProvisionProduct</a>, do not include conflicted TagOption keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>". Tag the provisioned
     * product with the value <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProvisioningParameters operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified request operation.
     * </p>
     * <p>
     * Use this operation after calling a request operation (for example, <a>ProvisionProduct</a>,
     * <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @return A Java Future containing the result of the DescribeRecord operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeRecord" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest describeRecordRequest);

    /**
     * <p>
     * Gets information about the specified request operation.
     * </p>
     * <p>
     * Use this operation after calling a request operation (for example, <a>ProvisionProduct</a>,
     * <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecord operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeRecord" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest describeRecordRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler);

    /**
     * <p>
     * Describes a self-service action.
     * </p>
     * 
     * @param describeServiceActionRequest
     * @return A Java Future containing the result of the DescribeServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceActionResult> describeServiceActionAsync(DescribeServiceActionRequest describeServiceActionRequest);

    /**
     * <p>
     * Describes a self-service action.
     * </p>
     * 
     * @param describeServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceActionResult> describeServiceActionAsync(DescribeServiceActionRequest describeServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceActionRequest, DescribeServiceActionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @return A Java Future containing the result of the DescribeTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagOptionResult> describeTagOptionAsync(DescribeTagOptionRequest describeTagOptionRequest);

    /**
     * <p>
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagOptionResult> describeTagOptionAsync(DescribeTagOptionRequest describeTagOptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagOptionRequest, DescribeTagOptionResult> asyncHandler);

    /**
     * <p>
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
     * it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
     * with your organization structure if it changes after calling this API. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param disableAWSOrganizationsAccessRequest
     * @return A Java Future containing the result of the DisableAWSOrganizationsAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DisableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAWSOrganizationsAccessResult> disableAWSOrganizationsAccessAsync(
            DisableAWSOrganizationsAccessRequest disableAWSOrganizationsAccessRequest);

    /**
     * <p>
     * Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
     * it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
     * with your organization structure if it changes after calling this API. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param disableAWSOrganizationsAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableAWSOrganizationsAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DisableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAWSOrganizationsAccessResult> disableAWSOrganizationsAccessAsync(
            DisableAWSOrganizationsAccessRequest disableAWSOrganizationsAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAWSOrganizationsAccessRequest, DisableAWSOrganizationsAccessResult> asyncHandler);

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return A Java Future containing the result of the DisassociatePrincipalFromPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DisassociatePrincipalFromPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociatePrincipalFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest);

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePrincipalFromPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DisassociatePrincipalFromPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociatePrincipalFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePrincipalFromPortfolioResult> disassociatePrincipalFromPortfolioAsync(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePrincipalFromPortfolioRequest, DisassociatePrincipalFromPortfolioResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @return A Java Future containing the result of the DisassociateProductFromPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DisassociateProductFromPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateProductFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest);

    /**
     * <p>
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateProductFromPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DisassociateProductFromPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateProductFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateProductFromPortfolioRequest, DisassociateProductFromPortfolioResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     * </p>
     * 
     * @param disassociateServiceActionFromProvisioningArtifactRequest
     * @return A Java Future containing the result of the DisassociateServiceActionFromProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsync.DisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceActionFromProvisioningArtifactResult> disassociateServiceActionFromProvisioningArtifactAsync(
            DisassociateServiceActionFromProvisioningArtifactRequest disassociateServiceActionFromProvisioningArtifactRequest);

    /**
     * <p>
     * Disassociates the specified self-service action association from the specified provisioning artifact.
     * </p>
     * 
     * @param disassociateServiceActionFromProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateServiceActionFromProvisioningArtifact operation
     *         returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DisassociateServiceActionFromProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateServiceActionFromProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateServiceActionFromProvisioningArtifactResult> disassociateServiceActionFromProvisioningArtifactAsync(
            DisassociateServiceActionFromProvisioningArtifactRequest disassociateServiceActionFromProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateServiceActionFromProvisioningArtifactRequest, DisassociateServiceActionFromProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @return A Java Future containing the result of the DisassociateTagOptionFromResource operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DisassociateTagOptionFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateTagOptionFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTagOptionFromResourceResult> disassociateTagOptionFromResourceAsync(
            DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest);

    /**
     * <p>
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTagOptionFromResource operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.DisassociateTagOptionFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateTagOptionFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTagOptionFromResourceResult> disassociateTagOptionFromResourceAsync(
            DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTagOptionFromResourceRequest, DisassociateTagOptionFromResourceResult> asyncHandler);

    /**
     * <p>
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
     * updates on your organization in order to sync your shares with the current structure. This API can only be called
     * by the master account in the organization.
     * </p>
     * <p>
     * By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
     * that your shares can be in sync with any changes in your AWS Organizations structure.
     * </p>
     * 
     * @param enableAWSOrganizationsAccessRequest
     * @return A Java Future containing the result of the EnableAWSOrganizationsAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.EnableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/EnableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAWSOrganizationsAccessResult> enableAWSOrganizationsAccessAsync(
            EnableAWSOrganizationsAccessRequest enableAWSOrganizationsAccessRequest);

    /**
     * <p>
     * Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
     * updates on your organization in order to sync your shares with the current structure. This API can only be called
     * by the master account in the organization.
     * </p>
     * <p>
     * By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
     * that your shares can be in sync with any changes in your AWS Organizations structure.
     * </p>
     * 
     * @param enableAWSOrganizationsAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAWSOrganizationsAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.EnableAWSOrganizationsAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/EnableAWSOrganizationsAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAWSOrganizationsAccessResult> enableAWSOrganizationsAccessAsync(
            EnableAWSOrganizationsAccessRequest enableAWSOrganizationsAccessRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAWSOrganizationsAccessRequest, EnableAWSOrganizationsAccessResult> asyncHandler);

    /**
     * <p>
     * Provisions or modifies a product based on the resource changes for the specified plan.
     * </p>
     * 
     * @param executeProvisionedProductPlanRequest
     * @return A Java Future containing the result of the ExecuteProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.ExecuteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteProvisionedProductPlanResult> executeProvisionedProductPlanAsync(
            ExecuteProvisionedProductPlanRequest executeProvisionedProductPlanRequest);

    /**
     * <p>
     * Provisions or modifies a product based on the resource changes for the specified plan.
     * </p>
     * 
     * @param executeProvisionedProductPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteProvisionedProductPlan operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.ExecuteProvisionedProductPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteProvisionedProductPlanResult> executeProvisionedProductPlanAsync(
            ExecuteProvisionedProductPlanRequest executeProvisionedProductPlanRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteProvisionedProductPlanRequest, ExecuteProvisionedProductPlanResult> asyncHandler);

    /**
     * <p>
     * Executes a self-service action against a provisioned product.
     * </p>
     * 
     * @param executeProvisionedProductServiceActionRequest
     * @return A Java Future containing the result of the ExecuteProvisionedProductServiceAction operation returned by
     *         the service.
     * @sample AWSServiceCatalogAsync.ExecuteProvisionedProductServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteProvisionedProductServiceActionResult> executeProvisionedProductServiceActionAsync(
            ExecuteProvisionedProductServiceActionRequest executeProvisionedProductServiceActionRequest);

    /**
     * <p>
     * Executes a self-service action against a provisioned product.
     * </p>
     * 
     * @param executeProvisionedProductServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteProvisionedProductServiceAction operation returned by
     *         the service.
     * @sample AWSServiceCatalogAsyncHandler.ExecuteProvisionedProductServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteProvisionedProductServiceActionResult> executeProvisionedProductServiceActionAsync(
            ExecuteProvisionedProductServiceActionRequest executeProvisionedProductServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteProvisionedProductServiceActionRequest, ExecuteProvisionedProductServiceActionResult> asyncHandler);

    /**
     * <p>
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param getAWSOrganizationsAccessStatusRequest
     * @return A Java Future containing the result of the GetAWSOrganizationsAccessStatus operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.GetAWSOrganizationsAccessStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetAWSOrganizationsAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAWSOrganizationsAccessStatusResult> getAWSOrganizationsAccessStatusAsync(
            GetAWSOrganizationsAccessStatusRequest getAWSOrganizationsAccessStatusRequest);

    /**
     * <p>
     * Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
     * account in the organization.
     * </p>
     * 
     * @param getAWSOrganizationsAccessStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAWSOrganizationsAccessStatus operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.GetAWSOrganizationsAccessStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetAWSOrganizationsAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAWSOrganizationsAccessStatusResult> getAWSOrganizationsAccessStatusAsync(
            GetAWSOrganizationsAccessStatusRequest getAWSOrganizationsAccessStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetAWSOrganizationsAccessStatusRequest, GetAWSOrganizationsAccessStatusResult> asyncHandler);

    /**
     * <p>
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListAcceptedPortfolioShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListAcceptedPortfolioShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest);

    /**
     * <p>
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListAcceptedPortfolioShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListAcceptedPortfolioShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAcceptedPortfolioSharesRequest, ListAcceptedPortfolioSharesResult> asyncHandler);

    /**
     * <p>
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListConstraintsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListConstraintsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest);

    /**
     * <p>
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListConstraintsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListConstraintsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<ListConstraintsForPortfolioRequest, ListConstraintsForPortfolioResult> asyncHandler);

    /**
     * <p>
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is
     * necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return A Java Future containing the result of the ListLaunchPaths operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListLaunchPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListLaunchPaths" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest listLaunchPathsRequest);

    /**
     * <p>
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is
     * necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLaunchPaths operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListLaunchPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListLaunchPaths" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest listLaunchPathsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler);

    /**
     * <p>
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
     * master account in the organization.
     * </p>
     * 
     * @param listOrganizationPortfolioAccessRequest
     * @return A Java Future containing the result of the ListOrganizationPortfolioAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.ListOrganizationPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListOrganizationPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationPortfolioAccessResult> listOrganizationPortfolioAccessAsync(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest);

    /**
     * <p>
     * Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
     * master account in the organization.
     * </p>
     * 
     * @param listOrganizationPortfolioAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationPortfolioAccess operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsyncHandler.ListOrganizationPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListOrganizationPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationPortfolioAccessResult> listOrganizationPortfolioAccessAsync(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationPortfolioAccessRequest, ListOrganizationPortfolioAccessResult> asyncHandler);

    /**
     * <p>
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return A Java Future containing the result of the ListPortfolioAccess operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest listPortfolioAccessRequest);

    /**
     * <p>
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortfolioAccess operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest listPortfolioAccessRequest,
            com.amazonaws.handlers.AsyncHandler<ListPortfolioAccessRequest, ListPortfolioAccessResult> asyncHandler);

    /**
     * <p>
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @return A Java Future containing the result of the ListPortfolios operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListPortfolios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolios" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest listPortfoliosRequest);

    /**
     * <p>
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortfolios operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListPortfolios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolios" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfoliosResult> listPortfoliosAsync(ListPortfoliosRequest listPortfoliosRequest,
            com.amazonaws.handlers.AsyncHandler<ListPortfoliosRequest, ListPortfoliosResult> asyncHandler);

    /**
     * <p>
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @return A Java Future containing the result of the ListPortfoliosForProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListPortfoliosForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfoliosForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest listPortfoliosForProductRequest);

    /**
     * <p>
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortfoliosForProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListPortfoliosForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfoliosForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPortfoliosForProductResult> listPortfoliosForProductAsync(ListPortfoliosForProductRequest listPortfoliosForProductRequest,
            com.amazonaws.handlers.AsyncHandler<ListPortfoliosForProductRequest, ListPortfoliosForProductResult> asyncHandler);

    /**
     * <p>
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @return A Java Future containing the result of the ListPrincipalsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListPrincipalsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPrincipalsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(
            ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest);

    /**
     * <p>
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrincipalsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListPrincipalsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPrincipalsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(
            ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalsForPortfolioRequest, ListPrincipalsForPortfolioResult> asyncHandler);

    /**
     * <p>
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     * </p>
     * 
     * @param listProvisionedProductPlansRequest
     * @return A Java Future containing the result of the ListProvisionedProductPlans operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListProvisionedProductPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisionedProductPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedProductPlansResult> listProvisionedProductPlansAsync(
            ListProvisionedProductPlansRequest listProvisionedProductPlansRequest);

    /**
     * <p>
     * Lists the plans for the specified provisioned product or all plans to which the user has access.
     * </p>
     * 
     * @param listProvisionedProductPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisionedProductPlans operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListProvisionedProductPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisionedProductPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisionedProductPlansResult> listProvisionedProductPlansAsync(
            ListProvisionedProductPlansRequest listProvisionedProductPlansRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedProductPlansRequest, ListProvisionedProductPlansResult> asyncHandler);

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListProvisioningArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest);

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListProvisioningArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsRequest, ListProvisioningArtifactsResult> asyncHandler);

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     * </p>
     * 
     * @param listProvisioningArtifactsForServiceActionRequest
     * @return A Java Future containing the result of the ListProvisioningArtifactsForServiceAction operation returned
     *         by the service.
     * @sample AWSServiceCatalogAsync.ListProvisioningArtifactsForServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifactsForServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisioningArtifactsForServiceActionResult> listProvisioningArtifactsForServiceActionAsync(
            ListProvisioningArtifactsForServiceActionRequest listProvisioningArtifactsForServiceActionRequest);

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified self-service action.
     * </p>
     * 
     * @param listProvisioningArtifactsForServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisioningArtifactsForServiceAction operation returned
     *         by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListProvisioningArtifactsForServiceAction
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifactsForServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProvisioningArtifactsForServiceActionResult> listProvisioningArtifactsForServiceActionAsync(
            ListProvisioningArtifactsForServiceActionRequest listProvisioningArtifactsForServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsForServiceActionRequest, ListProvisioningArtifactsForServiceActionResult> asyncHandler);

    /**
     * <p>
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return A Java Future containing the result of the ListRecordHistory operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListRecordHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListRecordHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest listRecordHistoryRequest);

    /**
     * <p>
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecordHistory operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListRecordHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListRecordHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest listRecordHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @return A Java Future containing the result of the ListResourcesForTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListResourcesForTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForTagOptionResult> listResourcesForTagOptionAsync(
            ListResourcesForTagOptionRequest listResourcesForTagOptionRequest);

    /**
     * <p>
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcesForTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListResourcesForTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesForTagOptionResult> listResourcesForTagOptionAsync(
            ListResourcesForTagOptionRequest listResourcesForTagOptionRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesForTagOptionRequest, ListResourcesForTagOptionResult> asyncHandler);

    /**
     * <p>
     * Lists all self-service actions.
     * </p>
     * 
     * @param listServiceActionsRequest
     * @return A Java Future containing the result of the ListServiceActions operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListServiceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceActionsResult> listServiceActionsAsync(ListServiceActionsRequest listServiceActionsRequest);

    /**
     * <p>
     * Lists all self-service actions.
     * </p>
     * 
     * @param listServiceActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceActions operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListServiceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceActionsResult> listServiceActionsAsync(ListServiceActionsRequest listServiceActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceActionsRequest, ListServiceActionsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
     * Artifact ID.
     * </p>
     * 
     * @param listServiceActionsForProvisioningArtifactRequest
     * @return A Java Future containing the result of the ListServiceActionsForProvisioningArtifact operation returned
     *         by the service.
     * @sample AWSServiceCatalogAsync.ListServiceActionsForProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActionsForProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceActionsForProvisioningArtifactResult> listServiceActionsForProvisioningArtifactAsync(
            ListServiceActionsForProvisioningArtifactRequest listServiceActionsForProvisioningArtifactRequest);

    /**
     * <p>
     * Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
     * Artifact ID.
     * </p>
     * 
     * @param listServiceActionsForProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceActionsForProvisioningArtifact operation returned
     *         by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListServiceActionsForProvisioningArtifact
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListServiceActionsForProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceActionsForProvisioningArtifactResult> listServiceActionsForProvisioningArtifactAsync(
            ListServiceActionsForProvisioningArtifactRequest listServiceActionsForProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceActionsForProvisioningArtifactRequest, ListServiceActionsForProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @return A Java Future containing the result of the ListTagOptions operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListTagOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagOptionsResult> listTagOptionsAsync(ListTagOptionsRequest listTagOptionsRequest);

    /**
     * <p>
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagOptions operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListTagOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagOptionsResult> listTagOptionsAsync(ListTagOptionsRequest listTagOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagOptionsRequest, ListTagOptionsResult> asyncHandler);

    /**
     * <p>
     * Provisions the specified product.
     * </p>
     * <p>
     * A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
     * CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
     * this request using <a>DescribeRecord</a>.
     * </p>
     * <p>
     * If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
     * include conflicted keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>".
     * </p>
     * 
     * @param provisionProductRequest
     * @return A Java Future containing the result of the ProvisionProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.ProvisionProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest provisionProductRequest);

    /**
     * <p>
     * Provisions the specified product.
     * </p>
     * <p>
     * A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
     * CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
     * this request using <a>DescribeRecord</a>.
     * </p>
     * <p>
     * If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
     * include conflicted keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>".
     * </p>
     * 
     * @param provisionProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvisionProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ProvisionProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest provisionProductRequest,
            com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler);

    /**
     * <p>
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return A Java Future containing the result of the RejectPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.RejectPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RejectPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest rejectPortfolioShareRequest);

    /**
     * <p>
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.RejectPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RejectPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest rejectPortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<RejectPortfolioShareRequest, RejectPortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * <p>
     * To use additional filtering, see <a>SearchProvisionedProducts</a>.
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return A Java Future containing the result of the ScanProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsync.ScanProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ScanProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest scanProvisionedProductsRequest);

    /**
     * <p>
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * <p>
     * To use additional filtering, see <a>SearchProvisionedProducts</a>.
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScanProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ScanProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ScanProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest scanProvisionedProductsRequest,
            com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @return A Java Future containing the result of the SearchProducts operation returned by the service.
     * @sample AWSServiceCatalogAsync.SearchProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest searchProductsRequest);

    /**
     * <p>
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProducts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.SearchProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest searchProductsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the products for the specified portfolio or all products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsync.SearchProductsAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProductsAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest searchProductsAsAdminRequest);

    /**
     * <p>
     * Gets information about the products for the specified portfolio or all products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.SearchProductsAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProductsAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest searchProductsAsAdminRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProductsAsAdminRequest, SearchProductsAsAdminResult> asyncHandler);

    /**
     * <p>
     * Gets information about the provisioned products that meet the specified criteria.
     * </p>
     * 
     * @param searchProvisionedProductsRequest
     * @return A Java Future containing the result of the SearchProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsync.SearchProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProvisionedProductsResult> searchProvisionedProductsAsync(
            SearchProvisionedProductsRequest searchProvisionedProductsRequest);

    /**
     * <p>
     * Gets information about the provisioned products that meet the specified criteria.
     * </p>
     * 
     * @param searchProvisionedProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.SearchProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchProvisionedProductsResult> searchProvisionedProductsAsync(
            SearchProvisionedProductsRequest searchProvisionedProductsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProvisionedProductsRequest, SearchProvisionedProductsResult> asyncHandler);

    /**
     * <p>
     * Terminates the specified provisioned product.
     * </p>
     * <p>
     * This operation does not delete any records associated with the provisioned product.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @return A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.TerminateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/TerminateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest);

    /**
     * <p>
     * Terminates the specified provisioned product.
     * </p>
     * <p>
     * This operation does not delete any records associated with the provisioned product.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.TerminateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/TerminateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler);

    /**
     * <p>
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return A Java Future containing the result of the UpdateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest updateConstraintRequest);

    /**
     * <p>
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest updateConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConstraintRequest, UpdateConstraintResult> asyncHandler);

    /**
     * <p>
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return A Java Future containing the result of the UpdatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest updatePortfolioRequest);

    /**
     * <p>
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest updatePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePortfolioRequest, UpdatePortfolioResult> asyncHandler);

    /**
     * <p>
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @return A Java Future containing the result of the UpdateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest updateProductRequest);

    /**
     * <p>
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest updateProductRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProductRequest, UpdateProductResult> asyncHandler);

    /**
     * <p>
     * Requests updates to the configuration of the specified provisioned product.
     * </p>
     * <p>
     * If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
     * requested, this operation can update with no interruption, with some interruption, or replace the provisioned
     * product entirely.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest updateProvisionedProductRequest);

    /**
     * <p>
     * Requests updates to the configuration of the specified provisioned product.
     * </p>
     * <p>
     * If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
     * requested, this operation can update with no interruption, with some interruption, or replace the provisioned
     * product entirely.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest updateProvisionedProductRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler);

    /**
     * <p>
     * Updates the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest);

    /**
     * <p>
     * Updates the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisioningArtifactRequest, UpdateProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Updates a self-service action.
     * </p>
     * 
     * @param updateServiceActionRequest
     * @return A Java Future containing the result of the UpdateServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceActionResult> updateServiceActionAsync(UpdateServiceActionRequest updateServiceActionRequest);

    /**
     * <p>
     * Updates a self-service action.
     * </p>
     * 
     * @param updateServiceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceAction operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateServiceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateServiceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceActionResult> updateServiceActionAsync(UpdateServiceActionRequest updateServiceActionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceActionRequest, UpdateServiceActionResult> asyncHandler);

    /**
     * <p>
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @return A Java Future containing the result of the UpdateTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTagOptionResult> updateTagOptionAsync(UpdateTagOptionRequest updateTagOptionRequest);

    /**
     * <p>
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTagOption operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTagOptionResult> updateTagOptionAsync(UpdateTagOptionRequest updateTagOptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTagOptionRequest, UpdateTagOptionResult> asyncHandler);

}
