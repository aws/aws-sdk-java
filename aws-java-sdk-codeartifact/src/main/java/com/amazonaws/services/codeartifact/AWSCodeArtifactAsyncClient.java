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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CodeArtifact asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeArtifactAsyncClient extends AWSCodeArtifactClient implements AWSCodeArtifactAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCodeArtifactAsyncClientBuilder asyncBuilder() {
        return AWSCodeArtifactAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeArtifact using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeArtifactAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeArtifact using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCodeArtifactAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(AssociateExternalConnectionRequest request) {

        return associateExternalConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateExternalConnectionResult> associateExternalConnectionAsync(final AssociateExternalConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateExternalConnectionRequest, AssociateExternalConnectionResult> asyncHandler) {
        final AssociateExternalConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateExternalConnectionResult>() {
            @Override
            public AssociateExternalConnectionResult call() throws Exception {
                AssociateExternalConnectionResult result = null;

                try {
                    result = executeAssociateExternalConnection(finalRequest);
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
    public java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(CopyPackageVersionsRequest request) {

        return copyPackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyPackageVersionsResult> copyPackageVersionsAsync(final CopyPackageVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyPackageVersionsRequest, CopyPackageVersionsResult> asyncHandler) {
        final CopyPackageVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyPackageVersionsResult>() {
            @Override
            public CopyPackageVersionsResult call() throws Exception {
                CopyPackageVersionsResult result = null;

                try {
                    result = executeCopyPackageVersions(finalRequest);
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
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest request) {

        return createDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler) {
        final CreateDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainResult>() {
            @Override
            public CreateDomainResult call() throws Exception {
                CreateDomainResult result = null;

                try {
                    result = executeCreateDomain(finalRequest);
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
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(final CreateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {
        final CreateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
            @Override
            public CreateRepositoryResult call() throws Exception {
                CreateRepositoryResult result = null;

                try {
                    result = executeCreateRepository(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest request) {

        return deleteDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler) {
        final DeleteDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainResult>() {
            @Override
            public DeleteDomainResult call() throws Exception {
                DeleteDomainResult result = null;

                try {
                    result = executeDeleteDomain(finalRequest);
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
    public java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(DeleteDomainPermissionsPolicyRequest request) {

        return deleteDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainPermissionsPolicyResult> deleteDomainPermissionsPolicyAsync(
            final DeleteDomainPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainPermissionsPolicyRequest, DeleteDomainPermissionsPolicyResult> asyncHandler) {
        final DeleteDomainPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainPermissionsPolicyResult>() {
            @Override
            public DeleteDomainPermissionsPolicyResult call() throws Exception {
                DeleteDomainPermissionsPolicyResult result = null;

                try {
                    result = executeDeleteDomainPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(DeletePackageVersionsRequest request) {

        return deletePackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePackageVersionsResult> deletePackageVersionsAsync(final DeletePackageVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePackageVersionsRequest, DeletePackageVersionsResult> asyncHandler) {
        final DeletePackageVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePackageVersionsResult>() {
            @Override
            public DeletePackageVersionsResult call() throws Exception {
                DeletePackageVersionsResult result = null;

                try {
                    result = executeDeletePackageVersions(finalRequest);
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
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(final DeleteRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {
        final DeleteRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
            @Override
            public DeleteRepositoryResult call() throws Exception {
                DeleteRepositoryResult result = null;

                try {
                    result = executeDeleteRepository(finalRequest);
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
    public java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            DeleteRepositoryPermissionsPolicyRequest request) {

        return deleteRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPermissionsPolicyResult> deleteRepositoryPermissionsPolicyAsync(
            final DeleteRepositoryPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPermissionsPolicyRequest, DeleteRepositoryPermissionsPolicyResult> asyncHandler) {
        final DeleteRepositoryPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryPermissionsPolicyResult>() {
            @Override
            public DeleteRepositoryPermissionsPolicyResult call() throws Exception {
                DeleteRepositoryPermissionsPolicyResult result = null;

                try {
                    result = executeDeleteRepositoryPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler) {
        final DescribeDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainResult>() {
            @Override
            public DescribeDomainResult call() throws Exception {
                DescribeDomainResult result = null;

                try {
                    result = executeDescribeDomain(finalRequest);
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
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest request) {

        return describePackageVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(final DescribePackageVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePackageVersionRequest, DescribePackageVersionResult> asyncHandler) {
        final DescribePackageVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePackageVersionResult>() {
            @Override
            public DescribePackageVersionResult call() throws Exception {
                DescribePackageVersionResult result = null;

                try {
                    result = executeDescribePackageVersion(finalRequest);
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
    public java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(DescribeRepositoryRequest request) {

        return describeRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryResult> describeRepositoryAsync(final DescribeRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRepositoryRequest, DescribeRepositoryResult> asyncHandler) {
        final DescribeRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRepositoryResult>() {
            @Override
            public DescribeRepositoryResult call() throws Exception {
                DescribeRepositoryResult result = null;

                try {
                    result = executeDescribeRepository(finalRequest);
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
    public java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(DisassociateExternalConnectionRequest request) {

        return disassociateExternalConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateExternalConnectionResult> disassociateExternalConnectionAsync(
            final DisassociateExternalConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateExternalConnectionRequest, DisassociateExternalConnectionResult> asyncHandler) {
        final DisassociateExternalConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateExternalConnectionResult>() {
            @Override
            public DisassociateExternalConnectionResult call() throws Exception {
                DisassociateExternalConnectionResult result = null;

                try {
                    result = executeDisassociateExternalConnection(finalRequest);
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
    public java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(DisposePackageVersionsRequest request) {

        return disposePackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisposePackageVersionsResult> disposePackageVersionsAsync(final DisposePackageVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisposePackageVersionsRequest, DisposePackageVersionsResult> asyncHandler) {
        final DisposePackageVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisposePackageVersionsResult>() {
            @Override
            public DisposePackageVersionsResult call() throws Exception {
                DisposePackageVersionsResult result = null;

                try {
                    result = executeDisposePackageVersions(finalRequest);
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
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest request) {

        return getAuthorizationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(final GetAuthorizationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler) {
        final GetAuthorizationTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizationTokenResult>() {
            @Override
            public GetAuthorizationTokenResult call() throws Exception {
                GetAuthorizationTokenResult result = null;

                try {
                    result = executeGetAuthorizationToken(finalRequest);
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
    public java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(GetDomainPermissionsPolicyRequest request) {

        return getDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainPermissionsPolicyResult> getDomainPermissionsPolicyAsync(final GetDomainPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainPermissionsPolicyRequest, GetDomainPermissionsPolicyResult> asyncHandler) {
        final GetDomainPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainPermissionsPolicyResult>() {
            @Override
            public GetDomainPermissionsPolicyResult call() throws Exception {
                GetDomainPermissionsPolicyResult result = null;

                try {
                    result = executeGetDomainPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(GetPackageVersionAssetRequest request) {

        return getPackageVersionAssetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionAssetResult> getPackageVersionAssetAsync(final GetPackageVersionAssetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPackageVersionAssetRequest, GetPackageVersionAssetResult> asyncHandler) {
        final GetPackageVersionAssetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPackageVersionAssetResult>() {
            @Override
            public GetPackageVersionAssetResult call() throws Exception {
                GetPackageVersionAssetResult result = null;

                try {
                    result = executeGetPackageVersionAsset(finalRequest);
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
    public java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(GetPackageVersionReadmeRequest request) {

        return getPackageVersionReadmeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPackageVersionReadmeResult> getPackageVersionReadmeAsync(final GetPackageVersionReadmeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPackageVersionReadmeRequest, GetPackageVersionReadmeResult> asyncHandler) {
        final GetPackageVersionReadmeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPackageVersionReadmeResult>() {
            @Override
            public GetPackageVersionReadmeResult call() throws Exception {
                GetPackageVersionReadmeResult result = null;

                try {
                    result = executeGetPackageVersionReadme(finalRequest);
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
    public java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(GetRepositoryEndpointRequest request) {

        return getRepositoryEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryEndpointResult> getRepositoryEndpointAsync(final GetRepositoryEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryEndpointRequest, GetRepositoryEndpointResult> asyncHandler) {
        final GetRepositoryEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryEndpointResult>() {
            @Override
            public GetRepositoryEndpointResult call() throws Exception {
                GetRepositoryEndpointResult result = null;

                try {
                    result = executeGetRepositoryEndpoint(finalRequest);
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
    public java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(GetRepositoryPermissionsPolicyRequest request) {

        return getRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPermissionsPolicyResult> getRepositoryPermissionsPolicyAsync(
            final GetRepositoryPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryPermissionsPolicyRequest, GetRepositoryPermissionsPolicyResult> asyncHandler) {
        final GetRepositoryPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryPermissionsPolicyResult>() {
            @Override
            public GetRepositoryPermissionsPolicyResult call() throws Exception {
                GetRepositoryPermissionsPolicyResult result = null;

                try {
                    result = executeGetRepositoryPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler) {
        final ListDomainsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDomainsResult>() {
            @Override
            public ListDomainsResult call() throws Exception {
                ListDomainsResult result = null;

                try {
                    result = executeListDomains(finalRequest);
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
    public java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(ListPackageVersionAssetsRequest request) {

        return listPackageVersionAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionAssetsResult> listPackageVersionAssetsAsync(final ListPackageVersionAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackageVersionAssetsRequest, ListPackageVersionAssetsResult> asyncHandler) {
        final ListPackageVersionAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackageVersionAssetsResult>() {
            @Override
            public ListPackageVersionAssetsResult call() throws Exception {
                ListPackageVersionAssetsResult result = null;

                try {
                    result = executeListPackageVersionAssets(finalRequest);
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
    public java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(ListPackageVersionDependenciesRequest request) {

        return listPackageVersionDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionDependenciesResult> listPackageVersionDependenciesAsync(
            final ListPackageVersionDependenciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackageVersionDependenciesRequest, ListPackageVersionDependenciesResult> asyncHandler) {
        final ListPackageVersionDependenciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackageVersionDependenciesResult>() {
            @Override
            public ListPackageVersionDependenciesResult call() throws Exception {
                ListPackageVersionDependenciesResult result = null;

                try {
                    result = executeListPackageVersionDependencies(finalRequest);
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
    public java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(ListPackageVersionsRequest request) {

        return listPackageVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackageVersionsResult> listPackageVersionsAsync(final ListPackageVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackageVersionsRequest, ListPackageVersionsResult> asyncHandler) {
        final ListPackageVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackageVersionsResult>() {
            @Override
            public ListPackageVersionsResult call() throws Exception {
                ListPackageVersionsResult result = null;

                try {
                    result = executeListPackageVersions(finalRequest);
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
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest request) {

        return listPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(final ListPackagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPackagesRequest, ListPackagesResult> asyncHandler) {
        final ListPackagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPackagesResult>() {
            @Override
            public ListPackagesResult call() throws Exception {
                ListPackagesResult result = null;

                try {
                    result = executeListPackages(finalRequest);
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
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest request) {

        return listRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(final ListRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler) {
        final ListRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoriesResult>() {
            @Override
            public ListRepositoriesResult call() throws Exception {
                ListRepositoriesResult result = null;

                try {
                    result = executeListRepositories(finalRequest);
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
    public java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(ListRepositoriesInDomainRequest request) {

        return listRepositoriesInDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesInDomainResult> listRepositoriesInDomainAsync(final ListRepositoriesInDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoriesInDomainRequest, ListRepositoriesInDomainResult> asyncHandler) {
        final ListRepositoriesInDomainRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoriesInDomainResult>() {
            @Override
            public ListRepositoriesInDomainResult call() throws Exception {
                ListRepositoriesInDomainResult result = null;

                try {
                    result = executeListRepositoriesInDomain(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(PutDomainPermissionsPolicyRequest request) {

        return putDomainPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDomainPermissionsPolicyResult> putDomainPermissionsPolicyAsync(final PutDomainPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDomainPermissionsPolicyRequest, PutDomainPermissionsPolicyResult> asyncHandler) {
        final PutDomainPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDomainPermissionsPolicyResult>() {
            @Override
            public PutDomainPermissionsPolicyResult call() throws Exception {
                PutDomainPermissionsPolicyResult result = null;

                try {
                    result = executePutDomainPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(PutRepositoryPermissionsPolicyRequest request) {

        return putRepositoryPermissionsPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryPermissionsPolicyResult> putRepositoryPermissionsPolicyAsync(
            final PutRepositoryPermissionsPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRepositoryPermissionsPolicyRequest, PutRepositoryPermissionsPolicyResult> asyncHandler) {
        final PutRepositoryPermissionsPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRepositoryPermissionsPolicyResult>() {
            @Override
            public PutRepositoryPermissionsPolicyResult call() throws Exception {
                PutRepositoryPermissionsPolicyResult result = null;

                try {
                    result = executePutRepositoryPermissionsPolicy(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(UpdatePackageVersionsStatusRequest request) {

        return updatePackageVersionsStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePackageVersionsStatusResult> updatePackageVersionsStatusAsync(final UpdatePackageVersionsStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePackageVersionsStatusRequest, UpdatePackageVersionsStatusResult> asyncHandler) {
        final UpdatePackageVersionsStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePackageVersionsStatusResult>() {
            @Override
            public UpdatePackageVersionsStatusResult call() throws Exception {
                UpdatePackageVersionsStatusResult result = null;

                try {
                    result = executeUpdatePackageVersionsStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(UpdateRepositoryRequest request) {

        return updateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryResult> updateRepositoryAsync(final UpdateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResult> asyncHandler) {
        final UpdateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRepositoryResult>() {
            @Override
            public UpdateRepositoryResult call() throws Exception {
                UpdateRepositoryResult result = null;

                try {
                    result = executeUpdateRepository(finalRequest);
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
