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

import com.amazonaws.services.cloudsearchdomain.model.*;

/**
 * Interface for accessing Amazon CloudSearch Domain asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudsearchdomain.AbstractAmazonCloudSearchDomainAsync} instead.
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
public interface AmazonCloudSearchDomainAsync extends AmazonCloudSearchDomain {

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
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonCloudSearchDomainAsync.Search
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonCloudSearchDomainAsyncHandler.Search
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler);

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
     * @return A Java Future containing the result of the Suggest operation returned by the service.
     * @sample AmazonCloudSearchDomainAsync.Suggest
     */
    java.util.concurrent.Future<SuggestResult> suggestAsync(SuggestRequest suggestRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Suggest operation returned by the service.
     * @sample AmazonCloudSearchDomainAsyncHandler.Suggest
     */
    java.util.concurrent.Future<SuggestResult> suggestAsync(SuggestRequest suggestRequest,
            com.amazonaws.handlers.AsyncHandler<SuggestRequest, SuggestResult> asyncHandler);

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
     * @return A Java Future containing the result of the UploadDocuments operation returned by the service.
     * @sample AmazonCloudSearchDomainAsync.UploadDocuments
     */
    java.util.concurrent.Future<UploadDocumentsResult> uploadDocumentsAsync(UploadDocumentsRequest uploadDocumentsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadDocuments operation returned by the service.
     * @sample AmazonCloudSearchDomainAsyncHandler.UploadDocuments
     */
    java.util.concurrent.Future<UploadDocumentsResult> uploadDocumentsAsync(UploadDocumentsRequest uploadDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<UploadDocumentsRequest, UploadDocumentsResult> asyncHandler);

}
