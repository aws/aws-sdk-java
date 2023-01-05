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
package com.amazonaws.services.kendra;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;

/**
 * Interface for accessing kendra asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kendra.AbstractAWSkendraAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Kendra is a service for indexing large document sets.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSkendraAsync extends AWSkendra {

    /**
     * <p>
     * Grants users or groups in your IAM Identity Center identity source access to your Amazon Kendra experience. You
     * can create an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associateEntitiesToExperienceRequest
     * @return A Java Future containing the result of the AssociateEntitiesToExperience operation returned by the
     *         service.
     * @sample AWSkendraAsync.AssociateEntitiesToExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociateEntitiesToExperience"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEntitiesToExperienceResult> associateEntitiesToExperienceAsync(
            AssociateEntitiesToExperienceRequest associateEntitiesToExperienceRequest);

    /**
     * <p>
     * Grants users or groups in your IAM Identity Center identity source access to your Amazon Kendra experience. You
     * can create an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associateEntitiesToExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateEntitiesToExperience operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.AssociateEntitiesToExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociateEntitiesToExperience"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEntitiesToExperienceResult> associateEntitiesToExperienceAsync(
            AssociateEntitiesToExperienceRequest associateEntitiesToExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateEntitiesToExperienceRequest, AssociateEntitiesToExperienceResult> asyncHandler);

    /**
     * <p>
     * Defines the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associatePersonasToEntitiesRequest
     * @return A Java Future containing the result of the AssociatePersonasToEntities operation returned by the service.
     * @sample AWSkendraAsync.AssociatePersonasToEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociatePersonasToEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePersonasToEntitiesResult> associatePersonasToEntitiesAsync(
            AssociatePersonasToEntitiesRequest associatePersonasToEntitiesRequest);

    /**
     * <p>
     * Defines the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param associatePersonasToEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePersonasToEntities operation returned by the service.
     * @sample AWSkendraAsyncHandler.AssociatePersonasToEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociatePersonasToEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePersonasToEntitiesResult> associatePersonasToEntitiesAsync(
            AssociatePersonasToEntitiesRequest associatePersonasToEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePersonasToEntitiesRequest, AssociatePersonasToEntitiesResult> asyncHandler);

    /**
     * <p>
     * Removes one or more documents from an index. The documents must have been added with the
     * <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services
     * CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return A Java Future containing the result of the BatchDeleteDocument operation returned by the service.
     * @sample AWSkendraAsync.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest batchDeleteDocumentRequest);

    /**
     * <p>
     * Removes one or more documents from an index. The documents must have been added with the
     * <code>BatchPutDocument</code> API.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services
     * CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteDocument operation returned by the service.
     * @sample AWSkendraAsyncHandler.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDocumentResult> batchDeleteDocumentAsync(BatchDeleteDocumentRequest batchDeleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDocumentRequest, BatchDeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Returns the indexing status for one or more documents submitted with the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html"> BatchPutDocument</a> API.
     * </p>
     * <p>
     * When you use the <code>BatchPutDocument</code> API, documents are indexed asynchronously. You can use the
     * <code>BatchGetDocumentStatus</code> API to get the current status of a list of documents so that you can
     * determine if they have been successfully indexed.
     * </p>
     * <p>
     * You can also use the <code>BatchGetDocumentStatus</code> API to check the status of the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchDeleteDocument.html"> BatchDeleteDocument</a> API.
     * When a document is deleted from the index, Amazon Kendra returns <code>NOT_FOUND</code> as the status.
     * </p>
     * 
     * @param batchGetDocumentStatusRequest
     * @return A Java Future containing the result of the BatchGetDocumentStatus operation returned by the service.
     * @sample AWSkendraAsync.BatchGetDocumentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(BatchGetDocumentStatusRequest batchGetDocumentStatusRequest);

    /**
     * <p>
     * Returns the indexing status for one or more documents submitted with the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html"> BatchPutDocument</a> API.
     * </p>
     * <p>
     * When you use the <code>BatchPutDocument</code> API, documents are indexed asynchronously. You can use the
     * <code>BatchGetDocumentStatus</code> API to get the current status of a list of documents so that you can
     * determine if they have been successfully indexed.
     * </p>
     * <p>
     * You can also use the <code>BatchGetDocumentStatus</code> API to check the status of the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchDeleteDocument.html"> BatchDeleteDocument</a> API.
     * When a document is deleted from the index, Amazon Kendra returns <code>NOT_FOUND</code> as the status.
     * </p>
     * 
     * @param batchGetDocumentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetDocumentStatus operation returned by the service.
     * @sample AWSkendraAsyncHandler.BatchGetDocumentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetDocumentStatusResult> batchGetDocumentStatusAsync(BatchGetDocumentStatusRequest batchGetDocumentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetDocumentStatusRequest, BatchGetDocumentStatusResult> asyncHandler);

    /**
     * <p>
     * Adds one or more documents to an index.
     * </p>
     * <p>
     * The <code>BatchPutDocument</code> API enables you to ingest inline documents or a set of documents stored in an
     * Amazon S3 bucket. Use this API to ingest your text and unstructured text into an index, add custom attributes to
     * the documents, and to attach an access control list to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services
     * CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch
     * log.
     * </p>
     * <p>
     * For an example of ingesting inline documents using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-binary-doc.html">Adding files directly to an
     * index</a>.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return A Java Future containing the result of the BatchPutDocument operation returned by the service.
     * @sample AWSkendraAsync.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest batchPutDocumentRequest);

    /**
     * <p>
     * Adds one or more documents to an index.
     * </p>
     * <p>
     * The <code>BatchPutDocument</code> API enables you to ingest inline documents or a set of documents stored in an
     * Amazon S3 bucket. Use this API to ingest your text and unstructured text into an index, add custom attributes to
     * the documents, and to attach an access control list to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services
     * CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch
     * log.
     * </p>
     * <p>
     * For an example of ingesting inline documents using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-binary-doc.html">Adding files directly to an
     * index</a>.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutDocument operation returned by the service.
     * @sample AWSkendraAsyncHandler.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchPutDocumentResult> batchPutDocumentAsync(BatchPutDocumentRequest batchPutDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutDocumentRequest, BatchPutDocumentResult> asyncHandler);

    /**
     * <p>
     * Clears existing query suggestions from an index.
     * </p>
     * <p>
     * This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon
     * Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions.
     * If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new
     * suggestions.
     * </p>
     * <p>
     * <code>ClearQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param clearQuerySuggestionsRequest
     * @return A Java Future containing the result of the ClearQuerySuggestions operation returned by the service.
     * @sample AWSkendraAsync.ClearQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ClearQuerySuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(ClearQuerySuggestionsRequest clearQuerySuggestionsRequest);

    /**
     * <p>
     * Clears existing query suggestions from an index.
     * </p>
     * <p>
     * This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon
     * Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions.
     * If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new
     * suggestions.
     * </p>
     * <p>
     * <code>ClearQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param clearQuerySuggestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ClearQuerySuggestions operation returned by the service.
     * @sample AWSkendraAsyncHandler.ClearQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ClearQuerySuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ClearQuerySuggestionsResult> clearQuerySuggestionsAsync(ClearQuerySuggestionsRequest clearQuerySuggestionsRequest,
            com.amazonaws.handlers.AsyncHandler<ClearQuerySuggestionsRequest, ClearQuerySuggestionsResult> asyncHandler);

    /**
     * <p>
     * Creates an access configuration for your documents. This includes user and group access information for your
     * documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * <p>
     * You can use this to re-configure your existing document level access control without indexing all of your
     * documents again. For example, your index contains top-secret company documents that only certain employees or
     * users should access. One of these users leaves the company or switches to a team that should be blocked from
     * accessing top-secret documents. The user still has access to top-secret documents because the user had access
     * when your documents were previously indexed. You can create a specific access control configuration for the user
     * with deny access. You can later update the access control configuration to allow access if the user returns to
     * the company and re-joins the 'top-secret' team. You can re-configure access control for your documents as
     * circumstances change.
     * </p>
     * <p>
     * To apply your access control configuration to certain documents, you call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API with the
     * <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you update the <code>.metadata.json</code> with the
     * <code>AccessControlConfigurationId</code> and synchronize your data source. Amazon Kendra currently only supports
     * access control configuration for S3 data sources and documents indexed using the <code>BatchPutDocument</code>
     * API.
     * </p>
     * 
     * @param createAccessControlConfigurationRequest
     * @return A Java Future containing the result of the CreateAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsync.CreateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessControlConfigurationResult> createAccessControlConfigurationAsync(
            CreateAccessControlConfigurationRequest createAccessControlConfigurationRequest);

    /**
     * <p>
     * Creates an access configuration for your documents. This includes user and group access information for your
     * documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * <p>
     * You can use this to re-configure your existing document level access control without indexing all of your
     * documents again. For example, your index contains top-secret company documents that only certain employees or
     * users should access. One of these users leaves the company or switches to a team that should be blocked from
     * accessing top-secret documents. The user still has access to top-secret documents because the user had access
     * when your documents were previously indexed. You can create a specific access control configuration for the user
     * with deny access. You can later update the access control configuration to allow access if the user returns to
     * the company and re-joins the 'top-secret' team. You can re-configure access control for your documents as
     * circumstances change.
     * </p>
     * <p>
     * To apply your access control configuration to certain documents, you call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API with the
     * <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you update the <code>.metadata.json</code> with the
     * <code>AccessControlConfigurationId</code> and synchronize your data source. Amazon Kendra currently only supports
     * access control configuration for S3 data sources and documents indexed using the <code>BatchPutDocument</code>
     * API.
     * </p>
     * 
     * @param createAccessControlConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.CreateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessControlConfigurationResult> createAccessControlConfigurationAsync(
            CreateAccessControlConfigurationRequest createAccessControlConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessControlConfigurationRequest, CreateAccessControlConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a data source connector that you want to use with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, data source connector type and description for your data source. You also specify
     * configuration information for the data source connector.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation returns 200 if the data source was
     * successfully created. Otherwise, an exception is raised.
     * </p>
     * <p>
     * Amazon S3 and <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-custom.html">custom</a> data
     * sources are the only supported data sources in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSkendraAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a data source connector that you want to use with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, data source connector type and description for your data source. You also specify
     * configuration information for the data source connector.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation returns 200 if the data source was
     * successfully created. Otherwise, an exception is raised.
     * </p>
     * <p>
     * Amazon S3 and <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-custom.html">custom</a> data
     * sources are the only supported data sources in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSkendraAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, including using the Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param createExperienceRequest
     * @return A Java Future containing the result of the CreateExperience operation returned by the service.
     * @sample AWSkendraAsync.CreateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperienceResult> createExperienceAsync(CreateExperienceRequest createExperienceRequest);

    /**
     * <p>
     * Creates an Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, including using the Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param createExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExperience operation returned by the service.
     * @sample AWSkendraAsyncHandler.CreateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExperienceResult> createExperienceAsync(CreateExperienceRequest createExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExperienceRequest, CreateExperienceResult> asyncHandler);

    /**
     * <p>
     * Creates an new set of frequently asked question (FAQ) questions and answers.
     * </p>
     * <p>
     * Adding FAQs to an index is an asynchronous operation.
     * </p>
     * <p>
     * For an example of adding an FAQ to an index using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html#using-faq-file">Using your FAQ file</a>.
     * </p>
     * 
     * @param createFaqRequest
     * @return A Java Future containing the result of the CreateFaq operation returned by the service.
     * @sample AWSkendraAsync.CreateFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFaqResult> createFaqAsync(CreateFaqRequest createFaqRequest);

    /**
     * <p>
     * Creates an new set of frequently asked question (FAQ) questions and answers.
     * </p>
     * <p>
     * Adding FAQs to an index is an asynchronous operation.
     * </p>
     * <p>
     * For an example of adding an FAQ to an index using Python and Java SDKs, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-creating-faq.html#using-faq-file">Using your FAQ file</a>.
     * </p>
     * 
     * @param createFaqRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFaq operation returned by the service.
     * @sample AWSkendraAsyncHandler.CreateFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFaqResult> createFaqAsync(CreateFaqRequest createFaqRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFaqRequest, CreateFaqResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Kendra index. Index creation is an asynchronous API. To determine if index creation has
     * completed, check the <code>Status</code> field returned from a call to <code>DescribeIndex</code>. The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the <code>BatchPutDocument</code> API or using one of
     * the supported data sources.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createIndexRequest
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSkendraAsync.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates an Amazon Kendra index. Index creation is an asynchronous API. To determine if index creation has
     * completed, check the <code>Status</code> field returned from a call to <code>DescribeIndex</code>. The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the <code>BatchPutDocument</code> API or using one of
     * the supported data sources.
     * </p>
     * <p>
     * For an example of creating an index and data source using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-python.html">Getting started with Python SDK</a>. For an
     * example of creating an index and data source using the Java SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/gs-java.html">Getting started with Java SDK</a>.
     * </p>
     * 
     * @param createIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSkendraAsyncHandler.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler);

    /**
     * <p>
     * Creates a block list to exlcude certain queries from suggestions.
     * </p>
     * <p>
     * Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown
     * as a suggestion.
     * </p>
     * <p>
     * You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter
     * each block word or phrase on a separate line.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * <p>
     * <code>CreateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * <p>
     * For an example of creating a block list for query suggestions using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/query-suggestions.html#suggestions-block-list">Query
     * suggestions block list</a>.
     * </p>
     * 
     * @param createQuerySuggestionsBlockListRequest
     * @return A Java Future containing the result of the CreateQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsync.CreateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            CreateQuerySuggestionsBlockListRequest createQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Creates a block list to exlcude certain queries from suggestions.
     * </p>
     * <p>
     * Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown
     * as a suggestion.
     * </p>
     * <p>
     * You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter
     * each block word or phrase on a separate line.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * <p>
     * <code>CreateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * <p>
     * For an example of creating a block list for query suggestions using the Python SDK, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/query-suggestions.html#suggestions-block-list">Query
     * suggestions block list</a>.
     * </p>
     * 
     * @param createQuerySuggestionsBlockListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.CreateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQuerySuggestionsBlockListResult> createQuerySuggestionsBlockListAsync(
            CreateQuerySuggestionsBlockListRequest createQuerySuggestionsBlockListRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQuerySuggestionsBlockListRequest, CreateQuerySuggestionsBlockListResult> asyncHandler);

    /**
     * <p>
     * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format.
     * </p>
     * <p>
     * For an example of adding a thesaurus file to an index, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/index-synonyms-adding-thesaurus-file.html">Adding custom
     * synonyms to an index</a>.
     * </p>
     * 
     * @param createThesaurusRequest
     * @return A Java Future containing the result of the CreateThesaurus operation returned by the service.
     * @sample AWSkendraAsync.CreateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(CreateThesaurusRequest createThesaurusRequest);

    /**
     * <p>
     * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format.
     * </p>
     * <p>
     * For an example of adding a thesaurus file to an index, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/index-synonyms-adding-thesaurus-file.html">Adding custom
     * synonyms to an index</a>.
     * </p>
     * 
     * @param createThesaurusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThesaurus operation returned by the service.
     * @sample AWSkendraAsyncHandler.CreateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateThesaurusResult> createThesaurusAsync(CreateThesaurusRequest createThesaurusRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThesaurusRequest, CreateThesaurusResult> asyncHandler);

    /**
     * <p>
     * Deletes an access control configuration that you created for your documents in an index. This includes user and
     * group access information for your documents. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param deleteAccessControlConfigurationRequest
     * @return A Java Future containing the result of the DeleteAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsync.DeleteAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlConfigurationResult> deleteAccessControlConfigurationAsync(
            DeleteAccessControlConfigurationRequest deleteAccessControlConfigurationRequest);

    /**
     * <p>
     * Deletes an access control configuration that you created for your documents in an index. This includes user and
     * group access information for your documents. This is useful for user context filtering, where search results are
     * filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param deleteAccessControlConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DeleteAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessControlConfigurationResult> deleteAccessControlConfigurationAsync(
            DeleteAccessControlConfigurationRequest deleteAccessControlConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessControlConfigurationRequest, DeleteAccessControlConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Kendra data source connector. An exception is not thrown if the data source is already being
     * deleted. While the data source is being deleted, the <code>Status</code> field returned by a call to the
     * <code>DescribeDataSource</code> API is set to <code>DELETING</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html">Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSkendraAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes an Amazon Kendra data source connector. An exception is not thrown if the data source is already being
     * deleted. While the data source is being deleted, the <code>Status</code> field returned by a call to the
     * <code>DescribeDataSource</code> API is set to <code>DELETING</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html">Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param deleteExperienceRequest
     * @return A Java Future containing the result of the DeleteExperience operation returned by the service.
     * @sample AWSkendraAsync.DeleteExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperienceResult> deleteExperienceAsync(DeleteExperienceRequest deleteExperienceRequest);

    /**
     * <p>
     * Deletes your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param deleteExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExperience operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeleteExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExperienceResult> deleteExperienceAsync(DeleteExperienceRequest deleteExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExperienceRequest, DeleteExperienceResult> asyncHandler);

    /**
     * <p>
     * Removes an FAQ from an index.
     * </p>
     * 
     * @param deleteFaqRequest
     * @return A Java Future containing the result of the DeleteFaq operation returned by the service.
     * @sample AWSkendraAsync.DeleteFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(DeleteFaqRequest deleteFaqRequest);

    /**
     * <p>
     * Removes an FAQ from an index.
     * </p>
     * 
     * @param deleteFaqRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFaq operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeleteFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFaqResult> deleteFaqAsync(DeleteFaqRequest deleteFaqRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFaqRequest, DeleteFaqResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While
     * the index is being deleted, the <code>Status</code> field returned by a call to the <code>DescribeIndex</code>
     * API is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSkendraAsync.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest);

    /**
     * <p>
     * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While
     * the index is being deleted, the <code>Status</code> field returned by a call to the <code>DescribeIndex</code>
     * API is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group.
     * </p>
     * <p>
     * For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see
     * intern-only documents in their search results.
     * </p>
     * <p>
     * If you want to delete or replace users or sub groups of a group, you need to use the
     * <code>PutPrincipalMapping</code> operation. For example, if a user in the group "Engineering" leaves the
     * engineering team and another user takes their place, you provide an updated list of users or sub groups that
     * belong to the "Engineering" group when calling <code>PutPrincipalMapping</code>. You can update your internal
     * list of users or sub groups and input this list when calling <code>PutPrincipalMapping</code>.
     * </p>
     * <p>
     * <code>DeletePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param deletePrincipalMappingRequest
     * @return A Java Future containing the result of the DeletePrincipalMapping operation returned by the service.
     * @sample AWSkendraAsync.DeletePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeletePrincipalMapping" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(DeletePrincipalMappingRequest deletePrincipalMappingRequest);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group.
     * </p>
     * <p>
     * For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see
     * intern-only documents in their search results.
     * </p>
     * <p>
     * If you want to delete or replace users or sub groups of a group, you need to use the
     * <code>PutPrincipalMapping</code> operation. For example, if a user in the group "Engineering" leaves the
     * engineering team and another user takes their place, you provide an updated list of users or sub groups that
     * belong to the "Engineering" group when calling <code>PutPrincipalMapping</code>. You can update your internal
     * list of users or sub groups and input this list when calling <code>PutPrincipalMapping</code>.
     * </p>
     * <p>
     * <code>DeletePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param deletePrincipalMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePrincipalMapping operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeletePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeletePrincipalMapping" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrincipalMappingResult> deletePrincipalMappingAsync(DeletePrincipalMappingRequest deletePrincipalMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePrincipalMappingRequest, DeletePrincipalMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list
     * to add back the queries that were previously blocked.
     * </p>
     * <p>
     * <code>DeleteQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param deleteQuerySuggestionsBlockListRequest
     * @return A Java Future containing the result of the DeleteQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsync.DeleteQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            DeleteQuerySuggestionsBlockListRequest deleteQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Deletes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list
     * to add back the queries that were previously blocked.
     * </p>
     * <p>
     * <code>DeleteQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param deleteQuerySuggestionsBlockListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DeleteQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQuerySuggestionsBlockListResult> deleteQuerySuggestionsBlockListAsync(
            DeleteQuerySuggestionsBlockListRequest deleteQuerySuggestionsBlockListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQuerySuggestionsBlockListRequest, DeleteQuerySuggestionsBlockListResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param deleteThesaurusRequest
     * @return A Java Future containing the result of the DeleteThesaurus operation returned by the service.
     * @sample AWSkendraAsync.DeleteThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(DeleteThesaurusRequest deleteThesaurusRequest);

    /**
     * <p>
     * Deletes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param deleteThesaurusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThesaurus operation returned by the service.
     * @sample AWSkendraAsyncHandler.DeleteThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThesaurusResult> deleteThesaurusAsync(DeleteThesaurusRequest deleteThesaurusRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThesaurusRequest, DeleteThesaurusResult> asyncHandler);

    /**
     * <p>
     * Gets information about an access control configuration that you created for your documents in an index. This
     * includes user and group access information for your documents. This is useful for user context filtering, where
     * search results are filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param describeAccessControlConfigurationRequest
     * @return A Java Future containing the result of the DescribeAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsync.DescribeAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessControlConfigurationResult> describeAccessControlConfigurationAsync(
            DescribeAccessControlConfigurationRequest describeAccessControlConfigurationRequest);

    /**
     * <p>
     * Gets information about an access control configuration that you created for your documents in an index. This
     * includes user and group access information for your documents. This is useful for user context filtering, where
     * search results are filtered based on the user or their group access to documents.
     * </p>
     * 
     * @param describeAccessControlConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DescribeAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccessControlConfigurationResult> describeAccessControlConfigurationAsync(
            DescribeAccessControlConfigurationRequest describeAccessControlConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessControlConfigurationRequest, DescribeAccessControlConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about an Amazon Kendra data source connector.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return A Java Future containing the result of the DescribeDataSource operation returned by the service.
     * @sample AWSkendraAsync.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest describeDataSourceRequest);

    /**
     * <p>
     * Gets information about an Amazon Kendra data source connector.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSource operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest describeDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourceRequest, DescribeDataSourceResult> asyncHandler);

    /**
     * <p>
     * Gets information about your Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param describeExperienceRequest
     * @return A Java Future containing the result of the DescribeExperience operation returned by the service.
     * @sample AWSkendraAsync.DescribeExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExperienceResult> describeExperienceAsync(DescribeExperienceRequest describeExperienceRequest);

    /**
     * <p>
     * Gets information about your Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param describeExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExperience operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribeExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeExperienceResult> describeExperienceAsync(DescribeExperienceRequest describeExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExperienceRequest, DescribeExperienceResult> asyncHandler);

    /**
     * <p>
     * Gets information about an FAQ list.
     * </p>
     * 
     * @param describeFaqRequest
     * @return A Java Future containing the result of the DescribeFaq operation returned by the service.
     * @sample AWSkendraAsync.DescribeFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(DescribeFaqRequest describeFaqRequest);

    /**
     * <p>
     * Gets information about an FAQ list.
     * </p>
     * 
     * @param describeFaqRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFaq operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribeFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFaq" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFaqResult> describeFaqAsync(DescribeFaqRequest describeFaqRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFaqRequest, DescribeFaqResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Kendra index.
     * </p>
     * 
     * @param describeIndexRequest
     * @return A Java Future containing the result of the DescribeIndex operation returned by the service.
     * @sample AWSkendraAsync.DescribeIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest describeIndexRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Kendra index.
     * </p>
     * 
     * @param describeIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIndex operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribeIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeIndexResult> describeIndexAsync(DescribeIndexRequest describeIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIndexRequest, DescribeIndexResult> asyncHandler);

    /**
     * <p>
     * Describes the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
     * This includes information on the status of actions currently processing or yet to be processed, when actions were
     * last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after
     * other actions, and useful error messages if an action could not be processed.
     * </p>
     * <p>
     * <code>DescribePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param describePrincipalMappingRequest
     * @return A Java Future containing the result of the DescribePrincipalMapping operation returned by the service.
     * @sample AWSkendraAsync.DescribePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(DescribePrincipalMappingRequest describePrincipalMappingRequest);

    /**
     * <p>
     * Describes the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
     * This includes information on the status of actions currently processing or yet to be processed, when actions were
     * last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after
     * other actions, and useful error messages if an action could not be processed.
     * </p>
     * <p>
     * <code>DescribePrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West)
     * region.
     * </p>
     * 
     * @param describePrincipalMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePrincipalMapping operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePrincipalMappingResult> describePrincipalMappingAsync(DescribePrincipalMappingRequest describePrincipalMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePrincipalMappingRequest, DescribePrincipalMappingResult> asyncHandler);

    /**
     * <p>
     * Gets information about a block list used for query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings that are applied to a block list.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsBlockListRequest
     * @return A Java Future containing the result of the DescribeQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsync.DescribeQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            DescribeQuerySuggestionsBlockListRequest describeQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Gets information about a block list used for query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings that are applied to a block list.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsBlockListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DescribeQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuerySuggestionsBlockListResult> describeQuerySuggestionsBlockListAsync(
            DescribeQuerySuggestionsBlockListRequest describeQuerySuggestionsBlockListRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsBlockListRequest, DescribeQuerySuggestionsBlockListResult> asyncHandler);

    /**
     * <p>
     * Gets information on the settings of query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings applied to query suggestions.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsConfigRequest
     * @return A Java Future containing the result of the DescribeQuerySuggestionsConfig operation returned by the
     *         service.
     * @sample AWSkendraAsync.DescribeQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(
            DescribeQuerySuggestionsConfigRequest describeQuerySuggestionsConfigRequest);

    /**
     * <p>
     * Gets information on the settings of query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings applied to query suggestions.
     * </p>
     * <p>
     * <code>DescribeQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param describeQuerySuggestionsConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQuerySuggestionsConfig operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DescribeQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeQuerySuggestionsConfigResult> describeQuerySuggestionsConfigAsync(
            DescribeQuerySuggestionsConfigRequest describeQuerySuggestionsConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQuerySuggestionsConfigRequest, DescribeQuerySuggestionsConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param describeThesaurusRequest
     * @return A Java Future containing the result of the DescribeThesaurus operation returned by the service.
     * @sample AWSkendraAsync.DescribeThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(DescribeThesaurusRequest describeThesaurusRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param describeThesaurusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThesaurus operation returned by the service.
     * @sample AWSkendraAsyncHandler.DescribeThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeThesaurusResult> describeThesaurusAsync(DescribeThesaurusRequest describeThesaurusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThesaurusRequest, DescribeThesaurusResult> asyncHandler);

    /**
     * <p>
     * Prevents users or groups in your IAM Identity Center identity source from accessing your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociateEntitiesFromExperienceRequest
     * @return A Java Future containing the result of the DisassociateEntitiesFromExperience operation returned by the
     *         service.
     * @sample AWSkendraAsync.DisassociateEntitiesFromExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociateEntitiesFromExperience"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateEntitiesFromExperienceResult> disassociateEntitiesFromExperienceAsync(
            DisassociateEntitiesFromExperienceRequest disassociateEntitiesFromExperienceRequest);

    /**
     * <p>
     * Prevents users or groups in your IAM Identity Center identity source from accessing your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociateEntitiesFromExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateEntitiesFromExperience operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DisassociateEntitiesFromExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociateEntitiesFromExperience"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateEntitiesFromExperienceResult> disassociateEntitiesFromExperienceAsync(
            DisassociateEntitiesFromExperienceRequest disassociateEntitiesFromExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateEntitiesFromExperienceRequest, DisassociateEntitiesFromExperienceResult> asyncHandler);

    /**
     * <p>
     * Removes the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociatePersonasFromEntitiesRequest
     * @return A Java Future containing the result of the DisassociatePersonasFromEntities operation returned by the
     *         service.
     * @sample AWSkendraAsync.DisassociatePersonasFromEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociatePersonasFromEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePersonasFromEntitiesResult> disassociatePersonasFromEntitiesAsync(
            DisassociatePersonasFromEntitiesRequest disassociatePersonasFromEntitiesRequest);

    /**
     * <p>
     * Removes the specific permissions of users or groups in your IAM Identity Center identity source with access to
     * your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
     * information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param disassociatePersonasFromEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePersonasFromEntities operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.DisassociatePersonasFromEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DisassociatePersonasFromEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePersonasFromEntitiesResult> disassociatePersonasFromEntitiesAsync(
            DisassociatePersonasFromEntitiesRequest disassociatePersonasFromEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePersonasFromEntitiesRequest, DisassociatePersonasFromEntitiesResult> asyncHandler);

    /**
     * <p>
     * Fetches the queries that are suggested to your users.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param getQuerySuggestionsRequest
     * @return A Java Future containing the result of the GetQuerySuggestions operation returned by the service.
     * @sample AWSkendraAsync.GetQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(GetQuerySuggestionsRequest getQuerySuggestionsRequest);

    /**
     * <p>
     * Fetches the queries that are suggested to your users.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param getQuerySuggestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQuerySuggestions operation returned by the service.
     * @sample AWSkendraAsyncHandler.GetQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQuerySuggestionsResult> getQuerySuggestionsAsync(GetQuerySuggestionsRequest getQuerySuggestionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQuerySuggestionsRequest, GetQuerySuggestionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves search metrics data. The data provides a snapshot of how your users interact with your search
     * application and how effective the application is.
     * </p>
     * 
     * @param getSnapshotsRequest
     * @return A Java Future containing the result of the GetSnapshots operation returned by the service.
     * @sample AWSkendraAsync.GetSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotsResult> getSnapshotsAsync(GetSnapshotsRequest getSnapshotsRequest);

    /**
     * <p>
     * Retrieves search metrics data. The data provides a snapshot of how your users interact with your search
     * application and how effective the application is.
     * </p>
     * 
     * @param getSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshots operation returned by the service.
     * @sample AWSkendraAsyncHandler.GetSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotsResult> getSnapshotsAsync(GetSnapshotsRequest getSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotsRequest, GetSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Lists one or more access control configurations for an index. This includes user and group access information for
     * your documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * 
     * @param listAccessControlConfigurationsRequest
     * @return A Java Future containing the result of the ListAccessControlConfigurations operation returned by the
     *         service.
     * @sample AWSkendraAsync.ListAccessControlConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListAccessControlConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlConfigurationsResult> listAccessControlConfigurationsAsync(
            ListAccessControlConfigurationsRequest listAccessControlConfigurationsRequest);

    /**
     * <p>
     * Lists one or more access control configurations for an index. This includes user and group access information for
     * your documents. This is useful for user context filtering, where search results are filtered based on the user or
     * their group access to documents.
     * </p>
     * 
     * @param listAccessControlConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessControlConfigurations operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.ListAccessControlConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListAccessControlConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessControlConfigurationsResult> listAccessControlConfigurationsAsync(
            ListAccessControlConfigurationsRequest listAccessControlConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessControlConfigurationsRequest, ListAccessControlConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets statistics about synchronizing a data source connector.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return A Java Future containing the result of the ListDataSourceSyncJobs operation returned by the service.
     * @sample AWSkendraAsync.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSourceSyncJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest);

    /**
     * <p>
     * Gets statistics about synchronizing a data source connector.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSourceSyncJobs operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSourceSyncJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourceSyncJobsResult> listDataSourceSyncJobsAsync(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourceSyncJobsRequest, ListDataSourceSyncJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSkendraAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists the data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Lists specific permissions of users and groups with access to your Amazon Kendra experience.
     * </p>
     * 
     * @param listEntityPersonasRequest
     * @return A Java Future containing the result of the ListEntityPersonas operation returned by the service.
     * @sample AWSkendraAsync.ListEntityPersonas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListEntityPersonas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEntityPersonasResult> listEntityPersonasAsync(ListEntityPersonasRequest listEntityPersonasRequest);

    /**
     * <p>
     * Lists specific permissions of users and groups with access to your Amazon Kendra experience.
     * </p>
     * 
     * @param listEntityPersonasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntityPersonas operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListEntityPersonas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListEntityPersonas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEntityPersonasResult> listEntityPersonasAsync(ListEntityPersonasRequest listEntityPersonasRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntityPersonasRequest, ListEntityPersonasResult> asyncHandler);

    /**
     * <p>
     * Lists users or groups in your IAM Identity Center identity source that are granted access to your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperienceEntitiesRequest
     * @return A Java Future containing the result of the ListExperienceEntities operation returned by the service.
     * @sample AWSkendraAsync.ListExperienceEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperienceEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExperienceEntitiesResult> listExperienceEntitiesAsync(ListExperienceEntitiesRequest listExperienceEntitiesRequest);

    /**
     * <p>
     * Lists users or groups in your IAM Identity Center identity source that are granted access to your Amazon Kendra
     * experience. You can create an Amazon Kendra experience such as a search application. For more information on
     * creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperienceEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperienceEntities operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListExperienceEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperienceEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExperienceEntitiesResult> listExperienceEntitiesAsync(ListExperienceEntitiesRequest listExperienceEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperienceEntitiesRequest, ListExperienceEntitiesResult> asyncHandler);

    /**
     * <p>
     * Lists one or more Amazon Kendra experiences. You can create an Amazon Kendra experience such as a search
     * application. For more information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperiencesRequest
     * @return A Java Future containing the result of the ListExperiences operation returned by the service.
     * @sample AWSkendraAsync.ListExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperiences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperiencesResult> listExperiencesAsync(ListExperiencesRequest listExperiencesRequest);

    /**
     * <p>
     * Lists one or more Amazon Kendra experiences. You can create an Amazon Kendra experience such as a search
     * application. For more information on creating a search application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param listExperiencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExperiences operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperiences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExperiencesResult> listExperiencesAsync(ListExperiencesRequest listExperiencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListExperiencesRequest, ListExperiencesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of FAQ lists associated with an index.
     * </p>
     * 
     * @param listFaqsRequest
     * @return A Java Future containing the result of the ListFaqs operation returned by the service.
     * @sample AWSkendraAsync.ListFaqs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFaqs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(ListFaqsRequest listFaqsRequest);

    /**
     * <p>
     * Gets a list of FAQ lists associated with an index.
     * </p>
     * 
     * @param listFaqsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFaqs operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListFaqs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFaqs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFaqsResult> listFaqsAsync(ListFaqsRequest listFaqsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFaqsRequest, ListFaqsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * <p>
     * <code>ListGroupsOlderThanOrderingId</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listGroupsOlderThanOrderingIdRequest
     * @return A Java Future containing the result of the ListGroupsOlderThanOrderingId operation returned by the
     *         service.
     * @sample AWSkendraAsync.ListGroupsOlderThanOrderingId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(
            ListGroupsOlderThanOrderingIdRequest listGroupsOlderThanOrderingIdRequest);

    /**
     * <p>
     * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * <p>
     * <code>ListGroupsOlderThanOrderingId</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listGroupsOlderThanOrderingIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupsOlderThanOrderingId operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.ListGroupsOlderThanOrderingId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsOlderThanOrderingIdResult> listGroupsOlderThanOrderingIdAsync(
            ListGroupsOlderThanOrderingIdRequest listGroupsOlderThanOrderingIdRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsOlderThanOrderingIdRequest, ListGroupsOlderThanOrderingIdResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSkendraAsync.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you created.
     * </p>
     * 
     * @param listIndicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIndices operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndicesResult> listIndicesAsync(ListIndicesRequest listIndicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIndicesRequest, ListIndicesResult> asyncHandler);

    /**
     * <p>
     * Lists the block lists used for query suggestions for an index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * <p>
     * <code>ListQuerySuggestionsBlockLists</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listQuerySuggestionsBlockListsRequest
     * @return A Java Future containing the result of the ListQuerySuggestionsBlockLists operation returned by the
     *         service.
     * @sample AWSkendraAsync.ListQuerySuggestionsBlockLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(
            ListQuerySuggestionsBlockListsRequest listQuerySuggestionsBlockListsRequest);

    /**
     * <p>
     * Lists the block lists used for query suggestions for an index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * <p>
     * <code>ListQuerySuggestionsBlockLists</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param listQuerySuggestionsBlockListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQuerySuggestionsBlockLists operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.ListQuerySuggestionsBlockLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQuerySuggestionsBlockListsResult> listQuerySuggestionsBlockListsAsync(
            ListQuerySuggestionsBlockListsRequest listQuerySuggestionsBlockListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQuerySuggestionsBlockListsRequest, ListQuerySuggestionsBlockListsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags
     * associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSkendraAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags
     * associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the thesauri for an index.
     * </p>
     * 
     * @param listThesauriRequest
     * @return A Java Future containing the result of the ListThesauri operation returned by the service.
     * @sample AWSkendraAsync.ListThesauri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListThesauri" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(ListThesauriRequest listThesauriRequest);

    /**
     * <p>
     * Lists the thesauri for an index.
     * </p>
     * 
     * @param listThesauriRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThesauri operation returned by the service.
     * @sample AWSkendraAsyncHandler.ListThesauri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListThesauri" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListThesauriResult> listThesauriAsync(ListThesauriRequest listThesauriRequest,
            com.amazonaws.handlers.AsyncHandler<ListThesauriRequest, ListThesauriResult> asyncHandler);

    /**
     * <p>
     * Maps users to their groups so that you only need to provide the user ID when you issue the query.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their search results.
     * </p>
     * <p>
     * This is useful for user context filtering, where search results are filtered based on the user or their group
     * access to documents. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * <p>
     * If more than five <code>PUT</code> actions for a group are currently processing, a validation exception is
     * thrown.
     * </p>
     * <p>
     * <code>PutPrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param putPrincipalMappingRequest
     * @return A Java Future containing the result of the PutPrincipalMapping operation returned by the service.
     * @sample AWSkendraAsync.PutPrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PutPrincipalMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(PutPrincipalMappingRequest putPrincipalMappingRequest);

    /**
     * <p>
     * Maps users to their groups so that you only need to provide the user ID when you issue the query.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their search results.
     * </p>
     * <p>
     * This is useful for user context filtering, where search results are filtered based on the user or their group
     * access to documents. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * <p>
     * If more than five <code>PUT</code> actions for a group are currently processing, a validation exception is
     * thrown.
     * </p>
     * <p>
     * <code>PutPrincipalMapping</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param putPrincipalMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPrincipalMapping operation returned by the service.
     * @sample AWSkendraAsyncHandler.PutPrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PutPrincipalMapping" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPrincipalMappingResult> putPrincipalMappingAsync(PutPrincipalMappingRequest putPrincipalMappingRequest,
            com.amazonaws.handlers.AsyncHandler<PutPrincipalMappingRequest, PutPrincipalMappingResult> asyncHandler);

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using query. The <code>Query</code> API enables
     * to do faceted search and to filter results based on document attributes.
     * </p>
     * <p>
     * It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the
     * search results.
     * </p>
     * <p>
     * Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response
     * contains three types of results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Relevant passages
     * </p>
     * </li>
     * <li>
     * <p>
     * Matching FAQs
     * </p>
     * </li>
     * <li>
     * <p>
     * Relevant documents
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify that the query return only one type of result using the <code>QueryResultTypeConfig</code>
     * parameter.
     * </p>
     * <p>
     * Each query returns the 100 most relevant results.
     * </p>
     * 
     * @param queryRequest
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AWSkendraAsync.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest);

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using query. The <code>Query</code> API enables
     * to do faceted search and to filter results based on document attributes.
     * </p>
     * <p>
     * It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the
     * search results.
     * </p>
     * <p>
     * Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response
     * contains three types of results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Relevant passages
     * </p>
     * </li>
     * <li>
     * <p>
     * Matching FAQs
     * </p>
     * </li>
     * <li>
     * <p>
     * Relevant documents
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify that the query return only one type of result using the <code>QueryResultTypeConfig</code>
     * parameter.
     * </p>
     * <p>
     * Each query returns the 100 most relevant results.
     * </p>
     * 
     * @param queryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AWSkendraAsyncHandler.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler);

    /**
     * <p>
     * Starts a synchronization job for a data source connector. If a synchronization job is already in progress, Amazon
     * Kendra returns a <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return A Java Future containing the result of the StartDataSourceSyncJob operation returned by the service.
     * @sample AWSkendraAsync.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StartDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest);

    /**
     * <p>
     * Starts a synchronization job for a data source connector. If a synchronization job is already in progress, Amazon
     * Kendra returns a <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDataSourceSyncJob operation returned by the service.
     * @sample AWSkendraAsyncHandler.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StartDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartDataSourceSyncJobResult> startDataSourceSyncJobAsync(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDataSourceSyncJobRequest, StartDataSourceSyncJobResult> asyncHandler);

    /**
     * <p>
     * Stops a synchronization job that is currently running. You can't stop a scheduled synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return A Java Future containing the result of the StopDataSourceSyncJob operation returned by the service.
     * @sample AWSkendraAsync.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StopDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest);

    /**
     * <p>
     * Stops a synchronization job that is currently running. You can't stop a scheduled synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDataSourceSyncJob operation returned by the service.
     * @sample AWSkendraAsyncHandler.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StopDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopDataSourceSyncJobResult> stopDataSourceSyncJobAsync(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopDataSourceSyncJobRequest, StopDataSourceSyncJobResult> asyncHandler);

    /**
     * <p>
     * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.
     * </p>
     * <p>
     * <code>SubmitFeedback</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @return A Java Future containing the result of the SubmitFeedback operation returned by the service.
     * @sample AWSkendraAsync.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SubmitFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest submitFeedbackRequest);

    /**
     * <p>
     * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.
     * </p>
     * <p>
     * <code>SubmitFeedback</code> is currently not supported in the Amazon Web Services GovCloud (US-West) region.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitFeedback operation returned by the service.
     * @sample AWSkendraAsyncHandler.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SubmitFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SubmitFeedbackResult> submitFeedbackAsync(SubmitFeedbackRequest submitFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitFeedbackRequest, SubmitFeedbackResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSkendraAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSkendraAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an index, FAQ, or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSkendraAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an index, FAQ, or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSkendraAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an access control configuration for your documents in an index. This includes user and group access
     * information for your documents. This is useful for user context filtering, where search results are filtered
     * based on the user or their group access to documents.
     * </p>
     * <p>
     * You can update an access control configuration you created without indexing all of your documents again. For
     * example, your index contains top-secret company documents that only certain employees or users should access. You
     * created an 'allow' access control configuration for one user who recently joined the 'top-secret' team, switching
     * from a team with 'deny' access to top-secret documents. However, the user suddenly returns to their previous team
     * and should no longer have access to top secret documents. You can update the access control configuration to
     * re-configure access control for your documents as circumstances change.
     * </p>
     * <p>
     * You call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API to apply
     * the updated access control configuration, with the <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you synchronize your data source to apply the <code>AccessControlConfigurationId</code>
     * in the <code>.metadata.json</code> file. Amazon Kendra currently only supports access control configuration for
     * S3 data sources and documents indexed using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @param updateAccessControlConfigurationRequest
     * @return A Java Future containing the result of the UpdateAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsync.UpdateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessControlConfigurationResult> updateAccessControlConfigurationAsync(
            UpdateAccessControlConfigurationRequest updateAccessControlConfigurationRequest);

    /**
     * <p>
     * Updates an access control configuration for your documents in an index. This includes user and group access
     * information for your documents. This is useful for user context filtering, where search results are filtered
     * based on the user or their group access to documents.
     * </p>
     * <p>
     * You can update an access control configuration you created without indexing all of your documents again. For
     * example, your index contains top-secret company documents that only certain employees or users should access. You
     * created an 'allow' access control configuration for one user who recently joined the 'top-secret' team, switching
     * from a team with 'deny' access to top-secret documents. However, the user suddenly returns to their previous team
     * and should no longer have access to top secret documents. You can update the access control configuration to
     * re-configure access control for your documents as circumstances change.
     * </p>
     * <p>
     * You call the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a> API to apply
     * the updated access control configuration, with the <code>AccessControlConfigurationId</code> included in the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_Document.html">Document</a> object. If you use an S3
     * bucket as a data source, you synchronize your data source to apply the <code>AccessControlConfigurationId</code>
     * in the <code>.metadata.json</code> file. Amazon Kendra currently only supports access control configuration for
     * S3 data sources and documents indexed using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @param updateAccessControlConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessControlConfiguration operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.UpdateAccessControlConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateAccessControlConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessControlConfigurationResult> updateAccessControlConfigurationAsync(
            UpdateAccessControlConfigurationRequest updateAccessControlConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessControlConfigurationRequest, UpdateAccessControlConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Kendra data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSkendraAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Kendra data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSkendraAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Updates your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param updateExperienceRequest
     * @return A Java Future containing the result of the UpdateExperience operation returned by the service.
     * @sample AWSkendraAsync.UpdateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperienceResult> updateExperienceAsync(UpdateExperienceRequest updateExperienceRequest);

    /**
     * <p>
     * Updates your Amazon Kendra experience such as a search application. For more information on creating a search
     * application experience, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
     * experience with no code</a>.
     * </p>
     * 
     * @param updateExperienceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExperience operation returned by the service.
     * @sample AWSkendraAsyncHandler.UpdateExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateExperience" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExperienceResult> updateExperienceAsync(UpdateExperienceRequest updateExperienceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExperienceRequest, UpdateExperienceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Kendra index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return A Java Future containing the result of the UpdateIndex operation returned by the service.
     * @sample AWSkendraAsync.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest updateIndexRequest);

    /**
     * <p>
     * Updates an existing Amazon Kendra index.
     * </p>
     * 
     * @param updateIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIndex operation returned by the service.
     * @sample AWSkendraAsyncHandler.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexResult> updateIndexAsync(UpdateIndexRequest updateIndexRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIndexRequest, UpdateIndexResult> asyncHandler);

    /**
     * <p>
     * Updates a block list used for query suggestions for an index.
     * </p>
     * <p>
     * Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions
     * list to apply any updates to the block list. Other changes not related to the block list apply immediately.
     * </p>
     * <p>
     * If a block list is updating, then you need to wait for the first update to finish before submitting another
     * update.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * <code>UpdateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsBlockListRequest
     * @return A Java Future containing the result of the UpdateQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsync.UpdateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            UpdateQuerySuggestionsBlockListRequest updateQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Updates a block list used for query suggestions for an index.
     * </p>
     * <p>
     * Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions
     * list to apply any updates to the block list. Other changes not related to the block list apply immediately.
     * </p>
     * <p>
     * If a block list is updating, then you need to wait for the first update to finish before submitting another
     * update.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * <code>UpdateQuerySuggestionsBlockList</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsBlockListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQuerySuggestionsBlockList operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.UpdateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuerySuggestionsBlockListResult> updateQuerySuggestionsBlockListAsync(
            UpdateQuerySuggestionsBlockListRequest updateQuerySuggestionsBlockListRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsBlockListRequest, UpdateQuerySuggestionsBlockListResult> asyncHandler);

    /**
     * <p>
     * Updates the settings of query suggestions for an index.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making
     * another update.
     * </p>
     * <p>
     * Updates to query suggestions settings might not take effect right away. The time for your updated settings to
     * take effect depends on the updates made and the number of search queries in your index.
     * </p>
     * <p>
     * You can still enable/disable query suggestions at any time.
     * </p>
     * <p>
     * <code>UpdateQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsConfigRequest
     * @return A Java Future containing the result of the UpdateQuerySuggestionsConfig operation returned by the
     *         service.
     * @sample AWSkendraAsync.UpdateQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(
            UpdateQuerySuggestionsConfigRequest updateQuerySuggestionsConfigRequest);

    /**
     * <p>
     * Updates the settings of query suggestions for an index.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making
     * another update.
     * </p>
     * <p>
     * Updates to query suggestions settings might not take effect right away. The time for your updated settings to
     * take effect depends on the updates made and the number of search queries in your index.
     * </p>
     * <p>
     * You can still enable/disable query suggestions at any time.
     * </p>
     * <p>
     * <code>UpdateQuerySuggestionsConfig</code> is currently not supported in the Amazon Web Services GovCloud
     * (US-West) region.
     * </p>
     * 
     * @param updateQuerySuggestionsConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQuerySuggestionsConfig operation returned by the
     *         service.
     * @sample AWSkendraAsyncHandler.UpdateQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQuerySuggestionsConfigResult> updateQuerySuggestionsConfigAsync(
            UpdateQuerySuggestionsConfigRequest updateQuerySuggestionsConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQuerySuggestionsConfigRequest, UpdateQuerySuggestionsConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a thesaurus for an index.
     * </p>
     * 
     * @param updateThesaurusRequest
     * @return A Java Future containing the result of the UpdateThesaurus operation returned by the service.
     * @sample AWSkendraAsync.UpdateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(UpdateThesaurusRequest updateThesaurusRequest);

    /**
     * <p>
     * Updates a thesaurus for an index.
     * </p>
     * 
     * @param updateThesaurusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThesaurus operation returned by the service.
     * @sample AWSkendraAsyncHandler.UpdateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThesaurusResult> updateThesaurusAsync(UpdateThesaurusRequest updateThesaurusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThesaurusRequest, UpdateThesaurusResult> asyncHandler);

}
