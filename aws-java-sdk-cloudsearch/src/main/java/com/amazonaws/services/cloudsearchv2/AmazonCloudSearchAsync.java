/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cloudsearchv2.model.*;

/**
 * Interface for accessing AmazonCloudSearchv2 asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon CloudSearch Configuration Service <p>
 * You use the Amazon CloudSearch configuration service to create,
 * configure, and manage search domains. Configuration service requests
 * are submitted using the AWS Query protocol. AWS Query requests are
 * HTTP or HTTPS requests submitted via HTTP GET or POST with a query
 * parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * cloudsearch. <i>region</i> .amazonaws.com. For example,
 * cloudsearch.us-east-1.amazonaws.com. For a current list of supported
 * regions and endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"> Regions and Endpoints </a>
 * .
 * </p>
 */
public interface AmazonCloudSearchAsync extends AmazonCloudSearch {
    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme
     * defines language-specific text processing options for a
     * <code>text</code> field. Can be limited to specific analysis schemes
     * by name. By default, shows all analysis schemes and includes any
     * pending changes to the configuration. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAnalysisSchemesRequest Container for the necessary
     *           parameters to execute the DescribeAnalysisSchemes operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAnalysisSchemes service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme
     * defines language-specific text processing options for a
     * <code>text</code> field. Can be limited to specific analysis schemes
     * by name. By default, shows all analysis schemes and includes any
     * pending changes to the configuration. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAnalysisSchemesRequest Container for the necessary
     *           parameters to execute the DescribeAnalysisSchemes operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAnalysisSchemes service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest,
            AsyncHandler<DescribeAnalysisSchemesRequest, DescribeAnalysisSchemesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code> IndexField </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code> IndexField </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest deleteIndexFieldRequest,
            AsyncHandler<DeleteIndexFieldRequest, DeleteIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the availability options for a domain. Enabling the
     * Multi-AZ option expands an Amazon CloudSearch domain to an additional
     * Availability Zone in the same Region to increase fault tolerance in
     * the event of a service disruption. Changes to the Multi-AZ option can
     * take about half an hour to become active. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the UpdateAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the availability options for a domain. Enabling the
     * Multi-AZ option expands an Amazon CloudSearch domain to an additional
     * Availability Zone in the same Region to increase fault tolerance in
     * the event of a service disruption. Changes to the Multi-AZ option can
     * take about half an hour to become active. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the UpdateAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest,
            AsyncHandler<UpdateAvailabilityOptionsRequest, UpdateAvailabilityOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. By default, shows
     * all fields and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Domain Information </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. By default, shows
     * all fields and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Domain Information </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest describeIndexFieldsRequest,
            AsyncHandler<DescribeIndexFieldsRequest, DescribeIndexFieldsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an <code> Expression </code> for the search domain. Used
     * to create new expressions and modify existing ones. If the expression
     * exists, the new configuration replaces the old one. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineExpressionRequest Container for the necessary parameters
     *           to execute the DefineExpression operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineExpressionResult> defineExpressionAsync(DefineExpressionRequest defineExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an <code> Expression </code> for the search domain. Used
     * to create new expressions and modify existing ones. If the expression
     * exists, the new configuration replaces the old one. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineExpressionRequest Container for the necessary parameters
     *           to execute the DefineExpression operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineExpressionResult> defineExpressionAsync(DefineExpressionRequest defineExpressionRequest,
            AsyncHandler<DefineExpressionRequest, DefineExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to
     * display possible matches before users finish typing their queries.
     * When you configure a suggester, you must specify the name of the text
     * field you want to search for possible matches and a unique name for
     * the suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineSuggesterRequest Container for the necessary parameters
     *           to execute the DefineSuggester operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineSuggesterResult> defineSuggesterAsync(DefineSuggesterRequest defineSuggesterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to
     * display possible matches before users finish typing their queries.
     * When you configure a suggester, you must specify the name of the text
     * field you want to search for possible matches and a unique name for
     * the suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineSuggesterRequest Container for the necessary parameters
     *           to execute the DefineSuggester operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineSuggesterResult> defineSuggesterAsync(DefineSuggesterRequest defineSuggesterRequest,
            AsyncHandler<DefineSuggesterRequest, DefineSuggesterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the access rules that control access to the domain's
     * document and search endpoints. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
     * .
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures the access rules that control access to the domain's
     * document and search endpoints. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
     * .
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest,
            AsyncHandler<UpdateServiceAccessPoliciesRequest, UpdateServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest,
            AsyncHandler<DeleteAnalysisSchemeRequest, DeleteAnalysisSchemeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest indexDocumentsRequest,
            AsyncHandler<IndexDocumentsRequest, IndexDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you
     * to display possible matches before users finish typing their queries.
     * Can be limited to specific suggesters by name. By default, shows all
     * suggesters and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeSuggestersRequest Container for the necessary
     *           parameters to execute the DescribeSuggesters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSuggestersResult> describeSuggestersAsync(DescribeSuggestersRequest describeSuggestersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you
     * to display possible matches before users finish typing their queries.
     * Can be limited to specific suggesters by name. By default, shows all
     * suggesters and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeSuggestersRequest Container for the necessary
     *           parameters to execute the DescribeSuggesters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSuggestersResult> describeSuggestersAsync(DescribeSuggestersRequest describeSuggestersRequest,
            AsyncHandler<DescribeSuggestersRequest, DescribeSuggestersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling
     * parameters specify the desired search instance type and replication
     * count. Amazon CloudSearch will still automatically scale your domain
     * based on the volume of data and traffic, but not below the desired
     * instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability
     * Zone. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateScalingParametersRequest Container for the necessary
     *           parameters to execute the UpdateScalingParameters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateScalingParametersResult> updateScalingParametersAsync(UpdateScalingParametersRequest updateScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling
     * parameters specify the desired search instance type and replication
     * count. Amazon CloudSearch will still automatically scale your domain
     * based on the volume of data and traffic, but not below the desired
     * instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability
     * Zone. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateScalingParametersRequest Container for the necessary
     *           parameters to execute the UpdateScalingParameters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateScalingParametersResult> updateScalingParametersAsync(UpdateScalingParametersRequest updateScalingParametersRequest,
            AsyncHandler<UpdateScalingParametersRequest, UpdateScalingParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomainNames service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomainNames service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an <code> IndexField </code> for the search domain. Used
     * to create new fields and modify existing ones. You must specify the
     * name of the domain you are configuring and an index field
     * configuration. The index field configuration specifies a unique name,
     * the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code> IndexFieldType
     * </code> . If the field exists, the new configuration replaces the old
     * one. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an <code> IndexField </code> for the search domain. Used
     * to create new fields and modify existing ones. You must specify the
     * name of the domain you are configuring and an index field
     * configuration. The index field configuration specifies a unique name,
     * the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code> IndexFieldType
     * </code> . If the field exists, the new configuration replaces the old
     * one. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest defineIndexFieldRequest,
            AsyncHandler<DefineIndexFieldRequest, DefineIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSuggesterResult> deleteSuggesterAsync(DeleteSuggesterRequest deleteSuggesterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSuggester service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSuggesterResult> deleteSuggesterAsync(DeleteSuggesterRequest deleteSuggesterRequest,
            AsyncHandler<DeleteSuggesterRequest, DeleteSuggesterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code> Expression </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteExpressionRequest Container for the necessary parameters
     *           to execute the DeleteExpression operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteExpressionResult> deleteExpressionAsync(DeleteExpressionRequest deleteExpressionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an <code> Expression </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteExpressionRequest Container for the necessary parameters
     *           to execute the DeleteExpression operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteExpression service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteExpressionResult> deleteExpressionAsync(DeleteExpressionRequest deleteExpressionRequest,
            AsyncHandler<DeleteExpressionRequest, DeleteExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the availability options configured for a domain. By default,
     * shows the configuration with any pending changes. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the availability options configured for a domain. By default,
     * shows the configuration with any pending changes. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityOptions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityOptions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest,
            AsyncHandler<DescribeAvailabilityOptionsRequest, DescribeAvailabilityOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an analysis scheme that can be applied to a
     * <code>text</code> or <code>text-array</code> field to define
     * language-specific text processing options. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DefineAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DefineAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an analysis scheme that can be applied to a
     * <code>text</code> or <code>text-array</code> field to define
     * language-specific text processing options. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DefineAnalysisScheme operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineAnalysisScheme service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest,
            AsyncHandler<DefineAnalysisSchemeRequest, DefineAnalysisSchemeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         BuildSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BuildSuggestersResult> buildSuggestersAsync(BuildSuggestersRequest buildSuggestersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BuildSuggesters service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BuildSuggestersResult> buildSuggestersAsync(BuildSuggestersRequest buildSuggestersRequest,
            AsyncHandler<BuildSuggestersRequest, BuildSuggestersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the access policies that control access to the
     * domain's document and search endpoints. By default, shows the
     * configuration with any pending changes. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the access policies that control access to the
     * domain's document and search endpoints. By default, shows the
     * configuration with any pending changes. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest,
            AsyncHandler<DescribeServiceAccessPoliciesRequest, DescribeServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a
     * domain has been deleted, it cannot be recovered. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"> Deleting a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a
     * domain has been deleted, it cannot be recovered. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"> Deleting a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited
     * to specific expressions by name. By default, shows all expressions and
     * includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeExpressions operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExpressions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExpressionsResult> describeExpressionsAsync(DescribeExpressionsRequest describeExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited
     * to specific expressions by name. By default, shows all expressions and
     * includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeExpressions operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExpressions service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExpressionsResult> describeExpressionsAsync(DescribeExpressionsRequest describeExpressionsRequest,
            AsyncHandler<DescribeExpressionsRequest, DescribeExpressionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest,
            AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's
     * scaling parameters specify the desired search instance type and
     * replication count. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeScalingParametersRequest Container for the necessary
     *           parameters to execute the DescribeScalingParameters operation on
     *           AmazonCloudSearchv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingParametersResult> describeScalingParametersAsync(DescribeScalingParametersRequest describeScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's
     * scaling parameters specify the desired search instance type and
     * replication count. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeScalingParametersRequest Container for the necessary
     *           parameters to execute the DescribeScalingParameters operation on
     *           AmazonCloudSearchv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingParameters service method, as returned by
     *         AmazonCloudSearchv2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingParametersResult> describeScalingParametersAsync(DescribeScalingParametersRequest describeScalingParametersRequest,
            AsyncHandler<DescribeScalingParametersRequest, DescribeScalingParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        