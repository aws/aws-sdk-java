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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing Amazon WorkSpaces.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspaces.AbstractAmazonWorkspaces} instead.
 * </p>
 * <p>
 * <fullname>Amazon WorkSpaces Service</fullname>
 * <p>
 * Amazon WorkSpaces enables you to provision virtual, cloud-based Microsoft Windows and Amazon Linux desktops for your
 * users.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkspaces {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workspaces";

    /**
     * Overrides the default endpoint for this client ("https://workspaces.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://workspaces.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "workspaces.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://workspaces.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonWorkspaces#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates the specified IP access control group with the specified directory.
     * </p>
     * 
     * @param associateIpGroupsRequest
     * @return Result of the AssociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @sample AmazonWorkspaces.AssociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AssociateIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateIpGroupsResult associateIpGroups(AssociateIpGroupsRequest associateIpGroupsRequest);

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
     * @return Result of the AuthorizeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.AuthorizeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AuthorizeIpRules" target="_top">AWS
     *      API Documentation</a>
     */
    AuthorizeIpRulesResult authorizeIpRules(AuthorizeIpRulesRequest authorizeIpRulesRequest);

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
     * @return Result of the CreateIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceCreationFailedException
     *         The resource could not be created.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.CreateIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIpGroupResult createIpGroup(CreateIpGroupRequest createIpGroupRequest);

    /**
     * <p>
     * Creates the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @sample AmazonWorkspaces.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * This operation is asynchronous and returns before the WorkSpaces are created.
     * </p>
     * 
     * @param createWorkspacesRequest
     * @return Result of the CreateWorkspaces operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.CreateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest);

    /**
     * <p>
     * Deletes the specified IP access control group.
     * </p>
     * <p>
     * You cannot delete an IP access control group that is associated with a directory.
     * </p>
     * 
     * @param deleteIpGroupRequest
     * @return Result of the DeleteIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteIpGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIpGroupResult deleteIpGroup(DeleteIpGroupRequest deleteIpGroupRequest);

    /**
     * <p>
     * Deletes the specified tags from the specified WorkSpaces resource.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are
     * associated with the image.
     * </p>
     * 
     * @param deleteWorkspaceImageRequest
     * @return Result of the DeleteWorkspaceImage operation returned by the service.
     * @throws ResourceAssociatedException
     *         The resource is associated with a directory.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DeleteWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest deleteWorkspaceImageRequest);

    /**
     * <p>
     * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return Result of the DescribeAccount operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccount" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAccountResult describeAccount(DescribeAccountRequest describeAccountRequest);

    /**
     * <p>
     * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the
     * specified account.
     * </p>
     * 
     * @param describeAccountModificationsRequest
     * @return Result of the DescribeAccountModifications operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeAccountModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeAccountModifications"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountModificationsResult describeAccountModifications(DescribeAccountModificationsRequest describeAccountModificationsRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param describeClientPropertiesRequest
     * @return Result of the DescribeClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClientPropertiesResult describeClientProperties(DescribeClientPropertiesRequest describeClientPropertiesRequest);

    /**
     * <p>
     * Describes one or more of your IP access control groups.
     * </p>
     * 
     * @param describeIpGroupsRequest
     * @return Result of the DescribeIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeIpGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIpGroupsResult describeIpGroups(DescribeIpGroupsRequest describeIpGroupsRequest);

    /**
     * <p>
     * Describes the specified tags for the specified WorkSpaces resource.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Retrieves a list that describes the available WorkSpace bundles.
     * </p>
     * <p>
     * You can filter the results using either bundle ID or owner, but not both.
     * </p>
     * 
     * @param describeWorkspaceBundlesRequest
     * @return Result of the DescribeWorkspaceBundles operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceBundles operation.
     *
     * @see #describeWorkspaceBundles(DescribeWorkspaceBundlesRequest)
     */
    DescribeWorkspaceBundlesResult describeWorkspaceBundles();

    /**
     * <p>
     * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
     * </p>
     * 
     * @param describeWorkspaceDirectoriesRequest
     * @return Result of the DescribeWorkspaceDirectories operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspaceDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceDirectories"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaceDirectories operation.
     *
     * @see #describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest)
     */
    DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories();

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise,
     * all images in the account are described.
     * </p>
     * 
     * @param describeWorkspaceImagesRequest
     * @return Result of the DescribeWorkspaceImages operation returned by the service.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DescribeWorkspaceImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImages"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceImagesResult describeWorkspaceImages(DescribeWorkspaceImagesRequest describeWorkspaceImagesRequest);

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
     * @return Result of the DescribeWorkspaces operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.DescribeWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest);

    /**
     * Simplified method form for invoking the DescribeWorkspaces operation.
     *
     * @see #describeWorkspaces(DescribeWorkspacesRequest)
     */
    DescribeWorkspacesResult describeWorkspaces();

    /**
     * <p>
     * Describes the connection status of the specified WorkSpaces.
     * </p>
     * 
     * @param describeWorkspacesConnectionStatusRequest
     * @return Result of the DescribeWorkspacesConnectionStatus operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.DescribeWorkspacesConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspacesConnectionStatusResult describeWorkspacesConnectionStatus(
            DescribeWorkspacesConnectionStatusRequest describeWorkspacesConnectionStatusRequest);

    /**
     * <p>
     * Disassociates the specified IP access control group from the specified directory.
     * </p>
     * 
     * @param disassociateIpGroupsRequest
     * @return Result of the DisassociateIpGroups operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.DisassociateIpGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateIpGroupsResult disassociateIpGroups(DisassociateIpGroupsRequest disassociateIpGroupsRequest);

    /**
     * <p>
     * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The
     * image must be an already licensed EC2 image that is in your AWS account, and you must own the image.
     * </p>
     * 
     * @param importWorkspaceImageRequest
     * @return Result of the ImportWorkspaceImage operation returned by the service.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws OperationNotSupportedException
     *         This operation is not supported.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @sample AmazonWorkspaces.ImportWorkspaceImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportWorkspaceImage"
     *      target="_top">AWS API Documentation</a>
     */
    ImportWorkspaceImageResult importWorkspaceImage(ImportWorkspaceImageRequest importWorkspaceImageRequest);

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
     * @return Result of the ListAvailableManagementCidrRanges operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ListAvailableManagementCidrRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAvailableManagementCidrRanges"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableManagementCidrRangesResult listAvailableManagementCidrRanges(ListAvailableManagementCidrRangesRequest listAvailableManagementCidrRangesRequest);

    /**
     * <p>
     * Modifies the configuration of bring your own license (BYOL) for the specified account.
     * </p>
     * 
     * @param modifyAccountRequest
     * @return Result of the ModifyAccount operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyAccount" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyAccountResult modifyAccount(ModifyAccountRequest modifyAccountRequest);

    /**
     * <p>
     * Modifies the properties of the specified Amazon WorkSpaces clients.
     * </p>
     * 
     * @param modifyClientPropertiesRequest
     * @return Result of the ModifyClientProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.ModifyClientProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyClientPropertiesResult modifyClientProperties(ModifyClientPropertiesRequest modifyClientPropertiesRequest);

    /**
     * <p>
     * Modifies the specified WorkSpace properties.
     * </p>
     * 
     * @param modifyWorkspacePropertiesRequest
     * @return Result of the ModifyWorkspaceProperties operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws OperationInProgressException
     *         The properties of this WorkSpace are currently being modified. Try again in a moment.
     * @throws UnsupportedWorkspaceConfigurationException
     *         The configuration of this WorkSpace is not supported for this operation. For more information, see the <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/">Amazon WorkSpaces Administration
     *         Guide</a>.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @throws ResourceUnavailableException
     *         The specified resource is not available.
     * @sample AmazonWorkspaces.ModifyWorkspaceProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceProperties"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspacePropertiesResult modifyWorkspaceProperties(ModifyWorkspacePropertiesRequest modifyWorkspacePropertiesRequest);

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
     * @return Result of the ModifyWorkspaceState operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AmazonWorkspaces.ModifyWorkspaceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceState"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyWorkspaceStateResult modifyWorkspaceState(ModifyWorkspaceStateRequest modifyWorkspaceStateRequest);

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
     * @return Result of the RebootWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebootWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest);

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
     * @return Result of the RebuildWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.RebuildWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebuildWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest);

    /**
     * <p>
     * Removes one or more rules from the specified IP access control group.
     * </p>
     * 
     * @param revokeIpRulesRequest
     * @return Result of the RevokeIpRules operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.RevokeIpRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RevokeIpRules" target="_top">AWS API
     *      Documentation</a>
     */
    RevokeIpRulesResult revokeIpRules(RevokeIpRulesRequest revokeIpRulesRequest);

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
     * @return Result of the StartWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StartWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StartWorkspacesResult startWorkspaces(StartWorkspacesRequest startWorkspacesRequest);

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
     * @return Result of the StopWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.StopWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest stopWorkspacesRequest);

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
     * @return Result of the TerminateWorkspaces operation returned by the service.
     * @sample AmazonWorkspaces.TerminateWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS
     *      API Documentation</a>
     */
    TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest);

    /**
     * <p>
     * Replaces the current rules of the specified IP access control group with the specified rules.
     * </p>
     * 
     * @param updateRulesOfIpGroupRequest
     * @return Result of the UpdateRulesOfIpGroup operation returned by the service.
     * @throws InvalidParameterValuesException
     *         One or more parameter values are not valid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceLimitExceededException
     *         Your resource limits have been exceeded.
     * @throws InvalidResourceStateException
     *         The state of the resource is not valid for this operation.
     * @throws AccessDeniedException
     *         The user is not authorized to access a resource.
     * @sample AmazonWorkspaces.UpdateRulesOfIpGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateRulesOfIpGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRulesOfIpGroupResult updateRulesOfIpGroup(UpdateRulesOfIpGroupRequest updateRulesOfIpGroupRequest);

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
