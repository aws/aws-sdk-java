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
 * Amazon QuickSight is a fully managed, serverless, cloud business intelligence service that makes it easy to extend
 * data and insights to every user in your organization. This API interface reference contains documentation for a
 * programming interface that you can use to manage Amazon QuickSight.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQuickSightAsync extends AmazonQuickSight {

    /**
     * <p>
     * Cancels an on-going ingestion of data into SPICE.
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
     * Cancels an on-going ingestion of data into SPICE.
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
     * Creates a dashboard from a template. To first create a template, see the CreateTemplate API.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight which identifies Quicksight reports, created from analyses. QuickSight
     * dashboards are sharable. With the right permissions, you can create scheduled email reports from them. The
     * <code>CreateDashboard</code>, <code>DescribeDashboard</code> and <code>ListDashboardsByUser</code> APIs act on
     * the dashboard entity. If you have the correct permissions, you can create a dashboard from a template that exists
     * in a different AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-dashboard --cli-input-json file://create-dashboard.json</code>
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
     * Creates a dashboard from a template. To first create a template, see the CreateTemplate API.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight which identifies Quicksight reports, created from analyses. QuickSight
     * dashboards are sharable. With the right permissions, you can create scheduled email reports from them. The
     * <code>CreateDashboard</code>, <code>DescribeDashboard</code> and <code>ListDashboardsByUser</code> APIs act on
     * the dashboard entity. If you have the correct permissions, you can create a dashboard from a template that exists
     * in a different AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-dashboard --cli-input-json file://create-dashboard.json</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--name='My dataset' \</code>
     * </p>
     * <p>
     * <code>--import-mode=SPICE \</code>
     * </p>
     * <p>
     * <code>--physical-table-map='{</code>
     * </p>
     * <p>
     * <code> "physical-table-id": {</code>
     * </p>
     * <p>
     * <code> "RelationalTable": {</code>
     * </p>
     * <p>
     * <code> "DataSourceArn": "arn:aws:quicksight:us-west-2:111111111111:datasource/data-source-id",</code>
     * </p>
     * <p>
     * <code> "Name": "table1",</code>
     * </p>
     * <p>
     * <code> "InputColumns": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "Name": "column1",</code>
     * </p>
     * <p>
     * <code> "Type": "STRING"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> }'</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--name='My dataset' \</code>
     * </p>
     * <p>
     * <code>--import-mode=SPICE \</code>
     * </p>
     * <p>
     * <code>--physical-table-map='{</code>
     * </p>
     * <p>
     * <code> "physical-table-id": {</code>
     * </p>
     * <p>
     * <code> "RelationalTable": {</code>
     * </p>
     * <p>
     * <code> "DataSourceArn": "arn:aws:quicksight:us-west-2:111111111111:datasource/data-source-id",</code>
     * </p>
     * <p>
     * <code> "Name": "table1",</code>
     * </p>
     * <p>
     * <code> "InputColumns": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "Name": "column1",</code>
     * </p>
     * <p>
     * <code> "Type": "STRING"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> }'</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--type=POSTGRESQL \</code>
     * </p>
     * <p>
     * <code>--data-source-parameters='{ "PostgreSqlParameters": {</code>
     * </p>
     * <p>
     * <code> "Host": "my-db-host.example.com",</code>
     * </p>
     * <p>
     * <code> "Port": 1234,</code>
     * </p>
     * <p>
     * <code> "Database": "my-db" } }' \</code>
     * </p>
     * <p>
     * <code>--credentials='{ "CredentialPair": {</code>
     * </p>
     * <p>
     * <code> "Username": "username",</code>
     * </p>
     * <p>
     * <code> "Password": "password" } }'</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--type=POSTGRESQL \</code>
     * </p>
     * <p>
     * <code>--data-source-parameters='{ "PostgreSqlParameters": {</code>
     * </p>
     * <p>
     * <code> "Host": "my-db-host.example.com",</code>
     * </p>
     * <p>
     * <code> "Port": 1234,</code>
     * </p>
     * <p>
     * <code> "Database": "my-db" } }' \</code>
     * </p>
     * <p>
     * <code>--credentials='{ "CredentialPair": {</code>
     * </p>
     * <p>
     * <code> "Username": "username",</code>
     * </p>
     * <p>
     * <code> "Password": "password" } }'</code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting" </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting" </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The condition resource is the user name.
     * </p>
     * <p>
     * The condition key is <code>quicksight:UserName</code>.
     * </p>
     * <p>
     * The response is the group member object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The condition resource is the user name.
     * </p>
     * <p>
     * The condition key is <code>quicksight:UserName</code>.
     * </p>
     * <p>
     * The response is the group member object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat </code>
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
     * Creates an assignment with one specified IAM policy ARN and will assigned to specified groups or users of
     * QuickSight. Users and groups need to be in the same namespace.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=helpAssignment --policy-arn=arn:aws:iam::aws:policy/AdministratorAccess --identities="user=user5,engineer123,group=QS-Admin" --namespace=default --region=us-west-2</code>
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
     * Creates an assignment with one specified IAM policy ARN and will assigned to specified groups or users of
     * QuickSight. Users and groups need to be in the same namespace.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=helpAssignment --policy-arn=arn:aws:iam::aws:policy/AdministratorAccess --identities="user=user5,engineer123,group=QS-Admin" --namespace=default --region=us-west-2</code>
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
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access-control. For an
     * example, see <a href="https://aws.example.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a>. Tags will be visible on the
     * tagged dataset, but not on the ingestion resource.
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
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access-control. For an
     * example, see <a href="https://aws.example.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a>. Tags will be visible on the
     * tagged dataset, but not on the ingestion resource.
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
     * Creates a template from an existing QuickSight analysis or template. The resulting template can be used to create
     * a dashboard.
     * </p>
     * <p>
     * A template is an entity in QuickSight which encapsulates the metadata required to create an analysis that can be
     * used to create dashboard. It adds a layer of abstraction by use placeholders to replace the dataset associated
     * with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets
     * which follow the same schema that was used to create the source analysis and template.
     * </p>
     * <p>
     * To create a template from an existing analysis, use the analysis's ARN, <code>aws-account-id</code>,
     * <code>template-id</code>, <code>source-entity</code>, and <code>data-set-references</code>.
     * </p>
     * <p>
     * CLI syntax to create a template:
     * </p>
     * <p>
     * <code>aws quicksight create-template —cli-input-json file://create-template.json</code>
     * </p>
     * <p>
     * CLI syntax to create a template from another template in the same AWS account:
     * </p>
     * <p>
     * <code>aws quicksight create-template --aws-account-id 111122223333 --template-id reports_test_template --data-set-references DataSetPlaceholder=reports,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/0dfc789c-81f6-4f4f-b9ac-7db2453eefc8 DataSetPlaceholder=Elblogs,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/f60da323-af68-45db-9016-08e0d1d7ded5 --source-entity SourceAnalysis='{Arn=arn:aws:quicksight:us-west-2:111122223333:analysis/7fb74527-c36d-4be8-8139-ac1be4c97365}'</code>
     * </p>
     * <p>
     * To create template from another account’s template, you need to grant cross account resource permission for
     * DescribeTemplate the account that contains the template.
     * </p>
     * <p>
     * You can use a file to pass JSON to the function if you prefer.
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
     * Creates a template from an existing QuickSight analysis or template. The resulting template can be used to create
     * a dashboard.
     * </p>
     * <p>
     * A template is an entity in QuickSight which encapsulates the metadata required to create an analysis that can be
     * used to create dashboard. It adds a layer of abstraction by use placeholders to replace the dataset associated
     * with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets
     * which follow the same schema that was used to create the source analysis and template.
     * </p>
     * <p>
     * To create a template from an existing analysis, use the analysis's ARN, <code>aws-account-id</code>,
     * <code>template-id</code>, <code>source-entity</code>, and <code>data-set-references</code>.
     * </p>
     * <p>
     * CLI syntax to create a template:
     * </p>
     * <p>
     * <code>aws quicksight create-template —cli-input-json file://create-template.json</code>
     * </p>
     * <p>
     * CLI syntax to create a template from another template in the same AWS account:
     * </p>
     * <p>
     * <code>aws quicksight create-template --aws-account-id 111122223333 --template-id reports_test_template --data-set-references DataSetPlaceholder=reports,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/0dfc789c-81f6-4f4f-b9ac-7db2453eefc8 DataSetPlaceholder=Elblogs,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/f60da323-af68-45db-9016-08e0d1d7ded5 --source-entity SourceAnalysis='{Arn=arn:aws:quicksight:us-west-2:111122223333:analysis/7fb74527-c36d-4be8-8139-ac1be4c97365}'</code>
     * </p>
     * <p>
     * To create template from another account’s template, you need to grant cross account resource permission for
     * DescribeTemplate the account that contains the template.
     * </p>
     * <p>
     * You can use a file to pass JSON to the function if you prefer.
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name PROD —version-number 1</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight create-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name PROD —version-number 1</code>
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
     * Deletes a dashboard.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-dashboard --aws-account-id 111122223333 —dashboard-id 123123123</code>
     * </p>
     * <p>
     * <code>aws quicksight delete-dashboard --aws-account-id 111122223333 —dashboard-id 123123123 —version-number 3</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-dashboard --aws-account-id 111122223333 —dashboard-id 123123123</code>
     * </p>
     * <p>
     * <code>aws quicksight delete-dashboard --aws-account-id 111122223333 —dashboard-id 123123123 —version-number 3</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111111111111 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111111111111 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id</code>
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
     * Deletes the data source permanently. This action breaks all the datasets that reference the deleted data source.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id </code>
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
     * Deletes the data source permanently. This action breaks all the datasets that reference the deleted data source.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The condition resource is the user name.
     * </p>
     * <p>
     * The condition key is <code>quicksight:UserName</code>.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The condition resource is the user name.
     * </p>
     * <p>
     * The condition key is <code>quicksight:UserName</code>.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie </code>
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
     * Deletes an existing assignment.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=testtest --region=us-east-1 --namespace=default</code>
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
     * Deletes an existing assignment.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=testtest --region=us-east-1 --namespace=default</code>
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
     * Deletes a template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight delete-template --aws-account-id 111122223333 —-template-id reports_test_template --version-number 2 </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template —aws-account-id 111122223333 —template-id reports_test_template —alias-name STAGING </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template —aws-account-id 111122223333 —template-id reports_test_template —alias-name ‘\$LATEST’ </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template --aws-account-id 111122223333 —-template-id reports_test_template</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If version number which is an optional field is not passed the template (including all the versions) is deleted
     * by the API, if version number is provided, the specific template version is deleted by the API.
     * </p>
     * <p>
     * Users can explicitly describe the latest version of the template by passing <code>$LATEST</code> to the
     * <code>alias-name</code> parameter. <code>$LATEST</code> is an internally supported alias, which points to the
     * latest version of the template.
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
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight delete-template --aws-account-id 111122223333 —-template-id reports_test_template --version-number 2 </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template —aws-account-id 111122223333 —template-id reports_test_template —alias-name STAGING </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template —aws-account-id 111122223333 —template-id reports_test_template —alias-name ‘\$LATEST’ </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight delete-template --aws-account-id 111122223333 —-template-id reports_test_template</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If version number which is an optional field is not passed the template (including all the versions) is deleted
     * by the API, if version number is provided, the specific template version is deleted by the API.
     * </p>
     * <p>
     * Users can explicitly describe the latest version of the template by passing <code>$LATEST</code> to the
     * <code>alias-name</code> parameter. <code>$LATEST</code> is an internally supported alias, which points to the
     * latest version of the template.
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
     * Update template alias of given template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name 'STAGING'</code>
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
     * Update template alias of given template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight delete-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name 'STAGING'</code>
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
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
     * (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS </code>
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
     * Provides a summary for a dashboard.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight describe-dashboard --aws-account-id 111122223333 —dashboard-id reports_test_report -version-number 2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> aws quicksight describe-dashboard --aws-account-id 111122223333 —dashboard-id reports_test_report -alias-name ‘$PUBLISHED’ </code>
     * </p>
     * </li>
     * </ul>
     * <p/>
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
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight describe-dashboard --aws-account-id 111122223333 —dashboard-id reports_test_report -version-number 2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> aws quicksight describe-dashboard --aws-account-id 111122223333 —dashboard-id reports_test_report -alias-name ‘$PUBLISHED’ </code>
     * </p>
     * </li>
     * </ul>
     * <p/>
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
     * Describes read and write permissions on a dashboard.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-dashboard-permissions --aws-account-id 735340738645 —dashboard-id reports_test_bob_report</code>
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
     * Describes read and write permissions on a dashboard.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-dashboard-permissions --aws-account-id 735340738645 —dashboard-id reports_test_bob_report</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111111111111 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111111111111 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id</code>
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-data-set-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-data-set-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
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
     * <p>
     * The permissions resource is <code>aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
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
     * <p>
     * The permissions resource is <code>aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is the group object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is the group object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales </code>
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
     * Describes an existing IAMPolicy Assignment by specified assignment name.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=testtest --namespace=default --region=us-east-1 </code>
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
     * Describes an existing IAMPolicy Assignment by specified assignment name.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=testtest --namespace=default --region=us-east-1 </code>
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
     * Describes a template's metadata.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template </code>
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template --version-number-2</code>
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template --alias-name '\$LATEST' </code>
     * </p>
     * <p>
     * Users can explicitly describe the latest version of the dashboard by passing <code>$LATEST</code> to the
     * <code>alias-name</code> parameter. <code>$LATEST</code> is an internally supported alias, which points to the
     * latest version of the dashboard.
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template </code>
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template --version-number-2</code>
     * </p>
     * <p>
     * <code>aws quicksight describe-template --aws-account-id 111122223333 --template-id reports_test_template --alias-name '\$LATEST' </code>
     * </p>
     * <p>
     * Users can explicitly describe the latest version of the dashboard by passing <code>$LATEST</code> to the
     * <code>alias-name</code> parameter. <code>$LATEST</code> is an internally supported alias, which points to the
     * latest version of the dashboard.
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
     * Describes the template aliases of a template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name 'STAGING'</code>
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
     * Describes the template aliases of a template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name 'STAGING'</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template-permissions —aws-account-id 735340738645 —template-id reports_test_template</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight describe-template-permissions —aws-account-id 735340738645 —template-id reports_test_template</code>
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
     * Returns information about a user, given the user name.
     * </p>
     * <p>
     * The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access
     * Management (IAM) role, and email address.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat </code>
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
     * <p>
     * The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access
     * Management (IAM) role, and email address.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat </code>
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
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to
     * configure the dashboards and user permissions. For more information, see <a
     * href="https://docs.aws.example.com/en_us/quicksight/latest/user/embedding.html"> Embedding Amazon QuickSight
     * Dashboards</a>.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user’s browser.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * Assume the role with permissions enabled for actions: <code>quickSight:RegisterUser</code> and
     * <code>quicksight:GetDashboardEmbedURL</code>. You can use assume-role, assume-role-with-web-identity, or
     * assume-role-with-saml.
     * </p>
     * <p>
     * <code>aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession</code>
     * </p>
     * <p>
     * If the user does not exist in QuickSight, register the user:
     * </p>
     * <p>
     * <code>aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1</code>
     * </p>
     * <p>
     * Get the URL for the embedded dashboard (<code>IAM</code> identity authentication):
     * </p>
     * <p>
     * <code>aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM</code>
     * </p>
     * <p>
     * Get the URL for the embedded dashboard (<code>QUICKSIGHT</code> identity authentication):
     * </p>
     * <p>
     * <code>aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type QUICKSIGHT --user-arn arn:aws:quicksight:us-east-1:111122223333:user/default/embedding_quicksight_dashboard_role/embeddingsession</code>
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
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to
     * configure the dashboards and user permissions. For more information, see <a
     * href="https://docs.aws.example.com/en_us/quicksight/latest/user/embedding.html"> Embedding Amazon QuickSight
     * Dashboards</a>.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the server, not from the user’s browser.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * Assume the role with permissions enabled for actions: <code>quickSight:RegisterUser</code> and
     * <code>quicksight:GetDashboardEmbedURL</code>. You can use assume-role, assume-role-with-web-identity, or
     * assume-role-with-saml.
     * </p>
     * <p>
     * <code>aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession</code>
     * </p>
     * <p>
     * If the user does not exist in QuickSight, register the user:
     * </p>
     * <p>
     * <code>aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1</code>
     * </p>
     * <p>
     * Get the URL for the embedded dashboard (<code>IAM</code> identity authentication):
     * </p>
     * <p>
     * <code>aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM</code>
     * </p>
     * <p>
     * Get the URL for the embedded dashboard (<code>QUICKSIGHT</code> identity authentication):
     * </p>
     * <p>
     * <code>aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type QUICKSIGHT --user-arn arn:aws:quicksight:us-east-1:111122223333:user/default/embedding_quicksight_dashboard_role/embeddingsession</code>
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
     * Lists all the versions of the dashboards in the Quicksight subscription.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * aws quicksight list-template-versions —aws-account-id 111122223333 —template-id reports-test-template
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
     * Lists all the versions of the dashboards in the Quicksight subscription.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * aws quicksight list-template-versions —aws-account-id 111122223333 —template-id reports-test-template
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
     * Lists dashboards in the AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-dashboards --aws-account-id 111122223333 --max-results 5 —next-token 'next-10'</code>
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
     * Lists dashboards in the AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-dashboards --aws-account-id 111122223333 --max-results 5 —next-token 'next-10'</code>
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
     * Lists all of the datasets belonging to this account in an AWS region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>
     * </p>
     * <p>
     * CLI syntax: <code>aws quicksight list-data-sets --aws-account-id=111111111111</code>
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
     * Lists all of the datasets belonging to this account in an AWS region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>
     * </p>
     * <p>
     * CLI syntax: <code>aws quicksight list-data-sets --aws-account-id=111111111111</code>
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
     * Lists data sources in current AWS region that belong to this AWS account.
     * </p>
     * <p>
     * The permissions resource is: <code>arn:aws:quicksight:region:aws-account-id:datasource/*</code>
     * </p>
     * <p>
     * CLI syntax: <code>aws quicksight list-data-sources --aws-account-id=111122223333</code>
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
     * Lists data sources in current AWS region that belong to this AWS account.
     * </p>
     * <p>
     * The permissions resource is: <code>arn:aws:quicksight:region:aws-account-id:datasource/*</code>
     * </p>
     * <p>
     * CLI syntax: <code>aws quicksight list-data-sources --aws-account-id=111122223333</code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The response is a list of group member objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The response is a list of group member objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/*</code>.
     * </p>
     * <p>
     * The response is a list of group objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/*</code>.
     * </p>
     * <p>
     * The response is a list of group objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default </code>
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
     * Lists assignments in current QuickSight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-iam-policy-assignments --aws-account-id=111122223333 --max-result=5 --assignment-status=ENABLED --namespace=default --region=us-east-1 --next-token=3 </code>
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
     * Lists assignments in current QuickSight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-iam-policy-assignments --aws-account-id=111122223333 --max-result=5 --assignment-status=ENABLED --namespace=default --region=us-east-1 --next-token=3 </code>
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
     * Lists all the assignments and the ARNs for the associated IAM policies assigned to the specified user and the
     * group or groups that the user belongs to.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-iam-policy-assignments-for-user --aws-account-id=111122223333 --user-name=user5 --namespace=default --max-result=6 --region=us-east-1 </code>
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
     * Lists all the assignments and the ARNs for the associated IAM policies assigned to the specified user and the
     * group or groups that the user belongs to.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-iam-policy-assignments-for-user --aws-account-id=111122223333 --user-name=user5 --namespace=default --max-result=6 --region=us-east-1 </code>
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
     * Lists the tags assigned to a resource.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight list-tags-for-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --region us-east-1</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight list-tags-for-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --region us-east-1</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-template-aliases --aws-account-id 111122223333 —template-id 'reports_test_template'</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-template-aliases --aws-account-id 111122223333 —template-id 'reports_test_template'</code>
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
     * Lists all the versions of the templates in the Quicksight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * aws quicksight list-template-versions --aws-account-id 111122223333 --aws-account-id 196359894473 --template-id
     * reports-test-template
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
     * Lists all the versions of the templates in the Quicksight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * aws quicksight list-template-versions --aws-account-id 111122223333 --aws-account-id 196359894473 --template-id
     * reports-test-template
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
     * Lists all the templates in the QuickSight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-templates --aws-account-id 111122223333 --max-results 1 —next-token AYADeJuxwOypAndSoOn</code>
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
     * Lists all the templates in the QuickSight account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight list-templates --aws-account-id 111122223333 --max-results 1 —next-token AYADeJuxwOypAndSoOn</code>
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
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
     * </p>
     * <p>
     * The response is a one or more group objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1 </code>
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
     * <p>
     * The response is a one or more group objects.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1 </code>
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
     * <p>
     * The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and
     * Access Management (IAM) role, and email address.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-users --aws-account-id=111122223333 --namespace=default </code>
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
     * <p>
     * The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and
     * Access Management (IAM) role, and email address.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight list-users --aws-account-id=111122223333 --namespace=default </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat </code>
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
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat </code>
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
     * Assigns a tag or tags to a resource.
     * </p>
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified QuickSight resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values. You can use the TagResource action with a resource that
     * already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags
     * associated with the resource. If you specify a tag key that is already associated with the resource, the new tag
     * value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. QuickSight supports tagging on data-set, data-source,
     * dashboard, template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar was to tagging for other AWS services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight, because QuickSight costs are based on users and SPICE
     * capacity, which aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CLI syntax to tag a resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight tag-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --tags Key=K1,Value=V1 Key=K2,Value=V2 --region us-east-1</code>
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
     * Assigns a tag or tags to a resource.
     * </p>
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified QuickSight resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values. You can use the TagResource action with a resource that
     * already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags
     * associated with the resource. If you specify a tag key that is already associated with the resource, the new tag
     * value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. QuickSight supports tagging on data-set, data-source,
     * dashboard, template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar was to tagging for other AWS services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight, because QuickSight costs are based on users and SPICE
     * capacity, which aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CLI syntax to tag a resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight tag-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --tags Key=K1,Value=V1 Key=K2,Value=V2 --region us-east-1</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight untag-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --tag-keys K1 K2 --region us-east-1</code>
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight untag-resource --resource-arn arn:aws:quicksight:us-east-1:111111111111:dataset/dataset1 --tag-keys K1 K2 --region us-east-1</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates a dashboard in the AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard --aws-account-id 111122223333 --dashboard-id 123123123 --dashboard-name "test-update102" --source-entity SourceTemplate={Arn=arn:aws:quicksight:us-west-2:111122223333:template/sales-report-template2} --data-set-references DataSetPlaceholder=SalesDataSet,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/0e251aef-9ebf-46e1-b852-eb4fa33c1d3a</code>
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard --cli-input-json file://update-dashboard.json </code>
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
     * Updates a dashboard in the AWS account.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard --aws-account-id 111122223333 --dashboard-id 123123123 --dashboard-name "test-update102" --source-entity SourceTemplate={Arn=arn:aws:quicksight:us-west-2:111122223333:template/sales-report-template2} --data-set-references DataSetPlaceholder=SalesDataSet,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/0e251aef-9ebf-46e1-b852-eb4fa33c1d3a</code>
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard --cli-input-json file://update-dashboard.json </code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard-permissions —cli-input-json file://update-permission.json</code>
     * </p>
     * <p>
     * A sample update-permissions.json for granting read only permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "GrantPermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard" ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for granting read and write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "GrantPermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard", "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for revoking write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "RevokePermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for revoking read and write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "RevokePermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard", "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * To obtain the principal name of a QuickSight user or group, you can use describe-group or describe-user. For
     * example:
     * </p>
     * <p>
     * <code>aws quicksight describe-user --aws-account-id 111122223333 --namespace default --user-name user2 --region us-east-1 { "User": { "Arn": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Active": true, "Email": "user2@example.com", "Role": "ADMIN", "UserName": "user2", "PrincipalId": "federated/iam/abcd2abcdabcdeabc5ab5" }, "RequestId": "8f74bb31-6291-448a-a71c-a765a44bae31", "Status": 200 }</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard-permissions —cli-input-json file://update-permission.json</code>
     * </p>
     * <p>
     * A sample update-permissions.json for granting read only permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "GrantPermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard" ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for granting read and write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "GrantPermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard", "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for revoking write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "RevokePermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * A sample update-permissions.json for revoking read and write permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333", "DashboardId": "reports_test_report", "RevokePermissions": [ { "Principal": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Actions": [ "quicksight:DescribeDashboard", "quicksight:ListDashboardVersions", "quicksight:DescribeDashboardVersion", "quicksight:QueryDashboard", "quicksight:DescribeDashboardPermissions", "quicksight:UpdateDashboardPermissions", "quicksight:DeleteDashboardVersion", "quicksight:DeleteDashboard", "quicksight:UpdateDashboard", "quicksight:UpdateDashboardPublishedVersion", ] } ] }</code>
     * </p>
     * <p>
     * To obtain the principal name of a QuickSight user or group, you can use describe-group or describe-user. For
     * example:
     * </p>
     * <p>
     * <code>aws quicksight describe-user --aws-account-id 111122223333 --namespace default --user-name user2 --region us-east-1 { "User": { "Arn": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2", "Active": true, "Email": "user2@example.com", "Role": "ADMIN", "UserName": "user2", "PrincipalId": "federated/iam/abcd2abcdabcdeabc5ab5" }, "RequestId": "8f74bb31-6291-448a-a71c-a765a44bae31", "Status": 200 }</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard-published-version --aws-account-id 111122223333 --dashboard-id dashboard-w1 ---version-number 2</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-dashboard-published-version --aws-account-id 111122223333 --dashboard-id dashboard-w1 ---version-number 2</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--name='My dataset' \</code>
     * </p>
     * <p>
     * <code>--import-mode=SPICE \</code>
     * </p>
     * <p>
     * <code>--physical-table-map='{</code>
     * </p>
     * <p>
     * <code> "physical-table-id": {</code>
     * </p>
     * <p>
     * <code> "RelationalTable": {</code>
     * </p>
     * <p>
     * <code> "DataSourceArn": "arn:aws:quicksight:us-west-2:111111111111:datasource/data-source-id",</code>
     * </p>
     * <p>
     * <code> "Name": "table1",</code>
     * </p>
     * <p>
     * <code> "InputColumns": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "Name": "column1",</code>
     * </p>
     * <p>
     * <code> "Type": "STRING"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> }'</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-set \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--name='My dataset' \</code>
     * </p>
     * <p>
     * <code>--import-mode=SPICE \</code>
     * </p>
     * <p>
     * <code>--physical-table-map='{</code>
     * </p>
     * <p>
     * <code> "physical-table-id": {</code>
     * </p>
     * <p>
     * <code> "RelationalTable": {</code>
     * </p>
     * <p>
     * <code> "DataSourceArn": "arn:aws:quicksight:us-west-2:111111111111:datasource/data-source-id",</code>
     * </p>
     * <p>
     * <code> "Name": "table1",</code>
     * </p>
     * <p>
     * <code> "InputColumns": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "Name": "column1",</code>
     * </p>
     * <p>
     * <code> "Type": "STRING"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> }'</code>
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-set-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--grant-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user1","Actions":["quicksight:DescribeDataSet","quicksight:DescribeDataSetPermissions","quicksight:PassDataSet","quicksight:ListIngestions","quicksight:DescribeIngestion"]}]' \</code>
     * </p>
     * <p>
     * <code>--revoke-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user2","Actions":["quicksight:UpdateDataSet","quicksight:DeleteDataSet","quicksight:UpdateDataSetPermissions","quicksight:CreateIngestion","quicksight:CancelIngestion"]}]'</code>
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-set-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-set-id=unique-data-set-id \</code>
     * </p>
     * <p>
     * <code>--grant-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user1","Actions":["quicksight:DescribeDataSet","quicksight:DescribeDataSetPermissions","quicksight:PassDataSet","quicksight:ListIngestions","quicksight:DescribeIngestion"]}]' \</code>
     * </p>
     * <p>
     * <code>--revoke-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user2","Actions":["quicksight:UpdateDataSet","quicksight:DeleteDataSet","quicksight:UpdateDataSetPermissions","quicksight:CreateIngestion","quicksight:CancelIngestion"]}]'</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--data-source-parameters='{"PostgreSqlParameters":{"Host":"my-db-host.example.com","Port":1234,"Database":"my-db"}}' \</code>
     * </p>
     * <p>
     * <code>--credentials='{"CredentialPair":{"Username":"username","Password":"password"}}</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-source \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--data-source-parameters='{"PostgreSqlParameters":{"Host":"my-db-host.example.com","Port":1234,"Database":"my-db"}}' \</code>
     * </p>
     * <p>
     * <code>--credentials='{"CredentialPair":{"Username":"username","Password":"password"}}</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-source-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--grant-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user1","Actions":["quicksight:DescribeDataSource","quicksight:DescribeDataSourcePermissions","quicksight:PassDataSource"]}]' \</code>
     * </p>
     * <p>
     * <code>--revoke-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user2","Actions":["quicksight:UpdateDataSource","quicksight:DeleteDataSource","quicksight:UpdateDataSourcePermissions"]}]'</code>
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
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-data-source-permissions \</code>
     * </p>
     * <p>
     * <code>--aws-account-id=111122223333 \</code>
     * </p>
     * <p>
     * <code>--data-source-id=unique-data-source-id \</code>
     * </p>
     * <p>
     * <code>--name='My Data Source' \</code>
     * </p>
     * <p>
     * <code>--grant-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user1","Actions":["quicksight:DescribeDataSource","quicksight:DescribeDataSourcePermissions","quicksight:PassDataSource"]}]' \</code>
     * </p>
     * <p>
     * <code>--revoke-permissions='[{"Principal":"arn:aws:quicksight:us-east-1:111122223333:user/default/user2","Actions":["quicksight:UpdateDataSource","quicksight:DeleteDataSource","quicksight:UpdateDataSourcePermissions"]}]'</code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards" </code>
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
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>.
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards" </code>
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
     * Updates an existing assignment. This operation updates only the optional parameter or parameters that are
     * specified in the request.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code/>aws quicksight update-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=FullAccessAssignment --assignment-status=DRAFT --policy-arns=arn:aws:iam::aws:policy/AdministratorAccess --identities="user=user-1,user-2,group=admin" --namespace=default --region=us-east-1
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
     * Updates an existing assignment. This operation updates only the optional parameter or parameters that are
     * specified in the request.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code/>aws quicksight update-iam-policy-assignment --aws-account-id=111122223333 --assignment-name=FullAccessAssignment --assignment-status=DRAFT --policy-arns=arn:aws:iam::aws:policy/AdministratorAccess --identities="user=user-1,user-2,group=admin" --namespace=default --region=us-east-1
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
     * Updates a template from an existing QuickSight analysis.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-template --aws-account-id 111122223333 --template-id reports_test_template --data-set-references DataSetPlaceholder=reports,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/c684a204-d134-4c53-a63c-451f72c60c28 DataSetPlaceholder=Elblogs,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/15840b7d-b542-4491-937b-602416b367b3 —source-entity SourceAnalysis=’{Arn=arn:aws:quicksight:us-west-2:111122223333:analysis/c5731fe9-4708-4598-8f6d-cf2a70875b6d}</code>
     * </p>
     * <p>
     * You can also pass in a json file:
     * <code>aws quicksight update-template —cli-input-json file://create-template.json</code>
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
     * Updates a template from an existing QuickSight analysis.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-template --aws-account-id 111122223333 --template-id reports_test_template --data-set-references DataSetPlaceholder=reports,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/c684a204-d134-4c53-a63c-451f72c60c28 DataSetPlaceholder=Elblogs,DataSetArn=arn:aws:quicksight:us-west-2:111122223333:dataset/15840b7d-b542-4491-937b-602416b367b3 —source-entity SourceAnalysis=’{Arn=arn:aws:quicksight:us-west-2:111122223333:analysis/c5731fe9-4708-4598-8f6d-cf2a70875b6d}</code>
     * </p>
     * <p>
     * You can also pass in a json file:
     * <code>aws quicksight update-template —cli-input-json file://create-template.json</code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name STAGING —template-version-number 2 </code>
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
     * <p>
     * CLI syntax:
     * </p>
     * <p>
     * <code>aws quicksight update-template-alias --aws-account-id 111122223333 --template-id 'reports_test_template' --alias-name STAGING —template-version-number 2 </code>
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
     * Updates the permissions on a template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight describe-template-permissions —aws-account-id 111122223333 —template-id reports_test_template</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight update-template-permissions —cli-input-json file://update-permission.json </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The structure of <code>update-permissions.json</code> to add permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333",</code>
     * </p>
     * <p>
     * <code> "DashboardId": "reports_test_template",</code>
     * </p>
     * <p>
     * <code> "GrantPermissions": [</code>
     * </p>
     * <p>
     * <code> { "Principal": "arn:aws:quicksight:us-east-1:196359894473:user/default/user3",</code>
     * </p>
     * <p>
     * <code> "Actions": [</code>
     * </p>
     * <p>
     * <code> "quicksight:DescribeTemplate",</code>
     * </p>
     * <p>
     * <code> "quicksight:ListTemplateVersions"</code>
     * </p>
     * <p>
     * <code> ] } ] }</code>
     * </p>
     * <p>
     * The structure of <code>update-permissions.json</code> to add permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333",</code>
     * </p>
     * <p>
     * <code> "DashboardId": "reports_test_template",</code>
     * </p>
     * <p>
     * <code> "RevokePermissions": [</code>
     * </p>
     * <p>
     * <code> { "Principal": "arn:aws:quicksight:us-east-1:196359894473:user/default/user3",</code>
     * </p>
     * <p>
     * <code> "Actions": [</code>
     * </p>
     * <p>
     * <code> "quicksight:DescribeTemplate",</code>
     * </p>
     * <p>
     * <code> "quicksight:ListTemplateVersions"</code>
     * </p>
     * <p>
     * <code> ] } ] }</code>
     * </p>
     * <p>
     * To obtain the principal name of a QuickSight group or user, use user describe-group or describe-user. For
     * example:
     * </p>
     * <p>
     * <code>aws quicksight describe-user </code>
     * </p>
     * <p>
     * <code>--aws-account-id 111122223333</code>
     * </p>
     * <p>
     * <code>--namespace default</code>
     * </p>
     * <p>
     * <code>--user-name user2 </code>
     * </p>
     * <p>
     * <code>--region us-east-1</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "User": {</code>
     * </p>
     * <p>
     * <code> "Arn": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2",</code>
     * </p>
     * <p>
     * <code> "Active": true,</code>
     * </p>
     * <p>
     * <code> "Email": "user2@example.com",</code>
     * </p>
     * <p>
     * <code> "Role": "ADMIN",</code>
     * </p>
     * <p>
     * <code> "UserName": "user2",</code>
     * </p>
     * <p>
     * <code> "PrincipalId": "federated/iam/abcd2abcdabcdeabc5ab5"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> "RequestId": "8f74bb31-6291-448a-a71c-a765a44bae31",</code>
     * </p>
     * <p>
     * <code> "Status": 200</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates the permissions on a template.
     * </p>
     * <p>
     * CLI syntax:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aws quicksight describe-template-permissions —aws-account-id 111122223333 —template-id reports_test_template</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws quicksight update-template-permissions —cli-input-json file://update-permission.json </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The structure of <code>update-permissions.json</code> to add permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333",</code>
     * </p>
     * <p>
     * <code> "DashboardId": "reports_test_template",</code>
     * </p>
     * <p>
     * <code> "GrantPermissions": [</code>
     * </p>
     * <p>
     * <code> { "Principal": "arn:aws:quicksight:us-east-1:196359894473:user/default/user3",</code>
     * </p>
     * <p>
     * <code> "Actions": [</code>
     * </p>
     * <p>
     * <code> "quicksight:DescribeTemplate",</code>
     * </p>
     * <p>
     * <code> "quicksight:ListTemplateVersions"</code>
     * </p>
     * <p>
     * <code> ] } ] }</code>
     * </p>
     * <p>
     * The structure of <code>update-permissions.json</code> to add permissions:
     * </p>
     * <p>
     * <code>{ "AwsAccountId": "111122223333",</code>
     * </p>
     * <p>
     * <code> "DashboardId": "reports_test_template",</code>
     * </p>
     * <p>
     * <code> "RevokePermissions": [</code>
     * </p>
     * <p>
     * <code> { "Principal": "arn:aws:quicksight:us-east-1:196359894473:user/default/user3",</code>
     * </p>
     * <p>
     * <code> "Actions": [</code>
     * </p>
     * <p>
     * <code> "quicksight:DescribeTemplate",</code>
     * </p>
     * <p>
     * <code> "quicksight:ListTemplateVersions"</code>
     * </p>
     * <p>
     * <code> ] } ] }</code>
     * </p>
     * <p>
     * To obtain the principal name of a QuickSight group or user, use user describe-group or describe-user. For
     * example:
     * </p>
     * <p>
     * <code>aws quicksight describe-user </code>
     * </p>
     * <p>
     * <code>--aws-account-id 111122223333</code>
     * </p>
     * <p>
     * <code>--namespace default</code>
     * </p>
     * <p>
     * <code>--user-name user2 </code>
     * </p>
     * <p>
     * <code>--region us-east-1</code>
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "User": {</code>
     * </p>
     * <p>
     * <code> "Arn": "arn:aws:quicksight:us-east-1:111122223333:user/default/user2",</code>
     * </p>
     * <p>
     * <code> "Active": true,</code>
     * </p>
     * <p>
     * <code> "Email": "user2@example.com",</code>
     * </p>
     * <p>
     * <code> "Role": "ADMIN",</code>
     * </p>
     * <p>
     * <code> "UserName": "user2",</code>
     * </p>
     * <p>
     * <code> "PrincipalId": "federated/iam/abcd2abcdabcdeabc5ab5"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> "RequestId": "8f74bb31-6291-448a-a71c-a765a44bae31",</code>
     * </p>
     * <p>
     * <code> "Status": 200</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * </li>
     * </ul>
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
     * Updates an Amazon QuickSight user.
     * </p>
     * <p>
     * The response is a user object that contains the user's Amazon QuickSight user name, email address, active or
     * inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@example.com --aws-account-id=111122223333 --namespace=default --region=us-east-1 </code>
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
     * <p>
     * The response is a user object that contains the user's Amazon QuickSight user name, email address, active or
     * inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>CLI Sample:</b>
     * </p>
     * <p>
     * <code>aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@example.com --aws-account-id=111122223333 --namespace=default --region=us-east-1 </code>
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
