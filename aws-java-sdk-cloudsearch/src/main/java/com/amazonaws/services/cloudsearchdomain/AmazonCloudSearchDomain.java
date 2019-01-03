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
package com.amazonaws.services.cloudsearchdomain;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudsearchdomain.model.*;

/**
 * Interface for accessing Amazon CloudSearch Domain.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudsearchdomain.AbstractAmazonCloudSearchDomain} instead.
 * </p>
 * <p>
 * <p>
 * You use the AmazonCloudSearch2013 API to upload documents to a search domain and search those documents.
 * </p>
 * <p>
 * The endpoints for submitting <code>UploadDocuments</code>, <code>Search</code>, and <code>Suggest</code> requests are
 * domain-specific. To get the endpoints for your domain, use the Amazon CloudSearch configuration service
 * <code>DescribeDomains</code> action. The domain endpoints are also displayed on the domain dashboard in the Amazon
 * CloudSearch console. You submit suggest requests to the search endpoint.
 * </p>
 * <p>
 * For more information, see the <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide">Amazon
 * CloudSearch Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudSearchDomain {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudsearchdomain";

    /**
     * Overrides the default endpoint for this client. Callers can use this method to control which AWS region they want
     * to work with.
     * <p>
     * Callers can pass in just the endpoint or a full URL, including the protocol. If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint or a full URL, including the protocol of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudSearchDomain#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
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
     * Retrieves a list of documents that match the specified search criteria. How you specify the search criteria
     * depends on which query parser you use. Amazon CloudSearch supports four query parsers:
     * </p>
     * <ul>
     * <li><code>simple</code>: search all <code>text</code> and <code>text-array</code> fields for the specified
     * string. Search for phrases, individual terms, and prefixes.</li>
     * <li><code>structured</code>: search specific fields, construct compound queries using Boolean operators, and use
     * advanced features such as term boosting and proximity searching.</li>
     * <li><code>lucene</code>: specify search criteria using the Apache Lucene query parser syntax.</li>
     * <li><code>dismax</code>: specify search criteria using the simplified subset of the Apache Lucene query parser
     * syntax defined by the DisMax query parser.</li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html">Searching Your Data</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * <p>
     * The endpoint for submitting <code>Search</code> requests is domain-specific. You submit search requests to a
     * domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
     * service <code>DescribeDomains</code> action. A domain's endpoints are also displayed on the domain dashboard in
     * the Amazon CloudSearch console.
     * </p>
     * 
     * @param searchRequest
     *        Container for the parameters to the <code>Search</code> request.
     * @return Result of the Search operation returned by the service.
     * @throws SearchException
     *         Information about any problems encountered while processing a search request.
     * @sample AmazonCloudSearchDomain.Search
     */
    SearchResult search(SearchRequest searchRequest);

    /**
     * <p>
     * Retrieves autocomplete suggestions for a partial query string. You can use suggestions enable you to display
     * likely matches before users finish typing. In Amazon CloudSearch, suggestions are based on the contents of a
     * particular text field. When you request suggestions, Amazon CloudSearch finds all of the documents whose values
     * in the suggester field start with the specified query string. The beginning of the field must match the query
     * string to be considered a match.
     * </p>
     * <p>
     * For more information about configuring suggesters and retrieving suggestions, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html">Getting
     * Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * <p>
     * The endpoint for submitting <code>Suggest</code> requests is domain-specific. You submit suggest requests to a
     * domain's search endpoint. To get the search endpoint for your domain, use the Amazon CloudSearch configuration
     * service <code>DescribeDomains</code> action. A domain's endpoints are also displayed on the domain dashboard in
     * the Amazon CloudSearch console.
     * </p>
     * 
     * @param suggestRequest
     *        Container for the parameters to the <code>Suggest</code> request.
     * @return Result of the Suggest operation returned by the service.
     * @throws SearchException
     *         Information about any problems encountered while processing a search request.
     * @sample AmazonCloudSearchDomain.Suggest
     */
    SuggestResult suggest(SuggestRequest suggestRequest);

    /**
     * <p>
     * Posts a batch of documents to a search domain for indexing. A document batch is a collection of add and delete
     * operations that represent the documents you want to add, update, or delete from your domain. Batches can be
     * described in either JSON or XML. Each item that you want Amazon CloudSearch to return as a search result (such as
     * a product) is represented as a document. Every document has a unique ID and one or more fields that contain the
     * data that you want to search and return in results. Individual documents cannot contain more than 1 MB of data.
     * The entire batch cannot exceed 5 MB. To get the best possible upload performance, group add and delete operations
     * in batches that are close the 5 MB limit. Submitting a large volume of single-document batches can overload a
     * domain's document service.
     * </p>
     * <p>
     * The endpoint for submitting <code>UploadDocuments</code> requests is domain-specific. To get the document
     * endpoint for your domain, use the Amazon CloudSearch configuration service <code>DescribeDomains</code> action. A
     * domain's endpoints are also displayed on the domain dashboard in the Amazon CloudSearch console.
     * </p>
     * <p>
     * For more information about formatting your data for Amazon CloudSearch, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html">Preparing Your Data</a>
     * in the <i>Amazon CloudSearch Developer Guide</i>. For more information about uploading data for indexing, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html">Uploading Data</a> in the
     * <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param uploadDocumentsRequest
     *        Container for the parameters to the <code>UploadDocuments</code> request.
     * @return Result of the UploadDocuments operation returned by the service.
     * @throws DocumentServiceException
     *         Information about any problems encountered while processing an upload request.
     * @sample AmazonCloudSearchDomain.UploadDocuments
     */
    UploadDocumentsResult uploadDocuments(UploadDocumentsRequest uploadDocumentsRequest);

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
