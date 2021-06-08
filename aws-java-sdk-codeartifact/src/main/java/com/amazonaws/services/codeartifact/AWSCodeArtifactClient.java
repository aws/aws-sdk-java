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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.codeartifact.AWSCodeArtifactClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.services.codeartifact.model.transform.*;

/**
 * Client for accessing CodeArtifact. All service calls made using this client are blocking, and will not return until
 * the service call completes.
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
public class AWSCodeArtifactClient extends AmazonWebServiceClient implements AWSCodeArtifact {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeArtifact.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codeartifact";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeartifact.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codeartifact.model.AWSCodeArtifactException.class));

    public static AWSCodeArtifactClientBuilder builder() {
        return AWSCodeArtifactClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeArtifactClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CodeArtifact using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeArtifactClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codeartifact.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codeartifact/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codeartifact/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public AssociateExternalConnectionResult associateExternalConnection(AssociateExternalConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateExternalConnection(request);
    }

    @SdkInternalApi
    final AssociateExternalConnectionResult executeAssociateExternalConnection(AssociateExternalConnectionRequest associateExternalConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(associateExternalConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateExternalConnectionRequest> request = null;
        Response<AssociateExternalConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateExternalConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateExternalConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateExternalConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateExternalConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateExternalConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public CopyPackageVersionsResult copyPackageVersions(CopyPackageVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeCopyPackageVersions(request);
    }

    @SdkInternalApi
    final CopyPackageVersionsResult executeCopyPackageVersions(CopyPackageVersionsRequest copyPackageVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(copyPackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyPackageVersionsRequest> request = null;
        Response<CopyPackageVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyPackageVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyPackageVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyPackageVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyPackageVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyPackageVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the CreateDomain operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public CreateRepositoryResult createRepository(CreateRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRepository(request);
    }

    @SdkInternalApi
    final CreateRepositoryResult executeCreateRepository(CreateRepositoryRequest createRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DeleteDomainPermissionsPolicyResult deleteDomainPermissionsPolicy(DeleteDomainPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainPermissionsPolicy(request);
    }

    @SdkInternalApi
    final DeleteDomainPermissionsPolicyResult executeDeleteDomainPermissionsPolicy(DeleteDomainPermissionsPolicyRequest deleteDomainPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainPermissionsPolicyRequest> request = null;
        Response<DeleteDomainPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDomainPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomainPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDomainPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the DeletePackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DeletePackageVersionsResult deletePackageVersions(DeletePackageVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackageVersions(request);
    }

    @SdkInternalApi
    final DeletePackageVersionsResult executeDeletePackageVersions(DeletePackageVersionsRequest deletePackageVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageVersionsRequest> request = null;
        Response<DeletePackageVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePackageVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackageVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackageVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeletePackageVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepository(request);
    }

    @SdkInternalApi
    final DeleteRepositoryResult executeDeleteRepository(DeleteRepositoryRequest deleteRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the DeleteRepositoryPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DeleteRepositoryPermissionsPolicyResult deleteRepositoryPermissionsPolicy(DeleteRepositoryPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepositoryPermissionsPolicy(request);
    }

    @SdkInternalApi
    final DeleteRepositoryPermissionsPolicyResult executeDeleteRepositoryPermissionsPolicy(
            DeleteRepositoryPermissionsPolicyRequest deleteRepositoryPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryPermissionsPolicyRequest> request = null;
        Response<DeleteRepositoryPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRepositoryPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepositoryPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRepositoryPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DescribePackageVersionResult describePackageVersion(DescribePackageVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackageVersion(request);
    }

    @SdkInternalApi
    final DescribePackageVersionResult executeDescribePackageVersion(DescribePackageVersionRequest describePackageVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackageVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackageVersionRequest> request = null;
        Response<DescribePackageVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackageVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackageVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackageVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackageVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePackageVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DescribeRepositoryResult describeRepository(DescribeRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRepository(request);
    }

    @SdkInternalApi
    final DescribeRepositoryResult executeDescribeRepository(DescribeRepositoryRequest describeRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoryRequest> request = null;
        Response<DescribeRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DisassociateExternalConnectionResult disassociateExternalConnection(DisassociateExternalConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateExternalConnection(request);
    }

    @SdkInternalApi
    final DisassociateExternalConnectionResult executeDisassociateExternalConnection(DisassociateExternalConnectionRequest disassociateExternalConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateExternalConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateExternalConnectionRequest> request = null;
        Response<DisassociateExternalConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateExternalConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateExternalConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateExternalConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateExternalConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateExternalConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public DisposePackageVersionsResult disposePackageVersions(DisposePackageVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDisposePackageVersions(request);
    }

    @SdkInternalApi
    final DisposePackageVersionsResult executeDisposePackageVersions(DisposePackageVersionsRequest disposePackageVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(disposePackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisposePackageVersionsRequest> request = null;
        Response<DisposePackageVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisposePackageVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disposePackageVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisposePackageVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisposePackageVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisposePackageVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetAuthorizationToken operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetAuthorizationTokenResult getAuthorizationToken(GetAuthorizationTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetAuthorizationToken(request);
    }

    @SdkInternalApi
    final GetAuthorizationTokenResult executeGetAuthorizationToken(GetAuthorizationTokenRequest getAuthorizationTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getAuthorizationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizationTokenRequest> request = null;
        Response<GetAuthorizationTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizationTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAuthorizationTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAuthorizationToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAuthorizationTokenResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetAuthorizationTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetDomainPermissionsPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetDomainPermissionsPolicyResult getDomainPermissionsPolicy(GetDomainPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainPermissionsPolicy(request);
    }

    @SdkInternalApi
    final GetDomainPermissionsPolicyResult executeGetDomainPermissionsPolicy(GetDomainPermissionsPolicyRequest getDomainPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainPermissionsPolicyRequest> request = null;
        Response<GetDomainPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDomainPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDomainPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetPackageVersionAssetResult getPackageVersionAsset(GetPackageVersionAssetRequest request) {
        request = beforeClientExecution(request);
        return executeGetPackageVersionAsset(request);
    }

    @SdkInternalApi
    final GetPackageVersionAssetResult executeGetPackageVersionAsset(GetPackageVersionAssetRequest getPackageVersionAssetRequest) {

        ExecutionContext executionContext = createExecutionContext(getPackageVersionAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionAssetRequest> request = null;
        Response<GetPackageVersionAssetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionAssetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPackageVersionAssetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPackageVersionAsset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPackageVersionAssetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true),
                    new GetPackageVersionAssetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetPackageVersionReadme operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetPackageVersionReadmeResult getPackageVersionReadme(GetPackageVersionReadmeRequest request) {
        request = beforeClientExecution(request);
        return executeGetPackageVersionReadme(request);
    }

    @SdkInternalApi
    final GetPackageVersionReadmeResult executeGetPackageVersionReadme(GetPackageVersionReadmeRequest getPackageVersionReadmeRequest) {

        ExecutionContext executionContext = createExecutionContext(getPackageVersionReadmeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionReadmeRequest> request = null;
        Response<GetPackageVersionReadmeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionReadmeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPackageVersionReadmeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPackageVersionReadme");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPackageVersionReadmeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPackageVersionReadmeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @return Result of the GetRepositoryEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetRepositoryEndpointResult getRepositoryEndpoint(GetRepositoryEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryEndpoint(request);
    }

    @SdkInternalApi
    final GetRepositoryEndpointResult executeGetRepositoryEndpoint(GetRepositoryEndpointRequest getRepositoryEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryEndpointRequest> request = null;
        Response<GetRepositoryEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryEndpointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRepositoryEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public GetRepositoryPermissionsPolicyResult getRepositoryPermissionsPolicy(GetRepositoryPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryPermissionsPolicy(request);
    }

    @SdkInternalApi
    final GetRepositoryPermissionsPolicyResult executeGetRepositoryPermissionsPolicy(GetRepositoryPermissionsPolicyRequest getRepositoryPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryPermissionsPolicyRequest> request = null;
        Response<GetRepositoryPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRepositoryPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRepositoryPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html"
     * >DomainSummary</a> objects for all domains owned by the AWS account that makes this call. Each returned
     * <code>DomainSummary</code> object contains information about a domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public ListPackageVersionAssetsResult listPackageVersionAssets(ListPackageVersionAssetsRequest request) {
        request = beforeClientExecution(request);
        return executeListPackageVersionAssets(request);
    }

    @SdkInternalApi
    final ListPackageVersionAssetsResult executeListPackageVersionAssets(ListPackageVersionAssetsRequest listPackageVersionAssetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackageVersionAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionAssetsRequest> request = null;
        Response<ListPackageVersionAssetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionAssetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPackageVersionAssetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackageVersionAssets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackageVersionAssetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPackageVersionAssetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public ListPackageVersionDependenciesResult listPackageVersionDependencies(ListPackageVersionDependenciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPackageVersionDependencies(request);
    }

    @SdkInternalApi
    final ListPackageVersionDependenciesResult executeListPackageVersionDependencies(ListPackageVersionDependenciesRequest listPackageVersionDependenciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackageVersionDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionDependenciesRequest> request = null;
        Response<ListPackageVersionDependenciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionDependenciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPackageVersionDependenciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackageVersionDependencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackageVersionDependenciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPackageVersionDependenciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"
     * >PackageVersionSummary</a> objects for package versions in a repository that match the request parameters.
     * </p>
     * 
     * @param listPackageVersionsRequest
     * @return Result of the ListPackageVersions operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public ListPackageVersionsResult listPackageVersions(ListPackageVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPackageVersions(request);
    }

    @SdkInternalApi
    final ListPackageVersionsResult executeListPackageVersions(ListPackageVersionsRequest listPackageVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackageVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackageVersionsRequest> request = null;
        Response<ListPackageVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackageVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackageVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackageVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackageVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPackageVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public ListPackagesResult listPackages(ListPackagesRequest request) {
        request = beforeClientExecution(request);
        return executeListPackages(request);
    }

    @SdkInternalApi
    final ListPackagesResult executeListPackages(ListPackagesRequest listPackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesRequest> request = null;
        Response<ListPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * >RepositorySummary</a> objects. Each <code>RepositorySummary</code> contains information about a repository in
     * the specified AWS account and that matches the input parameters.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @return Result of the ListRepositories operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
     * @throws ThrottlingException
     *         The operation did not succeed because too many requests are sent to the service.
     * @throws ValidationException
     *         The operation did not succeed because a parameter in the request was sent with an invalid value.
     * @sample AWSCodeArtifact.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRepositoriesResult listRepositories(ListRepositoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListRepositories(request);
    }

    @SdkInternalApi
    final ListRepositoriesResult executeListRepositories(ListRepositoriesRequest listRepositoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesRequest> request = null;
        Response<ListRepositoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRepositoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRepositories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRepositoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRepositoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public ListRepositoriesInDomainResult listRepositoriesInDomain(ListRepositoriesInDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListRepositoriesInDomain(request);
    }

    @SdkInternalApi
    final ListRepositoriesInDomainResult executeListRepositoriesInDomain(ListRepositoriesInDomainRequest listRepositoriesInDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listRepositoriesInDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoriesInDomainRequest> request = null;
        Response<ListRepositoriesInDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoriesInDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRepositoriesInDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRepositoriesInDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRepositoriesInDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRepositoriesInDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS tags for a specified Amazon Resource Name (ARN) in AWS CodeArtifact.
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
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public PutDomainPermissionsPolicyResult putDomainPermissionsPolicy(PutDomainPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutDomainPermissionsPolicy(request);
    }

    @SdkInternalApi
    final PutDomainPermissionsPolicyResult executePutDomainPermissionsPolicy(PutDomainPermissionsPolicyRequest putDomainPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putDomainPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDomainPermissionsPolicyRequest> request = null;
        Response<PutDomainPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDomainPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDomainPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDomainPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDomainPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDomainPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public PutRepositoryPermissionsPolicyResult putRepositoryPermissionsPolicy(PutRepositoryPermissionsPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutRepositoryPermissionsPolicy(request);
    }

    @SdkInternalApi
    final PutRepositoryPermissionsPolicyResult executePutRepositoryPermissionsPolicy(PutRepositoryPermissionsPolicyRequest putRepositoryPermissionsPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putRepositoryPermissionsPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRepositoryPermissionsPolicyRequest> request = null;
        Response<PutRepositoryPermissionsPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRepositoryPermissionsPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putRepositoryPermissionsPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRepositoryPermissionsPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRepositoryPermissionsPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRepositoryPermissionsPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates tags for a resource in AWS CodeArtifact.
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
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a resource in AWS CodeArtifact.
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
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of one or more versions of a package.
     * </p>
     * 
     * @param updatePackageVersionsStatusRequest
     * @return Result of the UpdatePackageVersionsStatus operation returned by the service.
     * @throws AccessDeniedException
     *         The operation did not succeed because of an unauthorized access attempt.
     * @throws ConflictException
     *         The operation did not succeed because prerequisites are not met.
     * @throws InternalServerException
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public UpdatePackageVersionsStatusResult updatePackageVersionsStatus(UpdatePackageVersionsStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePackageVersionsStatus(request);
    }

    @SdkInternalApi
    final UpdatePackageVersionsStatusResult executeUpdatePackageVersionsStatus(UpdatePackageVersionsStatusRequest updatePackageVersionsStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePackageVersionsStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePackageVersionsStatusRequest> request = null;
        Response<UpdatePackageVersionsStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePackageVersionsStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePackageVersionsStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePackageVersionsStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePackageVersionsStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePackageVersionsStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The operation did not succeed because of an error that occurred inside AWS CodeArtifact.
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
    @Override
    public UpdateRepositoryResult updateRepository(UpdateRepositoryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRepository(request);
    }

    @SdkInternalApi
    final UpdateRepositoryResult executeUpdateRepository(UpdateRepositoryRequest updateRepositoryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryRequest> request = null;
        Response<UpdateRepositoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRepositoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "codeartifact");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRepository");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRepositoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRepositoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
