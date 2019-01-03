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

import com.amazonaws.services.cloudsearchv2.model.*;

/**
 * Interface for accessing Amazon CloudSearch asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudsearchv2.AbstractAmazonCloudSearchAsync} instead.
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
public interface AmazonCloudSearchAsync extends AmazonCloudSearch {

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
     * @return A Java Future containing the result of the BuildSuggesters operation returned by the service.
     * @sample AmazonCloudSearchAsync.BuildSuggesters
     */
    java.util.concurrent.Future<BuildSuggestersResult> buildSuggestersAsync(BuildSuggestersRequest buildSuggestersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BuildSuggesters operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.BuildSuggesters
     */
    java.util.concurrent.Future<BuildSuggestersResult> buildSuggestersAsync(BuildSuggestersRequest buildSuggestersRequest,
            com.amazonaws.handlers.AsyncHandler<BuildSuggestersRequest, BuildSuggestersResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonCloudSearchAsync.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DefineAnalysisScheme operation returned by the service.
     * @sample AmazonCloudSearchAsync.DefineAnalysisScheme
     */
    java.util.concurrent.Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DefineAnalysisScheme operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DefineAnalysisScheme
     */
    java.util.concurrent.Future<DefineAnalysisSchemeResult> defineAnalysisSchemeAsync(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest,
            com.amazonaws.handlers.AsyncHandler<DefineAnalysisSchemeRequest, DefineAnalysisSchemeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DefineExpression operation returned by the service.
     * @sample AmazonCloudSearchAsync.DefineExpression
     */
    java.util.concurrent.Future<DefineExpressionResult> defineExpressionAsync(DefineExpressionRequest defineExpressionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DefineExpression operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DefineExpression
     */
    java.util.concurrent.Future<DefineExpressionResult> defineExpressionAsync(DefineExpressionRequest defineExpressionRequest,
            com.amazonaws.handlers.AsyncHandler<DefineExpressionRequest, DefineExpressionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DefineIndexField operation returned by the service.
     * @sample AmazonCloudSearchAsync.DefineIndexField
     */
    java.util.concurrent.Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest defineIndexFieldRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DefineIndexField operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DefineIndexField
     */
    java.util.concurrent.Future<DefineIndexFieldResult> defineIndexFieldAsync(DefineIndexFieldRequest defineIndexFieldRequest,
            com.amazonaws.handlers.AsyncHandler<DefineIndexFieldRequest, DefineIndexFieldResult> asyncHandler);

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
     * @return A Java Future containing the result of the DefineSuggester operation returned by the service.
     * @sample AmazonCloudSearchAsync.DefineSuggester
     */
    java.util.concurrent.Future<DefineSuggesterResult> defineSuggesterAsync(DefineSuggesterRequest defineSuggesterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DefineSuggester operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DefineSuggester
     */
    java.util.concurrent.Future<DefineSuggesterResult> defineSuggesterAsync(DefineSuggesterRequest defineSuggesterRequest,
            com.amazonaws.handlers.AsyncHandler<DefineSuggesterRequest, DefineSuggesterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteAnalysisScheme operation returned by the service.
     * @sample AmazonCloudSearchAsync.DeleteAnalysisScheme
     */
    java.util.concurrent.Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnalysisScheme operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DeleteAnalysisScheme
     */
    java.util.concurrent.Future<DeleteAnalysisSchemeResult> deleteAnalysisSchemeAsync(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnalysisSchemeRequest, DeleteAnalysisSchemeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonCloudSearchAsync.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteExpression operation returned by the service.
     * @sample AmazonCloudSearchAsync.DeleteExpression
     */
    java.util.concurrent.Future<DeleteExpressionResult> deleteExpressionAsync(DeleteExpressionRequest deleteExpressionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExpression operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DeleteExpression
     */
    java.util.concurrent.Future<DeleteExpressionResult> deleteExpressionAsync(DeleteExpressionRequest deleteExpressionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExpressionRequest, DeleteExpressionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIndexField operation returned by the service.
     * @sample AmazonCloudSearchAsync.DeleteIndexField
     */
    java.util.concurrent.Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest deleteIndexFieldRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIndexField operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DeleteIndexField
     */
    java.util.concurrent.Future<DeleteIndexFieldResult> deleteIndexFieldAsync(DeleteIndexFieldRequest deleteIndexFieldRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIndexFieldRequest, DeleteIndexFieldResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSuggester operation returned by the service.
     * @sample AmazonCloudSearchAsync.DeleteSuggester
     */
    java.util.concurrent.Future<DeleteSuggesterResult> deleteSuggesterAsync(DeleteSuggesterRequest deleteSuggesterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSuggester operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DeleteSuggester
     */
    java.util.concurrent.Future<DeleteSuggesterResult> deleteSuggesterAsync(DeleteSuggesterRequest deleteSuggesterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSuggesterRequest, DeleteSuggesterResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAnalysisSchemes operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeAnalysisSchemes
     */
    java.util.concurrent.Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnalysisSchemes operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeAnalysisSchemes
     */
    java.util.concurrent.Future<DescribeAnalysisSchemesResult> describeAnalysisSchemesAsync(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnalysisSchemesRequest, DescribeAnalysisSchemesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAvailabilityOptions operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeAvailabilityOptions
     */
    java.util.concurrent.Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(
            DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAvailabilityOptions operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeAvailabilityOptions
     */
    java.util.concurrent.Future<DescribeAvailabilityOptionsResult> describeAvailabilityOptionsAsync(
            DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAvailabilityOptionsRequest, DescribeAvailabilityOptionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDomains operation.
     *
     * @see #describeDomainsAsync(DescribeDomainsRequest)
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync();

    /**
     * Simplified method form for invoking the DescribeDomains operation with an AsyncHandler.
     *
     * @see #describeDomainsAsync(DescribeDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeExpressions operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeExpressions
     */
    java.util.concurrent.Future<DescribeExpressionsResult> describeExpressionsAsync(DescribeExpressionsRequest describeExpressionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExpressions operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeExpressions
     */
    java.util.concurrent.Future<DescribeExpressionsResult> describeExpressionsAsync(DescribeExpressionsRequest describeExpressionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExpressionsRequest, DescribeExpressionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeIndexFields operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeIndexFields
     */
    java.util.concurrent.Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest describeIndexFieldsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIndexFields operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeIndexFields
     */
    java.util.concurrent.Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(DescribeIndexFieldsRequest describeIndexFieldsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIndexFieldsRequest, DescribeIndexFieldsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeScalingParameters operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeScalingParameters
     */
    java.util.concurrent.Future<DescribeScalingParametersResult> describeScalingParametersAsync(
            DescribeScalingParametersRequest describeScalingParametersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingParameters operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeScalingParameters
     */
    java.util.concurrent.Future<DescribeScalingParametersResult> describeScalingParametersAsync(
            DescribeScalingParametersRequest describeScalingParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingParametersRequest, DescribeScalingParametersResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeServiceAccessPolicies operation returned by the
     *         service.
     * @sample AmazonCloudSearchAsync.DescribeServiceAccessPolicies
     */
    java.util.concurrent.Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(
            DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceAccessPolicies operation returned by the
     *         service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeServiceAccessPolicies
     */
    java.util.concurrent.Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(
            DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceAccessPoliciesRequest, DescribeServiceAccessPoliciesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeSuggesters operation returned by the service.
     * @sample AmazonCloudSearchAsync.DescribeSuggesters
     */
    java.util.concurrent.Future<DescribeSuggestersResult> describeSuggestersAsync(DescribeSuggestersRequest describeSuggestersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSuggesters operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.DescribeSuggesters
     */
    java.util.concurrent.Future<DescribeSuggestersResult> describeSuggestersAsync(DescribeSuggestersRequest describeSuggestersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSuggestersRequest, DescribeSuggestersResult> asyncHandler);

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
     * invoked to activate options whose <a>OptionStatus</a> is <code>RequiresIndexDocuments</code>.
     * </p>
     * 
     * @param indexDocumentsRequest
     *        Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of
     *        the domain you want to re-index.
     * @return A Java Future containing the result of the IndexDocuments operation returned by the service.
     * @sample AmazonCloudSearchAsync.IndexDocuments
     */
    java.util.concurrent.Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest indexDocumentsRequest);

    /**
     * <p>
     * Tells the search domain to start indexing its documents using the latest indexing options. This operation must be
     * invoked to activate options whose <a>OptionStatus</a> is <code>RequiresIndexDocuments</code>.
     * </p>
     * 
     * @param indexDocumentsRequest
     *        Container for the parameters to the <code><a>IndexDocuments</a></code> operation. Specifies the name of
     *        the domain you want to re-index.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IndexDocuments operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.IndexDocuments
     */
    java.util.concurrent.Future<IndexDocumentsResult> indexDocumentsAsync(IndexDocumentsRequest indexDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<IndexDocumentsRequest, IndexDocumentsResult> asyncHandler);

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonCloudSearchAsync.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDomainNames operation.
     *
     * @see #listDomainNamesAsync(ListDomainNamesRequest)
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync();

    /**
     * Simplified method form for invoking the ListDomainNames operation with an AsyncHandler.
     *
     * @see #listDomainNamesAsync(ListDomainNamesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateAvailabilityOptions operation returned by the service.
     * @sample AmazonCloudSearchAsync.UpdateAvailabilityOptions
     */
    java.util.concurrent.Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(
            UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAvailabilityOptions operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.UpdateAvailabilityOptions
     */
    java.util.concurrent.Future<UpdateAvailabilityOptionsResult> updateAvailabilityOptionsAsync(
            UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAvailabilityOptionsRequest, UpdateAvailabilityOptionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateScalingParameters operation returned by the service.
     * @sample AmazonCloudSearchAsync.UpdateScalingParameters
     */
    java.util.concurrent.Future<UpdateScalingParametersResult> updateScalingParametersAsync(UpdateScalingParametersRequest updateScalingParametersRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScalingParameters operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.UpdateScalingParameters
     */
    java.util.concurrent.Future<UpdateScalingParametersResult> updateScalingParametersAsync(UpdateScalingParametersRequest updateScalingParametersRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScalingParametersRequest, UpdateScalingParametersResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateServiceAccessPolicies operation returned by the service.
     * @sample AmazonCloudSearchAsync.UpdateServiceAccessPolicies
     */
    java.util.concurrent.Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(
            UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceAccessPolicies operation returned by the service.
     * @sample AmazonCloudSearchAsyncHandler.UpdateServiceAccessPolicies
     */
    java.util.concurrent.Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(
            UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceAccessPoliciesRequest, UpdateServiceAccessPoliciesResult> asyncHandler);

}
