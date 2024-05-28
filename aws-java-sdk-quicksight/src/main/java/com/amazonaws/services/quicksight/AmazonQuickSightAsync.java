/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;

/**
 * Interface for accessing Amazon QuickSight asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.quicksight.AbstractAmazonQuickSightAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon QuickSight API Reference</fullname>
 * <p>
 * Amazon QuickSight is a fully managed, serverless business intelligence service for the Amazon Web Services Cloud that
 * makes it easy to extend data and insights to every user in your organization. This API reference contains
 * documentation for a programming interface that you can use to manage Amazon QuickSight.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQuickSightAsync extends AmazonQuickSight {

    /**
     * <p>
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return A Java Future containing the result of the CancelIngestion operation returned by the service.
     * @sample AmazonQuickSightAsync.CancelIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CancelIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelIngestionResult> cancelIngestionAsync(CancelIngestionRequest cancelIngestionRequest);

    /**
     * <p>
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelIngestion operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CancelIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CancelIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelIngestionResult> cancelIngestionAsync(CancelIngestionRequest cancelIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelIngestionRequest, CancelIngestionResult> asyncHandler);

    /**
     * <p>
     * Creates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, you can add a
     * custom default theme by using the <code>CreateAccountCustomization</code> or
     * <code>UpdateAccountCustomization</code> API operation. To further customize Amazon QuickSight by removing Amazon
     * QuickSight sample assets and videos for all new users, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/customizing-quicksight.html">Customizing Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide.</i>
     * </p>
     * <p>
     * You can create customizations for your Amazon Web Services account or, if you specify a namespace, for a
     * QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply
     * to an Amazon Web Services account. To find out which customizations apply, use the
     * <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * <p>
     * Before you use the <code>CreateAccountCustomization</code> API operation to add a theme as the namespace default,
     * make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme
     * isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the
     * current permissions by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeThemePermissions.html">DescribeThemePermissions</a> </code>
     * API operation. To share the theme, grant permissions by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateThemePermissions.html">UpdateThemePermissions</a> </code>
     * API operation.
     * </p>
     * 
     * @param createAccountCustomizationRequest
     * @return A Java Future containing the result of the CreateAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountCustomizationResult> createAccountCustomizationAsync(
            CreateAccountCustomizationRequest createAccountCustomizationRequest);

    /**
     * <p>
     * Creates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, you can add a
     * custom default theme by using the <code>CreateAccountCustomization</code> or
     * <code>UpdateAccountCustomization</code> API operation. To further customize Amazon QuickSight by removing Amazon
     * QuickSight sample assets and videos for all new users, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/customizing-quicksight.html">Customizing Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide.</i>
     * </p>
     * <p>
     * You can create customizations for your Amazon Web Services account or, if you specify a namespace, for a
     * QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply
     * to an Amazon Web Services account. To find out which customizations apply, use the
     * <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * <p>
     * Before you use the <code>CreateAccountCustomization</code> API operation to add a theme as the namespace default,
     * make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme
     * isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the
     * current permissions by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeThemePermissions.html">DescribeThemePermissions</a> </code>
     * API operation. To share the theme, grant permissions by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateThemePermissions.html">UpdateThemePermissions</a> </code>
     * API operation.
     * </p>
     * 
     * @param createAccountCustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountCustomizationResult> createAccountCustomizationAsync(
            CreateAccountCustomizationRequest createAccountCustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountCustomizationRequest, CreateAccountCustomizationResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon QuickSight account, or subscribes to Amazon QuickSight Q.
     * </p>
     * <p>
     * The Amazon Web Services Region for the account is derived from what is configured in the CLI or SDK.
     * </p>
     * <p>
     * Before you use this operation, make sure that you can connect to an existing Amazon Web Services account. If you
     * don't have an Amazon Web Services account, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/setting-up-aws-sign-up.html">Sign up for Amazon Web
     * Services</a> in the <i>Amazon QuickSight User Guide</i>. The person who signs up for Amazon QuickSight needs to
     * have the correct Identity and Access Management (IAM) permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/iam-policy-examples.html">IAM Policy Examples for Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * If your IAM policy includes both the <code>Subscribe</code> and <code>CreateAccountSubscription</code> actions,
     * make sure that both actions are set to <code>Allow</code>. If either action is set to <code>Deny</code>, the
     * <code>Deny</code> action prevails and your API call fails.
     * </p>
     * <p>
     * You can't pass an existing IAM role to access other Amazon Web Services services using this API operation. To
     * pass your existing IAM role to Amazon QuickSight, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/security_iam_service-with-iam.html#security-create-iam-role"
     * >Passing IAM roles to Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * You can't set default resource access on the new account from the Amazon QuickSight API. Instead, add default
     * resource access from the Amazon QuickSight console. For more information about setting default resource access to
     * Amazon Web Services services, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/scoping-policies-defaults.html">Setting default resource
     * access to Amazon Web Services services</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param createAccountSubscriptionRequest
     * @return A Java Future containing the result of the CreateAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountSubscriptionResult> createAccountSubscriptionAsync(
            CreateAccountSubscriptionRequest createAccountSubscriptionRequest);

    /**
     * <p>
     * Creates an Amazon QuickSight account, or subscribes to Amazon QuickSight Q.
     * </p>
     * <p>
     * The Amazon Web Services Region for the account is derived from what is configured in the CLI or SDK.
     * </p>
     * <p>
     * Before you use this operation, make sure that you can connect to an existing Amazon Web Services account. If you
     * don't have an Amazon Web Services account, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/setting-up-aws-sign-up.html">Sign up for Amazon Web
     * Services</a> in the <i>Amazon QuickSight User Guide</i>. The person who signs up for Amazon QuickSight needs to
     * have the correct Identity and Access Management (IAM) permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/iam-policy-examples.html">IAM Policy Examples for Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * If your IAM policy includes both the <code>Subscribe</code> and <code>CreateAccountSubscription</code> actions,
     * make sure that both actions are set to <code>Allow</code>. If either action is set to <code>Deny</code>, the
     * <code>Deny</code> action prevails and your API call fails.
     * </p>
     * <p>
     * You can't pass an existing IAM role to access other Amazon Web Services services using this API operation. To
     * pass your existing IAM role to Amazon QuickSight, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/security_iam_service-with-iam.html#security-create-iam-role"
     * >Passing IAM roles to Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * You can't set default resource access on the new account from the Amazon QuickSight API. Instead, add default
     * resource access from the Amazon QuickSight console. For more information about setting default resource access to
     * Amazon Web Services services, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/scoping-policies-defaults.html">Setting default resource
     * access to Amazon Web Services services</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param createAccountSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountSubscriptionResult> createAccountSubscriptionAsync(
            CreateAccountSubscriptionRequest createAccountSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountSubscriptionRequest, CreateAccountSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates an analysis in Amazon QuickSight. Analyses can be created either from a template or from an
     * <code>AnalysisDefinition</code>.
     * </p>
     * 
     * @param createAnalysisRequest
     * @return A Java Future containing the result of the CreateAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalysisResult> createAnalysisAsync(CreateAnalysisRequest createAnalysisRequest);

    /**
     * <p>
     * Creates an analysis in Amazon QuickSight. Analyses can be created either from a template or from an
     * <code>AnalysisDefinition</code>.
     * </p>
     * 
     * @param createAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalysisResult> createAnalysisAsync(CreateAnalysisRequest createAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnalysisRequest, CreateAnalysisResult> asyncHandler);

    /**
     * <p>
     * Creates a dashboard from either a template or directly with a <code>DashboardDefinition</code>. To first create a
     * template, see the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateTemplate.html">CreateTemplate</a> </code>
     * API operation.
     * </p>
     * <p>
     * A dashboard is an entity in Amazon QuickSight that identifies Amazon QuickSight reports, created from analyses.
     * You can share Amazon QuickSight dashboards. With the right permissions, you can create scheduled email reports
     * from them. If you have the correct permissions, you can create a dashboard from a template that exists in a
     * different Amazon Web Services account.
     * </p>
     * 
     * @param createDashboardRequest
     * @return A Java Future containing the result of the CreateDashboard operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest createDashboardRequest);

    /**
     * <p>
     * Creates a dashboard from either a template or directly with a <code>DashboardDefinition</code>. To first create a
     * template, see the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateTemplate.html">CreateTemplate</a> </code>
     * API operation.
     * </p>
     * <p>
     * A dashboard is an entity in Amazon QuickSight that identifies Amazon QuickSight reports, created from analyses.
     * You can share Amazon QuickSight dashboards. With the right permissions, you can create scheduled email reports
     * from them. If you have the correct permissions, you can create a dashboard from a template that exists in a
     * different Amazon Web Services account.
     * </p>
     * 
     * @param createDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDashboard operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest createDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDashboardRequest, CreateDashboardResult> asyncHandler);

    /**
     * <p>
     * Creates a dataset. This operation doesn't support datasets that include uploaded files as a source.
     * </p>
     * 
     * @param createDataSetRequest
     * @return A Java Future containing the result of the CreateDataSet operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest createDataSetRequest);

    /**
     * <p>
     * Creates a dataset. This operation doesn't support datasets that include uploaded files as a source.
     * </p>
     * 
     * @param createDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSet operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest createDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSetRequest, CreateDataSetResult> asyncHandler);

    /**
     * <p>
     * Creates a data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates an empty shared folder.
     * </p>
     * 
     * @param createFolderRequest
     * @return A Java Future containing the result of the CreateFolder operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderResult> createFolderAsync(CreateFolderRequest createFolderRequest);

    /**
     * <p>
     * Creates an empty shared folder.
     * </p>
     * 
     * @param createFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFolder operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderResult> createFolderAsync(CreateFolderRequest createFolderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFolderRequest, CreateFolderResult> asyncHandler);

    /**
     * <p>
     * Adds an asset, such as a dashboard, analysis, or dataset into a folder.
     * </p>
     * 
     * @param createFolderMembershipRequest
     * @return A Java Future containing the result of the CreateFolderMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateFolderMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolderMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderMembershipResult> createFolderMembershipAsync(CreateFolderMembershipRequest createFolderMembershipRequest);

    /**
     * <p>
     * Adds an asset, such as a dashboard, analysis, or dataset into a folder.
     * </p>
     * 
     * @param createFolderMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFolderMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateFolderMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateFolderMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderMembershipResult> createFolderMembershipAsync(CreateFolderMembershipRequest createFolderMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFolderMembershipRequest, CreateFolderMembershipResult> asyncHandler);

    /**
     * <p>
     * Use the <code>CreateGroup</code> operation to create a group in Amazon QuickSight. You can create up to 10,000
     * groups in a namespace. If you want to create more than 10,000 groups in a namespace, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:&lt;your-region&gt;:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * 
     * @param createGroupRequest
     *        The request object for this operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Use the <code>CreateGroup</code> operation to create a group in Amazon QuickSight. You can create up to 10,000
     * groups in a namespace. If you want to create more than 10,000 groups in a namespace, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:&lt;your-region&gt;:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * 
     * @param createGroupRequest
     *        The request object for this operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return A Java Future containing the result of the CreateGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest createGroupMembershipRequest);

    /**
     * <p>
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest createGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupMembershipRequest, CreateGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy
     * assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per
     * Amazon Web Services account. To avoid overwriting rules in other namespaces, use assignment names that are
     * unique.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @return A Java Future containing the result of the CreateIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIAMPolicyAssignmentResult> createIAMPolicyAssignmentAsync(
            CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy
     * assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per
     * Amazon Web Services account. To avoid overwriting rules in other namespaces, use assignment names that are
     * unique.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIAMPolicyAssignmentResult> createIAMPolicyAssignmentAsync(
            CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIAMPolicyAssignmentRequest, CreateIAMPolicyAssignmentResult> asyncHandler);

    /**
     * <p>
     * Creates and starts a new SPICE ingestion for a dataset. You can manually refresh datasets in an Enterprise
     * edition account 32 times in a 24-hour period. You can manually refresh datasets in a Standard edition account 8
     * times in a 24-hour period. Each 24-hour period is measured starting 24 hours before the current date and time.
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="http://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the Amazon Web Services
     * Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @return A Java Future containing the result of the CreateIngestion operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest createIngestionRequest);

    /**
     * <p>
     * Creates and starts a new SPICE ingestion for a dataset. You can manually refresh datasets in an Enterprise
     * edition account 32 times in a 24-hour period. You can manually refresh datasets in a Standard edition account 8
     * times in a 24-hour period. Each 24-hour period is measured starting 24 hours before the current date and time.
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="http://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the Amazon Web Services
     * Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIngestion operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest createIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIngestionRequest, CreateIngestionResult> asyncHandler);

    /**
     * <p>
     * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight.
     * </p>
     * <p>
     * A namespace allows you to isolate the Amazon QuickSight users and groups that are registered for that namespace.
     * Users that access the namespace can share assets only with other users or groups in the same namespace. They
     * can't see users and groups in other namespaces. You can create a namespace after your Amazon Web Services account
     * is subscribed to Amazon QuickSight. The namespace must be unique within the Amazon Web Services account. By
     * default, there is a limit of 100 namespaces per Amazon Web Services account. To increase your limit, create a
     * ticket with Amazon Web Services Support.
     * </p>
     * 
     * @param createNamespaceRequest
     * @return A Java Future containing the result of the CreateNamespace operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest createNamespaceRequest);

    /**
     * <p>
     * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight.
     * </p>
     * <p>
     * A namespace allows you to isolate the Amazon QuickSight users and groups that are registered for that namespace.
     * Users that access the namespace can share assets only with other users or groups in the same namespace. They
     * can't see users and groups in other namespaces. You can create a namespace after your Amazon Web Services account
     * is subscribed to Amazon QuickSight. The namespace must be unique within the Amazon Web Services account. By
     * default, there is a limit of 100 namespaces per Amazon Web Services account. To increase your limit, create a
     * ticket with Amazon Web Services Support.
     * </p>
     * 
     * @param createNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNamespace operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest createNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates a refresh schedule for a dataset. You can create up to 5 different schedules for a single dataset.
     * </p>
     * 
     * @param createRefreshScheduleRequest
     * @return A Java Future containing the result of the CreateRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRefreshScheduleResult> createRefreshScheduleAsync(CreateRefreshScheduleRequest createRefreshScheduleRequest);

    /**
     * <p>
     * Creates a refresh schedule for a dataset. You can create up to 5 different schedules for a single dataset.
     * </p>
     * 
     * @param createRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRefreshScheduleResult> createRefreshScheduleAsync(CreateRefreshScheduleRequest createRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRefreshScheduleRequest, CreateRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Use <code>CreateRoleMembership</code> to add an existing Amazon QuickSight group to an existing role.
     * </p>
     * 
     * @param createRoleMembershipRequest
     * @return A Java Future containing the result of the CreateRoleMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateRoleMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateRoleMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoleMembershipResult> createRoleMembershipAsync(CreateRoleMembershipRequest createRoleMembershipRequest);

    /**
     * <p>
     * Use <code>CreateRoleMembership</code> to add an existing Amazon QuickSight group to an existing role.
     * </p>
     * 
     * @param createRoleMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoleMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateRoleMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateRoleMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoleMembershipResult> createRoleMembershipAsync(CreateRoleMembershipRequest createRoleMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoleMembershipRequest, CreateRoleMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a template either from a <code>TemplateDefinition</code> or from an existing Amazon QuickSight analysis
     * or template. You can use the resulting template to create additional dashboards, templates, or analyses.
     * </p>
     * <p>
     * A <i>template</i> is an entity in Amazon QuickSight that encapsulates the metadata required to create an analysis
     * and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to
     * replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
     * placeholders with datasets that follow the same schema that was used to create the source analysis and template.
     * </p>
     * 
     * @param createTemplateRequest
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Creates a template either from a <code>TemplateDefinition</code> or from an existing Amazon QuickSight analysis
     * or template. You can use the resulting template to create additional dashboards, templates, or analyses.
     * </p>
     * <p>
     * A <i>template</i> is an entity in Amazon QuickSight that encapsulates the metadata required to create an analysis
     * and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to
     * replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
     * placeholders with datasets that follow the same schema that was used to create the source analysis and template.
     * </p>
     * 
     * @param createTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplate operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest createTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a template alias for a template.
     * </p>
     * 
     * @param createTemplateAliasRequest
     * @return A Java Future containing the result of the CreateTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateAliasResult> createTemplateAliasAsync(CreateTemplateAliasRequest createTemplateAliasRequest);

    /**
     * <p>
     * Creates a template alias for a template.
     * </p>
     * 
     * @param createTemplateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateAliasResult> createTemplateAliasAsync(CreateTemplateAliasRequest createTemplateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateAliasRequest, CreateTemplateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a theme.
     * </p>
     * <p>
     * A <i>theme</i> is set of configuration options for color and layout. Themes apply to analyses and dashboards. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param createThemeRequest
     * @return A Java Future containing the result of the CreateTheme operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest createThemeRequest);

    /**
     * <p>
     * Creates a theme.
     * </p>
     * <p>
     * A <i>theme</i> is set of configuration options for color and layout. Themes apply to analyses and dashboards. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param createThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTheme operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest createThemeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThemeRequest, CreateThemeResult> asyncHandler);

    /**
     * <p>
     * Creates a theme alias for a theme.
     * </p>
     * 
     * @param createThemeAliasRequest
     * @return A Java Future containing the result of the CreateThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeAliasResult> createThemeAliasAsync(CreateThemeAliasRequest createThemeAliasRequest);

    /**
     * <p>
     * Creates a theme alias for a theme.
     * </p>
     * 
     * @param createThemeAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThemeAliasResult> createThemeAliasAsync(CreateThemeAliasRequest createThemeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThemeAliasRequest, CreateThemeAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a new Q topic.
     * </p>
     * 
     * @param createTopicRequest
     * @return A Java Future containing the result of the CreateTopic operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest);

    /**
     * <p>
     * Creates a new Q topic.
     * </p>
     * 
     * @param createTopicRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTopic operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicResult> createTopicAsync(CreateTopicRequest createTopicRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler);

    /**
     * <p>
     * Creates a topic refresh schedule.
     * </p>
     * 
     * @param createTopicRefreshScheduleRequest
     * @return A Java Future containing the result of the CreateTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicRefreshScheduleResult> createTopicRefreshScheduleAsync(
            CreateTopicRefreshScheduleRequest createTopicRefreshScheduleRequest);

    /**
     * <p>
     * Creates a topic refresh schedule.
     * </p>
     * 
     * @param createTopicRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTopicRefreshScheduleResult> createTopicRefreshScheduleAsync(
            CreateTopicRefreshScheduleRequest createTopicRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRefreshScheduleRequest, CreateTopicRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Creates a new VPC connection.
     * </p>
     * 
     * @param createVPCConnectionRequest
     * @return A Java Future containing the result of the CreateVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsync.CreateVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCConnectionResult> createVPCConnectionAsync(CreateVPCConnectionRequest createVPCConnectionRequest);

    /**
     * <p>
     * Creates a new VPC connection.
     * </p>
     * 
     * @param createVPCConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.CreateVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCConnectionResult> createVPCConnectionAsync(CreateVPCConnectionRequest createVPCConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVPCConnectionRequest, CreateVPCConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes all Amazon QuickSight customizations in this Amazon Web Services Region for the specified Amazon Web
     * Services account and Amazon QuickSight namespace.
     * </p>
     * 
     * @param deleteAccountCustomizationRequest
     * @return A Java Future containing the result of the DeleteAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountCustomizationResult> deleteAccountCustomizationAsync(
            DeleteAccountCustomizationRequest deleteAccountCustomizationRequest);

    /**
     * <p>
     * Deletes all Amazon QuickSight customizations in this Amazon Web Services Region for the specified Amazon Web
     * Services account and Amazon QuickSight namespace.
     * </p>
     * 
     * @param deleteAccountCustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountCustomizationResult> deleteAccountCustomizationAsync(
            DeleteAccountCustomizationRequest deleteAccountCustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountCustomizationRequest, DeleteAccountCustomizationResult> asyncHandler);

    /**
     * <p>
     * Use the <code>DeleteAccountSubscription</code> operation to delete an Amazon QuickSight account. This operation
     * will result in an error message if you have configured your account termination protection settings to
     * <code>True</code>. To change this setting and delete your account, call the <code>UpdateAccountSettings</code>
     * API and set the value of the <code>TerminationProtectionEnabled</code> parameter to <code>False</code>, then make
     * another call to the <code>DeleteAccountSubscription</code> API.
     * </p>
     * 
     * @param deleteAccountSubscriptionRequest
     * @return A Java Future containing the result of the DeleteAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountSubscriptionResult> deleteAccountSubscriptionAsync(
            DeleteAccountSubscriptionRequest deleteAccountSubscriptionRequest);

    /**
     * <p>
     * Use the <code>DeleteAccountSubscription</code> operation to delete an Amazon QuickSight account. This operation
     * will result in an error message if you have configured your account termination protection settings to
     * <code>True</code>. To change this setting and delete your account, call the <code>UpdateAccountSettings</code>
     * API and set the value of the <code>TerminationProtectionEnabled</code> parameter to <code>False</code>, then make
     * another call to the <code>DeleteAccountSubscription</code> API.
     * </p>
     * 
     * @param deleteAccountSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountSubscriptionResult> deleteAccountSubscriptionAsync(
            DeleteAccountSubscriptionRequest deleteAccountSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountSubscriptionRequest, DeleteAccountSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can
     * restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. Amazon
     * QuickSight attaches a <code>DeletionTime</code> stamp to the response that specifies the end of the recovery
     * window. At the end of the recovery window, Amazon QuickSight deletes the analysis permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use the <code>RestoreAnalysis</code> API operation to remove the
     * <code>DeletionTime</code> stamp and cancel the deletion of the analysis. The analysis remains visible in the API
     * until it's deleted, so you can describe it but you can't make a template from it.
     * </p>
     * <p>
     * An analysis that's scheduled for deletion isn't accessible in the Amazon QuickSight console. To access it in the
     * console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
     * </p>
     * 
     * @param deleteAnalysisRequest
     * @return A Java Future containing the result of the DeleteAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalysisResult> deleteAnalysisAsync(DeleteAnalysisRequest deleteAnalysisRequest);

    /**
     * <p>
     * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can
     * restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. Amazon
     * QuickSight attaches a <code>DeletionTime</code> stamp to the response that specifies the end of the recovery
     * window. At the end of the recovery window, Amazon QuickSight deletes the analysis permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use the <code>RestoreAnalysis</code> API operation to remove the
     * <code>DeletionTime</code> stamp and cancel the deletion of the analysis. The analysis remains visible in the API
     * until it's deleted, so you can describe it but you can't make a template from it.
     * </p>
     * <p>
     * An analysis that's scheduled for deletion isn't accessible in the Amazon QuickSight console. To access it in the
     * console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
     * </p>
     * 
     * @param deleteAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalysisResult> deleteAnalysisAsync(DeleteAnalysisRequest deleteAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnalysisRequest, DeleteAnalysisResult> asyncHandler);

    /**
     * <p>
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return A Java Future containing the result of the DeleteDashboard operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest deleteDashboardRequest);

    /**
     * <p>
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDashboard operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest deleteDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDashboardRequest, DeleteDashboardResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return A Java Future containing the result of the DeleteDataSet operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest deleteDataSetRequest);

    /**
     * <p>
     * Deletes a dataset.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSet operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest deleteDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSetRequest, DeleteDataSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the dataset refresh properties of the dataset.
     * </p>
     * 
     * @param deleteDataSetRefreshPropertiesRequest
     * @return A Java Future containing the result of the DeleteDataSetRefreshProperties operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DeleteDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetRefreshPropertiesResult> deleteDataSetRefreshPropertiesAsync(
            DeleteDataSetRefreshPropertiesRequest deleteDataSetRefreshPropertiesRequest);

    /**
     * <p>
     * Deletes the dataset refresh properties of the dataset.
     * </p>
     * 
     * @param deleteDataSetRefreshPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSetRefreshProperties operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DeleteDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetRefreshPropertiesResult> deleteDataSetRefreshPropertiesAsync(
            DeleteDataSetRefreshPropertiesRequest deleteDataSetRefreshPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSetRefreshPropertiesRequest, DeleteDataSetRefreshPropertiesResult> asyncHandler);

    /**
     * <p>
     * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data
     * source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data
     * source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes an empty folder.
     * </p>
     * 
     * @param deleteFolderRequest
     * @return A Java Future containing the result of the DeleteFolder operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(DeleteFolderRequest deleteFolderRequest);

    /**
     * <p>
     * Deletes an empty folder.
     * </p>
     * 
     * @param deleteFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFolder operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(DeleteFolderRequest deleteFolderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFolderRequest, DeleteFolderResult> asyncHandler);

    /**
     * <p>
     * Removes an asset, such as a dashboard, analysis, or dataset, from a folder.
     * </p>
     * 
     * @param deleteFolderMembershipRequest
     * @return A Java Future containing the result of the DeleteFolderMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteFolderMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteFolderMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderMembershipResult> deleteFolderMembershipAsync(DeleteFolderMembershipRequest deleteFolderMembershipRequest);

    /**
     * <p>
     * Removes an asset, such as a dashboard, analysis, or dataset, from a folder.
     * </p>
     * 
     * @param deleteFolderMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFolderMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteFolderMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteFolderMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderMembershipResult> deleteFolderMembershipAsync(DeleteFolderMembershipRequest deleteFolderMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFolderMembershipRequest, DeleteFolderMembershipResult> asyncHandler);

    /**
     * <p>
     * Removes a user group from Amazon QuickSight.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Removes a user group from Amazon QuickSight.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Removes a user from a group so that the user is no longer a member of the group.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return A Java Future containing the result of the DeleteGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest deleteGroupMembershipRequest);

    /**
     * <p>
     * Removes a user from a group so that the user is no longer a member of the group.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest deleteGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupMembershipRequest, DeleteGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @return A Java Future containing the result of the DeleteIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIAMPolicyAssignmentResult> deleteIAMPolicyAssignmentAsync(
            DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIAMPolicyAssignmentResult> deleteIAMPolicyAssignmentAsync(
            DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIAMPolicyAssignmentRequest, DeleteIAMPolicyAssignmentResult> asyncHandler);

    /**
     * <p>
     * Deletes all access scopes and authorized targets that are associated with a service from the Amazon QuickSight
     * IAM Identity Center application.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts that use IAM Identity Center.
     * </p>
     * 
     * @param deleteIdentityPropagationConfigRequest
     * @return A Java Future containing the result of the DeleteIdentityPropagationConfig operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DeleteIdentityPropagationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIdentityPropagationConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityPropagationConfigResult> deleteIdentityPropagationConfigAsync(
            DeleteIdentityPropagationConfigRequest deleteIdentityPropagationConfigRequest);

    /**
     * <p>
     * Deletes all access scopes and authorized targets that are associated with a service from the Amazon QuickSight
     * IAM Identity Center application.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts that use IAM Identity Center.
     * </p>
     * 
     * @param deleteIdentityPropagationConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityPropagationConfig operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DeleteIdentityPropagationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIdentityPropagationConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityPropagationConfigResult> deleteIdentityPropagationConfigAsync(
            DeleteIdentityPropagationConfigRequest deleteIdentityPropagationConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityPropagationConfigRequest, DeleteIdentityPropagationConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous
     * process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these
     * assets, you use the API operations for the relevant asset.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous
     * process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these
     * assets, you use the API operations for the relevant asset.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler);

    /**
     * <p>
     * Deletes a refresh schedule from a dataset.
     * </p>
     * 
     * @param deleteRefreshScheduleRequest
     * @return A Java Future containing the result of the DeleteRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRefreshScheduleResult> deleteRefreshScheduleAsync(DeleteRefreshScheduleRequest deleteRefreshScheduleRequest);

    /**
     * <p>
     * Deletes a refresh schedule from a dataset.
     * </p>
     * 
     * @param deleteRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRefreshScheduleResult> deleteRefreshScheduleAsync(DeleteRefreshScheduleRequest deleteRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRefreshScheduleRequest, DeleteRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Removes custom permissions from the role.
     * </p>
     * 
     * @param deleteRoleCustomPermissionRequest
     * @return A Java Future containing the result of the DeleteRoleCustomPermission operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoleCustomPermissionResult> deleteRoleCustomPermissionAsync(
            DeleteRoleCustomPermissionRequest deleteRoleCustomPermissionRequest);

    /**
     * <p>
     * Removes custom permissions from the role.
     * </p>
     * 
     * @param deleteRoleCustomPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoleCustomPermission operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoleCustomPermissionResult> deleteRoleCustomPermissionAsync(
            DeleteRoleCustomPermissionRequest deleteRoleCustomPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoleCustomPermissionRequest, DeleteRoleCustomPermissionResult> asyncHandler);

    /**
     * <p>
     * Removes a group from a role.
     * </p>
     * 
     * @param deleteRoleMembershipRequest
     * @return A Java Future containing the result of the DeleteRoleMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteRoleMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRoleMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoleMembershipResult> deleteRoleMembershipAsync(DeleteRoleMembershipRequest deleteRoleMembershipRequest);

    /**
     * <p>
     * Removes a group from a role.
     * </p>
     * 
     * @param deleteRoleMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoleMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteRoleMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteRoleMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoleMembershipResult> deleteRoleMembershipAsync(DeleteRoleMembershipRequest deleteRoleMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoleMembershipRequest, DeleteRoleMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplate operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest deleteTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the
     * version of the template that the alias points to.
     * </p>
     * 
     * @param deleteTemplateAliasRequest
     * @return A Java Future containing the result of the DeleteTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateAliasResult> deleteTemplateAliasAsync(DeleteTemplateAliasRequest deleteTemplateAliasRequest);

    /**
     * <p>
     * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the
     * version of the template that the alias points to.
     * </p>
     * 
     * @param deleteTemplateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateAliasResult> deleteTemplateAliasAsync(DeleteTemplateAliasRequest deleteTemplateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateAliasRequest, DeleteTemplateAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a theme.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return A Java Future containing the result of the DeleteTheme operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest deleteThemeRequest);

    /**
     * <p>
     * Deletes a theme.
     * </p>
     * 
     * @param deleteThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTheme operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest deleteThemeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThemeRequest, DeleteThemeResult> asyncHandler);

    /**
     * <p>
     * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you
     * delete the version of the theme that the alias points to.
     * </p>
     * 
     * @param deleteThemeAliasRequest
     * @return A Java Future containing the result of the DeleteThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeAliasResult> deleteThemeAliasAsync(DeleteThemeAliasRequest deleteThemeAliasRequest);

    /**
     * <p>
     * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you
     * delete the version of the theme that the alias points to.
     * </p>
     * 
     * @param deleteThemeAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThemeAliasResult> deleteThemeAliasAsync(DeleteThemeAliasRequest deleteThemeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThemeAliasRequest, DeleteThemeAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a topic.
     * </p>
     * 
     * @param deleteTopicRequest
     * @return A Java Future containing the result of the DeleteTopic operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest);

    /**
     * <p>
     * Deletes a topic.
     * </p>
     * 
     * @param deleteTopicRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTopic operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicResult> deleteTopicAsync(DeleteTopicRequest deleteTopicRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, DeleteTopicResult> asyncHandler);

    /**
     * <p>
     * Deletes a topic refresh schedule.
     * </p>
     * 
     * @param deleteTopicRefreshScheduleRequest
     * @return A Java Future containing the result of the DeleteTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicRefreshScheduleResult> deleteTopicRefreshScheduleAsync(
            DeleteTopicRefreshScheduleRequest deleteTopicRefreshScheduleRequest);

    /**
     * <p>
     * Deletes a topic refresh schedule.
     * </p>
     * 
     * @param deleteTopicRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTopicRefreshScheduleResult> deleteTopicRefreshScheduleAsync(
            DeleteTopicRefreshScheduleRequest deleteTopicRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRefreshScheduleRequest, DeleteTopicRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes the Amazon QuickSight user that is associated with the identity of the IAM user or role that's making the
     * call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the Amazon QuickSight user that is associated with the identity of the IAM user or role that's making the
     * call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest
     * @return A Java Future containing the result of the DeleteUserByPrincipalId operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteUserByPrincipalId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest);

    /**
     * <p>
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserByPrincipalId operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteUserByPrincipalId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserByPrincipalIdRequest, DeleteUserByPrincipalIdResult> asyncHandler);

    /**
     * <p>
     * Deletes a VPC connection.
     * </p>
     * 
     * @param deleteVPCConnectionRequest
     * @return A Java Future containing the result of the DeleteVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsync.DeleteVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCConnectionResult> deleteVPCConnectionAsync(DeleteVPCConnectionRequest deleteVPCConnectionRequest);

    /**
     * <p>
     * Deletes a VPC connection.
     * </p>
     * 
     * @param deleteVPCConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DeleteVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCConnectionResult> deleteVPCConnectionAsync(DeleteVPCConnectionRequest deleteVPCConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVPCConnectionRequest, DeleteVPCConnectionResult> asyncHandler);

    /**
     * <p>
     * Describes the customizations associated with the provided Amazon Web Services account and Amazon Amazon
     * QuickSight namespace in an Amazon Web Services Region. The Amazon QuickSight console evaluates which
     * customizations to apply by running this API operation with the <code>Resolved</code> flag included.
     * </p>
     * <p>
     * To determine what customizations display when you run this command, it can help to visualize the relationship of
     * the entities involved.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Amazon Web Services account</code> - The Amazon Web Services account exists at the top of the hierarchy. It
     * has the potential to use all of the Amazon Web Services Regions and Amazon Web Services Services. When you
     * subscribe to Amazon QuickSight, you choose one Amazon Web Services Region to use as your home Region. That's
     * where your free SPICE capacity is located. You can use Amazon QuickSight in any supported Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon Web Services Region</code> - In each Amazon Web Services Region where you sign in to Amazon
     * QuickSight at least once, Amazon QuickSight acts as a separate instance of the same service. If you have a user
     * directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have
     * access to Amazon QuickSight in any Amazon Web Services Region, unless they are constrained to a namespace.
     * </p>
     * <p>
     * To run the command in a different Amazon Web Services Region, you change your Region settings. If you're using
     * the CLI, you can use one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-options.html">command line
     * options</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-profiles.html">named profiles</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Run <code>aws configure</code> to change your default Amazon Web Services Region. Use Enter to key the same
     * settings for your keys. For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html">Configuring the CLI</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code> - A QuickSight namespace is a partition that contains users and assets (data sources,
     * datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also
     * be part of the same namespace. People who share a namespace are completely isolated from users and assets in
     * other namespaces, even if they are in the same Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Applied customizations</code> - Within an Amazon Web Services Region, a set of Amazon QuickSight
     * customizations can apply to an Amazon Web Services account or to a namespace. Settings that you apply to a
     * namespace override settings that you apply to an Amazon Web Services account. All settings are isolated to a
     * single Amazon Web Services Region. To apply them in other Amazon Web Services Regions, run the
     * <code>CreateAccountCustomization</code> command in each Amazon Web Services Region where you want to apply the
     * same customizations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountCustomizationRequest
     * @return A Java Future containing the result of the DescribeAccountCustomization operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountCustomizationResult> describeAccountCustomizationAsync(
            DescribeAccountCustomizationRequest describeAccountCustomizationRequest);

    /**
     * <p>
     * Describes the customizations associated with the provided Amazon Web Services account and Amazon Amazon
     * QuickSight namespace in an Amazon Web Services Region. The Amazon QuickSight console evaluates which
     * customizations to apply by running this API operation with the <code>Resolved</code> flag included.
     * </p>
     * <p>
     * To determine what customizations display when you run this command, it can help to visualize the relationship of
     * the entities involved.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Amazon Web Services account</code> - The Amazon Web Services account exists at the top of the hierarchy. It
     * has the potential to use all of the Amazon Web Services Regions and Amazon Web Services Services. When you
     * subscribe to Amazon QuickSight, you choose one Amazon Web Services Region to use as your home Region. That's
     * where your free SPICE capacity is located. You can use Amazon QuickSight in any supported Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon Web Services Region</code> - In each Amazon Web Services Region where you sign in to Amazon
     * QuickSight at least once, Amazon QuickSight acts as a separate instance of the same service. If you have a user
     * directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have
     * access to Amazon QuickSight in any Amazon Web Services Region, unless they are constrained to a namespace.
     * </p>
     * <p>
     * To run the command in a different Amazon Web Services Region, you change your Region settings. If you're using
     * the CLI, you can use one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-options.html">command line
     * options</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-profiles.html">named profiles</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Run <code>aws configure</code> to change your default Amazon Web Services Region. Use Enter to key the same
     * settings for your keys. For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html">Configuring the CLI</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code> - A QuickSight namespace is a partition that contains users and assets (data sources,
     * datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also
     * be part of the same namespace. People who share a namespace are completely isolated from users and assets in
     * other namespaces, even if they are in the same Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Applied customizations</code> - Within an Amazon Web Services Region, a set of Amazon QuickSight
     * customizations can apply to an Amazon Web Services account or to a namespace. Settings that you apply to a
     * namespace override settings that you apply to an Amazon Web Services account. All settings are isolated to a
     * single Amazon Web Services Region. To apply them in other Amazon Web Services Regions, run the
     * <code>CreateAccountCustomization</code> command in each Amazon Web Services Region where you want to apply the
     * same customizations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountCustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountCustomization operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountCustomizationResult> describeAccountCustomizationAsync(
            DescribeAccountCustomizationRequest describeAccountCustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountCustomizationRequest, DescribeAccountCustomizationResult> asyncHandler);

    /**
     * <p>
     * Describes the settings that were used when your Amazon QuickSight subscription was first created in this Amazon
     * Web Services account.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @return A Java Future containing the result of the DescribeAccountSettings operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest describeAccountSettingsRequest);

    /**
     * <p>
     * Describes the settings that were used when your Amazon QuickSight subscription was first created in this Amazon
     * Web Services account.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountSettings operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest describeAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountSettingsRequest, DescribeAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Use the DescribeAccountSubscription operation to receive a description of an Amazon QuickSight account's
     * subscription. A successful API call returns an <code>AccountInfo</code> object that includes an account's name,
     * subscription status, authentication type, edition, and notification email address.
     * </p>
     * 
     * @param describeAccountSubscriptionRequest
     * @return A Java Future containing the result of the DescribeAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSubscriptionResult> describeAccountSubscriptionAsync(
            DescribeAccountSubscriptionRequest describeAccountSubscriptionRequest);

    /**
     * <p>
     * Use the DescribeAccountSubscription operation to receive a description of an Amazon QuickSight account's
     * subscription. A successful API call returns an <code>AccountInfo</code> object that includes an account's name,
     * subscription status, authentication type, edition, and notification email address.
     * </p>
     * 
     * @param describeAccountSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountSubscription operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAccountSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountSubscriptionResult> describeAccountSubscriptionAsync(
            DescribeAccountSubscriptionRequest describeAccountSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountSubscriptionRequest, DescribeAccountSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Provides a summary of the metadata for an analysis.
     * </p>
     * 
     * @param describeAnalysisRequest
     * @return A Java Future containing the result of the DescribeAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisResult> describeAnalysisAsync(DescribeAnalysisRequest describeAnalysisRequest);

    /**
     * <p>
     * Provides a summary of the metadata for an analysis.
     * </p>
     * 
     * @param describeAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisResult> describeAnalysisAsync(DescribeAnalysisRequest describeAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnalysisRequest, DescribeAnalysisResult> asyncHandler);

    /**
     * <p>
     * Provides a detailed description of the definition of an analysis.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of an Analysis, for instance if you are trying to check the
     * status of a recently created or updated Analysis, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeAnalysis.html">
     * <code>DescribeAnalysis</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeAnalysisDefinitionRequest
     * @return A Java Future containing the result of the DescribeAnalysisDefinition operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeAnalysisDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisDefinitionResult> describeAnalysisDefinitionAsync(
            DescribeAnalysisDefinitionRequest describeAnalysisDefinitionRequest);

    /**
     * <p>
     * Provides a detailed description of the definition of an analysis.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of an Analysis, for instance if you are trying to check the
     * status of a recently created or updated Analysis, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeAnalysis.html">
     * <code>DescribeAnalysis</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeAnalysisDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnalysisDefinition operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAnalysisDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisDefinitionResult> describeAnalysisDefinitionAsync(
            DescribeAnalysisDefinitionRequest describeAnalysisDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnalysisDefinitionRequest, DescribeAnalysisDefinitionResult> asyncHandler);

    /**
     * <p>
     * Provides the read and write permissions for an analysis.
     * </p>
     * 
     * @param describeAnalysisPermissionsRequest
     * @return A Java Future containing the result of the DescribeAnalysisPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisPermissionsResult> describeAnalysisPermissionsAsync(
            DescribeAnalysisPermissionsRequest describeAnalysisPermissionsRequest);

    /**
     * <p>
     * Provides the read and write permissions for an analysis.
     * </p>
     * 
     * @param describeAnalysisPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnalysisPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnalysisPermissionsResult> describeAnalysisPermissionsAsync(
            DescribeAnalysisPermissionsRequest describeAnalysisPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnalysisPermissionsRequest, DescribeAnalysisPermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes an existing export job.
     * </p>
     * <p>
     * Poll job descriptions after a job starts to know the status of the job. When a job succeeds, a URL is provided to
     * download the exported assets' data from. Download URLs are valid for five minutes after they are generated. You
     * can call the <code>DescribeAssetBundleExportJob</code> API for a new download URL as needed.
     * </p>
     * <p>
     * Job descriptions are available for 14 days after the job starts.
     * </p>
     * 
     * @param describeAssetBundleExportJobRequest
     * @return A Java Future containing the result of the DescribeAssetBundleExportJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeAssetBundleExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetBundleExportJobResult> describeAssetBundleExportJobAsync(
            DescribeAssetBundleExportJobRequest describeAssetBundleExportJobRequest);

    /**
     * <p>
     * Describes an existing export job.
     * </p>
     * <p>
     * Poll job descriptions after a job starts to know the status of the job. When a job succeeds, a URL is provided to
     * download the exported assets' data from. Download URLs are valid for five minutes after they are generated. You
     * can call the <code>DescribeAssetBundleExportJob</code> API for a new download URL as needed.
     * </p>
     * <p>
     * Job descriptions are available for 14 days after the job starts.
     * </p>
     * 
     * @param describeAssetBundleExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssetBundleExportJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAssetBundleExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetBundleExportJobResult> describeAssetBundleExportJobAsync(
            DescribeAssetBundleExportJobRequest describeAssetBundleExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetBundleExportJobRequest, DescribeAssetBundleExportJobResult> asyncHandler);

    /**
     * <p>
     * Describes an existing import job.
     * </p>
     * <p>
     * Poll job descriptions after starting a job to know when it has succeeded or failed. Job descriptions are
     * available for 14 days after job starts.
     * </p>
     * 
     * @param describeAssetBundleImportJobRequest
     * @return A Java Future containing the result of the DescribeAssetBundleImportJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeAssetBundleImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetBundleImportJobResult> describeAssetBundleImportJobAsync(
            DescribeAssetBundleImportJobRequest describeAssetBundleImportJobRequest);

    /**
     * <p>
     * Describes an existing import job.
     * </p>
     * <p>
     * Poll job descriptions after starting a job to know when it has succeeded or failed. Job descriptions are
     * available for 14 days after job starts.
     * </p>
     * 
     * @param describeAssetBundleImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssetBundleImportJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeAssetBundleImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAssetBundleImportJobResult> describeAssetBundleImportJobAsync(
            DescribeAssetBundleImportJobRequest describeAssetBundleImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssetBundleImportJobRequest, DescribeAssetBundleImportJobResult> asyncHandler);

    /**
     * <p>
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return A Java Future containing the result of the DescribeDashboard operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest describeDashboardRequest);

    /**
     * <p>
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboard operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest describeDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardRequest, DescribeDashboardResult> asyncHandler);

    /**
     * <p>
     * Provides a detailed description of the definition of a dashboard.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of a dashboard, for instance if you are trying to check the
     * status of a recently created or updated dashboard, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeDashboard.html">
     * <code>DescribeDashboard</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeDashboardDefinitionRequest
     * @return A Java Future containing the result of the DescribeDashboardDefinition operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeDashboardDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardDefinitionResult> describeDashboardDefinitionAsync(
            DescribeDashboardDefinitionRequest describeDashboardDefinitionRequest);

    /**
     * <p>
     * Provides a detailed description of the definition of a dashboard.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of a dashboard, for instance if you are trying to check the
     * status of a recently created or updated dashboard, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeDashboard.html">
     * <code>DescribeDashboard</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeDashboardDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboardDefinition operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDashboardDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardDefinitionResult> describeDashboardDefinitionAsync(
            DescribeDashboardDefinitionRequest describeDashboardDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardDefinitionRequest, DescribeDashboardDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @return A Java Future containing the result of the DescribeDashboardPermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardPermissionsResult> describeDashboardPermissionsAsync(
            DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest);

    /**
     * <p>
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboardPermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardPermissionsResult> describeDashboardPermissionsAsync(
            DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardPermissionsRequest, DescribeDashboardPermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes an existing snapshot job.
     * </p>
     * <p>
     * Poll job descriptions after a job starts to know the status of the job. For information on available status
     * codes, see <code>JobStatus</code>.
     * </p>
     * 
     * @param describeDashboardSnapshotJobRequest
     * @return A Java Future containing the result of the DescribeDashboardSnapshotJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeDashboardSnapshotJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardSnapshotJobResult> describeDashboardSnapshotJobAsync(
            DescribeDashboardSnapshotJobRequest describeDashboardSnapshotJobRequest);

    /**
     * <p>
     * Describes an existing snapshot job.
     * </p>
     * <p>
     * Poll job descriptions after a job starts to know the status of the job. For information on available status
     * codes, see <code>JobStatus</code>.
     * </p>
     * 
     * @param describeDashboardSnapshotJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboardSnapshotJob operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDashboardSnapshotJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardSnapshotJobResult> describeDashboardSnapshotJobAsync(
            DescribeDashboardSnapshotJobRequest describeDashboardSnapshotJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardSnapshotJobRequest, DescribeDashboardSnapshotJobResult> asyncHandler);

    /**
     * <p>
     * Describes the result of an existing snapshot job that has finished running.
     * </p>
     * <p>
     * A finished snapshot job will return a <code>COMPLETED</code> or <code>FAILED</code> status when you poll the job
     * with a <code>DescribeDashboardSnapshotJob</code> API call.
     * </p>
     * <p>
     * If the job has not finished running, this operation returns a message that says
     * <code>Dashboard Snapshot Job with id &lt;SnapshotjobId&gt; has not reached a terminal state.</code>.
     * </p>
     * 
     * @param describeDashboardSnapshotJobResultRequest
     * @return A Java Future containing the result of the DescribeDashboardSnapshotJobResult operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeDashboardSnapshotJobResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJobResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardSnapshotJobResultResult> describeDashboardSnapshotJobResultAsync(
            DescribeDashboardSnapshotJobResultRequest describeDashboardSnapshotJobResultRequest);

    /**
     * <p>
     * Describes the result of an existing snapshot job that has finished running.
     * </p>
     * <p>
     * A finished snapshot job will return a <code>COMPLETED</code> or <code>FAILED</code> status when you poll the job
     * with a <code>DescribeDashboardSnapshotJob</code> API call.
     * </p>
     * <p>
     * If the job has not finished running, this operation returns a message that says
     * <code>Dashboard Snapshot Job with id &lt;SnapshotjobId&gt; has not reached a terminal state.</code>.
     * </p>
     * 
     * @param describeDashboardSnapshotJobResultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDashboardSnapshotJobResult operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDashboardSnapshotJobResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJobResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDashboardSnapshotJobResultResult> describeDashboardSnapshotJobResultAsync(
            DescribeDashboardSnapshotJobResultRequest describeDashboardSnapshotJobResultRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDashboardSnapshotJobResultRequest, DescribeDashboardSnapshotJobResultResult> asyncHandler);

    /**
     * <p>
     * Describes a dataset. This operation doesn't support datasets that include uploaded files as a source.
     * </p>
     * 
     * @param describeDataSetRequest
     * @return A Java Future containing the result of the DescribeDataSet operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetResult> describeDataSetAsync(DescribeDataSetRequest describeDataSetRequest);

    /**
     * <p>
     * Describes a dataset. This operation doesn't support datasets that include uploaded files as a source.
     * </p>
     * 
     * @param describeDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSet operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetResult> describeDataSetAsync(DescribeDataSetRequest describeDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSetRequest, DescribeDataSetResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @return A Java Future containing the result of the DescribeDataSetPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetPermissionsResult> describeDataSetPermissionsAsync(
            DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest);

    /**
     * <p>
     * Describes the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSetPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetPermissionsResult> describeDataSetPermissionsAsync(
            DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSetPermissionsRequest, DescribeDataSetPermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes the refresh properties of a dataset.
     * </p>
     * 
     * @param describeDataSetRefreshPropertiesRequest
     * @return A Java Future containing the result of the DescribeDataSetRefreshProperties operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetRefreshPropertiesResult> describeDataSetRefreshPropertiesAsync(
            DescribeDataSetRefreshPropertiesRequest describeDataSetRefreshPropertiesRequest);

    /**
     * <p>
     * Describes the refresh properties of a dataset.
     * </p>
     * 
     * @param describeDataSetRefreshPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSetRefreshProperties operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSetRefreshPropertiesResult> describeDataSetRefreshPropertiesAsync(
            DescribeDataSetRefreshPropertiesRequest describeDataSetRefreshPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSetRefreshPropertiesRequest, DescribeDataSetRefreshPropertiesResult> asyncHandler);

    /**
     * <p>
     * Describes a data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return A Java Future containing the result of the DescribeDataSource operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest describeDataSourceRequest);

    /**
     * <p>
     * Describes a data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest describeDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourceRequest, DescribeDataSourceResult> asyncHandler);

    /**
     * <p>
     * Describes the resource permissions for a data source.
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @return A Java Future containing the result of the DescribeDataSourcePermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourcePermissionsResult> describeDataSourcePermissionsAsync(
            DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest);

    /**
     * <p>
     * Describes the resource permissions for a data source.
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSourcePermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataSourcePermissionsResult> describeDataSourcePermissionsAsync(
            DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcePermissionsRequest, DescribeDataSourcePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes a folder.
     * </p>
     * 
     * @param describeFolderRequest
     * @return A Java Future containing the result of the DescribeFolder operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderResult> describeFolderAsync(DescribeFolderRequest describeFolderRequest);

    /**
     * <p>
     * Describes a folder.
     * </p>
     * 
     * @param describeFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFolder operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderResult> describeFolderAsync(DescribeFolderRequest describeFolderRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFolderRequest, DescribeFolderResult> asyncHandler);

    /**
     * <p>
     * Describes permissions for a folder.
     * </p>
     * 
     * @param describeFolderPermissionsRequest
     * @return A Java Future containing the result of the DescribeFolderPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeFolderPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderPermissionsResult> describeFolderPermissionsAsync(
            DescribeFolderPermissionsRequest describeFolderPermissionsRequest);

    /**
     * <p>
     * Describes permissions for a folder.
     * </p>
     * 
     * @param describeFolderPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFolderPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeFolderPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderPermissionsResult> describeFolderPermissionsAsync(
            DescribeFolderPermissionsRequest describeFolderPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFolderPermissionsRequest, DescribeFolderPermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes the folder resolved permissions. Permissions consists of both folder direct permissions and the
     * inherited permissions from the ancestor folders.
     * </p>
     * 
     * @param describeFolderResolvedPermissionsRequest
     * @return A Java Future containing the result of the DescribeFolderResolvedPermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeFolderResolvedPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderResolvedPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderResolvedPermissionsResult> describeFolderResolvedPermissionsAsync(
            DescribeFolderResolvedPermissionsRequest describeFolderResolvedPermissionsRequest);

    /**
     * <p>
     * Describes the folder resolved permissions. Permissions consists of both folder direct permissions and the
     * inherited permissions from the ancestor folders.
     * </p>
     * 
     * @param describeFolderResolvedPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFolderResolvedPermissions operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeFolderResolvedPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderResolvedPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderResolvedPermissionsResult> describeFolderResolvedPermissionsAsync(
            DescribeFolderResolvedPermissionsRequest describeFolderResolvedPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFolderResolvedPermissionsRequest, DescribeFolderResolvedPermissionsResult> asyncHandler);

    /**
     * <p>
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeGroupRequest
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest);

    /**
     * <p>
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroup operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest describeGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler);

    /**
     * <p>
     * Use the <code>DescribeGroupMembership</code> operation to determine if a user is a member of the specified group.
     * If the user exists and is a member of the specified group, an associated <code>GroupMember</code> object is
     * returned.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @return A Java Future containing the result of the DescribeGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(DescribeGroupMembershipRequest describeGroupMembershipRequest);

    /**
     * <p>
     * Use the <code>DescribeGroupMembership</code> operation to determine if a user is a member of the specified group.
     * If the user exists and is a member of the specified group, an associated <code>GroupMember</code> object is
     * returned.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroupMembership operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupMembershipResult> describeGroupMembershipAsync(DescribeGroupMembershipRequest describeGroupMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupMembershipRequest, DescribeGroupMembershipResult> asyncHandler);

    /**
     * <p>
     * Describes an existing IAM policy assignment, as specified by the assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @return A Java Future containing the result of the DescribeIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIAMPolicyAssignmentResult> describeIAMPolicyAssignmentAsync(
            DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Describes an existing IAM policy assignment, as specified by the assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIAMPolicyAssignmentResult> describeIAMPolicyAssignmentAsync(
            DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIAMPolicyAssignmentRequest, DescribeIAMPolicyAssignmentResult> asyncHandler);

    /**
     * <p>
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @return A Java Future containing the result of the DescribeIngestion operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIngestion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIngestionResult> describeIngestionAsync(DescribeIngestionRequest describeIngestionRequest);

    /**
     * <p>
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIngestion operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIngestion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIngestionResult> describeIngestionAsync(DescribeIngestionRequest describeIngestionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIngestionRequest, DescribeIngestionResult> asyncHandler);

    /**
     * <p>
     * Provides a summary and status of IP rules.
     * </p>
     * 
     * @param describeIpRestrictionRequest
     * @return A Java Future containing the result of the DescribeIpRestriction operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeIpRestriction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIpRestriction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIpRestrictionResult> describeIpRestrictionAsync(DescribeIpRestrictionRequest describeIpRestrictionRequest);

    /**
     * <p>
     * Provides a summary and status of IP rules.
     * </p>
     * 
     * @param describeIpRestrictionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIpRestriction operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeIpRestriction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIpRestriction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIpRestrictionResult> describeIpRestrictionAsync(DescribeIpRestrictionRequest describeIpRestrictionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIpRestrictionRequest, DescribeIpRestrictionResult> asyncHandler);

    /**
     * <p>
     * Describes all customer managed key registrations in a Amazon QuickSight account.
     * </p>
     * 
     * @param describeKeyRegistrationRequest
     * @return A Java Future containing the result of the DescribeKeyRegistration operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeKeyRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeKeyRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyRegistrationResult> describeKeyRegistrationAsync(DescribeKeyRegistrationRequest describeKeyRegistrationRequest);

    /**
     * <p>
     * Describes all customer managed key registrations in a Amazon QuickSight account.
     * </p>
     * 
     * @param describeKeyRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKeyRegistration operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeKeyRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeKeyRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyRegistrationResult> describeKeyRegistrationAsync(DescribeKeyRegistrationRequest describeKeyRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyRegistrationRequest, DescribeKeyRegistrationResult> asyncHandler);

    /**
     * <p>
     * Describes the current namespace.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return A Java Future containing the result of the DescribeNamespace operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest describeNamespaceRequest);

    /**
     * <p>
     * Describes the current namespace.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNamespace operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest describeNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNamespaceRequest, DescribeNamespaceResult> asyncHandler);

    /**
     * <p>
     * Provides a summary of a refresh schedule.
     * </p>
     * 
     * @param describeRefreshScheduleRequest
     * @return A Java Future containing the result of the DescribeRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRefreshScheduleResult> describeRefreshScheduleAsync(DescribeRefreshScheduleRequest describeRefreshScheduleRequest);

    /**
     * <p>
     * Provides a summary of a refresh schedule.
     * </p>
     * 
     * @param describeRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRefreshScheduleResult> describeRefreshScheduleAsync(DescribeRefreshScheduleRequest describeRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRefreshScheduleRequest, DescribeRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Describes all custom permissions that are mapped to a role.
     * </p>
     * 
     * @param describeRoleCustomPermissionRequest
     * @return A Java Future containing the result of the DescribeRoleCustomPermission operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoleCustomPermissionResult> describeRoleCustomPermissionAsync(
            DescribeRoleCustomPermissionRequest describeRoleCustomPermissionRequest);

    /**
     * <p>
     * Describes all custom permissions that are mapped to a role.
     * </p>
     * 
     * @param describeRoleCustomPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRoleCustomPermission operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoleCustomPermissionResult> describeRoleCustomPermissionAsync(
            DescribeRoleCustomPermissionRequest describeRoleCustomPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRoleCustomPermissionRequest, DescribeRoleCustomPermissionResult> asyncHandler);

    /**
     * <p>
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @return A Java Future containing the result of the DescribeTemplate operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateResult> describeTemplateAsync(DescribeTemplateRequest describeTemplateRequest);

    /**
     * <p>
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTemplate operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateResult> describeTemplateAsync(DescribeTemplateRequest describeTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTemplateRequest, DescribeTemplateResult> asyncHandler);

    /**
     * <p>
     * Describes the template alias for a template.
     * </p>
     * 
     * @param describeTemplateAliasRequest
     * @return A Java Future containing the result of the DescribeTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateAliasResult> describeTemplateAliasAsync(DescribeTemplateAliasRequest describeTemplateAliasRequest);

    /**
     * <p>
     * Describes the template alias for a template.
     * </p>
     * 
     * @param describeTemplateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateAliasResult> describeTemplateAliasAsync(DescribeTemplateAliasRequest describeTemplateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTemplateAliasRequest, DescribeTemplateAliasResult> asyncHandler);

    /**
     * <p>
     * Provides a detailed description of the definition of a template.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of a template, for instance if you are trying to check the
     * status of a recently created or updated template, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeTemplate.html">
     * <code>DescribeTemplate</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeTemplateDefinitionRequest
     * @return A Java Future containing the result of the DescribeTemplateDefinition operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTemplateDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateDefinitionResult> describeTemplateDefinitionAsync(
            DescribeTemplateDefinitionRequest describeTemplateDefinitionRequest);

    /**
     * <p>
     * Provides a detailed description of the definition of a template.
     * </p>
     * <note>
     * <p>
     * If you do not need to know details about the content of a template, for instance if you are trying to check the
     * status of a recently created or updated template, use the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_DescribeTemplate.html">
     * <code>DescribeTemplate</code> </a> instead.
     * </p>
     * </note>
     * 
     * @param describeTemplateDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTemplateDefinition operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTemplateDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplateDefinitionResult> describeTemplateDefinitionAsync(
            DescribeTemplateDefinitionRequest describeTemplateDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTemplateDefinitionRequest, DescribeTemplateDefinitionResult> asyncHandler);

    /**
     * <p>
     * Describes read and write permissions on a template.
     * </p>
     * 
     * @param describeTemplatePermissionsRequest
     * @return A Java Future containing the result of the DescribeTemplatePermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplatePermissionsResult> describeTemplatePermissionsAsync(
            DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest);

    /**
     * <p>
     * Describes read and write permissions on a template.
     * </p>
     * 
     * @param describeTemplatePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTemplatePermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTemplatePermissionsResult> describeTemplatePermissionsAsync(
            DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTemplatePermissionsRequest, DescribeTemplatePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes a theme.
     * </p>
     * 
     * @param describeThemeRequest
     * @return A Java Future containing the result of the DescribeTheme operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemeResult> describeThemeAsync(DescribeThemeRequest describeThemeRequest);

    /**
     * <p>
     * Describes a theme.
     * </p>
     * 
     * @param describeThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTheme operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemeResult> describeThemeAsync(DescribeThemeRequest describeThemeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThemeRequest, DescribeThemeResult> asyncHandler);

    /**
     * <p>
     * Describes the alias for a theme.
     * </p>
     * 
     * @param describeThemeAliasRequest
     * @return A Java Future containing the result of the DescribeThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemeAliasResult> describeThemeAliasAsync(DescribeThemeAliasRequest describeThemeAliasRequest);

    /**
     * <p>
     * Describes the alias for a theme.
     * </p>
     * 
     * @param describeThemeAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemeAliasResult> describeThemeAliasAsync(DescribeThemeAliasRequest describeThemeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThemeAliasRequest, DescribeThemeAliasResult> asyncHandler);

    /**
     * <p>
     * Describes the read and write permissions for a theme.
     * </p>
     * 
     * @param describeThemePermissionsRequest
     * @return A Java Future containing the result of the DescribeThemePermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemePermissionsResult> describeThemePermissionsAsync(DescribeThemePermissionsRequest describeThemePermissionsRequest);

    /**
     * <p>
     * Describes the read and write permissions for a theme.
     * </p>
     * 
     * @param describeThemePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeThemePermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeThemePermissionsResult> describeThemePermissionsAsync(DescribeThemePermissionsRequest describeThemePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeThemePermissionsRequest, DescribeThemePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes a topic.
     * </p>
     * 
     * @param describeTopicRequest
     * @return A Java Future containing the result of the DescribeTopic operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicResult> describeTopicAsync(DescribeTopicRequest describeTopicRequest);

    /**
     * <p>
     * Describes a topic.
     * </p>
     * 
     * @param describeTopicRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopic operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicResult> describeTopicAsync(DescribeTopicRequest describeTopicRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicRequest, DescribeTopicResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions of a topic.
     * </p>
     * 
     * @param describeTopicPermissionsRequest
     * @return A Java Future containing the result of the DescribeTopicPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTopicPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicPermissionsResult> describeTopicPermissionsAsync(DescribeTopicPermissionsRequest describeTopicPermissionsRequest);

    /**
     * <p>
     * Describes the permissions of a topic.
     * </p>
     * 
     * @param describeTopicPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopicPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTopicPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicPermissionsResult> describeTopicPermissionsAsync(DescribeTopicPermissionsRequest describeTopicPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicPermissionsRequest, DescribeTopicPermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes the status of a topic refresh.
     * </p>
     * 
     * @param describeTopicRefreshRequest
     * @return A Java Future containing the result of the DescribeTopicRefresh operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeTopicRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicRefreshResult> describeTopicRefreshAsync(DescribeTopicRefreshRequest describeTopicRefreshRequest);

    /**
     * <p>
     * Describes the status of a topic refresh.
     * </p>
     * 
     * @param describeTopicRefreshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopicRefresh operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTopicRefresh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefresh"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicRefreshResult> describeTopicRefreshAsync(DescribeTopicRefreshRequest describeTopicRefreshRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicRefreshRequest, DescribeTopicRefreshResult> asyncHandler);

    /**
     * <p>
     * Deletes a topic refresh schedule.
     * </p>
     * 
     * @param describeTopicRefreshScheduleRequest
     * @return A Java Future containing the result of the DescribeTopicRefreshSchedule operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.DescribeTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicRefreshScheduleResult> describeTopicRefreshScheduleAsync(
            DescribeTopicRefreshScheduleRequest describeTopicRefreshScheduleRequest);

    /**
     * <p>
     * Deletes a topic refresh schedule.
     * </p>
     * 
     * @param describeTopicRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTopicRefreshSchedule operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.DescribeTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTopicRefreshScheduleResult> describeTopicRefreshScheduleAsync(
            DescribeTopicRefreshScheduleRequest describeTopicRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTopicRefreshScheduleRequest, DescribeTopicRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * <p>
     * Describes a VPC connection.
     * </p>
     * 
     * @param describeVPCConnectionRequest
     * @return A Java Future containing the result of the DescribeVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsync.DescribeVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeVPCConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVPCConnectionResult> describeVPCConnectionAsync(DescribeVPCConnectionRequest describeVPCConnectionRequest);

    /**
     * <p>
     * Describes a VPC connection.
     * </p>
     * 
     * @param describeVPCConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.DescribeVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeVPCConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVPCConnectionResult> describeVPCConnectionAsync(DescribeVPCConnectionRequest describeVPCConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVPCConnectionRequest, DescribeVPCConnectionResult> asyncHandler);

    /**
     * <p>
     * Generates an embed URL that you can use to embed an Amazon QuickSight dashboard or visual in your website,
     * without having to register any reader users. Before you use this action, make sure that you have configured the
     * dashboards and permissions.
     * </p>
     * <p>
     * The following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this
     * period, it cannot be re-used again.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL validity period should not be confused with the actual session lifetime that can be customized using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForAnonymousUser.html#QS-GenerateEmbedUrlForAnonymousUser-request-SessionLifetimeInMinutes">SessionLifetimeInMinutes</a> </code>
     * parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default
     * session duration is 10 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedded Analytics</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param generateEmbedUrlForAnonymousUserRequest
     * @return A Java Future containing the result of the GenerateEmbedUrlForAnonymousUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.GenerateEmbedUrlForAnonymousUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForAnonymousUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateEmbedUrlForAnonymousUserResult> generateEmbedUrlForAnonymousUserAsync(
            GenerateEmbedUrlForAnonymousUserRequest generateEmbedUrlForAnonymousUserRequest);

    /**
     * <p>
     * Generates an embed URL that you can use to embed an Amazon QuickSight dashboard or visual in your website,
     * without having to register any reader users. Before you use this action, make sure that you have configured the
     * dashboards and permissions.
     * </p>
     * <p>
     * The following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this
     * period, it cannot be re-used again.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL validity period should not be confused with the actual session lifetime that can be customized using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForAnonymousUser.html#QS-GenerateEmbedUrlForAnonymousUser-request-SessionLifetimeInMinutes">SessionLifetimeInMinutes</a> </code>
     * parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default
     * session duration is 10 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedded Analytics</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param generateEmbedUrlForAnonymousUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateEmbedUrlForAnonymousUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.GenerateEmbedUrlForAnonymousUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForAnonymousUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateEmbedUrlForAnonymousUserResult> generateEmbedUrlForAnonymousUserAsync(
            GenerateEmbedUrlForAnonymousUserRequest generateEmbedUrlForAnonymousUserRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateEmbedUrlForAnonymousUserRequest, GenerateEmbedUrlForAnonymousUserResult> asyncHandler);

    /**
     * <p>
     * Generates an embed URL that you can use to embed an Amazon QuickSight experience in your website. This action can
     * be used for any type of user registered in an Amazon QuickSight account. Before you use this action, make sure
     * that you have configured the relevant Amazon QuickSight resource and permissions.
     * </p>
     * <p>
     * The following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this
     * period, it cannot be re-used again.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL validity period should not be confused with the actual session lifetime that can be customized using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html#QS-GenerateEmbedUrlForRegisteredUser-request-SessionLifetimeInMinutes">SessionLifetimeInMinutes</a> </code>
     * parameter.
     * </p>
     * <p>
     * The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration
     * is 10 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedded Analytics</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param generateEmbedUrlForRegisteredUserRequest
     * @return A Java Future containing the result of the GenerateEmbedUrlForRegisteredUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.GenerateEmbedUrlForRegisteredUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForRegisteredUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateEmbedUrlForRegisteredUserResult> generateEmbedUrlForRegisteredUserAsync(
            GenerateEmbedUrlForRegisteredUserRequest generateEmbedUrlForRegisteredUserRequest);

    /**
     * <p>
     * Generates an embed URL that you can use to embed an Amazon QuickSight experience in your website. This action can
     * be used for any type of user registered in an Amazon QuickSight account. Before you use this action, make sure
     * that you have configured the relevant Amazon QuickSight resource and permissions.
     * </p>
     * <p>
     * The following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this
     * period, it cannot be re-used again.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL validity period should not be confused with the actual session lifetime that can be customized using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_GenerateEmbedUrlForRegisteredUser.html#QS-GenerateEmbedUrlForRegisteredUser-request-SessionLifetimeInMinutes">SessionLifetimeInMinutes</a> </code>
     * parameter.
     * </p>
     * <p>
     * The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration
     * is 10 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedded Analytics</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param generateEmbedUrlForRegisteredUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateEmbedUrlForRegisteredUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.GenerateEmbedUrlForRegisteredUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForRegisteredUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateEmbedUrlForRegisteredUserResult> generateEmbedUrlForRegisteredUserAsync(
            GenerateEmbedUrlForRegisteredUserRequest generateEmbedUrlForRegisteredUserRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateEmbedUrlForRegisteredUserRequest, GenerateEmbedUrlForRegisteredUserResult> asyncHandler);

    /**
     * <p>
     * Generates a temporary session URL and authorization code(bearer token) that you can use to embed an Amazon
     * QuickSight read-only dashboard in your website or application. Before you use this command, make sure that you
     * have configured the dashboards and permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user's browser. The
     * following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * They must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * They can be used one time only.
     * </p>
     * </li>
     * <li>
     * <p>
     * They are valid for 5 minutes after you run this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resulting user session is valid for 15 minutes (default) up to 10 hours (maximum). You can use the optional
     * <code>SessionLifetimeInMinutes</code> parameter to customize session duration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-deprecated.html">Embedding Analytics
     * Using GetDashboardEmbedUrl</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param getDashboardEmbedUrlRequest
     * @return A Java Future containing the result of the GetDashboardEmbedUrl operation returned by the service.
     * @sample AmazonQuickSightAsync.GetDashboardEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest);

    /**
     * <p>
     * Generates a temporary session URL and authorization code(bearer token) that you can use to embed an Amazon
     * QuickSight read-only dashboard in your website or application. Before you use this command, make sure that you
     * have configured the dashboards and permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user's browser. The
     * following rules apply to the generated URL:
     * </p>
     * <ul>
     * <li>
     * <p>
     * They must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * They can be used one time only.
     * </p>
     * </li>
     * <li>
     * <p>
     * They are valid for 5 minutes after you run this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are charged only when the URL is used or there is interaction with Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resulting user session is valid for 15 minutes (default) up to 10 hours (maximum). You can use the optional
     * <code>SessionLifetimeInMinutes</code> parameter to customize session duration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics-deprecated.html">Embedding Analytics
     * Using GetDashboardEmbedUrl</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * For more information about the high-level steps for embedding and for an interactive demo of the ways you can
     * customize embedding, visit the <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/quicksight-dev-portal.html">Amazon QuickSight Developer
     * Portal</a>.
     * </p>
     * 
     * @param getDashboardEmbedUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDashboardEmbedUrl operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.GetDashboardEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetDashboardEmbedUrlRequest, GetDashboardEmbedUrlResult> asyncHandler);

    /**
     * <p>
     * Generates a session URL and authorization code that you can use to embed the Amazon Amazon QuickSight console in
     * your web server code. Use <code>GetSessionEmbedUrl</code> where you want to provide an authoring portal that
     * allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded Amazon
     * QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to
     * some of these features, add a custom permissions profile to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedding Analytics</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getSessionEmbedUrlRequest
     * @return A Java Future containing the result of the GetSessionEmbedUrl operation returned by the service.
     * @sample AmazonQuickSightAsync.GetSessionEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetSessionEmbedUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSessionEmbedUrlResult> getSessionEmbedUrlAsync(GetSessionEmbedUrlRequest getSessionEmbedUrlRequest);

    /**
     * <p>
     * Generates a session URL and authorization code that you can use to embed the Amazon Amazon QuickSight console in
     * your web server code. Use <code>GetSessionEmbedUrl</code> where you want to provide an authoring portal that
     * allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded Amazon
     * QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to
     * some of these features, add a custom permissions profile to the user with the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateUser.html">UpdateUser</a> </code>
     * API operation. Use
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_RegisterUser.html">RegisterUser</a> </code>
     * API operation to add a new user with a custom permission profile attached. For more information, see the
     * following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/quicksight/latest/user/embedded-analytics.html">Embedding Analytics</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/customizing-permissions-to-the-quicksight-console.html"
     * >Customizing Access to the Amazon QuickSight Console</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getSessionEmbedUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSessionEmbedUrl operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.GetSessionEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetSessionEmbedUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSessionEmbedUrlResult> getSessionEmbedUrlAsync(GetSessionEmbedUrlRequest getSessionEmbedUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionEmbedUrlRequest, GetSessionEmbedUrlResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon QuickSight analyses that exist in the specified Amazon Web Services account.
     * </p>
     * 
     * @param listAnalysesRequest
     * @return A Java Future containing the result of the ListAnalyses operation returned by the service.
     * @sample AmazonQuickSightAsync.ListAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAnalysesResult> listAnalysesAsync(ListAnalysesRequest listAnalysesRequest);

    /**
     * <p>
     * Lists Amazon QuickSight analyses that exist in the specified Amazon Web Services account.
     * </p>
     * 
     * @param listAnalysesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnalyses operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAnalysesResult> listAnalysesAsync(ListAnalysesRequest listAnalysesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnalysesRequest, ListAnalysesResult> asyncHandler);

    /**
     * <p>
     * Lists all asset bundle export jobs that have been taken place in the last 14 days. Jobs created more than 14 days
     * ago are deleted forever and are not returned. If you are using the same job ID for multiple jobs,
     * <code>ListAssetBundleExportJobs</code> only returns the most recent job that uses the repeated job ID.
     * </p>
     * 
     * @param listAssetBundleExportJobsRequest
     * @return A Java Future containing the result of the ListAssetBundleExportJobs operation returned by the service.
     * @sample AmazonQuickSightAsync.ListAssetBundleExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAssetBundleExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetBundleExportJobsResult> listAssetBundleExportJobsAsync(
            ListAssetBundleExportJobsRequest listAssetBundleExportJobsRequest);

    /**
     * <p>
     * Lists all asset bundle export jobs that have been taken place in the last 14 days. Jobs created more than 14 days
     * ago are deleted forever and are not returned. If you are using the same job ID for multiple jobs,
     * <code>ListAssetBundleExportJobs</code> only returns the most recent job that uses the repeated job ID.
     * </p>
     * 
     * @param listAssetBundleExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetBundleExportJobs operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListAssetBundleExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAssetBundleExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetBundleExportJobsResult> listAssetBundleExportJobsAsync(
            ListAssetBundleExportJobsRequest listAssetBundleExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetBundleExportJobsRequest, ListAssetBundleExportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all asset bundle import jobs that have taken place in the last 14 days. Jobs created more than 14 days ago
     * are deleted forever and are not returned. If you are using the same job ID for multiple jobs,
     * <code>ListAssetBundleImportJobs</code> only returns the most recent job that uses the repeated job ID.
     * </p>
     * 
     * @param listAssetBundleImportJobsRequest
     * @return A Java Future containing the result of the ListAssetBundleImportJobs operation returned by the service.
     * @sample AmazonQuickSightAsync.ListAssetBundleImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAssetBundleImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetBundleImportJobsResult> listAssetBundleImportJobsAsync(
            ListAssetBundleImportJobsRequest listAssetBundleImportJobsRequest);

    /**
     * <p>
     * Lists all asset bundle import jobs that have taken place in the last 14 days. Jobs created more than 14 days ago
     * are deleted forever and are not returned. If you are using the same job ID for multiple jobs,
     * <code>ListAssetBundleImportJobs</code> only returns the most recent job that uses the repeated job ID.
     * </p>
     * 
     * @param listAssetBundleImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssetBundleImportJobs operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListAssetBundleImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAssetBundleImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssetBundleImportJobsResult> listAssetBundleImportJobsAsync(
            ListAssetBundleImportJobsRequest listAssetBundleImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetBundleImportJobsRequest, ListAssetBundleImportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all the versions of the dashboards in the Amazon QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @return A Java Future containing the result of the ListDashboardVersions operation returned by the service.
     * @sample AmazonQuickSightAsync.ListDashboardVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboardVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardVersionsResult> listDashboardVersionsAsync(ListDashboardVersionsRequest listDashboardVersionsRequest);

    /**
     * <p>
     * Lists all the versions of the dashboards in the Amazon QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDashboardVersions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListDashboardVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboardVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardVersionsResult> listDashboardVersionsAsync(ListDashboardVersionsRequest listDashboardVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDashboardVersionsRequest, ListDashboardVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists dashboards in an Amazon Web Services account.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AmazonQuickSightAsync.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest);

    /**
     * <p>
     * Lists dashboards in an Amazon Web Services account.
     * </p>
     * 
     * @param listDashboardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDashboards operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the datasets belonging to the current Amazon Web Services account in an Amazon Web Services Region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AmazonQuickSightAsync.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest);

    /**
     * <p>
     * Lists all of the datasets belonging to the current Amazon Web Services account in an Amazon Web Services Region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler);

    /**
     * <p>
     * Lists data sources in current Amazon Web Services Region that belong to this Amazon Web Services account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AmazonQuickSightAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Lists data sources in current Amazon Web Services Region that belong to this Amazon Web Services account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * List all assets (<code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>) in a folder.
     * </p>
     * 
     * @param listFolderMembersRequest
     * @return A Java Future containing the result of the ListFolderMembers operation returned by the service.
     * @sample AmazonQuickSightAsync.ListFolderMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListFolderMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFolderMembersResult> listFolderMembersAsync(ListFolderMembersRequest listFolderMembersRequest);

    /**
     * <p>
     * List all assets (<code>DASHBOARD</code>, <code>ANALYSIS</code>, and <code>DATASET</code>) in a folder.
     * </p>
     * 
     * @param listFolderMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFolderMembers operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListFolderMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListFolderMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFolderMembersResult> listFolderMembersAsync(ListFolderMembersRequest listFolderMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFolderMembersRequest, ListFolderMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all folders in an account.
     * </p>
     * 
     * @param listFoldersRequest
     * @return A Java Future containing the result of the ListFolders operation returned by the service.
     * @sample AmazonQuickSightAsync.ListFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListFolders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFoldersResult> listFoldersAsync(ListFoldersRequest listFoldersRequest);

    /**
     * <p>
     * Lists all folders in an account.
     * </p>
     * 
     * @param listFoldersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFolders operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListFolders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFoldersResult> listFoldersAsync(ListFoldersRequest listFoldersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFoldersRequest, ListFoldersResult> asyncHandler);

    /**
     * <p>
     * Lists member users in a group.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return A Java Future containing the result of the ListGroupMemberships operation returned by the service.
     * @sample AmazonQuickSightAsync.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest listGroupMembershipsRequest);

    /**
     * <p>
     * Lists member users in a group.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupMemberships operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest listGroupMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsRequest, ListGroupMembershipsResult> asyncHandler);

    /**
     * <p>
     * Lists all user groups in Amazon QuickSight.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonQuickSightAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists all user groups in Amazon QuickSight.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @return A Java Future containing the result of the ListIAMPolicyAssignments operation returned by the service.
     * @sample AmazonQuickSightAsync.ListIAMPolicyAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIAMPolicyAssignmentsResult> listIAMPolicyAssignmentsAsync(ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest);

    /**
     * <p>
     * Lists the IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIAMPolicyAssignments operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListIAMPolicyAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIAMPolicyAssignmentsResult> listIAMPolicyAssignmentsAsync(ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIAMPolicyAssignmentsRequest, ListIAMPolicyAssignmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the IAM policy assignments, including the Amazon Resource Names (ARNs), for the IAM policies
     * assigned to the specified user and group, or groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @return A Java Future containing the result of the ListIAMPolicyAssignmentsForUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.ListIAMPolicyAssignmentsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignmentsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIAMPolicyAssignmentsForUserResult> listIAMPolicyAssignmentsForUserAsync(
            ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest);

    /**
     * <p>
     * Lists all of the IAM policy assignments, including the Amazon Resource Names (ARNs), for the IAM policies
     * assigned to the specified user and group, or groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIAMPolicyAssignmentsForUser operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.ListIAMPolicyAssignmentsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignmentsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIAMPolicyAssignmentsForUserResult> listIAMPolicyAssignmentsForUserAsync(
            ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListIAMPolicyAssignmentsForUserRequest, ListIAMPolicyAssignmentsForUserResult> asyncHandler);

    /**
     * <p>
     * Lists all services and authorized targets that the Amazon QuickSight IAM Identity Center application can access.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts that use IAM Identity Center.
     * </p>
     * 
     * @param listIdentityPropagationConfigsRequest
     * @return A Java Future containing the result of the ListIdentityPropagationConfigs operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.ListIdentityPropagationConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIdentityPropagationConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPropagationConfigsResult> listIdentityPropagationConfigsAsync(
            ListIdentityPropagationConfigsRequest listIdentityPropagationConfigsRequest);

    /**
     * <p>
     * Lists all services and authorized targets that the Amazon QuickSight IAM Identity Center application can access.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts that use IAM Identity Center.
     * </p>
     * 
     * @param listIdentityPropagationConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityPropagationConfigs operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.ListIdentityPropagationConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIdentityPropagationConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityPropagationConfigsResult> listIdentityPropagationConfigsAsync(
            ListIdentityPropagationConfigsRequest listIdentityPropagationConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPropagationConfigsRequest, ListIdentityPropagationConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return A Java Future containing the result of the ListIngestions operation returned by the service.
     * @sample AmazonQuickSightAsync.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest listIngestionsRequest);

    /**
     * <p>
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngestions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest listIngestionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngestionsRequest, ListIngestionsResult> asyncHandler);

    /**
     * <p>
     * Lists the namespaces for the specified Amazon Web Services account. This operation doesn't list deleted
     * namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AmazonQuickSightAsync.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListNamespaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Lists the namespaces for the specified Amazon Web Services account. This operation doesn't list deleted
     * namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListNamespaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler);

    /**
     * <p>
     * Lists the refresh schedules of a dataset. Each dataset can have up to 5 schedules.
     * </p>
     * 
     * @param listRefreshSchedulesRequest
     * @return A Java Future containing the result of the ListRefreshSchedules operation returned by the service.
     * @sample AmazonQuickSightAsync.ListRefreshSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListRefreshSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRefreshSchedulesResult> listRefreshSchedulesAsync(ListRefreshSchedulesRequest listRefreshSchedulesRequest);

    /**
     * <p>
     * Lists the refresh schedules of a dataset. Each dataset can have up to 5 schedules.
     * </p>
     * 
     * @param listRefreshSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRefreshSchedules operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListRefreshSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListRefreshSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRefreshSchedulesResult> listRefreshSchedulesAsync(ListRefreshSchedulesRequest listRefreshSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRefreshSchedulesRequest, ListRefreshSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists all groups that are associated with a role.
     * </p>
     * 
     * @param listRoleMembershipsRequest
     * @return A Java Future containing the result of the ListRoleMemberships operation returned by the service.
     * @sample AmazonQuickSightAsync.ListRoleMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListRoleMemberships" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRoleMembershipsResult> listRoleMembershipsAsync(ListRoleMembershipsRequest listRoleMembershipsRequest);

    /**
     * <p>
     * Lists all groups that are associated with a role.
     * </p>
     * 
     * @param listRoleMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoleMemberships operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListRoleMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListRoleMemberships" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRoleMembershipsResult> listRoleMembershipsAsync(ListRoleMembershipsRequest listRoleMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoleMembershipsRequest, ListRoleMembershipsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all the aliases of a template.
     * </p>
     * 
     * @param listTemplateAliasesRequest
     * @return A Java Future containing the result of the ListTemplateAliases operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTemplateAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateAliasesResult> listTemplateAliasesAsync(ListTemplateAliasesRequest listTemplateAliasesRequest);

    /**
     * <p>
     * Lists all the aliases of a template.
     * </p>
     * 
     * @param listTemplateAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateAliases operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTemplateAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateAliasesResult> listTemplateAliasesAsync(ListTemplateAliasesRequest listTemplateAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateAliasesRequest, ListTemplateAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists all the versions of the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return A Java Future containing the result of the ListTemplateVersions operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(ListTemplateVersionsRequest listTemplateVersionsRequest);

    /**
     * <p>
     * Lists all the versions of the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateVersions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(ListTemplateVersionsRequest listTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateVersionsRequest, ListTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists all the aliases of a theme.
     * </p>
     * 
     * @param listThemeAliasesRequest
     * @return A Java Future containing the result of the ListThemeAliases operation returned by the service.
     * @sample AmazonQuickSightAsync.ListThemeAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemeAliasesResult> listThemeAliasesAsync(ListThemeAliasesRequest listThemeAliasesRequest);

    /**
     * <p>
     * Lists all the aliases of a theme.
     * </p>
     * 
     * @param listThemeAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThemeAliases operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListThemeAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemeAliasesResult> listThemeAliasesAsync(ListThemeAliasesRequest listThemeAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListThemeAliasesRequest, ListThemeAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists all the versions of the themes in the current Amazon Web Services account.
     * </p>
     * 
     * @param listThemeVersionsRequest
     * @return A Java Future containing the result of the ListThemeVersions operation returned by the service.
     * @sample AmazonQuickSightAsync.ListThemeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemeVersionsResult> listThemeVersionsAsync(ListThemeVersionsRequest listThemeVersionsRequest);

    /**
     * <p>
     * Lists all the versions of the themes in the current Amazon Web Services account.
     * </p>
     * 
     * @param listThemeVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThemeVersions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListThemeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThemeVersionsResult> listThemeVersionsAsync(ListThemeVersionsRequest listThemeVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThemeVersionsRequest, ListThemeVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists all the themes in the current Amazon Web Services account.
     * </p>
     * 
     * @param listThemesRequest
     * @return A Java Future containing the result of the ListThemes operation returned by the service.
     * @sample AmazonQuickSightAsync.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest listThemesRequest);

    /**
     * <p>
     * Lists all the themes in the current Amazon Web Services account.
     * </p>
     * 
     * @param listThemesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThemes operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest listThemesRequest,
            com.amazonaws.handlers.AsyncHandler<ListThemesRequest, ListThemesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the refresh schedules for a topic.
     * </p>
     * 
     * @param listTopicRefreshSchedulesRequest
     * @return A Java Future containing the result of the ListTopicRefreshSchedules operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTopicRefreshSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTopicRefreshSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicRefreshSchedulesResult> listTopicRefreshSchedulesAsync(
            ListTopicRefreshSchedulesRequest listTopicRefreshSchedulesRequest);

    /**
     * <p>
     * Lists all of the refresh schedules for a topic.
     * </p>
     * 
     * @param listTopicRefreshSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopicRefreshSchedules operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTopicRefreshSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTopicRefreshSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTopicRefreshSchedulesResult> listTopicRefreshSchedulesAsync(
            ListTopicRefreshSchedulesRequest listTopicRefreshSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicRefreshSchedulesRequest, ListTopicRefreshSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the topics within an account.
     * </p>
     * 
     * @param listTopicsRequest
     * @return A Java Future containing the result of the ListTopics operation returned by the service.
     * @sample AmazonQuickSightAsync.ListTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest);

    /**
     * <p>
     * Lists all of the topics within an account.
     * </p>
     * 
     * @param listTopicsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTopics operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(ListTopicsRequest listTopicsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @return A Java Future containing the result of the ListUserGroups operation returned by the service.
     * @sample AmazonQuickSightAsync.ListUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUserGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(ListUserGroupsRequest listUserGroupsRequest);

    /**
     * <p>
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserGroups operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUserGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(ListUserGroupsRequest listUserGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserGroupsRequest, ListUserGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of the Amazon QuickSight users belonging to this account.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonQuickSightAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Returns a list of all of the Amazon QuickSight users belonging to this account.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists all of the VPC connections in the current set Amazon Web Services Region of an Amazon Web Services account.
     * </p>
     * 
     * @param listVPCConnectionsRequest
     * @return A Java Future containing the result of the ListVPCConnections operation returned by the service.
     * @sample AmazonQuickSightAsync.ListVPCConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListVPCConnections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCConnectionsResult> listVPCConnectionsAsync(ListVPCConnectionsRequest listVPCConnectionsRequest);

    /**
     * <p>
     * Lists all of the VPC connections in the current set Amazon Web Services Region of an Amazon Web Services account.
     * </p>
     * 
     * @param listVPCConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVPCConnections operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.ListVPCConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListVPCConnections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCConnectionsResult> listVPCConnectionsAsync(ListVPCConnectionsRequest listVPCConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVPCConnectionsRequest, ListVPCConnectionsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the dataset refresh properties for the dataset.
     * </p>
     * 
     * @param putDataSetRefreshPropertiesRequest
     * @return A Java Future containing the result of the PutDataSetRefreshProperties operation returned by the service.
     * @sample AmazonQuickSightAsync.PutDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PutDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataSetRefreshPropertiesResult> putDataSetRefreshPropertiesAsync(
            PutDataSetRefreshPropertiesRequest putDataSetRefreshPropertiesRequest);

    /**
     * <p>
     * Creates or updates the dataset refresh properties for the dataset.
     * </p>
     * 
     * @param putDataSetRefreshPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDataSetRefreshProperties operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.PutDataSetRefreshProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PutDataSetRefreshProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataSetRefreshPropertiesResult> putDataSetRefreshPropertiesAsync(
            PutDataSetRefreshPropertiesRequest putDataSetRefreshPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<PutDataSetRefreshPropertiesRequest, PutDataSetRefreshPropertiesResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon QuickSight user whose identity is associated with the Identity and Access Management (IAM)
     * identity or role specified in the request. When you register a new user from the Amazon QuickSight API, Amazon
     * QuickSight generates a registration URL. The user accesses this registration URL to create their account. Amazon
     * QuickSight doesn't send a registration email to users who are registered from the Amazon QuickSight API. If you
     * want new users to receive a registration email, then add those users in the Amazon QuickSight console. For more
     * information on registering a new user in the Amazon QuickSight console, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/managing-users.html#inviting-users"> Inviting users to
     * access Amazon QuickSight</a>.
     * </p>
     * 
     * @param registerUserRequest
     * @return A Java Future containing the result of the RegisterUser operation returned by the service.
     * @sample AmazonQuickSightAsync.RegisterUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterUserResult> registerUserAsync(RegisterUserRequest registerUserRequest);

    /**
     * <p>
     * Creates an Amazon QuickSight user whose identity is associated with the Identity and Access Management (IAM)
     * identity or role specified in the request. When you register a new user from the Amazon QuickSight API, Amazon
     * QuickSight generates a registration URL. The user accesses this registration URL to create their account. Amazon
     * QuickSight doesn't send a registration email to users who are registered from the Amazon QuickSight API. If you
     * want new users to receive a registration email, then add those users in the Amazon QuickSight console. For more
     * information on registering a new user in the Amazon QuickSight console, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/managing-users.html#inviting-users"> Inviting users to
     * access Amazon QuickSight</a>.
     * </p>
     * 
     * @param registerUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterUser operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.RegisterUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterUserResult> registerUserAsync(RegisterUserRequest registerUserRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterUserRequest, RegisterUserResult> asyncHandler);

    /**
     * <p>
     * Restores an analysis.
     * </p>
     * 
     * @param restoreAnalysisRequest
     * @return A Java Future containing the result of the RestoreAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsync.RestoreAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RestoreAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreAnalysisResult> restoreAnalysisAsync(RestoreAnalysisRequest restoreAnalysisRequest);

    /**
     * <p>
     * Restores an analysis.
     * </p>
     * 
     * @param restoreAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.RestoreAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RestoreAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreAnalysisResult> restoreAnalysisAsync(RestoreAnalysisRequest restoreAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreAnalysisRequest, RestoreAnalysisResult> asyncHandler);

    /**
     * <p>
     * Searches for analyses that belong to the user specified in the filter.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param searchAnalysesRequest
     * @return A Java Future containing the result of the SearchAnalyses operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchAnalysesResult> searchAnalysesAsync(SearchAnalysesRequest searchAnalysesRequest);

    /**
     * <p>
     * Searches for analyses that belong to the user specified in the filter.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param searchAnalysesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAnalyses operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchAnalysesResult> searchAnalysesAsync(SearchAnalysesRequest searchAnalysesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAnalysesRequest, SearchAnalysesResult> asyncHandler);

    /**
     * <p>
     * Searches for dashboards that belong to a user.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param searchDashboardsRequest
     * @return A Java Future containing the result of the SearchDashboards operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDashboardsResult> searchDashboardsAsync(SearchDashboardsRequest searchDashboardsRequest);

    /**
     * <p>
     * Searches for dashboards that belong to a user.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not reflect very recent updates and
     * changes.
     * </p>
     * </note>
     * 
     * @param searchDashboardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDashboards operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDashboardsResult> searchDashboardsAsync(SearchDashboardsRequest searchDashboardsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDashboardsRequest, SearchDashboardsResult> asyncHandler);

    /**
     * <p>
     * Use the <code>SearchDataSets</code> operation to search for datasets that belong to an account.
     * </p>
     * 
     * @param searchDataSetsRequest
     * @return A Java Future containing the result of the SearchDataSets operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchDataSetsResult> searchDataSetsAsync(SearchDataSetsRequest searchDataSetsRequest);

    /**
     * <p>
     * Use the <code>SearchDataSets</code> operation to search for datasets that belong to an account.
     * </p>
     * 
     * @param searchDataSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDataSets operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchDataSetsResult> searchDataSetsAsync(SearchDataSetsRequest searchDataSetsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDataSetsRequest, SearchDataSetsResult> asyncHandler);

    /**
     * <p>
     * Use the <code>SearchDataSources</code> operation to search for data sources that belong to an account.
     * </p>
     * 
     * @param searchDataSourcesRequest
     * @return A Java Future containing the result of the SearchDataSources operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDataSourcesResult> searchDataSourcesAsync(SearchDataSourcesRequest searchDataSourcesRequest);

    /**
     * <p>
     * Use the <code>SearchDataSources</code> operation to search for data sources that belong to an account.
     * </p>
     * 
     * @param searchDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDataSources operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchDataSourcesResult> searchDataSourcesAsync(SearchDataSourcesRequest searchDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDataSourcesRequest, SearchDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Searches the subfolders in a folder.
     * </p>
     * 
     * @param searchFoldersRequest
     * @return A Java Future containing the result of the SearchFolders operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchFolders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchFoldersResult> searchFoldersAsync(SearchFoldersRequest searchFoldersRequest);

    /**
     * <p>
     * Searches the subfolders in a folder.
     * </p>
     * 
     * @param searchFoldersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFolders operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchFolders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchFoldersResult> searchFoldersAsync(SearchFoldersRequest searchFoldersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFoldersRequest, SearchFoldersResult> asyncHandler);

    /**
     * <p>
     * Use the <code>SearchGroups</code> operation to search groups in a specified Amazon QuickSight namespace using the
     * supplied filters.
     * </p>
     * 
     * @param searchGroupsRequest
     * @return A Java Future containing the result of the SearchGroups operation returned by the service.
     * @sample AmazonQuickSightAsync.SearchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchGroupsResult> searchGroupsAsync(SearchGroupsRequest searchGroupsRequest);

    /**
     * <p>
     * Use the <code>SearchGroups</code> operation to search groups in a specified Amazon QuickSight namespace using the
     * supplied filters.
     * </p>
     * 
     * @param searchGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchGroups operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.SearchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchGroupsResult> searchGroupsAsync(SearchGroupsRequest searchGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchGroupsRequest, SearchGroupsResult> asyncHandler);

    /**
     * <p>
     * Starts an Asset Bundle export job.
     * </p>
     * <p>
     * An Asset Bundle export job exports specified Amazon QuickSight assets. You can also choose to export any asset
     * dependencies in the same job. Export jobs run asynchronously and can be polled with a
     * <code>DescribeAssetBundleExportJob</code> API call. When a job is successfully completed, a download URL that
     * contains the exported assets is returned. The URL is valid for 5 minutes and can be refreshed with a
     * <code>DescribeAssetBundleExportJob</code> API call. Each Amazon QuickSight account can run up to 5 export jobs
     * concurrently.
     * </p>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * 
     * @param startAssetBundleExportJobRequest
     * @return A Java Future containing the result of the StartAssetBundleExportJob operation returned by the service.
     * @sample AmazonQuickSightAsync.StartAssetBundleExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssetBundleExportJobResult> startAssetBundleExportJobAsync(
            StartAssetBundleExportJobRequest startAssetBundleExportJobRequest);

    /**
     * <p>
     * Starts an Asset Bundle export job.
     * </p>
     * <p>
     * An Asset Bundle export job exports specified Amazon QuickSight assets. You can also choose to export any asset
     * dependencies in the same job. Export jobs run asynchronously and can be polled with a
     * <code>DescribeAssetBundleExportJob</code> API call. When a job is successfully completed, a download URL that
     * contains the exported assets is returned. The URL is valid for 5 minutes and can be refreshed with a
     * <code>DescribeAssetBundleExportJob</code> API call. Each Amazon QuickSight account can run up to 5 export jobs
     * concurrently.
     * </p>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * 
     * @param startAssetBundleExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAssetBundleExportJob operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.StartAssetBundleExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssetBundleExportJobResult> startAssetBundleExportJobAsync(
            StartAssetBundleExportJobRequest startAssetBundleExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartAssetBundleExportJobRequest, StartAssetBundleExportJobResult> asyncHandler);

    /**
     * <p>
     * Starts an Asset Bundle import job.
     * </p>
     * <p>
     * An Asset Bundle import job imports specified Amazon QuickSight assets into an Amazon QuickSight account. You can
     * also choose to import a naming prefix and specified configuration overrides. The assets that are contained in the
     * bundle file that you provide are used to create or update a new or existing asset in your Amazon QuickSight
     * account. Each Amazon QuickSight account can run up to 5 import jobs concurrently.
     * </p>
     * <p>
     * The API caller must have the necessary <code>"create"</code>, <code>"describe"</code>, and <code>"update"</code>
     * permissions in their IAM role to access each resource type that is contained in the bundle file before the
     * resources can be imported.
     * </p>
     * 
     * @param startAssetBundleImportJobRequest
     * @return A Java Future containing the result of the StartAssetBundleImportJob operation returned by the service.
     * @sample AmazonQuickSightAsync.StartAssetBundleImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssetBundleImportJobResult> startAssetBundleImportJobAsync(
            StartAssetBundleImportJobRequest startAssetBundleImportJobRequest);

    /**
     * <p>
     * Starts an Asset Bundle import job.
     * </p>
     * <p>
     * An Asset Bundle import job imports specified Amazon QuickSight assets into an Amazon QuickSight account. You can
     * also choose to import a naming prefix and specified configuration overrides. The assets that are contained in the
     * bundle file that you provide are used to create or update a new or existing asset in your Amazon QuickSight
     * account. Each Amazon QuickSight account can run up to 5 import jobs concurrently.
     * </p>
     * <p>
     * The API caller must have the necessary <code>"create"</code>, <code>"describe"</code>, and <code>"update"</code>
     * permissions in their IAM role to access each resource type that is contained in the bundle file before the
     * resources can be imported.
     * </p>
     * 
     * @param startAssetBundleImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAssetBundleImportJob operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.StartAssetBundleImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssetBundleImportJobResult> startAssetBundleImportJobAsync(
            StartAssetBundleImportJobRequest startAssetBundleImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartAssetBundleImportJobRequest, StartAssetBundleImportJobResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous job that generates a snapshot of a dashboard's output. You can request one or several of
     * the following format configurations in each API call.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 Paginated PDF
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 Excel workbook that includes up to 5 table or pivot table visuals
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 CSVs from table or pivot table visuals
     * </p>
     * </li>
     * </ul>
     * <p>
     * The status of a submitted job can be polled with the <code>DescribeDashboardSnapshotJob</code> API. When you call
     * the <code>DescribeDashboardSnapshotJob</code> API, check the <code>JobStatus</code> field in the response. Once
     * the job reaches a <code>COMPLETED</code> or <code>FAILED</code> status, use the
     * <code>DescribeDashboardSnapshotJobResult</code> API to obtain the URLs for the generated files. If the job fails,
     * the <code>DescribeDashboardSnapshotJobResult</code> API returns detailed information about the error that
     * occurred.
     * </p>
     * <p>
     * <b>StartDashboardSnapshotJob API throttling</b>
     * </p>
     * <p>
     * Amazon QuickSight utilizes API throttling to create a more consistent user experience within a time span for
     * customers when they call the <code>StartDashboardSnapshotJob</code>. By default, 12 jobs can run simlutaneously
     * in one Amazon Web Services account and users can submit up 10 API requests per second before an account is
     * throttled. If an overwhelming number of API requests are made by the same user in a short period of time, Amazon
     * QuickSight throttles the API calls to maintin an optimal experience and reliability for all Amazon QuickSight
     * users.
     * </p>
     * <p>
     * <b>Common throttling scenarios</b>
     * </p>
     * <p>
     * The following list provides information about the most commin throttling scenarios that can occur.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A large number of <code>SnapshotExport</code> API jobs are running simultaneously on an Amazon Web Services
     * account.</b> When a new <code>StartDashboardSnapshotJob</code> is created and there are already 12 jobs with the
     * <code>RUNNING</code> status, the new job request fails and returns a <code>LimitExceededException</code> error.
     * Wait for a current job to comlpete before you resubmit the new job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A large number of API requests are submitted on an Amazon Web Services account.</b> When a user makes more
     * than 10 API calls to the Amazon QuickSight API in one second, a <code>ThrottlingException</code> is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your use case requires a higher throttling limit, contact your account admin or <a
     * href="http://aws.amazon.com/contact-us/">Amazon Web ServicesSupport</a> to explore options to tailor a more
     * optimal expereince for your account.
     * </p>
     * <p>
     * <b>Best practices to handle throttling</b>
     * </p>
     * <p>
     * If your use case projects high levels of API traffic, try to reduce the degree of frequency and parallelism of
     * API calls as much as you can to avoid throttling. You can also perform a timing test to calculate an estimate for
     * the total processing time of your projected load that stays within the throttling limits of the Amazon QuickSight
     * APIs. For example, if your projected traffic is 100 snapshot jobs before 12:00 PM per day, start 12 jobs in
     * parallel and measure the amount of time it takes to proccess all 12 jobs. Once you obtain the result, multiply
     * the duration by 9, for example <code>(12 minutes * 9 = 108 minutes)</code>. Use the new result to determine the
     * latest time at which the jobs need to be started to meet your target deadline.
     * </p>
     * <p>
     * The time that it takes to process a job can be impacted by the following factors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The dataset type (Direct Query or SPICE).
     * </p>
     * </li>
     * <li>
     * <p>
     * The size of the dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * The complexity of the calculated fields that are used in the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of visuals that are on a sheet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The types of visuals that are on the sheet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of formats and snapshots that are requested in the job configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The size of the generated snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startDashboardSnapshotJobRequest
     * @return A Java Future containing the result of the StartDashboardSnapshotJob operation returned by the service.
     * @sample AmazonQuickSightAsync.StartDashboardSnapshotJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartDashboardSnapshotJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDashboardSnapshotJobResult> startDashboardSnapshotJobAsync(
            StartDashboardSnapshotJobRequest startDashboardSnapshotJobRequest);

    /**
     * <p>
     * Starts an asynchronous job that generates a snapshot of a dashboard's output. You can request one or several of
     * the following format configurations in each API call.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1 Paginated PDF
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 Excel workbook that includes up to 5 table or pivot table visuals
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 CSVs from table or pivot table visuals
     * </p>
     * </li>
     * </ul>
     * <p>
     * The status of a submitted job can be polled with the <code>DescribeDashboardSnapshotJob</code> API. When you call
     * the <code>DescribeDashboardSnapshotJob</code> API, check the <code>JobStatus</code> field in the response. Once
     * the job reaches a <code>COMPLETED</code> or <code>FAILED</code> status, use the
     * <code>DescribeDashboardSnapshotJobResult</code> API to obtain the URLs for the generated files. If the job fails,
     * the <code>DescribeDashboardSnapshotJobResult</code> API returns detailed information about the error that
     * occurred.
     * </p>
     * <p>
     * <b>StartDashboardSnapshotJob API throttling</b>
     * </p>
     * <p>
     * Amazon QuickSight utilizes API throttling to create a more consistent user experience within a time span for
     * customers when they call the <code>StartDashboardSnapshotJob</code>. By default, 12 jobs can run simlutaneously
     * in one Amazon Web Services account and users can submit up 10 API requests per second before an account is
     * throttled. If an overwhelming number of API requests are made by the same user in a short period of time, Amazon
     * QuickSight throttles the API calls to maintin an optimal experience and reliability for all Amazon QuickSight
     * users.
     * </p>
     * <p>
     * <b>Common throttling scenarios</b>
     * </p>
     * <p>
     * The following list provides information about the most commin throttling scenarios that can occur.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A large number of <code>SnapshotExport</code> API jobs are running simultaneously on an Amazon Web Services
     * account.</b> When a new <code>StartDashboardSnapshotJob</code> is created and there are already 12 jobs with the
     * <code>RUNNING</code> status, the new job request fails and returns a <code>LimitExceededException</code> error.
     * Wait for a current job to comlpete before you resubmit the new job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A large number of API requests are submitted on an Amazon Web Services account.</b> When a user makes more
     * than 10 API calls to the Amazon QuickSight API in one second, a <code>ThrottlingException</code> is returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your use case requires a higher throttling limit, contact your account admin or <a
     * href="http://aws.amazon.com/contact-us/">Amazon Web ServicesSupport</a> to explore options to tailor a more
     * optimal expereince for your account.
     * </p>
     * <p>
     * <b>Best practices to handle throttling</b>
     * </p>
     * <p>
     * If your use case projects high levels of API traffic, try to reduce the degree of frequency and parallelism of
     * API calls as much as you can to avoid throttling. You can also perform a timing test to calculate an estimate for
     * the total processing time of your projected load that stays within the throttling limits of the Amazon QuickSight
     * APIs. For example, if your projected traffic is 100 snapshot jobs before 12:00 PM per day, start 12 jobs in
     * parallel and measure the amount of time it takes to proccess all 12 jobs. Once you obtain the result, multiply
     * the duration by 9, for example <code>(12 minutes * 9 = 108 minutes)</code>. Use the new result to determine the
     * latest time at which the jobs need to be started to meet your target deadline.
     * </p>
     * <p>
     * The time that it takes to process a job can be impacted by the following factors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The dataset type (Direct Query or SPICE).
     * </p>
     * </li>
     * <li>
     * <p>
     * The size of the dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * The complexity of the calculated fields that are used in the dashboard.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of visuals that are on a sheet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The types of visuals that are on the sheet.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of formats and snapshots that are requested in the job configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The size of the generated snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startDashboardSnapshotJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDashboardSnapshotJob operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.StartDashboardSnapshotJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartDashboardSnapshotJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDashboardSnapshotJobResult> startDashboardSnapshotJobAsync(
            StartDashboardSnapshotJobRequest startDashboardSnapshotJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDashboardSnapshotJobRequest, StartDashboardSnapshotJobResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon QuickSight resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values. You can use the
     * <code>TagResource</code> operation with a resource that already has tags. If you specify a new tag key for the
     * resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is
     * already associated with the resource, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. Amazon QuickSight supports tagging on data set, data
     * source, dashboard, template, topic, and user.
     * </p>
     * <p>
     * Tagging for Amazon QuickSight works in a similar way to tagging for other Amazon Web Services services, except
     * for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags are used to track costs for users in Amazon QuickSight. You can't tag other resources that Amazon QuickSight
     * costs are based on, such as storage capacoty (SPICE), session usage, alert consumption, or reporting units.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon QuickSight doesn't currently support the tag editor for Resource Groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQuickSightAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon QuickSight resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values. You can use the
     * <code>TagResource</code> operation with a resource that already has tags. If you specify a new tag key for the
     * resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is
     * already associated with the resource, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. Amazon QuickSight supports tagging on data set, data
     * source, dashboard, template, topic, and user.
     * </p>
     * <p>
     * Tagging for Amazon QuickSight works in a similar way to tagging for other Amazon Web Services services, except
     * for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags are used to track costs for users in Amazon QuickSight. You can't tag other resources that Amazon QuickSight
     * costs are based on, such as storage capacoty (SPICE), session usage, alert consumption, or reporting units.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon QuickSight doesn't currently support the tag editor for Resource Groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQuickSightAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, the only
     * customization that you can use is a theme.
     * </p>
     * <p>
     * You can use customizations for your Amazon Web Services account or, if you specify a namespace, for a Amazon
     * QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an
     * Amazon Web Services account. To find out which customizations apply, use the
     * <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * 
     * @param updateAccountCustomizationRequest
     * @return A Java Future containing the result of the UpdateAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountCustomizationResult> updateAccountCustomizationAsync(
            UpdateAccountCustomizationRequest updateAccountCustomizationRequest);

    /**
     * <p>
     * Updates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, the only
     * customization that you can use is a theme.
     * </p>
     * <p>
     * You can use customizations for your Amazon Web Services account or, if you specify a namespace, for a Amazon
     * QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an
     * Amazon Web Services account. To find out which customizations apply, use the
     * <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * 
     * @param updateAccountCustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountCustomization operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountCustomizationResult> updateAccountCustomizationAsync(
            UpdateAccountCustomizationRequest updateAccountCustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountCustomizationRequest, UpdateAccountCustomizationResult> asyncHandler);

    /**
     * <p>
     * Updates the Amazon QuickSight settings in your Amazon Web Services account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Updates the Amazon QuickSight settings in your Amazon Web Services account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates an analysis in Amazon QuickSight
     * </p>
     * 
     * @param updateAnalysisRequest
     * @return A Java Future containing the result of the UpdateAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisResult> updateAnalysisAsync(UpdateAnalysisRequest updateAnalysisRequest);

    /**
     * <p>
     * Updates an analysis in Amazon QuickSight
     * </p>
     * 
     * @param updateAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnalysis operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisResult> updateAnalysisAsync(UpdateAnalysisRequest updateAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnalysisRequest, UpdateAnalysisResult> asyncHandler);

    /**
     * <p>
     * Updates the read and write permissions for an analysis.
     * </p>
     * 
     * @param updateAnalysisPermissionsRequest
     * @return A Java Future containing the result of the UpdateAnalysisPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisPermissionsResult> updateAnalysisPermissionsAsync(
            UpdateAnalysisPermissionsRequest updateAnalysisPermissionsRequest);

    /**
     * <p>
     * Updates the read and write permissions for an analysis.
     * </p>
     * 
     * @param updateAnalysisPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnalysisPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisPermissionsResult> updateAnalysisPermissionsAsync(
            UpdateAnalysisPermissionsRequest updateAnalysisPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnalysisPermissionsRequest, UpdateAnalysisPermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates a dashboard in an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * Updating a Dashboard creates a new dashboard version but does not immediately publish the new version. You can
     * update the published version of a dashboard by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateDashboardPublishedVersion.html">UpdateDashboardPublishedVersion</a> </code>
     * API operation.
     * </p>
     * </note>
     * 
     * @param updateDashboardRequest
     * @return A Java Future containing the result of the UpdateDashboard operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest updateDashboardRequest);

    /**
     * <p>
     * Updates a dashboard in an Amazon Web Services account.
     * </p>
     * <note>
     * <p>
     * Updating a Dashboard creates a new dashboard version but does not immediately publish the new version. You can
     * update the published version of a dashboard by using the
     * <code> <a href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdateDashboardPublishedVersion.html">UpdateDashboardPublishedVersion</a> </code>
     * API operation.
     * </p>
     * </note>
     * 
     * @param updateDashboardRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDashboard operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest updateDashboardRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDashboardRequest, UpdateDashboardResult> asyncHandler);

    /**
     * <p>
     * Updates the linked analyses on a dashboard.
     * </p>
     * 
     * @param updateDashboardLinksRequest
     * @return A Java Future containing the result of the UpdateDashboardLinks operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDashboardLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardLinksResult> updateDashboardLinksAsync(UpdateDashboardLinksRequest updateDashboardLinksRequest);

    /**
     * <p>
     * Updates the linked analyses on a dashboard.
     * </p>
     * 
     * @param updateDashboardLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDashboardLinks operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDashboardLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardLinksResult> updateDashboardLinksAsync(UpdateDashboardLinksRequest updateDashboardLinksRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDashboardLinksRequest, UpdateDashboardLinksResult> asyncHandler);

    /**
     * <p>
     * Updates read and write permissions on a dashboard.
     * </p>
     * 
     * @param updateDashboardPermissionsRequest
     * @return A Java Future containing the result of the UpdateDashboardPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardPermissionsResult> updateDashboardPermissionsAsync(
            UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest);

    /**
     * <p>
     * Updates read and write permissions on a dashboard.
     * </p>
     * 
     * @param updateDashboardPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDashboardPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardPermissionsResult> updateDashboardPermissionsAsync(
            UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDashboardPermissionsRequest, UpdateDashboardPermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates the published version of a dashboard.
     * </p>
     * 
     * @param updateDashboardPublishedVersionRequest
     * @return A Java Future containing the result of the UpdateDashboardPublishedVersion operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.UpdateDashboardPublishedVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPublishedVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardPublishedVersionResult> updateDashboardPublishedVersionAsync(
            UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest);

    /**
     * <p>
     * Updates the published version of a dashboard.
     * </p>
     * 
     * @param updateDashboardPublishedVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDashboardPublishedVersion operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDashboardPublishedVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPublishedVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDashboardPublishedVersionResult> updateDashboardPublishedVersionAsync(
            UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDashboardPublishedVersionRequest, UpdateDashboardPublishedVersionResult> asyncHandler);

    /**
     * <p>
     * Updates a dataset. This operation doesn't support datasets that include uploaded files as a source. Partial
     * updates are not supported by this operation.
     * </p>
     * 
     * @param updateDataSetRequest
     * @return A Java Future containing the result of the UpdateDataSet operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest updateDataSetRequest);

    /**
     * <p>
     * Updates a dataset. This operation doesn't support datasets that include uploaded files as a source. Partial
     * updates are not supported by this operation.
     * </p>
     * 
     * @param updateDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSet operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest updateDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSetRequest, UpdateDataSetResult> asyncHandler);

    /**
     * <p>
     * Updates the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @return A Java Future containing the result of the UpdateDataSetPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetPermissionsResult> updateDataSetPermissionsAsync(UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest);

    /**
     * <p>
     * Updates the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSetPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetPermissionsResult> updateDataSetPermissionsAsync(UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSetPermissionsRequest, UpdateDataSetPermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates a data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates a data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Updates the permissions to a data source.
     * </p>
     * 
     * @param updateDataSourcePermissionsRequest
     * @return A Java Future containing the result of the UpdateDataSourcePermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourcePermissionsResult> updateDataSourcePermissionsAsync(
            UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest);

    /**
     * <p>
     * Updates the permissions to a data source.
     * </p>
     * 
     * @param updateDataSourcePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSourcePermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourcePermissionsResult> updateDataSourcePermissionsAsync(
            UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourcePermissionsRequest, UpdateDataSourcePermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates the name of a folder.
     * </p>
     * 
     * @param updateFolderRequest
     * @return A Java Future containing the result of the UpdateFolder operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(UpdateFolderRequest updateFolderRequest);

    /**
     * <p>
     * Updates the name of a folder.
     * </p>
     * 
     * @param updateFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFolder operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(UpdateFolderRequest updateFolderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFolderRequest, UpdateFolderResult> asyncHandler);

    /**
     * <p>
     * Updates permissions of a folder.
     * </p>
     * 
     * @param updateFolderPermissionsRequest
     * @return A Java Future containing the result of the UpdateFolderPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateFolderPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateFolderPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderPermissionsResult> updateFolderPermissionsAsync(UpdateFolderPermissionsRequest updateFolderPermissionsRequest);

    /**
     * <p>
     * Updates permissions of a folder.
     * </p>
     * 
     * @param updateFolderPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFolderPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateFolderPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateFolderPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderPermissionsResult> updateFolderPermissionsAsync(UpdateFolderPermissionsRequest updateFolderPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFolderPermissionsRequest, UpdateFolderPermissionsResult> asyncHandler);

    /**
     * <p>
     * Changes a group description.
     * </p>
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Changes a group description.
     * </p>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * <p>
     * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that
     * are specified in the request. This overwrites all of the users included in <code>Identities</code>.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @return A Java Future containing the result of the UpdateIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIAMPolicyAssignmentResult> updateIAMPolicyAssignmentAsync(
            UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that
     * are specified in the request. This overwrites all of the users included in <code>Identities</code>.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIAMPolicyAssignment operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIAMPolicyAssignmentResult> updateIAMPolicyAssignmentAsync(
            UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIAMPolicyAssignmentRequest, UpdateIAMPolicyAssignmentResult> asyncHandler);

    /**
     * <p>
     * Adds or updates services and authorized targets to configure what the Amazon QuickSight IAM Identity Center
     * application can access.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts using IAM Identity Center
     * </p>
     * 
     * @param updateIdentityPropagationConfigRequest
     * @return A Java Future containing the result of the UpdateIdentityPropagationConfig operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.UpdateIdentityPropagationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIdentityPropagationConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityPropagationConfigResult> updateIdentityPropagationConfigAsync(
            UpdateIdentityPropagationConfigRequest updateIdentityPropagationConfigRequest);

    /**
     * <p>
     * Adds or updates services and authorized targets to configure what the Amazon QuickSight IAM Identity Center
     * application can access.
     * </p>
     * <p>
     * This operation is only supported for Amazon QuickSight accounts using IAM Identity Center
     * </p>
     * 
     * @param updateIdentityPropagationConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityPropagationConfig operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.UpdateIdentityPropagationConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIdentityPropagationConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityPropagationConfigResult> updateIdentityPropagationConfigAsync(
            UpdateIdentityPropagationConfigRequest updateIdentityPropagationConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityPropagationConfigRequest, UpdateIdentityPropagationConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the content and status of IP rules. Traffic from a source is allowed when the source satisfies either the
     * <code>IpRestrictionRule</code>, <code>VpcIdRestrictionRule</code>, or <code>VpcEndpointIdRestrictionRule</code>.
     * To use this operation, you must provide the entire map of rules. You can use the
     * <code>DescribeIpRestriction</code> operation to get the current rule map.
     * </p>
     * 
     * @param updateIpRestrictionRequest
     * @return A Java Future containing the result of the UpdateIpRestriction operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateIpRestriction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIpRestriction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIpRestrictionResult> updateIpRestrictionAsync(UpdateIpRestrictionRequest updateIpRestrictionRequest);

    /**
     * <p>
     * Updates the content and status of IP rules. Traffic from a source is allowed when the source satisfies either the
     * <code>IpRestrictionRule</code>, <code>VpcIdRestrictionRule</code>, or <code>VpcEndpointIdRestrictionRule</code>.
     * To use this operation, you must provide the entire map of rules. You can use the
     * <code>DescribeIpRestriction</code> operation to get the current rule map.
     * </p>
     * 
     * @param updateIpRestrictionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIpRestriction operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateIpRestriction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIpRestriction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIpRestrictionResult> updateIpRestrictionAsync(UpdateIpRestrictionRequest updateIpRestrictionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIpRestrictionRequest, UpdateIpRestrictionResult> asyncHandler);

    /**
     * <p>
     * Updates a customer managed key in a Amazon QuickSight account.
     * </p>
     * 
     * @param updateKeyRegistrationRequest
     * @return A Java Future containing the result of the UpdateKeyRegistration operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateKeyRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateKeyRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyRegistrationResult> updateKeyRegistrationAsync(UpdateKeyRegistrationRequest updateKeyRegistrationRequest);

    /**
     * <p>
     * Updates a customer managed key in a Amazon QuickSight account.
     * </p>
     * 
     * @param updateKeyRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKeyRegistration operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateKeyRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateKeyRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeyRegistrationResult> updateKeyRegistrationAsync(UpdateKeyRegistrationRequest updateKeyRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyRegistrationRequest, UpdateKeyRegistrationResult> asyncHandler);

    /**
     * <p>
     * Use the <code>UpdatePublicSharingSettings</code> operation to turn on or turn off the public sharing settings of
     * an Amazon QuickSight dashboard.
     * </p>
     * <p>
     * To use this operation, turn on session capacity pricing for your Amazon QuickSight account.
     * </p>
     * <p>
     * Before you can turn on public sharing on your account, make sure to give public sharing permissions to an
     * administrative user in the Identity and Access Management (IAM) console. For more information on using IAM with
     * Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/security_iam_service-with-iam.html">Using Amazon
     * QuickSight with IAM</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param updatePublicSharingSettingsRequest
     * @return A Java Future containing the result of the UpdatePublicSharingSettings operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdatePublicSharingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdatePublicSharingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublicSharingSettingsResult> updatePublicSharingSettingsAsync(
            UpdatePublicSharingSettingsRequest updatePublicSharingSettingsRequest);

    /**
     * <p>
     * Use the <code>UpdatePublicSharingSettings</code> operation to turn on or turn off the public sharing settings of
     * an Amazon QuickSight dashboard.
     * </p>
     * <p>
     * To use this operation, turn on session capacity pricing for your Amazon QuickSight account.
     * </p>
     * <p>
     * Before you can turn on public sharing on your account, make sure to give public sharing permissions to an
     * administrative user in the Identity and Access Management (IAM) console. For more information on using IAM with
     * Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/security_iam_service-with-iam.html">Using Amazon
     * QuickSight with IAM</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param updatePublicSharingSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePublicSharingSettings operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdatePublicSharingSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdatePublicSharingSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublicSharingSettingsResult> updatePublicSharingSettingsAsync(
            UpdatePublicSharingSettingsRequest updatePublicSharingSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePublicSharingSettingsRequest, UpdatePublicSharingSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates a refresh schedule for a dataset.
     * </p>
     * 
     * @param updateRefreshScheduleRequest
     * @return A Java Future containing the result of the UpdateRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRefreshScheduleResult> updateRefreshScheduleAsync(UpdateRefreshScheduleRequest updateRefreshScheduleRequest);

    /**
     * <p>
     * Updates a refresh schedule for a dataset.
     * </p>
     * 
     * @param updateRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRefreshScheduleResult> updateRefreshScheduleAsync(UpdateRefreshScheduleRequest updateRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRefreshScheduleRequest, UpdateRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates the custom permissions that are associated with a role.
     * </p>
     * 
     * @param updateRoleCustomPermissionRequest
     * @return A Java Future containing the result of the UpdateRoleCustomPermission operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoleCustomPermissionResult> updateRoleCustomPermissionAsync(
            UpdateRoleCustomPermissionRequest updateRoleCustomPermissionRequest);

    /**
     * <p>
     * Updates the custom permissions that are associated with a role.
     * </p>
     * 
     * @param updateRoleCustomPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoleCustomPermission operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateRoleCustomPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateRoleCustomPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoleCustomPermissionResult> updateRoleCustomPermissionAsync(
            UpdateRoleCustomPermissionRequest updateRoleCustomPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoleCustomPermissionRequest, UpdateRoleCustomPermissionResult> asyncHandler);

    /**
     * <p>
     * Updates the SPICE capacity configuration for a Amazon QuickSight account.
     * </p>
     * 
     * @param updateSPICECapacityConfigurationRequest
     * @return A Java Future containing the result of the UpdateSPICECapacityConfiguration operation returned by the
     *         service.
     * @sample AmazonQuickSightAsync.UpdateSPICECapacityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateSPICECapacityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSPICECapacityConfigurationResult> updateSPICECapacityConfigurationAsync(
            UpdateSPICECapacityConfigurationRequest updateSPICECapacityConfigurationRequest);

    /**
     * <p>
     * Updates the SPICE capacity configuration for a Amazon QuickSight account.
     * </p>
     * 
     * @param updateSPICECapacityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSPICECapacityConfiguration operation returned by the
     *         service.
     * @sample AmazonQuickSightAsyncHandler.UpdateSPICECapacityConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateSPICECapacityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSPICECapacityConfigurationResult> updateSPICECapacityConfigurationAsync(
            UpdateSPICECapacityConfigurationRequest updateSPICECapacityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSPICECapacityConfigurationRequest, UpdateSPICECapacityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a template from an existing Amazon QuickSight analysis or another template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest);

    /**
     * <p>
     * Updates a template from an existing Amazon QuickSight analysis or another template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplate operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest updateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the template alias of a template.
     * </p>
     * 
     * @param updateTemplateAliasRequest
     * @return A Java Future containing the result of the UpdateTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateAliasResult> updateTemplateAliasAsync(UpdateTemplateAliasRequest updateTemplateAliasRequest);

    /**
     * <p>
     * Updates the template alias of a template.
     * </p>
     * 
     * @param updateTemplateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplateAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateAliasResult> updateTemplateAliasAsync(UpdateTemplateAliasRequest updateTemplateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateAliasRequest, UpdateTemplateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @return A Java Future containing the result of the UpdateTemplatePermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplatePermissionsResult> updateTemplatePermissionsAsync(
            UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest);

    /**
     * <p>
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplatePermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplatePermissionsResult> updateTemplatePermissionsAsync(
            UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplatePermissionsRequest, UpdateTemplatePermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates a theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return A Java Future containing the result of the UpdateTheme operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest updateThemeRequest);

    /**
     * <p>
     * Updates a theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTheme operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest updateThemeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThemeRequest, UpdateThemeResult> asyncHandler);

    /**
     * <p>
     * Updates an alias of a theme.
     * </p>
     * 
     * @param updateThemeAliasRequest
     * @return A Java Future containing the result of the UpdateThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeAliasResult> updateThemeAliasAsync(UpdateThemeAliasRequest updateThemeAliasRequest);

    /**
     * <p>
     * Updates an alias of a theme.
     * </p>
     * 
     * @param updateThemeAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThemeAlias operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemeAliasResult> updateThemeAliasAsync(UpdateThemeAliasRequest updateThemeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThemeAliasRequest, UpdateThemeAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on,
     * for example <code>"quicksight:DescribeTheme"</code>.
     * </p>
     * <p>
     * Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions,
     * which are user, owner, or no permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:CreateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemePermissions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemePermissions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateThemePermissionsRequest
     * @return A Java Future containing the result of the UpdateThemePermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemePermissionsResult> updateThemePermissionsAsync(UpdateThemePermissionsRequest updateThemePermissionsRequest);

    /**
     * <p>
     * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on,
     * for example <code>"quicksight:DescribeTheme"</code>.
     * </p>
     * <p>
     * Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions,
     * which are user, owner, or no permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"quicksight:DescribeTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeAliases"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:ListThemeVersions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateTheme"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:CreateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DeleteThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemeAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:UpdateThemePermissions"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"quicksight:DescribeThemePermissions"</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateThemePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThemePermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThemePermissionsResult> updateThemePermissionsAsync(UpdateThemePermissionsRequest updateThemePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThemePermissionsRequest, UpdateThemePermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates a topic.
     * </p>
     * 
     * @param updateTopicRequest
     * @return A Java Future containing the result of the UpdateTopic operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicResult> updateTopicAsync(UpdateTopicRequest updateTopicRequest);

    /**
     * <p>
     * Updates a topic.
     * </p>
     * 
     * @param updateTopicRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTopic operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicResult> updateTopicAsync(UpdateTopicRequest updateTopicRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTopicRequest, UpdateTopicResult> asyncHandler);

    /**
     * <p>
     * Updates the permissions of a topic.
     * </p>
     * 
     * @param updateTopicPermissionsRequest
     * @return A Java Future containing the result of the UpdateTopicPermissions operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTopicPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopicPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicPermissionsResult> updateTopicPermissionsAsync(UpdateTopicPermissionsRequest updateTopicPermissionsRequest);

    /**
     * <p>
     * Updates the permissions of a topic.
     * </p>
     * 
     * @param updateTopicPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTopicPermissions operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTopicPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopicPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicPermissionsResult> updateTopicPermissionsAsync(UpdateTopicPermissionsRequest updateTopicPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTopicPermissionsRequest, UpdateTopicPermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates a topic refresh schedule.
     * </p>
     * 
     * @param updateTopicRefreshScheduleRequest
     * @return A Java Future containing the result of the UpdateTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicRefreshScheduleResult> updateTopicRefreshScheduleAsync(
            UpdateTopicRefreshScheduleRequest updateTopicRefreshScheduleRequest);

    /**
     * <p>
     * Updates a topic refresh schedule.
     * </p>
     * 
     * @param updateTopicRefreshScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTopicRefreshSchedule operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateTopicRefreshSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTopicRefreshSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTopicRefreshScheduleResult> updateTopicRefreshScheduleAsync(
            UpdateTopicRefreshScheduleRequest updateTopicRefreshScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTopicRefreshScheduleRequest, UpdateTopicRefreshScheduleResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

    /**
     * <p>
     * Updates a VPC connection.
     * </p>
     * 
     * @param updateVPCConnectionRequest
     * @return A Java Future containing the result of the UpdateVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsync.UpdateVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVPCConnectionResult> updateVPCConnectionAsync(UpdateVPCConnectionRequest updateVPCConnectionRequest);

    /**
     * <p>
     * Updates a VPC connection.
     * </p>
     * 
     * @param updateVPCConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVPCConnection operation returned by the service.
     * @sample AmazonQuickSightAsyncHandler.UpdateVPCConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateVPCConnection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVPCConnectionResult> updateVPCConnectionAsync(UpdateVPCConnectionRequest updateVPCConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVPCConnectionRequest, UpdateVPCConnectionResult> asyncHandler);

}
