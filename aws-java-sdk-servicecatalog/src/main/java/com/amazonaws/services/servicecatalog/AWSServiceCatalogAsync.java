/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>Overview</b>
 * </p>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> allows organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. This documentation provides reference material for the AWS
 * Service Catalog end user API. To get the most out of this documentation, you need to be familiar with the terminology
 * discussed in <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/what-is_concepts.html">AWS Service
 * Catalog Concepts</a>.
 * </p>
 * <p>
 * <i>Additional Resources</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">AWS Service Catalog
 * Administrator Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/servicecatalog/latest/userguide/introduction.html">AWS Service Catalog User
 * Guide</a>
 * </p>
 * </li>
 * </ul>
 */
public interface AWSServiceCatalogAsync extends AWSServiceCatalog {

    /**
     * <p>
     * Accepts an offer to share a portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return A Java Future containing the result of the AcceptPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.AcceptPortfolioShare
     */
    java.util.concurrent.Future<AcceptPortfolioShareResult> acceptPortfolioShareAsync(AcceptPortfolioShareRequest acceptPortfolioShareRequest);

    /**
     * <p>
     * Accepts an offer to share a portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.AcceptPortfolioShare
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
     */
    java.util.concurrent.Future<AssociatePrincipalWithPortfolioResult> associatePrincipalWithPortfolioAsync(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePrincipalWithPortfolioRequest, AssociatePrincipalWithPortfolioResult> asyncHandler);

    /**
     * <p>
     * Associates a product with a portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return A Java Future containing the result of the AssociateProductWithPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.AssociateProductWithPortfolio
     */
    java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest);

    /**
     * <p>
     * Associates a product with a portfolio.
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
     */
    java.util.concurrent.Future<AssociateProductWithPortfolioResult> associateProductWithPortfolioAsync(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProductWithPortfolioRequest, AssociateProductWithPortfolioResult> asyncHandler);

    /**
     * <p>
     * Creates a new constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return A Java Future containing the result of the CreateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateConstraint
     */
    java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest createConstraintRequest);

    /**
     * <p>
     * Creates a new constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateConstraint
     */
    java.util.concurrent.Future<CreateConstraintResult> createConstraintAsync(CreateConstraintRequest createConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConstraintRequest, CreateConstraintResult> asyncHandler);

    /**
     * <p>
     * Creates a new portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return A Java Future containing the result of the CreatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreatePortfolio
     */
    java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest createPortfolioRequest);

    /**
     * <p>
     * Creates a new portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreatePortfolio
     */
    java.util.concurrent.Future<CreatePortfolioResult> createPortfolioAsync(CreatePortfolioRequest createPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioRequest, CreatePortfolioResult> asyncHandler);

    /**
     * <p>
     * Creates a new portfolio share.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return A Java Future containing the result of the CreatePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreatePortfolioShare
     */
    java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest createPortfolioShareRequest);

    /**
     * <p>
     * Creates a new portfolio share.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreatePortfolioShare
     */
    java.util.concurrent.Future<CreatePortfolioShareResult> createPortfolioShareAsync(CreatePortfolioShareRequest createPortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePortfolioShareRequest, CreatePortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Creates a new product.
     * </p>
     * 
     * @param createProductRequest
     * @return A Java Future containing the result of the CreateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateProduct
     */
    java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest createProductRequest);

    /**
     * <p>
     * Creates a new product.
     * </p>
     * 
     * @param createProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateProduct
     */
    java.util.concurrent.Future<CreateProductResult> createProductAsync(CreateProductRequest createProductRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProductRequest, CreateProductResult> asyncHandler);

    /**
     * <p>
     * Create a new provisioning artifact for the specified product. This operation will not work with a product that
     * has been shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.CreateProvisioningArtifact
     */
    java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest);

    /**
     * <p>
     * Create a new provisioning artifact for the specified product. This operation will not work with a product that
     * has been shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.CreateProvisioningArtifact
     */
    java.util.concurrent.Future<CreateProvisioningArtifactResult> createProvisioningArtifactAsync(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProvisioningArtifactRequest, CreateProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return A Java Future containing the result of the DeleteConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteConstraint
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
     */
    java.util.concurrent.Future<DeleteConstraintResult> deleteConstraintAsync(DeleteConstraintRequest deleteConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConstraintRequest, DeleteConstraintResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified portfolio. This operation will not work with a portfolio that has been shared with you or
     * if it has products, users, constraints, or shared accounts associated with it.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return A Java Future containing the result of the DeletePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeletePortfolio
     */
    java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest deletePortfolioRequest);

    /**
     * <p>
     * Deletes the specified portfolio. This operation will not work with a portfolio that has been shared with you or
     * if it has products, users, constraints, or shared accounts associated with it.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeletePortfolio
     */
    java.util.concurrent.Future<DeletePortfolioResult> deletePortfolioAsync(DeletePortfolioRequest deletePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioRequest, DeletePortfolioResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified portfolio share.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return A Java Future containing the result of the DeletePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeletePortfolioShare
     */
    java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest deletePortfolioShareRequest);

    /**
     * <p>
     * Deletes the specified portfolio share.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeletePortfolioShare
     */
    java.util.concurrent.Future<DeletePortfolioShareResult> deletePortfolioShareAsync(DeletePortfolioShareRequest deletePortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePortfolioShareRequest, DeletePortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified product. This operation will not work with a product that has been shared with you or is
     * associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return A Java Future containing the result of the DeleteProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteProduct
     */
    java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest deleteProductRequest);

    /**
     * <p>
     * Deletes the specified product. This operation will not work with a product that has been shared with you or is
     * associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteProduct
     */
    java.util.concurrent.Future<DeleteProductResult> deleteProductAsync(DeleteProductRequest deleteProductRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProductRequest, DeleteProductResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified provisioning artifact. This operation will not work on a provisioning artifact associated
     * with a product that has been shared with you, or on the last provisioning artifact associated with a product (a
     * product must have at least one provisioning artifact).
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.DeleteProvisioningArtifact
     */
    java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest);

    /**
     * <p>
     * Deletes the specified provisioning artifact. This operation will not work on a provisioning artifact associated
     * with a product that has been shared with you, or on the last provisioning artifact associated with a product (a
     * product must have at least one provisioning artifact).
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DeleteProvisioningArtifact
     */
    java.util.concurrent.Future<DeleteProvisioningArtifactResult> deleteProvisioningArtifactAsync(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisioningArtifactRequest, DeleteProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed information for a specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return A Java Future containing the result of the DescribeConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeConstraint
     */
    java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest describeConstraintRequest);

    /**
     * <p>
     * Retrieves detailed information for a specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeConstraint
     */
    java.util.concurrent.Future<DescribeConstraintResult> describeConstraintAsync(DescribeConstraintRequest describeConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConstraintRequest, DescribeConstraintResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed information and any tags associated with the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return A Java Future containing the result of the DescribePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribePortfolio
     */
    java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest describePortfolioRequest);

    /**
     * <p>
     * Retrieves detailed information and any tags associated with the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribePortfolio
     */
    java.util.concurrent.Future<DescribePortfolioResult> describePortfolioAsync(DescribePortfolioRequest describePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePortfolioRequest, DescribePortfolioResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProductView</a> except that it takes as input
     * <code>ProductId</code> instead of <code>ProductViewId</code>.
     * </p>
     * 
     * @param describeProductRequest
     * @return A Java Future containing the result of the DescribeProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProduct
     */
    java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest describeProductRequest);

    /**
     * <p>
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProductView</a> except that it takes as input
     * <code>ProductId</code> instead of <code>ProductViewId</code>.
     * </p>
     * 
     * @param describeProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProduct
     */
    java.util.concurrent.Future<DescribeProductResult> describeProductAsync(DescribeProductRequest describeProductRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductRequest, DescribeProductResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified product, run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProductAsAdmin
     */
    java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest describeProductAsAdminRequest);

    /**
     * <p>
     * Retrieves information about a specified product, run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProductAsAdmin
     */
    java.util.concurrent.Future<DescribeProductAsAdminResult> describeProductAsAdminAsync(DescribeProductAsAdminRequest describeProductAsAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductAsAdminRequest, DescribeProductAsAdminResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProduct</a> except that it takes as input
     * <code>ProductViewId</code> instead of <code>ProductId</code>.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return A Java Future containing the result of the DescribeProductView operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeProductView
     */
    java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest describeProductViewRequest);

    /**
     * <p>
     * Retrieves information about a specified product.
     * </p>
     * <p>
     * This operation is functionally identical to <a>DescribeProduct</a> except that it takes as input
     * <code>ProductViewId</code> instead of <code>ProductId</code>.
     * </p>
     * 
     * @param describeProductViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProductView operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeProductView
     */
    java.util.concurrent.Future<DescribeProductViewResult> describeProductViewAsync(DescribeProductViewRequest describeProductViewRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductViewRequest, DescribeProductViewResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed information about the specified provisioning artifact.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return A Java Future containing the result of the DescribeProvisioningArtifact operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribeProvisioningArtifact
     */
    java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest);

    /**
     * <p>
     * Retrieves detailed information about the specified provisioning artifact.
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
     */
    java.util.concurrent.Future<DescribeProvisioningArtifactResult> describeProvisioningArtifactAsync(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningArtifactRequest, DescribeProvisioningArtifactResult> asyncHandler);

    /**
     * <p>
     * Provides information about parameters required to provision a specified product in a specified manner. Use this
     * operation to obtain the list of <code>ProvisioningArtifactParameters</code> parameters available to call the
     * <a>ProvisionProduct</a> operation for the specified product.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return A Java Future containing the result of the DescribeProvisioningParameters operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DescribeProvisioningParameters
     */
    java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest);

    /**
     * <p>
     * Provides information about parameters required to provision a specified product in a specified manner. Use this
     * operation to obtain the list of <code>ProvisioningArtifactParameters</code> parameters available to call the
     * <a>ProvisionProduct</a> operation for the specified product.
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
     */
    java.util.concurrent.Future<DescribeProvisioningParametersResult> describeProvisioningParametersAsync(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProvisioningParametersRequest, DescribeProvisioningParametersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of the full details of a specific request. Use this operation after calling a request
     * operation (<a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @return A Java Future containing the result of the DescribeRecord operation returned by the service.
     * @sample AWSServiceCatalogAsync.DescribeRecord
     */
    java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest describeRecordRequest);

    /**
     * <p>
     * Retrieves a paginated list of the full details of a specific request. Use this operation after calling a request
     * operation (<a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecord operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.DescribeRecord
     */
    java.util.concurrent.Future<DescribeRecordResult> describeRecordAsync(DescribeRecordRequest describeRecordRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecordRequest, DescribeRecordResult> asyncHandler);

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return A Java Future containing the result of the DisassociatePrincipalFromPortfolio operation returned by the
     *         service.
     * @sample AWSServiceCatalogAsync.DisassociatePrincipalFromPortfolio
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
     */
    java.util.concurrent.Future<DisassociateProductFromPortfolioResult> disassociateProductFromPortfolioAsync(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateProductFromPortfolioRequest, DisassociateProductFromPortfolioResult> asyncHandler);

    /**
     * <p>
     * Lists details of all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListAcceptedPortfolioShares
     */
    java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest);

    /**
     * <p>
     * Lists details of all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListAcceptedPortfolioShares
     */
    java.util.concurrent.Future<ListAcceptedPortfolioSharesResult> listAcceptedPortfolioSharesAsync(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAcceptedPortfolioSharesRequest, ListAcceptedPortfolioSharesResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed constraint information for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListConstraintsForPortfolio
     */
    java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest);

    /**
     * <p>
     * Retrieves detailed constraint information for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListConstraintsForPortfolio
     */
    java.util.concurrent.Future<ListConstraintsForPortfolioResult> listConstraintsForPortfolioAsync(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<ListConstraintsForPortfolioRequest, ListConstraintsForPortfolioResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all paths to a specified product. A path is how the user has access to a specified
     * product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return A Java Future containing the result of the ListLaunchPaths operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListLaunchPaths
     */
    java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest listLaunchPathsRequest);

    /**
     * <p>
     * Returns a paginated list of all paths to a specified product. A path is how the user has access to a specified
     * product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLaunchPaths operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListLaunchPaths
     */
    java.util.concurrent.Future<ListLaunchPathsResult> listLaunchPathsAsync(ListLaunchPathsRequest listLaunchPathsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLaunchPathsRequest, ListLaunchPathsResult> asyncHandler);

    /**
     * <p>
     * Lists the account IDs that have been authorized sharing of the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return A Java Future containing the result of the ListPortfolioAccess operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListPortfolioAccess
     */
    java.util.concurrent.Future<ListPortfolioAccessResult> listPortfolioAccessAsync(ListPortfolioAccessRequest listPortfolioAccessRequest);

    /**
     * <p>
     * Lists the account IDs that have been authorized sharing of the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPortfolioAccess operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListPortfolioAccess
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
     */
    java.util.concurrent.Future<ListPrincipalsForPortfolioResult> listPrincipalsForPortfolioAsync(
            ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrincipalsForPortfolioRequest, ListPrincipalsForPortfolioResult> asyncHandler);

    /**
     * <p>
     * Lists all provisioning artifacts associated with the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListProvisioningArtifacts
     */
    java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest);

    /**
     * <p>
     * Lists all provisioning artifacts associated with the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListProvisioningArtifacts
     */
    java.util.concurrent.Future<ListProvisioningArtifactsResult> listProvisioningArtifactsAsync(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisioningArtifactsRequest, ListProvisioningArtifactsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all performed requests, in the form of RecordDetails objects that are filtered as
     * specified.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return A Java Future containing the result of the ListRecordHistory operation returned by the service.
     * @sample AWSServiceCatalogAsync.ListRecordHistory
     */
    java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest listRecordHistoryRequest);

    /**
     * <p>
     * Returns a paginated list of all performed requests, in the form of RecordDetails objects that are filtered as
     * specified.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecordHistory operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ListRecordHistory
     */
    java.util.concurrent.Future<ListRecordHistoryResult> listRecordHistoryAsync(ListRecordHistoryRequest listRecordHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecordHistoryRequest, ListRecordHistoryResult> asyncHandler);

    /**
     * <p>
     * Requests a <i>Provision</i> of a specified product. A <i>ProvisionedProduct</i> is a resourced instance for a
     * product. For example, provisioning a CloudFormation-template-backed product results in launching a CloudFormation
     * stack and all the underlying resources that come with it.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param provisionProductRequest
     * @return A Java Future containing the result of the ProvisionProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.ProvisionProduct
     */
    java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest provisionProductRequest);

    /**
     * <p>
     * Requests a <i>Provision</i> of a specified product. A <i>ProvisionedProduct</i> is a resourced instance for a
     * product. For example, provisioning a CloudFormation-template-backed product results in launching a CloudFormation
     * stack and all the underlying resources that come with it.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param provisionProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvisionProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ProvisionProduct
     */
    java.util.concurrent.Future<ProvisionProductResult> provisionProductAsync(ProvisionProductRequest provisionProductRequest,
            com.amazonaws.handlers.AsyncHandler<ProvisionProductRequest, ProvisionProductResult> asyncHandler);

    /**
     * <p>
     * Rejects an offer to share a portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return A Java Future containing the result of the RejectPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsync.RejectPortfolioShare
     */
    java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest rejectPortfolioShareRequest);

    /**
     * <p>
     * Rejects an offer to share a portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectPortfolioShare operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.RejectPortfolioShare
     */
    java.util.concurrent.Future<RejectPortfolioShareResult> rejectPortfolioShareAsync(RejectPortfolioShareRequest rejectPortfolioShareRequest,
            com.amazonaws.handlers.AsyncHandler<RejectPortfolioShareRequest, RejectPortfolioShareResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all the ProvisionedProduct objects that are currently available (not terminated).
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return A Java Future containing the result of the ScanProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsync.ScanProvisionedProducts
     */
    java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest scanProvisionedProductsRequest);

    /**
     * <p>
     * Returns a paginated list of all the ProvisionedProduct objects that are currently available (not terminated).
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ScanProvisionedProducts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.ScanProvisionedProducts
     */
    java.util.concurrent.Future<ScanProvisionedProductsResult> scanProvisionedProductsAsync(ScanProvisionedProductsRequest scanProvisionedProductsRequest,
            com.amazonaws.handlers.AsyncHandler<ScanProvisionedProductsRequest, ScanProvisionedProductsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list all of the <code>Products</code> objects to which the caller has access.
     * </p>
     * <p>
     * The output of this operation can be used as input for other operations, such as <a>DescribeProductView</a>.
     * </p>
     * 
     * @param searchProductsRequest
     * @return A Java Future containing the result of the SearchProducts operation returned by the service.
     * @sample AWSServiceCatalogAsync.SearchProducts
     */
    java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest searchProductsRequest);

    /**
     * <p>
     * Returns a paginated list all of the <code>Products</code> objects to which the caller has access.
     * </p>
     * <p>
     * The output of this operation can be used as input for other operations, such as <a>DescribeProductView</a>.
     * </p>
     * 
     * @param searchProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProducts operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.SearchProducts
     */
    java.util.concurrent.Future<SearchProductsResult> searchProductsAsync(SearchProductsRequest searchProductsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProductsRequest, SearchProductsResult> asyncHandler);

    /**
     * <p>
     * Retrieves summary and status information about all products created within the caller's account. If a portfolio
     * ID is provided, this operation retrieves information for only those products that are associated with the
     * specified portfolio.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsync.SearchProductsAsAdmin
     */
    java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest searchProductsAsAdminRequest);

    /**
     * <p>
     * Retrieves summary and status information about all products created within the caller's account. If a portfolio
     * ID is provided, this operation retrieves information for only those products that are associated with the
     * specified portfolio.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.SearchProductsAsAdmin
     */
    java.util.concurrent.Future<SearchProductsAsAdminResult> searchProductsAsAdminAsync(SearchProductsAsAdminRequest searchProductsAsAdminRequest,
            com.amazonaws.handlers.AsyncHandler<SearchProductsAsAdminRequest, SearchProductsAsAdminResult> asyncHandler);

    /**
     * <p>
     * Requests termination of an existing ProvisionedProduct object. If there are <code>Tags</code> associated with the
     * object, they are terminated when the ProvisionedProduct object is terminated.
     * </p>
     * <p>
     * This operation does not delete any records associated with the ProvisionedProduct object.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @return A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.TerminateProvisionedProduct
     */
    java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest);

    /**
     * <p>
     * Requests termination of an existing ProvisionedProduct object. If there are <code>Tags</code> associated with the
     * object, they are terminated when the ProvisionedProduct object is terminated.
     * </p>
     * <p>
     * This operation does not delete any records associated with the ProvisionedProduct object.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.TerminateProvisionedProduct
     */
    java.util.concurrent.Future<TerminateProvisionedProductResult> terminateProvisionedProductAsync(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateProvisionedProductRequest, TerminateProvisionedProductResult> asyncHandler);

    /**
     * <p>
     * Updates an existing constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return A Java Future containing the result of the UpdateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateConstraint
     */
    java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest updateConstraintRequest);

    /**
     * <p>
     * Updates an existing constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConstraint operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateConstraint
     */
    java.util.concurrent.Future<UpdateConstraintResult> updateConstraintAsync(UpdateConstraintRequest updateConstraintRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConstraintRequest, UpdateConstraintResult> asyncHandler);

    /**
     * <p>
     * Updates the specified portfolio's details. This operation will not work with a product that has been shared with
     * you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return A Java Future containing the result of the UpdatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdatePortfolio
     */
    java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest updatePortfolioRequest);

    /**
     * <p>
     * Updates the specified portfolio's details. This operation will not work with a product that has been shared with
     * you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePortfolio operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdatePortfolio
     */
    java.util.concurrent.Future<UpdatePortfolioResult> updatePortfolioAsync(UpdatePortfolioRequest updatePortfolioRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePortfolioRequest, UpdatePortfolioResult> asyncHandler);

    /**
     * <p>
     * Updates an existing product.
     * </p>
     * 
     * @param updateProductRequest
     * @return A Java Future containing the result of the UpdateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProduct
     */
    java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest updateProductRequest);

    /**
     * <p>
     * Updates an existing product.
     * </p>
     * 
     * @param updateProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProduct
     */
    java.util.concurrent.Future<UpdateProductResult> updateProductAsync(UpdateProductRequest updateProductRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProductRequest, UpdateProductResult> asyncHandler);

    /**
     * <p>
     * Requests updates to the configuration of an existing ProvisionedProduct object. If there are tags associated with
     * the object, they cannot be updated or added with this operation. Depending on the specific updates requested,
     * this operation may update with no interruption, with some interruption, or replace the ProvisionedProduct object
     * entirely.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProvisionedProduct
     */
    java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest updateProvisionedProductRequest);

    /**
     * <p>
     * Requests updates to the configuration of an existing ProvisionedProduct object. If there are tags associated with
     * the object, they cannot be updated or added with this operation. Depending on the specific updates requested,
     * this operation may update with no interruption, with some interruption, or replace the ProvisionedProduct object
     * entirely.
     * </p>
     * <p>
     * You can check the status of this request using the <a>DescribeRecord</a> operation.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProvisionedProduct
     */
    java.util.concurrent.Future<UpdateProvisionedProductResult> updateProvisionedProductAsync(UpdateProvisionedProductRequest updateProvisionedProductRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedProductRequest, UpdateProvisionedProductResult> asyncHandler);

    /**
     * <p>
     * Updates an existing provisioning artifact's information. This operation will not work on a provisioning artifact
     * associated with a product that has been shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsync.UpdateProvisioningArtifact
     */
    java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest);

    /**
     * <p>
     * Updates an existing provisioning artifact's information. This operation will not work on a provisioning artifact
     * associated with a product that has been shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service.
     * @sample AWSServiceCatalogAsyncHandler.UpdateProvisioningArtifact
     */
    java.util.concurrent.Future<UpdateProvisioningArtifactResult> updateProvisioningArtifactAsync(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisioningArtifactRequest, UpdateProvisioningArtifactResult> asyncHandler);

}
