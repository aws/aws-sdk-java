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
package com.amazonaws.services.cloud9;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloud9.model.*;

/**
 * Interface for accessing AWS Cloud9.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloud9.AbstractAWSCloud9} instead.
 * </p>
 * <p>
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide">AWS
 * Cloud9 User Guide</a>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then connects from the instance to the environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
 * also terminates the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironmentMembership</code>: Deletes an environment member from an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentMemberships</code>: Gets information about environment members for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironments</code>: Gets information about environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentStatus</code>: Gets status information for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListEnvironments</code>: Gets a list of environment identifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironment</code>: Changes the settings of an existing environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironmentMembership</code>: Changes the settings of an existing environment member for an environment.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloud9 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloud9";

    /**
     * <p>
     * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
     * and then connects from the instance to the environment.
     * </p>
     * 
     * @param createEnvironmentEC2Request
     * @return Result of the CreateEnvironmentEC2 operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.CreateEnvironmentEC2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentEC2" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEnvironmentEC2Result createEnvironmentEC2(CreateEnvironmentEC2Request createEnvironmentEC2Request);

    /**
     * <p>
     * Adds an environment member to an AWS Cloud9 development environment.
     * </p>
     * 
     * @param createEnvironmentMembershipRequest
     * @return Result of the CreateEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.CreateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentMembershipResult createEnvironmentMembership(CreateEnvironmentMembershipRequest createEnvironmentMembershipRequest);

    /**
     * <p>
     * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
     * terminates the instance.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an environment member from an AWS Cloud9 development environment.
     * </p>
     * 
     * @param deleteEnvironmentMembershipRequest
     * @return Result of the DeleteEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DeleteEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentMembershipResult deleteEnvironmentMembership(DeleteEnvironmentMembershipRequest deleteEnvironmentMembershipRequest);

    /**
     * <p>
     * Gets information about environment members for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentMembershipsRequest
     * @return Result of the DescribeEnvironmentMemberships operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironmentMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentMembershipsResult describeEnvironmentMemberships(DescribeEnvironmentMembershipsRequest describeEnvironmentMembershipsRequest);

    /**
     * <p>
     * Gets status information for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentStatusRequest
     * @return Result of the DescribeEnvironmentStatus operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentStatusResult describeEnvironmentStatus(DescribeEnvironmentStatusRequest describeEnvironmentStatusRequest);

    /**
     * <p>
     * Gets information about AWS Cloud9 development environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     * @return Result of the DescribeEnvironments operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest);

    /**
     * <p>
     * Gets a list of AWS Cloud9 development environment identifiers.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Changes the settings of an existing AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentMembershipRequest
     * @return Result of the UpdateEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.UpdateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentMembershipResult updateEnvironmentMembership(UpdateEnvironmentMembershipRequest updateEnvironmentMembershipRequest);

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
