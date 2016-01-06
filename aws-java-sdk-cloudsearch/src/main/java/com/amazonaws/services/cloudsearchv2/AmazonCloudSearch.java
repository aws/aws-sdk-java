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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudsearchv2.model.*;

/**
 * Interface for accessing AmazonCloudSearchv2.
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
     *           parameters to execute the DescribeAnalysisSchemes service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeAnalysisSchemes service method,
     *         as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAnalysisSchemesResult describeAnalysisSchemes(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest) 
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
     *           to execute the DeleteIndexField service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteIndexField service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) 
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
     *           parameters to execute the UpdateAvailabilityOptions service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateAvailabilityOptions service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws DisabledOperationException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAvailabilityOptionsResult updateAvailabilityOptions(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest) 
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
     *           parameters to execute the DescribeIndexFields service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeIndexFields service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) 
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
     *           to execute the DefineExpression service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineExpression service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineExpressionResult defineExpression(DefineExpressionRequest defineExpressionRequest) 
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
     *           to execute the DefineSuggester service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineSuggester service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineSuggesterResult defineSuggester(DefineSuggesterRequest defineSuggesterRequest) 
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
     *           parameters to execute the UpdateServiceAccessPolicies service method
     *           on AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteAnalysisScheme service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments service method on AmazonCloudSearchv2.
     * 
     * @return The response from the IndexDocuments service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest) 
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
     *           parameters to execute the DescribeSuggesters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeSuggesters service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSuggestersResult describeSuggesters(DescribeSuggestersRequest describeSuggestersRequest) 
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
     *           parameters to execute the UpdateScalingParameters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateScalingParameters service method,
     *         as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateScalingParametersResult updateScalingParameters(UpdateScalingParametersRequest updateScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames service method on AmazonCloudSearchv2.
     * 
     * @return The response from the ListDomainNames service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest) 
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
     *           to execute the DefineIndexField service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineIndexField service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain service method on AmazonCloudSearchv2.
     * 
     * @return The response from the CreateDomain service method, as returned
     *         by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteSuggester service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest deleteSuggesterRequest) 
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
     *           to execute the DeleteExpression service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteExpression service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteExpressionResult deleteExpression(DeleteExpressionRequest deleteExpressionRequest) 
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
     *           parameters to execute the DescribeAvailabilityOptions service method
     *           on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeAvailabilityOptions service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws DisabledOperationException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityOptionsResult describeAvailabilityOptions(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest) 
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
     *           parameters to execute the DefineAnalysisScheme service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DefineAnalysisScheme service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineAnalysisSchemeResult defineAnalysisScheme(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters service method on AmazonCloudSearchv2.
     * 
     * @return The response from the BuildSuggesters service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BuildSuggestersResult buildSuggesters(BuildSuggestersRequest buildSuggestersRequest) 
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
     *           service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
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
     *           execute the DeleteDomain service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteDomain service method, as returned
     *         by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest) 
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
     *           parameters to execute the DescribeExpressions service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeExpressions service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExpressionsResult describeExpressions(DescribeExpressionsRequest describeExpressionsRequest) 
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
     *           to execute the DescribeDomains service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest) 
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
     *           parameters to execute the DescribeScalingParameters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeScalingParameters service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest describeScalingParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @return The response from the ListDomainNames service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainNamesResult listDomainNames() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
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
        