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
package com.amazonaws.services.managedgrafana;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.managedgrafana.model.*;

/**
 * Interface for accessing Amazon Managed Grafana.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedgrafana.AbstractAmazonManagedGrafana} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Managed Grafana is a fully managed and secure data visualization service that you can use to instantly query,
 * correlate, and visualize operational metrics, logs, and traces from multiple sources. Amazon Managed Grafana makes it
 * easy to deploy, operate, and scale Grafana, a widely deployed data visualization tool that is popular for its
 * extensible data support.
 * </p>
 * <p>
 * With Amazon Managed Grafana, you create logically isolated Grafana servers called <i>workspaces</i>. In a workspace,
 * you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces without having to
 * build, package, or deploy any hardware to run Grafana servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonManagedGrafana {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "grafana";

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. Upgrading to Grafana Enterprise incurs additional fees. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @return Result of the AssociateLicense operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateLicenseResult associateLicense(AssociateLicenseRequest associateLicenseRequest);

    /**
     * <p>
     * Creates a <i>workspace</i>. In a workspace, you can create Grafana dashboards and visualizations to analyze your
     * metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server.
     * </p>
     * <p>
     * Don't use <code>CreateWorkspace</code> to modify an existing workspace. Instead, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspace.html">UpdateWorkspace</a>.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Creates a Grafana API key for the workspace. This key can be used to authenticate requests sent to the
     * workspace's HTTP API. See <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">https
     * ://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html</a> for available APIs and example
     * requests.
     * </p>
     * 
     * @param createWorkspaceApiKeyRequest
     * @return Result of the CreateWorkspaceApiKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkspaceApiKeyResult createWorkspaceApiKey(CreateWorkspaceApiKeyRequest createWorkspaceApiKeyRequest);

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes a Grafana API key for the workspace.
     * </p>
     * 
     * @param deleteWorkspaceApiKeyRequest
     * @return Result of the DeleteWorkspaceApiKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorkspaceApiKeyResult deleteWorkspaceApiKey(DeleteWorkspaceApiKeyRequest deleteWorkspaceApiKeyRequest);

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @return Result of the DescribeWorkspaceAuthentication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceAuthenticationResult describeWorkspaceAuthentication(DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Gets the current configuration string for the given workspace.
     * </p>
     * 
     * @param describeWorkspaceConfigurationRequest
     * @return Result of the DescribeWorkspaceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkspaceConfigurationResult describeWorkspaceConfiguration(DescribeWorkspaceConfigurationRequest describeWorkspaceConfigurationRequest);

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @return Result of the DisassociateLicense operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateLicenseResult disassociateLicense(DisassociateLicenseRequest disassociateLicenseRequest);

    /**
     * <p>
     * Lists the users and groups who have the Grafana <code>Admin</code> and <code>Editor</code> roles in this
     * workspace. If you use this operation without specifying <code>userId</code> or <code>groupId</code>, the
     * operation returns the roles of all users and groups. If you specify a <code>userId</code> or a
     * <code>groupId</code>, only the roles for that user or group are returned. If you do this, you can specify only
     * one <code>userId</code> or one <code>groupId</code>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with the Amazon Managed
     * Service for Grafana resource specified by the <code>resourceArn</code>. Currently, the only resource that can be
     * tagged is a workspace.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkspacesResult listWorkspaces(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * The <code>TagResource</code> operation associates tags with an Amazon Managed Grafana resource. Currently, the
     * only resource that can be tagged is workspaces.
     * </p>
     * <p>
     * If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the
     * resource. If you specify a tag key that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The <code>UntagResource</code> operation removes the association of the tag with the Amazon Managed Grafana
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @return Result of the UpdatePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePermissionsResult updatePermissions(UpdatePermissionsRequest updatePermissionsRequest);

    /**
     * <p>
     * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional
     * parameters, the existing values of those parameters are not changed.
     * </p>
     * <p>
     * To modify the user authentication methods that the workspace uses, such as SAML or IAM Identity Center, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspaceAuthentication.html">
     * UpdateWorkspaceAuthentication</a>.
     * </p>
     * <p>
     * To modify which users in the workspace have the <code>Admin</code> and <code>Editor</code> Grafana roles, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return Result of the UpdateWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkspaceResult updateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest);

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @return Result of the UpdateWorkspaceAuthentication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkspaceAuthenticationResult updateWorkspaceAuthentication(UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Updates the configuration string for the given workspace
     * </p>
     * 
     * @param updateWorkspaceConfigurationRequest
     * @return Result of the UpdateWorkspaceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkspaceConfigurationResult updateWorkspaceConfiguration(UpdateWorkspaceConfigurationRequest updateWorkspaceConfigurationRequest);

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
