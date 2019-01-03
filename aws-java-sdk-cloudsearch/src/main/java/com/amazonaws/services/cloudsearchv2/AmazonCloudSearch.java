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
package com.amazonaws.services.cloudsearchv2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudsearchv2.model.*;

/**
 * Interface for accessing Amazon CloudSearch.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudsearchv2.AbstractAmazonCloudSearch} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudSearch Configuration Service</fullname>
 * <p>
 * You use the Amazon CloudSearch configuration service to create, configure, and manage search domains. Configuration
 * service requests are submitted using the AWS Query protocol. AWS Query requests are HTTP or HTTPS requests submitted
 * via HTTP GET or POST with a query parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: cloudsearch.<i>region</i>.amazonaws.com. For
 * example, cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region" target="_blank">Regions and
 * Endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudSearch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudsearch";

    /**
     * Overrides the default endpoint for this client ("https://cloudsearch.us-east-1.amazonaws.com/"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://cloudsearch.us-east-1.amazonaws.com/"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://cloudsearch.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudSearch#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * Indexes the search suggestions. For more information, see <a href=
     * "http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"
     * >Configuring Suggesters</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param buildSuggestersRequest
     *        Container for the parameters to the <code><a>BuildSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update.
     * @return Result of the BuildSuggesters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.BuildSuggesters
     */
    BuildSuggestersResult buildSuggesters(BuildSuggestersRequest buildSuggestersRequest);

    /**
     * <p>
     * Creates a new search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"
     * target="_blank">Creating a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param createDomainRequest
     *        Container for the parameters to the <code><a>CreateDomain</a></code> operation. Specifies a name for the
     *        new search domain.
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @sample AmazonCloudSearch.CreateDomain
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Configures an analysis scheme that can be applied to a <code>text</code> or <code>text-array</code> field to
     * define language-specific text processing options. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineAnalysisSchemeRequest
     *        Container for the parameters to the <code><a>DefineAnalysisScheme</a></code> operation. Specifies the name
     *        of the domain you want to update and the analysis scheme configuration.
     * @return Result of the DefineAnalysisScheme operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineAnalysisScheme
     */
    DefineAnalysisSchemeResult defineAnalysisScheme(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest);

    /**
     * <p>
     * Configures an <code><a>Expression</a></code> for the search domain. Used to create new expressions and modify
     * existing ones. If the expression exists, the new configuration replaces the old one. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineExpressionRequest
     *        Container for the parameters to the <code><a>DefineExpression</a></code> operation. Specifies the name of
     *        the domain you want to update and the expression you want to configure.
     * @return Result of the DefineExpression operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineExpression
     */
    DefineExpressionResult defineExpression(DefineExpressionRequest defineExpressionRequest);

    /**
     * <p>
     * Configures an <code><a>IndexField</a></code> for the search domain. Used to create new fields and modify existing
     * ones. You must specify the name of the domain you are configuring and an index field configuration. The index
     * field configuration specifies a unique name, the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code><a>IndexFieldType</a></code>. If the field exists, the new
     * configuration replaces the old one. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineIndexFieldRequest
     *        Container for the parameters to the <code><a>DefineIndexField</a></code> operation. Specifies the name of
     *        the domain you want to update and the index field configuration.
     * @return Result of the DefineIndexField operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineIndexField
     */
    DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest);

    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to display possible matches before users finish
     * typing their queries. When you configure a suggester, you must specify the name of the text field you want to
     * search for possible matches and a unique name for the suggester. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param defineSuggesterRequest
     *        Container for the parameters to the <code><a>DefineSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update and the suggester configuration.
     * @return Result of the DefineSuggester operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DefineSuggester
     */
    DefineSuggesterResult defineSuggester(DefineSuggesterRequest defineSuggesterRequest);

    /**
     * <p>
     * Deletes an analysis scheme. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteAnalysisSchemeRequest
     *        Container for the parameters to the <code><a>DeleteAnalysisScheme</a></code> operation. Specifies the name
     *        of the domain you want to update and the analysis scheme you want to delete.
     * @return Result of the DeleteAnalysisScheme operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteAnalysisScheme
     */
    DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest);

    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a domain has been deleted, it cannot be recovered.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"
     * target="_blank">Deleting a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code><a>DeleteDomain</a></code> operation. Specifies the name of the
     *        domain you want to delete.
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @sample AmazonCloudSearch.DeleteDomain
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Removes an <code><a>Expression</a></code> from the search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteExpressionRequest
     *        Container for the parameters to the <code><a>DeleteExpression</a></code> operation. Specifies the name of
     *        the domain you want to update and the name of the expression you want to delete.
     * @return Result of the DeleteExpression operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteExpression
     */
    DeleteExpressionResult deleteExpression(DeleteExpressionRequest deleteExpressionRequest);

    /**
     * <p>
     * Removes an <code><a>IndexField</a></code> from the search domain. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteIndexFieldRequest
     *        Container for the parameters to the <code><a>DeleteIndexField</a></code> operation. Specifies the name of
     *        the domain you want to update and the name of the index field you want to delete.
     * @return Result of the DeleteIndexField operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteIndexField
     */
    DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest);

    /**
     * <p>
     * Deletes a suggester. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param deleteSuggesterRequest
     *        Container for the parameters to the <code><a>DeleteSuggester</a></code> operation. Specifies the name of
     *        the domain you want to update and name of the suggester you want to delete.
     * @return Result of the DeleteSuggester operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DeleteSuggester
     */
    DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest deleteSuggesterRequest);

    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme defines language-specific text processing
     * options for a <code>text</code> field. Can be limited to specific analysis schemes by name. By default, shows all
     * analysis schemes and includes any pending changes to the configuration. Set the <code>Deployed</code> option to
     * <code>true</code> to show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"
     * target="_blank">Configuring Analysis Schemes</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeAnalysisSchemesRequest
     *        Container for the parameters to the <code><a>DescribeAnalysisSchemes</a></code> operation. Specifies the
     *        name of the domain you want to describe. To limit the response to particular analysis schemes, specify the
     *        names of the analysis schemes you want to describe. To show the active configuration and exclude any
     *        pending changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeAnalysisSchemes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeAnalysisSchemes
     */
    DescribeAnalysisSchemesResult describeAnalysisSchemes(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest);

    /**
     * <p>
     * Gets the availability options configured for a domain. By default, shows the configuration with any pending
     * changes. Set the <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude
     * pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"
     * target="_blank">Configuring Availability Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeAvailabilityOptionsRequest
     *        Container for the parameters to the <code><a>DescribeAvailabilityOptions</a></code> operation. Specifies
     *        the name of the domain you want to describe. To show the active configuration and exclude any pending
     *        changes, set the Deployed option to <code>true</code>.
     * @return Result of the DescribeAvailabilityOptions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws DisabledOperationException
     *         The request was rejected because it attempted an operation which is not enabled.
     * @sample AmazonCloudSearch.DescribeAvailabilityOptions
     */
    DescribeAvailabilityOptionsResult describeAvailabilityOptions(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest);

    /**
     * <p>
     * Gets information about the search domains owned by this account. Can be limited to specific domains. Shows all
     * domains by default. To get the number of searchable documents in a domain, use the console or submit a
     * <code>matchall</code> request to your domain's search endpoint:
     * <code>q=matchall&amp;amp;q.parser=structured&amp;amp;size=0</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"
     * target="_blank">Getting Information about a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code><a>DescribeDomains</a></code> operation. By default shows the
     *        status of all domains. To restrict the response to particular domains, specify the names of the domains
     *        you want to describe.
     * @return Result of the DescribeDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @sample AmazonCloudSearch.DescribeDomains
     */
    DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest);

    /**
     * Simplified method form for invoking the DescribeDomains operation.
     *
     * @see #describeDomains(DescribeDomainsRequest)
     */
    DescribeDomainsResult describeDomains();

    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited to specific expressions by name. By
     * default, shows all expressions and includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude pending changes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"
     * target="_blank">Configuring Expressions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeExpressionsRequest
     *        Container for the parameters to the <code><a>DescribeDomains</a></code> operation. Specifies the name of
     *        the domain you want to describe. To restrict the response to particular expressions, specify the names of
     *        the expressions you want to describe. To show the active configuration and exclude any pending changes,
     *        set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeExpressions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeExpressions
     */
    DescribeExpressionsResult describeExpressions(DescribeExpressionsRequest describeExpressionsRequest);

    /**
     * <p>
     * Gets information about the index fields configured for the search domain. Can be limited to specific fields by
     * name. By default, shows all fields and includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active configuration and exclude pending changes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"
     * target="_blank">Getting Domain Information</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeIndexFieldsRequest
     *        Container for the parameters to the <code><a>DescribeIndexFields</a></code> operation. Specifies the name
     *        of the domain you want to describe. To restrict the response to particular index fields, specify the names
     *        of the index fields you want to describe. To show the active configuration and exclude any pending
     *        changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeIndexFields operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeIndexFields
     */
    DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest);

    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's scaling parameters specify the desired search
     * instance type and replication count. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"
     * target="_blank">Configuring Scaling Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeScalingParametersRequest
     *        Container for the parameters to the <code><a>DescribeScalingParameters</a></code> operation. Specifies the
     *        name of the domain you want to describe.
     * @return Result of the DescribeScalingParameters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeScalingParameters
     */
    DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest describeScalingParametersRequest);

    /**
     * <p>
     * Gets information about the access policies that control access to the domain's document and search endpoints. By
     * default, shows the configuration with any pending changes. Set the <code>Deployed</code> option to
     * <code>true</code> to show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"
     * target="_blank">Configuring Access for a Search Domain</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeServiceAccessPoliciesRequest
     *        Container for the parameters to the <code><a>DescribeServiceAccessPolicies</a></code> operation. Specifies
     *        the name of the domain you want to describe. To show the active configuration and exclude any pending
     *        changes, set the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeServiceAccessPolicies operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeServiceAccessPolicies
     */
    DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest);

    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you to display possible matches before users
     * finish typing their queries. Can be limited to specific suggesters by name. By default, shows all suggesters and
     * includes any pending changes to the configuration. Set the <code>Deployed</code> option to <code>true</code> to
     * show the active configuration and exclude pending changes. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"
     * target="_blank">Getting Search Suggestions</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param describeSuggestersRequest
     *        Container for the parameters to the <code><a>DescribeSuggester</a></code> operation. Specifies the name of
     *        the domain you want to describe. To restrict the response to particular suggesters, specify the names of
     *        the suggesters you want to describe. To show the active configuration and exclude any pending changes, set
     *        the <code>Deployed</code> option to <code>true</code>.
     * @return Result of the DescribeSuggesters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.DescribeSuggesters
     */
    DescribeSuggestersResult describeSuggesters(DescribeSuggestersRequest describeSuggestersRequest);

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
     * invoked to activate options whose <a>OptionStatus</a> is <code>RequiresIndexDocuments</code>.
     * </p>
     * 
     * @param indexDocumentsRequest
     *        Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of
     *        the domain you want to re-index.
     * @return Result of the IndexDocuments operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @sample AmazonCloudSearch.IndexDocuments
     */
    IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest);

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @sample AmazonCloudSearch.ListDomainNames
     */
    ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * Simplified method form for invoking the ListDomainNames operation.
     *
     * @see #listDomainNames(ListDomainNamesRequest)
     */
    ListDomainNamesResult listDomainNames();

    /**
     * <p>
     * Configures the availability options for a domain. Enabling the Multi-AZ option expands an Amazon CloudSearch
     * domain to an additional Availability Zone in the same Region to increase fault tolerance in the event of a
     * service disruption. Changes to the Multi-AZ option can take about half an hour to become active. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"
     * target="_blank">Configuring Availability Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param updateAvailabilityOptionsRequest
     *        Container for the parameters to the <code><a>UpdateAvailabilityOptions</a></code> operation. Specifies the
     *        name of the domain you want to update and the Multi-AZ availability option.
     * @return Result of the UpdateAvailabilityOptions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws DisabledOperationException
     *         The request was rejected because it attempted an operation which is not enabled.
     * @sample AmazonCloudSearch.UpdateAvailabilityOptions
     */
    UpdateAvailabilityOptionsResult updateAvailabilityOptions(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest);

    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling parameters specify the desired search instance
     * type and replication count. Amazon CloudSearch will still automatically scale your domain based on the volume of
     * data and traffic, but not below the desired instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"
     * target="_blank">Configuring Scaling Options</a> in the <i>Amazon CloudSearch Developer Guide</i>.
     * </p>
     * 
     * @param updateScalingParametersRequest
     *        Container for the parameters to the <code><a>UpdateScalingParameters</a></code> operation. Specifies the
     *        name of the domain you want to update and the scaling parameters you want to configure.
     * @return Result of the UpdateScalingParameters operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @sample AmazonCloudSearch.UpdateScalingParameters
     */
    UpdateScalingParametersResult updateScalingParameters(UpdateScalingParametersRequest updateScalingParametersRequest);

    /**
     * <p>
     * Configures the access rules that control access to the domain's document and search endpoints. For more
     * information, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"
     * target="_blank"> Configuring Access for an Amazon CloudSearch Domain</a>.
     * </p>
     * 
     * @param updateServiceAccessPoliciesRequest
     *        Container for the parameters to the <code><a>UpdateServiceAccessPolicies</a></code> operation. Specifies
     *        the name of the domain you want to update and the access rules you want to configure.
     * @return Result of the UpdateServiceAccessPolicies operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         An internal error occurred while processing the request. If this problem persists, report an issue from
     *         the <a href="http://status.aws.amazon.com/" target="_blank">Service Health Dashboard</a>.
     * @throws LimitExceededException
     *         The request was rejected because a resource limit has already been met.
     * @throws ResourceNotFoundException
     *         The request was rejected because it attempted to reference a resource that does not exist.
     * @throws InvalidTypeException
     *         The request was rejected because it specified an invalid type definition.
     * @sample AmazonCloudSearch.UpdateServiceAccessPolicies
     */
    UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest);

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
