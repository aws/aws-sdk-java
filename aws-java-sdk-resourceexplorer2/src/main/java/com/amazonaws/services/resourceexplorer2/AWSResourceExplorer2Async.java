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
package com.amazonaws.services.resourceexplorer2;

import javax.annotation.Generated;

import com.amazonaws.services.resourceexplorer2.model.*;

/**
 * Interface for accessing AWS Resource Explorer asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resourceexplorer2.AbstractAWSResourceExplorer2Async} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Resource Explorer is a resource search and discovery service. By using Resource Explorer, you can
 * explore your resources using an internet search engine-like experience. Examples of resources include Amazon
 * Relational Database Service (Amazon RDS) instances, Amazon Simple Storage Service (Amazon S3) buckets, or Amazon
 * DynamoDB tables. You can search for your resources using resource metadata like names, tags, and IDs. Resource
 * Explorer can search across all of the Amazon Web Services Regions in your account in which you turn the service on,
 * to simplify your cross-Region workloads.
 * </p>
 * <p>
 * Resource Explorer scans the resources in each of the Amazon Web Services Regions in your Amazon Web Services account
 * in which you turn on Resource Explorer. Resource Explorer <a href=
 * "https://docs.aws.amazon.com/resource-explorer/latest/userguide/getting-started-terms-and-concepts.html#term-index"
 * >creates and maintains an index</a> in each Region, with the details of that Region's resources.
 * </p>
 * <p>
 * You can <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">search
 * across all of the indexed Regions in your account</a> by designating one of your Amazon Web Services Regions to
 * contain the aggregator index for the account. When you <a
 * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region-turn-on.html">promote a
 * local index in a Region to become the aggregator index for the account</a>, Resource Explorer automatically
 * replicates the index information from all local indexes in the other Regions to the aggregator index. Therefore, the
 * Region with the aggregator index has a copy of all resource information for all Regions in the account where you
 * turned on Resource Explorer. As a result, views in the aggregator index Region include resources from all of the
 * indexed Regions in your account.
 * </p>
 * <p>
 * For more information about Amazon Web Services Resource Explorer, including how to enable and configure the service,
 * see the <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/">Amazon Web Services Resource
 * Explorer User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResourceExplorer2Async extends AWSResourceExplorer2 {

    /**
     * <p>
     * Sets the specified view as the default for the Amazon Web Services Region in which you call this operation. When
     * a user performs a <a>Search</a> that doesn't explicitly specify which view to use, then Amazon Web Services
     * Resource Explorer automatically chooses this default view for searches performed in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param associateDefaultViewRequest
     * @return A Java Future containing the result of the AssociateDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2Async.AssociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/AssociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDefaultViewResult> associateDefaultViewAsync(AssociateDefaultViewRequest associateDefaultViewRequest);

    /**
     * <p>
     * Sets the specified view as the default for the Amazon Web Services Region in which you call this operation. When
     * a user performs a <a>Search</a> that doesn't explicitly specify which view to use, then Amazon Web Services
     * Resource Explorer automatically chooses this default view for searches performed in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param associateDefaultViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.AssociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/AssociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDefaultViewResult> associateDefaultViewAsync(AssociateDefaultViewRequest associateDefaultViewRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDefaultViewRequest, AssociateDefaultViewResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about a list of views.
     * </p>
     * 
     * @param batchGetViewRequest
     * @return A Java Future containing the result of the BatchGetView operation returned by the service.
     * @sample AWSResourceExplorer2Async.BatchGetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/BatchGetView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetViewResult> batchGetViewAsync(BatchGetViewRequest batchGetViewRequest);

    /**
     * <p>
     * Retrieves details about a list of views.
     * </p>
     * 
     * @param batchGetViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.BatchGetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/BatchGetView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetViewResult> batchGetViewAsync(BatchGetViewRequest batchGetViewRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetViewRequest, BatchGetViewResult> asyncHandler);

    /**
     * <p>
     * Turns on Amazon Web Services Resource Explorer in the Amazon Web Services Region in which you called this
     * operation by creating an index. Resource Explorer begins discovering the resources in this Region and stores the
     * details about the resources in the index so that they can be queried by using the <a>Search</a> operation. You
     * can create only one index in a Region.
     * </p>
     * <note>
     * <p>
     * This operation creates only a <i>local</i> index. To promote the local index in one Amazon Web Services Region
     * into the aggregator index for the Amazon Web Services account, use the <a>UpdateIndexType</a> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more details about what happens when you turn on Resource Explorer in an Amazon Web Services Region, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html">Turn on
     * Resource Explorer to index your resources in an Amazon Web Services Region</a> in the <i>Amazon Web Services
     * Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * If this is the first Amazon Web Services Region in which you've created an index for Resource Explorer, then this
     * operation also <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >creates a service-linked role</a> in your Amazon Web Services account that allows Resource Explorer to enumerate
     * your resources to populate the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Action</b>: <code>resource-explorer-2:CreateIndex</code>
     * </p>
     * <p>
     * <b>Resource</b>: The ARN of the index (as it will exist after the operation completes) in the Amazon Web Services
     * Region and account in which you're trying to create the index. Use the wildcard character (<code>*</code>) at the
     * end of the string to match the eventual UUID. For example, the following <code>Resource</code> element restricts
     * the role or user to creating an index in only the <code>us-east-2</code> Region of the specified account.
     * </p>
     * <p>
     * <code>"Resource": "arn:aws:resource-explorer-2:us-west-2:<i>&lt;account-id&gt;</i>:index/*"</code>
     * </p>
     * <p>
     * Alternatively, you can use <code>"Resource": "*"</code> to allow the role or user to create an index in any
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: <code>iam:CreateServiceLinkedRole</code>
     * </p>
     * <p>
     * <b>Resource</b>: No specific resource (*).
     * </p>
     * <p>
     * This permission is required only the first time you create an index to turn on Resource Explorer in the account.
     * Resource Explorer uses this to create the <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >service-linked role needed to index the resources in your account</a>. Resource Explorer uses the same
     * service-linked role for all additional indexes you create afterwards.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIndexRequest
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSResourceExplorer2Async.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateIndex"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Turns on Amazon Web Services Resource Explorer in the Amazon Web Services Region in which you called this
     * operation by creating an index. Resource Explorer begins discovering the resources in this Region and stores the
     * details about the resources in the index so that they can be queried by using the <a>Search</a> operation. You
     * can create only one index in a Region.
     * </p>
     * <note>
     * <p>
     * This operation creates only a <i>local</i> index. To promote the local index in one Amazon Web Services Region
     * into the aggregator index for the Amazon Web Services account, use the <a>UpdateIndexType</a> operation. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more details about what happens when you turn on Resource Explorer in an Amazon Web Services Region, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-service-activate.html">Turn on
     * Resource Explorer to index your resources in an Amazon Web Services Region</a> in the <i>Amazon Web Services
     * Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * If this is the first Amazon Web Services Region in which you've created an index for Resource Explorer, then this
     * operation also <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >creates a service-linked role</a> in your Amazon Web Services account that allows Resource Explorer to enumerate
     * your resources to populate the index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Action</b>: <code>resource-explorer-2:CreateIndex</code>
     * </p>
     * <p>
     * <b>Resource</b>: The ARN of the index (as it will exist after the operation completes) in the Amazon Web Services
     * Region and account in which you're trying to create the index. Use the wildcard character (<code>*</code>) at the
     * end of the string to match the eventual UUID. For example, the following <code>Resource</code> element restricts
     * the role or user to creating an index in only the <code>us-east-2</code> Region of the specified account.
     * </p>
     * <p>
     * <code>"Resource": "arn:aws:resource-explorer-2:us-west-2:<i>&lt;account-id&gt;</i>:index/*"</code>
     * </p>
     * <p>
     * Alternatively, you can use <code>"Resource": "*"</code> to allow the role or user to create an index in any
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Action</b>: <code>iam:CreateServiceLinkedRole</code>
     * </p>
     * <p>
     * <b>Resource</b>: No specific resource (*).
     * </p>
     * <p>
     * This permission is required only the first time you create an index to turn on Resource Explorer in the account.
     * Resource Explorer uses this to create the <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/security_iam_service-linked-roles.html"
     * >service-linked role needed to index the resources in your account</a>. Resource Explorer uses the same
     * service-linked role for all additional indexes you create afterwards.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateIndex"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler);

    /**
     * <p>
     * Creates a view that users can query by using the <a>Search</a> operation. Results from queries that you make
     * using this view include only resources that match the view's <code>Filters</code>. For more information about
     * Amazon Web Services Resource Explorer views, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views.html">Managing views</a> in the
     * <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * Only the principals with an IAM identity-based policy that grants <code>Allow</code> to the <code>Search</code>
     * action on a <code>Resource</code> with the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name (ARN)</a>
     * of this view can <a>Search</a> using views you create with this operation.
     * </p>
     * 
     * @param createViewRequest
     * @return A Java Future containing the result of the CreateView operation returned by the service.
     * @sample AWSResourceExplorer2Async.CreateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateViewResult> createViewAsync(CreateViewRequest createViewRequest);

    /**
     * <p>
     * Creates a view that users can query by using the <a>Search</a> operation. Results from queries that you make
     * using this view include only resources that match the view's <code>Filters</code>. For more information about
     * Amazon Web Services Resource Explorer views, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views.html">Managing views</a> in the
     * <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * <p>
     * Only the principals with an IAM identity-based policy that grants <code>Allow</code> to the <code>Search</code>
     * action on a <code>Resource</code> with the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name (ARN)</a>
     * of this view can <a>Search</a> using views you create with this operation.
     * </p>
     * 
     * @param createViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.CreateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/CreateView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateViewResult> createViewAsync(CreateViewRequest createViewRequest,
            com.amazonaws.handlers.AsyncHandler<CreateViewRequest, CreateViewResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified index and turns off Amazon Web Services Resource Explorer in the specified Amazon Web
     * Services Region. When you delete an index, Resource Explorer stops discovering and indexing resources in that
     * Region. Resource Explorer also deletes all views in that Region. These actions occur as asynchronous background
     * tasks. You can check to see when the actions are complete by using the <a>GetIndex</a> operation and checking the
     * <code>Status</code> response value.
     * </p>
     * <note>
     * <p>
     * If the index you delete is the aggregator index for the Amazon Web Services account, you must wait 24 hours
     * before you can promote another local index to be the aggregator index for the account. Users can't perform
     * account-wide searches using Resource Explorer until another aggregator index is configured.
     * </p>
     * </note>
     * 
     * @param deleteIndexRequest
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSResourceExplorer2Async.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteIndex"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest);

    /**
     * <p>
     * Deletes the specified index and turns off Amazon Web Services Resource Explorer in the specified Amazon Web
     * Services Region. When you delete an index, Resource Explorer stops discovering and indexing resources in that
     * Region. Resource Explorer also deletes all views in that Region. These actions occur as asynchronous background
     * tasks. You can check to see when the actions are complete by using the <a>GetIndex</a> operation and checking the
     * <code>Status</code> response value.
     * </p>
     * <note>
     * <p>
     * If the index you delete is the aggregator index for the Amazon Web Services account, you must wait 24 hours
     * before you can promote another local index to be the aggregator index for the account. Users can't perform
     * account-wide searches using Resource Explorer until another aggregator index is configured.
     * </p>
     * </note>
     * 
     * @param deleteIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIndex operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteIndex"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIndexResult> deleteIndexAsync(DeleteIndexRequest deleteIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIndexRequest, DeleteIndexResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified view.
     * </p>
     * <p>
     * If the specified view is the default view for its Amazon Web Services Region, then all <a>Search</a> operations
     * in that Region must explicitly specify the view to use until you configure a new default by calling the
     * <a>AssociateDefaultView</a> operation.
     * </p>
     * 
     * @param deleteViewRequest
     * @return A Java Future containing the result of the DeleteView operation returned by the service.
     * @sample AWSResourceExplorer2Async.DeleteView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(DeleteViewRequest deleteViewRequest);

    /**
     * <p>
     * Deletes the specified view.
     * </p>
     * <p>
     * If the specified view is the default view for its Amazon Web Services Region, then all <a>Search</a> operations
     * in that Region must explicitly specify the view to use until you configure a new default by calling the
     * <a>AssociateDefaultView</a> operation.
     * </p>
     * 
     * @param deleteViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.DeleteView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DeleteView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(DeleteViewRequest deleteViewRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteViewRequest, DeleteViewResult> asyncHandler);

    /**
     * <p>
     * After you call this operation, the affected Amazon Web Services Region no longer has a default view. All
     * <a>Search</a> operations in that Region must explicitly specify a view or the operation fails. You can configure
     * a new default by calling the <a>AssociateDefaultView</a> operation.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param disassociateDefaultViewRequest
     * @return A Java Future containing the result of the DisassociateDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2Async.DisassociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DisassociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDefaultViewResult> disassociateDefaultViewAsync(DisassociateDefaultViewRequest disassociateDefaultViewRequest);

    /**
     * <p>
     * After you call this operation, the affected Amazon Web Services Region no longer has a default view. All
     * <a>Search</a> operations in that Region must explicitly specify a view or the operation fails. You can configure
     * a new default by calling the <a>AssociateDefaultView</a> operation.
     * </p>
     * <p>
     * If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a
     * view with every <code>Search</code> operation performed in that Region.
     * </p>
     * 
     * @param disassociateDefaultViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.DisassociateDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/DisassociateDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDefaultViewResult> disassociateDefaultViewAsync(DisassociateDefaultViewRequest disassociateDefaultViewRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDefaultViewRequest, DisassociateDefaultViewResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Amazon Resource Name (ARN) of the view that is the default for the Amazon Web Services Region in
     * which you call this operation. You can then call <a>GetView</a> to retrieve the details of that view.
     * </p>
     * 
     * @param getDefaultViewRequest
     * @return A Java Future containing the result of the GetDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2Async.GetDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultViewResult> getDefaultViewAsync(GetDefaultViewRequest getDefaultViewRequest);

    /**
     * <p>
     * Retrieves the Amazon Resource Name (ARN) of the view that is the default for the Amazon Web Services Region in
     * which you call this operation. You can then call <a>GetView</a> to retrieve the details of that view.
     * </p>
     * 
     * @param getDefaultViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDefaultView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.GetDefaultView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetDefaultView"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDefaultViewResult> getDefaultViewAsync(GetDefaultViewRequest getDefaultViewRequest,
            com.amazonaws.handlers.AsyncHandler<GetDefaultViewRequest, GetDefaultViewResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about the Amazon Web Services Resource Explorer index in the Amazon Web Services Region in
     * which you invoked the operation.
     * </p>
     * 
     * @param getIndexRequest
     * @return A Java Future containing the result of the GetIndex operation returned by the service.
     * @sample AWSResourceExplorer2Async.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest getIndexRequest);

    /**
     * <p>
     * Retrieves details about the Amazon Web Services Resource Explorer index in the Amazon Web Services Region in
     * which you invoked the operation.
     * </p>
     * 
     * @param getIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIndex operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIndexResult> getIndexAsync(GetIndexRequest getIndexRequest,
            com.amazonaws.handlers.AsyncHandler<GetIndexRequest, GetIndexResult> asyncHandler);

    /**
     * <p>
     * Retrieves details of the specified view.
     * </p>
     * 
     * @param getViewRequest
     * @return A Java Future containing the result of the GetView operation returned by the service.
     * @sample AWSResourceExplorer2Async.GetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetViewResult> getViewAsync(GetViewRequest getViewRequest);

    /**
     * <p>
     * Retrieves details of the specified view.
     * </p>
     * 
     * @param getViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.GetView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetViewResult> getViewAsync(GetViewRequest getViewRequest,
            com.amazonaws.handlers.AsyncHandler<GetViewRequest, GetViewResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all of the indexes in Amazon Web Services Regions that are currently collecting resource
     * information for Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listIndexesRequest
     * @return A Java Future containing the result of the ListIndexes operation returned by the service.
     * @sample AWSResourceExplorer2Async.ListIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListIndexes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIndexesResult> listIndexesAsync(ListIndexesRequest listIndexesRequest);

    /**
     * <p>
     * Retrieves a list of all of the indexes in Amazon Web Services Regions that are currently collecting resource
     * information for Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listIndexesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIndexes operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.ListIndexes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListIndexes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIndexesResult> listIndexesAsync(ListIndexesRequest listIndexesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIndexesRequest, ListIndexesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all resource types currently supported by Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listSupportedResourceTypesRequest
     * @return A Java Future containing the result of the ListSupportedResourceTypes operation returned by the service.
     * @sample AWSResourceExplorer2Async.ListSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSupportedResourceTypesResult> listSupportedResourceTypesAsync(
            ListSupportedResourceTypesRequest listSupportedResourceTypesRequest);

    /**
     * <p>
     * Retrieves a list of all resource types currently supported by Amazon Web Services Resource Explorer.
     * </p>
     * 
     * @param listSupportedResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSupportedResourceTypes operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.ListSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSupportedResourceTypesResult> listSupportedResourceTypesAsync(
            ListSupportedResourceTypesRequest listSupportedResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSupportedResourceTypesRequest, ListSupportedResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that are attached to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSResourceExplorer2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that are attached to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> of the views available in the Amazon Web Services Region in which you call this operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a paginated
     * operation. These operations can occasionally return an empty set of results even when there are more results
     * available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i> when there are no
     * more results to display.
     * </p>
     * </note>
     * 
     * @param listViewsRequest
     * @return A Java Future containing the result of the ListViews operation returned by the service.
     * @sample AWSResourceExplorer2Async.ListViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListViews" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListViewsResult> listViewsAsync(ListViewsRequest listViewsRequest);

    /**
     * <p>
     * Lists the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> of the views available in the Amazon Web Services Region in which you call this operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a paginated
     * operation. These operations can occasionally return an empty set of results even when there are more results
     * available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i> when there are no
     * more results to display.
     * </p>
     * </note>
     * 
     * @param listViewsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListViews operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.ListViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ListViews" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListViewsResult> listViewsAsync(ListViewsRequest listViewsRequest,
            com.amazonaws.handlers.AsyncHandler<ListViewsRequest, ListViewsResult> asyncHandler);

    /**
     * <p>
     * Searches for resources and displays details about all resources that match the specified criteria. You must
     * specify a query string.
     * </p>
     * <p>
     * All search queries must use a view. If you don't explicitly specify a view, then Amazon Web Services Resource
     * Explorer uses the default view for the Amazon Web Services Region in which you call this operation. The results
     * are the logical intersection of the results that match both the <code>QueryString</code> parameter supplied to
     * this operation and the <code>SearchFilter</code> parameter attached to the view.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * If your search results are empty, or are missing results that you think should be there, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/troubleshooting_search.html">Troubleshooting
     * Resource Explorer search</a>.
     * </p>
     * 
     * @param searchRequest
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AWSResourceExplorer2Async.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest);

    /**
     * <p>
     * Searches for resources and displays details about all resources that match the specified criteria. You must
     * specify a query string.
     * </p>
     * <p>
     * All search queries must use a view. If you don't explicitly specify a view, then Amazon Web Services Resource
     * Explorer uses the default view for the Amazon Web Services Region in which you call this operation. The results
     * are the logical intersection of the results that match both the <code>QueryString</code> parameter supplied to
     * this operation and the <code>SearchFilter</code> parameter attached to the view.
     * </p>
     * <p>
     * For the complete syntax supported by the <code>QueryString</code> parameter, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/APIReference/about-query-syntax.html">Search query
     * syntax reference for Resource Explorer</a>.
     * </p>
     * <p>
     * If your search results are empty, or are missing results that you think should be there, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/troubleshooting_search.html">Troubleshooting
     * Resource Explorer search</a>.
     * </p>
     * 
     * @param searchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tag key and value pairs to an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSResourceExplorer2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tag key and value pairs to an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tag key and value pairs from an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSResourceExplorer2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tag key and value pairs from an Amazon Web Services Resource Explorer view or index.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Changes the type of the index from one of the following types to the other. For more information about indexes
     * and the role they perform in Amazon Web Services Resource Explorer, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>AGGREGATOR</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources from all Amazon Web Services Regions in the Amazon Web Services
     * account in which you've created a Resource Explorer index. Resource information from all other Regions is
     * replicated to this Region's index.
     * </p>
     * <p>
     * When you change the index type to <code>AGGREGATOR</code>, Resource Explorer turns on replication of all
     * discovered resource information from the other Amazon Web Services Regions in your account to this index. You can
     * then, from this Region only, perform resource search queries that span all Amazon Web Services Regions in the
     * Amazon Web Services account. Turning on replication from all other Regions is performed by asynchronous
     * background tasks. You can check the status of the asynchronous tasks by using the <a>GetIndex</a> operation. When
     * the asynchronous tasks complete, the <code>Status</code> response of that operation changes from
     * <code>UPDATING</code> to <code>ACTIVE</code>. After that, you can start to see results from other Amazon Web
     * Services Regions in query results. However, it can take several hours for replication from all other Regions to
     * complete.
     * </p>
     * <important>
     * <p>
     * You can have only one aggregator index per Amazon Web Services account. Before you can promote a different index
     * to be the aggregator index for the account, you must first demote the existing aggregator index to type
     * <code>LOCAL</code>.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b> <code>LOCAL</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources in only the Amazon Web Services Region in which the index exists.
     * If an aggregator index in another Region exists, then information in this local index is replicated to the
     * aggregator index.
     * </p>
     * <p>
     * When you change the index type to <code>LOCAL</code>, Resource Explorer turns off the replication of resource
     * information from all other Amazon Web Services Regions in the Amazon Web Services account to this Region. The
     * aggregator index remains in the <code>UPDATING</code> state until all replication with other Regions successfully
     * stops. You can check the status of the asynchronous task by using the <a>GetIndex</a> operation. When Resource
     * Explorer successfully stops all replication with other Regions, the <code>Status</code> response of that
     * operation changes from <code>UPDATING</code> to <code>ACTIVE</code>. Separately, the resource information from
     * other Regions that was previously stored in the index is deleted within 30 days by another background task. Until
     * that asynchronous task completes, some results from other Regions can continue to appear in search results.
     * </p>
     * <important>
     * <p>
     * After you demote an aggregator index to a local index, you must wait 24 hours before you can promote another
     * index to be the new aggregator index for the account.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param updateIndexTypeRequest
     * @return A Java Future containing the result of the UpdateIndexType operation returned by the service.
     * @sample AWSResourceExplorer2Async.UpdateIndexType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateIndexType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexTypeResult> updateIndexTypeAsync(UpdateIndexTypeRequest updateIndexTypeRequest);

    /**
     * <p>
     * Changes the type of the index from one of the following types to the other. For more information about indexes
     * and the role they perform in Amazon Web Services Resource Explorer, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a> in the <i>Amazon Web Services Resource Explorer User
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>AGGREGATOR</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources from all Amazon Web Services Regions in the Amazon Web Services
     * account in which you've created a Resource Explorer index. Resource information from all other Regions is
     * replicated to this Region's index.
     * </p>
     * <p>
     * When you change the index type to <code>AGGREGATOR</code>, Resource Explorer turns on replication of all
     * discovered resource information from the other Amazon Web Services Regions in your account to this index. You can
     * then, from this Region only, perform resource search queries that span all Amazon Web Services Regions in the
     * Amazon Web Services account. Turning on replication from all other Regions is performed by asynchronous
     * background tasks. You can check the status of the asynchronous tasks by using the <a>GetIndex</a> operation. When
     * the asynchronous tasks complete, the <code>Status</code> response of that operation changes from
     * <code>UPDATING</code> to <code>ACTIVE</code>. After that, you can start to see results from other Amazon Web
     * Services Regions in query results. However, it can take several hours for replication from all other Regions to
     * complete.
     * </p>
     * <important>
     * <p>
     * You can have only one aggregator index per Amazon Web Services account. Before you can promote a different index
     * to be the aggregator index for the account, you must first demote the existing aggregator index to type
     * <code>LOCAL</code>.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b> <code>LOCAL</code> index type</b>
     * </p>
     * <p>
     * The index contains information about resources in only the Amazon Web Services Region in which the index exists.
     * If an aggregator index in another Region exists, then information in this local index is replicated to the
     * aggregator index.
     * </p>
     * <p>
     * When you change the index type to <code>LOCAL</code>, Resource Explorer turns off the replication of resource
     * information from all other Amazon Web Services Regions in the Amazon Web Services account to this Region. The
     * aggregator index remains in the <code>UPDATING</code> state until all replication with other Regions successfully
     * stops. You can check the status of the asynchronous task by using the <a>GetIndex</a> operation. When Resource
     * Explorer successfully stops all replication with other Regions, the <code>Status</code> response of that
     * operation changes from <code>UPDATING</code> to <code>ACTIVE</code>. Separately, the resource information from
     * other Regions that was previously stored in the index is deleted within 30 days by another background task. Until
     * that asynchronous task completes, some results from other Regions can continue to appear in search results.
     * </p>
     * <important>
     * <p>
     * After you demote an aggregator index to a local index, you must wait 24 hours before you can promote another
     * index to be the new aggregator index for the account.
     * </p>
     * </important></li>
     * </ul>
     * 
     * @param updateIndexTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIndexType operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.UpdateIndexType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateIndexType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIndexTypeResult> updateIndexTypeAsync(UpdateIndexTypeRequest updateIndexTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIndexTypeRequest, UpdateIndexTypeResult> asyncHandler);

    /**
     * <p>
     * Modifies some of the details of a view. You can change the filter string and the list of included properties. You
     * can't change the name of the view.
     * </p>
     * 
     * @param updateViewRequest
     * @return A Java Future containing the result of the UpdateView operation returned by the service.
     * @sample AWSResourceExplorer2Async.UpdateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateViewResult> updateViewAsync(UpdateViewRequest updateViewRequest);

    /**
     * <p>
     * Modifies some of the details of a view. You can change the filter string and the list of included properties. You
     * can't change the name of the view.
     * </p>
     * 
     * @param updateViewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateView operation returned by the service.
     * @sample AWSResourceExplorer2AsyncHandler.UpdateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateViewResult> updateViewAsync(UpdateViewRequest updateViewRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateViewRequest, UpdateViewResult> asyncHandler);

}
