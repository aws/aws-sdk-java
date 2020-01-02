/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * other users of that repository can access it until you send them the new HTTPS or SSH URL to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Branches, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBranch</a>, which creates a branch in a specified repository.
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
 * <a>GetBlob</a>, which returns the base-64 encoded content of an individual Git blob object in a repository.
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
 * <a>PutFile</a>, which adds or modifies a single file in a specified repository and branch.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Commits, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchGetCommits</a>, which returns information about one or more commits in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateCommit</a>, which creates a commit for changes to a repository.
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
 * tag, HEAD, commit ID, or other fully qualified reference).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Merges, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>BatchDescribeMergeConflicts</a>, which returns information about conflicts in a merge between commits in a
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateUnreferencedMergeCommit</a>, which creates an unreferenced commit between two branches or commits for the
 * purpose of comparing them and identifying any potential conflicts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMergeConflicts</a>, which returns information about merge conflicts between the base, source, and
 * destination versions of a file in a potential merge.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMergeCommit</a>, which returns information about the merge between a source and destination commit.
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
 * <a>GetMergeOptions</a>, which returns information about the available merge options between two branches or commit
 * specifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByFastForward</a>, which merges two branches using the fast-forward merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesBySquash</a>, which merges two branches using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergeBranchesByThreeWay</a>, which merges two branches using the three-way merge option.
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
 * <a>CreatePullRequestApprovalRule</a>, which creates an approval rule for a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePullRequestApprovalRule</a>, which deletes an approval rule for a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePullRequestEvents</a>, which returns information about one or more pull request events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EvaluatePullRequestApprovalRules</a>, which evaluates whether a pull request has met all the conditions specified
 * in its associated approval rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetCommentsForPullRequest</a>, which returns information about comments on a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequest</a>, which returns information about a specified pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestApprovalStates</a>, which returns information about the approval states for a specified pull
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPullRequestOverrideState</a>, which returns information about whether approval rules have been set aside
 * (overriden) for a pull request, and if so, the Amazon Resource Name (ARN) of the user or identity that overrode the
 * rules and their requirements for the pull request.
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
 * <a>MergePullRequestBySquash</a>, which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the squash merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>MergePullRequestByThreeWay</a>. which merges the source destination branch of a pull request into the specified
 * destination branch for that pull request using the three-way merge option.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>OverridePullRequestApprovalRules</a>, which sets aside all approval rule requirements for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PostCommentForPullRequest</a>, which posts a comment to a pull request at the specified line, file, or request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalRuleContent</a>, which updates the structure of an approval rule for a pull request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePullRequestApprovalState</a>, which updates the state of an approval on a pull request.
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
 * Approval rule templates, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AssociateApprovalRuleTemplateWithRepository</a>, which associates a template with a specified repository. After
 * the template is associated with a repository, AWS CodeCommit creates approval rules that match the template
 * conditions on every pull request created in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchAssociateApprovalRuleTemplateWithRepositories</a>, which associates a template with one or more specified
 * repositories. After the template is associated with a repository, AWS CodeCommit creates approval rules that match
 * the template conditions on every pull request created in the specified repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchDisassociateApprovalRuleTemplateFromRepositories</a>, which removes the association between a template and
 * specified repositories so that approval rules based on the template are not automatically created when pull requests
 * are created in those repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateApprovalRuleTemplate</a>, which creates a template for approval rules that can then be associated with one
 * or more repositories in your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteApprovalRuleTemplate</a>, which deletes the specified template. It does not remove approval rules on pull
 * requests already created with the template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisassociateApprovalRuleTemplateFromRepository</a>, which removes the association between a template and a
 * repository so that approval rules based on the template are not automatically created when pull requests are created
 * in the specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetApprovalRuleTemplate</a>, which returns information about an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListApprovalRuleTemplates</a>, which lists all approval rule templates in the AWS Region in your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAssociatedApprovalRuleTemplatesForRepository</a>, which lists all approval rule templates that are associated
 * with a specified repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRepositoriesForApprovalRuleTemplate</a>, which lists all repositories associated with the specified approval
 * rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateDescription</a>, which updates the description of an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateName</a>, which updates the name of an approval rule template.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateApprovalRuleTemplateContent</a>, which updates the content of an approval rule template.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Comments in a repository, by calling the following:
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
 * Tags used to tag resources in AWS CodeCommit (not Git tags), by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS
 * CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in AWS CodeCommit.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in AWS CodeCommit.
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
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit User Guide</a>.
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
     * Creates an association between an approval rule template and a specified repository. Then, the next time a pull
     * request is created in the repository where the destination reference (if specified) matches the destination
     * reference (branch) for the pull request, an approval rule that matches the template conditions is automatically
     * created for that pull request. If no destination references are specified in the template, an approval rule that
     * matches the template contents is created for all pull requests in that repository.
     * </p>
     * 
     * @param associateApprovalRuleTemplateWithRepositoryRequest
     * @return Result of the AssociateApprovalRuleTemplateWithRepository operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws MaximumRuleTemplatesAssociatedWithRepositoryException
     *         The maximum number of approval rule templates for a repository has been exceeded. You cannot associate
     *         more than 25 approval rule templates with a repository.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * @sample AWSCodeCommit.AssociateApprovalRuleTemplateWithRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/AssociateApprovalRuleTemplateWithRepository"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateApprovalRuleTemplateWithRepositoryResult associateApprovalRuleTemplateWithRepository(
            AssociateApprovalRuleTemplateWithRepositoryRequest associateApprovalRuleTemplateWithRepositoryRequest);

    /**
     * <p>
     * Creates an association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchAssociateApprovalRuleTemplateWithRepositoriesRequest
     * @return Result of the BatchAssociateApprovalRuleTemplateWithRepositories operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws RepositoryNamesRequiredException
     *         At least one repository name object is required, but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded. Currently, this number is 100.
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
     * @sample AWSCodeCommit.BatchAssociateApprovalRuleTemplateWithRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchAssociateApprovalRuleTemplateWithRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateApprovalRuleTemplateWithRepositoriesResult batchAssociateApprovalRuleTemplateWithRepositories(
            BatchAssociateApprovalRuleTemplateWithRepositoriesRequest batchAssociateApprovalRuleTemplateWithRepositoriesRequest);

    /**
     * <p>
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy.
     * </p>
     * 
     * @param batchDescribeMergeConflictsRequest
     * @return Result of the BatchDescribeMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
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
     * @throws InvalidMaxConflictFilesException
     *         The specified value for the number of conflict files to return is not valid.
     * @throws InvalidMaxMergeHunksException
     *         The specified value for the number of merge hunks to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
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
     * @sample AWSCodeCommit.BatchDescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDescribeMergeConflictsResult batchDescribeMergeConflicts(BatchDescribeMergeConflictsRequest batchDescribeMergeConflictsRequest);

    /**
     * <p>
     * Removes the association between an approval rule template and one or more specified repositories.
     * </p>
     * 
     * @param batchDisassociateApprovalRuleTemplateFromRepositoriesRequest
     * @return Result of the BatchDisassociateApprovalRuleTemplateFromRepositories operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws RepositoryNamesRequiredException
     *         At least one repository name object is required, but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded. Currently, this number is 100.
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
     * @sample AWSCodeCommit.BatchDisassociateApprovalRuleTemplateFromRepositories
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchDisassociateApprovalRuleTemplateFromRepositories"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateApprovalRuleTemplateFromRepositoriesResult batchDisassociateApprovalRuleTemplateFromRepositories(
            BatchDisassociateApprovalRuleTemplateFromRepositoriesRequest batchDisassociateApprovalRuleTemplateFromRepositoriesRequest);

    /**
     * <p>
     * Returns information about the contents of one or more commits in a repository.
     * </p>
     * 
     * @param batchGetCommitsRequest
     * @return Result of the BatchGetCommits operation returned by the service.
     * @throws CommitIdsListRequiredException
     *         A list of commit IDs is required, but was either not specified or the list was empty.
     * @throws CommitIdsLimitExceededException
     *         The maximum number of allowed commit IDs in a batch request is 100. Verify that your batch requests
     *         contains no more than 100 commit IDs, and then try again.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * @sample AWSCodeCommit.BatchGetCommits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetCommitsResult batchGetCommits(BatchGetCommitsRequest batchGetCommitsRequest);

    /**
     * <p>
     * Returns information about one or more repositories.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param batchGetRepositoriesRequest
     *        Represents the input of a batch get repositories operation.
     * @return Result of the BatchGetRepositories operation returned by the service.
     * @throws RepositoryNamesRequiredException
     *         At least one repository name object is required, but was not specified.
     * @throws MaximumRepositoryNamesExceededException
     *         The maximum number of allowed repository names was exceeded. Currently, this number is 100.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Creates a template for approval rules that can then be associated with one or more repositories in your AWS
     * account. When you associate a template with a repository, AWS CodeCommit creates an approval rule that matches
     * the conditions of the template for all pull requests that meet the conditions of the template. For more
     * information, see <a>AssociateApprovalRuleTemplateWithRepository</a>.
     * </p>
     * 
     * @param createApprovalRuleTemplateRequest
     * @return Result of the CreateApprovalRuleTemplate operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateNameAlreadyExistsException
     *         You cannot create an approval rule template with that name because a template with that name already
     *         exists in this AWS Region for your AWS account. Approval rule template names must be unique.
     * @throws ApprovalRuleTemplateContentRequiredException
     *         The content for the approval rule template is empty. You must provide some content for an approval rule
     *         template. The content cannot be null.
     * @throws InvalidApprovalRuleTemplateContentException
     *         The content of the approval rule template is not valid.
     * @throws InvalidApprovalRuleTemplateDescriptionException
     *         The description for the approval rule template is not valid because it exceeds the maximum characters
     *         allowed for a description. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws NumberOfRuleTemplatesExceededException
     *         The maximum number of approval rule templates has been exceeded for this AWS Region.
     * @sample AWSCodeCommit.CreateApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApprovalRuleTemplateResult createApprovalRuleTemplate(CreateApprovalRuleTemplateRequest createApprovalRuleTemplateRequest);

    /**
     * <p>
     * Creates a branch in a repository and points the branch to a commit.
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A branch name is required, but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
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
     *         file. You cannot provide both. Either specify a source file or provide the file content directly.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws SamePathRequestException
     *         The commit cannot be created because one or more changes in this commit duplicate actions in the same
     *         file path. For example, you cannot make the same delete request to the same file in the same file path
     *         twice, or make a delete request and a move request to the same file as part of the same commit.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have used the correct file name, full path, and
     *         extension.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws InvalidDeletionParameterException
     *         The specified deletion parameter is not valid.
     * @throws RestrictedSourceFileException
     *         The commit cannot be created because one of the changes specifies copying or moving a .gitkeep file.
     * @throws FileModeRequiredException
     *         The commit cannot be created because no file mode has been specified. A file mode is required to update
     *         mode permissions for a file.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         token that, when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be reused.
     * @throws ReferenceNameRequiredException
     *         A reference name is required, but none was provided.
     * @throws InvalidReferenceNameException
     *         The specified reference name format is not valid. Reference names must conform to the Git references
     *         format (for example, refs/heads/master). For more information, see <a
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
     *         The pull request description is not valid. Descriptions cannot be more than 1,000 characters.
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
     *         The source branch and destination branch for the pull request are the same. You must specify different
     *         branches for the source and destination.
     * @sample AWSCodeCommit.CreatePullRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequest" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePullRequestResult createPullRequest(CreatePullRequestRequest createPullRequestRequest);

    /**
     * <p>
     * Creates an approval rule for a pull request.
     * </p>
     * 
     * @param createPullRequestApprovalRuleRequest
     * @return Result of the CreatePullRequestApprovalRule operation returned by the service.
     * @throws ApprovalRuleNameRequiredException
     *         An approval rule name is required, but was not specified.
     * @throws InvalidApprovalRuleNameException
     *         The name for the approval rule is not valid.
     * @throws ApprovalRuleNameAlreadyExistsException
     *         An approval rule with that name already exists. Approval rule names must be unique within the scope of a
     *         pull request.
     * @throws ApprovalRuleContentRequiredException
     *         The content for the approval rule is empty. You must provide some content for an approval rule. The
     *         content cannot be null.
     * @throws InvalidApprovalRuleContentException
     *         The content for the approval rule is not valid.
     * @throws NumberOfRulesExceededException
     *         The approval rule cannot be added. The pull request has the maximum number of approval rules associated
     *         with it.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
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
     * @sample AWSCodeCommit.CreatePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreatePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePullRequestApprovalRuleResult createPullRequestApprovalRule(CreatePullRequestApprovalRuleRequest createPullRequestApprovalRuleRequest);

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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * @throws InvalidTagsMapException
     *         The map of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates an unreferenced commit that represents the result of merging two branches using a specified merge
     * strategy. This can help you determine the outcome of a potential merge. This API cannot be used with the
     * fast-forward merge strategy because that strategy does not create a merge commit.
     * </p>
     * <note>
     * <p>
     * This unreferenced merge commit can only be accessed using the GetCommit API or through git commands such as git
     * fetch. To retrieve this commit, you must specify its commit ID or otherwise reference it.
     * </p>
     * </note>
     * 
     * @param createUnreferencedMergeCommitRequest
     * @return Result of the CreateUnreferencedMergeCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified, but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws FileModeRequiredException
     *         The commit cannot be created because no file mode has been specified. A file mode is required to update
     *         mode permissions for a file.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
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
     * @sample AWSCodeCommit.CreateUnreferencedMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CreateUnreferencedMergeCommit"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUnreferencedMergeCommitResult createUnreferencedMergeCommit(CreateUnreferencedMergeCommitRequest createUnreferencedMergeCommitRequest);

    /**
     * <p>
     * Deletes a specified approval rule template. Deleting a template does not remove approval rules on pull requests
     * already created with the template.
     * </p>
     * 
     * @param deleteApprovalRuleTemplateRequest
     * @return Result of the DeleteApprovalRuleTemplate operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateInUseException
     *         The approval rule template is associated with one or more repositories. You cannot delete a template that
     *         is associated with a repository. Remove all associations, and then try again.
     * @sample AWSCodeCommit.DeleteApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApprovalRuleTemplateResult deleteApprovalRuleTemplate(DeleteApprovalRuleTemplateRequest deleteApprovalRuleTemplateRequest);

    /**
     * <p>
     * Deletes a branch from a repository, unless that branch is the default branch for the repository.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Represents the input of a delete branch operation.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
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
     *         No comment exists with the provided ID. Verify that you have used the correct ID, and then try again.
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
     * The file still exists in the commits earlier to the commit that contains the deletion.
     * </p>
     * 
     * @param deleteFileRequest
     * @return Result of the DeleteFile operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         The specified file does not exist. Verify that you have used the correct file name, full path, and
     *         extension.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
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
     * Deletes an approval rule from a specified pull request. Approval rules can be deleted from a pull request only if
     * the pull request is open, and if the approval rule was created specifically for a pull request and not generated
     * from an approval rule template associated with the repository where the pull request was created. You cannot
     * delete an approval rule from a merged or closed pull request.
     * </p>
     * 
     * @param deletePullRequestApprovalRuleRequest
     * @return Result of the DeletePullRequestApprovalRule operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws ApprovalRuleNameRequiredException
     *         An approval rule name is required, but was not specified.
     * @throws InvalidApprovalRuleNameException
     *         The name for the approval rule is not valid.
     * @throws CannotDeleteApprovalRuleFromTemplateException
     *         The approval rule cannot be deleted from the pull request because it was created by an approval rule
     *         template and applied to the pull request automatically.
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
     * @sample AWSCodeCommit.DeletePullRequestApprovalRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeletePullRequestApprovalRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePullRequestApprovalRuleResult deletePullRequestApprovalRule(DeletePullRequestApprovalRuleRequest deletePullRequestApprovalRuleRequest);

    /**
     * <p>
     * Deletes a repository. If a specified repository was already deleted, a null repository ID is returned.
     * </p>
     * <important>
     * <p>
     * Deleting a repository also deletes all associated objects and metadata. After a repository is deleted, all future
     * push calls to the deleted repository fail.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryRequest
     *        Represents the input of a delete repository operation.
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Returns information about one or more merge conflicts in the attempted merge of two commit specifiers using the
     * squash or three-way merge strategy. If the merge option for the attempted merge is specified as
     * FAST_FORWARD_MERGE, an exception is thrown.
     * </p>
     * 
     * @param describeMergeConflictsRequest
     * @return Result of the DescribeMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
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
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileDoesNotExistException
     *         The specified file does not exist. Verify that you have used the correct file name, full path, and
     *         extension.
     * @throws InvalidMaxMergeHunksException
     *         The specified value for the number of merge hunks to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
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
     * @sample AWSCodeCommit.DescribeMergeConflicts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribeMergeConflicts"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMergeConflictsResult describeMergeConflicts(DescribeMergeConflictsRequest describeMergeConflictsRequest);

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
     * Removes the association between a template and a repository so that approval rules based on the template are not
     * automatically created when pull requests are created in the specified repository. This does not delete any
     * approval rules previously created for pull requests through the template association.
     * </p>
     * 
     * @param disassociateApprovalRuleTemplateFromRepositoryRequest
     * @return Result of the DisassociateApprovalRuleTemplateFromRepository operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * @sample AWSCodeCommit.DisassociateApprovalRuleTemplateFromRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DisassociateApprovalRuleTemplateFromRepository"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateApprovalRuleTemplateFromRepositoryResult disassociateApprovalRuleTemplateFromRepository(
            DisassociateApprovalRuleTemplateFromRepositoryRequest disassociateApprovalRuleTemplateFromRepositoryRequest);

    /**
     * <p>
     * Evaluates whether a pull request has met all the conditions specified in its associated approval rules.
     * </p>
     * 
     * @param evaluatePullRequestApprovalRulesRequest
     * @return Result of the EvaluatePullRequestApprovalRules operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidRevisionIdException
     *         The revision ID is not valid. Use GetPullRequest to determine the value.
     * @throws RevisionIdRequiredException
     *         A revision ID is required, but was not provided.
     * @throws RevisionNotCurrentException
     *         The revision ID provided in the request does not match the current revision ID. Use GetPullRequest to
     *         retrieve the current revision ID.
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
     * @sample AWSCodeCommit.EvaluatePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/EvaluatePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    EvaluatePullRequestApprovalRulesResult evaluatePullRequestApprovalRules(EvaluatePullRequestApprovalRulesRequest evaluatePullRequestApprovalRulesRequest);

    /**
     * <p>
     * Returns information about a specified approval rule template.
     * </p>
     * 
     * @param getApprovalRuleTemplateRequest
     * @return Result of the GetApprovalRuleTemplate operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @sample AWSCodeCommit.GetApprovalRuleTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetApprovalRuleTemplateResult getApprovalRuleTemplate(GetApprovalRuleTemplateRequest getApprovalRuleTemplateRequest);

    /**
     * <p>
     * Returns the base-64 encoded content of an individual blob in a repository.
     * </p>
     * 
     * @param getBlobRequest
     *        Represents the input of a get blob operation.
     * @return Result of the GetBlob operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws BlobIdRequiredException
     *         A blob ID is required, but was not specified.
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
     *         AWS CodeCommit, see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
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
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
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
     *         No comment exists with the provided ID. Verify that you have used the correct ID, and then try again.
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
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Returns information about the differences in a valid commit specifier (such as a branch, tag, HEAD, commit ID, or
     * other fully qualified reference). Results can be limited to a specified path.
     * </p>
     * 
     * @param getDifferencesRequest
     * @return Result of the GetDifferences operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         The specified file does not exist. Verify that you have used the correct file name, full path, and
     *         extension.
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
     *         AWS CodeCommit, see <a href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         The specified folder does not exist. Either the folder name is not correct, or you did not enter the full
     *         path to the folder.
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
     * Returns information about a specified merge commit.
     * </p>
     * 
     * @param getMergeCommitRequest
     * @return Result of the GetMergeCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
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
     * @sample AWSCodeCommit.GetMergeCommit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeCommit" target="_top">AWS API
     *      Documentation</a>
     */
    GetMergeCommitResult getMergeCommit(GetMergeCommitRequest getMergeCommitRequest);

    /**
     * <p>
     * Returns information about merge conflicts between the before and after commit IDs for a pull request in a
     * repository.
     * </p>
     * 
     * @param getMergeConflictsRequest
     * @return Result of the GetMergeConflicts operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws MergeOptionRequiredException
     *         A merge option or stategy is required, and none was provided.
     * @throws InvalidMergeOptionException
     *         The specified merge option is not valid for this operation. Not all merge strategies are supported for
     *         all operations.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
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
     * @throws InvalidMaxConflictFilesException
     *         The specified value for the number of conflict files to return is not valid.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidDestinationCommitSpecifierException
     *         The destination commit specifier is not valid. You must provide a valid branch name, tag, or full commit
     *         ID.
     * @throws InvalidSourceCommitSpecifierException
     *         The source commit specifier is not valid. You must provide a valid branch name, tag, or full commit ID.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
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
     * Returns information about the merge options available for merging two specified branches. For details about why a
     * merge option is not available, use GetMergeConflicts or DescribeMergeConflicts.
     * </p>
     * 
     * @param getMergeOptionsRequest
     * @return Result of the GetMergeOptions operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
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
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
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
     * @sample AWSCodeCommit.GetMergeOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetMergeOptions" target="_top">AWS API
     *      Documentation</a>
     */
    GetMergeOptionsResult getMergeOptions(GetMergeOptionsRequest getMergeOptionsRequest);

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
     * Gets information about the approval states for a specified pull request. Approval states only apply to pull
     * requests that have one or more approval rules applied to them.
     * </p>
     * 
     * @param getPullRequestApprovalStatesRequest
     * @return Result of the GetPullRequestApprovalStates operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidRevisionIdException
     *         The revision ID is not valid. Use GetPullRequest to determine the value.
     * @throws RevisionIdRequiredException
     *         A revision ID is required, but was not provided.
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
     * @sample AWSCodeCommit.GetPullRequestApprovalStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestApprovalStates"
     *      target="_top">AWS API Documentation</a>
     */
    GetPullRequestApprovalStatesResult getPullRequestApprovalStates(GetPullRequestApprovalStatesRequest getPullRequestApprovalStatesRequest);

    /**
     * <p>
     * Returns information about whether approval rules have been set aside (overridden) for a pull request, and if so,
     * the Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the
     * pull request.
     * </p>
     * 
     * @param getPullRequestOverrideStateRequest
     * @return Result of the GetPullRequestOverrideState operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidRevisionIdException
     *         The revision ID is not valid. Use GetPullRequest to determine the value.
     * @throws RevisionIdRequiredException
     *         A revision ID is required, but was not provided.
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
     * @sample AWSCodeCommit.GetPullRequestOverrideState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestOverrideState"
     *      target="_top">AWS API Documentation</a>
     */
    GetPullRequestOverrideStateResult getPullRequestOverrideState(GetPullRequestOverrideStateRequest getPullRequestOverrideStateRequest);

    /**
     * <p>
     * Returns information about a repository.
     * </p>
     * <note>
     * <p>
     * The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param getRepositoryRequest
     *        Represents the input of a get repository operation.
     * @return Result of the GetRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Lists all approval rule templates in the specified AWS Region in your AWS account. If an AWS Region is not
     * specified, the AWS Region where you are signed in is used.
     * </p>
     * 
     * @param listApprovalRuleTemplatesRequest
     * @return Result of the ListApprovalRuleTemplates operation returned by the service.
     * @throws InvalidMaxResultsException
     *         The specified number of maximum results is not valid.
     * @throws InvalidContinuationTokenException
     *         The specified continuation token is not valid.
     * @sample AWSCodeCommit.ListApprovalRuleTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListApprovalRuleTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListApprovalRuleTemplatesResult listApprovalRuleTemplates(ListApprovalRuleTemplatesRequest listApprovalRuleTemplatesRequest);

    /**
     * <p>
     * Lists all approval rule templates that are associated with a specified repository.
     * </p>
     * 
     * @param listAssociatedApprovalRuleTemplatesForRepositoryRequest
     * @return Result of the ListAssociatedApprovalRuleTemplatesForRepository operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * @sample AWSCodeCommit.ListAssociatedApprovalRuleTemplatesForRepository
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListAssociatedApprovalRuleTemplatesForRepository"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedApprovalRuleTemplatesForRepositoryResult listAssociatedApprovalRuleTemplatesForRepository(
            ListAssociatedApprovalRuleTemplatesForRepositoryRequest listAssociatedApprovalRuleTemplatesForRepositoryRequest);

    /**
     * <p>
     * Gets information about one or more branches in a repository.
     * </p>
     * 
     * @param listBranchesRequest
     *        Represents the input of a list branches operation.
     * @return Result of the ListBranches operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Lists all repositories associated with the specified approval rule template.
     * </p>
     * 
     * @param listRepositoriesForApprovalRuleTemplateRequest
     * @return Result of the ListRepositoriesForApprovalRuleTemplate operation returned by the service.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
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
     * @sample AWSCodeCommit.ListRepositoriesForApprovalRuleTemplate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositoriesForApprovalRuleTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    ListRepositoriesForApprovalRuleTemplateResult listRepositoriesForApprovalRuleTemplate(
            ListRepositoriesForApprovalRuleTemplateRequest listRepositoriesForApprovalRuleTemplateRequest);

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeCommit. For a list of valid
     * resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the<i> AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @sample AWSCodeCommit.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Merges two branches using the fast-forward merge strategy.
     * </p>
     * 
     * @param mergeBranchesByFastForwardRequest
     * @return Result of the MergeBranchesByFastForward operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
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
     * @sample AWSCodeCommit.MergeBranchesByFastForward
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByFastForward"
     *      target="_top">AWS API Documentation</a>
     */
    MergeBranchesByFastForwardResult mergeBranchesByFastForward(MergeBranchesByFastForwardRequest mergeBranchesByFastForwardRequest);

    /**
     * <p>
     * Merges two branches using the squash merge strategy.
     * </p>
     * 
     * @param mergeBranchesBySquashRequest
     * @return Result of the MergeBranchesBySquash operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified, but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
     * @throws FileModeRequiredException
     *         The commit cannot be created because no file mode has been specified. A file mode is required to update
     *         mode permissions for a file.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
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
     * @sample AWSCodeCommit.MergeBranchesBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    MergeBranchesBySquashResult mergeBranchesBySquash(MergeBranchesBySquashRequest mergeBranchesBySquashRequest);

    /**
     * <p>
     * Merges two specified branches using the three-way merge strategy.
     * </p>
     * 
     * @param mergeBranchesByThreeWayRequest
     * @return Result of the MergeBranchesByThreeWay operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws CommitRequiredException
     *         A commit was not specified.
     * @throws InvalidCommitException
     *         The specified commit is not valid.
     * @throws CommitDoesNotExistException
     *         The specified commit does not exist or no commit was specified, and the specified repository has no
     *         default branch.
     * @throws InvalidTargetBranchException
     *         The specified target branch is not valid.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified, but no replacement content has been provided.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
     * @throws FileModeRequiredException
     *         The commit cannot be created because no file mode has been specified. A file mode is required to update
     *         mode permissions for a file.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
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
     * @sample AWSCodeCommit.MergeBranchesByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    MergeBranchesByThreeWayResult mergeBranchesByThreeWay(MergeBranchesByThreeWayRequest mergeBranchesByThreeWayRequest);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the fast-forward merge strategy. If the merge is successful, it closes the pull
     * request.
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
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws PullRequestApprovalRulesNotSatisfiedException
     *         The pull request cannot be merged because one or more approval rules applied to the pull request have
     *         conditions that have not been met.
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
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the squash merge strategy. If the merge is successful, it closes the pull request.
     * </p>
     * 
     * @param mergePullRequestBySquashRequest
     * @return Result of the MergePullRequestBySquash operation returned by the service.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified, but no replacement content has been provided.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws PullRequestApprovalRulesNotSatisfiedException
     *         The pull request cannot be merged because one or more approval rules applied to the pull request have
     *         conditions that have not been met.
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
     * @sample AWSCodeCommit.MergePullRequestBySquash
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestBySquash"
     *      target="_top">AWS API Documentation</a>
     */
    MergePullRequestBySquashResult mergePullRequestBySquash(MergePullRequestBySquashRequest mergePullRequestBySquashRequest);

    /**
     * <p>
     * Attempts to merge the source commit of a pull request into the specified destination branch for that pull request
     * at the specified commit using the three-way merge strategy. If the merge is successful, it closes the pull
     * request.
     * </p>
     * 
     * @param mergePullRequestByThreeWayRequest
     * @return Result of the MergePullRequestByThreeWay operation returned by the service.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws InvalidCommitIdException
     *         The specified commit ID is not valid.
     * @throws ManualMergeRequiredException
     *         The pull request cannot be merged automatically into the destination branch. You must manually merge the
     *         branches and resolve any conflicts.
     * @throws TipOfSourceReferenceIsDifferentException
     *         The tip of the source branch in the destination repository does not match the tip of the source branch
     *         specified in your request. The pull request might have been updated. Make sure that you have the latest
     *         changes.
     * @throws TipsDivergenceExceededException
     *         The divergence between the tips of the provided commit specifiers is too great to determine whether there
     *         might be any merge conflicts. Locally compare the specifiers using <code>git diff</code> or a diff tool.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
     * @throws InvalidEmailException
     *         The specified email address either contains one or more characters that are not allowed, or it exceeds
     *         the maximum number of characters allowed for an email address.
     * @throws CommitMessageLengthExceededException
     *         The commit message is too long. Provide a shorter string.
     * @throws InvalidConflictDetailLevelException
     *         The specified conflict detail level is not valid.
     * @throws InvalidConflictResolutionStrategyException
     *         The specified conflict resolution strategy is not valid.
     * @throws InvalidConflictResolutionException
     *         The specified conflict resolution list is not valid.
     * @throws ReplacementTypeRequiredException
     *         A replacement type is required.
     * @throws InvalidReplacementTypeException
     *         Automerge was specified for resolving the conflict, but the specified replacement type is not valid.
     * @throws MultipleConflictResolutionEntriesException
     *         More than one conflict resolution entries exists for the conflict. A conflict can have only one conflict
     *         resolution entry.
     * @throws ReplacementContentRequiredException
     *         USE_NEW_CONTENT was specified, but no replacement content has been provided.
     * @throws MaximumConflictResolutionEntriesExceededException
     *         The number of allowed conflict resolution entries was exceeded.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws InvalidReplacementContentException
     *         Automerge was specified for resolving the conflict, but the replacement type is not valid or content is
     *         missing.
     * @throws FileContentSizeLimitExceededException
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws MaximumFileContentToLoadExceededException
     *         The number of files to load exceeds the allowed limit.
     * @throws MaximumItemsToCompareExceededException
     *         The number of items to compare between the source or destination branches and the merge base has exceeded
     *         the maximum allowed.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNotAssociatedWithPullRequestException
     *         The repository does not contain any pull requests with that pull request ID. Use GetPullRequest to verify
     *         the correct repository name for the pull request ID.
     * @throws ConcurrentReferenceUpdateException
     *         The merge cannot be completed because the target branch has been modified. Another user might have
     *         modified the target branch while the merge was in progress. Wait a few minutes, and then try again.
     * @throws PullRequestApprovalRulesNotSatisfiedException
     *         The pull request cannot be merged because one or more approval rules applied to the pull request have
     *         conditions that have not been met.
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
     * @sample AWSCodeCommit.MergePullRequestByThreeWay
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByThreeWay"
     *      target="_top">AWS API Documentation</a>
     */
    MergePullRequestByThreeWayResult mergePullRequestByThreeWay(MergePullRequestByThreeWayRequest mergePullRequestByThreeWayRequest);

    /**
     * <p>
     * Sets aside (overrides) all approval rule requirements for a specified pull request.
     * </p>
     * 
     * @param overridePullRequestApprovalRulesRequest
     * @return Result of the OverridePullRequestApprovalRules operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidRevisionIdException
     *         The revision ID is not valid. Use GetPullRequest to determine the value.
     * @throws RevisionIdRequiredException
     *         A revision ID is required, but was not provided.
     * @throws InvalidOverrideStatusException
     *         The override status is not valid. Valid statuses are OVERRIDE and REVOKE.
     * @throws OverrideStatusRequiredException
     *         An override status is required, but no value was provided. Valid values include OVERRIDE and REVOKE.
     * @throws OverrideAlreadySetException
     *         The pull request has already had its approval rules set to override.
     * @throws RevisionNotCurrentException
     *         The revision ID provided in the request does not match the current revision ID. Use GetPullRequest to
     *         retrieve the current revision ID.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
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
     * @sample AWSCodeCommit.OverridePullRequestApprovalRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/OverridePullRequestApprovalRules"
     *      target="_top">AWS API Documentation</a>
     */
    OverridePullRequestApprovalRulesResult overridePullRequestApprovalRules(OverridePullRequestApprovalRulesRequest overridePullRequestApprovalRulesRequest);

    /**
     * <p>
     * Posts a comment on the comparison between two commits.
     * </p>
     * 
     * @param postCommentForComparedCommitRequest
     * @return Result of the PostCommentForComparedCommit operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that, when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be reused.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the file name and extension.
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
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ClientRequestTokenRequiredException
     *         A client request token is required. A client request token is an unique, client-generated idempotency
     *         token that, when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be reused.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws InvalidFileLocationException
     *         The location of the file is not valid. Make sure that you include the file name and extension.
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
     *         token that, when provided in a request, ensures the request cannot be repeated with a changed parameter.
     *         If a request is received with the same parameters and a token is included, the request returns
     *         information about the initial request that used that token.
     * @throws InvalidClientRequestTokenException
     *         The client request token is not valid.
     * @throws IdempotencyParameterMismatchException
     *         The client request token is not valid. Either the token is not in a valid format, or the token has been
     *         used in a previous request and cannot be reused.
     * @throws CommentContentRequiredException
     *         The comment is empty. You must provide some content for a comment. The content cannot be null.
     * @throws CommentContentSizeLimitExceededException
     *         The comment is too large. Comments are limited to 1,000 characters.
     * @throws CommentDoesNotExistException
     *         No comment exists with the provided ID. Verify that you have used the correct ID, and then try again.
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     *         The file cannot be added because it is too large. The maximum file size is 6 MB, and the combined file
     *         content change size is 7 MB. Consider making these changes using a Git client.
     * @throws FolderContentSizeLimitExceededException
     *         The commit cannot be created because at least one of the overall changes in the commit results in a
     *         folder whose contents exceed the limit of 6 MB. Either reduce the number and size of your changes, or
     *         split the changes across multiple folders.
     * @throws PathRequiredException
     *         The folderPath for a location cannot be null.
     * @throws InvalidPathException
     *         The specified path is not valid.
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
     * @throws InvalidBranchNameException
     *         The specified reference name is not valid.
     * @throws BranchDoesNotExistException
     *         The specified branch does not exist.
     * @throws BranchNameIsTagNameException
     *         The specified branch name is not valid because it is a tag name. Enter the name of a branch in the
     *         repository. For a list of valid branch names, use <a>ListBranches</a>.
     * @throws InvalidFileModeException
     *         The specified file mode permission is not valid. For a list of valid file mode permissions, see
     *         <a>PutFile</a>.
     * @throws NameLengthExceededException
     *         The user name is not valid because it has exceeded the character limit for author names.
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
     * Replaces all triggers for a repository. Used to create or delete triggers.
     * </p>
     * 
     * @param putRepositoryTriggersRequest
     *        Represents the input of a put repository triggers operation.
     * @return Result of the PutRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required, but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The AWS Region for the trigger target does not match the AWS Region for the repository. Triggers must be
     *         created in the same Region as the target for the trigger.
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
     *         A name for the trigger is required, but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required, but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required, but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required, but was not specified.
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
     * Adds or updates tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a
     * href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws TagsMapRequiredException
     *         A map of tags is required.
     * @throws InvalidTagsMapException
     *         The map of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests the functionality of repository triggers by sending information to the trigger target. If real data is
     * available in the repository, the test sends data from the last commit. If no data is available, sample data is
     * generated.
     * </p>
     * 
     * @param testRepositoryTriggersRequest
     *        Represents the input of a test repository triggers operation.
     * @return Result of the TestRepositoryTriggers operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws RepositoryTriggersListRequiredException
     *         The list of triggers for the repository is required, but was not specified.
     * @throws MaximumRepositoryTriggersExceededException
     *         The number of triggers allowed for the repository was exceeded.
     * @throws InvalidRepositoryTriggerNameException
     *         The name of the trigger is not valid.
     * @throws InvalidRepositoryTriggerDestinationArnException
     *         The Amazon Resource Name (ARN) for the trigger is not valid for the specified destination. The most
     *         common reason for this error is that the ARN does not meet the requirements for the service type.
     * @throws InvalidRepositoryTriggerRegionException
     *         The AWS Region for the trigger target does not match the AWS Region for the repository. Triggers must be
     *         created in the same Region as the target for the trigger.
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
     *         A name for the trigger is required, but was not specified.
     * @throws RepositoryTriggerDestinationArnRequiredException
     *         A destination ARN for the target service for the trigger is required, but was not specified.
     * @throws RepositoryTriggerBranchNameListRequiredException
     *         At least one branch name is required, but was not specified in the trigger configuration.
     * @throws RepositoryTriggerEventsListRequiredException
     *         At least one event for the trigger is required, but was not specified.
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
     * Removes tags for a resource in AWS CodeCommit. For a list of valid resources in AWS CodeCommit, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     * >CodeCommit Resources and Operations</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws ResourceArnRequiredException
     *         A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is required. For a list of valid
     *         resources in AWS CodeCommit, see <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws InvalidResourceArnException
     *         The value for the resource ARN is not valid. For more information about resources in AWS CodeCommit, see
     *         <a href=
     *         "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
     *         >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
     * @throws TagKeysListRequiredException
     *         A list of tag keys is required. The list cannot be empty or null.
     * @throws InvalidTagKeysListException
     *         The list of tags is not valid.
     * @throws TooManyTagsException
     *         The maximum number of tags for an AWS CodeCommit resource has been exceeded.
     * @throws InvalidSystemTagUsageException
     *         The specified tag is not valid. Key names cannot be prefixed with aws:.
     * @throws TagPolicyException
     *         The tag policy is not valid.
     * @sample AWSCodeCommit.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the content of an approval rule template. You can change the number of required approvals, the membership
     * of the approval rule, and whether an approval pool is defined.
     * </p>
     * 
     * @param updateApprovalRuleTemplateContentRequest
     * @return Result of the UpdateApprovalRuleTemplateContent operation returned by the service.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws InvalidApprovalRuleTemplateContentException
     *         The content of the approval rule template is not valid.
     * @throws InvalidRuleContentSha256Exception
     *         The SHA-256 hash signature for the rule content is not valid.
     * @throws ApprovalRuleTemplateContentRequiredException
     *         The content for the approval rule template is empty. You must provide some content for an approval rule
     *         template. The content cannot be null.
     * @sample AWSCodeCommit.UpdateApprovalRuleTemplateContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateContent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApprovalRuleTemplateContentResult updateApprovalRuleTemplateContent(UpdateApprovalRuleTemplateContentRequest updateApprovalRuleTemplateContentRequest);

    /**
     * <p>
     * Updates the description for a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateDescriptionRequest
     * @return Result of the UpdateApprovalRuleTemplateDescription operation returned by the service.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws InvalidApprovalRuleTemplateDescriptionException
     *         The description for the approval rule template is not valid because it exceeds the maximum characters
     *         allowed for a description. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @sample AWSCodeCommit.UpdateApprovalRuleTemplateDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateDescription"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApprovalRuleTemplateDescriptionResult updateApprovalRuleTemplateDescription(
            UpdateApprovalRuleTemplateDescriptionRequest updateApprovalRuleTemplateDescriptionRequest);

    /**
     * <p>
     * Updates the name of a specified approval rule template.
     * </p>
     * 
     * @param updateApprovalRuleTemplateNameRequest
     * @return Result of the UpdateApprovalRuleTemplateName operation returned by the service.
     * @throws InvalidApprovalRuleTemplateNameException
     *         The name of the approval rule template is not valid. Template names must be between 1 and 100 valid
     *         characters in length. For more information about limits in AWS CodeCommit, see <a
     *         href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">AWS CodeCommit User Guide</a>.
     * @throws ApprovalRuleTemplateNameRequiredException
     *         An approval rule template name is required, but was not specified.
     * @throws ApprovalRuleTemplateDoesNotExistException
     *         The specified approval rule template does not exist. Verify that the name is correct and that you are
     *         signed in to the AWS Region where the template was created, and then try again.
     * @throws ApprovalRuleTemplateNameAlreadyExistsException
     *         You cannot create an approval rule template with that name because a template with that name already
     *         exists in this AWS Region for your AWS account. Approval rule template names must be unique.
     * @sample AWSCodeCommit.UpdateApprovalRuleTemplateName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateApprovalRuleTemplateName"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApprovalRuleTemplateNameResult updateApprovalRuleTemplateName(UpdateApprovalRuleTemplateNameRequest updateApprovalRuleTemplateNameRequest);

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
     *         No comment exists with the provided ID. Verify that you have used the correct ID, and then try again.
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
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
     *         required repository parameter is missing, or when a specified repository does not exist.
     *         </p>
     * @throws BranchNameRequiredException
     *         A branch name is required, but was not specified.
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
     * Updates the structure of an approval rule created specifically for a pull request. For example, you can change
     * the number of required approvers and the approval pool for approvers.
     * </p>
     * 
     * @param updatePullRequestApprovalRuleContentRequest
     * @return Result of the UpdatePullRequestApprovalRuleContent operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws ApprovalRuleNameRequiredException
     *         An approval rule name is required, but was not specified.
     * @throws InvalidApprovalRuleNameException
     *         The name for the approval rule is not valid.
     * @throws ApprovalRuleDoesNotExistException
     *         The specified approval rule does not exist.
     * @throws InvalidRuleContentSha256Exception
     *         The SHA-256 hash signature for the rule content is not valid.
     * @throws ApprovalRuleContentRequiredException
     *         The content for the approval rule is empty. You must provide some content for an approval rule. The
     *         content cannot be null.
     * @throws InvalidApprovalRuleContentException
     *         The content for the approval rule is not valid.
     * @throws CannotModifyApprovalRuleFromTemplateException
     *         The approval rule cannot be modified for the pull request because it was created by an approval rule
     *         template and applied to the pull request automatically.
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
     * @sample AWSCodeCommit.UpdatePullRequestApprovalRuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalRuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePullRequestApprovalRuleContentResult updatePullRequestApprovalRuleContent(
            UpdatePullRequestApprovalRuleContentRequest updatePullRequestApprovalRuleContentRequest);

    /**
     * <p>
     * Updates the state of a user's approval on a pull request. The user is derived from the signed-in account when the
     * request is made.
     * </p>
     * 
     * @param updatePullRequestApprovalStateRequest
     * @return Result of the UpdatePullRequestApprovalState operation returned by the service.
     * @throws PullRequestDoesNotExistException
     *         The pull request ID could not be found. Make sure that you have specified the correct repository name and
     *         pull request ID, and then try again.
     * @throws InvalidPullRequestIdException
     *         The pull request ID is not valid. Make sure that you have provided the full ID and that the pull request
     *         is in the specified repository, and then try again.
     * @throws PullRequestIdRequiredException
     *         A pull request ID is required, but none was provided.
     * @throws InvalidRevisionIdException
     *         The revision ID is not valid. Use GetPullRequest to determine the value.
     * @throws RevisionIdRequiredException
     *         A revision ID is required, but was not provided.
     * @throws InvalidApprovalStateException
     *         The state for the approval is not valid. Valid values include APPROVE and REVOKE.
     * @throws ApprovalStateRequiredException
     *         An approval state is required, but was not specified.
     * @throws PullRequestCannotBeApprovedByAuthorException
     *         The approval cannot be applied because the user approving the pull request matches the user who created
     *         the pull request. You cannot approve a pull request that you created.
     * @throws RevisionNotCurrentException
     *         The revision ID provided in the request does not match the current revision ID. Use GetPullRequest to
     *         retrieve the current revision ID.
     * @throws PullRequestAlreadyClosedException
     *         The pull request status cannot be updated because it is already closed.
     * @throws MaximumNumberOfApprovalsExceededException
     *         The number of approvals required for the approval rule exceeds the maximum number allowed.
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
     * @sample AWSCodeCommit.UpdatePullRequestApprovalState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestApprovalState"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePullRequestApprovalStateResult updatePullRequestApprovalState(UpdatePullRequestApprovalStateRequest updatePullRequestApprovalStateRequest);

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
     *         The pull request description is not valid. Descriptions cannot be more than 1,000 characters.
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
     * that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious
     * code. Make sure that you HTML-encode the description field in any application that uses this API to display the
     * repository description on a webpage.
     * </p>
     * </note>
     * 
     * @param updateRepositoryDescriptionRequest
     *        Represents the input of an update repository description operation.
     * @return Result of the UpdateRepositoryDescription operation returned by the service.
     * @throws RepositoryNameRequiredException
     *         A repository name is required, but was not specified.
     * @throws RepositoryDoesNotExistException
     *         The specified repository does not exist.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
     * Renames a repository. The repository name must be unique across the calling AWS account. Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. The suffix
     * .git is prohibited. For more information about the limits on repository names, see <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html">Limits</a> in the AWS CodeCommit User
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
     *         A repository name is required, but was not specified.
     * @throws InvalidRepositoryNameException
     *         A specified repository name is not valid.</p> <note>
     *         <p>
     *         This exception occurs only when a specified repository name is not valid. Other exceptions occur when a
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
