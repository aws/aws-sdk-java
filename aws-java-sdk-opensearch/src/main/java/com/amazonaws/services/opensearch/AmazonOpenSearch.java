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
package com.amazonaws.services.opensearch;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.opensearch.model.*;

/**
 * Interface for accessing Amazon OpenSearch Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearch.AbstractAmazonOpenSearch} instead.
 * </p>
 * <p>
 * <p>
 * Use the Amazon OpenSearch Service configuration API to create, configure, and manage OpenSearch Service domains.
 * </p>
 * <p>
 * For sample code that uses the configuration API, see the <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/opensearch-configuration-samples.html">
 * <i>Amazon OpenSearch Service Developer Guide</i> </a>. The guide also contains <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/request-signing.html">sample code</a> for
 * sending signed HTTP requests to the OpenSearch APIs. The endpoint for configuration service requests is Region
 * specific: es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For a current list of supported
 * Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#service-regions">Amazon
 * Web Services service endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonOpenSearch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "es";

    /**
     * <p>
     * Allows the destination Amazon OpenSearch Service domain owner to accept an inbound cross-cluster search
     * connection request. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param acceptInboundConnectionRequest
     *        Container for the parameters to the <code>AcceptInboundConnection</code> operation.
     * @return Result of the AcceptInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.AcceptInboundConnection
     */
    AcceptInboundConnectionResult acceptInboundConnection(AcceptInboundConnectionRequest acceptInboundConnectionRequest);

    /**
     * <p>
     * Attaches tags to an existing Amazon OpenSearch Service domain. Tags are a set of case-sensitive key-value pairs.
     * An domain can have up to 10 tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * > Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code>AddTags</code> operation. Specifies the tags to attach to the
     *        domain.
     * @return Result of the AddTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.AddTags
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code>AssociatePackage</code> operation.
     * @return Result of the AssociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.AssociatePackage
     */
    AssociatePackageResult associatePackage(AssociatePackageRequest associatePackageRequest);

    /**
     * <p>
     * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param authorizeVpcEndpointAccessRequest
     * @return Result of the AuthorizeVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.AuthorizeVpcEndpointAccess
     */
    AuthorizeVpcEndpointAccessResult authorizeVpcEndpointAccess(AuthorizeVpcEndpointAccessRequest authorizeVpcEndpointAccessRequest);

    /**
     * <p>
     * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this
     * operation before the <code>AutomatedUpdateDate</code> and when the domain's <code>UpdateStatus</code> is
     * <code>PENDING_UPDATE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param cancelServiceSoftwareUpdateRequest
     *        Container for the request parameters to cancel a service software update.
     * @return Result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CancelServiceSoftwareUpdate
     */
    CancelServiceSoftwareUpdateResult cancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CreateDomain
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a new cross-cluster search connection from a source Amazon OpenSearch Service domain to a destination
     * domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createOutboundConnectionRequest
     *        Container for the parameters to the <code>CreateOutboundConnection</code> operation.
     * @return Result of the CreateOutboundConnection operation returned by the service.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.CreateOutboundConnection
     */
    CreateOutboundConnectionResult createOutboundConnection(CreateOutboundConnectionRequest createOutboundConnectionRequest);

    /**
     * <p>
     * Creates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code>CreatePackage</code> operation.
     * @return Result of the CreatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CreatePackage
     */
    CreatePackageResult createPackage(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service-managed VPC endpoint.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return Result of the CreateVpcEndpoint operation returned by the service.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.CreateVpcEndpoint
     */
    CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code>DeleteDomain</code> operation.
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DeleteDomain
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Allows the destination Amazon OpenSearch Service domain owner to delete an existing inbound cross-cluster search
     * connection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deleteInboundConnectionRequest
     *        Container for the parameters to the <code>DeleteInboundConnection</code> operation.
     * @return Result of the DeleteInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DeleteInboundConnection
     */
    DeleteInboundConnectionResult deleteInboundConnection(DeleteInboundConnectionRequest deleteInboundConnectionRequest);

    /**
     * <p>
     * Allows the source Amazon OpenSearch Service domain owner to delete an existing outbound cross-cluster search
     * connection. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deleteOutboundConnectionRequest
     *        Container for the parameters to the <code>DeleteOutboundConnection</code> operation.
     * @return Result of the DeleteOutboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DeleteOutboundConnection
     */
    DeleteOutboundConnectionResult deleteOutboundConnection(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param deletePackageRequest
     *        Deletes a package from OpenSearch Service. The package can't be associated with any OpenSearch Service
     *        domain.
     * @return Result of the DeletePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.DeletePackage
     */
    DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return Result of the DeleteVpcEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.DeleteVpcEndpoint
     */
    DeleteVpcEndpointResult deleteVpcEndpoint(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

    /**
     * <p>
     * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID,
     * domain service endpoint, and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code>DescribeDomain</code> operation.
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomain
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns the list of optimizations that Auto-Tune has made to an Amazon OpenSearch Service domain. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
     * OpenSearch Service</a>.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @return Result of the DescribeDomainAutoTunes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomainAutoTunes
     */
    DescribeDomainAutoTunesResult describeDomainAutoTunes(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest);

    /**
     * <p>
     * Returns information about the current blue/green deployment happening on an Amazon OpenSearch Service domain. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-configuration-changes.html"
     * >Making configuration changes in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeDomainChangeProgressRequest
     *        Container for the parameters to the <code>DescribeDomainChangeProgress</code> operation.
     * @return Result of the DescribeDomainChangeProgress operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomainChangeProgress
     */
    DescribeDomainChangeProgressResult describeDomainChangeProgress(DescribeDomainChangeProgressRequest describeDomainChangeProgressRequest);

    /**
     * <p>
     * Returns the configuration of an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation.
     * @return Result of the DescribeDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomainConfig
     */
    DescribeDomainConfigResult describeDomainConfig(DescribeDomainConfigRequest describeDomainConfigRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code>DescribeDomains</code> operation.
     * @return Result of the DescribeDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomains
     */
    DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest);

    /**
     * <p>
     * Lists all the inbound cross-cluster search connections for a destination (remote) Amazon OpenSearch Service
     * domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeInboundConnectionsRequest
     *        Container for the parameters to the <code>DescribeInboundConnections</code> operation.
     * @return Result of the DescribeInboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeInboundConnections
     */
    DescribeInboundConnectionsResult describeInboundConnections(DescribeInboundConnectionsRequest describeInboundConnectionsRequest);

    /**
     * <p>
     * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and
     * instance type.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
     * @return Result of the DescribeInstanceTypeLimits operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeInstanceTypeLimits
     */
    DescribeInstanceTypeLimitsResult describeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest);

    /**
     * <p>
     * Lists all the outbound cross-cluster connections for a local (source) Amazon OpenSearch Service domain. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html"
     * >Cross-cluster search for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeOutboundConnectionsRequest
     *        Container for the parameters to the <code>DescribeOutboundConnections</code> operation.
     * @return Result of the DescribeOutboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeOutboundConnections
     */
    DescribeOutboundConnectionsResult describeOutboundConnections(DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest);

    /**
     * <p>
     * Describes all packages available to OpenSearch Service. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code>DescribePackage</code> operation.
     * @return Result of the DescribePackages operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribePackages
     */
    DescribePackagesResult describePackages(DescribePackagesRequest describePackagesRequest);

    /**
     * <p>
     * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more
     * information, see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved
     * Instances in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for the request parameters to a <code>DescribeReservedInstanceOfferings</code> operation.
     * @return Result of the DescribeReservedInstanceOfferings operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.DescribeReservedInstanceOfferings
     */
    DescribeReservedInstanceOfferingsResult describeReservedInstanceOfferings(DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest);

    /**
     * <p>
     * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information,
     * see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved Instances in
     * Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
     * @return Result of the DescribeReservedInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeReservedInstances
     */
    DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * <p>
     * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     * @return Result of the DescribeVpcEndpoints operation returned by the service.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.DescribeVpcEndpoints
     */
    DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest describeVpcEndpointsRequest);

    /**
     * <p>
     * Removes a package from the specified Amazon OpenSearch Service domain. The package can't be in use with any
     * OpenSearch index for the dissociation to succeed. The package is still available in OpenSearch Service for
     * association later. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for the request parameters to the <code>DissociatePackage</code> operation.
     * @return Result of the DissociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.DissociatePackage
     */
    DissociatePackageResult dissociatePackage(DissociatePackageRequest dissociatePackageRequest);

    /**
     * <p>
     * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code>GetCompatibleVersions</code> operation.
     * @return Result of the GetCompatibleVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetCompatibleVersions
     */
    GetCompatibleVersionsResult getCompatibleVersions(GetCompatibleVersionsRequest getCompatibleVersionsRequest);

    /**
     * <p>
     * Returns a list of Amazon OpenSearch Service package versions, along with their creation time and commit message.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for the request parameters to the <code>GetPackageVersionHistory</code> operation.
     * @return Result of the GetPackageVersionHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.GetPackageVersionHistory
     */
    GetPackageVersionHistoryResult getPackageVersionHistory(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code>GetUpgradeHistory</code> operation.
     * @return Result of the GetUpgradeHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetUpgradeHistory
     */
    GetUpgradeHistoryResult getUpgradeHistory(GetUpgradeHistoryRequest getUpgradeHistoryRequest);

    /**
     * <p>
     * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch
     * Service domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code>GetUpgradeStatus</code> operation.
     * @return Result of the GetUpgradeStatus operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetUpgradeStatus
     */
    GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest);

    /**
     * <p>
     * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code>ListDomainNames</code> operation.
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListDomainNames
     */
    ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code>ListDomainsForPackage</code> operation.
     * @return Result of the ListDomainsForPackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListDomainsForPackage
     */
    ListDomainsForPackageResult listDomainsForPackage(ListDomainsForPackageRequest listDomainsForPackageRequest);

    /**
     * <p>
     * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
     * </p>
     * 
     * @param listInstanceTypeDetailsRequest
     * @return Result of the ListInstanceTypeDetails operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListInstanceTypeDetails
     */
    ListInstanceTypeDetailsResult listInstanceTypeDetails(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest);

    /**
     * <p>
     * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code>ListPackagesForDomain</code> operation.
     * @return Result of the ListPackagesForDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListPackagesForDomain
     */
    ListPackagesForDomainResult listPackagesForDomain(ListPackagesForDomainRequest listPackagesForDomainRequest);

    /**
     * <p>
     * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-awsresourcetagging.html"
     * >Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code>ListTags</code> operation.
     * @return Result of the ListTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.ListTags
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
     * </p>
     * 
     * @param listVersionsRequest
     *        Container for the request parameters to the <code>ListVersions</code> operation.
     * @return Result of the ListVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListVersions
     */
    ListVersionsResult listVersions(ListVersionsRequest listVersionsRequest);

    /**
     * <p>
     * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon
     * OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param listVpcEndpointAccessRequest
     * @return Result of the ListVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpointAccess
     */
    ListVpcEndpointAccessResult listVpcEndpointAccess(ListVpcEndpointAccessRequest listVpcEndpointAccessRequest);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and
     * Region.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return Result of the ListVpcEndpoints operation returned by the service.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpoints
     */
    ListVpcEndpointsResult listVpcEndpoints(ListVpcEndpointsRequest listVpcEndpointsRequest);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
     * </p>
     * 
     * @param listVpcEndpointsForDomainRequest
     * @return Result of the ListVpcEndpointsForDomain operation returned by the service.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.ListVpcEndpointsForDomain
     */
    ListVpcEndpointsForDomainResult listVpcEndpointsForDomain(ListVpcEndpointsForDomainRequest listVpcEndpointsForDomainRequest);

    /**
     * <p>
     * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for request parameters to the <code>PurchaseReservedInstanceOffering</code> operation.
     * @return Result of the PurchaseReservedInstanceOffering operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.PurchaseReservedInstanceOffering
     */
    PurchaseReservedInstanceOfferingResult purchaseReservedInstanceOffering(PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest);

    /**
     * <p>
     * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the request parameters to the <code>RejectInboundConnection</code> operation.
     * @return Result of the RejectInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.RejectInboundConnection
     */
    RejectInboundConnectionResult rejectInboundConnection(RejectInboundConnectionRequest rejectInboundConnectionRequest);

    /**
     * <p>
     * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * > Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the request parameters to the <code>RemoveTags</code> operation.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.RemoveTags
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
     * </p>
     * 
     * @param revokeVpcEndpointAccessRequest
     * @return Result of the RevokeVpcEndpointAccess operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.RevokeVpcEndpointAccess
     */
    RevokeVpcEndpointAccessResult revokeVpcEndpointAccess(RevokeVpcEndpointAccessRequest revokeVpcEndpointAccessRequest);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
     * @return Result of the StartServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.StartServiceSoftwareUpdate
     */
    StartServiceSoftwareUpdateResult startServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the request parameters to the <code>UpdateDomain</code> operation.
     * @return Result of the UpdateDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.UpdateDomainConfig
     */
    UpdateDomainConfigResult updateDomainConfig(UpdateDomainConfigRequest updateDomainConfigRequest);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code>UpdatePackage</code> operation.
     * @return Result of the UpdatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.UpdatePackage
     */
    UpdatePackageResult updatePackage(UpdatePackageRequest updatePackageRequest);

    /**
     * <p>
     * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return Result of the UpdateVpcEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonOpenSearch.UpdateVpcEndpoint
     */
    UpdateVpcEndpointResult updateVpcEndpoint(UpdateVpcEndpointRequest updateVpcEndpointRequest);

    /**
     * <p>
     * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a
     * compatible version of OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to the <code>UpgradeDomain</code> operation.
     * @return Result of the UpgradeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.UpgradeDomain
     */
    UpgradeDomainResult upgradeDomain(UpgradeDomainRequest upgradeDomainRequest);

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
