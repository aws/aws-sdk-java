/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudsearch.model.*;

/**
 * Interface for accessing AmazonCloudSearch.
 * Amazon CloudSearch Configuration Service <p>
 * You use the configuration service to create, configure, and manage search domains. Configuration service requests are submitted using the AWS Query
 * protocol. AWS Query requests are HTTP or HTTPS requests submitted via HTTP GET or POST with a query parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: cloudsearch. <i>region</i> .amazonaws.com. For example,
 * cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"> Regions and Endpoints </a> .
 * </p>
 */
public interface AmazonCloudSearch {

    /**
     * Overrides the default endpoint for this client ("https://cloudsearch.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://cloudsearch.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://cloudsearch.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCloudSearch#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Configures the default search field for the search domain. The default
     * search field is the text field that is searched when a search request
     * does not specify which fields to search. By default, it is configured
     * to include the contents of all of the domain's text fields.
     * </p>
     *
     * @param updateDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the UpdateDefaultSearchField service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateDefaultSearchField service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDefaultSearchFieldResult updateDefaultSearchField(UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a <code>RankExpression</code> from the search domain.
     * </p>
     *
     * @param deleteRankExpressionRequest Container for the necessary
     *           parameters to execute the DeleteRankExpression service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DeleteRankExpression service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteRankExpressionResult deleteRankExpression(DeleteRankExpressionRequest deleteRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the rank expressions configured for the search domain. Can be
     * limited to specific rank expressions by name. Shows all rank
     * expressions by default.
     * </p>
     *
     * @param describeRankExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeRankExpressions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeRankExpressions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRankExpressionsResult describeRankExpressions(DescribeRankExpressionsRequest describeRankExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain service method on AmazonCloudSearch.
     * 
     * @return The response from the CreateDomain service method, as returned
     *         by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws LimitExceededException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100 KB.
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies service method
     *           on AmazonCloudSearch.
     * 
     * @return The response from the UpdateServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
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
     *           to execute the DefineIndexField service method on AmazonCloudSearch.
     * 
     * @return The response from the DefineIndexField service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) 
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
     *           parameters to execute the DefineRankExpression service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DefineRankExpression service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineRankExpressionResult defineRankExpression(DefineRankExpressionRequest defineRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the synonym dictionary configured for the search domain.
     * </p>
     *
     * @param describeSynonymOptionsRequest Container for the necessary
     *           parameters to execute the DescribeSynonymOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeSynonymOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSynonymOptionsResult describeSynonymOptions(DescribeSynonymOptionsRequest describeSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the stopwords configured for the search domain.
     * </p>
     *
     * @param describeStopwordOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStopwordOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeStopwordOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStopwordOptionsResult describeStopwordOptions(DescribeStopwordOptionsRequest describeStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain service method on AmazonCloudSearch.
     * 
     * @return The response from the DeleteDomain service method, as returned
     *         by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the resource-based policies that control access
     * to the domain's document and search services.
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           service method on AmazonCloudSearch.
     * 
     * @return The response from the DescribeServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the default search field configured for the search domain.
     * </p>
     *
     * @param describeDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the DescribeDefaultSearchField service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeDefaultSearchField service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDefaultSearchFieldResult describeDefaultSearchField(DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10 KB.
     * </p>
     *
     * @param updateStopwordOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStopwordOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateStopwordOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStopwordOptionsResult updateStopwordOptions(UpdateStopwordOptionsRequest updateStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a synonym dictionary for the search domain. The synonym
     * dictionary is used during indexing to configure mappings for terms
     * that occur in text fields. The maximum size of the synonym dictionary
     * is 100 KB.
     * </p>
     *
     * @param updateSynonymOptionsRequest Container for the necessary
     *           parameters to execute the UpdateSynonymOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateSynonymOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSynonymOptionsResult updateSynonymOptions(UpdateSynonymOptionsRequest updateSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500 KB.
     * </p>
     *
     * @param updateStemmingOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStemmingOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateStemmingOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStemmingOptionsResult updateStemmingOptions(UpdateStemmingOptionsRequest updateStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the stemming dictionary configured for the search domain.
     * </p>
     *
     * @param describeStemmingOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStemmingOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeStemmingOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStemmingOptionsResult describeStemmingOptions(DescribeStemmingOptionsRequest describeStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains service method on AmazonCloudSearch.
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest) 
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
     *           execute the IndexDocuments service method on AmazonCloudSearch.
     * 
     * @return The response from the IndexDocuments service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. Shows all fields by
     * default.
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeIndexFields service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField service method on AmazonCloudSearch.
     * 
     * @return The response from the DeleteIndexField service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        