/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediastore.model.*;

/**
 * Interface for accessing MediaStore.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediastore.AbstractAWSMediaStore} instead.
 * </p>
 * <p>
 * <p>
 * An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
 * create, read, and delete objects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaStore {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediastore";

    /**
     * <p>
     * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
     * </p>
     * 
     * @param createContainerRequest
     * @return Result of the CreateContainer operation returned by the service.
     * @throws ContainerInUseException
     *         Resource already exists or is being updated.
     * @throws LimitExceededException
     *         A service limit has been exceeded.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.CreateContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateContainerResult createContainer(CreateContainerRequest createContainerRequest);

    /**
     * <p>
     * Deletes the specified container. Before you make a <code>DeleteContainer</code> request, delete any objects in
     * the container or in any folders in the container. You can delete only empty containers.
     * </p>
     * 
     * @param deleteContainerRequest
     * @return Result of the DeleteContainer operation returned by the service.
     * @throws ContainerInUseException
     *         Resource already exists or is being updated.
     * @throws ContainerNotFoundException
     *         Could not perform an operation on a container that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteContainerResult deleteContainer(DeleteContainerRequest deleteContainerRequest);

    /**
     * <p>
     * Deletes the access policy that is associated with the specified container.
     * </p>
     * 
     * @param deleteContainerPolicyRequest
     * @return Result of the DeleteContainerPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         Resource already exists or is being updated.
     * @throws ContainerNotFoundException
     *         Could not perform an operation on a container that does not exist.
     * @throws PolicyNotFoundException
     *         Could not perform an operation on a policy that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerPolicyResult deleteContainerPolicy(DeleteContainerPolicyRequest deleteContainerPolicyRequest);

    /**
     * <p>
     * Retrieves the properties of the requested container. This returns a single <code>Container</code> object based on
     * <code>ContainerName</code>. To return all <code>Container</code> objects that are associated with a specified AWS
     * account, use <a>ListContainers</a>.
     * </p>
     * 
     * @param describeContainerRequest
     * @return Result of the DescribeContainer operation returned by the service.
     * @throws ContainerNotFoundException
     *         Could not perform an operation on a container that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DescribeContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DescribeContainer" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeContainerResult describeContainer(DescribeContainerRequest describeContainerRequest);

    /**
     * <p>
     * Retrieves the access policy for the specified container. For information about the data that is included in an
     * access policy, see the <a href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management
     * User Guide</a>.
     * </p>
     * 
     * @param getContainerPolicyRequest
     * @return Result of the GetContainerPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         Resource already exists or is being updated.
     * @throws ContainerNotFoundException
     *         Could not perform an operation on a container that does not exist.
     * @throws PolicyNotFoundException
     *         Could not perform an operation on a policy that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetContainerPolicyResult getContainerPolicy(GetContainerPolicyRequest getContainerPolicyRequest);

    /**
     * <p>
     * Lists the properties of all containers in AWS Elemental MediaStore.
     * </p>
     * <p>
     * You can query to receive all the containers in one response. Or you can include the <code>MaxResults</code>
     * parameter to receive a limited number of containers in each response. In this case, the response includes a
     * token. To get the next set of containers, send the command again, this time with the <code>NextToken</code>
     * parameter (with the returned token as its value). The next set of responses appears, with a token if there are
     * still more containers to receive.
     * </p>
     * <p>
     * See also <a>DescribeContainer</a>, which gets the properties of one container.
     * </p>
     * 
     * @param listContainersRequest
     * @return Result of the ListContainers operation returned by the service.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.ListContainers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/ListContainers" target="_top">AWS API
     *      Documentation</a>
     */
    ListContainersResult listContainers(ListContainersRequest listContainersRequest);

    /**
     * <p>
     * Creates an access policy for the specified container to restrict the users and clients that can access it. For
     * information about the data that is included in an access policy, see the <a
     * href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management User Guide</a>.
     * </p>
     * <p>
     * For this release of the REST API, you can create only one policy for a container. If you enter
     * <code>PutContainerPolicy</code> twice, the second command modifies the existing policy.
     * </p>
     * 
     * @param putContainerPolicyRequest
     * @return Result of the PutContainerPolicy operation returned by the service.
     * @throws ContainerNotFoundException
     *         Could not perform an operation on a container that does not exist.
     * @throws ContainerInUseException
     *         Resource already exists or is being updated.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutContainerPolicyResult putContainerPolicy(PutContainerPolicyRequest putContainerPolicyRequest);

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
