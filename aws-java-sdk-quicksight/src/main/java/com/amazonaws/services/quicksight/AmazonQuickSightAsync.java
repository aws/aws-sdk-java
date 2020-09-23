/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon QuickSight is a fully managed, serverless business intelligence service for the AWS Cloud that makes it easy
 * to extend data and insights to every user in your organization. This API reference contains documentation for a
 * programming interface that you can use to manage Amazon QuickSight.
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
     * Creates Amazon QuickSight customizations the current AWS Region. Currently, you can add a custom default theme by
     * using the <code>CreateAccountCustomization</code> or <code>UpdateAccountCustomization</code> API operation. To
     * further customize QuickSight by removing QuickSight sample assets and videos for all new users, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/customizing-quicksight.html">Customizing QuickSight</a>
     * in the <i>Amazon QuickSight User Guide.</i>
     * </p>
     * <p>
     * You can create customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace always override customizations that apply to an AWS account. To
     * find out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * <p>
     * Before you use the <code>CreateAccountCustomization</code> API operation to add a theme as the namespace default,
     * make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme
     * isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the
     * current permissions by using the <code> <a>DescribeThemePermissions</a> </code> API operation. To share the
     * theme, grant permissions by using the <code> <a>UpdateThemePermissions</a> </code> API operation.
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
     * Creates Amazon QuickSight customizations the current AWS Region. Currently, you can add a custom default theme by
     * using the <code>CreateAccountCustomization</code> or <code>UpdateAccountCustomization</code> API operation. To
     * further customize QuickSight by removing QuickSight sample assets and videos for all new users, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/customizing-quicksight.html">Customizing QuickSight</a>
     * in the <i>Amazon QuickSight User Guide.</i>
     * </p>
     * <p>
     * You can create customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace always override customizations that apply to an AWS account. To
     * find out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
     * </p>
     * <p>
     * Before you use the <code>CreateAccountCustomization</code> API operation to add a theme as the namespace default,
     * make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme
     * isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the
     * current permissions by using the <code> <a>DescribeThemePermissions</a> </code> API operation. To share the
     * theme, grant permissions by using the <code> <a>UpdateThemePermissions</a> </code> API operation.
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
     * Creates an analysis in Amazon QuickSight.
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
     * Creates an analysis in Amazon QuickSight.
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
     * Creates a dashboard from a template. To first create a template, see the <code> <a>CreateTemplate</a> </code> API
     * operation.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share
     * QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have
     * the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
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
     * Creates a dashboard from a template. To first create a template, see the <code> <a>CreateTemplate</a> </code> API
     * operation.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share
     * QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have
     * the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
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
     * Creates a dataset.
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
     * Creates a dataset.
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
     * Creates an Amazon QuickSight group.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
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
     * Creates an Amazon QuickSight group.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
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
     * will be assigned to specified groups or users of Amazon QuickSight. The users and groups need to be in the same
     * namespace.
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
     * will be assigned to specified groups or users of Amazon QuickSight. The users and groups need to be in the same
     * namespace.
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
     * Creates and starts a new SPICE ingestion on a dataset
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the AWS Knowledge Center. Tags
     * are visible on the tagged dataset, but not on the ingestion resource.
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
     * Creates and starts a new SPICE ingestion on a dataset
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the AWS Knowledge Center. Tags
     * are visible on the tagged dataset, but not on the ingestion resource.
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
     * A namespace allows you to isolate the QuickSight users and groups that are registered for that namespace. Users
     * that access the namespace can share assets only with other users or groups in the same namespace. They can't see
     * users and groups in other namespaces. You can create a namespace after your AWS account is subscribed to
     * QuickSight. The namespace must be unique within the AWS account. By default, there is a limit of 100 namespaces
     * per AWS account. To increase your limit, create a ticket with AWS Support.
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
     * A namespace allows you to isolate the QuickSight users and groups that are registered for that namespace. Users
     * that access the namespace can share assets only with other users or groups in the same namespace. They can't see
     * users and groups in other namespaces. You can create a namespace after your AWS account is subscribed to
     * QuickSight. The namespace must be unique within the AWS account. By default, there is a limit of 100 namespaces
     * per AWS account. To increase your limit, create a ticket with AWS Support.
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
     * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create
     * a dashboard.
     * </p>
     * <p>
     * A <i>template</i> is an entity in QuickSight that encapsulates the metadata required to create an analysis and
     * that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace
     * the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
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
     * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create
     * a dashboard.
     * </p>
     * <p>
     * A <i>template</i> is an entity in QuickSight that encapsulates the metadata required to create an analysis and
     * that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace
     * the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
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
     * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight
     * namespace.
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
     * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight
     * namespace.
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
     * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can
     * restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. QuickSight
     * attaches a <code>DeletionTime</code> stamp to the response that specifies the end of the recovery window. At the
     * end of the recovery window, QuickSight deletes the analysis permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use the <code>RestoreAnalysis</code> API operation to remove the
     * <code>DeletionTime</code> stamp and cancel the deletion of the analysis. The analysis remains visible in the API
     * until it's deleted, so you can describe it but you can't make a template from it.
     * </p>
     * <p>
     * An analysis that's scheduled for deletion isn't accessible in the QuickSight console. To access it in the
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
     * restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. QuickSight
     * attaches a <code>DeletionTime</code> stamp to the response that specifies the end of the recovery window. At the
     * end of the recovery window, QuickSight deletes the analysis permanently.
     * </p>
     * <p>
     * At any time before recovery window ends, you can use the <code>RestoreAnalysis</code> API operation to remove the
     * <code>DeletionTime</code> stamp and cancel the deletion of the analysis. The analysis remains visible in the API
     * until it's deleted, so you can describe it but you can't make a template from it.
     * </p>
     * <p>
     * An analysis that's scheduled for deletion isn't accessible in the QuickSight console. To access it in the
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
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
     * (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.
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
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
     * (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.
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
     * Describes the customizations associated with the provided AWS account and Amazon QuickSight namespace in an AWS
     * Region. The QuickSight console evaluates which customizations to apply by running this API operation with the
     * <code>Resolved</code> flag included.
     * </p>
     * <p>
     * To determine what customizations display when you run this command, it can help to visualize the relationship of
     * the entities involved.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS Account</code> - The AWS account exists at the top of the hierarchy. It has the potential to use all of
     * the AWS Regions and AWS Services. When you subscribe to QuickSight, you choose one AWS Region to use as your home
     * Region. That's where your free SPICE capacity is located. You can use QuickSight in any supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS Region</code> - In each AWS Region where you sign in to QuickSight at least once, QuickSight acts as a
     * separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US
     * East (N. Virginia). Generally speaking, these users have access to QuickSight in any AWS Region, unless they are
     * constrained to a namespace.
     * </p>
     * <p>
     * To run the command in a different AWS Region, you change your Region settings. If you're using the AWS CLI, you
     * can use one of the following options:
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
     * Run <code>aws configure</code> to change your default AWS Region. Use Enter to key the same settings for your
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html">Configuring the AWS CLI</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code> - A QuickSight namespace is a partition that contains users and assets (data sources,
     * datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also
     * be part of the same namespace. People who share a namespace are completely isolated from users and assets in
     * other namespaces, even if they are in the same AWS account and AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Applied customizations</code> - Within an AWS Region, a set of QuickSight customizations can apply to an
     * AWS account or to a namespace. Settings that you apply to a namespace override settings that you apply to an AWS
     * account. All settings are isolated to a single AWS Region. To apply them in other AWS Regions, run the
     * <code>CreateAccountCustomization</code> command in each AWS Region where you want to apply the same
     * customizations.
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
     * Describes the customizations associated with the provided AWS account and Amazon QuickSight namespace in an AWS
     * Region. The QuickSight console evaluates which customizations to apply by running this API operation with the
     * <code>Resolved</code> flag included.
     * </p>
     * <p>
     * To determine what customizations display when you run this command, it can help to visualize the relationship of
     * the entities involved.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS Account</code> - The AWS account exists at the top of the hierarchy. It has the potential to use all of
     * the AWS Regions and AWS Services. When you subscribe to QuickSight, you choose one AWS Region to use as your home
     * Region. That's where your free SPICE capacity is located. You can use QuickSight in any supported AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS Region</code> - In each AWS Region where you sign in to QuickSight at least once, QuickSight acts as a
     * separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US
     * East (N. Virginia). Generally speaking, these users have access to QuickSight in any AWS Region, unless they are
     * constrained to a namespace.
     * </p>
     * <p>
     * To run the command in a different AWS Region, you change your Region settings. If you're using the AWS CLI, you
     * can use one of the following options:
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
     * Run <code>aws configure</code> to change your default AWS Region. Use Enter to key the same settings for your
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html">Configuring the AWS CLI</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Namespace</code> - A QuickSight namespace is a partition that contains users and assets (data sources,
     * datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also
     * be part of the same namespace. People who share a namespace are completely isolated from users and assets in
     * other namespaces, even if they are in the same AWS account and AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Applied customizations</code> - Within an AWS Region, a set of QuickSight customizations can apply to an
     * AWS account or to a namespace. Settings that you apply to a namespace override settings that you apply to an AWS
     * account. All settings are isolated to a single AWS Region. To apply them in other AWS Regions, run the
     * <code>CreateAccountCustomization</code> command in each AWS Region where you want to apply the same
     * customizations.
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
     * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
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
     * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
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
     * Describes a dataset.
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
     * Describes a dataset.
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
     * Generates a session URL and authorization code that you can use to embed an Amazon QuickSight read-only dashboard
     * in your web server code. Before you use this command, make sure that you have configured the dashboards and
     * permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user's browser. The
     * following rules apply to the combination of URL and authorization code:
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
     * The resulting user session is valid for 10 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-dashboards.html">Embedding Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i> .
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
     * Generates a session URL and authorization code that you can use to embed an Amazon QuickSight read-only dashboard
     * in your web server code. Before you use this command, make sure that you have configured the dashboards and
     * permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user's browser. The
     * following rules apply to the combination of URL and authorization code:
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
     * The resulting user session is valid for 10 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-dashboards.html">Embedding Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i> .
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
     * Generates a session URL and authorization code that you can use to embed the Amazon QuickSight console in your
     * web server code. Use <code>GetSessionEmbedUrl</code> where you want to provide an authoring portal that allows
     * users to create data sources, datasets, analyses, and dashboards. The users who access an embedded QuickSight
     * console need belong to the author or admin security cohort. If you want to restrict permissions to some of these
     * features, add a custom permissions profile to the user with the <code> <a>UpdateUser</a> </code> API operation.
     * Use <code> <a>RegisterUser</a> </code> API operation to add a new user with a custom permission profile attached.
     * For more information, see the following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-the-quicksight-console.html">Embedding the
     * Amazon QuickSight Console</a>
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
     * Generates a session URL and authorization code that you can use to embed the Amazon QuickSight console in your
     * web server code. Use <code>GetSessionEmbedUrl</code> where you want to provide an authoring portal that allows
     * users to create data sources, datasets, analyses, and dashboards. The users who access an embedded QuickSight
     * console need belong to the author or admin security cohort. If you want to restrict permissions to some of these
     * features, add a custom permissions profile to the user with the <code> <a>UpdateUser</a> </code> API operation.
     * Use <code> <a>RegisterUser</a> </code> API operation to add a new user with a custom permission profile attached.
     * For more information, see the following sections in the <i>Amazon QuickSight User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/quicksight/latest/user/embedding-the-quicksight-console.html">Embedding the
     * Amazon QuickSight Console</a>
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
     * Lists Amazon QuickSight analyses that exist in the specified AWS account.
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
     * Lists Amazon QuickSight analyses that exist in the specified AWS account.
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
     * Lists all the versions of the dashboards in the QuickSight subscription.
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
     * Lists all the versions of the dashboards in the QuickSight subscription.
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
     * Lists dashboards in an AWS account.
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
     * Lists dashboards in an AWS account.
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
     * Lists all of the datasets belonging to the current AWS account in an AWS Region.
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
     * Lists all of the datasets belonging to the current AWS account in an AWS Region.
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
     * Lists data sources in current AWS Region that belong to this AWS account.
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
     * Lists data sources in current AWS Region that belong to this AWS account.
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
     * Lists IAM policy assignments in the current Amazon QuickSight account.
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
     * Lists IAM policy assignments in the current Amazon QuickSight account.
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
     * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to
     * the specified user and group or groups that the user belongs to.
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
     * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to
     * the specified user and group or groups that the user belongs to.
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
     * Lists the namespaces for the specified AWS account.
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
     * Lists the namespaces for the specified AWS account.
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
     * Lists all the versions of the themes in the current AWS account.
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
     * Lists all the versions of the themes in the current AWS account.
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
     * Lists all the themes in the current AWS account.
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
     * Lists all the themes in the current AWS account.
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
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM)
     * identity or role specified in the request.
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
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM)
     * identity or role specified in the request.
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
     * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.
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
     * You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source,
     * dashboard, and template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on
     * users and SPICE capacity, which aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
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
     * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.
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
     * You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source,
     * dashboard, and template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on
     * users and SPICE capacity, which aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
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
     * Updates Amazon QuickSight customizations the current AWS Region. Currently, the only customization you can use is
     * a theme.
     * </p>
     * <p>
     * You can use customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace override customizations that apply to an AWS account. To find
     * out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
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
     * Updates Amazon QuickSight customizations the current AWS Region. Currently, the only customization you can use is
     * a theme.
     * </p>
     * <p>
     * You can use customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace
     * instead. Customizations that apply to a namespace override customizations that apply to an AWS account. To find
     * out which customizations apply, use the <code>DescribeAccountCustomization</code> API operation.
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
     * Updates the Amazon QuickSight settings in your AWS account.
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
     * Updates the Amazon QuickSight settings in your AWS account.
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
     * Updates a dashboard in an AWS account.
     * </p>
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
     * Updates a dashboard in an AWS account.
     * </p>
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
     * Updates a dataset.
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
     * Updates a dataset.
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
     * are specified in the request.
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
     * are specified in the request.
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

}
