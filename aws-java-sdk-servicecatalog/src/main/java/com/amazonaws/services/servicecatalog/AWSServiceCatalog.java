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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.servicecatalog.model.*;

/**
 * Interface for accessing AWS Service Catalog.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicecatalog.AbstractAWSServiceCatalog} instead.
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
public interface AWSServiceCatalog {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "servicecatalog";

    /**
     * Overrides the default endpoint for this client ("servicecatalog.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "servicecatalog.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "servicecatalog.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "servicecatalog.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "servicecatalog.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSServiceCatalog#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Accepts an offer to share a portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return Result of the AcceptPortfolioShare operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.AcceptPortfolioShare
     */
    AcceptPortfolioShareResult acceptPortfolioShare(AcceptPortfolioShareRequest acceptPortfolioShareRequest);

    /**
     * <p>
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @return Result of the AssociatePrincipalWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociatePrincipalWithPortfolio
     */
    AssociatePrincipalWithPortfolioResult associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest);

    /**
     * <p>
     * Associates a product with a portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return Result of the AssociateProductWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociateProductWithPortfolio
     */
    AssociateProductWithPortfolioResult associateProductWithPortfolio(AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest);

    /**
     * <p>
     * Creates a new constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return Result of the CreateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.CreateConstraint
     */
    CreateConstraintResult createConstraint(CreateConstraintRequest createConstraintRequest);

    /**
     * <p>
     * Creates a new portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return Result of the CreatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.CreatePortfolio
     */
    CreatePortfolioResult createPortfolio(CreatePortfolioRequest createPortfolioRequest);

    /**
     * <p>
     * Creates a new portfolio share.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return Result of the CreatePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.CreatePortfolioShare
     */
    CreatePortfolioShareResult createPortfolioShare(CreatePortfolioShareRequest createPortfolioShareRequest);

    /**
     * <p>
     * Creates a new product.
     * </p>
     * 
     * @param createProductRequest
     * @return Result of the CreateProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateProduct
     */
    CreateProductResult createProduct(CreateProductRequest createProductRequest);

    /**
     * <p>
     * Create a new provisioning artifact for the specified product. This operation will not work with a product that
     * has been shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return Result of the CreateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateProvisioningArtifact
     */
    CreateProvisioningArtifactResult createProvisioningArtifact(CreateProvisioningArtifactRequest createProvisioningArtifactRequest);

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return Result of the DeleteConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DeleteConstraint
     */
    DeleteConstraintResult deleteConstraint(DeleteConstraintRequest deleteConstraintRequest);

    /**
     * <p>
     * Deletes the specified portfolio. This operation will not work with a portfolio that has been shared with you or
     * if it has products, users, constraints, or shared accounts associated with it.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return Result of the DeletePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
     * @sample AWSServiceCatalog.DeletePortfolio
     */
    DeletePortfolioResult deletePortfolio(DeletePortfolioRequest deletePortfolioRequest);

    /**
     * <p>
     * Deletes the specified portfolio share.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return Result of the DeletePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DeletePortfolioShare
     */
    DeletePortfolioShareResult deletePortfolioShare(DeletePortfolioShareRequest deletePortfolioShareRequest);

    /**
     * <p>
     * Deletes the specified product. This operation will not work with a product that has been shared with you or is
     * associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DeleteProduct
     */
    DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest);

    /**
     * <p>
     * Deletes the specified provisioning artifact. This operation will not work on a provisioning artifact associated
     * with a product that has been shared with you, or on the last provisioning artifact associated with a product (a
     * product must have at least one provisioning artifact).
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return Result of the DeleteProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The operation was requested against a resource that is currently in use. Free the resource from use and
     *         retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DeleteProvisioningArtifact
     */
    DeleteProvisioningArtifactResult deleteProvisioningArtifact(DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest);

    /**
     * <p>
     * Retrieves detailed information for a specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return Result of the DescribeConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeConstraint
     */
    DescribeConstraintResult describeConstraint(DescribeConstraintRequest describeConstraintRequest);

    /**
     * <p>
     * Retrieves detailed information and any tags associated with the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return Result of the DescribePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribePortfolio
     */
    DescribePortfolioResult describePortfolio(DescribePortfolioRequest describePortfolioRequest);

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
     * @return Result of the DescribeProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DescribeProduct
     */
    DescribeProductResult describeProduct(DescribeProductRequest describeProductRequest);

    /**
     * <p>
     * Retrieves information about a specified product, run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return Result of the DescribeProductAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProductAsAdmin
     */
    DescribeProductAsAdminResult describeProductAsAdmin(DescribeProductAsAdminRequest describeProductAsAdminRequest);

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
     * @return Result of the DescribeProductView operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DescribeProductView
     */
    DescribeProductViewResult describeProductView(DescribeProductViewRequest describeProductViewRequest);

    /**
     * <p>
     * Retrieves detailed information about the specified provisioning artifact.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return Result of the DescribeProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningArtifact
     */
    DescribeProvisioningArtifactResult describeProvisioningArtifact(DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest);

    /**
     * <p>
     * Provides information about parameters required to provision a specified product in a specified manner. Use this
     * operation to obtain the list of <code>ProvisioningArtifactParameters</code> parameters available to call the
     * <a>ProvisionProduct</a> operation for the specified product.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return Result of the DescribeProvisioningParameters operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningParameters
     */
    DescribeProvisioningParametersResult describeProvisioningParameters(DescribeProvisioningParametersRequest describeProvisioningParametersRequest);

    /**
     * <p>
     * Retrieves a paginated list of the full details of a specific request. Use this operation after calling a request
     * operation (<a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or <a>UpdateProvisionedProduct</a>).
     * </p>
     * 
     * @param describeRecordRequest
     * @return Result of the DescribeRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeRecord
     */
    DescribeRecordResult describeRecord(DescribeRecordRequest describeRecordRequest);

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return Result of the DisassociatePrincipalFromPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociatePrincipalFromPortfolio
     */
    DisassociatePrincipalFromPortfolioResult disassociatePrincipalFromPortfolio(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest);

    /**
     * <p>
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @return Result of the DisassociateProductFromPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.DisassociateProductFromPortfolio
     */
    DisassociateProductFromPortfolioResult disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest);

    /**
     * <p>
     * Lists details of all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return Result of the ListAcceptedPortfolioShares operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListAcceptedPortfolioShares
     */
    ListAcceptedPortfolioSharesResult listAcceptedPortfolioShares(ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest);

    /**
     * <p>
     * Retrieves detailed constraint information for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return Result of the ListConstraintsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListConstraintsForPortfolio
     */
    ListConstraintsForPortfolioResult listConstraintsForPortfolio(ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest);

    /**
     * <p>
     * Returns a paginated list of all paths to a specified product. A path is how the user has access to a specified
     * product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return Result of the ListLaunchPaths operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListLaunchPaths
     */
    ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest listLaunchPathsRequest);

    /**
     * <p>
     * Lists the account IDs that have been authorized sharing of the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return Result of the ListPortfolioAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfolioAccess
     */
    ListPortfolioAccessResult listPortfolioAccess(ListPortfolioAccessRequest listPortfolioAccessRequest);

    /**
     * <p>
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @return Result of the ListPortfolios operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListPortfolios
     */
    ListPortfoliosResult listPortfolios(ListPortfoliosRequest listPortfoliosRequest);

    /**
     * <p>
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @return Result of the ListPortfoliosForProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfoliosForProduct
     */
    ListPortfoliosForProductResult listPortfoliosForProduct(ListPortfoliosForProductRequest listPortfoliosForProductRequest);

    /**
     * <p>
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @return Result of the ListPrincipalsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListPrincipalsForPortfolio
     */
    ListPrincipalsForPortfolioResult listPrincipalsForPortfolio(ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest);

    /**
     * <p>
     * Lists all provisioning artifacts associated with the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return Result of the ListProvisioningArtifacts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListProvisioningArtifacts
     */
    ListProvisioningArtifactsResult listProvisioningArtifacts(ListProvisioningArtifactsRequest listProvisioningArtifactsRequest);

    /**
     * <p>
     * Returns a paginated list of all performed requests, in the form of RecordDetails objects that are filtered as
     * specified.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return Result of the ListRecordHistory operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ListRecordHistory
     */
    ListRecordHistoryResult listRecordHistory(ListRecordHistoryRequest listRecordHistoryRequest);

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
     * @return Result of the ProvisionProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.ProvisionProduct
     */
    ProvisionProductResult provisionProduct(ProvisionProductRequest provisionProductRequest);

    /**
     * <p>
     * Rejects an offer to share a portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return Result of the RejectPortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.RejectPortfolioShare
     */
    RejectPortfolioShareResult rejectPortfolioShare(RejectPortfolioShareRequest rejectPortfolioShareRequest);

    /**
     * <p>
     * Returns a paginated list of all the ProvisionedProduct objects that are currently available (not terminated).
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return Result of the ScanProvisionedProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.ScanProvisionedProducts
     */
    ScanProvisionedProductsResult scanProvisionedProducts(ScanProvisionedProductsRequest scanProvisionedProductsRequest);

    /**
     * <p>
     * Returns a paginated list all of the <code>Products</code> objects to which the caller has access.
     * </p>
     * <p>
     * The output of this operation can be used as input for other operations, such as <a>DescribeProductView</a>.
     * </p>
     * 
     * @param searchProductsRequest
     * @return Result of the SearchProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.SearchProducts
     */
    SearchProductsResult searchProducts(SearchProductsRequest searchProductsRequest);

    /**
     * <p>
     * Retrieves summary and status information about all products created within the caller's account. If a portfolio
     * ID is provided, this operation retrieves information for only those products that are associated with the
     * specified portfolio.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return Result of the SearchProductsAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.SearchProductsAsAdmin
     */
    SearchProductsAsAdminResult searchProductsAsAdmin(SearchProductsAsAdminRequest searchProductsAsAdminRequest);

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
     * @return Result of the TerminateProvisionedProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.TerminateProvisionedProduct
     */
    TerminateProvisionedProductResult terminateProvisionedProduct(TerminateProvisionedProductRequest terminateProvisionedProductRequest);

    /**
     * <p>
     * Updates an existing constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return Result of the UpdateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.UpdateConstraint
     */
    UpdateConstraintResult updateConstraint(UpdateConstraintRequest updateConstraintRequest);

    /**
     * <p>
     * Updates the specified portfolio's details. This operation will not work with a product that has been shared with
     * you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return Result of the UpdatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Reduce the resource use or
     *         increase the service limits and retry the operation.
     * @sample AWSServiceCatalog.UpdatePortfolio
     */
    UpdatePortfolioResult updatePortfolio(UpdatePortfolioRequest updatePortfolioRequest);

    /**
     * <p>
     * Updates an existing product.
     * </p>
     * 
     * @param updateProductRequest
     * @return Result of the UpdateProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.UpdateProduct
     */
    UpdateProductResult updateProduct(UpdateProductRequest updateProductRequest);

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
     * @return Result of the UpdateProvisionedProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.UpdateProvisionedProduct
     */
    UpdateProvisionedProductResult updateProvisionedProduct(UpdateProvisionedProductRequest updateProvisionedProductRequest);

    /**
     * <p>
     * Updates an existing provisioning artifact's information. This operation will not work on a provisioning artifact
     * associated with a product that has been shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return Result of the UpdateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are invalid.
     * @sample AWSServiceCatalog.UpdateProvisioningArtifact
     */
    UpdateProvisioningArtifactResult updateProvisioningArtifact(UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest);

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

}
