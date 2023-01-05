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
package com.amazonaws.services.redshiftserverless;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;

/**
 * Interface for accessing Redshift Serverless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshiftserverless.AbstractAWSRedshiftServerlessAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is an interface reference for Amazon Redshift Serverless. It contains documentation for one of the programming
 * or command line interfaces you can use to manage Amazon Redshift Serverless.
 * </p>
 * <p>
 * Amazon Redshift Serverless automatically provisions data warehouse capacity and intelligently scales the underlying
 * resources based on workload demands. Amazon Redshift Serverless adjusts capacity in seconds to deliver consistently
 * high performance and simplified operations for even the most demanding and volatile workloads. Amazon Redshift
 * Serverless lets you focus on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * To learn more about Amazon Redshift Serverless, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-whatis.html">What is Amazon Redshift
 * Serverless</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRedshiftServerlessAsync extends AWSRedshiftServerless {

    /**
     * <p>
     * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html">Working with snapshots
     * and recovery points</a>.
     * </p>
     * 
     * @param convertRecoveryPointToSnapshotRequest
     * @return A Java Future containing the result of the ConvertRecoveryPointToSnapshot operation returned by the
     *         service.
     * @sample AWSRedshiftServerlessAsync.ConvertRecoveryPointToSnapshot
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConvertRecoveryPointToSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConvertRecoveryPointToSnapshotResult> convertRecoveryPointToSnapshotAsync(
            ConvertRecoveryPointToSnapshotRequest convertRecoveryPointToSnapshotRequest);

    /**
     * <p>
     * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html">Working with snapshots
     * and recovery points</a>.
     * </p>
     * 
     * @param convertRecoveryPointToSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConvertRecoveryPointToSnapshot operation returned by the
     *         service.
     * @sample AWSRedshiftServerlessAsyncHandler.ConvertRecoveryPointToSnapshot
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConvertRecoveryPointToSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConvertRecoveryPointToSnapshotResult> convertRecoveryPointToSnapshotAsync(
            ConvertRecoveryPointToSnapshotRequest convertRecoveryPointToSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ConvertRecoveryPointToSnapshotRequest, ConvertRecoveryPointToSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param createEndpointAccessRequest
     * @return A Java Future containing the result of the CreateEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.CreateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointAccessResult> createEndpointAccessAsync(CreateEndpointAccessRequest createEndpointAccessRequest);

    /**
     * <p>
     * Creates an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param createEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.CreateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointAccessResult> createEndpointAccessAsync(CreateEndpointAccessRequest createEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointAccessRequest, CreateEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Creates a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createNamespaceRequest
     * @return A Java Future containing the result of the CreateNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest createNamespaceRequest);

    /**
     * <p>
     * Creates a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest createNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of all databases in a namespace. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html"> Working with
     * snapshots and recovery points</a>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of all databases in a namespace. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html"> Working with
     * snapshots and recovery points</a>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the
     * returned usage limit identifier.
     * </p>
     * 
     * @param createUsageLimitRequest
     * @return A Java Future containing the result of the CreateUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.CreateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUsageLimitResult> createUsageLimitAsync(CreateUsageLimitRequest createUsageLimitRequest);

    /**
     * <p>
     * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the
     * returned usage limit identifier.
     * </p>
     * 
     * @param createUsageLimitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.CreateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUsageLimitResult> createUsageLimitAsync(CreateUsageLimitRequest createUsageLimitRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUsageLimitRequest, CreateUsageLimitResult> asyncHandler);

    /**
     * <p>
     * Creates an workgroup in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createWorkgroupRequest
     * @return A Java Future containing the result of the CreateWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.CreateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkgroupResult> createWorkgroupAsync(CreateWorkgroupRequest createWorkgroupRequest);

    /**
     * <p>
     * Creates an workgroup in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createWorkgroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.CreateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkgroupResult> createWorkgroupAsync(CreateWorkgroupRequest createWorkgroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkgroupRequest, CreateWorkgroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param deleteEndpointAccessRequest
     * @return A Java Future containing the result of the DeleteEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointAccessResult> deleteEndpointAccessAsync(DeleteEndpointAccessRequest deleteEndpointAccessRequest);

    /**
     * <p>
     * Deletes an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param deleteEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointAccessResult> deleteEndpointAccessAsync(DeleteEndpointAccessRequest deleteEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointAccessRequest, DeleteEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final
     * snapshot that has all of the data within the namespace.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final
     * snapshot that has all of the data within the namespace.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a snapshot from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes a snapshot from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes a usage limit from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteUsageLimitRequest
     * @return A Java Future containing the result of the DeleteUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUsageLimitResult> deleteUsageLimitAsync(DeleteUsageLimitRequest deleteUsageLimitRequest);

    /**
     * <p>
     * Deletes a usage limit from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteUsageLimitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUsageLimitResult> deleteUsageLimitAsync(DeleteUsageLimitRequest deleteUsageLimitRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUsageLimitRequest, DeleteUsageLimitResult> asyncHandler);

    /**
     * <p>
     * Deletes a workgroup.
     * </p>
     * 
     * @param deleteWorkgroupRequest
     * @return A Java Future containing the result of the DeleteWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.DeleteWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkgroupResult> deleteWorkgroupAsync(DeleteWorkgroupRequest deleteWorkgroupRequest);

    /**
     * <p>
     * Deletes a workgroup.
     * </p>
     * 
     * @param deleteWorkgroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.DeleteWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkgroupResult> deleteWorkgroupAsync(DeleteWorkgroupRequest deleteWorkgroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkgroupRequest, DeleteWorkgroupResult> asyncHandler);

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift
     * Serverless.
     * </p>
     * <p>
     * By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900
     * seconds (15 minutes) and 3600 seconds (60 minutes).
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param getCredentialsRequest
     * @return A Java Future containing the result of the GetCredentials operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCredentialsResult> getCredentialsAsync(GetCredentialsRequest getCredentialsRequest);

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift
     * Serverless.
     * </p>
     * <p>
     * By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900
     * seconds (15 minutes) and 3600 seconds (60 minutes).
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param getCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCredentials operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCredentialsResult> getCredentialsAsync(GetCredentialsRequest getCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCredentialsRequest, GetCredentialsResult> asyncHandler);

    /**
     * <p>
     * Returns information, such as the name, about a VPC endpoint.
     * </p>
     * 
     * @param getEndpointAccessRequest
     * @return A Java Future containing the result of the GetEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointAccessResult> getEndpointAccessAsync(GetEndpointAccessRequest getEndpointAccessRequest);

    /**
     * <p>
     * Returns information, such as the name, about a VPC endpoint.
     * </p>
     * 
     * @param getEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointAccessResult> getEndpointAccessAsync(GetEndpointAccessRequest getEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GetEndpointAccessRequest, GetEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Returns information about a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return A Java Future containing the result of the GetNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest getNamespaceRequest);

    /**
     * <p>
     * Returns information about a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param getNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest getNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<GetNamespaceRequest, GetNamespaceResult> asyncHandler);

    /**
     * <p>
     * Returns information about a recovery point.
     * </p>
     * 
     * @param getRecoveryPointRequest
     * @return A Java Future containing the result of the GetRecoveryPoint operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryPointResult> getRecoveryPointAsync(GetRecoveryPointRequest getRecoveryPointRequest);

    /**
     * <p>
     * Returns information about a recovery point.
     * </p>
     * 
     * @param getRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryPoint operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryPointResult> getRecoveryPointAsync(GetRecoveryPointRequest getRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryPointRequest, GetRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Returns a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Returns a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return A Java Future containing the result of the GetSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest getSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest getSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotRequest, GetSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about a <code>TableRestoreStatus</code> object.
     * </p>
     * 
     * @param getTableRestoreStatusRequest
     * @return A Java Future containing the result of the GetTableRestoreStatus operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTableRestoreStatusResult> getTableRestoreStatusAsync(GetTableRestoreStatusRequest getTableRestoreStatusRequest);

    /**
     * <p>
     * Returns information about a <code>TableRestoreStatus</code> object.
     * </p>
     * 
     * @param getTableRestoreStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTableRestoreStatus operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTableRestoreStatusResult> getTableRestoreStatusAsync(GetTableRestoreStatusRequest getTableRestoreStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableRestoreStatusRequest, GetTableRestoreStatusResult> asyncHandler);

    /**
     * <p>
     * Returns information about a usage limit.
     * </p>
     * 
     * @param getUsageLimitRequest
     * @return A Java Future containing the result of the GetUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageLimitResult> getUsageLimitAsync(GetUsageLimitRequest getUsageLimitRequest);

    /**
     * <p>
     * Returns information about a usage limit.
     * </p>
     * 
     * @param getUsageLimitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageLimitResult> getUsageLimitAsync(GetUsageLimitRequest getUsageLimitRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageLimitRequest, GetUsageLimitResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific workgroup.
     * </p>
     * 
     * @param getWorkgroupRequest
     * @return A Java Future containing the result of the GetWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.GetWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkgroupResult> getWorkgroupAsync(GetWorkgroupRequest getWorkgroupRequest);

    /**
     * <p>
     * Returns information about a specific workgroup.
     * </p>
     * 
     * @param getWorkgroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.GetWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkgroupResult> getWorkgroupAsync(GetWorkgroupRequest getWorkgroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkgroupRequest, GetWorkgroupResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>EndpointAccess</code> objects and relevant information.
     * </p>
     * 
     * @param listEndpointAccessRequest
     * @return A Java Future containing the result of the ListEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointAccessResult> listEndpointAccessAsync(ListEndpointAccessRequest listEndpointAccessRequest);

    /**
     * <p>
     * Returns an array of <code>EndpointAccess</code> objects and relevant information.
     * </p>
     * 
     * @param listEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointAccessResult> listEndpointAccessAsync(ListEndpointAccessRequest listEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointAccessRequest, ListEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Returns information about a list of specified namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Returns information about a list of specified namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of recovery points.
     * </p>
     * 
     * @param listRecoveryPointsRequest
     * @return A Java Future containing the result of the ListRecoveryPoints operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsResult> listRecoveryPointsAsync(ListRecoveryPointsRequest listRecoveryPointsRequest);

    /**
     * <p>
     * Returns an array of recovery points.
     * </p>
     * 
     * @param listRecoveryPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecoveryPoints operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsResult> listRecoveryPointsAsync(ListRecoveryPointsRequest listRecoveryPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsRequest, ListRecoveryPointsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of snapshots.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return A Java Future containing the result of the ListSnapshots operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest listSnapshotsRequest);

    /**
     * <p>
     * Returns a list of snapshots.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSnapshots operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest listSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about an array of <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param listTableRestoreStatusRequest
     * @return A Java Future containing the result of the ListTableRestoreStatus operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTableRestoreStatusResult> listTableRestoreStatusAsync(ListTableRestoreStatusRequest listTableRestoreStatusRequest);

    /**
     * <p>
     * Returns information about an array of <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param listTableRestoreStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTableRestoreStatus operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTableRestoreStatusResult> listTableRestoreStatusAsync(ListTableRestoreStatusRequest listTableRestoreStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListTableRestoreStatusRequest, ListTableRestoreStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
     * @sample AWSRedshiftServerlessAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all usage limits within Amazon Redshift Serverless.
     * </p>
     * 
     * @param listUsageLimitsRequest
     * @return A Java Future containing the result of the ListUsageLimits operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListUsageLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageLimitsResult> listUsageLimitsAsync(ListUsageLimitsRequest listUsageLimitsRequest);

    /**
     * <p>
     * Lists all usage limits within Amazon Redshift Serverless.
     * </p>
     * 
     * @param listUsageLimitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsageLimits operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListUsageLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsageLimitsResult> listUsageLimitsAsync(ListUsageLimitsRequest listUsageLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsageLimitsRequest, ListUsageLimitsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a list of specified workgroups.
     * </p>
     * 
     * @param listWorkgroupsRequest
     * @return A Java Future containing the result of the ListWorkgroups operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.ListWorkgroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkgroupsResult> listWorkgroupsAsync(ListWorkgroupsRequest listWorkgroupsRequest);

    /**
     * <p>
     * Returns information about a list of specified workgroups.
     * </p>
     * 
     * @param listWorkgroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkgroups operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.ListWorkgroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkgroupsResult> listWorkgroupsAsync(ListWorkgroupsRequest listWorkgroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkgroupsRequest, ListWorkgroupsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web
     * Services accounts.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web
     * Services accounts.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Restore the data from a recovery point.
     * </p>
     * 
     * @param restoreFromRecoveryPointRequest
     * @return A Java Future containing the result of the RestoreFromRecoveryPoint operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.RestoreFromRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromRecoveryPointResult> restoreFromRecoveryPointAsync(RestoreFromRecoveryPointRequest restoreFromRecoveryPointRequest);

    /**
     * <p>
     * Restore the data from a recovery point.
     * </p>
     * 
     * @param restoreFromRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreFromRecoveryPoint operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.RestoreFromRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromRecoveryPointResult> restoreFromRecoveryPointAsync(RestoreFromRecoveryPointRequest restoreFromRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreFromRecoveryPointRequest, RestoreFromRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Restores a namespace from a snapshot.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     * @return A Java Future containing the result of the RestoreFromSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest);

    /**
     * <p>
     * Restores a namespace from a snapshot.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreFromSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Restores a table from a snapshot to your Amazon Redshift Serverless instance.
     * </p>
     * 
     * @param restoreTableFromSnapshotRequest
     * @return A Java Future containing the result of the RestoreTableFromSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.RestoreTableFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreTableFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableFromSnapshotResult> restoreTableFromSnapshotAsync(RestoreTableFromSnapshotRequest restoreTableFromSnapshotRequest);

    /**
     * <p>
     * Restores a table from a snapshot to your Amazon Redshift Serverless instance.
     * </p>
     * 
     * @param restoreTableFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreTableFromSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.RestoreTableFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreTableFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableFromSnapshotResult> restoreTableFromSnapshotAsync(RestoreTableFromSnapshotRequest restoreTableFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreTableFromSnapshotRequest, RestoreTableFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or set of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or set of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Redshift Serverless managed endpoint.
     * </p>
     * 
     * @param updateEndpointAccessRequest
     * @return A Java Future containing the result of the UpdateEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UpdateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointAccessResult> updateEndpointAccessAsync(UpdateEndpointAccessRequest updateEndpointAccessRequest);

    /**
     * <p>
     * Updates an Amazon Redshift Serverless managed endpoint.
     * </p>
     * 
     * @param updateEndpointAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointAccess operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UpdateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointAccessResult> updateEndpointAccessAsync(UpdateEndpointAccessRequest updateEndpointAccessRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointAccessRequest, UpdateEndpointAccessResult> asyncHandler);

    /**
     * <p>
     * Updates a namespace with the specified settings.
     * </p>
     * 
     * @param updateNamespaceRequest
     * @return A Java Future containing the result of the UpdateNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UpdateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNamespaceResult> updateNamespaceAsync(UpdateNamespaceRequest updateNamespaceRequest);

    /**
     * <p>
     * Updates a namespace with the specified settings.
     * </p>
     * 
     * @param updateNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNamespace operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UpdateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNamespaceResult> updateNamespaceAsync(UpdateNamespaceRequest updateNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNamespaceRequest, UpdateNamespaceResult> asyncHandler);

    /**
     * <p>
     * Updates a snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Updates a snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
     * </p>
     * 
     * @param updateUsageLimitRequest
     * @return A Java Future containing the result of the UpdateUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UpdateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUsageLimitResult> updateUsageLimitAsync(UpdateUsageLimitRequest updateUsageLimitRequest);

    /**
     * <p>
     * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
     * </p>
     * 
     * @param updateUsageLimitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUsageLimit operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UpdateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUsageLimitResult> updateUsageLimitAsync(UpdateUsageLimitRequest updateUsageLimitRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUsageLimitRequest, UpdateUsageLimitResult> asyncHandler);

    /**
     * <p>
     * Updates a workgroup with the specified configuration settings.
     * </p>
     * 
     * @param updateWorkgroupRequest
     * @return A Java Future containing the result of the UpdateWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsync.UpdateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkgroupResult> updateWorkgroupAsync(UpdateWorkgroupRequest updateWorkgroupRequest);

    /**
     * <p>
     * Updates a workgroup with the specified configuration settings.
     * </p>
     * 
     * @param updateWorkgroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkgroup operation returned by the service.
     * @sample AWSRedshiftServerlessAsyncHandler.UpdateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkgroupResult> updateWorkgroupAsync(UpdateWorkgroupRequest updateWorkgroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkgroupRequest, UpdateWorkgroupResult> asyncHandler);

}
