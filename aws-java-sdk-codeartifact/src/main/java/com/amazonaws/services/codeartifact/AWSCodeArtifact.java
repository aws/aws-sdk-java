/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codeartifact.model.*;

/**
 * Interface for accessing CodeArtifact.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codeartifact.AbstractAWSCodeArtifact} instead.
 * </p>
 * <p>
 * <p>
 * CodeArtifact is a fully managed artifact repository compatible with language-native package managers and build tools
 * such as npm, Apache Maven, pip, and dotnet. You can use CodeArtifact to share packages with development teams and
 * pull packages. Packages can be pulled from both public and CodeArtifact repositories. You can also create an upstream
 * relationship between a CodeArtifact repository and another repository, which effectively merges their contents from
 * the point of view of a package manager client.
 * </p>
 * <p>
 * <b>CodeArtifact concepts</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Repository</b>: A CodeArtifact repository contains a set of <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/welcome.html#welcome-concepts-package-version">package
 * versions</a>, each of which maps to a set of assets, or files. Repositories are polyglot, so a single repository can
 * contain packages of any supported type. Each repository exposes endpoints for fetching and publishing packages using
 * tools such as the <b> <code>npm</code> </b> CLI or the Maven CLI (<b> <code>mvn</code> </b>). For a list of supported
 * package managers, see the <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/welcome.html">CodeArtifact User
 * Guide</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Domain</b>: Repositories are aggregated into a higher-level entity known as a <i>domain</i>. All package assets
 * and metadata are stored in the domain, but are consumed through repositories. A given package asset, such as a Maven
 * JAR file, is stored once per domain, no matter how many repositories it's present in. All of the assets and metadata
 * in a domain are encrypted with the same customer master key (CMK) stored in Key Management Service (KMS).
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
 * install the software. CodeArtifact supports npm, PyPI, Maven, NuGet, Swift, Ruby, and generic package formats. For
 * more information about the supported package formats and how to use CodeArtifact with them, see the <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/ug/welcome.html">CodeArtifact User Guide</a>.
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
 * <b>Package group</b>: A group of packages that match a specified definition. Package groups can be used to apply
 * configuration to multiple packages that match a defined pattern using package format, package namespace, and package
 * name. You can use package groups to more conveniently configure package origin controls for multiple packages.
 * Package origin controls are used to block or allow ingestion or publishing of new package versions, which protects
 * users from malicious actions known as dependency substitution attacks.
 * </p>
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
 * <b>CodeArtifact supported API operations</b>
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
 * <code>CreateDomain</code>: Creates a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreatePackageGroup</code>: Creates a package group.
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
 * <code>DeletePackage</code>: Deletes a package and all associated package versions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeletePackageGroup</code>: Deletes a package group. Does not delete packages or package versions that are
 * associated with a package group.
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
 * <code>DescribePackage</code>: Returns a <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html"
 * >PackageDescription</a> object that contains details about a package.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribePackageGroup</code>: Returns a <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageGroup.html">PackageGroup</a> object
 * that contains details about a package group.
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
 * <code>GetAssociatedPackageGroup</code>: Returns the most closely associated package group to the specified package.
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
 * <code>generic</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>maven</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>npm</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>nuget</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>pypi</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ruby</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>swift</code>
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
 * <code>ListAllowedRepositoriesForGroup</code>: Lists the allowed repositories for a package group that has origin
 * configuration set to <code>ALLOW_SPECIFIC_REPOSITORIES</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListAssociatedPackages</code>: Returns a list of packages associated with the requested package group.
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
 * <code>ListPackageGroups</code>: Returns a list of package groups in the requested domain.
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
 * <code>ListRepositories</code>: Returns a list of repositories owned by the Amazon Web Services account that called
 * this method.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListRepositoriesInDomain</code>: Returns a list of the repositories in a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSubPackageGroups</code>: Returns a list of direct children of the specified package group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PublishPackageVersion</code>: Creates a new package version containing one or more assets.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutDomainPermissionsPolicy</code>: Attaches a resource policy to a domain.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutPackageOriginConfiguration</code>: Sets the package origin configuration for a package, which determine how
 * new versions of the package can be added to a specific repository.
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
 * <code>UpdatePackageGroup</code>: Updates a package group. This API cannot be used to update a package group's origin
 * configuration or pattern.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdatePackageGroupOriginConfiguration</code>: Updates the package origin configuration for a package group.
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
public interface AWSCodeArtifact {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codeartifact";

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
     * @return Result of the AssociateExternalConnection operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.AssociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/AssociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateExternalConnectionResult associateExternalConnection(AssociateExternalConnectionRequest associateExternalConnectionRequest);

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
     * @return Result of the CopyPackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.CopyPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CopyPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    CopyPackageVersionsResult copyPackageVersions(CopyPackageVersionsRequest copyPackageVersionsRequest);

    /**
     * <p>
     * Creates a domain. CodeArtifact <i>domains</i> make it easier to manage multiple repositories across an
     * organization. You can use a domain to apply permissions across many repositories owned by different Amazon Web
     * Services accounts. An asset is stored only once in a domain, even if it's in multiple repositories.
     * </p>
     * <p>
     * Although you can have multiple domains, we recommend a single production domain that contains all published
     * artifacts so that your development teams can find and share packages. You can use a second pre-production domain
     * to test changes to the production domain configuration.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a package group. For more information about creating package groups, including example CLI commands, see
     * <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/create-package-group.html">Create a package group</a>
     * in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param createPackageGroupRequest
     * @return Result of the CreatePackageGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.CreatePackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreatePackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePackageGroupResult createPackageGroup(CreatePackageGroupRequest createPackageGroupRequest);

    /**
     * <p>
     * Creates a repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return Result of the CreateRepository operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Deletes a domain. You cannot delete a domain that contains repositories. If you want to delete a domain with
     * repositories, first delete its repositories.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes the resource policy set on a domain.
     * </p>
     * 
     * @param deleteDomainPermissionsPolicyRequest
     * @return Result of the DeleteDomainPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeleteDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDomainPermissionsPolicyResult deleteDomainPermissionsPolicy(DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Deletes a package and all associated package versions. A deleted package cannot be restored. To delete one or
     * more package versions, use the <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DeletePackageVersions.html"
     * >DeletePackageVersions</a> API.
     * </p>
     * 
     * @param deletePackageRequest
     * @return Result of the DeletePackage operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeletePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackage" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Deletes a package group. Deleting a package group does not delete packages or package versions associated with
     * the package group. When a package group is deleted, the direct child package groups will become children of the
     * package group's direct parent package group. Therefore, if any of the child groups are inheriting any settings
     * from the parent, those settings could change.
     * </p>
     * 
     * @param deletePackageGroupRequest
     * @return Result of the DeletePackageGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeletePackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePackageGroupResult deletePackageGroup(DeletePackageGroupRequest deletePackageGroupRequest);

    /**
     * <p>
     * Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If
     * you want to remove a package version from your repository and be able to restore it later, set its status to
     * <code>Archived</code>. Archived packages cannot be downloaded from a repository and don't show up with list
     * package APIs (for example, <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
     * >ListPackageVersions</a>), but you can restore them using <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html"
     * >UpdatePackageVersionsStatus</a>.
     * </p>
     * 
     * @param deletePackageVersionsRequest
     * @return Result of the DeletePackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeletePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeletePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePackageVersionsResult deletePackageVersions(DeletePackageVersionsRequest deletePackageVersionsRequest);

    /**
     * <p>
     * Deletes a repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepository" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes the resource policy that is set on a repository. After a resource policy is deleted, the permissions
     * allowed and denied by the deleted policy are removed. The effect of deleting a resource policy might not be
     * immediate.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteRepositoryPermissionsPolicy</code> with caution. After a policy is deleted, Amazon Web Services
     * users, roles, and accounts lose permissions to perform the repository actions granted by the deleted policy.
     * </p>
     * </important>
     * 
     * @param deleteRepositoryPermissionsPolicyRequest
     * @return Result of the DeleteRepositoryPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeleteRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRepositoryPermissionsPolicyResult deleteRepositoryPermissionsPolicy(DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DomainDescription.html">
     * DomainDescription</a> object that contains information about the requested domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeDomain" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns a <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageDescription.html">
     * PackageDescription</a> object that contains information about the requested package.
     * </p>
     * 
     * @param describePackageRequest
     * @return Result of the DescribePackage operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DescribePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackage" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePackageResult describePackage(DescribePackageRequest describePackageRequest);

    /**
     * <p>
     * Returns a <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageGroupDescription.html">
     * PackageGroupDescription</a> object that contains information about the requested package group.
     * </p>
     * 
     * @param describePackageGroupRequest
     * @return Result of the DescribePackageGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.DescribePackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackageGroupResult describePackageGroup(DescribePackageGroupRequest describePackageGroupRequest);

    /**
     * <p>
     * Returns a <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >PackageVersionDescription</a> object that contains information about the requested package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return Result of the DescribePackageVersion operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackageVersionResult describePackageVersion(DescribePackageVersionRequest describePackageVersionRequest);

    /**
     * <p>
     * Returns a <code>RepositoryDescription</code> object that contains detailed information about the requested
     * repository.
     * </p>
     * 
     * @param describeRepositoryRequest
     * @return Result of the DescribeRepository operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DescribeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRepositoryResult describeRepository(DescribeRepositoryRequest describeRepositoryRequest);

    /**
     * <p>
     * Removes an existing external connection from a repository.
     * </p>
     * 
     * @param disassociateExternalConnectionRequest
     * @return Result of the DisassociateExternalConnection operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DisassociateExternalConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisassociateExternalConnection"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateExternalConnectionResult disassociateExternalConnection(DisassociateExternalConnectionRequest disassociateExternalConnectionRequest);

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
     * @return Result of the DisposePackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DisposePackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DisposePackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DisposePackageVersionsResult disposePackageVersions(DisposePackageVersionsRequest disposePackageVersionsRequest);

    /**
     * <p>
     * Returns the most closely associated package group to the specified package. This API does not require that the
     * package exist in any repository in the domain. As such, <code>GetAssociatedPackageGroup</code> can be used to see
     * which package group's origin configuration applies to a package before that package is in a repository. This can
     * be helpful to check if public packages are blocked without ingesting them.
     * </p>
     * <p>
     * For information package group association and matching, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param getAssociatedPackageGroupRequest
     * @return Result of the GetAssociatedPackageGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.GetAssociatedPackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAssociatedPackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssociatedPackageGroupResult getAssociatedPackageGroup(GetAssociatedPackageGroupRequest getAssociatedPackageGroupRequest);

    /**
     * <p>
     * Generates a temporary authorization token for accessing repositories in the domain. This API requires the
     * <code>codeartifact:GetAuthorizationToken</code> and <code>sts:GetServiceBearerToken</code> permissions. For more
     * information about authorization tokens, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/tokens-authentication.html">CodeArtifact authentication
     * and tokens</a>.
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
     * @return Result of the GetAuthorizationToken operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.GetAuthorizationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAuthorizationToken"
     *      target="_top">AWS API Documentation</a>
     */
    GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest);

    /**
     * <p>
     * Returns the resource policy attached to the specified domain.
     * </p>
     * <note>
     * <p>
     * The policy is a resource-based policy, not an identity-based policy. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html">Identity-based
     * policies and resource-based policies </a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getDomainPermissionsPolicyRequest
     * @return Result of the GetDomainPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.GetDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetDomainPermissionsPolicyResult getDomainPermissionsPolicy(GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Returns an asset (or file) that is in a package. For example, for a Maven package version, use
     * <code>GetPackageVersionAsset</code> to download a <code>JAR</code> file, a <code>POM</code> file, or any other
     * assets in the package version.
     * </p>
     * 
     * @param getPackageVersionAssetRequest
     * @return Result of the GetPackageVersionAsset operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @sample AWSCodeArtifact.GetPackageVersionAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionAsset"
     *      target="_top">AWS API Documentation</a>
     */
    GetPackageVersionAssetResult getPackageVersionAsset(GetPackageVersionAssetRequest getPackageVersionAssetRequest);

    /**
     * <p>
     * Gets the readme file or descriptive text for a package version.
     * </p>
     * <p>
     * The returned text might contain formatting. For example, it might contain formatting for Markdown or
     * reStructuredText.
     * </p>
     * 
     * @param getPackageVersionReadmeRequest
     * @return Result of the GetPackageVersionReadme operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.GetPackageVersionReadme
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionReadme"
     *      target="_top">AWS API Documentation</a>
     */
    GetPackageVersionReadmeResult getPackageVersionReadme(GetPackageVersionReadmeRequest getPackageVersionReadmeRequest);

    /**
     * <p>
     * Returns the endpoint of a repository for a specific package format. A repository has one endpoint for each
     * package format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>generic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>nuget</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ruby</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>swift</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRepositoryEndpointRequest
     * @return Result of the GetRepositoryEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.GetRepositoryEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetRepositoryEndpointResult getRepositoryEndpoint(GetRepositoryEndpointRequest getRepositoryEndpointRequest);

    /**
     * <p>
     * Returns the resource policy that is set on a repository.
     * </p>
     * 
     * @param getRepositoryPermissionsPolicyRequest
     * @return Result of the GetRepositoryPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.GetRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetRepositoryPermissionsPolicyResult getRepositoryPermissionsPolicy(GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Lists the repositories in the added repositories list of the specified restriction type for a package group. For
     * more information about restriction types and added repository lists, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-origin-controls.html">Package group origin
     * controls</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param listAllowedRepositoriesForGroupRequest
     * @return Result of the ListAllowedRepositoriesForGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.ListAllowedRepositoriesForGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListAllowedRepositoriesForGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ListAllowedRepositoriesForGroupResult listAllowedRepositoriesForGroup(ListAllowedRepositoriesForGroupRequest listAllowedRepositoriesForGroupRequest);

    /**
     * <p>
     * Returns a list of packages associated with the requested package group. For information package group association
     * and matching, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param listAssociatedPackagesRequest
     * @return Result of the ListAssociatedPackages operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.ListAssociatedPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListAssociatedPackages"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedPackagesResult listAssociatedPackages(ListAssociatedPackagesRequest listAssociatedPackagesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >DomainSummary</a> objects for all domains owned by the Amazon Web Services account that makes this call. Each
     * returned <code>DomainSummary</code> object contains information about a domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns a list of package groups in the requested domain.
     * </p>
     * 
     * @param listPackageGroupsRequest
     * @return Result of the ListPackageGroups operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.ListPackageGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListPackageGroupsResult listPackageGroups(ListPackageGroupsRequest listPackageGroupsRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * objects for assets in a package version.
     * </p>
     * 
     * @param listPackageVersionAssetsRequest
     * @return Result of the ListPackageVersionAssets operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListPackageVersionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    ListPackageVersionAssetsResult listPackageVersionAssets(ListPackageVersionAssetsRequest listPackageVersionAssetsRequest);

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
     * @return Result of the ListPackageVersionDependencies operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListPackageVersionDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersionDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    ListPackageVersionDependenciesResult listPackageVersionDependencies(ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects for package versions in a repository that match the request parameters.
     * Package versions of all statuses will be returned by default when calling <code>list-package-versions</code> with
     * no <code>--status</code> parameter.
     * </p>
     * 
     * @param listPackageVersionsRequest
     * @return Result of the ListPackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListPackageVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackageVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListPackageVersionsResult listPackageVersions(ListPackageVersionsRequest listPackageVersionsRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects for packages in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackagesRequest
     * @return Result of the ListPackages operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    ListPackagesResult listPackages(ListPackagesRequest listPackagesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified Amazon Web Services account and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @return Result of the ListRepositories operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    ListRepositoriesResult listRepositories(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified domain and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesInDomainRequest
     * @return Result of the ListRepositoriesInDomain operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListRepositoriesInDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositoriesInDomain"
     *      target="_top">AWS API Documentation</a>
     */
    ListRepositoriesInDomainResult listRepositoriesInDomain(ListRepositoriesInDomainRequest listRepositoriesInDomainRequest);

    /**
     * <p>
     * Returns a list of direct children of the specified package group.
     * </p>
     * <p>
     * For information package group hierarchy, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-definition-syntax-matching-behavior.html"
     * >Package group definition syntax and matching behavior</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param listSubPackageGroupsRequest
     * @return Result of the ListSubPackageGroups operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.ListSubPackageGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListSubPackageGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubPackageGroupsResult listSubPackageGroups(ListSubPackageGroupsRequest listSubPackageGroupsRequest);

    /**
     * <p>
     * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in CodeArtifact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a new package version containing one or more assets (or files).
     * </p>
     * <p>
     * The <code>unfinished</code> flag can be used to keep the package version in the <code>Unfinished</code> state
     * until all of its assets have been uploaded (see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact user guide</i>). To set the package version’s status to
     * <code>Published</code>, omit the <code>unfinished</code> flag when uploading the final asset, or set the status
     * using <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html">
     * UpdatePackageVersionStatus</a>. Once a package version’s status is set to <code>Published</code>, it cannot
     * change back to <code>Unfinished</code>.
     * </p>
     * <note>
     * <p>
     * Only generic packages can be published using this API. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html">Using generic packages</a> in the
     * <i>CodeArtifact User Guide</i>.
     * </p>
     * </note>
     * 
     * @param publishPackageVersionRequest
     * @return Result of the PublishPackageVersion operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.PublishPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PublishPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    PublishPackageVersionResult publishPackageVersion(PublishPackageVersionRequest publishPackageVersionRequest);

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
     * @return Result of the PutDomainPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.PutDomainPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutDomainPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutDomainPermissionsPolicyResult putDomainPermissionsPolicy(PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest);

    /**
     * <p>
     * Sets the package origin configuration for a package.
     * </p>
     * <p>
     * The package origin configuration determines how new versions of a package can be added to a repository. You can
     * allow or block direct publishing of new package versions, or ingestion and retaining of new package versions from
     * an external connection or upstream source. For more information about package origin controls and configuration,
     * see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/package-origin-controls.html">Editing package
     * origin controls</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * <p>
     * <code>PutPackageOriginConfiguration</code> can be called on a package that doesn't yet exist in the repository.
     * When called on a package that does not exist, a package is created in the repository with no versions and the
     * requested restrictions are set on the package. This can be used to preemptively block ingesting or retaining any
     * versions from external connections or upstream repositories, or to block publishing any versions of the package
     * into the repository before connecting any package managers or publishers to the repository.
     * </p>
     * 
     * @param putPackageOriginConfigurationRequest
     * @return Result of the PutPackageOriginConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.PutPackageOriginConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutPackageOriginConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutPackageOriginConfigurationResult putPackageOriginConfiguration(PutPackageOriginConfigurationRequest putPackageOriginConfigurationRequest);

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
     * @return Result of the PutRepositoryPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.PutRepositoryPermissionsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutRepositoryPermissionsPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutRepositoryPermissionsPolicyResult putRepositoryPermissionsPolicy(PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest);

    /**
     * <p>
     * Adds or updates tags for a resource in CodeArtifact.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource in CodeArtifact.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a package group. This API cannot be used to update a package group's origin configuration or pattern. To
     * update a package group's origin configuration, use <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageGroupOriginConfiguration.html"
     * >UpdatePackageGroupOriginConfiguration</a>.
     * </p>
     * 
     * @param updatePackageGroupRequest
     * @return Result of the UpdatePackageGroup operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.UpdatePackageGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePackageGroupResult updatePackageGroup(UpdatePackageGroupRequest updatePackageGroupRequest);

    /**
     * <p>
     * Updates the package origin configuration for a package group.
     * </p>
     * <p>
     * The package origin configuration determines how new versions of a package can be added to a repository. You can
     * allow or block direct publishing of new package versions, or ingestion and retaining of new package versions from
     * an external connection or upstream source. For more information about package group origin controls and
     * configuration, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/package-group-origin-controls.html">Package group origin
     * controls</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param updatePackageGroupOriginConfigurationRequest
     * @return Result of the UpdatePackageGroupOriginConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @sample AWSCodeArtifact.UpdatePackageGroupOriginConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageGroupOriginConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePackageGroupOriginConfigurationResult updatePackageGroupOriginConfiguration(
            UpdatePackageGroupOriginConfigurationRequest updatePackageGroupOriginConfigurationRequest);

    /**
     * <p>
     * Updates the status of one or more versions of a package. Using <code>UpdatePackageVersionsStatus</code>, you can
     * update the status of package versions to <code>Archived</code>, <code>Published</code>, or <code>Unlisted</code>.
     * To set the status of a package version to <code>Disposed</code>, use <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_DisposePackageVersions.html"
     * >DisposePackageVersions</a>.
     * </p>
     * 
     * @param updatePackageVersionsStatusRequest
     * @return Result of the UpdatePackageVersionsStatus operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.UpdatePackageVersionsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageVersionsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePackageVersionsStatusResult updatePackageVersionsStatus(UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest);

    /**
     * <p>
     * Update the properties of a repository.
     * </p>
     * 
     * @param updateRepositoryRequest
     * @return Result of the UpdateRepository operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside CodeArtifact.
     * @throws ResourceNotFoundException
     *         The operation did not succeed because the resource requested is not found in the service.
     * @throws ServiceQuotaExceededException
     *         The operation did not succeed because it would have exceeded a service limit for your account.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.UpdateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdateRepository" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRepositoryResult updateRepository(UpdateRepositoryRequest updateRepositoryRequest);

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
