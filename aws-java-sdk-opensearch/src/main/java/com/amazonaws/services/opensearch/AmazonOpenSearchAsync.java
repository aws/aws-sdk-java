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

import com.amazonaws.services.opensearch.model.*;

/**
 * Interface for accessing Amazon OpenSearch Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearch.AbstractAmazonOpenSearchAsync} instead.
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
public interface AmazonOpenSearchAsync extends AmazonOpenSearch {

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
     * @return A Java Future containing the result of the AcceptInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.AcceptInboundConnection
     */
    java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(AcceptInboundConnectionRequest acceptInboundConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AcceptInboundConnection
     */
    java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(AcceptInboundConnectionRequest acceptInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInboundConnectionRequest, AcceptInboundConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code>AssociatePackage</code> operation.
     * @return A Java Future containing the result of the AssociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.AssociatePackage
     */
    java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(AssociatePackageRequest associatePackageRequest);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code>AssociatePackage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AssociatePackage
     */
    java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(AssociatePackageRequest associatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePackageRequest, AssociatePackageResult> asyncHandler);

    /**
     * <p>
     * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param authorizeVpcEndpointAccessRequest
     * @return A Java Future containing the result of the AuthorizeVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsync.AuthorizeVpcEndpointAccess
     */
    java.util.concurrent.Future<AuthorizeVpcEndpointAccessResult> authorizeVpcEndpointAccessAsync(
            AuthorizeVpcEndpointAccessRequest authorizeVpcEndpointAccessRequest);

    /**
     * <p>
     * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param authorizeVpcEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AuthorizeVpcEndpointAccess
     */
    java.util.concurrent.Future<AuthorizeVpcEndpointAccessResult> authorizeVpcEndpointAccessAsync(
            AuthorizeVpcEndpointAccessRequest authorizeVpcEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeVpcEndpointAccessRequest, AuthorizeVpcEndpointAccessResult> asyncHandler);

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
     * @return A Java Future containing the result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsync.CancelServiceSoftwareUpdate
     */
    java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(
            CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CancelServiceSoftwareUpdate
     */
    java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(
            CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<CancelServiceSoftwareUpdateRequest, CancelServiceSoftwareUpdateResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreateOutboundConnection
     */
    java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(CreateOutboundConnectionRequest createOutboundConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreateOutboundConnection
     */
    java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(CreateOutboundConnectionRequest createOutboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOutboundConnectionRequest, CreateOutboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Creates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code>CreatePackage</code> operation.
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreatePackage
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Creates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code>CreatePackage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreatePackage
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service-managed VPC endpoint.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreateVpcEndpoint
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest);

    /**
     * <p>
     * Creates an Amazon OpenSearch Service-managed VPC endpoint.
     * </p>
     * 
     * @param createVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreateVpcEndpoint
     */
    java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest createVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code>DeleteDomain</code> operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code>DeleteDomain</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteInboundConnection
     */
    java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(DeleteInboundConnectionRequest deleteInboundConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteInboundConnection
     */
    java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(DeleteInboundConnectionRequest deleteInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInboundConnectionRequest, DeleteInboundConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteOutboundConnection
     */
    java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteOutboundConnection
     */
    java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOutboundConnectionRequest, DeleteOutboundConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeletePackage
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeletePackage
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @return A Java Future containing the result of the DeleteVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteVpcEndpoint
     */
    java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest deleteVpcEndpointRequest);

    /**
     * <p>
     * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param deleteVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteVpcEndpoint
     */
    java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest deleteVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointRequest, DeleteVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID,
     * domain service endpoint, and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code>DescribeDomain</code> operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomain
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID,
     * domain service endpoint, and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code>DescribeDomain</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomain
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDomainAutoTunes operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomainAutoTunes
     */
    java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainAutoTunes operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomainAutoTunes
     */
    java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainAutoTunesRequest, DescribeDomainAutoTunesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDomainChangeProgress operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsync.DescribeDomainChangeProgress
     */
    java.util.concurrent.Future<DescribeDomainChangeProgressResult> describeDomainChangeProgressAsync(
            DescribeDomainChangeProgressRequest describeDomainChangeProgressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainChangeProgress operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomainChangeProgress
     */
    java.util.concurrent.Future<DescribeDomainChangeProgressResult> describeDomainChangeProgressAsync(
            DescribeDomainChangeProgressRequest describeDomainChangeProgressRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainChangeProgressRequest, DescribeDomainChangeProgressResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration of an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation.
     * @return A Java Future containing the result of the DescribeDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomainConfig
     */
    java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(DescribeDomainConfigRequest describeDomainConfigRequest);

    /**
     * <p>
     * Returns the configuration of an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomainConfig
     */
    java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(DescribeDomainConfigRequest describeDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainConfigRequest, DescribeDomainConfigResult> asyncHandler);

    /**
     * <p>
     * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code>DescribeDomains</code> operation.
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code>DescribeDomains</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeInboundConnections
     */
    java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(
            DescribeInboundConnectionsRequest describeInboundConnectionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeInboundConnections
     */
    java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(
            DescribeInboundConnectionsRequest describeInboundConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInboundConnectionsRequest, DescribeInboundConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and
     * instance type.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
     * @return A Java Future containing the result of the DescribeInstanceTypeLimits operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(
            DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest);

    /**
     * <p>
     * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and
     * instance type.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceTypeLimits operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(
            DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceTypeLimitsRequest, DescribeInstanceTypeLimitsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeOutboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeOutboundConnections
     */
    java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(
            DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOutboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeOutboundConnections
     */
    java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(
            DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOutboundConnectionsRequest, DescribeOutboundConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes all packages available to OpenSearch Service. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code>DescribePackage</code> operation.
     * @return A Java Future containing the result of the DescribePackages operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribePackages
     */
    java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(DescribePackagesRequest describePackagesRequest);

    /**
     * <p>
     * Describes all packages available to OpenSearch Service. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code>DescribePackage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackages operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribePackages
     */
    java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(DescribePackagesRequest describePackagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackagesRequest, DescribePackagesResult> asyncHandler);

    /**
     * <p>
     * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more
     * information, see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved
     * Instances in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for the request parameters to a <code>DescribeReservedInstanceOfferings</code> operation.
     * @return A Java Future containing the result of the DescribeReservedInstanceOfferings operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsync.DescribeReservedInstanceOfferings
     */
    java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest);

    /**
     * <p>
     * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more
     * information, see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved
     * Instances in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for the request parameters to a <code>DescribeReservedInstanceOfferings</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstanceOfferings operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeReservedInstanceOfferings
     */
    java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstanceOfferingsRequest, DescribeReservedInstanceOfferingsResult> asyncHandler);

    /**
     * <p>
     * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information,
     * see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved Instances in
     * Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeReservedInstances
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * <p>
     * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information,
     * see <a href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ri.html">Reserved Instances in
     * Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeReservedInstances
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     * @return A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeVpcEndpoints
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest describeVpcEndpointsRequest);

    /**
     * <p>
     * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeVpcEndpoints
     */
    java.util.concurrent.Future<DescribeVpcEndpointsResult> describeVpcEndpointsAsync(DescribeVpcEndpointsRequest describeVpcEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcEndpointsRequest, DescribeVpcEndpointsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DissociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.DissociatePackage
     */
    java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(DissociatePackageRequest dissociatePackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DissociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DissociatePackage
     */
    java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(DissociatePackageRequest dissociatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DissociatePackageRequest, DissociatePackageResult> asyncHandler);

    /**
     * <p>
     * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code>GetCompatibleVersions</code> operation.
     * @return A Java Future containing the result of the GetCompatibleVersions operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetCompatibleVersions
     */
    java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(GetCompatibleVersionsRequest getCompatibleVersionsRequest);

    /**
     * <p>
     * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code>GetCompatibleVersions</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCompatibleVersions operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetCompatibleVersions
     */
    java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(GetCompatibleVersionsRequest getCompatibleVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCompatibleVersionsRequest, GetCompatibleVersionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetPackageVersionHistory operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetPackageVersionHistory
     */
    java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPackageVersionHistory operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetPackageVersionHistory
     */
    java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionHistoryRequest, GetPackageVersionHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code>GetUpgradeHistory</code> operation.
     * @return A Java Future containing the result of the GetUpgradeHistory operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetUpgradeHistory
     */
    java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest getUpgradeHistoryRequest);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code>GetUpgradeHistory</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpgradeHistory operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetUpgradeHistory
     */
    java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest getUpgradeHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeHistoryRequest, GetUpgradeHistoryResult> asyncHandler);

    /**
     * <p>
     * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch
     * Service domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code>GetUpgradeStatus</code> operation.
     * @return A Java Future containing the result of the GetUpgradeStatus operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetUpgradeStatus
     */
    java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest getUpgradeStatusRequest);

    /**
     * <p>
     * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch
     * Service domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code>GetUpgradeStatus</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpgradeStatus operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetUpgradeStatus
     */
    java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest getUpgradeStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code>ListDomainNames</code> operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code>ListDomainNames</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code>ListDomainsForPackage</code> operation.
     * @return A Java Future containing the result of the ListDomainsForPackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListDomainsForPackage
     */
    java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(ListDomainsForPackageRequest listDomainsForPackageRequest);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code>ListDomainsForPackage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainsForPackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListDomainsForPackage
     */
    java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(ListDomainsForPackageRequest listDomainsForPackageRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsForPackageRequest, ListDomainsForPackageResult> asyncHandler);

    /**
     * <p>
     * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
     * </p>
     * 
     * @param listInstanceTypeDetailsRequest
     * @return A Java Future containing the result of the ListInstanceTypeDetails operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListInstanceTypeDetails
     */
    java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest);

    /**
     * <p>
     * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
     * </p>
     * 
     * @param listInstanceTypeDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceTypeDetails operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListInstanceTypeDetails
     */
    java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceTypeDetailsRequest, ListInstanceTypeDetailsResult> asyncHandler);

    /**
     * <p>
     * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code>ListPackagesForDomain</code> operation.
     * @return A Java Future containing the result of the ListPackagesForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListPackagesForDomain
     */
    java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(ListPackagesForDomainRequest listPackagesForDomainRequest);

    /**
     * <p>
     * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code>ListPackagesForDomain</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackagesForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListPackagesForDomain
     */
    java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(ListPackagesForDomainRequest listPackagesForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagesForDomainRequest, ListPackagesForDomainResult> asyncHandler);

    /**
     * <p>
     * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-awsresourcetagging.html"
     * >Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code>ListTags</code> operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-awsresourcetagging.html"
     * >Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code>ListTags</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
     * </p>
     * 
     * @param listVersionsRequest
     *        Container for the request parameters to the <code>ListVersions</code> operation.
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListVersions
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest);

    /**
     * <p>
     * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
     * </p>
     * 
     * @param listVersionsRequest
     *        Container for the request parameters to the <code>ListVersions</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListVersions
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsRequest, ListVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon
     * OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param listVpcEndpointAccessRequest
     * @return A Java Future containing the result of the ListVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListVpcEndpointAccess
     */
    java.util.concurrent.Future<ListVpcEndpointAccessResult> listVpcEndpointAccessAsync(ListVpcEndpointAccessRequest listVpcEndpointAccessRequest);

    /**
     * <p>
     * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon
     * OpenSearch Service domain through the use of an interface VPC endpoint.
     * </p>
     * 
     * @param listVpcEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListVpcEndpointAccess
     */
    java.util.concurrent.Future<ListVpcEndpointAccessResult> listVpcEndpointAccessAsync(ListVpcEndpointAccessRequest listVpcEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<ListVpcEndpointAccessRequest, ListVpcEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and
     * Region.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @return A Java Future containing the result of the ListVpcEndpoints operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListVpcEndpoints
     */
    java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest listVpcEndpointsRequest);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and
     * Region.
     * </p>
     * 
     * @param listVpcEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVpcEndpoints operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListVpcEndpoints
     */
    java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest listVpcEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsRequest, ListVpcEndpointsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
     * </p>
     * 
     * @param listVpcEndpointsForDomainRequest
     * @return A Java Future containing the result of the ListVpcEndpointsForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListVpcEndpointsForDomain
     */
    java.util.concurrent.Future<ListVpcEndpointsForDomainResult> listVpcEndpointsForDomainAsync(
            ListVpcEndpointsForDomainRequest listVpcEndpointsForDomainRequest);

    /**
     * <p>
     * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
     * </p>
     * 
     * @param listVpcEndpointsForDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVpcEndpointsForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListVpcEndpointsForDomain
     */
    java.util.concurrent.Future<ListVpcEndpointsForDomainResult> listVpcEndpointsForDomainAsync(
            ListVpcEndpointsForDomainRequest listVpcEndpointsForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsForDomainRequest, ListVpcEndpointsForDomainResult> asyncHandler);

    /**
     * <p>
     * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for request parameters to the <code>PurchaseReservedInstanceOffering</code> operation.
     * @return A Java Future containing the result of the PurchaseReservedInstanceOffering operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsync.PurchaseReservedInstanceOffering
     */
    java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest);

    /**
     * <p>
     * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for request parameters to the <code>PurchaseReservedInstanceOffering</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedInstanceOffering operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsyncHandler.PurchaseReservedInstanceOffering
     */
    java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstanceOfferingRequest, PurchaseReservedInstanceOfferingResult> asyncHandler);

    /**
     * <p>
     * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the request parameters to the <code>RejectInboundConnection</code> operation.
     * @return A Java Future containing the result of the RejectInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.RejectInboundConnection
     */
    java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(RejectInboundConnectionRequest rejectInboundConnectionRequest);

    /**
     * <p>
     * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the request parameters to the <code>RejectInboundConnection</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.RejectInboundConnection
     */
    java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(RejectInboundConnectionRequest rejectInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<RejectInboundConnectionRequest, RejectInboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * > Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the request parameters to the <code>RemoveTags</code> operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * > Tagging Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the request parameters to the <code>RemoveTags</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
     * </p>
     * 
     * @param revokeVpcEndpointAccessRequest
     * @return A Java Future containing the result of the RevokeVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsync.RevokeVpcEndpointAccess
     */
    java.util.concurrent.Future<RevokeVpcEndpointAccessResult> revokeVpcEndpointAccessAsync(RevokeVpcEndpointAccessRequest revokeVpcEndpointAccessRequest);

    /**
     * <p>
     * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
     * </p>
     * 
     * @param revokeVpcEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeVpcEndpointAccess operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.RevokeVpcEndpointAccess
     */
    java.util.concurrent.Future<RevokeVpcEndpointAccessResult> revokeVpcEndpointAccessAsync(RevokeVpcEndpointAccessRequest revokeVpcEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeVpcEndpointAccessRequest, RevokeVpcEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
     * @return A Java Future containing the result of the StartServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsync.StartServiceSoftwareUpdate
     */
    java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(
            StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html">Service
     * software updates in Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.StartServiceSoftwareUpdate
     */
    java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(
            StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<StartServiceSoftwareUpdateRequest, StartServiceSoftwareUpdateResult> asyncHandler);

    /**
     * <p>
     * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the request parameters to the <code>UpdateDomain</code> operation.
     * @return A Java Future containing the result of the UpdateDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpdateDomainConfig
     */
    java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(UpdateDomainConfigRequest updateDomainConfigRequest);

    /**
     * <p>
     * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the request parameters to the <code>UpdateDomain</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpdateDomainConfig
     */
    java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(UpdateDomainConfigRequest updateDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainConfigRequest, UpdateDomainConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code>UpdatePackage</code> operation.
     * @return A Java Future containing the result of the UpdatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpdatePackage
     */
    java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(UpdatePackageRequest updatePackageRequest);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html">Custom packages
     * for Amazon OpenSearch Service</a>.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code>UpdatePackage</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpdatePackage
     */
    java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(UpdatePackageRequest updatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePackageRequest, UpdatePackageResult> asyncHandler);

    /**
     * <p>
     * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @return A Java Future containing the result of the UpdateVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpdateVpcEndpoint
     */
    java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest updateVpcEndpointRequest);

    /**
     * <p>
     * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
     * </p>
     * 
     * @param updateVpcEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVpcEndpoint operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpdateVpcEndpoint
     */
    java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest updateVpcEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVpcEndpointRequest, UpdateVpcEndpointResult> asyncHandler);

    /**
     * <p>
     * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a
     * compatible version of OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to the <code>UpgradeDomain</code> operation.
     * @return A Java Future containing the result of the UpgradeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpgradeDomain
     */
    java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(UpgradeDomainRequest upgradeDomainRequest);

    /**
     * <p>
     * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a
     * compatible version of OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to the <code>UpgradeDomain</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpgradeDomain
     */
    java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(UpgradeDomainRequest upgradeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeDomainRequest, UpgradeDomainResult> asyncHandler);

}
