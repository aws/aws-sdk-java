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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.quicksight.model.*;

/**
 * Interface for accessing Amazon QuickSight.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.quicksight.AbstractAmazonQuickSight} instead.
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
public interface AmazonQuickSight {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "quicksight";

    /**
     * <p>
     * Cancels an on-going ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return Result of the CancelIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CancelIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CancelIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    CancelIngestionResult cancelIngestion(CancelIngestionRequest cancelIngestionRequest);

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
     * @return Result of the CreateDashboard operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest);

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
     * @return Result of the CreateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSetResult createDataSet(CreateDataSetRequest createDataSetRequest);

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
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

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
     * @return Result of the CreateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

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
     * @return Result of the CreateGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGroupMembershipResult createGroupMembership(CreateGroupMembershipRequest createGroupMembershipRequest);

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
     * @return Result of the CreateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in an "actionable" state that must complete before a new update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIAMPolicyAssignmentResult createIAMPolicyAssignment(CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest);

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
     * @return Result of the CreateIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateIngestion" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIngestionResult createIngestion(CreateIngestionRequest createIngestionRequest);

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
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest);

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
     * @return Result of the CreateTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTemplateAliasResult createTemplateAlias(CreateTemplateAliasRequest createTemplateAliasRequest);

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
     * @return Result of the DeleteDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest);

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
     * @return Result of the DeleteDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSetResult deleteDataSet(DeleteDataSetRequest deleteDataSetRequest);

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
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

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
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

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
     * @return Result of the DeleteGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGroupMembershipResult deleteGroupMembership(DeleteGroupMembershipRequest deleteGroupMembershipRequest);

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
     * @return Result of the DeleteIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in an "actionable" state that must complete before a new update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignment(DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest);

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
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest);

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
     * @return Result of the DeleteTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTemplateAliasResult deleteTemplateAlias(DeleteTemplateAliasRequest deleteTemplateAliasRequest);

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
     * @return Result of the DeleteUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

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
     * @return Result of the DeleteUserByPrincipalId operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteUserByPrincipalId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserByPrincipalIdResult deleteUserByPrincipalId(DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest);

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
     * @return Result of the DescribeDashboard operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboard" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDashboardResult describeDashboard(DescribeDashboardRequest describeDashboardRequest);

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
     * @return Result of the DescribeDashboardPermissions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest);

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
     * @return Result of the DescribeDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDataSetResult describeDataSet(DescribeDataSetRequest describeDataSetRequest);

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
     * @return Result of the DescribeDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataSetPermissionsResult describeDataSetPermissions(DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest);

    /**
     * <p>
     * Describes a data source.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest describeDataSourceRequest);

    /**
     * <p>
     * Describes the resource permissions for a data source.
     * </p>
     * <p>
     * The permissions resource is <code>aws:quicksight:region:aws-account-id:datasource/data-source-id</code>
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @return Result of the DescribeDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataSourcePermissionsResult describeDataSourcePermissions(DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest);

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
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest);

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
     * @return Result of the DescribeIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeIAMPolicyAssignmentResult describeIAMPolicyAssignment(DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @return Result of the DescribeIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIngestion" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIngestionResult describeIngestion(DescribeIngestionRequest describeIngestionRequest);

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
     * @return Result of the DescribeTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTemplateResult describeTemplate(DescribeTemplateRequest describeTemplateRequest);

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
     * @return Result of the DescribeTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTemplateAliasResult describeTemplateAlias(DescribeTemplateAliasRequest describeTemplateAliasRequest);

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
     * @return Result of the DescribeTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTemplatePermissionsResult describeTemplatePermissions(DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest);

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
     * @return Result of the DescribeUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

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
     * @return Result of the GetDashboardEmbedUrl operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws DomainNotWhitelistedException
     *         The domain specified is not on the allowlist. All domains for embedded dashboards must be added to the
     *         approved list by an Amazon QuickSight admin.
     * @throws QuickSightUserNotFoundException
     *         The user is not found. This error can happen in any operation that requires finding a user based on a
     *         provided user name, such as <code>DeleteUser</code>, <code>DescribeUser</code>, and so on.
     * @throws IdentityTypeNotSupportedException
     *         The identity type specified is not supported. Supported identity types include IAM and QUICKSIGHT.
     * @throws SessionLifetimeInMinutesInvalidException
     *         The number of minutes specified for the lifetime of a session is not valid. The session lifetime must be
     *         from 15 to 600 minutes.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.GetDashboardEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetDashboardEmbedUrl"
     *      target="_top">AWS API Documentation</a>
     */
    GetDashboardEmbedUrlResult getDashboardEmbedUrl(GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest);

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
     * @return Result of the ListDashboardVersions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDashboardVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboardVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDashboardVersionsResult listDashboardVersions(ListDashboardVersionsRequest listDashboardVersionsRequest);

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
     * @return Result of the ListDashboards operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDashboards" target="_top">AWS API
     *      Documentation</a>
     */
    ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest);

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
     * @return Result of the ListDataSets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest);

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
     * @return Result of the ListDataSources operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

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
     * @return Result of the ListGroupMemberships operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupMembershipsResult listGroupMemberships(ListGroupMembershipsRequest listGroupMembershipsRequest);

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
     * @return Result of the ListGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

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
     * @return Result of the ListIAMPolicyAssignments operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIAMPolicyAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    ListIAMPolicyAssignmentsResult listIAMPolicyAssignments(ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest);

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
     * @return Result of the ListIAMPolicyAssignmentsForUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in an "actionable" state that must complete before a new update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIAMPolicyAssignmentsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignmentsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    ListIAMPolicyAssignmentsForUserResult listIAMPolicyAssignmentsForUser(ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest);

    /**
     * <p>
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return Result of the ListIngestions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListIngestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIngestions" target="_top">AWS API
     *      Documentation</a>
     */
    ListIngestionsResult listIngestions(ListIngestionsRequest listIngestionsRequest);

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the ListTemplateAliases operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplateAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateAliases" target="_top">AWS
     *      API Documentation</a>
     */
    ListTemplateAliasesResult listTemplateAliases(ListTemplateAliasesRequest listTemplateAliasesRequest);

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
     * @return Result of the ListTemplateVersions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListTemplateVersionsResult listTemplateVersions(ListTemplateVersionsRequest listTemplateVersionsRequest);

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
     * @return Result of the ListTemplates operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest);

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
     * @return Result of the ListUserGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUserGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListUserGroupsResult listUserGroups(ListUserGroupsRequest listUserGroupsRequest);

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
     * @return Result of the ListUsers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

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
     * @return Result of the RegisterUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.RegisterUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterUserResult registerUser(RegisterUserRequest registerUserRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboard" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest);

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
     * @return Result of the UpdateDashboardPermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboardPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDashboardPermissionsResult updateDashboardPermissions(UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest);

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
     * @return Result of the UpdateDashboardPublishedVersion operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDashboardPublishedVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPublishedVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDashboardPublishedVersionResult updateDashboardPublishedVersion(UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest);

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
     * @return Result of the UpdateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSetResult updateDataSet(UpdateDataSetRequest updateDataSetRequest);

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
     * @return Result of the UpdateDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSetPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSetPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDataSetPermissionsResult updateDataSetPermissions(UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest);

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
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

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
     * @return Result of the UpdateDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateDataSourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDataSourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest);

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
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws PreconditionNotMetException
     *         One or more preconditions aren't met.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

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
     * @return Result of the UpdateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in an "actionable" state that must complete before a new update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIAMPolicyAssignmentResult updateIAMPolicyAssignment(UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest);

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
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest);

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
     * @return Result of the UpdateTemplateAlias operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTemplateAliasResult updateTemplateAlias(UpdateTemplateAliasRequest updateTemplateAliasRequest);

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
     * @return Result of the UpdateTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplatePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTemplatePermissionsResult updateTemplatePermissions(UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest);

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
     * @return Result of the UpdateUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Ensure that your account is authorized to use the Amazon QuickSight
     *         service, that your policies have the correct permissions, and that you are using the correct access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters don't have a valid value.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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
