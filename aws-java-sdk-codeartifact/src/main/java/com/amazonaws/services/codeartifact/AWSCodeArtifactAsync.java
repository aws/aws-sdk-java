/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact;

import javax.annotation.Generated;

import com.amazonaws.services.codeartifact.model.*;

/**
 * Interface for accessing CodeArtifact asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codeartifact.AbstractAWSCodeArtifactAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS CodeArtifact is a fully managed artifact repository compatible with language-native package managers and build
 * tools such as npm, Apache Maven, and pip. You can use CodeArtifact to share packages with development teams and pull
 * packages. Packages can be pulled from both public and CodeArtifact repositories. You can also create an upstream
 * relationship between a CodeArtifact repository and another repository, which effectively merges their contents from
 * the point of view of a package manager client.
 * </p>
 * <p>
 * <b>AWS CodeArtifact Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following CodeArtifact components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Repository</b>: A CodeArtifact repository contains a set of <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/welcome.html#welcome-concepts-package-version">package
 * versions</a>, each of which maps to a set of assets, or files. Repositories are polyglot, so a single repository can
 * contain packages of any supported type. Each repository exposes endpoints for fetching and publishing packages using
 * tools like the <b> <code>npm</code> </b> CLI, the Maven CLI (<b> <code>mvn</code> </b>), and <b> <code>pip</code>
 * </b>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Domain</b>: Repositories are aggregated into a higher-level entity known as a <i>domain</i>. All package assets
 * and metadata are stored in the domain, but are consumed through repositories. A given package asset, such as a Maven
 * JAR file, is stored once per domain, no matter how many repositories it's present in. All of the assets and metadata
 * in a domain are encrypted with the same customer master key (CMK) stored in AWS Key Management Service (AWS KMS).
 * </p>
 * <p>
 * Each repository is a member of a single domain and can't be moved to a different domain.
 * </p>
 * <p>
 * The domain allows organizational policy to be applied across multiple repositories, such as which accounts can access
 * repositories in the domain, and which public repositories can be used as sources of packages.
 * </p>
 * <p>
 * Although an organization can have multiple domains, we recommend a single production domain that contains all
 * published artifacts so that teams can find and share packages across their organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Package</b>: A <i>package</i> is a bundle of software and the metadata required to resolve dependencies and
 * install the software. CodeArtifact supports <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-npm.html">npm</a>, <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-python.html">PyPI</a>, and <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-maven">Maven</a> package formats.
 * </p>
 * <p>
 * In CodeArtifact, a package consists of:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>name</i> (for example, <code>webpack</code> is the name of a popular npm package)
 * </p>
 * </li>
 * <li>
 * <p>
 * An optional namespace (for example, <code>@types</code> in <code>@types/node</code>)
 * </p>
 * </li>
 * <li>
 * <p>
 * A set of versions (for example, <code>1.0.0</code>, <code>1.0.1</code>, <code>1.0.2</code>, etc.)
 * </p>
 * </li>
 * <li>
 * <p>
 * Package-level metadata (for example, npm tags)
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Package version</b>: A version of a package, such as <code>@types/node 12.6.9</code>. The version number format
 * and semantics vary for different package formats. For example, npm package versions must conform to the <a
 * href="https://semver.org/">Semantic Versioning specification</a>. In CodeArtifact, a package version consists of the
 * version identifier, metadata at the package version level, and a set of assets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Upstream repository</b>: One repository is <i>upstream</i> of another when the package versions in it can be
 * accessed from the repository endpoint of the downstream repository, effectively merging the contents of the two
 * repositories from the point of view of a client. CodeArtifact allows creating an upstream relationship between two
 * repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Asset</b>: An individual file stored in CodeArtifact associated with a package version, such as an npm
 * <code>.tgz</code> file or Maven POM and JAR files.
 * </p>
 * </li>
 * </ul>
 * <p>
 * CodeArtifact supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AssociateExternalConnection</code>: Adds an existing external connection to a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CopyPackageVersions</code>: Copies package versions from one repository to another repository in the same
 * domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateDomain</code>: Creates a domain
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateRepository</code>: Creates a CodeArtifact repository in a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDomain</code>: Deletes a domain. You cannot delete a domain that contains repositories.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDomainPermissionsPolicy</code>: Deletes the resource policy that is set on a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeletePackageVersions</code>: Deletes versions of a package. After a package has been deleted, it can be
 * republished, but its assets and metadata cannot be restored because they have been permanently removed from storage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteRepository</code>: Deletes a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteRepositoryPermissionsPolicy</code>: Deletes the resource policy that is set on a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDomain</code>: Returns a <code>DomainDescription</code> object that contains information about the
 * requested domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribePackageVersion</code>: Returns a <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
 * >PackageVersionDescription</a> object that contains details about a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeRepository</code>: Returns a <code>RepositoryDescription</code> object that contains detailed
 * information about the requested repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisposePackageVersions</code>: Disposes versions of a package. A package version with the status
 * <code>Disposed</code> cannot be restored because they have been permanently removed from storage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisassociateExternalConnection</code>: Removes an existing external connection from a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAuthorizationToken</code>: Generates a temporary authorization token for accessing repositories in the
 * domain. The token expires the authorization period has passed. The default authorization period is 12 hours and can
 * be customized to any length with a maximum of 12 hours.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetDomainPermissionsPolicy</code>: Returns the policy of a resource that is attached to the specified domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetPackageVersionAsset</code>: Returns the contents of an asset that is in a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetPackageVersionReadme</code>: Gets the readme file or descriptive text for a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetRepositoryEndpoint</code>: Returns the endpoint of a repository for a specific package format. A repository
 * has one endpoint for each package format:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>npm</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>pypi</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>maven</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <code>GetRepositoryPermissionsPolicy</code>: Returns the resource policy that is set on a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListDomains</code>: Returns a list of <code>DomainSummary</code> objects. Each returned
 * <code>DomainSummary</code> object contains information about a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackages</code>: Lists the packages in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersionAssets</code>: Lists the assets for a given package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersionDependencies</code>: Returns a list of the direct dependencies for a package version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListPackageVersions</code>: Returns a list of package versions for a specified package in a repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListRepositories</code>: Returns a list of repositories owned by the AWS account that called this method.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListRepositoriesInDomain</code>: Returns a list of the repositories in a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutDomainPermissionsPolicy</code>: Attaches a resource policy to a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutRepositoryPermissionsPolicy</code>: Sets the resource policy on a repository that specifies permissions to
 * access it.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdatePackageVersionsStatus</code>: Updates the status of one or more versions of a package.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateRepository</code>: Updates the properties of a repository.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeArtifactAsync extends AWSCodeArtifact {

    /**
     * <p>
     * Adds an existing external connection to a repository. One external connection is allowed per repository.
     * </p>
     * <note>
     * <p>
     * A repository can have one or more upstream repositories, or an external connection.
     * </p>
     * </note>
     * 
     * @param associateExternalConnectionRequest
     * @return A Java Future containing the result of the AssociateExternalConnection operation returned by the service.
     * @sample AWSCodeArtifactAsync.AssociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/AssociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(
            AssociateExternalConnectionRequest associateExternalConnectionRequest);

    /**
     * <p>
     * Adds an existing external connection to a repository. One external connection is allowed per repository.
     * </p>
     * <note>
     * <p>
     * A repository can have one or more upstream repositories, or an external connection.
     * </p>
     * </note>
     * 
     * @param associateExternalConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateExternalConnection operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.AssociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/AssociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(
            AssociateExternalConnectionRequest associateExternalConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateExternalConnectionRequest, AssociateExternalConnectionResult> asyncHandler);

    /**
     * <p>
     * Copies package versions from one repository to another repository in the same domain.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param copyPackageVersionsRequest
     * @return A Java Future containing the result of the CopyPackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsync.CopyPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CopyPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(CopyPackageVersionsRequest copyPackageVersionsRequest);

    /**
     * <p>
     * Copies package versions from one repository to another repository in the same domain.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param copyPackageVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyPackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.CopyPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CopyPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(CopyPackageVersionsRequest copyPackageVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<CopyPackageVersionsRequest, CopyPackageVersionsResult> asyncHandler);

    /**
     * <p>
     * Creates a domain. CodeArtifact <i>domains</i> make it easier to manage multiple repositories across an
     * organization. You can use a domain to apply permissions across many repositories owned by different AWS accounts.
     * An asset is stored only once in a domain, even if it's in multiple repositories.
     * </p>
     * <p>
     * Although you can have multiple domains, we recommend a single production domain that contains all published
     * artifacts so that your development teams can find and share packages. You can use a second pre-production domain
     * to test changes to the production domain configuration.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AWSCodeArtifactAsync.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain. CodeArtifact <i>domains</i> make it easier to manage multiple repositories across an
     * organization. You can use a domain to apply permissions across many repositories owned by different AWS accounts.
     * An asset is stored only once in a domain, even if it's in multiple repositories.
     * </p>
     * <p>
     * Although you can have multiple domains, we recommend a single production domain that contains all published
     * artifacts so that your development teams can find and share packages. You can use a second pre-production domain
     * to test changes to the production domain configuration.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates a repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeArtifactAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Creates a repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a domain. You cannot delete a domain that contains repositories. If you want to delete a domain with
     * repositories, first delete its repositories.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AWSCodeArtifactAsync.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a domain. You cannot delete a domain that contains repositories. If you want to delete a domain with
     * repositories, first delete its repositories.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource policy set on a domain.
     * </p>
     * 
     * @param deleteDomainPermissionsPolicyRequest
     * @return A Java Future containing the result of the DeleteDomainPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.DeleteDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(
            DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Deletes the resource policy set on a domain.
     * </p>
     * 
     * @param deleteDomainPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.DeleteDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(
            DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainPermissionsPolicyRequest, DeleteDomainPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If
     * you want to remove a package version from your repository and be able to restore it later, set its status to
     * <code>Archived</code>. Archived packages cannot be downloaded from a repository and don't show up with list
     * package APIs (for example, <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
     * >ListackageVersions</a>), but you can restore them using <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html"
     * >UpdatePackageVersionsStatus</a>.
     * </p>
     * 
     * @param deletePackageVersionsRequest
     * @return A Java Future containing the result of the DeletePackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsync.DeletePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(DeletePackageVersionsRequest deletePackageVersionsRequest);

    /**
     * <p>
     * Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If
     * you want to remove a package version from your repository and be able to restore it later, set its status to
     * <code>Archived</code>. Archived packages cannot be downloaded from a repository and don't show up with list
     * package APIs (for example, <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
     * >ListackageVersions</a>), but you can restore them using <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html"
     * >UpdatePackageVersionsStatus</a>.
     * </p>
     * 
     * @param deletePackageVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DeletePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(DeletePackageVersionsRequest deletePackageVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackageVersionsRequest, DeletePackageVersionsResult> asyncHandler);

    /**
     * <p>
     * Deletes a repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeArtifactAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes a repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource policy that is set on a repository. After a resource policy is deleted, the permissions
     * allowed and denied by the deleted policy are removed. The effect of deleting a resource policy might not be
     * immediate.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteRepositoryPermissionsPolicy</code> with caution. After a policy is deleted, AWS users, roles, and
     * accounts lose permissions to perform the repository actions granted by the deleted policy.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryPermissionsPolicyRequest
     * @return A Java Future containing the result of the DeleteRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.DeleteRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Deletes the resource policy that is set on a repository. After a resource policy is deleted, the permissions
     * allowed and denied by the deleted policy are removed. The effect of deleting a resource policy might not be
     * immediate.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteRepositoryPermissionsPolicy</code> with caution. After a policy is deleted, AWS users, roles, and
     * accounts lose permissions to perform the repository actions granted by the deleted policy.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.DeleteRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPermissionsPolicyRequest, DeleteRepositoryPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainDescription.html">
     * DomainDescription</a> object that contains information about the requested domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AWSCodeArtifactAsync.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainDescription.html">
     * DomainDescription</a> object that contains information about the requested domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeDomain" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return A Java Future containing the result of the DescribePackageVersion operation returned by the service.
     * @sample AWSCodeArtifactAsync.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest describePackageVersionRequest);

    /**
     * <p>
     * Returns a <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackageVersion operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest describePackageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackageVersionRequest, DescribePackageVersionResult> asyncHandler);

    /**
     * <p>
     * Returns a <code>RepositoryDescription</code> object that contains detailed information about the requested
     * repository.
     * </p>
     * 
     * @param describeRepositoryRequest
     * @return A Java Future containing the result of the DescribeRepository operation returned by the service.
     * @sample AWSCodeArtifactAsync.DescribeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(DescribeRepositoryRequest describeRepositoryRequest);

    /**
     * <p>
     * Returns a <code>RepositoryDescription</code> object that contains detailed information about the requested
     * repository.
     * </p>
     * 
     * @param describeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRepository operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DescribeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(DescribeRepositoryRequest describeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoryRequest, DescribeRepositoryResult> asyncHandler);

    /**
     * <p>
     * Removes an existing external connection from a repository.
     * </p>
     * 
     * @param disassociateExternalConnectionRequest
     * @return A Java Future containing the result of the DisassociateExternalConnection operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.DisassociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisassociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(
            DisassociateExternalConnectionRequest disassociateExternalConnectionRequest);

    /**
     * <p>
     * Removes an existing external connection from a repository.
     * </p>
     * 
     * @param disassociateExternalConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateExternalConnection operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.DisassociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisassociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(
            DisassociateExternalConnectionRequest disassociateExternalConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateExternalConnectionRequest, DisassociateExternalConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the assets in package versions and sets the package versions' status to <code>Disposed</code>. A disposed
     * package version cannot be restored in your repository because its assets are deleted.
     * </p>
     * <p>
     * To view all disposed package versions in a repository, use <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
     * >ListPackageVersions</a> and set the <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html#API_ListPackageVersions_RequestSyntax"
     * >status</a> parameter to <code>Disposed</code>.
     * </p>
     * <p>
     * To view information about a disposed package version, use <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DescribePackageVersion.html"
     * >DescribePackageVersion</a>.
     * </p>
     * 
     * @param disposePackageVersionsRequest
     * @return A Java Future containing the result of the DisposePackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsync.DisposePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisposePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(DisposePackageVersionsRequest disposePackageVersionsRequest);

    /**
     * <p>
     * Deletes the assets in package versions and sets the package versions' status to <code>Disposed</code>. A disposed
     * package version cannot be restored in your repository because its assets are deleted.
     * </p>
     * <p>
     * To view all disposed package versions in a repository, use <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
     * >ListPackageVersions</a> and set the <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html#API_ListPackageVersions_RequestSyntax"
     * >status</a> parameter to <code>Disposed</code>.
     * </p>
     * <p>
     * To view information about a disposed package version, use <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DescribePackageVersion.html"
     * >DescribePackageVersion</a>.
     * </p>
     * 
     * @param disposePackageVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisposePackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.DisposePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisposePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(DisposePackageVersionsRequest disposePackageVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DisposePackageVersionsRequest, DisposePackageVersionsResult> asyncHandler);

    /**
     * <p>
     * Generates a temporary authorization token for accessing repositories in the domain. This API requires the
     * <code>codeartifact:GetAuthorizationToken</code> and <code>sts:GetServiceBearerToken</code> permissions. For more
     * information about authorization tokens, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/tokens-authentication.html">AWS CodeArtifact
     * authentication and tokens</a>.
     * </p>
     * <note>
     * <p>
     * CodeArtifact authorization tokens are valid for a period of 12 hours when created with the <code>login</code>
     * command. You can call <code>login</code> periodically to refresh the token. When you create an authorization
     * token with the <code>GetAuthorizationToken</code> API, you can set a custom authorization period, up to a maximum
     * of 12 hours, with the <code>durationSeconds</code> parameter.
     * </p>
     * <p>
     * The authorization period begins after <code>login</code> or <code>GetAuthorizationToken</code> is called. If
     * <code>login</code> or <code>GetAuthorizationToken</code> is called while assuming a role, the token lifetime is
     * independent of the maximum session duration of the role. For example, if you call <code>sts assume-role</code>
     * and specify a session duration of 15 minutes, then generate a CodeArtifact authorization token, the token will be
     * valid for the full authorization period even though this is longer than the 15-minute session duration.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> for more
     * information on controlling session duration.
     * </p>
     * </note>
     * 
     * @param getAuthorizationTokenRequest
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AWSCodeArtifactAsync.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

    /**
     * <p>
     * Generates a temporary authorization token for accessing repositories in the domain. This API requires the
     * <code>codeartifact:GetAuthorizationToken</code> and <code>sts:GetServiceBearerToken</code> permissions. For more
     * information about authorization tokens, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/tokens-authentication.html">AWS CodeArtifact
     * authentication and tokens</a>.
     * </p>
     * <note>
     * <p>
     * CodeArtifact authorization tokens are valid for a period of 12 hours when created with the <code>login</code>
     * command. You can call <code>login</code> periodically to refresh the token. When you create an authorization
     * token with the <code>GetAuthorizationToken</code> API, you can set a custom authorization period, up to a maximum
     * of 12 hours, with the <code>durationSeconds</code> parameter.
     * </p>
     * <p>
     * The authorization period begins after <code>login</code> or <code>GetAuthorizationToken</code> is called. If
     * <code>login</code> or <code>GetAuthorizationToken</code> is called while assuming a role, the token lifetime is
     * independent of the maximum session duration of the role. For example, if you call <code>sts assume-role</code>
     * and specify a session duration of 15 minutes, then generate a CodeArtifact authorization token, the token will be
     * valid for the full authorization period even though this is longer than the 15-minute session duration.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> for more
     * information on controlling session duration.
     * </p>
     * </note>
     * 
     * @param getAuthorizationTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizationToken operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest getAuthorizationTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler);

    /**
     * <p>
     * Returns the resource policy attached to the specified domain.
     * </p>
     * <note>
     * <p>
     * The policy is a resource-based policy, not an identity-based policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies </a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getDomainPermissionsPolicyRequest
     * @return A Java Future containing the result of the GetDomainPermissionsPolicy operation returned by the service.
     * @sample AWSCodeArtifactAsync.GetDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(
            GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Returns the resource policy attached to the specified domain.
     * </p>
     * <note>
     * <p>
     * The policy is a resource-based policy, not an identity-based policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies </a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getDomainPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainPermissionsPolicy operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.GetDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(
            GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainPermissionsPolicyRequest, GetDomainPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns an asset (or file) that is in a package. For example, for a Maven package version, use
     * <code>GetPackageVersionAsset</code> to download a <code>JAR</code> file, a <code>POM</code> file, or any other
     * assets in the package version.
     * </p>
     * 
     * @param getPackageVersionAssetRequest
     * @return A Java Future containing the result of the GetPackageVersionAsset operation returned by the service.
     * @sample AWSCodeArtifactAsync.GetPackageVersionAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionAsset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(GetPackageVersionAssetRequest getPackageVersionAssetRequest);

    /**
     * <p>
     * Returns an asset (or file) that is in a package. For example, for a Maven package version, use
     * <code>GetPackageVersionAsset</code> to download a <code>JAR</code> file, a <code>POM</code> file, or any other
     * assets in the package version.
     * </p>
     * 
     * @param getPackageVersionAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPackageVersionAsset operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.GetPackageVersionAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionAsset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(GetPackageVersionAssetRequest getPackageVersionAssetRequest,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionAssetRequest, GetPackageVersionAssetResult> asyncHandler);

    /**
     * <p>
     * Gets the readme file or descriptive text for a package version. For packages that do not contain a readme file,
     * CodeArtifact extracts a description from a metadata file. For example, from the <code>&lt;description&gt;</code>
     * element in the <code>pom.xml</code> file of a Maven package.
     * </p>
     * <p>
     * The returned text might contain formatting. For example, it might contain formatting for Markdown or
     * reStructuredText.
     * </p>
     * 
     * @param getPackageVersionReadmeRequest
     * @return A Java Future containing the result of the GetPackageVersionReadme operation returned by the service.
     * @sample AWSCodeArtifactAsync.GetPackageVersionReadme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionReadme"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(GetPackageVersionReadmeRequest getPackageVersionReadmeRequest);

    /**
     * <p>
     * Gets the readme file or descriptive text for a package version. For packages that do not contain a readme file,
     * CodeArtifact extracts a description from a metadata file. For example, from the <code>&lt;description&gt;</code>
     * element in the <code>pom.xml</code> file of a Maven package.
     * </p>
     * <p>
     * The returned text might contain formatting. For example, it might contain formatting for Markdown or
     * reStructuredText.
     * </p>
     * 
     * @param getPackageVersionReadmeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPackageVersionReadme operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.GetPackageVersionReadme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionReadme"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(GetPackageVersionReadmeRequest getPackageVersionReadmeRequest,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionReadmeRequest, GetPackageVersionReadmeResult> asyncHandler);

    /**
     * <p>
     * Returns the endpoint of a repository for a specific package format. A repository has one endpoint for each
     * package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRepositoryEndpointRequest
     * @return A Java Future containing the result of the GetRepositoryEndpoint operation returned by the service.
     * @sample AWSCodeArtifactAsync.GetRepositoryEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(GetRepositoryEndpointRequest getRepositoryEndpointRequest);

    /**
     * <p>
     * Returns the endpoint of a repository for a specific package format. A repository has one endpoint for each
     * package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRepositoryEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryEndpoint operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.GetRepositoryEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(GetRepositoryEndpointRequest getRepositoryEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryEndpointRequest, GetRepositoryEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns the resource policy that is set on a repository.
     * </p>
     * 
     * @param getRepositoryPermissionsPolicyRequest
     * @return A Java Future containing the result of the GetRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.GetRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(
            GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Returns the resource policy that is set on a repository.
     * </p>
     * 
     * @param getRepositoryPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.GetRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(
            GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPermissionsPolicyRequest, GetRepositoryPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >DomainSummary</a> objects for all domains owned by the AWS account that makes this call. Each returned
     * <code>DomainSummary</code> object contains information about a domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >DomainSummary</a> objects for all domains owned by the AWS account that makes this call. Each returned
     * <code>DomainSummary</code> object contains information about a domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects for assets in a package version.
     * </p>
     * 
     * @param listPackageVersionAssetsRequest
     * @return A Java Future containing the result of the ListPackageVersionAssets operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListPackageVersionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(ListPackageVersionAssetsRequest listPackageVersionAssetsRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects for assets in a package version.
     * </p>
     * 
     * @param listPackageVersionAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackageVersionAssets operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListPackageVersionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(ListPackageVersionAssetsRequest listPackageVersionAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionAssetsRequest, ListPackageVersionAssetsResult> asyncHandler);

    /**
     * <p>
     * Returns the direct dependencies for a package version. The dependencies are returned as <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html"
     * >PackageDependency</a> objects. CodeArtifact extracts the dependencies for a package version from the metadata
     * file for the package format (for example, the <code>package.json</code> file for npm packages and the
     * <code>pom.xml</code> file for Maven). Any package version dependencies that are not listed in the configuration
     * file are not returned.
     * </p>
     * 
     * @param listPackageVersionDependenciesRequest
     * @return A Java Future containing the result of the ListPackageVersionDependencies operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.ListPackageVersionDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(
            ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest);

    /**
     * <p>
     * Returns the direct dependencies for a package version. The dependencies are returned as <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDependency.html"
     * >PackageDependency</a> objects. CodeArtifact extracts the dependencies for a package version from the metadata
     * file for the package format (for example, the <code>package.json</code> file for npm packages and the
     * <code>pom.xml</code> file for Maven). Any package version dependencies that are not listed in the configuration
     * file are not returned.
     * </p>
     * 
     * @param listPackageVersionDependenciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackageVersionDependencies operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.ListPackageVersionDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(
            ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionDependenciesRequest, ListPackageVersionDependenciesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects for package versions in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackageVersionsRequest
     * @return A Java Future containing the result of the ListPackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(ListPackageVersionsRequest listPackageVersionsRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects for package versions in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackageVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackageVersions operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(ListPackageVersionsRequest listPackageVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackageVersionsRequest, ListPackageVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects for packages in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackagesRequest
     * @return A Java Future containing the result of the ListPackages operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest listPackagesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects for packages in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackages operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest listPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagesRequest, ListPackagesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified AWS account and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified AWS account and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified domain and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesInDomainRequest
     * @return A Java Future containing the result of the ListRepositoriesInDomain operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListRepositoriesInDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositoriesInDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(ListRepositoriesInDomainRequest listRepositoriesInDomainRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified domain and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesInDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositoriesInDomain operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListRepositoriesInDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositoriesInDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(ListRepositoriesInDomainRequest listRepositoriesInDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesInDomainRequest, ListRepositoriesInDomainResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeArtifact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeArtifactAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeArtifact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets a resource policy on a domain that specifies permissions to access it.
     * </p>
     * <p>
     * When you call <code>PutDomainPermissionsPolicy</code>, the resource policy on the domain is ignored when
     * evaluting permissions. This ensures that the owner of a domain cannot lock themselves out of the domain, which
     * would prevent them from being able to update the resource policy.
     * </p>
     * 
     * @param putDomainPermissionsPolicyRequest
     * @return A Java Future containing the result of the PutDomainPermissionsPolicy operation returned by the service.
     * @sample AWSCodeArtifactAsync.PutDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(
            PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Sets a resource policy on a domain that specifies permissions to access it.
     * </p>
     * <p>
     * When you call <code>PutDomainPermissionsPolicy</code>, the resource policy on the domain is ignored when
     * evaluting permissions. This ensures that the owner of a domain cannot lock themselves out of the domain, which
     * would prevent them from being able to update the resource policy.
     * </p>
     * 
     * @param putDomainPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDomainPermissionsPolicy operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.PutDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(
            PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutDomainPermissionsPolicyRequest, PutDomainPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Sets the resource policy on a repository that specifies permissions to access it.
     * </p>
     * <p>
     * When you call <code>PutRepositoryPermissionsPolicy</code>, the resource policy on the repository is ignored when
     * evaluting permissions. This ensures that the owner of a repository cannot lock themselves out of the repository,
     * which would prevent them from being able to update the resource policy.
     * </p>
     * 
     * @param putRepositoryPermissionsPolicyRequest
     * @return A Java Future containing the result of the PutRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsync.PutRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(
            PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Sets the resource policy on a repository that specifies permissions to access it.
     * </p>
     * <p>
     * When you call <code>PutRepositoryPermissionsPolicy</code>, the resource policy on the repository is ignored when
     * evaluting permissions. This ensures that the owner of a repository cannot lock themselves out of the repository,
     * which would prevent them from being able to update the resource policy.
     * </p>
     * 
     * @param putRepositoryPermissionsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRepositoryPermissionsPolicy operation returned by the
     *         service.
     * @sample AWSCodeArtifactAsyncHandler.PutRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(
            PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRepositoryPermissionsPolicyRequest, PutRepositoryPermissionsPolicyResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeArtifact.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeArtifactAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeArtifact.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource in AWS CodeArtifact.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeArtifactAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource in AWS CodeArtifact.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the status of one or more versions of a package.
     * </p>
     * 
     * @param updatePackageVersionsStatusRequest
     * @return A Java Future containing the result of the UpdatePackageVersionsStatus operation returned by the service.
     * @sample AWSCodeArtifactAsync.UpdatePackageVersionsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageVersionsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(
            UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest);

    /**
     * <p>
     * Updates the status of one or more versions of a package.
     * </p>
     * 
     * @param updatePackageVersionsStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePackageVersionsStatus operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.UpdatePackageVersionsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageVersionsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(
            UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePackageVersionsStatusRequest, UpdatePackageVersionsStatusResult> asyncHandler);

    /**
     * <p>
     * Update the properties of a repository.
     * </p>
     * 
     * @param updateRepositoryRequest
     * @return A Java Future containing the result of the UpdateRepository operation returned by the service.
     * @sample AWSCodeArtifactAsync.UpdateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(UpdateRepositoryRequest updateRepositoryRequest);

    /**
     * <p>
     * Update the properties of a repository.
     * </p>
     * 
     * @param updateRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRepository operation returned by the service.
     * @sample AWSCodeArtifactAsyncHandler.UpdateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(UpdateRepositoryRequest updateRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResult> asyncHandler);

}
