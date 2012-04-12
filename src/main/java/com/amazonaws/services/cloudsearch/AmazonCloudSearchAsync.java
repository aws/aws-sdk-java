/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearch;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.cloudsearch.model.*;

/**
 * Interface for accessing AmazonCloudSearch asynchronously,
 * using Java Futures.
 * Amazon CloudSearch Configuration Service <p>
 * You use the Configuration Service to create, configure, and manage
 * search domains. Amazon CloudSearch configuration requests are
 * submitted to <code>cloudsearch.us-east-1.amazonaws.com</code> using
 * the AWS Query protocol.
 * </p> 
 */       
public interface AmazonCloudSearchAsync extends AmazonCloudSearch {
    /**
     * <p>
     * Configures the default search field for the search domain. The default
     * search field is used when a search request does not specify which
     * fields to search. By default, it is configured to include the contents
     * of all of the domain's text fields.
     * </p>
     *
     * @param updateDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the UpdateDefaultSearchField operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDefaultSearchFieldResult> updateDefaultSearchFieldAsync(UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a <code>RankExpression</code> from the search domain.
     * </p>
     *
     * @param deleteRankExpressionRequest Container for the necessary
     *           parameters to execute the DeleteRankExpression operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRankExpression service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRankExpressionResult> deleteRankExpressionAsync(DeleteRankExpressionRequest deleteRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the rank expressions configured for the search domain. Can be
     * limited to specific rank expressions by name. Shows all rank
     * expressions by default.
     * </p>
     *
     * @param describeRankExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeRankExpressions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRankExpressions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRankExpressionsResult> describeRankExpressionsAsync(DescribeRankExpressionsRequest describeRankExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100KB.
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an <code>IndexField</code> for the search domain. Used to
     * create new fields and modify existing ones. If the field exists, the
     * new configuration replaces the old one. You can configure a maximum of
     * 200 index fields.
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a <code>RankExpression</code> for the search domain. Used
     * to create new rank expressions and modify existing ones. If the
     * expression exists, the new configuration replaces the old one. You can
     * configure a maximum of 50 rank expressions.
     * </p>
     *
     * @param defineRankExpressionRequest Container for the necessary
     *           parameters to execute the DefineRankExpression operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DefineRankExpression service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineRankExpressionResult> defineRankExpressionAsync(DefineRankExpressionRequest defineRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the synonym dictionary configured for the search domain.
     * </p>
     *
     * @param describeSynonymOptionsRequest Container for the necessary
     *           parameters to execute the DescribeSynonymOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSynonymOptions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSynonymOptionsResult> describeSynonymOptionsAsync(DescribeSynonymOptionsRequest describeSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the stopwords configured for the search domain.
     * </p>
     *
     * @param describeStopwordOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStopwordOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStopwordOptionsResult> describeStopwordOptionsAsync(DescribeStopwordOptionsRequest describeStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the resource-based policies that control access
     * to the domain's document and search services.
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the default search field configured for the search domain.
     * </p>
     *
     * @param describeDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the DescribeDefaultSearchField operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDefaultSearchFieldResult> describeDefaultSearchFieldAsync(DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10KB.
     * </p>
     *
     * @param updateStopwordOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStopwordOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStopwordOptionsResult> updateStopwordOptionsAsync(UpdateStopwordOptionsRequest updateStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a synonym dictionary for the search domain. The synonym
     * dictionary is used during indexing to configure mappings for terms
     * that occur in text fields. The maximum size of the synonym dictionary
     * is 100KB.
     * </p>
     *
     * @param updateSynonymOptionsRequest Container for the necessary
     *           parameters to execute the UpdateSynonymOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSynonymOptions service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSynonymOptionsResult> updateSynonymOptionsAsync(UpdateSynonymOptionsRequest updateSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500KB.
     * </p>
     *
     * @param updateStemmingOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStemmingOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStemmingOptionsResult> updateStemmingOptionsAsync(UpdateStemmingOptionsRequest updateStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the stemming dictionary configured for the search domain.
     * </p>
     *
     * @param describeStemmingOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStemmingOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStemmingOptionsResult> describeStemmingOptionsAsync(DescribeStemmingOptionsRequest describeStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest text processing options and <code>IndexFields</code> . This
     * operation must be invoked to make options whose OptionStatus has
     * <code>OptionState</code> of <code>RequiresIndexDocuments</code>
     * visible in search results.
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. Shows all fields by
     * default.
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearch.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        