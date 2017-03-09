/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * on-premise or off-premise file system or service. Users can insert files into a user directory structure, as well as
 * allow for basic metadata changes, such as modifications to the permissions of files.
 * </p>
 * </li>
 * <li>
 * <p>
 * Security: Support security applications are supported for users who have additional security needs, such as
 * anti-virus or data loss prevention. The APIs, in conjunction with Amazon CloudTrail, allow these applications to
 * detect when changes occur in Amazon WorkDocs, so the application can take the necessary actions and replace the
 * target file. The application can also choose to email the user if the target file violates the policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * eDiscovery/Analytics: General administrative applications are supported, such as eDiscovery and analytics. These
 * applications can choose to mimic and/or record the actions in an Amazon WorkDocs site, in conjunction with Amazon
 * CloudTrails, to replicate data for eDiscovery, backup, or analytical applications.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All Amazon WorkDocs APIs are Amazon authenticated, certificate-signed APIs. They not only require the use of the AWS
 * SDK, but also allow for the exclusive use of IAM users and roles to help facilitate access, trust, and permission
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

        return executorService.submit(new java.util.concurrent.Callable<AbortDocumentVersionUploadResult>() {
            @Override
            public AbortDocumentVersionUploadResult call() throws Exception {
                AbortDocumentVersionUploadResult result;

                try {
                    result = abortDocumentVersionUpload(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<ActivateUserResult>() {
            @Override
            public ActivateUserResult call() throws Exception {
                ActivateUserResult result;

                try {
                    result = activateUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<AddResourcePermissionsResult>() {
            @Override
            public AddResourcePermissionsResult call() throws Exception {
                AddResourcePermissionsResult result;

                try {
                    result = addResourcePermissions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<CreateFolderResult>() {
            @Override
            public CreateFolderResult call() throws Exception {
                CreateFolderResult result;

                try {
                    result = createFolder(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<CreateNotificationSubscriptionResult>() {
            @Override
            public CreateNotificationSubscriptionResult call() throws Exception {
                CreateNotificationSubscriptionResult result;

                try {
                    result = createNotificationSubscription(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result;

                try {
                    result = createUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeactivateUserResult>() {
            @Override
            public DeactivateUserResult call() throws Exception {
                DeactivateUserResult result;

                try {
                    result = deactivateUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeleteDocumentResult>() {
            @Override
            public DeleteDocumentResult call() throws Exception {
                DeleteDocumentResult result;

                try {
                    result = deleteDocument(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeleteFolderResult>() {
            @Override
            public DeleteFolderResult call() throws Exception {
                DeleteFolderResult result;

                try {
                    result = deleteFolder(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeleteFolderContentsResult>() {
            @Override
            public DeleteFolderContentsResult call() throws Exception {
                DeleteFolderContentsResult result;

                try {
                    result = deleteFolderContents(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotificationSubscriptionResult>() {
            @Override
            public DeleteNotificationSubscriptionResult call() throws Exception {
                DeleteNotificationSubscriptionResult result;

                try {
                    result = deleteNotificationSubscription(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result;

                try {
                    result = deleteUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeDocumentVersionsResult>() {
            @Override
            public DescribeDocumentVersionsResult call() throws Exception {
                DescribeDocumentVersionsResult result;

                try {
                    result = describeDocumentVersions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeFolderContentsResult>() {
            @Override
            public DescribeFolderContentsResult call() throws Exception {
                DescribeFolderContentsResult result;

                try {
                    result = describeFolderContents(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotificationSubscriptionsResult>() {
            @Override
            public DescribeNotificationSubscriptionsResult call() throws Exception {
                DescribeNotificationSubscriptionsResult result;

                try {
                    result = describeNotificationSubscriptions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourcePermissionsResult>() {
            @Override
            public DescribeResourcePermissionsResult call() throws Exception {
                DescribeResourcePermissionsResult result;

                try {
                    result = describeResourcePermissions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeUsersResult>() {
            @Override
            public DescribeUsersResult call() throws Exception {
                DescribeUsersResult result;

                try {
                    result = describeUsers(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentResult>() {
            @Override
            public GetDocumentResult call() throws Exception {
                GetDocumentResult result;

                try {
                    result = getDocument(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentPathResult>() {
            @Override
            public GetDocumentPathResult call() throws Exception {
                GetDocumentPathResult result;

                try {
                    result = getDocumentPath(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<GetDocumentVersionResult>() {
            @Override
            public GetDocumentVersionResult call() throws Exception {
                GetDocumentVersionResult result;

                try {
                    result = getDocumentVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<GetFolderResult>() {
            @Override
            public GetFolderResult call() throws Exception {
                GetFolderResult result;

                try {
                    result = getFolder(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<GetFolderPathResult>() {
            @Override
            public GetFolderPathResult call() throws Exception {
                GetFolderPathResult result;

                try {
                    result = getFolderPath(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<InitiateDocumentVersionUploadResult>() {
            @Override
            public InitiateDocumentVersionUploadResult call() throws Exception {
                InitiateDocumentVersionUploadResult result;

                try {
                    result = initiateDocumentVersionUpload(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<RemoveAllResourcePermissionsResult>() {
            @Override
            public RemoveAllResourcePermissionsResult call() throws Exception {
                RemoveAllResourcePermissionsResult result;

                try {
                    result = removeAllResourcePermissions(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<RemoveResourcePermissionResult>() {
            @Override
            public RemoveResourcePermissionResult call() throws Exception {
                RemoveResourcePermissionResult result;

                try {
                    result = removeResourcePermission(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentResult>() {
            @Override
            public UpdateDocumentResult call() throws Exception {
                UpdateDocumentResult result;

                try {
                    result = updateDocument(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<UpdateDocumentVersionResult>() {
            @Override
            public UpdateDocumentVersionResult call() throws Exception {
                UpdateDocumentVersionResult result;

                try {
                    result = updateDocumentVersion(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<UpdateFolderResult>() {
            @Override
            public UpdateFolderResult call() throws Exception {
                UpdateFolderResult result;

                try {
                    result = updateFolder(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result;

                try {
                    result = updateUser(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
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
