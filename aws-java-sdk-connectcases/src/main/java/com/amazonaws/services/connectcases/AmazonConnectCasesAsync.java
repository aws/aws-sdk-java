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
package com.amazonaws.services.connectcases;

import javax.annotation.Generated;

import com.amazonaws.services.connectcases.model.*;

/**
 * Interface for accessing ConnectCases asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcases.AbstractAmazonConnectCasesAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the Amazon Connect Cases API Reference. This guide provides information about the Amazon Connect Cases
 * API, which you can use to create, update, get, and list Cases domains, fields, field options, layouts, templates,
 * cases, related items, and tags.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;For more information about Amazon Connect Cases, see &lt;a href=&quot;https://docs.aws.amazon.com/connect/latest/adminguide/cases.html&quot;&gt;Amazon Connect Cases&lt;/a&gt; in the &lt;i&gt;Amazon Connect Administrator Guide&lt;/i&gt;. &lt;/p&gt; </code>
 * </pre>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectCasesAsync extends AmazonConnectCases {

    /**
     * <p>
     * Returns the description for the list of fields in the request parameters.
     * </p>
     * 
     * @param batchGetFieldRequest
     * @return A Java Future containing the result of the BatchGetField operation returned by the service.
     * @sample AmazonConnectCasesAsync.BatchGetField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchGetField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFieldResult> batchGetFieldAsync(BatchGetFieldRequest batchGetFieldRequest);

    /**
     * <p>
     * Returns the description for the list of fields in the request parameters.
     * </p>
     * 
     * @param batchGetFieldRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetField operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.BatchGetField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchGetField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFieldResult> batchGetFieldAsync(BatchGetFieldRequest batchGetFieldRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetFieldRequest, BatchGetFieldResult> asyncHandler);

    /**
     * <p>
     * Creates and updates a set of field options for a single select field in a Cases domain.
     * </p>
     * 
     * @param batchPutFieldOptionsRequest
     * @return A Java Future containing the result of the BatchPutFieldOptions operation returned by the service.
     * @sample AmazonConnectCasesAsync.BatchPutFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchPutFieldOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutFieldOptionsResult> batchPutFieldOptionsAsync(BatchPutFieldOptionsRequest batchPutFieldOptionsRequest);

    /**
     * <p>
     * Creates and updates a set of field options for a single select field in a Cases domain.
     * </p>
     * 
     * @param batchPutFieldOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutFieldOptions operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.BatchPutFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchPutFieldOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutFieldOptionsResult> batchPutFieldOptionsAsync(BatchPutFieldOptionsRequest batchPutFieldOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutFieldOptionsRequest, BatchPutFieldOptionsResult> asyncHandler);

    /**
     * <p>
     * Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs
     * with a declared data types.
     * </p>
     * <note>
     * <p>
     * <code>customer_id</code> is a required field when creating a case.
     * </p>
     * </note>
     * 
     * @param createCaseRequest
     * @return A Java Future containing the result of the CreateCase operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest);

    /**
     * <p>
     * Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs
     * with a declared data types.
     * </p>
     * <note>
     * <p>
     * <code>customer_id</code> is a required field when creating a case.
     * </p>
     * </note>
     * 
     * @param createCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCase operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler);

    /**
     * <p>
     * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each
     * Amazon Connect instance can be associated with only one Cases domain.
     * </p>
     * <important>
     * <p>
     * This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateIntegrationAssociation.html"
     * >CreateIntegrationAssociation</a> API.
     * </p>
     * </important>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each
     * Amazon Connect instance can be associated with only one Cases domain.
     * </p>
     * <important>
     * <p>
     * This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateIntegrationAssociation.html"
     * >CreateIntegrationAssociation</a> API.
     * </p>
     * </important>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what
     * data can be captured on cases) in a Cases domain.
     * </p>
     * 
     * @param createFieldRequest
     * @return A Java Future containing the result of the CreateField operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldResult> createFieldAsync(CreateFieldRequest createFieldRequest);

    /**
     * <p>
     * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what
     * data can be captured on cases) in a Cases domain.
     * </p>
     * 
     * @param createFieldRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateField operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFieldResult> createFieldAsync(CreateFieldRequest createFieldRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFieldRequest, CreateFieldResult> asyncHandler);

    /**
     * <p>
     * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info
     * tab of the Cases user interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fields to display to the users
     * </p>
     * </li>
     * <li>
     * <p>
     * Field ordering
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts since they are not configurable.
     * </p>
     * </note>
     * 
     * @param createLayoutRequest
     * @return A Java Future containing the result of the CreateLayout operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLayoutResult> createLayoutAsync(CreateLayoutRequest createLayoutRequest);

    /**
     * <p>
     * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info
     * tab of the Cases user interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fields to display to the users
     * </p>
     * </li>
     * <li>
     * <p>
     * Field ordering
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts since they are not configurable.
     * </p>
     * </note>
     * 
     * @param createLayoutRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLayout operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLayoutResult> createLayoutAsync(CreateLayoutRequest createLayoutRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLayoutRequest, CreateLayoutResult> asyncHandler);

    /**
     * <p>
     * Creates a related item (comments, tasks, and contacts) and associates it with a case.
     * </p>
     * <note>
     * <p>
     * A Related Item is a resource that is associated with a case. It may or may not have an external identifier
     * linking it to an external resource (for example, a <code>contactArn</code>). All Related Items have their own
     * internal identifier, the <code>relatedItemArn</code>. Examples of related items include <code>comments</code> and
     * <code>contacts</code>.
     * </p>
     * </note>
     * 
     * @param createRelatedItemRequest
     * @return A Java Future containing the result of the CreateRelatedItem operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelatedItemResult> createRelatedItemAsync(CreateRelatedItemRequest createRelatedItemRequest);

    /**
     * <p>
     * Creates a related item (comments, tasks, and contacts) and associates it with a case.
     * </p>
     * <note>
     * <p>
     * A Related Item is a resource that is associated with a case. It may or may not have an external identifier
     * linking it to an external resource (for example, a <code>contactArn</code>). All Related Items have their own
     * internal identifier, the <code>relatedItemArn</code>. Examples of related items include <code>comments</code> and
     * <code>contacts</code>.
     * </p>
     * </note>
     * 
     * @param createRelatedItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRelatedItem operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRelatedItemResult> createRelatedItemAsync(CreateRelatedItemRequest createRelatedItemRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRelatedItemRequest, CreateRelatedItemResult> asyncHandler);

    /**
     * <p>
     * Creates a template in the Cases domain. This template is used to define the case object model (that is, to define
     * what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it
     * must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed
     * within the same Template. A template can be either Active or Inactive, as indicated by its status. Inactive
     * templates cannot be used to create cases.
     * </p>
     * 
     * @param createTemplateRequest
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsync.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Creates a template in the Cases domain. This template is used to define the case object model (that is, to define
     * what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it
     * must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed
     * within the same Template. A template can be either Active or Inactive, as indicated by its status. Inactive
     * templates cannot be used to create cases.
     * </p>
     * 
     * @param createTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific case if it exists.
     * </p>
     * 
     * @param getCaseRequest
     * @return A Java Future containing the result of the GetCase operation returned by the service.
     * @sample AmazonConnectCasesAsync.GetCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCaseResult> getCaseAsync(GetCaseRequest getCaseRequest);

    /**
     * <p>
     * Returns information about a specific case if it exists.
     * </p>
     * 
     * @param getCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCase operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.GetCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCaseResult> getCaseAsync(GetCaseRequest getCaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetCaseRequest, GetCaseResult> asyncHandler);

    /**
     * <p>
     * Returns the case event publishing configuration.
     * </p>
     * 
     * @param getCaseEventConfigurationRequest
     * @return A Java Future containing the result of the GetCaseEventConfiguration operation returned by the service.
     * @sample AmazonConnectCasesAsync.GetCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCaseEventConfigurationResult> getCaseEventConfigurationAsync(
            GetCaseEventConfigurationRequest getCaseEventConfigurationRequest);

    /**
     * <p>
     * Returns the case event publishing configuration.
     * </p>
     * 
     * @param getCaseEventConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCaseEventConfiguration operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.GetCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCaseEventConfigurationResult> getCaseEventConfigurationAsync(
            GetCaseEventConfigurationRequest getCaseEventConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCaseEventConfigurationRequest, GetCaseEventConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific domain if it exists.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonConnectCasesAsync.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns information about a specific domain if it exists.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the requested layout.
     * </p>
     * 
     * @param getLayoutRequest
     * @return A Java Future containing the result of the GetLayout operation returned by the service.
     * @sample AmazonConnectCasesAsync.GetLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayoutResult> getLayoutAsync(GetLayoutRequest getLayoutRequest);

    /**
     * <p>
     * Returns the details for the requested layout.
     * </p>
     * 
     * @param getLayoutRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLayout operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.GetLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLayoutResult> getLayoutAsync(GetLayoutRequest getLayoutRequest,
            com.amazonaws.handlers.AsyncHandler<GetLayoutRequest, GetLayoutResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the requested template.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsync.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Returns the details for the requested template.
     * </p>
     * 
     * @param getTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Lists cases for a given contact.
     * </p>
     * 
     * @param listCasesForContactRequest
     * @return A Java Future containing the result of the ListCasesForContact operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListCasesForContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListCasesForContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCasesForContactResult> listCasesForContactAsync(ListCasesForContactRequest listCasesForContactRequest);

    /**
     * <p>
     * Lists cases for a given contact.
     * </p>
     * 
     * @param listCasesForContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCasesForContact operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListCasesForContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListCasesForContact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCasesForContactResult> listCasesForContactAsync(ListCasesForContactRequest listCasesForContactRequest,
            com.amazonaws.handlers.AsyncHandler<ListCasesForContactRequest, ListCasesForContactResult> asyncHandler);

    /**
     * <p>
     * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the
     * domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the
     * domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the field options for a field identifier in the domain.
     * </p>
     * 
     * @param listFieldOptionsRequest
     * @return A Java Future containing the result of the ListFieldOptions operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFieldOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldOptionsResult> listFieldOptionsAsync(ListFieldOptionsRequest listFieldOptionsRequest);

    /**
     * <p>
     * Lists all of the field options for a field identifier in the domain.
     * </p>
     * 
     * @param listFieldOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFieldOptions operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFieldOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFieldOptionsResult> listFieldOptionsAsync(ListFieldOptionsRequest listFieldOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFieldOptionsRequest, ListFieldOptionsResult> asyncHandler);

    /**
     * <p>
     * Lists all fields in a Cases domain.
     * </p>
     * 
     * @param listFieldsRequest
     * @return A Java Future containing the result of the ListFields operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFields" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFieldsResult> listFieldsAsync(ListFieldsRequest listFieldsRequest);

    /**
     * <p>
     * Lists all fields in a Cases domain.
     * </p>
     * 
     * @param listFieldsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFields operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFields" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFieldsResult> listFieldsAsync(ListFieldsRequest listFieldsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFieldsRequest, ListFieldsResult> asyncHandler);

    /**
     * <p>
     * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
     * </p>
     * 
     * @param listLayoutsRequest
     * @return A Java Future containing the result of the ListLayouts operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListLayouts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListLayouts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayoutsResult> listLayoutsAsync(ListLayoutsRequest listLayoutsRequest);

    /**
     * <p>
     * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
     * </p>
     * 
     * @param listLayoutsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLayouts operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListLayouts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListLayouts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLayoutsResult> listLayoutsAsync(ListLayoutsRequest listLayoutsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLayoutsRequest, ListLayoutsResult> asyncHandler);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonConnectCasesAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * API for adding case event publishing configuration
     * </p>
     * 
     * @param putCaseEventConfigurationRequest
     * @return A Java Future containing the result of the PutCaseEventConfiguration operation returned by the service.
     * @sample AmazonConnectCasesAsync.PutCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/PutCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutCaseEventConfigurationResult> putCaseEventConfigurationAsync(
            PutCaseEventConfigurationRequest putCaseEventConfigurationRequest);

    /**
     * <p>
     * API for adding case event publishing configuration
     * </p>
     * 
     * @param putCaseEventConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCaseEventConfiguration operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.PutCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/PutCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutCaseEventConfigurationResult> putCaseEventConfigurationAsync(
            PutCaseEventConfigurationRequest putCaseEventConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutCaseEventConfigurationRequest, PutCaseEventConfigurationResult> asyncHandler);

    /**
     * <p>
     * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of
     * abridged case documents.
     * </p>
     * 
     * @param searchCasesRequest
     * @return A Java Future containing the result of the SearchCases operation returned by the service.
     * @sample AmazonConnectCasesAsync.SearchCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchCasesResult> searchCasesAsync(SearchCasesRequest searchCasesRequest);

    /**
     * <p>
     * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of
     * abridged case documents.
     * </p>
     * 
     * @param searchCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchCases operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.SearchCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchCasesResult> searchCasesAsync(SearchCasesRequest searchCasesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchCasesRequest, SearchCasesResult> asyncHandler);

    /**
     * <p>
     * Searches for related items that are associated with a case.
     * </p>
     * <note>
     * <p>
     * If no filters are provided, this returns all related items associated with a case.
     * </p>
     * </note>
     * 
     * @param searchRelatedItemsRequest
     * @return A Java Future containing the result of the SearchRelatedItems operation returned by the service.
     * @sample AmazonConnectCasesAsync.SearchRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchRelatedItemsResult> searchRelatedItemsAsync(SearchRelatedItemsRequest searchRelatedItemsRequest);

    /**
     * <p>
     * Searches for related items that are associated with a case.
     * </p>
     * <note>
     * <p>
     * If no filters are provided, this returns all related items associated with a case.
     * </p>
     * </note>
     * 
     * @param searchRelatedItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchRelatedItems operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.SearchRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchRelatedItemsResult> searchRelatedItemsAsync(SearchRelatedItemsRequest searchRelatedItemsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRelatedItemsRequest, SearchRelatedItemsResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectCasesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectCasesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical
     * to the <code>CreateCase</code> input .
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param updateCaseRequest
     * @return A Java Future containing the result of the UpdateCase operation returned by the service.
     * @sample AmazonConnectCasesAsync.UpdateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCaseResult> updateCaseAsync(UpdateCaseRequest updateCaseRequest);

    /**
     * <p>
     * Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical
     * to the <code>CreateCase</code> input .
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param updateCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCase operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.UpdateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCaseResult> updateCaseAsync(UpdateCaseRequest updateCaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCaseRequest, UpdateCaseResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of an existing field.
     * </p>
     * 
     * @param updateFieldRequest
     * @return A Java Future containing the result of the UpdateField operation returned by the service.
     * @sample AmazonConnectCasesAsync.UpdateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldResult> updateFieldAsync(UpdateFieldRequest updateFieldRequest);

    /**
     * <p>
     * Updates the properties of an existing field.
     * </p>
     * 
     * @param updateFieldRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateField operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.UpdateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateField" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFieldResult> updateFieldAsync(UpdateFieldRequest updateFieldRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFieldRequest, UpdateFieldResult> asyncHandler);

    /**
     * <p>
     * Updates the attributes of an existing layout.
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * <p>
     * A <code>ValidationException</code> is returned when you add non-existent <code>fieldIds</code> to a layout.
     * </p>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts because they are not configurable.
     * </p>
     * </note>
     * 
     * @param updateLayoutRequest
     * @return A Java Future containing the result of the UpdateLayout operation returned by the service.
     * @sample AmazonConnectCasesAsync.UpdateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLayoutResult> updateLayoutAsync(UpdateLayoutRequest updateLayoutRequest);

    /**
     * <p>
     * Updates the attributes of an existing layout.
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * <p>
     * A <code>ValidationException</code> is returned when you add non-existent <code>fieldIds</code> to a layout.
     * </p>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts because they are not configurable.
     * </p>
     * </note>
     * 
     * @param updateLayoutRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLayout operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.UpdateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLayoutResult> updateLayoutAsync(UpdateLayoutRequest updateLayoutRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLayoutRequest, UpdateLayoutResult> asyncHandler);

    /**
     * <p>
     * Updates the attributes of an existing template. The template attributes that can be modified include
     * <code>name</code>, <code>description</code>, <code>layoutConfiguration</code>, <code>requiredFields</code>, and
     * <code>status</code>. At least one of these attributes must not be null. If a null value is provided for a given
     * attribute, that attribute is ignored and its current value is preserved.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsync.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest);

    /**
     * <p>
     * Updates the attributes of an existing template. The template attributes that can be modified include
     * <code>name</code>, <code>description</code>, <code>layoutConfiguration</code>, <code>requiredFields</code>, and
     * <code>status</code>. At least one of these attributes must not be null. If a null value is provided for a given
     * attribute, that attribute is ignored and its current value is preserved.
     * </p>
     * 
     * @param updateTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonConnectCasesAsyncHandler.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler);

}
