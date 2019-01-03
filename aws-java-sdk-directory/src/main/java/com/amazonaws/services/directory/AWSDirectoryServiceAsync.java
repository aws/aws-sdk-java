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
package com.amazonaws.services.directory;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing Directory Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.directory.AbstractAWSDirectoryServiceAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * AWS Directory Service is a web service that makes it easy for you to setup and run directories in the AWS cloud, or
 * connect your AWS resources with an existing on-premises Microsoft Active Directory. This guide provides detailed
 * information about AWS Directory Service operations, data types, parameters, and errors. For information about AWS
 * Directory Services features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the
 * <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html">AWS Directory Service
 * Administration Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS Directory
 * Service and other AWS services. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDirectoryServiceAsync extends AWSDirectoryService {

    /**
     * <p>
     * Accepts a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param acceptSharedDirectoryRequest
     * @return A Java Future containing the result of the AcceptSharedDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.AcceptSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AcceptSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptSharedDirectoryResult> acceptSharedDirectoryAsync(AcceptSharedDirectoryRequest acceptSharedDirectoryRequest);

    /**
     * <p>
     * Accepts a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param acceptSharedDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptSharedDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.AcceptSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AcceptSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptSharedDirectoryResult> acceptSharedDirectoryAsync(AcceptSharedDirectoryRequest acceptSharedDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptSharedDirectoryRequest, AcceptSharedDirectoryResult> asyncHandler);

    /**
     * <p>
     * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
     * block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. <i>AddIpRoutes</i> adds
     * this address block. You can also use <i>AddIpRoutes</i> to facilitate routing traffic that uses public IP ranges
     * from your Microsoft AD on AWS to a peer VPC.
     * </p>
     * <p>
     * Before you call <i>AddIpRoutes</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>AddIpRoutes</i> operation, see <a
     * href
     * ="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html">AWS
     * Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param addIpRoutesRequest
     * @return A Java Future containing the result of the AddIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsync.AddIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddIpRoutesResult> addIpRoutesAsync(AddIpRoutesRequest addIpRoutesRequest);

    /**
     * <p>
     * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
     * block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. <i>AddIpRoutes</i> adds
     * this address block. You can also use <i>AddIpRoutes</i> to facilitate routing traffic that uses public IP ranges
     * from your Microsoft AD on AWS to a peer VPC.
     * </p>
     * <p>
     * Before you call <i>AddIpRoutes</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>AddIpRoutes</i> operation, see <a
     * href
     * ="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html">AWS
     * Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param addIpRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.AddIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddIpRoutesResult> addIpRoutesAsync(AddIpRoutesRequest addIpRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<AddIpRoutesRequest, AddIpRoutesResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
     * Each tag consists of a key and optional value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDirectoryServiceAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags.
     * Each tag consists of a key and optional value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
     * replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
     * during any of the following states; <code>Initializing</code>, <code>CreatingSnapshot</code>, and
     * <code>UpdatingSchema</code>.
     * </p>
     * 
     * @param cancelSchemaExtensionRequest
     * @return A Java Future containing the result of the CancelSchemaExtension operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CancelSchemaExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CancelSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelSchemaExtensionResult> cancelSchemaExtensionAsync(CancelSchemaExtensionRequest cancelSchemaExtensionRequest);

    /**
     * <p>
     * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
     * replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
     * during any of the following states; <code>Initializing</code>, <code>CreatingSnapshot</code>, and
     * <code>UpdatingSchema</code>.
     * </p>
     * 
     * @param cancelSchemaExtensionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSchemaExtension operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CancelSchemaExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CancelSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelSchemaExtensionResult> cancelSchemaExtensionAsync(CancelSchemaExtensionRequest cancelSchemaExtensionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSchemaExtensionRequest, CancelSchemaExtensionResult> asyncHandler);

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * <p>
     * Before you call <code>ConnectDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the
     * <code>ConnectDirectory</code> operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return A Java Future containing the result of the ConnectDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ConnectDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ConnectDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(ConnectDirectoryRequest connectDirectoryRequest);

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * <p>
     * Before you call <code>ConnectDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the
     * <code>ConnectDirectory</code> operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConnectDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ConnectDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ConnectDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(ConnectDirectoryRequest connectDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
     * access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
     * access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @return A Java Future containing the result of the CreateComputer operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateComputer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateComputer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateComputerResult> createComputerAsync(CreateComputerRequest createComputerRequest);

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComputer operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateComputer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateComputer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateComputerResult> createComputerAsync(CreateComputerRequest createComputerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler);

    /**
     * <p>
     * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
     * to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
     * </p>
     * 
     * @param createConditionalForwarderRequest
     *        Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active
     *        Directory. Conditional forwarders are required in order to set up a trust relationship with another
     *        domain.
     * @return A Java Future containing the result of the CreateConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(
            CreateConditionalForwarderRequest createConditionalForwarderRequest);

    /**
     * <p>
     * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
     * to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
     * </p>
     * 
     * @param createConditionalForwarderRequest
     *        Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active
     *        Directory. Conditional forwarders are required in order to set up a trust relationship with another
     *        domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(
            CreateConditionalForwarderRequest createConditionalForwarderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConditionalForwarderRequest, CreateConditionalForwarderResult> asyncHandler);

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * <p>
     * Before you call <code>CreateDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>CreateDirectory</code>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return A Java Future containing the result of the CreateDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest);

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * <p>
     * Before you call <code>CreateDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>CreateDirectory</code>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler);

    /**
     * <p>
     * Creates a subscription to forward real time Directory Service domain controller security logs to the specified
     * CloudWatch log group in your AWS account.
     * </p>
     * 
     * @param createLogSubscriptionRequest
     * @return A Java Future containing the result of the CreateLogSubscription operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLogSubscriptionResult> createLogSubscriptionAsync(CreateLogSubscriptionRequest createLogSubscriptionRequest);

    /**
     * <p>
     * Creates a subscription to forward real time Directory Service domain controller security logs to the specified
     * CloudWatch log group in your AWS account.
     * </p>
     * 
     * @param createLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLogSubscription operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLogSubscriptionResult> createLogSubscriptionAsync(CreateLogSubscriptionRequest createLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogSubscriptionRequest, CreateLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS Managed Microsoft AD directory.
     * </p>
     * <p>
     * Before you call <i>CreateMicrosoftAD</i>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <i>CreateMicrosoftAD</i>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createMicrosoftADRequest
     *        Creates an AWS Managed Microsoft AD directory.
     * @return A Java Future containing the result of the CreateMicrosoftAD operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateMicrosoftAD
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateMicrosoftAD" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(CreateMicrosoftADRequest createMicrosoftADRequest);

    /**
     * <p>
     * Creates an AWS Managed Microsoft AD directory.
     * </p>
     * <p>
     * Before you call <i>CreateMicrosoftAD</i>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <i>CreateMicrosoftAD</i>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createMicrosoftADRequest
     *        Creates an AWS Managed Microsoft AD directory.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMicrosoftAD operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateMicrosoftAD
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateMicrosoftAD" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(CreateMicrosoftADRequest createMicrosoftADRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMicrosoftADRequest, CreateMicrosoftADResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.
     * </p>
     * <note>
     * <p>
     * You cannot take snapshots of AD Connector directories.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.
     * </p>
     * <note>
     * <p>
     * You cannot take snapshots of AD Connector directories.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
     * you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
     * Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
     * domain, with a single set of credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
     * directory and an external domain. You can create either a forest trust or an external trust.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For
     *        example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing
     *        on-premises Microsoft Active Directory. This would allow you to provide users and groups access to
     *        resources in either domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust relationship between an AWS Managed
     *        Microsoft AD directory and an external domain.
     * @return A Java Future containing the result of the CreateTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsync.CreateTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustResult> createTrustAsync(CreateTrustRequest createTrustRequest);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
     * you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises
     * Microsoft Active Directory. This would allow you to provide users and groups access to resources in either
     * domain, with a single set of credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD
     * directory and an external domain. You can create either a forest trust or an external trust.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For
     *        example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing
     *        on-premises Microsoft Active Directory. This would allow you to provide users and groups access to
     *        resources in either domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust relationship between an AWS Managed
     *        Microsoft AD directory and an external domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.CreateTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustResult> createTrustAsync(CreateTrustRequest createTrustRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrustRequest, CreateTrustResult> asyncHandler);

    /**
     * <p>
     * Deletes a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param deleteConditionalForwarderRequest
     *        Deletes a conditional forwarder.
     * @return A Java Future containing the result of the DeleteConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeleteConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(
            DeleteConditionalForwarderRequest deleteConditionalForwarderRequest);

    /**
     * <p>
     * Deletes a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param deleteConditionalForwarderRequest
     *        Deletes a conditional forwarder.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeleteConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(
            DeleteConditionalForwarderRequest deleteConditionalForwarderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConditionalForwarderRequest, DeleteConditionalForwarderResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * <p>
     * Before you call <code>DeleteDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>DeleteDirectory</code>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @return A Java Future containing the result of the DeleteDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest);

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * <p>
     * Before you call <code>DeleteDirectory</code>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <code>DeleteDirectory</code>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified log subscription.
     * </p>
     * 
     * @param deleteLogSubscriptionRequest
     * @return A Java Future containing the result of the DeleteLogSubscription operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeleteLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLogSubscriptionResult> deleteLogSubscriptionAsync(DeleteLogSubscriptionRequest deleteLogSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified log subscription.
     * </p>
     * 
     * @param deleteLogSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLogSubscription operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeleteLogSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteLogSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLogSubscriptionResult> deleteLogSubscriptionAsync(DeleteLogSubscriptionRequest deleteLogSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogSubscriptionRequest, DeleteLogSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory
     *        and the external domain.
     * @return A Java Future containing the result of the DeleteTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeleteTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(DeleteTrustRequest deleteTrustRequest);

    /**
     * <p>
     * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory
     *        and the external domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeleteTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(DeleteTrustRequest deleteTrustRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrustRequest, DeleteTrustResult> asyncHandler);

    /**
     * <p>
     * Removes the specified directory as a publisher to the specified SNS topic.
     * </p>
     * 
     * @param deregisterEventTopicRequest
     *        Removes the specified directory as a publisher to the specified SNS topic.
     * @return A Java Future containing the result of the DeregisterEventTopic operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DeregisterEventTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeregisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(DeregisterEventTopicRequest deregisterEventTopicRequest);

    /**
     * <p>
     * Removes the specified directory as a publisher to the specified SNS topic.
     * </p>
     * 
     * @param deregisterEventTopicRequest
     *        Removes the specified directory as a publisher to the specified SNS topic.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterEventTopic operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DeregisterEventTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeregisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(DeregisterEventTopicRequest deregisterEventTopicRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterEventTopicRequest, DeregisterEventTopicResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the conditional forwarders for this account.
     * </p>
     * <p>
     * If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
     * the specified directory ID.
     * </p>
     * 
     * @param describeConditionalForwardersRequest
     *        Describes a conditional forwarder.
     * @return A Java Future containing the result of the DescribeConditionalForwarders operation returned by the
     *         service.
     * @sample AWSDirectoryServiceAsync.DescribeConditionalForwarders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeConditionalForwarders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(
            DescribeConditionalForwardersRequest describeConditionalForwardersRequest);

    /**
     * <p>
     * Obtains information about the conditional forwarders for this account.
     * </p>
     * <p>
     * If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
     * the specified directory ID.
     * </p>
     * 
     * @param describeConditionalForwardersRequest
     *        Describes a conditional forwarder.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConditionalForwarders operation returned by the
     *         service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeConditionalForwarders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeConditionalForwarders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(
            DescribeConditionalForwardersRequest describeConditionalForwardersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConditionalForwardersRequest, DescribeConditionalForwardersResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the directory identifiers in the
     * <code>DirectoryIds</code> parameter. Otherwise, all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>DescribeDirectoriesResult.NextToken</code> member contains a token that you
     * pass in the next call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <code>Limit</code> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return A Java Future containing the result of the DescribeDirectories operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDirectories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(DescribeDirectoriesRequest describeDirectoriesRequest);

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the directory identifiers in the
     * <code>DirectoryIds</code> parameter. Otherwise, all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> request and response parameters. If
     * more results are available, the <code>DescribeDirectoriesResult.NextToken</code> member contains a token that you
     * pass in the next call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <code>Limit</code> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectories operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDirectories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(DescribeDirectoriesRequest describeDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest)
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync();

    /**
     * Simplified method form for invoking the DescribeDirectories operation with an AsyncHandler.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler);

    /**
     * <p>
     * Provides information about any domain controllers in your directory.
     * </p>
     * 
     * @param describeDomainControllersRequest
     * @return A Java Future containing the result of the DescribeDomainControllers operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDomainControllers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainControllersResult> describeDomainControllersAsync(
            DescribeDomainControllersRequest describeDomainControllersRequest);

    /**
     * <p>
     * Provides information about any domain controllers in your directory.
     * </p>
     * 
     * @param describeDomainControllersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainControllers operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeDomainControllers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainControllersResult> describeDomainControllersAsync(
            DescribeDomainControllersRequest describeDomainControllersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainControllersRequest, DescribeDomainControllersResult> asyncHandler);

    /**
     * <p>
     * Obtains information about which SNS topics receive status messages from the specified directory.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
     * associations in the account.
     * </p>
     * 
     * @param describeEventTopicsRequest
     *        Describes event topics.
     * @return A Java Future containing the result of the DescribeEventTopics operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeEventTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeEventTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(DescribeEventTopicsRequest describeEventTopicsRequest);

    /**
     * <p>
     * Obtains information about which SNS topics receive status messages from the specified directory.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
     * associations in the account.
     * </p>
     * 
     * @param describeEventTopicsRequest
     *        Describes event topics.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventTopics operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeEventTopics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeEventTopics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(DescribeEventTopicsRequest describeEventTopicsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTopicsRequest, DescribeEventTopicsResult> asyncHandler);

    /**
     * <p>
     * Returns the shared directories in your account.
     * </p>
     * 
     * @param describeSharedDirectoriesRequest
     * @return A Java Future containing the result of the DescribeSharedDirectories operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeSharedDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSharedDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSharedDirectoriesResult> describeSharedDirectoriesAsync(
            DescribeSharedDirectoriesRequest describeSharedDirectoriesRequest);

    /**
     * <p>
     * Returns the shared directories in your account.
     * </p>
     * 
     * @param describeSharedDirectoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSharedDirectories operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeSharedDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSharedDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSharedDirectoriesResult> describeSharedDirectoriesAsync(
            DescribeSharedDirectoriesRequest describeSharedDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSharedDirectoriesRequest, DescribeSharedDirectoriesResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeSnapshots.NextToken</i> member contains a token that you pass in the next
     * call to <a>DescribeSnapshots</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeSnapshots.NextToken</i> member contains a token that you pass in the next
     * call to <a>DescribeSnapshots</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the trust relationships for this account.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
     * relationships belonging to the account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input
     *        parameters are are provided, such as directory ID or trust ID, this request describes all the trust
     *        relationships.
     * @return A Java Future containing the result of the DescribeTrusts operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DescribeTrusts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeTrusts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(DescribeTrustsRequest describeTrustsRequest);

    /**
     * <p>
     * Obtains information about the trust relationships for this account.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
     * relationships belonging to the account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input
     *        parameters are are provided, such as directory ID or trust ID, this request describes all the trust
     *        relationships.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrusts operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DescribeTrusts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeTrusts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(DescribeTrustsRequest describeTrustsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustsRequest, DescribeTrustsResult> asyncHandler);

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
     * for an AD Connector or Microsoft AD directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @return A Java Future containing the result of the DisableRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DisableRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(DisableRadiusRequest disableRadiusRequest);

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
     * for an AD Connector or Microsoft AD directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DisableRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(DisableRadiusRequest disableRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler);

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @return A Java Future containing the result of the DisableSso operation returned by the service.
     * @sample AWSDirectoryServiceAsync.DisableSso
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableSso" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(DisableSsoRequest disableSsoRequest);

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSso operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.DisableSso
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DisableSso" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(DisableSsoRequest disableSsoRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler);

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
     * an AD Connector or Microsoft AD directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @return A Java Future containing the result of the EnableRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsync.EnableRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(EnableRadiusRequest enableRadiusRequest);

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
     * an AD Connector or Microsoft AD directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.EnableRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(EnableRadiusRequest enableRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler);

    /**
     * <p>
     * Enables single sign-on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @return A Java Future containing the result of the EnableSso operation returned by the service.
     * @sample AWSDirectoryServiceAsync.EnableSso
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableSso" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(EnableSsoRequest enableSsoRequest);

    /**
     * <p>
     * Enables single sign-on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSso operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.EnableSso
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableSso" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(EnableSsoRequest enableSsoRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler);

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @return A Java Future containing the result of the GetDirectoryLimits operation returned by the service.
     * @sample AWSDirectoryServiceAsync.GetDirectoryLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetDirectoryLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(GetDirectoryLimitsRequest getDirectoryLimitsRequest);

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDirectoryLimits operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.GetDirectoryLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetDirectoryLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(GetDirectoryLimitsRequest getDirectoryLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest)
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync();

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation with an AsyncHandler.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler);

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @return A Java Future containing the result of the GetSnapshotLimits operation returned by the service.
     * @sample AWSDirectoryServiceAsync.GetSnapshotLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetSnapshotLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(GetSnapshotLimitsRequest getSnapshotLimitsRequest);

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshotLimits operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.GetSnapshotLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/GetSnapshotLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(GetSnapshotLimitsRequest getSnapshotLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler);

    /**
     * <p>
     * Lists the address blocks that you have added to a directory.
     * </p>
     * 
     * @param listIpRoutesRequest
     * @return A Java Future containing the result of the ListIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ListIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIpRoutesResult> listIpRoutesAsync(ListIpRoutesRequest listIpRoutesRequest);

    /**
     * <p>
     * Lists the address blocks that you have added to a directory.
     * </p>
     * 
     * @param listIpRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ListIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIpRoutesResult> listIpRoutesAsync(ListIpRoutesRequest listIpRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIpRoutesRequest, ListIpRoutesResult> asyncHandler);

    /**
     * <p>
     * Lists the active log subscriptions for the AWS account.
     * </p>
     * 
     * @param listLogSubscriptionsRequest
     * @return A Java Future containing the result of the ListLogSubscriptions operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ListLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListLogSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLogSubscriptionsResult> listLogSubscriptionsAsync(ListLogSubscriptionsRequest listLogSubscriptionsRequest);

    /**
     * <p>
     * Lists the active log subscriptions for the AWS account.
     * </p>
     * 
     * @param listLogSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLogSubscriptions operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ListLogSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListLogSubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLogSubscriptionsResult> listLogSubscriptionsAsync(ListLogSubscriptionsRequest listLogSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLogSubscriptionsRequest, ListLogSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists all schema extensions applied to a Microsoft AD Directory.
     * </p>
     * 
     * @param listSchemaExtensionsRequest
     * @return A Java Future containing the result of the ListSchemaExtensions operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ListSchemaExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListSchemaExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaExtensionsResult> listSchemaExtensionsAsync(ListSchemaExtensionsRequest listSchemaExtensionsRequest);

    /**
     * <p>
     * Lists all schema extensions applied to a Microsoft AD Directory.
     * </p>
     * 
     * @param listSchemaExtensionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemaExtensions operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ListSchemaExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListSchemaExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaExtensionsResult> listSchemaExtensionsAsync(ListSchemaExtensionsRequest listSchemaExtensionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemaExtensionsRequest, ListSchemaExtensionsResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on a directory.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on a directory.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
     * topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
     * notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
     * notification when the directory returns to an Active status.
     * </p>
     * 
     * @param registerEventTopicRequest
     *        Registers a new event topic.
     * @return A Java Future containing the result of the RegisterEventTopic operation returned by the service.
     * @sample AWSDirectoryServiceAsync.RegisterEventTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(RegisterEventTopicRequest registerEventTopicRequest);

    /**
     * <p>
     * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
     * topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
     * notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
     * notification when the directory returns to an Active status.
     * </p>
     * 
     * @param registerEventTopicRequest
     *        Registers a new event topic.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterEventTopic operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.RegisterEventTopic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegisterEventTopic" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(RegisterEventTopicRequest registerEventTopicRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterEventTopicRequest, RegisterEventTopicResult> asyncHandler);

    /**
     * <p>
     * Rejects a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param rejectSharedDirectoryRequest
     * @return A Java Future containing the result of the RejectSharedDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.RejectSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RejectSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectSharedDirectoryResult> rejectSharedDirectoryAsync(RejectSharedDirectoryRequest rejectSharedDirectoryRequest);

    /**
     * <p>
     * Rejects a directory sharing request that was sent from the directory owner account.
     * </p>
     * 
     * @param rejectSharedDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectSharedDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.RejectSharedDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RejectSharedDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RejectSharedDirectoryResult> rejectSharedDirectoryAsync(RejectSharedDirectoryRequest rejectSharedDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<RejectSharedDirectoryRequest, RejectSharedDirectoryResult> asyncHandler);

    /**
     * <p>
     * Removes IP address blocks from a directory.
     * </p>
     * 
     * @param removeIpRoutesRequest
     * @return A Java Future containing the result of the RemoveIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsync.RemoveIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveIpRoutesResult> removeIpRoutesAsync(RemoveIpRoutesRequest removeIpRoutesRequest);

    /**
     * <p>
     * Removes IP address blocks from a directory.
     * </p>
     * 
     * @param removeIpRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveIpRoutes operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.RemoveIpRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveIpRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveIpRoutesResult> removeIpRoutesAsync(RemoveIpRoutesRequest removeIpRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveIpRoutesRequest, RemoveIpRoutesResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a directory.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDirectoryServiceAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes tags from a directory.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @return A Java Future containing the result of the ResetUserPassword operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(ResetUserPasswordRequest resetUserPasswordRequest);

    /**
     * <p>
     * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetUserPassword operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(ResetUserPasswordRequest resetUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ResetUserPasswordRequest, ResetUserPasswordResult> asyncHandler);

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
     * overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
     * operation by calling the <a>DescribeDirectories</a> operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
     * @return A Java Future containing the result of the RestoreFromSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsync.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RestoreFromSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest);

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
     * overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
     * operation by calling the <a>DescribeDirectories</a> operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreFromSnapshot operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RestoreFromSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Shares a specified directory (<code>DirectoryId</code>) in your AWS account (directory owner) with another AWS
     * account (directory consumer). With this operation you can use your directory from any AWS account and from any
     * Amazon VPC within an AWS Region.
     * </p>
     * <p>
     * When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the
     * directory consumer account. This shared directory contains the metadata to provide access to the directory within
     * the directory owner account. The shared directory is visible in all VPCs in the directory consumer account.
     * </p>
     * <p>
     * The <code>ShareMethod</code> parameter determines whether the specified directory can be shared between AWS
     * accounts inside the same AWS organization (<code>ORGANIZATIONS</code>). It also determines whether you can share
     * the directory with any other AWS account either inside or outside of the organization (<code>HANDSHAKE</code>).
     * </p>
     * <p>
     * The <code>ShareNotes</code> parameter is only used when <code>HANDSHAKE</code> is called, which sends a directory
     * sharing request to the directory consumer.
     * </p>
     * 
     * @param shareDirectoryRequest
     * @return A Java Future containing the result of the ShareDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.ShareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ShareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ShareDirectoryResult> shareDirectoryAsync(ShareDirectoryRequest shareDirectoryRequest);

    /**
     * <p>
     * Shares a specified directory (<code>DirectoryId</code>) in your AWS account (directory owner) with another AWS
     * account (directory consumer). With this operation you can use your directory from any AWS account and from any
     * Amazon VPC within an AWS Region.
     * </p>
     * <p>
     * When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the
     * directory consumer account. This shared directory contains the metadata to provide access to the directory within
     * the directory owner account. The shared directory is visible in all VPCs in the directory consumer account.
     * </p>
     * <p>
     * The <code>ShareMethod</code> parameter determines whether the specified directory can be shared between AWS
     * accounts inside the same AWS organization (<code>ORGANIZATIONS</code>). It also determines whether you can share
     * the directory with any other AWS account either inside or outside of the organization (<code>HANDSHAKE</code>).
     * </p>
     * <p>
     * The <code>ShareNotes</code> parameter is only used when <code>HANDSHAKE</code> is called, which sends a directory
     * sharing request to the directory consumer.
     * </p>
     * 
     * @param shareDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ShareDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.ShareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ShareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ShareDirectoryResult> shareDirectoryAsync(ShareDirectoryRequest shareDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<ShareDirectoryRequest, ShareDirectoryResult> asyncHandler);

    /**
     * <p>
     * Applies a schema extension to a Microsoft AD directory.
     * </p>
     * 
     * @param startSchemaExtensionRequest
     * @return A Java Future containing the result of the StartSchemaExtension operation returned by the service.
     * @sample AWSDirectoryServiceAsync.StartSchemaExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/StartSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaExtensionResult> startSchemaExtensionAsync(StartSchemaExtensionRequest startSchemaExtensionRequest);

    /**
     * <p>
     * Applies a schema extension to a Microsoft AD directory.
     * </p>
     * 
     * @param startSchemaExtensionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSchemaExtension operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.StartSchemaExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/StartSchemaExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSchemaExtensionResult> startSchemaExtensionAsync(StartSchemaExtensionRequest startSchemaExtensionRequest,
            com.amazonaws.handlers.AsyncHandler<StartSchemaExtensionRequest, StartSchemaExtensionResult> asyncHandler);

    /**
     * <p>
     * Stops the directory sharing between the directory owner and consumer accounts.
     * </p>
     * 
     * @param unshareDirectoryRequest
     * @return A Java Future containing the result of the UnshareDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsync.UnshareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UnshareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnshareDirectoryResult> unshareDirectoryAsync(UnshareDirectoryRequest unshareDirectoryRequest);

    /**
     * <p>
     * Stops the directory sharing between the directory owner and consumer accounts.
     * </p>
     * 
     * @param unshareDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnshareDirectory operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.UnshareDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UnshareDirectory" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnshareDirectoryResult> unshareDirectoryAsync(UnshareDirectoryRequest unshareDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<UnshareDirectoryRequest, UnshareDirectoryResult> asyncHandler);

    /**
     * <p>
     * Updates a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param updateConditionalForwarderRequest
     *        Updates a conditional forwarder.
     * @return A Java Future containing the result of the UpdateConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsync.UpdateConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(
            UpdateConditionalForwarderRequest updateConditionalForwarderRequest);

    /**
     * <p>
     * Updates a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param updateConditionalForwarderRequest
     *        Updates a conditional forwarder.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConditionalForwarder operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.UpdateConditionalForwarder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateConditionalForwarder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(
            UpdateConditionalForwarderRequest updateConditionalForwarderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConditionalForwarderRequest, UpdateConditionalForwarderResult> asyncHandler);

    /**
     * <p>
     * Adds or removes domain controllers to or from the directory. Based on the difference between current value and
     * new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
     * minutes for any new domain controllers to become fully active once the requested number of domain controllers is
     * updated. During this time, you cannot make another update request.
     * </p>
     * 
     * @param updateNumberOfDomainControllersRequest
     * @return A Java Future containing the result of the UpdateNumberOfDomainControllers operation returned by the
     *         service.
     * @sample AWSDirectoryServiceAsync.UpdateNumberOfDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateNumberOfDomainControllers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNumberOfDomainControllersResult> updateNumberOfDomainControllersAsync(
            UpdateNumberOfDomainControllersRequest updateNumberOfDomainControllersRequest);

    /**
     * <p>
     * Adds or removes domain controllers to or from the directory. Based on the difference between current value and
     * new value (provided through this API call), domain controllers will be added or removed. It may take up to 45
     * minutes for any new domain controllers to become fully active once the requested number of domain controllers is
     * updated. During this time, you cannot make another update request.
     * </p>
     * 
     * @param updateNumberOfDomainControllersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNumberOfDomainControllers operation returned by the
     *         service.
     * @sample AWSDirectoryServiceAsyncHandler.UpdateNumberOfDomainControllers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateNumberOfDomainControllers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNumberOfDomainControllersResult> updateNumberOfDomainControllersAsync(
            UpdateNumberOfDomainControllersRequest updateNumberOfDomainControllersRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNumberOfDomainControllersRequest, UpdateNumberOfDomainControllersResult> asyncHandler);

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
     * Microsoft AD directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @return A Java Future containing the result of the UpdateRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsync.UpdateRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(UpdateRadiusRequest updateRadiusRequest);

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or
     * Microsoft AD directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRadius operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.UpdateRadius
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateRadius" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(UpdateRadiusRequest updateRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler);

    /**
     * <p>
     * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
     * Directory.
     * </p>
     * 
     * @param updateTrustRequest
     * @return A Java Future containing the result of the UpdateTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsync.UpdateTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustResult> updateTrustAsync(UpdateTrustRequest updateTrustRequest);

    /**
     * <p>
     * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active
     * Directory.
     * </p>
     * 
     * @param updateTrustRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.UpdateTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustResult> updateTrustAsync(UpdateTrustRequest updateTrustRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrustRequest, UpdateTrustResult> asyncHandler);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory
     *        and an external domain.
     * @return A Java Future containing the result of the VerifyTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsync.VerifyTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/VerifyTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(VerifyTrustRequest verifyTrustRequest);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory
     *        and an external domain.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyTrust operation returned by the service.
     * @sample AWSDirectoryServiceAsyncHandler.VerifyTrust
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/VerifyTrust" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(VerifyTrustRequest verifyTrustRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyTrustRequest, VerifyTrustResult> asyncHandler);

}
