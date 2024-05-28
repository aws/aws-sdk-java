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
package com.amazonaws.services.managedgrafana;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;

/**
 * Interface for accessing Amazon Managed Grafana asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedgrafana.AbstractAmazonManagedGrafanaAsync} instead.
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
public interface AmazonManagedGrafanaAsync extends AmazonManagedGrafana {

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. To upgrade, you must use <code>ENTERPRISE</code> for the
     * <code>licenseType</code>, and pass in a valid Grafana Labs token for the <code>grafanaToken</code>. Upgrading to
     * Grafana Enterprise incurs additional fees. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @return A Java Future containing the result of the AssociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest associateLicenseRequest);

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. To upgrade, you must use <code>ENTERPRISE</code> for the
     * <code>licenseType</code>, and pass in a valid Grafana Labs token for the <code>grafanaToken</code>. Upgrading to
     * Grafana Enterprise incurs additional fees. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest associateLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLicenseRequest, AssociateLicenseResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Creates a Grafana API key for the workspace. This key can be used to authenticate requests sent to the
     * workspace's HTTP API. See <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">https
     * ://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html</a> for available APIs and example
     * requests.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param createWorkspaceApiKeyRequest
     * @return A Java Future containing the result of the CreateWorkspaceApiKey operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.CreateWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(CreateWorkspaceApiKeyRequest createWorkspaceApiKeyRequest);

    /**
     * <p>
     * Creates a Grafana API key for the workspace. This key can be used to authenticate requests sent to the
     * workspace's HTTP API. See <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">https
     * ://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html</a> for available APIs and example
     * requests.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param createWorkspaceApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaceApiKey operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.CreateWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceApiKeyResult> createWorkspaceApiKeyAsync(CreateWorkspaceApiKeyRequest createWorkspaceApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceApiKeyRequest, CreateWorkspaceApiKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a service account for the workspace. A service account can be used to call Grafana HTTP APIs, and run
     * automated workloads. After creating the service account with the correct <code>GrafanaRole</code> for your use
     * case, use <code>CreateWorkspaceServiceAccountToken</code> to create a token that can be used to authenticate and
     * authorize Grafana HTTP API calls.
     * </p>
     * <p>
     * You can only create service accounts for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * <note>
     * <p>
     * For more information about service accounts, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">Service accounts</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <p>
     * For more information about the Grafana HTTP APIs, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">Using Grafana HTTP APIs</a>
     * in the <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createWorkspaceServiceAccountRequest
     * @return A Java Future containing the result of the CreateWorkspaceServiceAccount operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.CreateWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceServiceAccountResult> createWorkspaceServiceAccountAsync(
            CreateWorkspaceServiceAccountRequest createWorkspaceServiceAccountRequest);

    /**
     * <p>
     * Creates a service account for the workspace. A service account can be used to call Grafana HTTP APIs, and run
     * automated workloads. After creating the service account with the correct <code>GrafanaRole</code> for your use
     * case, use <code>CreateWorkspaceServiceAccountToken</code> to create a token that can be used to authenticate and
     * authorize Grafana HTTP API calls.
     * </p>
     * <p>
     * You can only create service accounts for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * <note>
     * <p>
     * For more information about service accounts, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">Service accounts</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <p>
     * For more information about the Grafana HTTP APIs, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">Using Grafana HTTP APIs</a>
     * in the <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createWorkspaceServiceAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaceServiceAccount operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.CreateWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceServiceAccountResult> createWorkspaceServiceAccountAsync(
            CreateWorkspaceServiceAccountRequest createWorkspaceServiceAccountRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceServiceAccountRequest, CreateWorkspaceServiceAccountResult> asyncHandler);

    /**
     * <p>
     * Creates a token that can be used to authenticate and authorize Grafana HTTP API operations for the given <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">workspace service account</a>.
     * The service account acts as a user for the API operations, and defines the permissions that are used by the API.
     * </p>
     * <important>
     * <p>
     * When you create the service account token, you will receive a key that is used when calling Grafana APIs. Do not
     * lose this key, as it will not be retrievable again.
     * </p>
     * <p>
     * If you do lose the key, you can delete the token and recreate it to receive a new key. This will disable the
     * initial key.
     * </p>
     * </important>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param createWorkspaceServiceAccountTokenRequest
     * @return A Java Future containing the result of the CreateWorkspaceServiceAccountToken operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.CreateWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceServiceAccountTokenResult> createWorkspaceServiceAccountTokenAsync(
            CreateWorkspaceServiceAccountTokenRequest createWorkspaceServiceAccountTokenRequest);

    /**
     * <p>
     * Creates a token that can be used to authenticate and authorize Grafana HTTP API operations for the given <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">workspace service account</a>.
     * The service account acts as a user for the API operations, and defines the permissions that are used by the API.
     * </p>
     * <important>
     * <p>
     * When you create the service account token, you will receive a key that is used when calling Grafana APIs. Do not
     * lose this key, as it will not be retrievable again.
     * </p>
     * <p>
     * If you do lose the key, you can delete the token and recreate it to receive a new key. This will disable the
     * initial key.
     * </p>
     * </important>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param createWorkspaceServiceAccountTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspaceServiceAccountToken operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.CreateWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceServiceAccountTokenResult> createWorkspaceServiceAccountTokenAsync(
            CreateWorkspaceServiceAccountTokenRequest createWorkspaceServiceAccountTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceServiceAccountTokenRequest, CreateWorkspaceServiceAccountTokenResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Deletes a Grafana API key for the workspace.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceApiKeyRequest
     * @return A Java Future containing the result of the DeleteWorkspaceApiKey operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DeleteWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(DeleteWorkspaceApiKeyRequest deleteWorkspaceApiKeyRequest);

    /**
     * <p>
     * Deletes a Grafana API key for the workspace.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspaceApiKey operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DeleteWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceApiKeyResult> deleteWorkspaceApiKeyAsync(DeleteWorkspaceApiKeyRequest deleteWorkspaceApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceApiKeyRequest, DeleteWorkspaceApiKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes a workspace service account from the workspace.
     * </p>
     * <p>
     * This will delete any tokens created for the service account, as well. If the tokens are currently in use, the
     * will fail to authenticate / authorize after they are deleted.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountRequest
     * @return A Java Future containing the result of the DeleteWorkspaceServiceAccount operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.DeleteWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceServiceAccountResult> deleteWorkspaceServiceAccountAsync(
            DeleteWorkspaceServiceAccountRequest deleteWorkspaceServiceAccountRequest);

    /**
     * <p>
     * Deletes a workspace service account from the workspace.
     * </p>
     * <p>
     * This will delete any tokens created for the service account, as well. If the tokens are currently in use, the
     * will fail to authenticate / authorize after they are deleted.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspaceServiceAccount operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.DeleteWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceServiceAccountResult> deleteWorkspaceServiceAccountAsync(
            DeleteWorkspaceServiceAccountRequest deleteWorkspaceServiceAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceServiceAccountRequest, DeleteWorkspaceServiceAccountResult> asyncHandler);

    /**
     * <p>
     * Deletes a token for the workspace service account.
     * </p>
     * <p>
     * This will disable the key associated with the token. If any automation is currently using the key, it will no
     * longer be authenticated or authorized to perform actions with the Grafana HTTP APIs.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountTokenRequest
     * @return A Java Future containing the result of the DeleteWorkspaceServiceAccountToken operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.DeleteWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceServiceAccountTokenResult> deleteWorkspaceServiceAccountTokenAsync(
            DeleteWorkspaceServiceAccountTokenRequest deleteWorkspaceServiceAccountTokenRequest);

    /**
     * <p>
     * Deletes a token for the workspace service account.
     * </p>
     * <p>
     * This will disable the key associated with the token. If any automation is currently using the key, it will no
     * longer be authenticated or authorized to perform actions with the Grafana HTTP APIs.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspaceServiceAccountToken operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.DeleteWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceServiceAccountTokenResult> deleteWorkspaceServiceAccountTokenAsync(
            DeleteWorkspaceServiceAccountTokenRequest deleteWorkspaceServiceAccountTokenRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceServiceAccountTokenRequest, DeleteWorkspaceServiceAccountTokenResult> asyncHandler);

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @return A Java Future containing the result of the DescribeWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceAuthenticationRequest, DescribeWorkspaceAuthenticationResult> asyncHandler);

    /**
     * <p>
     * Gets the current configuration string for the given workspace.
     * </p>
     * 
     * @param describeWorkspaceConfigurationRequest
     * @return A Java Future containing the result of the DescribeWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.DescribeWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(
            DescribeWorkspaceConfigurationRequest describeWorkspaceConfigurationRequest);

    /**
     * <p>
     * Gets the current configuration string for the given workspace.
     * </p>
     * 
     * @param describeWorkspaceConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.DescribeWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceConfigurationResult> describeWorkspaceConfigurationAsync(
            DescribeWorkspaceConfigurationRequest describeWorkspaceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceConfigurationRequest, DescribeWorkspaceConfigurationResult> asyncHandler);

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @return A Java Future containing the result of the DisassociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest disassociateLicenseRequest);

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest disassociateLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLicenseRequest, DisassociateLicenseResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with the Amazon Managed
     * Service for Grafana resource specified by the <code>resourceArn</code>. Currently, the only resource that can be
     * tagged is a workspace.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with the Amazon Managed
     * Service for Grafana resource specified by the <code>resourceArn</code>. Currently, the only resource that can be
     * tagged is a workspace.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists available versions of Grafana. These are available when calling <code>CreateWorkspace</code>. Optionally,
     * include a workspace to list the versions to which it can be upgraded.
     * </p>
     * 
     * @param listVersionsRequest
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest);

    /**
     * <p>
     * Lists available versions of Grafana. These are available when calling <code>CreateWorkspace</code>. Optionally,
     * include a workspace to list the versions to which it can be upgraded.
     * </p>
     * 
     * @param listVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsRequest, ListVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tokens for a workspace service account.
     * </p>
     * <note>
     * <p>
     * This does not return the key for each token. You cannot access keys after they are created. To create a new key,
     * delete the token and recreate it.
     * </p>
     * </note>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountTokensRequest
     * @return A Java Future containing the result of the ListWorkspaceServiceAccountTokens operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.ListWorkspaceServiceAccountTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccountTokens"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspaceServiceAccountTokensResult> listWorkspaceServiceAccountTokensAsync(
            ListWorkspaceServiceAccountTokensRequest listWorkspaceServiceAccountTokensRequest);

    /**
     * <p>
     * Returns a list of tokens for a workspace service account.
     * </p>
     * <note>
     * <p>
     * This does not return the key for each token. You cannot access keys after they are created. To create a new key,
     * delete the token and recreate it.
     * </p>
     * </note>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountTokensRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaceServiceAccountTokens operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListWorkspaceServiceAccountTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccountTokens"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspaceServiceAccountTokensResult> listWorkspaceServiceAccountTokensAsync(
            ListWorkspaceServiceAccountTokensRequest listWorkspaceServiceAccountTokensRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspaceServiceAccountTokensRequest, ListWorkspaceServiceAccountTokensResult> asyncHandler);

    /**
     * <p>
     * Returns a list of service accounts for a workspace.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountsRequest
     * @return A Java Future containing the result of the ListWorkspaceServiceAccounts operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.ListWorkspaceServiceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspaceServiceAccountsResult> listWorkspaceServiceAccountsAsync(
            ListWorkspaceServiceAccountsRequest listWorkspaceServiceAccountsRequest);

    /**
     * <p>
     * Returns a list of service accounts for a workspace.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaceServiceAccounts operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListWorkspaceServiceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspaceServiceAccountsResult> listWorkspaceServiceAccountsAsync(
            ListWorkspaceServiceAccountsRequest listWorkspaceServiceAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspaceServiceAccountsRequest, ListWorkspaceServiceAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * The <code>UntagResource</code> operation removes the association of the tag with the Amazon Managed Grafana
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * The <code>UntagResource</code> operation removes the association of the tag with the Amazon Managed Grafana
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @return A Java Future containing the result of the UpdatePermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest updatePermissionsRequest);

    /**
     * <p>
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest updatePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePermissionsRequest, UpdatePermissionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * <note>
     * <p>
     * Changes to the authentication method for a workspace may take a few minutes to take effect.
     * </p>
     * </note>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @return A Java Future containing the result of the UpdateWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(
            UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * <note>
     * <p>
     * Changes to the authentication method for a workspace may take a few minutes to take effect.
     * </p>
     * </note>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(
            UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAuthenticationRequest, UpdateWorkspaceAuthenticationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration string for the given workspace
     * </p>
     * 
     * @param updateWorkspaceConfigurationRequest
     * @return A Java Future containing the result of the UpdateWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.UpdateWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(
            UpdateWorkspaceConfigurationRequest updateWorkspaceConfigurationRequest);

    /**
     * <p>
     * Updates the configuration string for the given workspace
     * </p>
     * 
     * @param updateWorkspaceConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceConfiguration operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdateWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceConfigurationResult> updateWorkspaceConfigurationAsync(
            UpdateWorkspaceConfigurationRequest updateWorkspaceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceConfigurationRequest, UpdateWorkspaceConfigurationResult> asyncHandler);

}
