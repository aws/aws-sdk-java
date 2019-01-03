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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon WorkDocs asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkDocsAsyncClient extends AmazonWorkDocsClient implements AmazonWorkDocsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonWorkDocsAsyncClientBuilder asyncBuilder() {
        return AmazonWorkDocsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon WorkDocs using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonWorkDocsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AbortDocumentVersionUploadResult> abortDocumentVersionUploadAsync(AbortDocumentVersionUploadRequest request) {

        return abortDocumentVersionUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AbortDocumentVersionUploadResult> abortDocumentVersionUploadAsync(final AbortDocumentVersionUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<AbortDocumentVersionUploadRequest, AbortDocumentVersionUploadResult> asyncHandler) {
        final AbortDocumentVersionUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AbortDocumentVersionUploadResult>() {
            @Override
            public AbortDocumentVersionUploadResult call() throws Exception {
                AbortDocumentVersionUploadResult result = null;

                try {
                    result = executeAbortDocumentVersionUpload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ActivateUserResult> activateUserAsync(ActivateUserRequest request) {

        return activateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateUserResult> activateUserAsync(final ActivateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateUserRequest, ActivateUserResult> asyncHandler) {
        final ActivateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateUserResult>() {
            @Override
            public ActivateUserResult call() throws Exception {
                ActivateUserResult result = null;

                try {
                    result = executeActivateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AddResourcePermissionsResult> addResourcePermissionsAsync(AddResourcePermissionsRequest request) {

        return addResourcePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddResourcePermissionsResult> addResourcePermissionsAsync(final AddResourcePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddResourcePermissionsRequest, AddResourcePermissionsResult> asyncHandler) {
        final AddResourcePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddResourcePermissionsResult>() {
            @Override
            public AddResourcePermissionsResult call() throws Exception {
                AddResourcePermissionsResult result = null;

                try {
                    result = executeAddResourcePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCommentResult> createCommentAsync(CreateCommentRequest request) {

        return createCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCommentResult> createCommentAsync(final CreateCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCommentRequest, CreateCommentResult> asyncHandler) {
        final CreateCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCommentResult>() {
            @Override
            public CreateCommentResult call() throws Exception {
                CreateCommentResult result = null;

                try {
                    result = executeCreateComment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCustomMetadataResult> createCustomMetadataAsync(CreateCustomMetadataRequest request) {

        return createCustomMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomMetadataResult> createCustomMetadataAsync(final CreateCustomMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomMetadataRequest, CreateCustomMetadataResult> asyncHandler) {
        final CreateCustomMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomMetadataResult>() {
            @Override
            public CreateCustomMetadataResult call() throws Exception {
                CreateCustomMetadataResult result = null;

                try {
                    result = executeCreateCustomMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResult> createFolderAsync(CreateFolderRequest request) {

        return createFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResult> createFolderAsync(final CreateFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFolderRequest, CreateFolderResult> asyncHandler) {
        final CreateFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFolderResult>() {
            @Override
            public CreateFolderResult call() throws Exception {
                CreateFolderResult result = null;

                try {
                    result = executeCreateFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLabelsResult> createLabelsAsync(CreateLabelsRequest request) {

        return createLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLabelsResult> createLabelsAsync(final CreateLabelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLabelsRequest, CreateLabelsResult> asyncHandler) {
        final CreateLabelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLabelsResult>() {
            @Override
            public CreateLabelsResult call() throws Exception {
                CreateLabelsResult result = null;

                try {
                    result = executeCreateLabels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationSubscriptionResult> createNotificationSubscriptionAsync(CreateNotificationSubscriptionRequest request) {

        return createNotificationSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationSubscriptionResult> createNotificationSubscriptionAsync(
            final CreateNotificationSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotificationSubscriptionRequest, CreateNotificationSubscriptionResult> asyncHandler) {
        final CreateNotificationSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotificationSubscriptionResult>() {
            @Override
            public CreateNotificationSubscriptionResult call() throws Exception {
                CreateNotificationSubscriptionResult result = null;

                try {
                    result = executeCreateNotificationSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeactivateUserResult> deactivateUserAsync(DeactivateUserRequest request) {

        return deactivateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateUserResult> deactivateUserAsync(final DeactivateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateUserRequest, DeactivateUserResult> asyncHandler) {
        final DeactivateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateUserResult>() {
            @Override
            public DeactivateUserResult call() throws Exception {
                DeactivateUserResult result = null;

                try {
                    result = executeDeactivateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCommentResult> deleteCommentAsync(DeleteCommentRequest request) {

        return deleteCommentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCommentResult> deleteCommentAsync(final DeleteCommentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCommentRequest, DeleteCommentResult> asyncHandler) {
        final DeleteCommentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCommentResult>() {
            @Override
            public DeleteCommentResult call() throws Exception {
                DeleteCommentResult result = null;

                try {
                    result = executeDeleteComment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomMetadataResult> deleteCustomMetadataAsync(DeleteCustomMetadataRequest request) {

        return deleteCustomMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomMetadataResult> deleteCustomMetadataAsync(final DeleteCustomMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomMetadataRequest, DeleteCustomMetadataResult> asyncHandler) {
        final DeleteCustomMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomMetadataResult>() {
            @Override
            public DeleteCustomMetadataResult call() throws Exception {
                DeleteCustomMetadataResult result = null;

                try {
                    result = executeDeleteCustomMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest request) {

        return deleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(final DeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler) {
        final DeleteDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentResult>() {
            @Override
            public DeleteDocumentResult call() throws Exception {
                DeleteDocumentResult result = null;

                try {
                    result = executeDeleteDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(DeleteFolderRequest request) {

        return deleteFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResult> deleteFolderAsync(final DeleteFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFolderRequest, DeleteFolderResult> asyncHandler) {
        final DeleteFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFolderResult>() {
            @Override
            public DeleteFolderResult call() throws Exception {
                DeleteFolderResult result = null;

                try {
                    result = executeDeleteFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderContentsResult> deleteFolderContentsAsync(DeleteFolderContentsRequest request) {

        return deleteFolderContentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderContentsResult> deleteFolderContentsAsync(final DeleteFolderContentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFolderContentsRequest, DeleteFolderContentsResult> asyncHandler) {
        final DeleteFolderContentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFolderContentsResult>() {
            @Override
            public DeleteFolderContentsResult call() throws Exception {
                DeleteFolderContentsResult result = null;

                try {
                    result = executeDeleteFolderContents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelsResult> deleteLabelsAsync(DeleteLabelsRequest request) {

        return deleteLabelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLabelsResult> deleteLabelsAsync(final DeleteLabelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLabelsRequest, DeleteLabelsResult> asyncHandler) {
        final DeleteLabelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLabelsResult>() {
            @Override
            public DeleteLabelsResult call() throws Exception {
                DeleteLabelsResult result = null;

                try {
                    result = executeDeleteLabels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationSubscriptionResult> deleteNotificationSubscriptionAsync(DeleteNotificationSubscriptionRequest request) {

        return deleteNotificationSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationSubscriptionResult> deleteNotificationSubscriptionAsync(
            final DeleteNotificationSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotificationSubscriptionRequest, DeleteNotificationSubscriptionResult> asyncHandler) {
        final DeleteNotificationSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotificationSubscriptionResult>() {
            @Override
            public DeleteNotificationSubscriptionResult call() throws Exception {
                DeleteNotificationSubscriptionResult result = null;

                try {
                    result = executeDeleteNotificationSubscription(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeActivitiesResult> describeActivitiesAsync(DescribeActivitiesRequest request) {

        return describeActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivitiesResult> describeActivitiesAsync(final DescribeActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivitiesRequest, DescribeActivitiesResult> asyncHandler) {
        final DescribeActivitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActivitiesResult>() {
            @Override
            public DescribeActivitiesResult call() throws Exception {
                DescribeActivitiesResult result = null;

                try {
                    result = executeDescribeActivities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCommentsResult> describeCommentsAsync(DescribeCommentsRequest request) {

        return describeCommentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCommentsResult> describeCommentsAsync(final DescribeCommentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCommentsRequest, DescribeCommentsResult> asyncHandler) {
        final DescribeCommentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCommentsResult>() {
            @Override
            public DescribeCommentsResult call() throws Exception {
                DescribeCommentsResult result = null;

                try {
                    result = executeDescribeComments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentVersionsResult> describeDocumentVersionsAsync(DescribeDocumentVersionsRequest request) {

        return describeDocumentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentVersionsResult> describeDocumentVersionsAsync(final DescribeDocumentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentVersionsRequest, DescribeDocumentVersionsResult> asyncHandler) {
        final DescribeDocumentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentVersionsResult>() {
            @Override
            public DescribeDocumentVersionsResult call() throws Exception {
                DescribeDocumentVersionsResult result = null;

                try {
                    result = executeDescribeDocumentVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFolderContentsResult> describeFolderContentsAsync(DescribeFolderContentsRequest request) {

        return describeFolderContentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFolderContentsResult> describeFolderContentsAsync(final DescribeFolderContentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFolderContentsRequest, DescribeFolderContentsResult> asyncHandler) {
        final DescribeFolderContentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFolderContentsResult>() {
            @Override
            public DescribeFolderContentsResult call() throws Exception {
                DescribeFolderContentsResult result = null;

                try {
                    result = executeDescribeFolderContents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupsResult> describeGroupsAsync(DescribeGroupsRequest request) {

        return describeGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupsResult> describeGroupsAsync(final DescribeGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupsRequest, DescribeGroupsResult> asyncHandler) {
        final DescribeGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupsResult>() {
            @Override
            public DescribeGroupsResult call() throws Exception {
                DescribeGroupsResult result = null;

                try {
                    result = executeDescribeGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationSubscriptionsResult> describeNotificationSubscriptionsAsync(
            DescribeNotificationSubscriptionsRequest request) {

        return describeNotificationSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationSubscriptionsResult> describeNotificationSubscriptionsAsync(
            final DescribeNotificationSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotificationSubscriptionsRequest, DescribeNotificationSubscriptionsResult> asyncHandler) {
        final DescribeNotificationSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotificationSubscriptionsResult>() {
            @Override
            public DescribeNotificationSubscriptionsResult call() throws Exception {
                DescribeNotificationSubscriptionsResult result = null;

                try {
                    result = executeDescribeNotificationSubscriptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePermissionsResult> describeResourcePermissionsAsync(DescribeResourcePermissionsRequest request) {

        return describeResourcePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePermissionsResult> describeResourcePermissionsAsync(final DescribeResourcePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourcePermissionsRequest, DescribeResourcePermissionsResult> asyncHandler) {
        final DescribeResourcePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourcePermissionsResult>() {
            @Override
            public DescribeResourcePermissionsResult call() throws Exception {
                DescribeResourcePermissionsResult result = null;

                try {
                    result = executeDescribeResourcePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRootFoldersResult> describeRootFoldersAsync(DescribeRootFoldersRequest request) {

        return describeRootFoldersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRootFoldersResult> describeRootFoldersAsync(final DescribeRootFoldersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRootFoldersRequest, DescribeRootFoldersResult> asyncHandler) {
        final DescribeRootFoldersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRootFoldersResult>() {
            @Override
            public DescribeRootFoldersResult call() throws Exception {
                DescribeRootFoldersResult result = null;

                try {
                    result = executeDescribeRootFolders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest request) {

        return describeUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(final DescribeUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler) {
        final DescribeUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUsersResult>() {
            @Override
            public DescribeUsersResult call() throws Exception {
                DescribeUsersResult result = null;

                try {
                    result = executeDescribeUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCurrentUserResult> getCurrentUserAsync(GetCurrentUserRequest request) {

        return getCurrentUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCurrentUserResult> getCurrentUserAsync(final GetCurrentUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCurrentUserRequest, GetCurrentUserResult> asyncHandler) {
        final GetCurrentUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCurrentUserResult>() {
            @Override
            public GetCurrentUserResult call() throws Exception {
                GetCurrentUserResult result = null;

                try {
                    result = executeGetCurrentUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest request) {

        return getDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler) {
        final GetDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentResult>() {
            @Override
            public GetDocumentResult call() throws Exception {
                GetDocumentResult result = null;

                try {
                    result = executeGetDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentPathResult> getDocumentPathAsync(GetDocumentPathRequest request) {

        return getDocumentPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentPathResult> getDocumentPathAsync(final GetDocumentPathRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentPathRequest, GetDocumentPathResult> asyncHandler) {
        final GetDocumentPathRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentPathResult>() {
            @Override
            public GetDocumentPathResult call() throws Exception {
                GetDocumentPathResult result = null;

                try {
                    result = executeGetDocumentPath(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentVersionResult> getDocumentVersionAsync(GetDocumentVersionRequest request) {

        return getDocumentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentVersionResult> getDocumentVersionAsync(final GetDocumentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentVersionRequest, GetDocumentVersionResult> asyncHandler) {
        final GetDocumentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentVersionResult>() {
            @Override
            public GetDocumentVersionResult call() throws Exception {
                GetDocumentVersionResult result = null;

                try {
                    result = executeGetDocumentVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(GetFolderRequest request) {

        return getFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFolderResult> getFolderAsync(final GetFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFolderRequest, GetFolderResult> asyncHandler) {
        final GetFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFolderResult>() {
            @Override
            public GetFolderResult call() throws Exception {
                GetFolderResult result = null;

                try {
                    result = executeGetFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFolderPathResult> getFolderPathAsync(GetFolderPathRequest request) {

        return getFolderPathAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFolderPathResult> getFolderPathAsync(final GetFolderPathRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFolderPathRequest, GetFolderPathResult> asyncHandler) {
        final GetFolderPathRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFolderPathResult>() {
            @Override
            public GetFolderPathResult call() throws Exception {
                GetFolderPathResult result = null;

                try {
                    result = executeGetFolderPath(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(final GetResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {
        final GetResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcesResult>() {
            @Override
            public GetResourcesResult call() throws Exception {
                GetResourcesResult result = null;

                try {
                    result = executeGetResources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InitiateDocumentVersionUploadResult> initiateDocumentVersionUploadAsync(InitiateDocumentVersionUploadRequest request) {

        return initiateDocumentVersionUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateDocumentVersionUploadResult> initiateDocumentVersionUploadAsync(
            final InitiateDocumentVersionUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateDocumentVersionUploadRequest, InitiateDocumentVersionUploadResult> asyncHandler) {
        final InitiateDocumentVersionUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitiateDocumentVersionUploadResult>() {
            @Override
            public InitiateDocumentVersionUploadResult call() throws Exception {
                InitiateDocumentVersionUploadResult result = null;

                try {
                    result = executeInitiateDocumentVersionUpload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveAllResourcePermissionsResult> removeAllResourcePermissionsAsync(RemoveAllResourcePermissionsRequest request) {

        return removeAllResourcePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAllResourcePermissionsResult> removeAllResourcePermissionsAsync(final RemoveAllResourcePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAllResourcePermissionsRequest, RemoveAllResourcePermissionsResult> asyncHandler) {
        final RemoveAllResourcePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAllResourcePermissionsResult>() {
            @Override
            public RemoveAllResourcePermissionsResult call() throws Exception {
                RemoveAllResourcePermissionsResult result = null;

                try {
                    result = executeRemoveAllResourcePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveResourcePermissionResult> removeResourcePermissionAsync(RemoveResourcePermissionRequest request) {

        return removeResourcePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveResourcePermissionResult> removeResourcePermissionAsync(final RemoveResourcePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveResourcePermissionRequest, RemoveResourcePermissionResult> asyncHandler) {
        final RemoveResourcePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveResourcePermissionResult>() {
            @Override
            public RemoveResourcePermissionResult call() throws Exception {
                RemoveResourcePermissionResult result = null;

                try {
                    result = executeRemoveResourcePermission(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest request) {

        return updateDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(final UpdateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler) {
        final UpdateDocumentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentResult>() {
            @Override
            public UpdateDocumentResult call() throws Exception {
                UpdateDocumentResult result = null;

                try {
                    result = executeUpdateDocument(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentVersionResult> updateDocumentVersionAsync(UpdateDocumentVersionRequest request) {

        return updateDocumentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDocumentVersionResult> updateDocumentVersionAsync(final UpdateDocumentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDocumentVersionRequest, UpdateDocumentVersionResult> asyncHandler) {
        final UpdateDocumentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentVersionResult>() {
            @Override
            public UpdateDocumentVersionResult call() throws Exception {
                UpdateDocumentVersionResult result = null;

                try {
                    result = executeUpdateDocumentVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(UpdateFolderRequest request) {

        return updateFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResult> updateFolderAsync(final UpdateFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFolderRequest, UpdateFolderResult> asyncHandler) {
        final UpdateFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFolderResult>() {
            @Override
            public UpdateFolderResult call() throws Exception {
                UpdateFolderResult result = null;

                try {
                    result = executeUpdateFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
