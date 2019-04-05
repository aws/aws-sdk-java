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
package com.amazonaws.services.workdocs;

import javax.annotation.Generated;

import com.amazonaws.services.workdocs.model.*;

/**
 * Interface for accessing Amazon WorkDocs asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workdocs.AbstractAmazonWorkDocsAsync} instead.
 * </p>
 * <p>
 * <p>
 * The WorkDocs API is designed for the following use cases:
 * </p>
 * <ul>
 * <li>
 * <p>
 * File Migration: File migration applications are supported for users who want to migrate their files from an
 * on-premises or off-premises file system or service. Users can insert files into a user directory structure, as well
 * as allow for basic metadata changes, such as modifications to the permissions of files.
 * </p>
 * </li>
 * <li>
 * <p>
 * Security: Support security applications are supported for users who have additional security needs, such as antivirus
 * or data loss prevention. The API actions, along with AWS CloudTrail, allow these applications to detect when changes
 * occur in Amazon WorkDocs. Then, the application can take the necessary actions and replace the target file. If the
 * target file violates the policy, the application can also choose to email the user.
 * </p>
 * </li>
 * <li>
 * <p>
 * eDiscovery/Analytics: General administrative applications are supported, such as eDiscovery and analytics. These
 * applications can choose to mimic or record the actions in an Amazon WorkDocs site, along with AWS CloudTrail, to
 * replicate data for eDiscovery, backup, or analytical applications.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All Amazon WorkDocs API actions are Amazon authenticated and certificate-signed. They not only require the use of the
 * AWS SDK, but also allow for the exclusive use of IAM users and roles to help facilitate access, trust, and permission
 * policies. By creating a role and allowing an IAM user to access the Amazon WorkDocs site, the IAM user gains full
 * administrative visibility into the entire Amazon WorkDocs site (or as set in the IAM policy). This includes, but is
 * not limited to, the ability to modify file permissions and upload any file to any user. This allows developers to
 * perform the three use cases above, as well as give users the ability to grant access on a selective basis using the
 * IAM model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkDocsAsync extends AmazonWorkDocs {

    /**
     * <p>
     * Aborts the upload of the specified document version that was previously initiated by
     * <a>InitiateDocumentVersionUpload</a>. The client should make this call only when it no longer intends to upload
     * the document version, or fails to do so.
     * </p>
     * 
     * @param abortDocumentVersionUploadRequest
     * @return A Java Future containing the result of the AbortDocumentVersionUpload operation returned by the service.
     * @sample AmazonWorkDocsAsync.AbortDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AbortDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AbortDocumentVersionUploadResult> abortDocumentVersionUploadAsync(
            AbortDocumentVersionUploadRequest abortDocumentVersionUploadRequest);

    /**
     * <p>
     * Aborts the upload of the specified document version that was previously initiated by
     * <a>InitiateDocumentVersionUpload</a>. The client should make this call only when it no longer intends to upload
     * the document version, or fails to do so.
     * </p>
     * 
     * @param abortDocumentVersionUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AbortDocumentVersionUpload operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.AbortDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AbortDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AbortDocumentVersionUploadResult> abortDocumentVersionUploadAsync(
            AbortDocumentVersionUploadRequest abortDocumentVersionUploadRequest,
            com.amazonaws.handlers.AsyncHandler<AbortDocumentVersionUploadRequest, AbortDocumentVersionUploadResult> asyncHandler);

    /**
     * <p>
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     * </p>
     * 
     * @param activateUserRequest
     * @return A Java Future containing the result of the ActivateUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.ActivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ActivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivateUserResult> activateUserAsync(ActivateUserRequest activateUserRequest);

    /**
     * <p>
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     * </p>
     * 
     * @param activateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.ActivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ActivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivateUserResult> activateUserAsync(ActivateUserRequest activateUserRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateUserRequest, ActivateUserResult> asyncHandler);

    /**
     * <p>
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
     * the principals already have different permissions.
     * </p>
     * 
     * @param addResourcePermissionsRequest
     * @return A Java Future containing the result of the AddResourcePermissions operation returned by the service.
     * @sample AmazonWorkDocsAsync.AddResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddResourcePermissionsResult> addResourcePermissionsAsync(AddResourcePermissionsRequest addResourcePermissionsRequest);

    /**
     * <p>
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
     * the principals already have different permissions.
     * </p>
     * 
     * @param addResourcePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddResourcePermissions operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.AddResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddResourcePermissionsResult> addResourcePermissionsAsync(AddResourcePermissionsRequest addResourcePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<AddResourcePermissionsRequest, AddResourcePermissionsResult> asyncHandler);

    /**
     * <p>
     * Adds a new comment to the specified document version.
     * </p>
     * 
     * @param createCommentRequest
     * @return A Java Future containing the result of the CreateComment operation returned by the service.
     * @sample AmazonWorkDocsAsync.CreateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommentResult> createCommentAsync(CreateCommentRequest createCommentRequest);

    /**
     * <p>
     * Adds a new comment to the specified document version.
     * </p>
     * 
     * @param createCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComment operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.CreateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCommentResult> createCommentAsync(CreateCommentRequest createCommentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCommentRequest, CreateCommentResult> asyncHandler);

    /**
     * <p>
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     * </p>
     * 
     * @param createCustomMetadataRequest
     * @return A Java Future containing the result of the CreateCustomMetadata operation returned by the service.
     * @sample AmazonWorkDocsAsync.CreateCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomMetadataResult> createCustomMetadataAsync(CreateCustomMetadataRequest createCustomMetadataRequest);

    /**
     * <p>
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     * </p>
     * 
     * @param createCustomMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomMetadata operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.CreateCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomMetadataResult> createCustomMetadataAsync(CreateCustomMetadataRequest createCustomMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomMetadataRequest, CreateCustomMetadataResult> asyncHandler);

    /**
     * <p>
     * Creates a folder with the specified name and parent folder.
     * </p>
     * 
     * @param createFolderRequest
     * @return A Java Future containing the result of the CreateFolder operation returned by the service.
     * @sample AmazonWorkDocsAsync.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderResult> createFolderAsync(CreateFolderRequest createFolderRequest);

    /**
     * <p>
     * Creates a folder with the specified name and parent folder.
     * </p>
     * 
     * @param createFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFolder operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFolderResult> createFolderAsync(CreateFolderRequest createFolderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFolderRequest, CreateFolderResult> asyncHandler);

    /**
     * <p>
     * Adds the specified list of labels to the given resource (a document or folder)
     * </p>
     * 
     * @param createLabelsRequest
     * @return A Java Future containing the result of the CreateLabels operation returned by the service.
     * @sample AmazonWorkDocsAsync.CreateLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelsResult> createLabelsAsync(CreateLabelsRequest createLabelsRequest);

    /**
     * <p>
     * Adds the specified list of labels to the given resource (a document or folder)
     * </p>
     * 
     * @param createLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLabels operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.CreateLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelsResult> createLabelsAsync(CreateLabelsRequest createLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLabelsRequest, CreateLabelsResult> asyncHandler);

    /**
     * <p>
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
     * confirm the subscription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/subscribe-notifications.html">Subscribe to
     * Notifications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param createNotificationSubscriptionRequest
     * @return A Java Future containing the result of the CreateNotificationSubscription operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsync.CreateNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotificationSubscriptionResult> createNotificationSubscriptionAsync(
            CreateNotificationSubscriptionRequest createNotificationSubscriptionRequest);

    /**
     * <p>
     * Configure Amazon WorkDocs to use Amazon SNS notifications. The endpoint receives a confirmation message, and must
     * confirm the subscription.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/subscribe-notifications.html">Subscribe to
     * Notifications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param createNotificationSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotificationSubscription operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsyncHandler.CreateNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotificationSubscriptionResult> createNotificationSubscriptionAsync(
            CreateNotificationSubscriptionRequest createNotificationSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotificationSubscriptionRequest, CreateNotificationSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New
     * users can access Amazon WorkDocs.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New
     * users can access Amazon WorkDocs.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     * </p>
     * 
     * @param deactivateUserRequest
     * @return A Java Future containing the result of the DeactivateUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeactivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeactivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeactivateUserResult> deactivateUserAsync(DeactivateUserRequest deactivateUserRequest);

    /**
     * <p>
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     * </p>
     * 
     * @param deactivateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeactivateUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeactivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeactivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeactivateUserResult> deactivateUserAsync(DeactivateUserRequest deactivateUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivateUserRequest, DeactivateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified comment from the document version.
     * </p>
     * 
     * @param deleteCommentRequest
     * @return A Java Future containing the result of the DeleteComment operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentResult> deleteCommentAsync(DeleteCommentRequest deleteCommentRequest);

    /**
     * <p>
     * Deletes the specified comment from the document version.
     * </p>
     * 
     * @param deleteCommentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComment operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteComment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCommentResult> deleteCommentAsync(DeleteCommentRequest deleteCommentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCommentRequest, DeleteCommentResult> asyncHandler);

    /**
     * <p>
     * Deletes custom metadata from the specified resource.
     * </p>
     * 
     * @param deleteCustomMetadataRequest
     * @return A Java Future containing the result of the DeleteCustomMetadata operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomMetadataResult> deleteCustomMetadataAsync(DeleteCustomMetadataRequest deleteCustomMetadataRequest);

    /**
     * <p>
     * Deletes custom metadata from the specified resource.
     * </p>
     * 
     * @param deleteCustomMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomMetadata operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomMetadataResult> deleteCustomMetadataAsync(DeleteCustomMetadataRequest deleteCustomMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomMetadataRequest, DeleteCustomMetadataResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified document and its associated metadata.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Permanently deletes the specified document and its associated metadata.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified folder and its contents.
     * </p>
     * 
     * @param deleteFolderRequest
     * @return A Java Future containing the result of the DeleteFolder operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(DeleteFolderRequest deleteFolderRequest);

    /**
     * <p>
     * Permanently deletes the specified folder and its contents.
     * </p>
     * 
     * @param deleteFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFolder operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(DeleteFolderRequest deleteFolderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFolderRequest, DeleteFolderResult> asyncHandler);

    /**
     * <p>
     * Deletes the contents of the specified folder.
     * </p>
     * 
     * @param deleteFolderContentsRequest
     * @return A Java Future containing the result of the DeleteFolderContents operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolderContents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderContentsResult> deleteFolderContentsAsync(DeleteFolderContentsRequest deleteFolderContentsRequest);

    /**
     * <p>
     * Deletes the contents of the specified folder.
     * </p>
     * 
     * @param deleteFolderContentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFolderContents operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolderContents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFolderContentsResult> deleteFolderContentsAsync(DeleteFolderContentsRequest deleteFolderContentsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFolderContentsRequest, DeleteFolderContentsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified list of labels from a resource.
     * </p>
     * 
     * @param deleteLabelsRequest
     * @return A Java Future containing the result of the DeleteLabels operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLabelsResult> deleteLabelsAsync(DeleteLabelsRequest deleteLabelsRequest);

    /**
     * <p>
     * Deletes the specified list of labels from a resource.
     * </p>
     * 
     * @param deleteLabelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLabels operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteLabels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLabelsResult> deleteLabelsAsync(DeleteLabelsRequest deleteLabelsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLabelsRequest, DeleteLabelsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified subscription from the specified organization.
     * </p>
     * 
     * @param deleteNotificationSubscriptionRequest
     * @return A Java Future containing the result of the DeleteNotificationSubscription operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsync.DeleteNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationSubscriptionResult> deleteNotificationSubscriptionAsync(
            DeleteNotificationSubscriptionRequest deleteNotificationSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified subscription from the specified organization.
     * </p>
     * 
     * @param deleteNotificationSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotificationSubscription operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationSubscriptionResult> deleteNotificationSubscriptionAsync(
            DeleteNotificationSubscriptionRequest deleteNotificationSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationSubscriptionRequest, DeleteNotificationSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Describes the user activities in a specified time period.
     * </p>
     * 
     * @param describeActivitiesRequest
     * @return A Java Future containing the result of the DescribeActivities operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivitiesResult> describeActivitiesAsync(DescribeActivitiesRequest describeActivitiesRequest);

    /**
     * <p>
     * Describes the user activities in a specified time period.
     * </p>
     * 
     * @param describeActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActivities operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActivitiesResult> describeActivitiesAsync(DescribeActivitiesRequest describeActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActivitiesRequest, DescribeActivitiesResult> asyncHandler);

    /**
     * <p>
     * List all the comments for the specified document version.
     * </p>
     * 
     * @param describeCommentsRequest
     * @return A Java Future containing the result of the DescribeComments operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeComments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeComments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommentsResult> describeCommentsAsync(DescribeCommentsRequest describeCommentsRequest);

    /**
     * <p>
     * List all the comments for the specified document version.
     * </p>
     * 
     * @param describeCommentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComments operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeComments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeComments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommentsResult> describeCommentsAsync(DescribeCommentsRequest describeCommentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCommentsRequest, DescribeCommentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the document versions for the specified document.
     * </p>
     * <p>
     * By default, only active versions are returned.
     * </p>
     * 
     * @param describeDocumentVersionsRequest
     * @return A Java Future containing the result of the DescribeDocumentVersions operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeDocumentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentVersionsResult> describeDocumentVersionsAsync(DescribeDocumentVersionsRequest describeDocumentVersionsRequest);

    /**
     * <p>
     * Retrieves the document versions for the specified document.
     * </p>
     * <p>
     * By default, only active versions are returned.
     * </p>
     * 
     * @param describeDocumentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocumentVersions operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeDocumentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDocumentVersionsResult> describeDocumentVersionsAsync(DescribeDocumentVersionsRequest describeDocumentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentVersionsRequest, DescribeDocumentVersionsResult> asyncHandler);

    /**
     * <p>
     * Describes the contents of the specified folder, including its documents and subfolders.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
     * results, the response includes a marker that you can use to request the next set of results. You can also request
     * initialized documents.
     * </p>
     * 
     * @param describeFolderContentsRequest
     * @return A Java Future containing the result of the DescribeFolderContents operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeFolderContents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderContentsResult> describeFolderContentsAsync(DescribeFolderContentsRequest describeFolderContentsRequest);

    /**
     * <p>
     * Describes the contents of the specified folder, including its documents and subfolders.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 100 active document and folder metadata items. If there are more
     * results, the response includes a marker that you can use to request the next set of results. You can also request
     * initialized documents.
     * </p>
     * 
     * @param describeFolderContentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFolderContents operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeFolderContents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFolderContentsResult> describeFolderContentsAsync(DescribeFolderContentsRequest describeFolderContentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFolderContentsRequest, DescribeFolderContentsResult> asyncHandler);

    /**
     * <p>
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     * </p>
     * 
     * @param describeGroupsRequest
     * @return A Java Future containing the result of the DescribeGroups operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupsResult> describeGroupsAsync(DescribeGroupsRequest describeGroupsRequest);

    /**
     * <p>
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     * </p>
     * 
     * @param describeGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGroups operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeGroupsResult> describeGroupsAsync(DescribeGroupsRequest describeGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupsRequest, DescribeGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the specified notification subscriptions.
     * </p>
     * 
     * @param describeNotificationSubscriptionsRequest
     * @return A Java Future containing the result of the DescribeNotificationSubscriptions operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsync.DescribeNotificationSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeNotificationSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationSubscriptionsResult> describeNotificationSubscriptionsAsync(
            DescribeNotificationSubscriptionsRequest describeNotificationSubscriptionsRequest);

    /**
     * <p>
     * Lists the specified notification subscriptions.
     * </p>
     * 
     * @param describeNotificationSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationSubscriptions operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeNotificationSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeNotificationSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationSubscriptionsResult> describeNotificationSubscriptionsAsync(
            DescribeNotificationSubscriptionsRequest describeNotificationSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationSubscriptionsRequest, DescribeNotificationSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions of a specified resource.
     * </p>
     * 
     * @param describeResourcePermissionsRequest
     * @return A Java Future containing the result of the DescribeResourcePermissions operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePermissionsResult> describeResourcePermissionsAsync(
            DescribeResourcePermissionsRequest describeResourcePermissionsRequest);

    /**
     * <p>
     * Describes the permissions of a specified resource.
     * </p>
     * 
     * @param describeResourcePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourcePermissions operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePermissionsResult> describeResourcePermissionsAsync(
            DescribeResourcePermissionsRequest describeResourcePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourcePermissionsRequest, DescribeResourcePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describes the current user's special folders; the <code>RootFolder</code> and the <code>RecycleBin</code>.
     * <code>RootFolder</code> is the root of user's files and folders and <code>RecycleBin</code> is the root of
     * recycled items. This is not a valid action for SigV4 (administrative API) clients.
     * </p>
     * <p>
     * This action requires an authentication token. To get an authentication token, register an application with Amazon
     * WorkDocs. For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/wd-auth-user.html">Authentication and Access
     * Control for User Applications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param describeRootFoldersRequest
     * @return A Java Future containing the result of the DescribeRootFolders operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeRootFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRootFoldersResult> describeRootFoldersAsync(DescribeRootFoldersRequest describeRootFoldersRequest);

    /**
     * <p>
     * Describes the current user's special folders; the <code>RootFolder</code> and the <code>RecycleBin</code>.
     * <code>RootFolder</code> is the root of user's files and folders and <code>RecycleBin</code> is the root of
     * recycled items. This is not a valid action for SigV4 (administrative API) clients.
     * </p>
     * <p>
     * This action requires an authentication token. To get an authentication token, register an application with Amazon
     * WorkDocs. For more information, see <a
     * href="https://docs.aws.amazon.com/workdocs/latest/developerguide/wd-auth-user.html">Authentication and Access
     * Control for User Applications</a> in the <i>Amazon WorkDocs Developer Guide</i>.
     * </p>
     * 
     * @param describeRootFoldersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRootFolders operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeRootFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRootFoldersResult> describeRootFoldersAsync(DescribeRootFoldersRequest describeRootFoldersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRootFoldersRequest, DescribeRootFoldersResult> asyncHandler);

    /**
     * <p>
     * Describes the specified users. You can describe all users or filter the results (for example, by status or
     * organization).
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
     * includes a marker that you can use to request the next set of results.
     * </p>
     * 
     * @param describeUsersRequest
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonWorkDocsAsync.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Describes the specified users. You can describe all users or filter the results (for example, by status or
     * organization).
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns the first 24 active or pending users. If there are more results, the response
     * includes a marker that you can use to request the next set of results.
     * </p>
     * 
     * @param describeUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler);

    /**
     * <p>
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
     * for SigV4 (administrative API) clients.
     * </p>
     * 
     * @param getCurrentUserRequest
     * @return A Java Future containing the result of the GetCurrentUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetCurrentUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetCurrentUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentUserResult> getCurrentUserAsync(GetCurrentUserRequest getCurrentUserRequest);

    /**
     * <p>
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
     * for SigV4 (administrative API) clients.
     * </p>
     * 
     * @param getCurrentUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCurrentUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetCurrentUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetCurrentUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCurrentUserResult> getCurrentUserAsync(GetCurrentUserRequest getCurrentUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetCurrentUserRequest, GetCurrentUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves details of a document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Retrieves details of a document.
     * </p>
     * 
     * @param getDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler);

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the requested document.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * names of the parent folders.
     * </p>
     * 
     * @param getDocumentPathRequest
     * @return A Java Future containing the result of the GetDocumentPath operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetDocumentPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentPathResult> getDocumentPathAsync(GetDocumentPathRequest getDocumentPathRequest);

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the requested document.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested document and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * names of the parent folders.
     * </p>
     * 
     * @param getDocumentPathRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentPath operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetDocumentPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentPathResult> getDocumentPathAsync(GetDocumentPathRequest getDocumentPathRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentPathRequest, GetDocumentPathResult> asyncHandler);

    /**
     * <p>
     * Retrieves version metadata for the specified document.
     * </p>
     * 
     * @param getDocumentVersionRequest
     * @return A Java Future containing the result of the GetDocumentVersion operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentVersionResult> getDocumentVersionAsync(GetDocumentVersionRequest getDocumentVersionRequest);

    /**
     * <p>
     * Retrieves version metadata for the specified document.
     * </p>
     * 
     * @param getDocumentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentVersion operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDocumentVersionResult> getDocumentVersionAsync(GetDocumentVersionRequest getDocumentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentVersionRequest, GetDocumentVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the metadata of the specified folder.
     * </p>
     * 
     * @param getFolderRequest
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest);

    /**
     * <p>
     * Retrieves the metadata of the specified folder.
     * </p>
     * 
     * @param getFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFolder operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest getFolderRequest,
            com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler);

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * parent folder names.
     * </p>
     * 
     * @param getFolderPathRequest
     * @return A Java Future containing the result of the GetFolderPath operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetFolderPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolderPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderPathResult> getFolderPathAsync(GetFolderPathRequest getFolderPathRequest);

    /**
     * <p>
     * Retrieves the path information (the hierarchy from the root folder) for the specified folder.
     * </p>
     * <p>
     * By default, Amazon WorkDocs returns a maximum of 100 levels upwards from the requested folder and only includes
     * the IDs of the parent folders in the path. You can limit the maximum number of levels. You can also request the
     * parent folder names.
     * </p>
     * 
     * @param getFolderPathRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFolderPath operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetFolderPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolderPath" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFolderPathResult> getFolderPathAsync(GetFolderPathRequest getFolderPathRequest,
            com.amazonaws.handlers.AsyncHandler<GetFolderPathRequest, GetFolderPathResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of resources, including folders and documents. The only <code>CollectionType</code>
     * supported is <code>SHARED_WITH_ME</code>.
     * </p>
     * 
     * @param getResourcesRequest
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AmazonWorkDocsAsync.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Retrieves a collection of resources, including folders and documents. The only <code>CollectionType</code>
     * supported is <code>SHARED_WITH_ME</code>.
     * </p>
     * 
     * @param getResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler);

    /**
     * <p>
     * Creates a new document object and version object.
     * </p>
     * <p>
     * The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
     * creating a new version of an existing document. This is the first step to upload a document. Next, upload the
     * document to the URL returned from the call, and then call <a>UpdateDocumentVersion</a>.
     * </p>
     * <p>
     * To cancel the document upload, call <a>AbortDocumentVersionUpload</a>.
     * </p>
     * 
     * @param initiateDocumentVersionUploadRequest
     * @return A Java Future containing the result of the InitiateDocumentVersionUpload operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsync.InitiateDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InitiateDocumentVersionUploadResult> initiateDocumentVersionUploadAsync(
            InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest);

    /**
     * <p>
     * Creates a new document object and version object.
     * </p>
     * <p>
     * The client specifies the parent folder ID and name of the document to upload. The ID is optionally specified when
     * creating a new version of an existing document. This is the first step to upload a document. Next, upload the
     * document to the URL returned from the call, and then call <a>UpdateDocumentVersion</a>.
     * </p>
     * <p>
     * To cancel the document upload, call <a>AbortDocumentVersionUpload</a>.
     * </p>
     * 
     * @param initiateDocumentVersionUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateDocumentVersionUpload operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsyncHandler.InitiateDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InitiateDocumentVersionUploadResult> initiateDocumentVersionUploadAsync(
            InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateDocumentVersionUploadRequest, InitiateDocumentVersionUploadResult> asyncHandler);

    /**
     * <p>
     * Removes all the permissions from the specified resource.
     * </p>
     * 
     * @param removeAllResourcePermissionsRequest
     * @return A Java Future containing the result of the RemoveAllResourcePermissions operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsync.RemoveAllResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveAllResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAllResourcePermissionsResult> removeAllResourcePermissionsAsync(
            RemoveAllResourcePermissionsRequest removeAllResourcePermissionsRequest);

    /**
     * <p>
     * Removes all the permissions from the specified resource.
     * </p>
     * 
     * @param removeAllResourcePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveAllResourcePermissions operation returned by the
     *         service.
     * @sample AmazonWorkDocsAsyncHandler.RemoveAllResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveAllResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAllResourcePermissionsResult> removeAllResourcePermissionsAsync(
            RemoveAllResourcePermissionsRequest removeAllResourcePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAllResourcePermissionsRequest, RemoveAllResourcePermissionsResult> asyncHandler);

    /**
     * <p>
     * Removes the permission for the specified principal from the specified resource.
     * </p>
     * 
     * @param removeResourcePermissionRequest
     * @return A Java Future containing the result of the RemoveResourcePermission operation returned by the service.
     * @sample AmazonWorkDocsAsync.RemoveResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveResourcePermissionResult> removeResourcePermissionAsync(RemoveResourcePermissionRequest removeResourcePermissionRequest);

    /**
     * <p>
     * Removes the permission for the specified principal from the specified resource.
     * </p>
     * 
     * @param removeResourcePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveResourcePermission operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.RemoveResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveResourcePermissionResult> removeResourcePermissionAsync(RemoveResourcePermissionRequest removeResourcePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveResourcePermissionRequest, RemoveResourcePermissionResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attributes of a document. The user must have access to both the document and its parent
     * folder, if applicable.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AmazonWorkDocsAsync.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest);

    /**
     * <p>
     * Updates the specified attributes of a document. The user must have access to both the document and its parent
     * folder, if applicable.
     * </p>
     * 
     * @param updateDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler);

    /**
     * <p>
     * Changes the status of the document version to ACTIVE.
     * </p>
     * <p>
     * Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
     * client uploads the document to an S3-presigned URL returned by <a>InitiateDocumentVersionUpload</a>.
     * </p>
     * 
     * @param updateDocumentVersionRequest
     * @return A Java Future containing the result of the UpdateDocumentVersion operation returned by the service.
     * @sample AmazonWorkDocsAsync.UpdateDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentVersionResult> updateDocumentVersionAsync(UpdateDocumentVersionRequest updateDocumentVersionRequest);

    /**
     * <p>
     * Changes the status of the document version to ACTIVE.
     * </p>
     * <p>
     * Amazon WorkDocs also sets its document container to ACTIVE. This is the last step in a document upload, after the
     * client uploads the document to an S3-presigned URL returned by <a>InitiateDocumentVersionUpload</a>.
     * </p>
     * 
     * @param updateDocumentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentVersion operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.UpdateDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDocumentVersionResult> updateDocumentVersionAsync(UpdateDocumentVersionRequest updateDocumentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentVersionRequest, UpdateDocumentVersionResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its
     * parent folder, if applicable.
     * </p>
     * 
     * @param updateFolderRequest
     * @return A Java Future containing the result of the UpdateFolder operation returned by the service.
     * @sample AmazonWorkDocsAsync.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(UpdateFolderRequest updateFolderRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its
     * parent folder, if applicable.
     * </p>
     * 
     * @param updateFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFolder operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(UpdateFolderRequest updateFolderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFolderRequest, UpdateFolderResult> asyncHandler);

    /**
     * <p>
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
     * Amazon WorkDocs site.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonWorkDocsAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
     * Amazon WorkDocs site.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonWorkDocsAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
