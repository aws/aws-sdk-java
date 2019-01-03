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
package com.amazonaws.services.codestar;

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

import com.amazonaws.services.codestar.AWSCodeStarClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codestar.model.*;
import com.amazonaws.services.codestar.model.transform.*;

/**
 * Client for accessing CodeStar. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS CodeStar</fullname>
 * <p>
 * This is the API reference for AWS CodeStar. This reference provides descriptions of the operations and data types for
 * the AWS CodeStar API along with usage examples.
 * </p>
 * <p>
 * You can use the AWS CodeStar API to work with:
 * </p>
 * <p>
 * Projects and their resources, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DeleteProject</code>, which deletes a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeProject</code>, which lists the attributes of a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>, which lists all projects associated with your AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListResources</code>, which lists the resources associated with a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListTagsForProject</code>, which lists the tags associated with a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TagProject</code>, which adds tags to a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UntagProject</code>, which removes tags from a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>, which updates the attributes of a project.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Teams and team members, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AssociateTeamMember</code>, which adds an IAM user to the team for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DisassociateTeamMember</code>, which removes an IAM user from the team for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListTeamMembers</code>, which lists all the IAM users in the team for a project, including their roles and
 * attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateTeamMember</code>, which updates a team member's attributes in a project.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateUserProfile</code>, which creates a user profile that contains data associated with the user across all
 * projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteUserProfile</code>, which deletes all user profile information across all projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeUserProfile</code>, which describes the profile of a user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListUserProfiles</code>, which lists all user profiles.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateUserProfile</code>, which updates the profile for a user.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeStarClient extends AmazonWebServiceClient implements AWSCodeStar {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeStar.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codestar";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidServiceRoleException").withModeledClass(
                                    com.amazonaws.services.codestar.model.InvalidServiceRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProjectAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ProjectAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserProfileAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.codestar.model.UserProfileAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProjectConfigurationException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ProjectConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProjectNotFoundException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ProjectNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProjectCreationFailedException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ProjectCreationFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TeamMemberAlreadyAssociatedException").withModeledClass(
                                    com.amazonaws.services.codestar.model.TeamMemberAlreadyAssociatedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserProfileNotFoundException").withModeledClass(
                                    com.amazonaws.services.codestar.model.UserProfileNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.codestar.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TeamMemberNotFoundException").withModeledClass(
                                    com.amazonaws.services.codestar.model.TeamMemberNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.codestar.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.codestar.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codestar.model.AWSCodeStarException.class));

    public static AWSCodeStarClientBuilder builder() {
        return AWSCodeStarClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CodeStar using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeStarClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CodeStar using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeStarClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codestar.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codestar/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codestar/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds an IAM user to the team for an AWS CodeStar project.
     * </p>
     * 
     * @param associateTeamMemberRequest
     * @return Result of the AssociateTeamMember operation returned by the service.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws TeamMemberAlreadyAssociatedException
     *         The team member is already associated with a role in this project.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.AssociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/AssociateTeamMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateTeamMemberResult associateTeamMember(AssociateTeamMemberRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTeamMember(request);
    }

    @SdkInternalApi
    final AssociateTeamMemberResult executeAssociateTeamMember(AssociateTeamMemberRequest associateTeamMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTeamMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTeamMemberRequest> request = null;
        Response<AssociateTeamMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTeamMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateTeamMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTeamMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTeamMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateTeamMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a project, including project resources. This action creates a project based on a submitted project
     * request. A set of source code files and a toolchain template file can be included with the project request. If
     * these are not provided, an empty project is created.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ProjectAlreadyExistsException
     *         An AWS CodeStar project with the same ID already exists in this region for the AWS account. AWS CodeStar
     *         project IDs must be unique within a region for the AWS account.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws ProjectCreationFailedException
     *         The project creation request was valid, but a nonspecific exception or error occurred during project
     *         creation. The project could not be created in AWS CodeStar.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a profile for a user that includes user preferences, such as the display name and email address
     * assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws UserProfileAlreadyExistsException
     *         A user profile with that name already exists in this region for the AWS account. AWS CodeStar user
     *         profile names must be unique within a region for the AWS account.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserProfile(request);
    }

    @SdkInternalApi
    final CreateUserProfileResult executeCreateUserProfile(CreateUserProfileRequest createUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a project, including project resources. Does not delete users associated with the project, but does
     * delete the IAM roles that allowed access to the project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @sample AWSCodeStar.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such
     * as display name and email address. It does not delete the history of that user, for example the history of
     * commits made by that user.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserProfile(request);
    }

    @SdkInternalApi
    final DeleteUserProfileResult executeDeleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserProfileRequest> request = null;
        Response<DeleteUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a project and its resources.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeProjectResult describeProject(DescribeProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProject(request);
    }

    @SdkInternalApi
    final DescribeProjectResult executeDescribeProject(DescribeProjectRequest describeProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a user in AWS CodeStar and the user attributes across all projects.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return Result of the DescribeUserProfile operation returned by the service.
     * @throws UserProfileNotFoundException
     *         The user profile was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeUserProfileResult describeUserProfile(DescribeUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserProfile(request);
    }

    @SdkInternalApi
    final DescribeUserProfileResult executeDescribeUserProfile(DescribeUserProfileRequest describeUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfileRequest> request = null;
        Response<DescribeUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that
     * allowed access to the project and its resources. Disassociating a team member does not remove that user's profile
     * from AWS CodeStar. It does not remove the user from IAM.
     * </p>
     * 
     * @param disassociateTeamMemberRequest
     * @return Result of the DisassociateTeamMember operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.DisassociateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DisassociateTeamMember"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTeamMemberResult disassociateTeamMember(DisassociateTeamMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTeamMember(request);
    }

    @SdkInternalApi
    final DisassociateTeamMemberResult executeDisassociateTeamMember(DisassociateTeamMemberRequest disassociateTeamMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTeamMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTeamMemberRequest> request = null;
        Response<DisassociateTeamMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTeamMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateTeamMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTeamMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTeamMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTeamMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all projects in AWS CodeStar associated with your AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists resources associated with a project in AWS CodeStar.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListResources(request);
    }

    @SdkInternalApi
    final ListResourcesResult executeListResources(ListResourcesRequest listResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesRequest> request = null;
        Response<ListResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the tags for a project.
     * </p>
     * 
     * @param listTagsForProjectRequest
     * @return Result of the ListTagsForProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @sample AWSCodeStar.ListTagsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTagsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForProjectResult listTagsForProject(ListTagsForProjectRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForProject(request);
    }

    @SdkInternalApi
    final ListTagsForProjectResult executeListTagsForProject(ListTagsForProjectRequest listTagsForProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForProjectRequest> request = null;
        Response<ListTagsForProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all team members associated with a project.
     * </p>
     * 
     * @param listTeamMembersRequest
     * @return Result of the ListTeamMembers operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListTeamMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListTeamMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTeamMembersResult listTeamMembers(ListTeamMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListTeamMembers(request);
    }

    @SdkInternalApi
    final ListTeamMembersResult executeListTeamMembers(ListTeamMembersRequest listTeamMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTeamMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTeamMembersRequest> request = null;
        Response<ListTeamMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTeamMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTeamMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTeamMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTeamMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTeamMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the user profiles configured for your AWS account in AWS CodeStar.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return Result of the ListUserProfiles operation returned by the service.
     * @throws InvalidNextTokenException
     *         The next token is not valid.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListUserProfiles(request);
    }

    @SdkInternalApi
    final ListUserProfilesResult executeListUserProfiles(ListUserProfilesRequest listUserProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserProfilesRequest> request = null;
        Response<ListUserProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUserProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a project.
     * </p>
     * 
     * @param tagProjectRequest
     * @return Result of the TagProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.TagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/TagProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagProjectResult tagProject(TagProjectRequest request) {
        request = beforeClientExecution(request);
        return executeTagProject(request);
    }

    @SdkInternalApi
    final TagProjectResult executeTagProject(TagProjectRequest tagProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(tagProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagProjectRequest> request = null;
        Response<TagProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagProjectResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from a project.
     * </p>
     * 
     * @param untagProjectRequest
     * @return Result of the UntagProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @sample AWSCodeStar.UntagProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UntagProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagProjectResult untagProject(UntagProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUntagProject(request);
    }

    @SdkInternalApi
    final UntagProjectResult executeUntagProject(UntagProjectRequest untagProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(untagProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagProjectRequest> request = null;
        Response<UntagProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a project in AWS CodeStar.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role
     * in the project, or change whether they have remote access to project resources.
     * </p>
     * 
     * @param updateTeamMemberRequest
     * @return Result of the UpdateTeamMember operation returned by the service.
     * @throws LimitExceededException
     *         A resource limit has been exceeded.
     * @throws ProjectNotFoundException
     *         The specified AWS CodeStar project was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @throws InvalidServiceRoleException
     *         The service role is not valid.
     * @throws ProjectConfigurationException
     *         Project configuration information is required but not specified.
     * @throws ConcurrentModificationException
     *         Another modification is being made. That modification must complete before you can make your change.
     * @throws TeamMemberNotFoundException
     *         The specified team member was not found.
     * @sample AWSCodeStar.UpdateTeamMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateTeamMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTeamMemberResult updateTeamMember(UpdateTeamMemberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTeamMember(request);
    }

    @SdkInternalApi
    final UpdateTeamMemberResult executeUpdateTeamMember(UpdateTeamMemberRequest updateTeamMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTeamMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTeamMemberRequest> request = null;
        Response<UpdateTeamMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTeamMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTeamMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTeamMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTeamMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTeamMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user
     * profile is displayed wherever the user's information appears to other users in AWS CodeStar.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws UserProfileNotFoundException
     *         The user profile was not found.
     * @throws ValidationException
     *         The specified input is either not valid, or it could not be validated.
     * @sample AWSCodeStar.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserProfile(request);
    }

    @SdkInternalApi
    final UpdateUserProfileResult executeUpdateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<UpdateUserProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeStar");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserProfileResultJsonUnmarshaller());
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

}
