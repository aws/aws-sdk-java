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
package com.amazonaws.services.codecommit;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codecommit.model.*;

/**
 * Interface for accessing CodeCommit.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codecommit.AbstractAWSCodeCommit} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeCommit</fullname>
 * <p>
 * This is the <i>AWS CodeCommit API Reference</i>. This reference provides descriptions of the operations and data
 * types for AWS CodeCommit API along with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeCommit API to work with the following objects:
 * </p>
 * <p>
 * Repositories, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetRepositories</a>, which returns information about one or more repositories associated with your AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateRepository</a>, which creates an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRepository</a>, which deletes an AWS CodeCommit repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRepository</a>, which returns information about a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositories</a>, which lists all AWS CodeCommit repositories associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryDescription</a>, which sets or updates the description of the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRepositoryName</a>, which changes the name of the repository. If you change the name of a repository, no
 * other users of that repository will be able to access it until you send them the new HTTPS or SSH URL to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Branches, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBranch</a>, which creates a new branch in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBranch</a>, which deletes the specified branch in a repository unless it is the default branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBranch</a>, which returns information about a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBranches</a>, which lists all branches for a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateDefaultBranch</a>, which changes the default branch for a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Files, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteFile</a>, which deletes the content of a specified file from a specified branch.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFile</a>, which returns the base-64 encoded content of a specified file.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetFolder</a>, which returns the contents of a specified folder or directory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutFile</a>, which adds or modifies a file in a specified repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Information about committed code in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual Git blob object within a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommit</a>, which returns information about a commit, including commit messages and author and committer
 * information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetDifferences</a>, which returns information about the differences in a valid commit specifier (such as a branch,
 * tag, HEAD, commit ID or other fully qualified reference).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pull requests, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePullRequest</a>, which creates a pull request in a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePullRequestEvents</a>, which returns information about one or more pull request events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForPullRequest</a>, which returns information about comments on a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeConflicts</a>, which returns information about merge conflicts between the source and destination branch
 * in a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequest</a>, which returns information about a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPullRequests</a>, which lists all pull requests for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByFastForward</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForPullRequest</a>, which posts a comment to a pull request at the specified line, file, or request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestDescription</a>, which updates the description of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestStatus</a>, which updates the status of a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestTitle</a>, which updates the title of a pull request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Information about comments in a repository, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteCommentContent</a>, which deletes the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetComment</a>, which returns information about a comment on a commit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForComparedCommit</a>, which returns information about comments on the comparison between two commit
 * specifiers in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForComparedCommit</a>, which creates a comment on the comparison between two commit specifiers in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentReply</a>, which creates a reply to a comment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateComment</a>, which updates the content of a comment on a commit in a repository.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Triggers, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetRepositoryTriggers</a>, which returns information about triggers configured for a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutRepositoryTriggers</a>, which replaces all triggers for a repository and can be used to create or delete
 * triggers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TestRepositoryTriggers</a>, which tests the functionality of a repository trigger by sending data to the trigger
 * target.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeCommit, see the <a
 * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeCommit {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codecommit";

    /**
     * Overrides the default endpoint for this client ("https://codecommit.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codecommit.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codecommit.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
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
     *        The endpoint (ex: "codecommit.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://codecommit.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCodeCommit#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @return Result of the BatchGetRepositories operation returned by the service.
     * @throws RepositoryNamesRequiredException
     *         A repository names object is required but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded. Currently, this number is 25.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.BatchGetRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetRepositoriesResult batchGetRepositories(BatchGetRepositoriesRequest batchGetRepositoriesRequest);

    /**
     * <p>
     * Creates a new branch in a repository and points the branch to a commit.
     * </p>
     * <note>
     * <p>
     * Calling the create branch operation does not set a repository's default branch. To do this, call the update
     * default branch operation.
     * </p>
     * </note>
     * 
     * @param createBranchRequest
     *        Represents the input of a create branch operation.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws BranchNameExistsException
     *         The specified branch name already exists.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBranchResult createBranch(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a commit for a repository on the tip of a specified branch.
     * </p>
     * 
     * @param createCommitRequest
     * @return Result of the CreateCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws FileEntryRequiredException
     *         The commit cannot be created because no files have been specified as added, updated, or changed (PutFile
     *         or DeleteFile) for the commit.
     * @throws MaximumFileEntriesExceededException
     *         The number of specified files to change as part of this commit exceeds the maximum number of files that
     *         can be changed in a single commit. Consider using a Git client for these changes.
     * @throws PutFileEntryConflictException
     *         The commit cannot be created because one or more files specified in the commit reference both a file and
     *         a folder.
     * @throws SourceFileOrContentRequiredException
     *         The commit cannot be created because no source files or file content have been specified for the commit.
     * @throws FileContentAndSourceFileSpecifiedException
     *         The commit cannot be created because both a source file and file content have been specified for the same
     *         file. You cannot provide both. Either specify a source file, or provide the file content directly.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws SamePathRequestException
     *         The commit cannot be created because one or more changes in this commit duplicate actions in the same
     *         file path. For example, you cannot make the same delete request to the same file in the same file path
     *         twice, or make a delete request and a move request to the same file as part of the same commit.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added using PutFile
     *         is 6 MB, and the combined file content change size is 7 MB. Consider making these changes using a Git
     *         client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit result in a folder
     *         contents exceeding the limit of 6 MB. Either reduce the number and size of your changes, or split the
     *         changes across multiple folders.
     * @throws InvalidDeletionParameterException
     *         The specified deletion parameter is not valid.
     * @throws RestrictedSourceFileException
     *         The commit cannot be created because one of the changes specifies copying or moving a .gitkeep file.
     * @throws FileModeRequiredException
     *         The commit cannot be created because a file mode is required to update mode permissions for an existing
     *         file, but no file mode has been specified.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for file names. File names,
     *         including the path to the file, cannot exceed the character limit.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws NoChangeException
     *         The commit cannot be created because no changes will be made to the repository as a result of this
     *         commit. A commit must contain at least one change.
     * @throws FileNameConflictsWithDirectoryNameException
     *         A file cannot be added to the repository because the specified file name has the same name as a directory
     *         in this repository. Either provide another name for the file, or add the file in a directory that does
     *         not match the file name.
     * @throws DirectoryNameConflictsWithFileNameException
     *         A file cannot be added to the repository because the specified path name has the same name as a file that
     *         already exists in this repository. Either provide a different name for the file, or specify a different
     *         path for the file.
     * @throws FilePathConflictsWithSubmodulePathException
     *         The commit cannot be created because a specified file path points to a submodule. Verify that the
     *         destination files have valid file paths that do not point to a submodule.
     * @sample AWSCodeCommit.CreateCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateCommit" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCommitResult createCommit(CreateCommitRequest createCommitRequest);

    /**
     * <p>
     * Creates a pull request in the specified repository.
     * </p>
     * 
     * @param createPullRequestRequest
     * @return Result of the CreatePullRequest operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws ReferenceNameRequiredException
     *         A reference name is required, but none was provided.
     * @throws InvalidReferenceNameException
     *         The specified reference name format is not valid. Reference names must conform to the Git references
     *         format, for example refs/heads/master. For more information, see <a
     *         href="https://git-scm.com/book/en/v2/Git-Internals-Git-References">Git Internals - Git References</a> or
     *         consult your Git documentation.
     * @throws ReferenceDoesNotExistException
     *         The specified reference does not exist. You must provide a full commit ID.
     * @throws ReferenceTypeNotSupportedException
     *         The specified reference is not a supported type.
     * @throws TitleRequiredException
     *         A pull request title is required. It cannot be empty or null.
     * @throws InvalidTitleException
     *         The title of the pull request is not valid. Pull request titles cannot exceed 100 characters in length.
     * @throws InvalidDescriptionException
     *         The pull request description is not valid. Descriptions are limited to 1,000 characters in length.
     * @throws TargetsRequiredException
     *         An array of target objects is required. It cannot be empty or null.
     * @throws InvalidTargetsException
     *         The targets for the pull request is not valid or not in a valid format. Targets are a list of target
     *         objects. Each target object must contain the full values for the repository name, source branch, and
     *         destination branch for a pull request.
     * @throws TargetRequiredException
     *         A pull request target is required. It cannot be empty or null. A pull request target must contain the
     *         full values for the repository name, source branch, and destination branch for the pull request.
     * @throws InvalidTargetException
     *         The target for the pull request is not valid. A target must contain the full values for the repository
     *         name, source branch, and destination branch for the pull request.
     * @throws MultipleRepositoriesInPullRequestException
     *         You cannot include more than one repository in a pull request. Make sure you have specified only one
     *         repository name in your request, and then try again.
     * @throws MaximumOpenPullRequestsExceededException
     *         You cannot create the pull request because the repository has too many open pull requests. The maximum
     *         number of open pull requests for a repository is 1,000. Close one or more open pull requests, and then
     *         try again.
     * @throws SourceAndDestinationAreSameException
     *         The source branch and the destination branch for the pull request are the same. You must specify
     *         different branches for the source and destination.
     * @sample AWSCodeCommit.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePullRequestResult createPullRequest(CreatePullRequestRequest createPullRequestRequest);

    /**
     * <p>
     * Creates a new, empty repository.
     * </p>
     * 
     * @param createRepositoryRequest
     *        Represents the input of a create repository operation.
     * @return Result of the CreateRepository operation returned by the service.
     * @throws RepositoryNameExistsException
     *         The specified repository name already exists.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidRepositoryDescriptionException
     *         The specified repository description is not valid.
     * @throws RepositoryLimitExceededException
     *         A repository resource limit was exceeded.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws DefaultBranchCannotBeDeletedException
     *         The specified branch is the default branch for the repository, and cannot be deleted. To delete this
     *         branch, you must first set another branch as the default branch.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param deleteCommentContentRequest
     * @return Result of the DeleteCommentContent operation returned by the service.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.DeleteCommentContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteCommentContent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCommentContentResult deleteCommentContent(DeleteCommentContentRequest deleteCommentContentRequest);

    /**
     * <p>
     * Deletes a specified file from a specified branch. A commit is created on the branch that contains the revision.
     * The file will still exist in the commits prior to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return Result of the DeleteFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for file names. File names,
     *         including the path to the file, cannot exceed the character limit.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteFile" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFileResult deleteFile(DeleteFileRequest deleteFileRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID will be returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
     * push calls to the deleted repository will fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Returns information about one or more pull request events.
     * </p>
     * 
     * @param describePullRequestEventsRequest
     * @return Result of the DescribePullRequestEvents operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestEventTypeException
     *         The pull request event type is not valid.
     * @throws InvalidActorArnException
     *         The Amazon Resource Name (ARN) is not valid. Make sure that you have provided the full ARN for the user
     *         who initiated the change for the pull request, and then try again.
     * @throws ActorDoesNotExistException
     *         The specified Amazon Resource Name (ARN) does not exist in the AWS account.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.DescribePullRequestEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePullRequestEventsResult describePullRequestEvents(DescribePullRequestEventsRequest describePullRequestEventsRequest);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob within a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @return Result of the GetBlob operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BlobIdRequiredException
     *         A blob ID is required but was not specified.
     * @throws InvalidBlobIdException
     *         The specified blob is not valid.
     * @throws BlobIdDoesNotExistException
     *         The specified blob does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws FileTooLargeException
     *         The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in
     *         AWS CodeCommit, see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
     *         CodeCommit User Guide</a>.
     * @sample AWSCodeCommit.GetBlob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
     *      Documentation</a>
     */
    GetBlobResult getBlob(GetBlobRequest getBlobRequest);

    /**
     * <p>
     * Returns information about a repository branch, including its name and the last commit ID.
     * </p>
     * 
     * @param getBranchRequest
     *        Represents the input of a get branch operation.
     * @return Result of the GetBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Returns the content of a comment made on a change, file, or commit in a repository.
     * </p>
     * 
     * @param getCommentRequest
     * @return Result of the GetComment operation returned by the service.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.GetComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetComment" target="_top">AWS API
     *      Documentation</a>
     */
    GetCommentResult getComment(GetCommentRequest getCommentRequest);

    /**
     * <p>
     * Returns information about comments made on the comparison between two commits.
     * </p>
     * 
     * @param getCommentsForComparedCommitRequest
     * @return Result of the GetCommentsForComparedCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommentsForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    GetCommentsForComparedCommitResult getCommentsForComparedCommit(GetCommentsForComparedCommitRequest getCommentsForComparedCommitRequest);

    /**
     * <p>
     * Returns comments made on a pull request.
     * </p>
     * 
     * @param getCommentsForPullRequestRequest
     * @return Result of the GetCommentsForPullRequest operation returned by the service.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommentsForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    GetCommentsForPullRequestResult getCommentsForPullRequest(GetCommentsForPullRequestRequest getCommentsForPullRequestRequest);

    /**
     * <p>
     * Returns information about a commit, including commit message and committer information.
     * </p>
     * 
     * @param getCommitRequest
     *        Represents the input of a get commit operation.
     * @return Result of the GetCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitIdDoesNotExistException
     *         The specified commit ID does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommit" target="_top">AWS API
     *      Documentation</a>
     */
    GetCommitResult getCommit(GetCommitRequest getCommitRequest);

    /**
     * <p>
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return Result of the GetDifferences operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetDifferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
     *      Documentation</a>
     */
    GetDifferencesResult getDifferences(GetDifferencesRequest getDifferencesRequest);

    /**
     * <p>
     * Returns the base-64 encoded contents of a specified file and its metadata.
     * </p>
     * 
     * @param getFileRequest
     * @return Result of the GetFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have provided the correct name of the file, including
     *         its full path and extension.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws FileTooLargeException
     *         The specified file exceeds the file size limit for AWS CodeCommit. For more information about limits in
     *         AWS CodeCommit, see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
     *         CodeCommit User Guide</a>.
     * @sample AWSCodeCommit.GetFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFile" target="_top">AWS API
     *      Documentation</a>
     */
    GetFileResult getFile(GetFileRequest getFileRequest);

    /**
     * <p>
     * Returns the contents of a specified folder in a repository.
     * </p>
     * 
     * @param getFolderRequest
     * @return Result of the GetFolder operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FolderDoesNotExistException
     *         The specified folder does not exist. Either the folder name is not correct, or you did not provide the
     *         full path to the folder.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetFolder" target="_top">AWS API
     *      Documentation</a>
     */
    GetFolderResult getFolder(GetFolderRequest getFolderRequest);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return Result of the GetMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid. The only valid value is FAST_FORWARD_MERGE.
     * @throws InvalidDestinationCommitSpecifierException
     *         The destination commit specifier is not valid. You must provide a valid branch name, tag, or full commit
     *         ID.
     * @throws InvalidSourceCommitSpecifierException
     *         The source commit specifier is not valid. You must provide a valid branch name, tag, or full commit ID.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeConflicts" target="_top">AWS
     *      API Documentation</a>
     */
    GetMergeConflictsResult getMergeConflicts(GetMergeConflictsRequest getMergeConflictsRequest);

    /**
     * <p>
     * Gets information about a pull request in a specified repository.
     * </p>
     * 
     * @param getPullRequestRequest
     * @return Result of the GetPullRequest operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequest" target="_top">AWS API
     *      Documentation</a>
     */
    GetPullRequestResult getPullRequest(GetPullRequestRequest getPullRequestRequest);

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @return Result of the GetRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    GetRepositoryResult getRepository(GetRepositoryRequest getRepositoryRequest);

    /**
     * <p>
     * Gets information about triggers configured for a repository.
     * </p>
     * 
     * @param getRepositoryTriggersRequest
     *        Represents the input of a get repository triggers operation.
     * @return Result of the GetRepositoryTriggers operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.GetRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    GetRepositoryTriggersResult getRepositoryTriggers(GetRepositoryTriggersRequest getRepositoryTriggersRequest);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return Result of the ListBranches operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @sample AWSCodeCommit.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Returns a list of pull requests for a specified repository. The return list can be refined by pull request status
     * or pull request author ARN.
     * </p>
     * 
     * @param listPullRequestsRequest
     * @return Result of the ListPullRequests operation returned by the service.
     * @throws InvalidPullRequestStatusException
     *         The pull request status is not valid. The only valid values are <code>OPEN</code> and <code>CLOSED</code>
     *         .
     * @throws InvalidAuthorArnException
     *         The Amazon Resource Name (ARN) is not valid. Make sure that you have provided the full ARN for the author
     *         of the pull request, and then try again.
     * @throws AuthorDoesNotExistException
     *         The specified Amazon Resource Name (ARN) does not exist in the AWS account.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.ListPullRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS
     *      API Documentation</a>
     */
    ListPullRequestsResult listPullRequests(ListPullRequestsRequest listPullRequestsRequest);

    /**
     * <p>
     * Gets information about one or more repositories.
     * </p>
     * 
     * @param listRepositoriesRequest
     *        Represents the input of a list repositories operation.
     * @return Result of the ListRepositories operation returned by the service.
     * @throws InvalidSortByException
     *         The specified sort by value is not valid.
     * @throws InvalidOrderException
     *         The specified sort order is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @sample AWSCodeCommit.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Closes a pull request and attempts to merge the source commit of a pull request into the specified destination
     * branch for that pull request at the specified commit using the fast-forward merge option.
     * </p>
     * 
     * @param mergePullRequestByFastForwardRequest
     * @return Result of the MergePullRequestByFastForward operation returned by the service.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws ReferenceDoesNotExistException
     *         The specified reference does not exist. You must provide a full commit ID.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.MergePullRequestByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    MergePullRequestByFastForwardResult mergePullRequestByFastForward(MergePullRequestByFastForwardRequest mergePullRequestByFastForwardRequest);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return Result of the PostCommentForComparedCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the extension of the file as well as
     *         the file name.
     * @throws InvalidRelativeFileVersionEnumException
     *         Either the enum is not in a valid format, or the specified file version enum is not valid in respect to
     *         the current file version.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidFilePositionException
     *         The position is not valid. Make sure that the line number exists in the version of the file you want to
     *         comment on.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     *         The before commit ID and the after commit ID are the same, which is not valid. The before commit ID and
     *         the after commit ID must be different commit IDs.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @sample AWSCodeCommit.PostCommentForComparedCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
     *      target="_top">AWS API Documentation</a>
     */
    PostCommentForComparedCommitResult postCommentForComparedCommit(PostCommentForComparedCommitRequest postCommentForComparedCommitRequest);

    /**
     * <p>
     * Posts a comment on a pull request.
     * </p>
     * 
     * @param postCommentForPullRequestRequest
     * @return Result of the PostCommentForPullRequest operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the extension of the file as well as
     *         the file name.
     * @throws InvalidRelativeFileVersionEnumException
     *         Either the enum is not in a valid format, or the specified file version enum is not valid in respect to
     *         the current file version.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidFilePositionException
     *         The position is not valid. Make sure that the line number exists in the version of the file you want to
     *         comment on.
     * @throws CommitIdRequiredException
     *         A commit ID was not specified.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws PathDoesNotExistException
     *         The specified path does not exist.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws BeforeCommitIdAndAfterCommitIdAreSameException
     *         The before commit ID and the after commit ID are the same, which is not valid. The before commit ID and
     *         the after commit ID must be different commit IDs.
     * @sample AWSCodeCommit.PostCommentForPullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
     *      target="_top">AWS API Documentation</a>
     */
    PostCommentForPullRequestResult postCommentForPullRequest(PostCommentForPullRequestRequest postCommentForPullRequestRequest);

    /**
     * <p>
     * Posts a comment in reply to an existing comment on a comparison between commits or a pull request.
     * </p>
     * 
     * @param postCommentReplyRequest
     * @return Result of the PostCommentReply operation returned by the service.
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request will return
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be re-used.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @sample AWSCodeCommit.PostCommentReply
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentReply" target="_top">AWS
     *      API Documentation</a>
     */
    PostCommentReplyResult postCommentReply(PostCommentReplyRequest postCommentReplyRequest);

    /**
     * <p>
     * Adds or updates a file in a branch in an AWS CodeCommit repository, and generates a commit for the addition in
     * the specified branch.
     * </p>
     * 
     * @param putFileRequest
     * @return Result of the PutFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ParentCommitIdRequiredException
     *         A parent commit ID is required. To view the full commit ID of a branch in a repository, use
     *         <a>GetBranch</a> or a Git command (for example, git pull or git log).
     * @throws InvalidParentCommitIdException
     *         The parent commit ID is not valid. The commit ID cannot be empty, and must match the head commit ID for
     *         the branch of the repository where you want to add or update a file.
     * @throws ParentCommitDoesNotExistException
     *         The parent commit ID is not valid because it does not exist. The specified parent commit ID does not
     *         exist in the specified branch of the repository.
     * @throws ParentCommitIdOutdatedException
     *         The file could not be added because the provided parent commit ID is not the current tip of the specified
     *         branch. To view the full commit ID of the current head of the branch, use <a>GetBranch</a>.
     * @throws FileContentRequiredException
     *         The file cannot be added because it is empty. Empty files cannot be added to the repository with this
     *         API.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size that can be added using PutFile
     *         is 6 MB, and the combined file content change size is 7 MB. Consider making these changes using a Git
     *         client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit result in a folder
     *         contents exceeding the limit of 6 MB. Either reduce the number and size of your changes, or split the
     *         changes across multiple folders.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Type the name of a current branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for file names. File names,
     *         including the path to the file, cannot exceed the character limit.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidDeletionParameterException
     *         The specified deletion parameter is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @throws SameFileContentException
     *         The file was not added or updated because the content of the file is exactly the same as the content of
     *         that file in the repository and branch that you specified.
     * @throws FileNameConflictsWithDirectoryNameException
     *         A file cannot be added to the repository because the specified file name has the same name as a directory
     *         in this repository. Either provide another name for the file, or add the file in a directory that does
     *         not match the file name.
     * @throws DirectoryNameConflictsWithFileNameException
     *         A file cannot be added to the repository because the specified path name has the same name as a file that
     *         already exists in this repository. Either provide a different name for the file, or specify a different
     *         path for the file.
     * @throws FilePathConflictsWithSubmodulePathException
     *         The commit cannot be created because a specified file path points to a submodule. Verify that the
     *         destination files have valid file paths that do not point to a submodule.
     * @sample AWSCodeCommit.PutFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutFile" target="_top">AWS API
     *      Documentation</a>
     */
    PutFileResult putFile(PutFileRequest putFileRequest);

    /**
     * <p>
     * Replaces all triggers for a repository. This can be used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input ofa put repository triggers operation.
     * @return Result of the PutRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The region for the trigger target does not match the region for the repository. Triggers must be created
     *         in the same region as the target for the trigger.
     * @throws InvalidRepositoryTriggerCustomDataException
     *         The custom data provided for the trigger is not valid.
     * @throws MaximumBranchesExceededException
     *         The number of branches for the trigger was exceeded.
     * @throws InvalidRepositoryTriggerBranchNameException
     *         One or more branch names specified for the trigger is not valid.
     * @throws InvalidRepositoryTriggerEventsException
     *         One or more events specified for the trigger is not valid. Check to make sure that all events specified
     *         match the requirements for allowed events.
     * @throws RepositoryTriggerNameRequiredException
     *         A name for the trigger is required but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required but was not specified.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.PutRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PutRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    PutRepositoryTriggersResult putRepositoryTriggers(PutRepositoryTriggersRequest putRepositoryTriggersRequest);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test will send data from the last commit. If no data is available, sample data
     * will be generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @return Result of the TestRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The region for the trigger target does not match the region for the repository. Triggers must be created
     *         in the same region as the target for the trigger.
     * @throws InvalidRepositoryTriggerCustomDataException
     *         The custom data provided for the trigger is not valid.
     * @throws MaximumBranchesExceededException
     *         The number of branches for the trigger was exceeded.
     * @throws InvalidRepositoryTriggerBranchNameException
     *         One or more branch names specified for the trigger is not valid.
     * @throws InvalidRepositoryTriggerEventsException
     *         One or more events specified for the trigger is not valid. Check to make sure that all events specified
     *         match the requirements for allowed events.
     * @throws RepositoryTriggerNameRequiredException
     *         A name for the trigger is required but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required but was not specified.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.TestRepositoryTriggers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers"
     *      target="_top">AWS API Documentation</a>
     */
    TestRepositoryTriggersResult testRepositoryTriggers(TestRepositoryTriggersRequest testRepositoryTriggersRequest);

    /**
     * <p>
     * Replaces the contents of a comment.
     * </p>
     * 
     * @param updateCommentRequest
     * @return Result of the UpdateComment operation returned by the service.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have provided the correct ID, and then try again.
     * @throws CommentIdRequiredException
     *         The comment ID is missing or null. A comment ID is required.
     * @throws InvalidCommentIdException
     *         The comment ID is not in a valid format. Make sure that you have provided the full comment ID.
     * @throws CommentNotCreatedByCallerException
     *         You cannot modify or delete this comment. Only comment authors can modify or delete their comments.
     * @throws CommentDeletedException
     *         This comment has already been deleted. You cannot edit or delete a deleted comment.
     * @sample AWSCodeCommit.UpdateComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateComment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCommentResult updateComment(UpdateCommentRequest updateCommentRequest);

    /**
     * <p>
     * Sets or changes the default branch name for the specified repository.
     * </p>
     * <note>
     * <p>
     * If you use this operation to change the default branch name to the current default branch name, a success message
     * is returned even though the default branch did not change.
     * </p>
     * </note>
     * 
     * @param updateDefaultBranchRequest
     *        Represents the input of an update default branch operation.
     * @return Result of the UpdateDefaultBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdateDefaultBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDefaultBranchResult updateDefaultBranch(UpdateDefaultBranchRequest updateDefaultBranchRequest);

    /**
     * <p>
     * Replaces the contents of the description of a pull request.
     * </p>
     * 
     * @param updatePullRequestDescriptionRequest
     * @return Result of the UpdatePullRequestDescription operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidDescriptionException
     *         The pull request description is not valid. Descriptions are limited to 1,000 characters in length.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @sample AWSCodeCommit.UpdatePullRequestDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestDescription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePullRequestDescriptionResult updatePullRequestDescription(UpdatePullRequestDescriptionRequest updatePullRequestDescriptionRequest);

    /**
     * <p>
     * Updates the status of a pull request.
     * </p>
     * 
     * @param updatePullRequestStatusRequest
     * @return Result of the UpdatePullRequestStatus operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestStatusUpdateException
     *         The pull request status update is not valid. The only valid update is from <code>OPEN</code> to
     *         <code>CLOSED</code>.
     * @throws InvalidPullRequestStatusException
     *         The pull request status is not valid. The only valid values are <code>OPEN</code> and <code>CLOSED</code>
     *         .
     * @throws PullRequestStatusRequiredException
     *         A pull request status is required, but none was provided.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdatePullRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePullRequestStatusResult updatePullRequestStatus(UpdatePullRequestStatusRequest updatePullRequestStatusRequest);

    /**
     * <p>
     * Replaces the title of a pull request.
     * </p>
     * 
     * @param updatePullRequestTitleRequest
     * @return Result of the UpdatePullRequestTitle operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws TitleRequiredException
     *         A pull request title is required. It cannot be empty or null.
     * @throws InvalidTitleException
     *         The title of the pull request is not valid. Pull request titles cannot exceed 100 characters in length.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @sample AWSCodeCommit.UpdatePullRequestTitle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePullRequestTitleResult updatePullRequestTitle(UpdatePullRequestTitleRequest updatePullRequestTitleRequest);

    /**
     * <p>
     * Sets or changes the comment or description for a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a web page could expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a web page.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description operation.
     * @return Result of the UpdateRepositoryDescription operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws InvalidRepositoryDescriptionException
     *         The specified repository description is not valid.
     * @throws EncryptionIntegrityChecksFailedException
     *         An encryption integrity check failed.
     * @throws EncryptionKeyAccessDeniedException
     *         An encryption key could not be accessed.
     * @throws EncryptionKeyDisabledException
     *         The encryption key is disabled.
     * @throws EncryptionKeyNotFoundException
     *         No encryption key was found.
     * @throws EncryptionKeyUnavailableException
     *         The encryption key is not available.
     * @sample AWSCodeCommit.UpdateRepositoryDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryDescription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRepositoryDescriptionResult updateRepositoryDescription(UpdateRepositoryDescriptionRequest updateRepositoryDescriptionRequest);

    /**
     * <p>
     * Renames a repository. The repository name must be unique across the calling AWS account. In addition, repository
     * names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters.
     * The suffix ".git" is prohibited. For a full description of the limits on repository names, see <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param updateRepositoryNameRequest
     *        Represents the input of an update repository description operation.
     * @return Result of the UpdateRepositoryName operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameExistsException
     *         The specified repository name already exists.
     * @throws RepositoryNameRequiredException
     *         A repository name is required but was not specified.
     * @throws InvalidRepositoryNameException
     *         At least one specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception only occurs when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @sample AWSCodeCommit.UpdateRepositoryName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRepositoryNameResult updateRepositoryName(UpdateRepositoryNameRequest updateRepositoryNameRequest);

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
