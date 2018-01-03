/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a> enables organizations to create and manage
 * catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
 * familiar with the terminology discussed in <a
 * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html">AWS Service Catalog
 * Concepts</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return Result of the AcceptPortfolioShare operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AcceptPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AcceptPortfolioShare"
     *      target="_top">AWS API Documentation</a>
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
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociatePrincipalWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociatePrincipalWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePrincipalWithPortfolioResult associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest);

    /**
     * <p>
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return Result of the AssociateProductWithPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.AssociateProductWithPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateProductWithPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateProductWithPortfolioResult associateProductWithPortfolio(AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest);

    /**
     * <p>
     * Associate the specified TagOption with the specified portfolio or product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @return Result of the AssociateTagOptionWithResource operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws InvalidStateException
     *         An attempt was made to modify a resource that is in a state that is not valid. Check your resources to
     *         ensure that they are in valid states before retrying the operation.
     * @sample AWSServiceCatalog.AssociateTagOptionWithResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AssociateTagOptionWithResource"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTagOptionWithResourceResult associateTagOptionWithResource(AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest);

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
     * @return Result of the CopyProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.CopyProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CopyProduct" target="_top">AWS API
     *      Documentation</a>
     */
    CopyProductResult copyProduct(CopyProductRequest copyProductRequest);

    /**
     * <p>
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return Result of the CreateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.CreateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConstraintResult createConstraint(CreateConstraintRequest createConstraintRequest);

    /**
     * <p>
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return Result of the CreatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.CreatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePortfolioResult createPortfolio(CreatePortfolioRequest createPortfolioRequest);

    /**
     * <p>
     * Shares the specified portfolio with the specified account.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return Result of the CreatePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.CreatePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePortfolioShareResult createPortfolioShare(CreatePortfolioShareRequest createPortfolioShareRequest);

    /**
     * <p>
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @return Result of the CreateProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.CreateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProductResult createProduct(CreateProductRequest createProductRequest);

    /**
     * <p>
     * Creates a provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return Result of the CreateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProvisioningArtifactResult createProvisioningArtifact(CreateProvisioningArtifactRequest createProvisioningArtifactRequest);

    /**
     * <p>
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @return Result of the CreateTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @sample AWSServiceCatalog.CreateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTagOptionResult createTagOption(CreateTagOptionRequest createTagOptionRequest);

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
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DeleteConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConstraintResult deleteConstraint(DeleteConstraintRequest deleteConstraintRequest);

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
     * @return Result of the DeletePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure the resource is not in use and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.DeletePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePortfolioResult deletePortfolio(DeletePortfolioRequest deletePortfolioRequest);

    /**
     * <p>
     * Stops sharing the specified portfolio with the specified account.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return Result of the DeletePortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DeletePortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeletePortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePortfolioShareResult deletePortfolioShare(DeletePortfolioShareRequest deletePortfolioShareRequest);

    /**
     * <p>
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return Result of the DeleteProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.DeleteProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProduct" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest);

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
     * @return Result of the DeleteProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DeleteProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProvisioningArtifactResult deleteProvisioningArtifact(DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest);

    /**
     * <p>
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return Result of the DescribeConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConstraintResult describeConstraint(DescribeConstraintRequest describeConstraintRequest);

    /**
     * <p>
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @return Result of the DescribeCopyProductStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeCopyProductStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeCopyProductStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCopyProductStatusResult describeCopyProductStatus(DescribeCopyProductStatusRequest describeCopyProductStatusRequest);

    /**
     * <p>
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return Result of the DescribePortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePortfolioResult describePortfolio(DescribePortfolioRequest describePortfolioRequest);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @return Result of the DescribeProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DescribeProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProduct" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProductResult describeProduct(DescribeProductRequest describeProductRequest);

    /**
     * <p>
     * Gets information about the specified product. This operation is run with administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return Result of the DescribeProductAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProductAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProductAsAdminResult describeProductAsAdmin(DescribeProductAsAdminRequest describeProductAsAdminRequest);

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return Result of the DescribeProductView operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DescribeProductView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProductView"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProductViewResult describeProductView(DescribeProductViewRequest describeProductViewRequest);

    /**
     * <p>
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @return Result of the DescribeProvisionedProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProvisionedProductResult describeProvisionedProduct(DescribeProvisionedProductRequest describeProvisionedProductRequest);

    /**
     * <p>
     * Gets information about the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return Result of the DescribeProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProvisioningArtifactResult describeProvisioningArtifact(DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest);

    /**
     * <p>
     * Gets information about the configuration required to provision the specified product using the specified
     * provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
     * The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
     * <a>ProvisionProduct</a>, do not include conflicted TagOption keys as tags, or this will cause the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>" and tag the provisioned
     * product with the value <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return Result of the DescribeProvisioningParameters operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProvisioningParametersResult describeProvisioningParameters(DescribeProvisioningParametersRequest describeProvisioningParametersRequest);

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
     * @return Result of the DescribeRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeRecord" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRecordResult describeRecord(DescribeRecordRequest describeRecordRequest);

    /**
     * <p>
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @return Result of the DescribeTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DescribeTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTagOptionResult describeTagOption(DescribeTagOptionRequest describeTagOptionRequest);

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return Result of the DisassociatePrincipalFromPortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociatePrincipalFromPortfolio
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociatePrincipalFromPortfolio"
     *      target="_top">AWS API Documentation</a>
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
     * @throws ResourceInUseException
     *         A resource that is currently in use. Ensure the resource is not in use and retry the operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.DisassociateProductFromPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateProductFromPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateProductFromPortfolioResult disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest);

    /**
     * <p>
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @return Result of the DisassociateTagOptionFromResource operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.DisassociateTagOptionFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateTagOptionFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTagOptionFromResourceResult disassociateTagOptionFromResource(DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest);

    /**
     * <p>
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return Result of the ListAcceptedPortfolioShares operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListAcceptedPortfolioShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListAcceptedPortfolioShares"
     *      target="_top">AWS API Documentation</a>
     */
    ListAcceptedPortfolioSharesResult listAcceptedPortfolioShares(ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest);

    /**
     * <p>
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return Result of the ListConstraintsForPortfolio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListConstraintsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListConstraintsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    ListConstraintsForPortfolioResult listConstraintsForPortfolio(ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest);

    /**
     * <p>
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is
     * necessary when provisioning a product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return Result of the ListLaunchPaths operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListLaunchPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListLaunchPaths" target="_top">AWS
     *      API Documentation</a>
     */
    ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest listLaunchPathsRequest);

    /**
     * <p>
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return Result of the ListPortfolioAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfolioAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolioAccess"
     *      target="_top">AWS API Documentation</a>
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
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListPortfolios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfolios" target="_top">AWS
     *      API Documentation</a>
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
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.ListPortfoliosForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPortfoliosForProduct"
     *      target="_top">AWS API Documentation</a>
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
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListPrincipalsForPortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListPrincipalsForPortfolio"
     *      target="_top">AWS API Documentation</a>
     */
    ListPrincipalsForPortfolioResult listPrincipalsForPortfolio(ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest);

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return Result of the ListProvisioningArtifacts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListProvisioningArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListProvisioningArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    ListProvisioningArtifactsResult listProvisioningArtifacts(ListProvisioningArtifactsRequest listProvisioningArtifactsRequest);

    /**
     * <p>
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return Result of the ListRecordHistory operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListRecordHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListRecordHistory"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecordHistoryResult listRecordHistory(ListRecordHistoryRequest listRecordHistoryRequest);

    /**
     * <p>
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @return Result of the ListResourcesForTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListResourcesForTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourcesForTagOptionResult listResourcesForTagOption(ListResourcesForTagOptionRequest listResourcesForTagOptionRequest);

    /**
     * <p>
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @return Result of the ListTagOptions operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ListTagOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptions" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagOptionsResult listTagOptions(ListTagOptionsRequest listTagOptionsRequest);

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
     * include conflicted keys as tags, or this will cause the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>".
     * </p>
     * 
     * @param provisionProductRequest
     * @return Result of the ProvisionProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @sample AWSServiceCatalog.ProvisionProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisionProduct"
     *      target="_top">AWS API Documentation</a>
     */
    ProvisionProductResult provisionProduct(ProvisionProductRequest provisionProductRequest);

    /**
     * <p>
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return Result of the RejectPortfolioShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.RejectPortfolioShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RejectPortfolioShare"
     *      target="_top">AWS API Documentation</a>
     */
    RejectPortfolioShareResult rejectPortfolioShare(RejectPortfolioShareRequest rejectPortfolioShareRequest);

    /**
     * <p>
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return Result of the ScanProvisionedProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.ScanProvisionedProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ScanProvisionedProducts"
     *      target="_top">AWS API Documentation</a>
     */
    ScanProvisionedProductsResult scanProvisionedProducts(ScanProvisionedProductsRequest scanProvisionedProductsRequest);

    /**
     * <p>
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @return Result of the SearchProducts operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.SearchProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProducts" target="_top">AWS
     *      API Documentation</a>
     */
    SearchProductsResult searchProducts(SearchProductsRequest searchProductsRequest);

    /**
     * <p>
     * Gets information about the products for the specified portfolio or all products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return Result of the SearchProductsAsAdmin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.SearchProductsAsAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProductsAsAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    SearchProductsAsAdminResult searchProductsAsAdmin(SearchProductsAsAdminRequest searchProductsAsAdminRequest);

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
     * @return Result of the TerminateProvisionedProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.TerminateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/TerminateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    TerminateProvisionedProductResult terminateProvisionedProduct(TerminateProvisionedProductRequest terminateProvisionedProductRequest);

    /**
     * <p>
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return Result of the UpdateConstraint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateConstraint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateConstraint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConstraintResult updateConstraint(UpdateConstraintRequest updateConstraintRequest);

    /**
     * <p>
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return Result of the UpdatePortfolio operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The current limits of the service would have been exceeded by this operation. Decrease your resource use
     *         or increase your service limits and retry the operation.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.UpdatePortfolio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolio" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePortfolioResult updatePortfolio(UpdatePortfolioRequest updatePortfolioRequest);

    /**
     * <p>
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @return Result of the UpdateProduct operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @sample AWSServiceCatalog.UpdateProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProduct" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateProductResult updateProduct(UpdateProductRequest updateProductRequest);

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
     * @return Result of the UpdateProvisionedProduct operation returned by the service.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSServiceCatalog.UpdateProvisionedProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProduct"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProvisionedProductResult updateProvisionedProduct(UpdateProvisionedProductRequest updateProvisionedProductRequest);

    /**
     * <p>
     * Updates the specified provisioning artifact (also known as a version) for the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return Result of the UpdateProvisioningArtifact operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateProvisioningArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProvisioningArtifactResult updateProvisioningArtifact(UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest);

    /**
     * <p>
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @return Result of the UpdateTagOption operation returned by the service.
     * @throws TagOptionNotMigratedException
     *         An operation requiring TagOptions failed because the TagOptions migration process has not been performed
     *         for this account. Please use the AWS console to perform the migration process before retrying the
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws DuplicateResourceException
     *         The specified resource is a duplicate.
     * @throws InvalidParametersException
     *         One or more parameters provided to the operation are not valid.
     * @sample AWSServiceCatalog.UpdateTagOption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateTagOption" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTagOptionResult updateTagOption(UpdateTagOptionRequest updateTagOptionRequest);

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
