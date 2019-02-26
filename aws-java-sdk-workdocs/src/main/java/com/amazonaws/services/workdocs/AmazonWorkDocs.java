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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workdocs.model.*;

/**
 * Interface for accessing Amazon WorkDocs.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workdocs.AbstractAmazonWorkDocs} instead.
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
public interface AmazonWorkDocs {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "workdocs";

    /**
     * <p>
     * Aborts the upload of the specified document version that was previously initiated by
     * <a>InitiateDocumentVersionUpload</a>. The client should make this call only when it no longer intends to upload
     * the document version, or fails to do so.
     * </p>
     * 
     * @param abortDocumentVersionUploadRequest
     * @return Result of the AbortDocumentVersionUpload operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.AbortDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AbortDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    AbortDocumentVersionUploadResult abortDocumentVersionUpload(AbortDocumentVersionUploadRequest abortDocumentVersionUploadRequest);

    /**
     * <p>
     * Activates the specified user. Only active users can access Amazon WorkDocs.
     * </p>
     * 
     * @param activateUserRequest
     * @return Result of the ActivateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.ActivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ActivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    ActivateUserResult activateUser(ActivateUserRequest activateUserRequest);

    /**
     * <p>
     * Creates a set of permissions for the specified folder or document. The resource permissions are overwritten if
     * the principals already have different permissions.
     * </p>
     * 
     * @param addResourcePermissionsRequest
     * @return Result of the AddResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.AddResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AddResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    AddResourcePermissionsResult addResourcePermissions(AddResourcePermissionsRequest addResourcePermissionsRequest);

    /**
     * <p>
     * Adds a new comment to the specified document version.
     * </p>
     * 
     * @param createCommentRequest
     * @return Result of the CreateComment operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DocumentLockedForCommentsException
     *         This exception is thrown when the document is locked for comments and user tries to create or delete a
     *         comment on that document.
     * @throws InvalidCommentOperationException
     *         The requested operation is not allowed on the specified comment object.
     * @sample AmazonWorkDocs.CreateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateComment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCommentResult createComment(CreateCommentRequest createCommentRequest);

    /**
     * <p>
     * Adds one or more custom properties to the specified resource (a folder, document, or version).
     * </p>
     * 
     * @param createCustomMetadataRequest
     * @return Result of the CreateCustomMetadata operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws CustomMetadataLimitExceededException
     *         The limit has been reached on the number of custom properties for the specified resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCustomMetadataResult createCustomMetadata(CreateCustomMetadataRequest createCustomMetadataRequest);

    /**
     * <p>
     * Creates a folder with the specified name and parent folder.
     * </p>
     * 
     * @param createFolderRequest
     * @return Result of the CreateFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFolderResult createFolder(CreateFolderRequest createFolderRequest);

    /**
     * <p>
     * Adds the specified list of labels to the given resource (a document or folder)
     * </p>
     * 
     * @param createLabelsRequest
     * @return Result of the CreateLabels operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws TooManyLabelsException
     *         The limit has been reached on the number of labels for the specified resource.
     * @sample AmazonWorkDocs.CreateLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateLabels" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLabelsResult createLabels(CreateLabelsRequest createLabelsRequest);

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
     * @return Result of the CreateNotificationSubscription operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws TooManySubscriptionsException
     *         You've reached the limit on the number of subscriptions for the WorkDocs instance.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNotificationSubscriptionResult createNotificationSubscription(CreateNotificationSubscriptionRequest createNotificationSubscriptionRequest);

    /**
     * <p>
     * Creates a user in a Simple AD or Microsoft AD directory. The status of a newly created user is "ACTIVE". New
     * users can access Amazon WorkDocs.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deactivates the specified user, which revokes the user's access to Amazon WorkDocs.
     * </p>
     * 
     * @param deactivateUserRequest
     * @return Result of the DeactivateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeactivateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeactivateUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeactivateUserResult deactivateUser(DeactivateUserRequest deactivateUserRequest);

    /**
     * <p>
     * Deletes the specified comment from the document version.
     * </p>
     * 
     * @param deleteCommentRequest
     * @return Result of the DeleteComment operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DocumentLockedForCommentsException
     *         This exception is thrown when the document is locked for comments and user tries to create or delete a
     *         comment on that document.
     * @sample AmazonWorkDocs.DeleteComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteComment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCommentResult deleteComment(DeleteCommentRequest deleteCommentRequest);

    /**
     * <p>
     * Deletes custom metadata from the specified resource.
     * </p>
     * 
     * @param deleteCustomMetadataRequest
     * @return Result of the DeleteCustomMetadata operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteCustomMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteCustomMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCustomMetadataResult deleteCustomMetadata(DeleteCustomMetadataRequest deleteCustomMetadataRequest);

    /**
     * <p>
     * Permanently deletes the specified document and its associated metadata.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Permanently deletes the specified folder and its contents.
     * </p>
     * 
     * @param deleteFolderRequest
     * @return Result of the DeleteFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolder" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFolderResult deleteFolder(DeleteFolderRequest deleteFolderRequest);

    /**
     * <p>
     * Deletes the contents of the specified folder.
     * </p>
     * 
     * @param deleteFolderContentsRequest
     * @return Result of the DeleteFolderContents operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteFolderContents" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFolderContentsResult deleteFolderContents(DeleteFolderContentsRequest deleteFolderContentsRequest);

    /**
     * <p>
     * Deletes the specified list of labels from a resource.
     * </p>
     * 
     * @param deleteLabelsRequest
     * @return Result of the DeleteLabels operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteLabels" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLabelsResult deleteLabels(DeleteLabelsRequest deleteLabelsRequest);

    /**
     * <p>
     * Deletes the specified subscription from the specified organization.
     * </p>
     * 
     * @param deleteNotificationSubscriptionRequest
     * @return Result of the DeleteNotificationSubscription operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DeleteNotificationSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteNotificationSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNotificationSubscriptionResult deleteNotificationSubscription(DeleteNotificationSubscriptionRequest deleteNotificationSubscriptionRequest);

    /**
     * <p>
     * Deletes the specified user from a Simple AD or Microsoft AD directory.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Describes the user activities in a specified time period.
     * </p>
     * 
     * @param describeActivitiesRequest
     * @return Result of the DescribeActivities operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeActivitiesResult describeActivities(DescribeActivitiesRequest describeActivitiesRequest);

    /**
     * <p>
     * List all the comments for the specified document version.
     * </p>
     * 
     * @param describeCommentsRequest
     * @return Result of the DescribeComments operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeComments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeComments" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCommentsResult describeComments(DescribeCommentsRequest describeCommentsRequest);

    /**
     * <p>
     * Retrieves the document versions for the specified document.
     * </p>
     * <p>
     * By default, only active versions are returned.
     * </p>
     * 
     * @param describeDocumentVersionsRequest
     * @return Result of the DescribeDocumentVersions operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DescribeDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeDocumentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest describeDocumentVersionsRequest);

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
     * @return Result of the DescribeFolderContents operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.DescribeFolderContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeFolderContents"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFolderContentsResult describeFolderContents(DescribeFolderContentsRequest describeFolderContentsRequest);

    /**
     * <p>
     * Describes the groups specified by the query. Groups are defined by the underlying Active Directory.
     * </p>
     * 
     * @param describeGroupsRequest
     * @return Result of the DescribeGroups operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeGroupsResult describeGroups(DescribeGroupsRequest describeGroupsRequest);

    /**
     * <p>
     * Lists the specified notification subscriptions.
     * </p>
     * 
     * @param describeNotificationSubscriptionsRequest
     * @return Result of the DescribeNotificationSubscriptions operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeNotificationSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeNotificationSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotificationSubscriptionsResult describeNotificationSubscriptions(DescribeNotificationSubscriptionsRequest describeNotificationSubscriptionsRequest);

    /**
     * <p>
     * Describes the permissions of a specified resource.
     * </p>
     * 
     * @param describeResourcePermissionsRequest
     * @return Result of the DescribeResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourcePermissionsResult describeResourcePermissions(DescribeResourcePermissionsRequest describeResourcePermissionsRequest);

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
     * @return Result of the DescribeRootFolders operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.DescribeRootFolders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeRootFolders" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRootFoldersResult describeRootFolders(DescribeRootFoldersRequest describeRootFoldersRequest);

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
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws RequestedEntityTooLargeException
     *         The response is too large to return. The request must include a filter to reduce the size of the
     *         response.
     * @sample AmazonWorkDocs.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUsersResult describeUsers(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Retrieves details of the current user for whom the authentication token was generated. This is not a valid action
     * for SigV4 (administrative API) clients.
     * </p>
     * 
     * @param getCurrentUserRequest
     * @return Result of the GetCurrentUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetCurrentUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetCurrentUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetCurrentUserResult getCurrentUser(GetCurrentUserRequest getCurrentUserRequest);

    /**
     * <p>
     * Retrieves details of a document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws InvalidPasswordException
     *         The password is invalid.
     * @sample AmazonWorkDocs.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest);

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
     * @return Result of the GetDocumentPath operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetDocumentPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentPath" target="_top">AWS API
     *      Documentation</a>
     */
    GetDocumentPathResult getDocumentPath(GetDocumentPathRequest getDocumentPathRequest);

    /**
     * <p>
     * Retrieves version metadata for the specified document.
     * </p>
     * 
     * @param getDocumentVersionRequest
     * @return Result of the GetDocumentVersion operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws InvalidPasswordException
     *         The password is invalid.
     * @sample AmazonWorkDocs.GetDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetDocumentVersionResult getDocumentVersion(GetDocumentVersionRequest getDocumentVersionRequest);

    /**
     * <p>
     * Retrieves the metadata of the specified folder.
     * </p>
     * 
     * @param getFolderRequest
     * @return Result of the GetFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @sample AmazonWorkDocs.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    GetFolderResult getFolder(GetFolderRequest getFolderRequest);

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
     * @return Result of the GetFolderPath operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetFolderPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolderPath" target="_top">AWS API
     *      Documentation</a>
     */
    GetFolderPathResult getFolderPath(GetFolderPathRequest getFolderPathRequest);

    /**
     * <p>
     * Retrieves a collection of resources, including folders and documents. The only <code>CollectionType</code>
     * supported is <code>SHARED_WITH_ME</code>.
     * </p>
     * 
     * @param getResourcesRequest
     * @return Result of the GetResources operation returned by the service.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.GetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetResources" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourcesResult getResources(GetResourcesRequest getResourcesRequest);

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
     * @return Result of the InitiateDocumentVersionUpload operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws StorageLimitExceededException
     *         The storage limit has been exceeded.
     * @throws StorageLimitWillExceedException
     *         The storage limit will be exceeded.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DraftUploadOutOfSyncException
     *         This exception is thrown when a valid checkout ID is not presented on document version upload calls for a
     *         document that has been checked out from Web client.
     * @throws ResourceAlreadyCheckedOutException
     *         The resource is already checked out.
     * @sample AmazonWorkDocs.InitiateDocumentVersionUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
     *      target="_top">AWS API Documentation</a>
     */
    InitiateDocumentVersionUploadResult initiateDocumentVersionUpload(InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest);

    /**
     * <p>
     * Removes all the permissions from the specified resource.
     * </p>
     * 
     * @param removeAllResourcePermissionsRequest
     * @return Result of the RemoveAllResourcePermissions operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.RemoveAllResourcePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveAllResourcePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveAllResourcePermissionsResult removeAllResourcePermissions(RemoveAllResourcePermissionsRequest removeAllResourcePermissionsRequest);

    /**
     * <p>
     * Removes the permission for the specified principal from the specified resource.
     * </p>
     * 
     * @param removeResourcePermissionRequest
     * @return Result of the RemoveResourcePermission operation returned by the service.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.RemoveResourcePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/RemoveResourcePermission"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveResourcePermissionResult removeResourcePermission(RemoveResourcePermissionRequest removeResourcePermissionRequest);

    /**
     * <p>
     * Updates the specified attributes of a document. The user must have access to both the document and its parent
     * folder, if applicable.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return Result of the UpdateDocument operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDocumentResult updateDocument(UpdateDocumentRequest updateDocumentRequest);

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
     * @return Result of the UpdateDocumentVersion operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws InvalidOperationException
     *         The operation is invalid.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateDocumentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocumentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDocumentVersionResult updateDocumentVersion(UpdateDocumentVersionRequest updateDocumentVersionRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified folder. The user must have access to both the folder and its
     * parent folder, if applicable.
     * </p>
     * 
     * @param updateFolderRequest
     * @return Result of the UpdateFolder operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws EntityAlreadyExistsException
     *         The resource already exists.
     * @throws ProhibitedStateException
     *         The specified document version is not in the INITIALIZED state.
     * @throws ConflictingOperationException
     *         Another operation is in progress on the resource that conflicts with the current operation.
     * @throws ConcurrentModificationException
     *         The resource hierarchy is changing.
     * @throws LimitExceededException
     *         The maximum of 100,000 folders under the parent folder has been exceeded.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @sample AmazonWorkDocs.UpdateFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateFolder" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFolderResult updateFolder(UpdateFolderRequest updateFolderRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified user, and grants or revokes administrative privileges to the
     * Amazon WorkDocs site.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws EntityNotExistsException
     *         The resource does not exist.
     * @throws UnauthorizedOperationException
     *         The operation is not permitted.
     * @throws UnauthorizedResourceAccessException
     *         The caller does not have access to perform the action on the resource.
     * @throws IllegalUserStateException
     *         The user is undergoing transfer of ownership.
     * @throws FailedDependencyException
     *         The AWS Directory Service cannot reach an on-premises instance. Or a dependency under the control of the
     *         organization is failing, such as a connected Active Directory.
     * @throws ServiceUnavailableException
     *         One or more of the dependencies is unavailable.
     * @throws DeactivatingLastSystemUserException
     *         The last user in the organization is being deactivated.
     * @throws InvalidArgumentException
     *         The pagination marker or limit fields are not valid.
     * @sample AmazonWorkDocs.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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
