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
 * Amazon QuickSight is a fully managed, serverless business intelligence service for the AWS Cloud that makes it easy
 * to extend data and insights to every user in your organization. This API reference contains documentation for a
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
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return Result of the CancelIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @return Result of the CreateAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAccountCustomizationResult createAccountCustomization(CreateAccountCustomizationRequest createAccountCustomizationRequest);

    /**
     * <p>
     * Creates an analysis in Amazon QuickSight.
     * </p>
     * 
     * @param createAnalysisRequest
     * @return Result of the CreateAnalysis operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.CreateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAnalysisResult createAnalysis(CreateAnalysisRequest createAnalysisRequest);

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
     * @return Result of the CreateDashboard operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param createDataSetRequest
     * @return Result of the CreateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param createGroupRequest
     *        The request object for this operation.
     * @return Result of the CreateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param createGroupMembershipRequest
     * @return Result of the CreateGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy
     * will be assigned to specified groups or users of Amazon QuickSight. The users and groups need to be in the same
     * namespace.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @return Result of the CreateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
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
     * Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an
     * example, see <a href="https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/">How do I
     * create an IAM policy to control access to Amazon EC2 resources using tags?</a> in the AWS Knowledge Center. Tags
     * are visible on the tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @return Result of the CreateIngestion operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @return Result of the CreateNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNamespaceResult createNamespace(CreateNamespaceRequest createNamespaceRequest);

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
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
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
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
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
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTemplateAliasResult createTemplateAlias(CreateTemplateAliasRequest createTemplateAliasRequest);

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
     * @return Result of the CreateTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.CreateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    CreateThemeResult createTheme(CreateThemeRequest createThemeRequest);

    /**
     * <p>
     * Creates a theme alias for a theme.
     * </p>
     * 
     * @param createThemeAliasRequest
     * @return Result of the CreateThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.CreateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateThemeAliasResult createThemeAlias(CreateThemeAliasRequest createThemeAliasRequest);

    /**
     * <p>
     * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight
     * namespace.
     * </p>
     * 
     * @param deleteAccountCustomizationRequest
     * @return Result of the DeleteAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DeleteAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccountCustomizationResult deleteAccountCustomization(DeleteAccountCustomizationRequest deleteAccountCustomizationRequest);

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
     * @return Result of the DeleteAnalysis operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAnalysisResult deleteAnalysis(DeleteAnalysisRequest deleteAnalysisRequest);

    /**
     * <p>
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return Result of the DeleteDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param deleteDataSetRequest
     * @return Result of the DeleteDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data
     * source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param deleteGroupMembershipRequest
     * @return Result of the DeleteGroupMembership operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @return Result of the DeleteIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignment(DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous
     * process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these
     * assets, you use the API operations for the relevant asset.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the
     * version of the template that the alias points to.
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
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DeleteTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTemplateAliasResult deleteTemplateAlias(DeleteTemplateAliasRequest deleteTemplateAliasRequest);

    /**
     * <p>
     * Deletes a theme.
     * </p>
     * 
     * @param deleteThemeRequest
     * @return Result of the DeleteTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTheme" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteThemeResult deleteTheme(DeleteThemeRequest deleteThemeRequest);

    /**
     * <p>
     * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you
     * delete the version of the theme that the alias points to.
     * </p>
     * 
     * @param deleteThemeAliasRequest
     * @return Result of the DeleteThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteThemeAliasResult deleteThemeAlias(DeleteThemeAliasRequest deleteThemeAliasRequest);

    /**
     * <p>
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management
     * (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest
     * @return Result of the DeleteUserByPrincipalId operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DeleteUserByPrincipalId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteUserByPrincipalId"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUserByPrincipalIdResult deleteUserByPrincipalId(DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest);

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
     * @return Result of the DescribeAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountCustomizationResult describeAccountCustomization(DescribeAccountCustomizationRequest describeAccountCustomizationRequest);

    /**
     * <p>
     * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @return Result of the DescribeAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountSettingsResult describeAccountSettings(DescribeAccountSettingsRequest describeAccountSettingsRequest);

    /**
     * <p>
     * Provides a summary of the metadata for an analysis.
     * </p>
     * 
     * @param describeAnalysisRequest
     * @return Result of the DescribeAnalysis operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.DescribeAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAnalysisResult describeAnalysis(DescribeAnalysisRequest describeAnalysisRequest);

    /**
     * <p>
     * Provides the read and write permissions for an analysis.
     * </p>
     * 
     * @param describeAnalysisPermissionsRequest
     * @return Result of the DescribeAnalysisPermissions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DescribeAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAnalysisPermissionsResult describeAnalysisPermissions(DescribeAnalysisPermissionsRequest describeAnalysisPermissionsRequest);

    /**
     * <p>
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return Result of the DescribeDashboard operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
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
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @return Result of the DescribeDashboardPermissions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param describeDataSetRequest
     * @return Result of the DescribeDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @return Result of the DescribeDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param describeDataSourcePermissionsRequest
     * @return Result of the DescribeDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Describes an existing IAM policy assignment, as specified by the assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @return Result of the DescribeIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Describes the current namespace.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return Result of the DescribeNamespace operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeNamespaceResult describeNamespace(DescribeNamespaceRequest describeNamespaceRequest);

    /**
     * <p>
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @return Result of the DescribeTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
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
     * Describes the template alias for a template.
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
     * 
     * @param describeTemplatePermissionsRequest
     * @return Result of the DescribeTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Describes a theme.
     * </p>
     * 
     * @param describeThemeRequest
     * @return Result of the DescribeTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DescribeTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTheme" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeThemeResult describeTheme(DescribeThemeRequest describeThemeRequest);

    /**
     * <p>
     * Describes the alias for a theme.
     * </p>
     * 
     * @param describeThemeAliasRequest
     * @return Result of the DescribeThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DescribeThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeThemeAliasResult describeThemeAlias(DescribeThemeAliasRequest describeThemeAliasRequest);

    /**
     * <p>
     * Describes the read and write permissions for a theme.
     * </p>
     * 
     * @param describeThemePermissionsRequest
     * @return Result of the DescribeThemePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DescribeThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeThemePermissionsResult describeThemePermissions(DescribeThemePermissionsRequest describeThemePermissionsRequest);

    /**
     * <p>
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

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
     * @return Result of the GetDashboardEmbedUrl operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws DomainNotWhitelistedException
     *         The domain specified isn't on the allow list. All domains for embedded dashboards must be added to the
     *         approved list by an Amazon QuickSight admin.
     * @throws QuickSightUserNotFoundException
     *         The user with the provided name isn't found. This error can happen in any operation that requires finding
     *         a user based on a provided user name, such as <code>DeleteUser</code>, <code>DescribeUser</code>, and so
     *         on.
     * @throws IdentityTypeNotSupportedException
     *         The identity type specified isn't supported. Supported identity types include <code>IAM</code> and
     *         <code>QUICKSIGHT</code>.
     * @throws SessionLifetimeInMinutesInvalidException
     *         The number of minutes specified for the lifetime of a session isn't valid. The session lifetime must be
     *         15-600 minutes.
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
     * @return Result of the GetSessionEmbedUrl operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws QuickSightUserNotFoundException
     *         The user with the provided name isn't found. This error can happen in any operation that requires finding
     *         a user based on a provided user name, such as <code>DeleteUser</code>, <code>DescribeUser</code>, and so
     *         on.
     * @throws SessionLifetimeInMinutesInvalidException
     *         The number of minutes specified for the lifetime of a session isn't valid. The session lifetime must be
     *         15-600 minutes.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.GetSessionEmbedUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GetSessionEmbedUrl" target="_top">AWS
     *      API Documentation</a>
     */
    GetSessionEmbedUrlResult getSessionEmbedUrl(GetSessionEmbedUrlRequest getSessionEmbedUrlRequest);

    /**
     * <p>
     * Lists Amazon QuickSight analyses that exist in the specified AWS account.
     * </p>
     * 
     * @param listAnalysesRequest
     * @return Result of the ListAnalyses operation returned by the service.
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
     * @sample AmazonQuickSight.ListAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    ListAnalysesResult listAnalyses(ListAnalysesRequest listAnalysesRequest);

    /**
     * <p>
     * Lists all the versions of the dashboards in the QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @return Result of the ListDashboardVersions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists dashboards in an AWS account.
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
     * Lists all of the datasets belonging to the current AWS account in an AWS Region.
     * </p>
     * <p>
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return Result of the ListDataSets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists data sources in current AWS Region that belong to this AWS account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param listGroupMembershipsRequest
     * @return Result of the ListGroupMemberships operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @return Result of the ListIAMPolicyAssignments operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to
     * the specified user and group or groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @return Result of the ListIAMPolicyAssignmentsForUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
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
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists the namespaces for the specified AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListNamespaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListNamespacesResult listNamespaces(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param listTemplateAliasesRequest
     * @return Result of the ListTemplateAliases operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
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
     * Lists all the versions of the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return Result of the ListTemplateVersions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Lists all the aliases of a theme.
     * </p>
     * 
     * @param listThemeAliasesRequest
     * @return Result of the ListThemeAliases operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.ListThemeAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeAliases" target="_top">AWS
     *      API Documentation</a>
     */
    ListThemeAliasesResult listThemeAliases(ListThemeAliasesRequest listThemeAliasesRequest);

    /**
     * <p>
     * Lists all the versions of the themes in the current AWS account.
     * </p>
     * 
     * @param listThemeVersionsRequest
     * @return Result of the ListThemeVersions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.ListThemeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListThemeVersionsResult listThemeVersions(ListThemeVersionsRequest listThemeVersionsRequest);

    /**
     * <p>
     * Lists all the themes in the current AWS account.
     * </p>
     * 
     * @param listThemesRequest
     * @return Result of the ListThemes operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
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
     * @sample AmazonQuickSight.ListThemes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemes" target="_top">AWS API
     *      Documentation</a>
     */
    ListThemesResult listThemes(ListThemesRequest listThemesRequest);

    /**
     * <p>
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @return Result of the ListUserGroups operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.ListUserGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListUserGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListUserGroupsResult listUserGroups(ListUserGroupsRequest listUserGroupsRequest);

    /**
     * <p>
     * Returns a list of all of the Amazon QuickSight users belonging to this account.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param registerUserRequest
     * @return Result of the RegisterUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Restores an analysis.
     * </p>
     * 
     * @param restoreAnalysisRequest
     * @return Result of the RestoreAnalysis operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.RestoreAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RestoreAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    RestoreAnalysisResult restoreAnalysis(RestoreAnalysisRequest restoreAnalysisRequest);

    /**
     * <p>
     * Searches for analyses that belong to the user specified in the filter.
     * </p>
     * 
     * @param searchAnalysesRequest
     * @return Result of the SearchAnalyses operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.SearchAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchAnalyses" target="_top">AWS API
     *      Documentation</a>
     */
    SearchAnalysesResult searchAnalyses(SearchAnalysesRequest searchAnalysesRequest);

    /**
     * <p>
     * Searches for dashboards that belong to a user.
     * </p>
     * 
     * @param searchDashboardsRequest
     * @return Result of the SearchDashboards operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws UnsupportedUserEditionException
     *         This error indicates that you are calling an operation on an Amazon QuickSight subscription where the
     *         edition doesn't include support for that operation. Amazon QuickSight currently has Standard Edition and
     *         Enterprise Edition. Not every operation and capability is available in every edition.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value isn't valid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.SearchDashboards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SearchDashboards" target="_top">AWS
     *      API Documentation</a>
     */
    SearchDashboardsResult searchDashboards(SearchDashboardsRequest searchDashboardsRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         A limit is exceeded.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @return Result of the UpdateAccountCustomization operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateAccountCustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountCustomization"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountCustomizationResult updateAccountCustomization(UpdateAccountCustomizationRequest updateAccountCustomizationRequest);

    /**
     * <p>
     * Updates the Amazon QuickSight settings in your AWS account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ResourceUnavailableException
     *         This resource is currently unavailable.
     * @sample AmazonQuickSight.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Updates an analysis in Amazon QuickSight
     * </p>
     * 
     * @param updateAnalysisRequest
     * @return Result of the UpdateAnalysis operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.UpdateAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysis" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAnalysisResult updateAnalysis(UpdateAnalysisRequest updateAnalysisRequest);

    /**
     * <p>
     * Updates the read and write permissions for an analysis.
     * </p>
     * 
     * @param updateAnalysisPermissionsRequest
     * @return Result of the UpdateAnalysisPermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.UpdateAnalysisPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAnalysisPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAnalysisPermissionsResult updateAnalysisPermissions(UpdateAnalysisPermissionsRequest updateAnalysisPermissionsRequest);

    /**
     * <p>
     * Updates a dashboard in an AWS account.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return Result of the UpdateDashboard operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateDashboardPermissionsRequest
     * @return Result of the UpdateDashboardPermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateDashboardPublishedVersionRequest
     * @return Result of the UpdateDashboardPublishedVersion operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateDataSetRequest
     * @return Result of the UpdateDataSet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * The permissions resource is <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @return Result of the UpdateDataSetPermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateDataSourcePermissionsRequest
     * @return Result of the UpdateDataSourcePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that
     * are specified in the request.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @return Result of the UpdateIAMPolicyAssignment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
     * @throws ResourceExistsException
     *         The resource specified already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws ConcurrentUpdatingException
     *         A resource is already in a state that indicates an operation is happening that must complete before a new
     *         update can be applied.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateIAMPolicyAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateIAMPolicyAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIAMPolicyAssignmentResult updateIAMPolicyAssignment(UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest);

    /**
     * <p>
     * Updates a template from an existing Amazon QuickSight analysis or another template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @sample AmazonQuickSight.UpdateTemplateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTemplateAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTemplateAliasResult updateTemplateAlias(UpdateTemplateAliasRequest updateTemplateAliasRequest);

    /**
     * <p>
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @return Result of the UpdateTemplatePermissions operation returned by the service.
     * @throws ThrottlingException
     *         Access is throttled.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * Updates a theme.
     * </p>
     * 
     * @param updateThemeRequest
     * @return Result of the UpdateTheme operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.UpdateTheme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateThemeResult updateTheme(UpdateThemeRequest updateThemeRequest);

    /**
     * <p>
     * Updates an alias of a theme.
     * </p>
     * 
     * @param updateThemeAliasRequest
     * @return Result of the UpdateThemeAlias operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.UpdateThemeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemeAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateThemeAliasResult updateThemeAlias(UpdateThemeAliasRequest updateThemeAliasRequest);

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
     * @return Result of the UpdateThemePermissions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
     * @sample AmazonQuickSight.UpdateThemePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateThemePermissionsResult updateThemePermissions(UpdateThemePermissionsRequest updateThemePermissionsRequest);

    /**
     * <p>
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have access to this item. The provided credentials couldn't be validated. You might not be
     *         authorized to carry out the request. Make sure that your account is authorized to use the Amazon
     *         QuickSight service, that your policies have the correct permissions, and that you are using the correct
     *         access keys.
     * @throws InvalidParameterValueException
     *         One or more parameters has a value that isn't valid.
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
