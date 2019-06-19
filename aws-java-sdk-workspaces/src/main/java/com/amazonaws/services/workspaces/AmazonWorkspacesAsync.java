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
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
 * users.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspacesAsync extends AmazonWorkspaces {

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
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
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
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image.
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
     * associated with the image.
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
     * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
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
     * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
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
     * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
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
     * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
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
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
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
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
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
     * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
     * image must be an already licensed EC2 image that is in your AWS account, and you must own the image.
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
     * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
     * image must be an already licensed EC2 image that is in your AWS account, and you must own the image.
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
     * interface when you enable bring your own license (BYOL).
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
     * interface when you enable bring your own license (BYOL).
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
     * Modifies the configuration of bring your own license (BYOL) for the specified account.
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
     * Modifies the configuration of bring your own license (BYOL) for the specified account.
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
     * Modifies the specified WorkSpace properties.
     * </p>
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
     * Modifies the specified WorkSpace properties.
     * </p>
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
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in
     * this state is not stopped. Users can log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code> state.
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
     * WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in
     * this state is not stopped. Users can log into a WorkSpace in the <code>ADMIN_MAINTENANCE</code> state.
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
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>, or
     * <code>UNHEALTHY</code>.
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
     * You cannot rebuild a WorkSpace unless its state is <code>AVAILABLE</code>, <code>ERROR</code>, or
     * <code>UNHEALTHY</code>.
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
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services before terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
     * </p>
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
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to
     * archive any user data, contact Amazon Web Services before terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except <code>SUSPENDED</code>.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
     * </p>
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

}
