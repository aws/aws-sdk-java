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
package com.amazonaws.services.workspaces;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing Amazon WorkSpaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspaces.AbstractAmazonWorkspacesAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows or Amazon Linux desktops for your
 * users, known as <i>WorkSpaces</i>. WorkSpaces eliminates the need to procure and deploy hardware or install complex
 * software. You can quickly add or remove users as your needs change. Users can access their virtual desktops from
 * multiple devices or web browsers.
 * </p>
 * <p>
 * This API Reference provides detailed information about the actions, data types, parameters, and errors of the
 * WorkSpaces service. For more information about the supported Amazon Web Services Regions, endpoints, and service
 * quotas of the Amazon WorkSpaces service, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/wsp.html">WorkSpaces endpoints and quotas</a> in the <i>Amazon
 * Web Services General Reference</i>.
 * </p>
 * <p>
 * You can also manage your WorkSpaces resources using the WorkSpaces console, Command Line Interface (CLI), and SDKs.
 * For more information about administering WorkSpaces, see the <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/">Amazon WorkSpaces Administration Guide</a>. For more
 * information about using the Amazon WorkSpaces client application or web browser to access provisioned WorkSpaces, see
 * the <a href="https://docs.aws.amazon.com/workspaces/latest/userguide/">Amazon WorkSpaces User Guide</a>. For more
 * information about using the CLI to manage your WorkSpaces resources, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/workspaces/index.html">WorkSpaces section of the CLI
 * Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspacesAsync extends AmazonWorkspaces {

    /**
     * <p>
     * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param associateConnectionAliasRequest
     * @return A Java Future containing the result of the AssociateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsync.AssociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectionAliasResult> associateConnectionAliasAsync(AssociateConnectionAliasRequest associateConnectionAliasRequest);

    /**
     * <p>
     * Associates the specified connection alias with the specified directory to enable cross-Region redirection. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param associateConnectionAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.AssociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectionAliasResult> associateConnectionAliasAsync(AssociateConnectionAliasRequest associateConnectionAliasRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateConnectionAliasRequest, AssociateConnectionAliasResult> asyncHandler);

    /**
     * <p>
     * Associates the specified IP access control group with the specified directory.
     * </p>
     * 
     * @param associateIpGroupsRequest
     * @return A Java Future containing the result of the AssociateIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsync.AssociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(AssociateIpGroupsRequest associateIpGroupsRequest);

    /**
     * <p>
     * Associates the specified IP access control group with the specified directory.
     * </p>
     * 
     * @param associateIpGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.AssociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateIpGroupsResult> associateIpGroupsAsync(AssociateIpGroupsRequest associateIpGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateIpGroupsRequest, AssociateIpGroupsResult> asyncHandler);

    /**
     * <p>
     * Adds one or more rules to the specified IP access control group.
     * </p>
     * <p>
     * This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
     * rules.
     * </p>
     * 
     * @param authorizeIpRulesRequest
     * @return A Java Future containing the result of the AuthorizeIpRules operation returned by the service.
     * @sample AmazonWorkspacesAsync.AuthorizeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(AuthorizeIpRulesRequest authorizeIpRulesRequest);

    /**
     * <p>
     * Adds one or more rules to the specified IP access control group.
     * </p>
     * <p>
     * This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the
     * rules.
     * </p>
     * 
     * @param authorizeIpRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AuthorizeIpRules operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.AuthorizeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AuthorizeIpRulesResult> authorizeIpRulesAsync(AuthorizeIpRulesRequest authorizeIpRulesRequest,
            com.amazonaws.handlers.AsyncHandler<AuthorizeIpRulesRequest, AuthorizeIpRulesResult> asyncHandler);

    /**
     * <p>
     * Copies the specified image from the specified Region to the current Region. For more information about copying
     * images, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/copy-custom-image.html"> Copy a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services
     * Support.
     * </p>
     * <important>
     * <p>
     * Before copying a shared image, be sure to verify that it has been shared from the correct Amazon Web Services
     * account. To determine if an image has been shared and to see the ID of the Amazon Web Services account that owns
     * an image, use the <a href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html">
     * DescribeWorkSpaceImages</a> and <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImagePermissions.html"
     * >DescribeWorkspaceImagePermissions</a> API operations.
     * </p>
     * </important>
     * 
     * @param copyWorkspaceImageRequest
     * @return A Java Future containing the result of the CopyWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsync.CopyWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CopyWorkspaceImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyWorkspaceImageResult> copyWorkspaceImageAsync(CopyWorkspaceImageRequest copyWorkspaceImageRequest);

    /**
     * <p>
     * Copies the specified image from the specified Region to the current Region. For more information about copying
     * images, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/copy-custom-image.html"> Copy a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services
     * Support.
     * </p>
     * <important>
     * <p>
     * Before copying a shared image, be sure to verify that it has been shared from the correct Amazon Web Services
     * account. To determine if an image has been shared and to see the ID of the Amazon Web Services account that owns
     * an image, use the <a href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html">
     * DescribeWorkSpaceImages</a> and <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImagePermissions.html"
     * >DescribeWorkspaceImagePermissions</a> API operations.
     * </p>
     * </important>
     * 
     * @param copyWorkspaceImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CopyWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CopyWorkspaceImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyWorkspaceImageResult> copyWorkspaceImageAsync(CopyWorkspaceImageRequest copyWorkspaceImageRequest,
            com.amazonaws.handlers.AsyncHandler<CopyWorkspaceImageRequest, CopyWorkspaceImageResult> asyncHandler);

    /**
     * <p>
     * Creates a client-add-in for Amazon Connect within a directory. You can create only one Amazon Connect client
     * add-in within a directory.
     * </p>
     * <p>
     * This client add-in allows WorkSpaces users to seamlessly connect to Amazon Connect.
     * </p>
     * 
     * @param createConnectClientAddInRequest
     * @return A Java Future containing the result of the CreateConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectClientAddInResult> createConnectClientAddInAsync(CreateConnectClientAddInRequest createConnectClientAddInRequest);

    /**
     * <p>
     * Creates a client-add-in for Amazon Connect within a directory. You can create only one Amazon Connect client
     * add-in within a directory.
     * </p>
     * <p>
     * This client add-in allows WorkSpaces users to seamlessly connect to Amazon Connect.
     * </p>
     * 
     * @param createConnectClientAddInRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectClientAddInResult> createConnectClientAddInAsync(CreateConnectClientAddInRequest createConnectClientAddInRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectClientAddInRequest, CreateConnectClientAddInResult> asyncHandler);

    /**
     * <p>
     * Creates the specified connection alias for use with cross-Region redirection. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param createConnectionAliasRequest
     * @return A Java Future containing the result of the CreateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionAliasResult> createConnectionAliasAsync(CreateConnectionAliasRequest createConnectionAliasRequest);

    /**
     * <p>
     * Creates the specified connection alias for use with cross-Region redirection. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param createConnectionAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionAliasResult> createConnectionAliasAsync(CreateConnectionAliasRequest createConnectionAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionAliasRequest, CreateConnectionAliasResult> asyncHandler);

    /**
     * <p>
     * Creates an IP access control group.
     * </p>
     * <p>
     * An IP access control group provides you with the ability to control the IP addresses from which users are allowed
     * to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and
     * then associate the group with your directory. You can add rules when you create the group or at any time using
     * <a>AuthorizeIpRules</a>.
     * </p>
     * <p>
     * There is a default IP access control group associated with your directory. If you don't associate an IP access
     * control group with your directory, the default group is used. The default group includes a default rule that
     * allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for
     * your directory.
     * </p>
     * 
     * @param createIpGroupRequest
     * @return A Java Future containing the result of the CreateIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(CreateIpGroupRequest createIpGroupRequest);

    /**
     * <p>
     * Creates an IP access control group.
     * </p>
     * <p>
     * An IP access control group provides you with the ability to control the IP addresses from which users are allowed
     * to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and
     * then associate the group with your directory. You can add rules when you create the group or at any time using
     * <a>AuthorizeIpRules</a>.
     * </p>
     * <p>
     * There is a default IP access control group associated with your directory. If you don't associate an IP access
     * control group with your directory, the default group is used. The default group includes a default rule that
     * allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for
     * your directory.
     * </p>
     * 
     * @param createIpGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIpGroupResult> createIpGroupAsync(CreateIpGroupRequest createIpGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIpGroupRequest, CreateIpGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a Standby WorkSpace in a secondary region.
     * </p>
     * 
     * @param createStandbyWorkspacesRequest
     * @return A Java Future containing the result of the CreateStandbyWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateStandbyWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateStandbyWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStandbyWorkspacesResult> createStandbyWorkspacesAsync(CreateStandbyWorkspacesRequest createStandbyWorkspacesRequest);

    /**
     * <p>
     * Creates a Standby WorkSpace in a secondary region.
     * </p>
     * 
     * @param createStandbyWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStandbyWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateStandbyWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateStandbyWorkspaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStandbyWorkspacesResult> createStandbyWorkspacesAsync(CreateStandbyWorkspacesRequest createStandbyWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStandbyWorkspacesRequest, CreateStandbyWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Creates the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param createTagsRequest
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param createTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a new updated WorkSpace image based on the specified source image. The new updated WorkSpace image has
     * the latest drivers and other updates required by the Amazon WorkSpaces components.
     * </p>
     * <p>
     * To determine which WorkSpace images need to be updated with the latest Amazon WorkSpaces requirements, use <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html">
     * DescribeWorkspaceImages</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Only Windows 10, Windows Sever 2016, and Windows Server 2019 WorkSpace images can be programmatically updated at
     * this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Microsoft Windows updates and other application updates are not included in the update process.
     * </p>
     * </li>
     * <li>
     * <p>
     * The source WorkSpace image is not deleted. You can delete the source image after you've verified your new updated
     * image and created a new bundle.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUpdatedWorkspaceImageRequest
     * @return A Java Future containing the result of the CreateUpdatedWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateUpdatedWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateUpdatedWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUpdatedWorkspaceImageResult> createUpdatedWorkspaceImageAsync(
            CreateUpdatedWorkspaceImageRequest createUpdatedWorkspaceImageRequest);

    /**
     * <p>
     * Creates a new updated WorkSpace image based on the specified source image. The new updated WorkSpace image has
     * the latest drivers and other updates required by the Amazon WorkSpaces components.
     * </p>
     * <p>
     * To determine which WorkSpace images need to be updated with the latest Amazon WorkSpaces requirements, use <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaceImages.html">
     * DescribeWorkspaceImages</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Only Windows 10, Windows Sever 2016, and Windows Server 2019 WorkSpace images can be programmatically updated at
     * this time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Microsoft Windows updates and other application updates are not included in the update process.
     * </p>
     * </li>
     * <li>
     * <p>
     * The source WorkSpace image is not deleted. You can delete the source image after you've verified your new updated
     * image and created a new bundle.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createUpdatedWorkspaceImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUpdatedWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateUpdatedWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateUpdatedWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUpdatedWorkspaceImageResult> createUpdatedWorkspaceImageAsync(
            CreateUpdatedWorkspaceImageRequest createUpdatedWorkspaceImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUpdatedWorkspaceImageRequest, CreateUpdatedWorkspaceImageResult> asyncHandler);

    /**
     * <p>
     * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/create-custom-bundle.html"> Create a Custom
     * WorkSpaces Image and Bundle</a>.
     * </p>
     * 
     * @param createWorkspaceBundleRequest
     * @return A Java Future containing the result of the CreateWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceBundleResult> createWorkspaceBundleAsync(CreateWorkspaceBundleRequest createWorkspaceBundleRequest);

    /**
     * <p>
     * Creates the specified WorkSpace bundle. For more information about creating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/create-custom-bundle.html"> Create a Custom
     * WorkSpaces Image and Bundle</a>.
     * </p>
     * 
     * @param createWorkspaceBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceBundleResult> createWorkspaceBundleAsync(CreateWorkspaceBundleRequest createWorkspaceBundleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceBundleRequest, CreateWorkspaceBundleResult> asyncHandler);

    /**
     * <p>
     * Creates a new WorkSpace image from an existing WorkSpace.
     * </p>
     * 
     * @param createWorkspaceImageRequest
     * @return A Java Future containing the result of the CreateWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceImageResult> createWorkspaceImageAsync(CreateWorkspaceImageRequest createWorkspaceImageRequest);

    /**
     * <p>
     * Creates a new WorkSpace image from an existing WorkSpace.
     * </p>
     * 
     * @param createWorkspaceImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceImageResult> createWorkspaceImageAsync(CreateWorkspaceImageRequest createWorkspaceImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceImageRequest, CreateWorkspaceImageResult> asyncHandler);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * <note>
     * <p>
     * The <code>MANUAL</code> running mode value is only supported by Amazon WorkSpaces Core. Contact your account team
     * to be allow-listed to use this value. For more information, see <a
     * href="http://aws.amazon.com/workspaces/core/">Amazon WorkSpaces Core</a>.
     * </p>
     * </note>
     * 
     * @param createWorkspacesRequest
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * <note>
     * <p>
     * The <code>MANUAL</code> running mode value is only supported by Amazon WorkSpaces Core. Contact your account team
     * to be allow-listed to use this value. For more information, see <a
     * href="http://aws.amazon.com/workspaces/core/">Amazon WorkSpaces Core</a>.
     * </p>
     * </note>
     * 
     * @param createWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspacesResult> createWorkspacesAsync(CreateWorkspacesRequest createWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Deletes customized client branding. Client branding allows you to customize your WorkSpace's client login portal.
     * You can tailor your login portal company logo, the support email address, support link, link to reset password,
     * and a custom message for users trying to sign in.
     * </p>
     * <p>
     * After you delete your customized client branding, your login portal reverts to the default client branding.
     * </p>
     * 
     * @param deleteClientBrandingRequest
     * @return A Java Future containing the result of the DeleteClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClientBrandingResult> deleteClientBrandingAsync(DeleteClientBrandingRequest deleteClientBrandingRequest);

    /**
     * <p>
     * Deletes customized client branding. Client branding allows you to customize your WorkSpace's client login portal.
     * You can tailor your login portal company logo, the support email address, support link, link to reset password,
     * and a custom message for users trying to sign in.
     * </p>
     * <p>
     * After you delete your customized client branding, your login portal reverts to the default client branding.
     * </p>
     * 
     * @param deleteClientBrandingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClientBrandingResult> deleteClientBrandingAsync(DeleteClientBrandingRequest deleteClientBrandingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClientBrandingRequest, DeleteClientBrandingResult> asyncHandler);

    /**
     * <p>
     * Deletes a client-add-in for Amazon Connect that is configured within a directory.
     * </p>
     * 
     * @param deleteConnectClientAddInRequest
     * @return A Java Future containing the result of the DeleteConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectClientAddInResult> deleteConnectClientAddInAsync(DeleteConnectClientAddInRequest deleteConnectClientAddInRequest);

    /**
     * <p>
     * Deletes a client-add-in for Amazon Connect that is configured within a directory.
     * </p>
     * 
     * @param deleteConnectClientAddInRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectClientAddInResult> deleteConnectClientAddInAsync(DeleteConnectClientAddInRequest deleteConnectClientAddInRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectClientAddInRequest, DeleteConnectClientAddInResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <important>
     * <p>
     * <b>If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your
     * WorkSpaces users, you must take certain precautions to prevent potential security issues.</b> For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html#cross-region-redirection-security-considerations"
     * > Security Considerations if You Stop Using Cross-Region Redirection</a>.
     * </p>
     * </important> <note>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </note>
     * 
     * @param deleteConnectionAliasRequest
     * @return A Java Future containing the result of the DeleteConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionAliasResult> deleteConnectionAliasAsync(DeleteConnectionAliasRequest deleteConnectionAliasRequest);

    /**
     * <p>
     * Deletes the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <important>
     * <p>
     * <b>If you will no longer be using a fully qualified domain name (FQDN) as the registration code for your
     * WorkSpaces users, you must take certain precautions to prevent potential security issues.</b> For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html#cross-region-redirection-security-considerations"
     * > Security Considerations if You Stop Using Cross-Region Redirection</a>.
     * </p>
     * </important> <note>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </note>
     * 
     * @param deleteConnectionAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionAliasResult> deleteConnectionAliasAsync(DeleteConnectionAliasRequest deleteConnectionAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionAliasRequest, DeleteConnectionAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified IP access control group.
     * </p>
     * <p>
     * You cannot delete an IP access control group that is associated with a directory.
     * </p>
     * 
     * @param deleteIpGroupRequest
     * @return A Java Future containing the result of the DeleteIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(DeleteIpGroupRequest deleteIpGroupRequest);

    /**
     * <p>
     * Deletes the specified IP access control group.
     * </p>
     * <p>
     * You cannot delete an IP access control group that is associated with a directory.
     * </p>
     * 
     * @param deleteIpGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIpGroupResult> deleteIpGroupAsync(DeleteIpGroupRequest deleteIpGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIpGroupRequest, DeleteIpGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags from the specified WorkSpaces resource.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags from the specified WorkSpaces resource.
     * </p>
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete_bundle.html"> Delete a Custom WorkSpaces
     * Bundle or Image</a>.
     * </p>
     * 
     * @param deleteWorkspaceBundleRequest
     * @return A Java Future containing the result of the DeleteWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceBundleResult> deleteWorkspaceBundleAsync(DeleteWorkspaceBundleRequest deleteWorkspaceBundleRequest);

    /**
     * <p>
     * Deletes the specified WorkSpace bundle. For more information about deleting WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete_bundle.html"> Delete a Custom WorkSpaces
     * Bundle or Image</a>.
     * </p>
     * 
     * @param deleteWorkspaceBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceBundleResult> deleteWorkspaceBundleAsync(DeleteWorkspaceBundleRequest deleteWorkspaceBundleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceBundleRequest, DeleteWorkspaceBundleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image and unshare the image if it is shared with other accounts.
     * </p>
     * 
     * @param deleteWorkspaceImageRequest
     * @return A Java Future containing the result of the DeleteWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsync.DeleteWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(DeleteWorkspaceImageRequest deleteWorkspaceImageRequest);

    /**
     * <p>
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image and unshare the image if it is shared with other accounts.
     * </p>
     * 
     * @param deleteWorkspaceImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DeleteWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceImageResult> deleteWorkspaceImageAsync(DeleteWorkspaceImageRequest deleteWorkspaceImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceImageRequest, DeleteWorkspaceImageResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister
     * the directory.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">Directory Service pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param deregisterWorkspaceDirectoryRequest
     * @return A Java Future containing the result of the DeregisterWorkspaceDirectory operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DeregisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeregisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterWorkspaceDirectoryResult> deregisterWorkspaceDirectoryAsync(
            DeregisterWorkspaceDirectoryRequest deregisterWorkspaceDirectoryRequest);

    /**
     * <p>
     * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister
     * the directory.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">Directory Service pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param deregisterWorkspaceDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterWorkspaceDirectory operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DeregisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeregisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterWorkspaceDirectoryResult> deregisterWorkspaceDirectoryAsync(
            DeregisterWorkspaceDirectoryRequest deregisterWorkspaceDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterWorkspaceDirectoryRequest, DeregisterWorkspaceDirectoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return A Java Future containing the result of the DescribeAccount operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest describeAccountRequest);

    /**
     * <p>
     * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param describeAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccount operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest describeAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountRequest, DescribeAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the
     * specified account.
     * </p>
     * 
     * @param describeAccountModificationsRequest
     * @return A Java Future containing the result of the DescribeAccountModifications operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeAccountModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(
            DescribeAccountModificationsRequest describeAccountModificationsRequest);

    /**
     * <p>
     * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the
     * specified account.
     * </p>
     * 
     * @param describeAccountModificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountModifications operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeAccountModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountModificationsResult> describeAccountModificationsAsync(
            DescribeAccountModificationsRequest describeAccountModificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountModificationsRequest, DescribeAccountModificationsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified client branding. Client branding allows you to customize the log in page of various
     * device types for your users. You can add your company logo, the support email address, support link, link to
     * reset password, and a custom message for users trying to sign in.
     * </p>
     * <note>
     * <p>
     * Only device types that have branding information configured will be shown in the response.
     * </p>
     * </note>
     * 
     * @param describeClientBrandingRequest
     * @return A Java Future containing the result of the DescribeClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClientBrandingResult> describeClientBrandingAsync(DescribeClientBrandingRequest describeClientBrandingRequest);

    /**
     * <p>
     * Describes the specified client branding. Client branding allows you to customize the log in page of various
     * device types for your users. You can add your company logo, the support email address, support link, link to
     * reset password, and a custom message for users trying to sign in.
     * </p>
     * <note>
     * <p>
     * Only device types that have branding information configured will be shown in the response.
     * </p>
     * </note>
     * 
     * @param describeClientBrandingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClientBrandingResult> describeClientBrandingAsync(DescribeClientBrandingRequest describeClientBrandingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClientBrandingRequest, DescribeClientBrandingResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param describeClientPropertiesRequest
     * @return A Java Future containing the result of the DescribeClientProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(DescribeClientPropertiesRequest describeClientPropertiesRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param describeClientPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClientProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClientPropertiesResult> describeClientPropertiesAsync(DescribeClientPropertiesRequest describeClientPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClientPropertiesRequest, DescribeClientPropertiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of Amazon Connect client add-ins that have been created.
     * </p>
     * 
     * @param describeConnectClientAddInsRequest
     * @return A Java Future containing the result of the DescribeConnectClientAddIns operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeConnectClientAddIns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectClientAddIns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectClientAddInsResult> describeConnectClientAddInsAsync(
            DescribeConnectClientAddInsRequest describeConnectClientAddInsRequest);

    /**
     * <p>
     * Retrieves a list of Amazon Connect client add-ins that have been created.
     * </p>
     * 
     * @param describeConnectClientAddInsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectClientAddIns operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeConnectClientAddIns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectClientAddIns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectClientAddInsResult> describeConnectClientAddInsAsync(
            DescribeConnectClientAddInsRequest describeConnectClientAddInsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectClientAddInsRequest, DescribeConnectClientAddInsResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions that the owner of a connection alias has granted to another Amazon Web Services account
     * for the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasPermissionsRequest
     * @return A Java Future containing the result of the DescribeConnectionAliasPermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeConnectionAliasPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliasPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionAliasPermissionsResult> describeConnectionAliasPermissionsAsync(
            DescribeConnectionAliasPermissionsRequest describeConnectionAliasPermissionsRequest);

    /**
     * <p>
     * Describes the permissions that the owner of a connection alias has granted to another Amazon Web Services account
     * for the specified connection alias. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectionAliasPermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeConnectionAliasPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliasPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionAliasPermissionsResult> describeConnectionAliasPermissionsAsync(
            DescribeConnectionAliasPermissionsRequest describeConnectionAliasPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionAliasPermissionsRequest, DescribeConnectionAliasPermissionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information,
     * see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html">
     * Cross-Region Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasesRequest
     * @return A Java Future containing the result of the DescribeConnectionAliases operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeConnectionAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionAliasesResult> describeConnectionAliasesAsync(
            DescribeConnectionAliasesRequest describeConnectionAliasesRequest);

    /**
     * <p>
     * Retrieves a list that describes the connection aliases used for cross-Region redirection. For more information,
     * see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html">
     * Cross-Region Redirection for Amazon WorkSpaces</a>.
     * </p>
     * 
     * @param describeConnectionAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectionAliases operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeConnectionAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeConnectionAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionAliasesResult> describeConnectionAliasesAsync(
            DescribeConnectionAliasesRequest describeConnectionAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionAliasesRequest, DescribeConnectionAliasesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your IP access control groups.
     * </p>
     * 
     * @param describeIpGroupsRequest
     * @return A Java Future containing the result of the DescribeIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(DescribeIpGroupsRequest describeIpGroupsRequest);

    /**
     * <p>
     * Describes one or more of your IP access control groups.
     * </p>
     * 
     * @param describeIpGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIpGroupsResult> describeIpGroupsAsync(DescribeIpGroupsRequest describeIpGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIpGroupsRequest, DescribeIpGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param describeTagsRequest
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param describeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

    /**
     * <p>
     * Retrieves a list that describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceBundles operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation with an AsyncHandler.
     *
     * @see #describeWorkspaceBundlesAsync(DescribeWorkspaceBundlesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler);

    /**
     * <p>
     * Describes the available directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

    /**
     * <p>
     * Describes the available directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceDirectories operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation with an AsyncHandler.
     *
     * @see #describeWorkspaceDirectoriesAsync(DescribeWorkspaceDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions that the owner of an image has granted to other Amazon Web Services accounts for an
     * image.
     * </p>
     * 
     * @param describeWorkspaceImagePermissionsRequest
     * @return A Java Future containing the result of the DescribeWorkspaceImagePermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceImagePermissionsResult> describeWorkspaceImagePermissionsAsync(
            DescribeWorkspaceImagePermissionsRequest describeWorkspaceImagePermissionsRequest);

    /**
     * <p>
     * Describes the permissions that the owner of an image has granted to other Amazon Web Services accounts for an
     * image.
     * </p>
     * 
     * @param describeWorkspaceImagePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceImagePermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceImagePermissionsResult> describeWorkspaceImagePermissionsAsync(
            DescribeWorkspaceImagePermissionsRequest describeWorkspaceImagePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceImagePermissionsRequest, DescribeWorkspaceImagePermissionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
     * all images in the account are described.
     * </p>
     * 
     * @param describeWorkspaceImagesRequest
     * @return A Java Future containing the result of the DescribeWorkspaceImages operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(DescribeWorkspaceImagesRequest describeWorkspaceImagesRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
     * all images in the account are described.
     * </p>
     * 
     * @param describeWorkspaceImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceImages operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceImagesResult> describeWorkspaceImagesAsync(DescribeWorkspaceImagesRequest describeWorkspaceImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceImagesRequest, DescribeWorkspaceImagesResult> asyncHandler);

    /**
     * <p>
     * Describes the snapshots for the specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspaceSnapshotsRequest
     * @return A Java Future containing the result of the DescribeWorkspaceSnapshots operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceSnapshotsResult> describeWorkspaceSnapshotsAsync(
            DescribeWorkspaceSnapshotsRequest describeWorkspaceSnapshotsRequest);

    /**
     * <p>
     * Describes the snapshots for the specified WorkSpace.
     * </p>
     * 
     * @param describeWorkspaceSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceSnapshots operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceSnapshotsResult> describeWorkspaceSnapshotsAsync(
            DescribeWorkspaceSnapshotsRequest describeWorkspaceSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceSnapshotsRequest, DescribeWorkspaceSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
     * only one filter at a time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest);

    /**
     * <p>
     * Describes the specified WorkSpaces.
     * </p>
     * <p>
     * You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify
     * only one filter at a time.
     * </p>
     * 
     * @param describeWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(DescribeWorkspacesRequest describeWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest)
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync();

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation with an AsyncHandler.
     *
     * @see #describeWorkspacesAsync(DescribeWorkspacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspacesConnectionStatus operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspacesConnectionStatusResult> describeWorkspacesConnectionStatusAsync(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspacesConnectionStatusRequest, DescribeWorkspacesConnectionStatusResult> asyncHandler);

    /**
     * <p>
     * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region
     * redirection between two directories in different Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param disassociateConnectionAliasRequest
     * @return A Java Future containing the result of the DisassociateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsync.DisassociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectionAliasResult> disassociateConnectionAliasAsync(
            DisassociateConnectionAliasRequest disassociateConnectionAliasRequest);

    /**
     * <p>
     * Disassociates a connection alias from a directory. Disassociating a connection alias disables cross-Region
     * redirection between two directories in different Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </note>
     * 
     * @param disassociateConnectionAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConnectionAlias operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DisassociateConnectionAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateConnectionAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectionAliasResult> disassociateConnectionAliasAsync(
            DisassociateConnectionAliasRequest disassociateConnectionAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectionAliasRequest, DisassociateConnectionAliasResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified IP access control group from the specified directory.
     * </p>
     * 
     * @param disassociateIpGroupsRequest
     * @return A Java Future containing the result of the DisassociateIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsync.DisassociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(DisassociateIpGroupsRequest disassociateIpGroupsRequest);

    /**
     * <p>
     * Disassociates the specified IP access control group from the specified directory.
     * </p>
     * 
     * @param disassociateIpGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateIpGroups operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.DisassociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateIpGroupsResult> disassociateIpGroupsAsync(DisassociateIpGroupsRequest disassociateIpGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateIpGroupsRequest, DisassociateIpGroupsResult> asyncHandler);

    /**
     * <p>
     * Imports client branding. Client branding allows you to customize your WorkSpace's client login portal. You can
     * tailor your login portal company logo, the support email address, support link, link to reset password, and a
     * custom message for users trying to sign in.
     * </p>
     * <p>
     * After you import client branding, the default branding experience for the specified platform type is replaced
     * with the imported experience
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must specify at least one platform type when importing client branding.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can import up to 6 MB of data with each request. If your request exceeds this limit, you can import client
     * branding for different platform types using separate requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify only one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Imported data can take up to a minute to appear in the WorkSpaces client.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param importClientBrandingRequest
     * @return A Java Future containing the result of the ImportClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsync.ImportClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportClientBrandingResult> importClientBrandingAsync(ImportClientBrandingRequest importClientBrandingRequest);

    /**
     * <p>
     * Imports client branding. Client branding allows you to customize your WorkSpace's client login portal. You can
     * tailor your login portal company logo, the support email address, support link, link to reset password, and a
     * custom message for users trying to sign in.
     * </p>
     * <p>
     * After you import client branding, the default branding experience for the specified platform type is replaced
     * with the imported experience
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must specify at least one platform type when importing client branding.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can import up to 6 MB of data with each request. If your request exceeds this limit, you can import client
     * branding for different platform types using separate requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In each platform type, the <code>SupportEmail</code> and <code>SupportLink</code> parameters are mutually
     * exclusive. You can specify only one parameter for each platform type, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Imported data can take up to a minute to appear in the WorkSpaces client.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param importClientBrandingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportClientBranding operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ImportClientBranding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportClientBranding"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportClientBrandingResult> importClientBrandingAsync(ImportClientBrandingRequest importClientBrandingRequest,
            com.amazonaws.handlers.AsyncHandler<ImportClientBrandingRequest, ImportClientBrandingResult> asyncHandler);

    /**
     * <p>
     * Imports the specified Windows 10 Bring Your Own License (BYOL) or Windows Server 2016 BYOL image into Amazon
     * WorkSpaces. The image must be an already licensed Amazon EC2 image that is in your Amazon Web Services account,
     * and you must own the image. For more information about creating BYOL images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html"> Bring Your Own Windows
     * Desktop Licenses</a>.
     * </p>
     * 
     * @param importWorkspaceImageRequest
     * @return A Java Future containing the result of the ImportWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsync.ImportWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(ImportWorkspaceImageRequest importWorkspaceImageRequest);

    /**
     * <p>
     * Imports the specified Windows 10 Bring Your Own License (BYOL) or Windows Server 2016 BYOL image into Amazon
     * WorkSpaces. The image must be an already licensed Amazon EC2 image that is in your Amazon Web Services account,
     * and you must own the image. For more information about creating BYOL images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html"> Bring Your Own Windows
     * Desktop Licenses</a>.
     * </p>
     * 
     * @param importWorkspaceImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportWorkspaceImage operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ImportWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportWorkspaceImageResult> importWorkspaceImageAsync(ImportWorkspaceImageRequest importWorkspaceImageRequest,
            com.amazonaws.handlers.AsyncHandler<ImportWorkspaceImageRequest, ImportWorkspaceImageResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
     * interface when you enable Bring Your Own License (BYOL).
     * </p>
     * <p>
     * This operation can be run only by Amazon Web Services accounts that are enabled for BYOL. If your account isn't
     * enabled for BYOL, you'll receive an <code>AccessDeniedException</code> error.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param listAvailableManagementCidrRangesRequest
     * @return A Java Future containing the result of the ListAvailableManagementCidrRanges operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.ListAvailableManagementCidrRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            ListAvailableManagementCidrRangesRequest listAvailableManagementCidrRangesRequest);

    /**
     * <p>
     * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management
     * interface when you enable Bring Your Own License (BYOL).
     * </p>
     * <p>
     * This operation can be run only by Amazon Web Services accounts that are enabled for BYOL. If your account isn't
     * enabled for BYOL, you'll receive an <code>AccessDeniedException</code> error.
     * </p>
     * <p>
     * The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for
     * interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to
     * manage the WorkSpace.
     * </p>
     * 
     * @param listAvailableManagementCidrRangesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableManagementCidrRanges operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.ListAvailableManagementCidrRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableManagementCidrRangesResult> listAvailableManagementCidrRangesAsync(
            ListAvailableManagementCidrRangesRequest listAvailableManagementCidrRangesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableManagementCidrRangesRequest, ListAvailableManagementCidrRangesResult> asyncHandler);

    /**
     * <p>
     * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user
     * volume.
     * </p>
     * <p>
     * The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the
     * user volume from the last available snapshot of the original WorkSpace. During migration, the original
     * <code>D:\Users\%USERNAME%</code> user profile folder is renamed to
     * <code>D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated</code>. A new <code>D:\Users\%USERNAME%\</code> folder is
     * generated by the new OS. Certain files in the old user profile are moved to the new user profile.
     * </p>
     * <p>
     * For available migration scenarios, details about what happens during migration, and best practices, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/migrate-workspaces.html">Migrate a WorkSpace</a>.
     * </p>
     * 
     * @param migrateWorkspaceRequest
     * @return A Java Future containing the result of the MigrateWorkspace operation returned by the service.
     * @sample AmazonWorkspacesAsync.MigrateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<MigrateWorkspaceResult> migrateWorkspaceAsync(MigrateWorkspaceRequest migrateWorkspaceRequest);

    /**
     * <p>
     * Migrates a WorkSpace from one operating system or bundle type to another, while retaining the data on the user
     * volume.
     * </p>
     * <p>
     * The migration process recreates the WorkSpace by using a new root volume from the target bundle image and the
     * user volume from the last available snapshot of the original WorkSpace. During migration, the original
     * <code>D:\Users\%USERNAME%</code> user profile folder is renamed to
     * <code>D:\Users\%USERNAME%MMddyyTHHmmss%.NotMigrated</code>. A new <code>D:\Users\%USERNAME%\</code> folder is
     * generated by the new OS. Certain files in the old user profile are moved to the new user profile.
     * </p>
     * <p>
     * For available migration scenarios, details about what happens during migration, and best practices, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/migrate-workspaces.html">Migrate a WorkSpace</a>.
     * </p>
     * 
     * @param migrateWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MigrateWorkspace operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.MigrateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/MigrateWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<MigrateWorkspaceResult> migrateWorkspaceAsync(MigrateWorkspaceRequest migrateWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<MigrateWorkspaceRequest, MigrateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param modifyAccountRequest
     * @return A Java Future containing the result of the ModifyAccount operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(ModifyAccountRequest modifyAccountRequest);

    /**
     * <p>
     * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
     * </p>
     * 
     * @param modifyAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyAccount operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyAccountResult> modifyAccountAsync(ModifyAccountRequest modifyAccountRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyAccountRequest, ModifyAccountResult> asyncHandler);

    /**
     * <p>
     * Modifies the properties of the certificate-based authentication you want to use with your WorkSpaces.
     * </p>
     * 
     * @param modifyCertificateBasedAuthPropertiesRequest
     * @return A Java Future containing the result of the ModifyCertificateBasedAuthProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.ModifyCertificateBasedAuthProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyCertificateBasedAuthProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCertificateBasedAuthPropertiesResult> modifyCertificateBasedAuthPropertiesAsync(
            ModifyCertificateBasedAuthPropertiesRequest modifyCertificateBasedAuthPropertiesRequest);

    /**
     * <p>
     * Modifies the properties of the certificate-based authentication you want to use with your WorkSpaces.
     * </p>
     * 
     * @param modifyCertificateBasedAuthPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCertificateBasedAuthProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyCertificateBasedAuthProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyCertificateBasedAuthProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyCertificateBasedAuthPropertiesResult> modifyCertificateBasedAuthPropertiesAsync(
            ModifyCertificateBasedAuthPropertiesRequest modifyCertificateBasedAuthPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyCertificateBasedAuthPropertiesRequest, ModifyCertificateBasedAuthPropertiesResult> asyncHandler);

    /**
     * <p>
     * Modifies the properties of the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param modifyClientPropertiesRequest
     * @return A Java Future containing the result of the ModifyClientProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(ModifyClientPropertiesRequest modifyClientPropertiesRequest);

    /**
     * <p>
     * Modifies the properties of the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param modifyClientPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyClientProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyClientPropertiesResult> modifyClientPropertiesAsync(ModifyClientPropertiesRequest modifyClientPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClientPropertiesRequest, ModifyClientPropertiesResult> asyncHandler);

    /**
     * <p>
     * Modifies multiple properties related to SAML 2.0 authentication, including the enablement status, user access
     * URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
     * </p>
     * 
     * @param modifySamlPropertiesRequest
     * @return A Java Future containing the result of the ModifySamlProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifySamlProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySamlProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySamlPropertiesResult> modifySamlPropertiesAsync(ModifySamlPropertiesRequest modifySamlPropertiesRequest);

    /**
     * <p>
     * Modifies multiple properties related to SAML 2.0 authentication, including the enablement status, user access
     * URL, and relay state parameter name that are used for configuring federation with an SAML 2.0 identity provider.
     * </p>
     * 
     * @param modifySamlPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySamlProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifySamlProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySamlProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySamlPropertiesResult> modifySamlPropertiesAsync(ModifySamlPropertiesRequest modifySamlPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySamlPropertiesRequest, ModifySamlPropertiesResult> asyncHandler);

    /**
     * <p>
     * Modifies the self-service WorkSpace management capabilities for your users. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html"
     * >Enable Self-Service WorkSpace Management Capabilities for Your Users</a>.
     * </p>
     * 
     * @param modifySelfservicePermissionsRequest
     * @return A Java Future containing the result of the ModifySelfservicePermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.ModifySelfservicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySelfservicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySelfservicePermissionsResult> modifySelfservicePermissionsAsync(
            ModifySelfservicePermissionsRequest modifySelfservicePermissionsRequest);

    /**
     * <p>
     * Modifies the self-service WorkSpace management capabilities for your users. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/enable-user-self-service-workspace-management.html"
     * >Enable Self-Service WorkSpace Management Capabilities for Your Users</a>.
     * </p>
     * 
     * @param modifySelfservicePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifySelfservicePermissions operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.ModifySelfservicePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySelfservicePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifySelfservicePermissionsResult> modifySelfservicePermissionsAsync(
            ModifySelfservicePermissionsRequest modifySelfservicePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifySelfservicePermissionsRequest, ModifySelfservicePermissionsResult> asyncHandler);

    /**
     * <p>
     * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html#control-device-access">
     * Control Device Access</a>.
     * </p>
     * 
     * @param modifyWorkspaceAccessPropertiesRequest
     * @return A Java Future containing the result of the ModifyWorkspaceAccessProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceAccessProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceAccessProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceAccessPropertiesResult> modifyWorkspaceAccessPropertiesAsync(
            ModifyWorkspaceAccessPropertiesRequest modifyWorkspaceAccessPropertiesRequest);

    /**
     * <p>
     * Specifies which devices and operating systems users can use to access their WorkSpaces. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/update-directory-details.html#control-device-access">
     * Control Device Access</a>.
     * </p>
     * 
     * @param modifyWorkspaceAccessPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceAccessProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceAccessProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceAccessProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceAccessPropertiesResult> modifyWorkspaceAccessPropertiesAsync(
            ModifyWorkspaceAccessPropertiesRequest modifyWorkspaceAccessPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceAccessPropertiesRequest, ModifyWorkspaceAccessPropertiesResult> asyncHandler);

    /**
     * <p>
     * Modify the default properties used to create WorkSpaces.
     * </p>
     * 
     * @param modifyWorkspaceCreationPropertiesRequest
     * @return A Java Future containing the result of the ModifyWorkspaceCreationProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceCreationProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceCreationProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceCreationPropertiesResult> modifyWorkspaceCreationPropertiesAsync(
            ModifyWorkspaceCreationPropertiesRequest modifyWorkspaceCreationPropertiesRequest);

    /**
     * <p>
     * Modify the default properties used to create WorkSpaces.
     * </p>
     * 
     * @param modifyWorkspaceCreationPropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceCreationProperties operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceCreationProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceCreationProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceCreationPropertiesResult> modifyWorkspaceCreationPropertiesAsync(
            ModifyWorkspaceCreationPropertiesRequest modifyWorkspaceCreationPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceCreationPropertiesRequest, ModifyWorkspaceCreationPropertiesResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root
     * and user volumes, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html">
     * Modify a WorkSpace</a>.
     * </p>
     * <note>
     * <p>
     * The <code>MANUAL</code> running mode value is only supported by Amazon WorkSpaces Core. Contact your account team
     * to be allow-listed to use this value. For more information, see <a
     * href="http://aws.amazon.com/workspaces/core/">Amazon WorkSpaces Core</a>.
     * </p>
     * </note>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

    /**
     * <p>
     * Modifies the specified WorkSpace properties. For important information about how to modify the size of the root
     * and user volumes, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/modify-workspaces.html">
     * Modify a WorkSpace</a>.
     * </p>
     * <note>
     * <p>
     * The <code>MANUAL</code> running mode value is only supported by Amazon WorkSpaces Core. Contact your account team
     * to be allow-listed to use this value. For more information, see <a
     * href="http://aws.amazon.com/workspaces/core/">Amazon WorkSpaces Core</a>.
     * </p>
     * </note>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceProperties operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspacePropertiesResult> modifyWorkspacePropertiesAsync(
            ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspacePropertiesRequest, ModifyWorkspacePropertiesResult> asyncHandler);

    /**
     * <p>
     * Sets the state of the specified WorkSpace.
     * </p>
     * <p>
     * To maintain a WorkSpace without being interrupted, set the WorkSpace state to <code>ADMIN_MAINTENANCE</code>.
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
     * WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code>
     * state.
     * </p>
     * 
     * @param modifyWorkspaceStateRequest
     * @return A Java Future containing the result of the ModifyWorkspaceState operation returned by the service.
     * @sample AmazonWorkspacesAsync.ModifyWorkspaceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(ModifyWorkspaceStateRequest modifyWorkspaceStateRequest);

    /**
     * <p>
     * Sets the state of the specified WorkSpace.
     * </p>
     * <p>
     * To maintain a WorkSpace without being interrupted, set the WorkSpace state to <code>ADMIN_MAINTENANCE</code>.
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop
     * WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code>
     * state.
     * </p>
     * 
     * @param modifyWorkspaceStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyWorkspaceState operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.ModifyWorkspaceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyWorkspaceStateResult> modifyWorkspaceStateAsync(ModifyWorkspaceStateRequest modifyWorkspaceStateRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyWorkspaceStateRequest, ModifyWorkspaceStateResult> asyncHandler);

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code> or <code>UNHEALTHY</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest);

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot reboot a WorkSpace unless its state is <code>AVAILABLE</code> or <code>UNHEALTHY</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have rebooted.
     * </p>
     * 
     * @param rebootWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootWorkspacesResult> rebootWorkspacesAsync(RebootWorkspacesRequest rebootWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Rebuilds the specified WorkSpace.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, <code>STOPPED</code>, or <code>REBOOTING</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild
     * a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest);

    /**
     * <p>
     * Rebuilds the specified WorkSpace.
     * </p>
     * <p>
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, <code>STOPPED</code>, or <code>REBOOTING</code>.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/reset-workspace.html">Rebuild
     * a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
     * </p>
     * 
     * @param rebuildWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(RebuildWorkspacesRequest rebuildWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * registered. If this is the first time you are registering a directory, you will need to create the
     * workspaces_DefaultRole role before you can register a directory. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role">
     * Creating the workspaces_DefaultRole Role</a>.
     * </p>
     * 
     * @param registerWorkspaceDirectoryRequest
     * @return A Java Future containing the result of the RegisterWorkspaceDirectory operation returned by the service.
     * @sample AmazonWorkspacesAsync.RegisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RegisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterWorkspaceDirectoryResult> registerWorkspaceDirectoryAsync(
            RegisterWorkspaceDirectoryRequest registerWorkspaceDirectoryRequest);

    /**
     * <p>
     * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is
     * registered. If this is the first time you are registering a directory, you will need to create the
     * workspaces_DefaultRole role before you can register a directory. For more information, see <a href=
     * "https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role">
     * Creating the workspaces_DefaultRole Role</a>.
     * </p>
     * 
     * @param registerWorkspaceDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterWorkspaceDirectory operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RegisterWorkspaceDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RegisterWorkspaceDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterWorkspaceDirectoryResult> registerWorkspaceDirectoryAsync(
            RegisterWorkspaceDirectoryRequest registerWorkspaceDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterWorkspaceDirectoryRequest, RegisterWorkspaceDirectoryResult> asyncHandler);

    /**
     * <p>
     * Restores the specified WorkSpace to its last known healthy state.
     * </p>
     * <p>
     * You cannot restore a WorkSpace unless its state is <code> AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, or <code>STOPPED</code>.
     * </p>
     * <p>
     * Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/restore-workspace.html">Restore a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpace is completely restored.
     * </p>
     * 
     * @param restoreWorkspaceRequest
     * @return A Java Future containing the result of the RestoreWorkspace operation returned by the service.
     * @sample AmazonWorkspacesAsync.RestoreWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RestoreWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreWorkspaceResult> restoreWorkspaceAsync(RestoreWorkspaceRequest restoreWorkspaceRequest);

    /**
     * <p>
     * Restores the specified WorkSpace to its last known healthy state.
     * </p>
     * <p>
     * You cannot restore a WorkSpace unless its state is <code> AVAILABLE</code>, <code>ERROR</code>,
     * <code>UNHEALTHY</code>, or <code>STOPPED</code>.
     * </p>
     * <p>
     * Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/restore-workspace.html">Restore a WorkSpace</a>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpace is completely restored.
     * </p>
     * 
     * @param restoreWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreWorkspace operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RestoreWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RestoreWorkspace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestoreWorkspaceResult> restoreWorkspaceAsync(RestoreWorkspaceRequest restoreWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreWorkspaceRequest, RestoreWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more rules from the specified IP access control group.
     * </p>
     * 
     * @param revokeIpRulesRequest
     * @return A Java Future containing the result of the RevokeIpRules operation returned by the service.
     * @sample AmazonWorkspacesAsync.RevokeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RevokeIpRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(RevokeIpRulesRequest revokeIpRulesRequest);

    /**
     * <p>
     * Removes one or more rules from the specified IP access control group.
     * </p>
     * 
     * @param revokeIpRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeIpRules operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.RevokeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RevokeIpRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RevokeIpRulesResult> revokeIpRulesAsync(RevokeIpRulesRequest revokeIpRulesRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeIpRulesRequest, RevokeIpRulesResult> asyncHandler);

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest);

    /**
     * <p>
     * Starts the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot start a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>STOPPED</code>.
     * </p>
     * 
     * @param startWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartWorkspacesResult> startWorkspacesAsync(StartWorkspacesRequest startWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkspacesRequest, StartWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest);

    /**
     * <p>
     * Stops the specified WorkSpaces.
     * </p>
     * <p>
     * You cannot stop a WorkSpace unless it has a running mode of <code>AutoStop</code> and a state of
     * <code>AVAILABLE</code>, <code>IMPAIRED</code>, <code>UNHEALTHY</code>, or <code>ERROR</code>.
     * </p>
     * 
     * @param stopWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopWorkspacesResult> stopWorkspacesAsync(StopWorkspacesRequest stopWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<StopWorkspacesRequest, StopWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <important>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services Support before terminating the WorkSpace.
     * </p>
     * </important>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a
     * WorkSpace is terminated, the <code>TERMINATED</code> state is returned only briefly before the WorkSpace
     * directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated,
     * check for the WorkSpace ID by using <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkSpaces</a>. If
     * the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">Directory Service pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param terminateWorkspacesRequest
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsync.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest);

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <important>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services Support before terminating the WorkSpace.
     * </p>
     * </important>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated. After a
     * WorkSpace is terminated, the <code>TERMINATED</code> state is returned only briefly before the WorkSpace
     * directory metadata is cleaned up, so this state is rarely returned. To confirm that a WorkSpace is terminated,
     * check for the WorkSpace ID by using <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkSpaces</a>. If
     * the WorkSpace ID isn't returned, then the WorkSpace has been successfully terminated.
     * </p>
     * <note>
     * <p>
     * Simple AD and AD Connector are made available to you free of charge to use with WorkSpaces. If there are no
     * WorkSpaces being used with your Simple AD or AD Connector directory for 30 consecutive days, this directory will
     * be automatically deregistered for use with Amazon WorkSpaces, and you will be charged for this directory as per
     * the <a href="http://aws.amazon.com/directoryservice/pricing/">Directory Service pricing terms</a>.
     * </p>
     * <p>
     * To delete empty directories, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/delete-workspaces-directory.html"> Delete the
     * Directory for Your WorkSpaces</a>. If you delete your Simple AD or AD Connector directory, you can always create
     * a new one when you want to start using WorkSpaces again.
     * </p>
     * </note>
     * 
     * @param terminateWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateWorkspacesResult> terminateWorkspacesAsync(TerminateWorkspacesRequest terminateWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Updates a Amazon Connect client add-in. Use this action to update the name and endpoint URL of a Amazon Connect
     * client add-in.
     * </p>
     * 
     * @param updateConnectClientAddInRequest
     * @return A Java Future containing the result of the UpdateConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsync.UpdateConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectClientAddInResult> updateConnectClientAddInAsync(UpdateConnectClientAddInRequest updateConnectClientAddInRequest);

    /**
     * <p>
     * Updates a Amazon Connect client add-in. Use this action to update the name and endpoint URL of a Amazon Connect
     * client add-in.
     * </p>
     * 
     * @param updateConnectClientAddInRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnectClientAddIn operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.UpdateConnectClientAddIn
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectClientAddIn"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectClientAddInResult> updateConnectClientAddInAsync(UpdateConnectClientAddInRequest updateConnectClientAddInRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectClientAddInRequest, UpdateConnectClientAddInResult> asyncHandler);

    /**
     * <p>
     * Shares or unshares a connection alias with one account by specifying whether that account has permission to
     * associate the connection alias with a directory. If the association permission is granted, the connection alias
     * is shared with that account. If the association permission is revoked, the connection alias is unshared with the
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateConnectionAliasPermissionRequest
     * @return A Java Future containing the result of the UpdateConnectionAliasPermission operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.UpdateConnectionAliasPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectionAliasPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionAliasPermissionResult> updateConnectionAliasPermissionAsync(
            UpdateConnectionAliasPermissionRequest updateConnectionAliasPermissionRequest);

    /**
     * <p>
     * Shares or unshares a connection alias with one account by specifying whether that account has permission to
     * associate the connection alias with a directory. If the association permission is granted, the connection alias
     * is shared with that account. If the association permission is revoked, the connection alias is unshared with the
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html"> Cross-Region
     * Redirection for Amazon WorkSpaces</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Before performing this operation, call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeConnectionAliases.html">
     * DescribeConnectionAliases</a> to make sure that the current state of the connection alias is <code>CREATED</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a connection alias that has been shared, the shared account must first disassociate the connection
     * alias from any directories it has been associated with. Then you must unshare the connection alias from the
     * account it has been shared with. You can delete a connection alias only after it is no longer shared with any
     * accounts or associated with any directories.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateConnectionAliasPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnectionAliasPermission operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.UpdateConnectionAliasPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectionAliasPermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionAliasPermissionResult> updateConnectionAliasPermissionAsync(
            UpdateConnectionAliasPermissionRequest updateConnectionAliasPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectionAliasPermissionRequest, UpdateConnectionAliasPermissionResult> asyncHandler);

    /**
     * <p>
     * Replaces the current rules of the specified IP access control group with the specified rules.
     * </p>
     * 
     * @param updateRulesOfIpGroupRequest
     * @return A Java Future containing the result of the UpdateRulesOfIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsync.UpdateRulesOfIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateRulesOfIpGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(UpdateRulesOfIpGroupRequest updateRulesOfIpGroupRequest);

    /**
     * <p>
     * Replaces the current rules of the specified IP access control group with the specified rules.
     * </p>
     * 
     * @param updateRulesOfIpGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRulesOfIpGroup operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.UpdateRulesOfIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateRulesOfIpGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRulesOfIpGroupResult> updateRulesOfIpGroupAsync(UpdateRulesOfIpGroupRequest updateRulesOfIpGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRulesOfIpGroupRequest, UpdateRulesOfIpGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/update-custom-bundle.html"> Update a Custom
     * WorkSpaces Bundle</a>.
     * </p>
     * <important>
     * <p>
     * Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update
     * existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or
     * delete and recreate them.
     * </p>
     * </important>
     * 
     * @param updateWorkspaceBundleRequest
     * @return A Java Future containing the result of the UpdateWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsync.UpdateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceBundleResult> updateWorkspaceBundleAsync(UpdateWorkspaceBundleRequest updateWorkspaceBundleRequest);

    /**
     * <p>
     * Updates a WorkSpace bundle with a new image. For more information about updating WorkSpace bundles, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/update-custom-bundle.html"> Update a Custom
     * WorkSpaces Bundle</a>.
     * </p>
     * <important>
     * <p>
     * Existing WorkSpaces aren't automatically updated when you update the bundle that they're based on. To update
     * existing WorkSpaces that are based on a bundle that you've updated, you must either rebuild the WorkSpaces or
     * delete and recreate them.
     * </p>
     * </important>
     * 
     * @param updateWorkspaceBundleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceBundle operation returned by the service.
     * @sample AmazonWorkspacesAsyncHandler.UpdateWorkspaceBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceBundle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceBundleResult> updateWorkspaceBundleAsync(UpdateWorkspaceBundleRequest updateWorkspaceBundleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceBundleRequest, UpdateWorkspaceBundleResult> asyncHandler);

    /**
     * <p>
     * Shares or unshares an image with one account in the same Amazon Web Services Region by specifying whether that
     * account has permission to copy the image. If the copy image permission is granted, the image is shared with that
     * account. If the copy image permission is revoked, the image is unshared with the account.
     * </p>
     * <p>
     * After an image has been shared, the recipient account can copy the image to other Regions as needed.
     * </p>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about sharing images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html"> Share or Unshare a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To delete an image that has been shared, you must unshare the image before you delete it.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sharing Bring Your Own License (BYOL) images across Amazon Web Services accounts isn't supported at this time in
     * Amazon Web Services GovCloud (US). To share BYOL images across accounts in Amazon Web Services GovCloud (US),
     * contact Amazon Web Services Support.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateWorkspaceImagePermissionRequest
     * @return A Java Future containing the result of the UpdateWorkspaceImagePermission operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsync.UpdateWorkspaceImagePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceImagePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceImagePermissionResult> updateWorkspaceImagePermissionAsync(
            UpdateWorkspaceImagePermissionRequest updateWorkspaceImagePermissionRequest);

    /**
     * <p>
     * Shares or unshares an image with one account in the same Amazon Web Services Region by specifying whether that
     * account has permission to copy the image. If the copy image permission is granted, the image is shared with that
     * account. If the copy image permission is revoked, the image is unshared with the account.
     * </p>
     * <p>
     * After an image has been shared, the recipient account can copy the image to other Regions as needed.
     * </p>
     * <p>
     * In the China (Ningxia) Region, you can copy images only within the same Region.
     * </p>
     * <p>
     * In Amazon Web Services GovCloud (US), to copy images to and from other Regions, contact Amazon Web Services
     * Support.
     * </p>
     * <p>
     * For more information about sharing images, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html"> Share or Unshare a
     * Custom WorkSpaces Image</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * To delete an image that has been shared, you must unshare the image before you delete it.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sharing Bring Your Own License (BYOL) images across Amazon Web Services accounts isn't supported at this time in
     * Amazon Web Services GovCloud (US). To share BYOL images across accounts in Amazon Web Services GovCloud (US),
     * contact Amazon Web Services Support.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateWorkspaceImagePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceImagePermission operation returned by the
     *         service.
     * @sample AmazonWorkspacesAsyncHandler.UpdateWorkspaceImagePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateWorkspaceImagePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceImagePermissionResult> updateWorkspaceImagePermissionAsync(
            UpdateWorkspaceImagePermissionRequest updateWorkspaceImagePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceImagePermissionRequest, UpdateWorkspaceImagePermissionResult> asyncHandler);

}
