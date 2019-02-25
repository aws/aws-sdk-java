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
     *         The container that you specified in the request already exists or is being updated.
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
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
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
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerPolicyResult deleteContainerPolicy(DeleteContainerPolicyRequest deleteContainerPolicyRequest);

    /**
     * <p>
     * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:DeleteCorsPolicy</code> action.
     * The container owner has this permission by default and can grant this permission to others.
     * </p>
     * 
     * @param deleteCorsPolicyRequest
     * @return Result of the DeleteCorsPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws CorsPolicyNotFoundException
     *         The CORS policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteCorsPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCorsPolicyResult deleteCorsPolicy(DeleteCorsPolicyRequest deleteCorsPolicyRequest);

    /**
     * <p>
     * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
     * container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
     * does not change after it has been assigned. The <code>DescribeContainer</code> request returns a single
     * <code>Container</code> object based on <code>ContainerName</code>. To return all <code>Container</code> objects
     * that are associated with a specified AWS account, use <a>ListContainers</a>.
     * </p>
     * 
     * @param describeContainerRequest
     * @return Result of the DescribeContainer operation returned by the service.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
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
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetContainerPolicyResult getContainerPolicy(GetContainerPolicyRequest getContainerPolicyRequest);

    /**
     * <p>
     * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:GetCorsPolicy</code> action. By
     * default, the container owner has this permission and can grant it to others.
     * </p>
     * 
     * @param getCorsPolicyRequest
     * @return Result of the GetCorsPolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws CorsPolicyNotFoundException
     *         The CORS policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetCorsPolicyResult getCorsPolicy(GetCorsPolicyRequest getCorsPolicyRequest);

    /**
     * <p>
     * Retrieves the object lifecycle policy that is assigned to a container.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws PolicyNotFoundException
     *         The policy that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

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
     *         The container that you specified in the request does not exist.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutContainerPolicyResult putContainerPolicy(PutContainerPolicyRequest putContainerPolicyRequest);

    /**
     * <p>
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service
     * cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     * capability.
     * </p>
     * <p>
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules
     * that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to
     * 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
     * the first applicable rule listed.
     * </p>
     * <p>
     * To learn more about CORS, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html">Cross-Origin Resource Sharing (CORS) in
     * AWS Elemental MediaStore</a>.
     * </p>
     * 
     * @param putCorsPolicyRequest
     * @return Result of the PutCorsPolicy operation returned by the service.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutCorsPolicyResult putCorsPolicy(PutCorsPolicyRequest putCorsPolicyRequest);

    /**
     * <p>
     * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
     * service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
     * effect.
     * </p>
     * <p>
     * For information about how to construct an object lifecycle policy, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html">Components of
     * an Object Lifecycle Policy</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return Result of the PutLifecyclePolicy operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest putLifecyclePolicyRequest);

    /**
     * <p>
     * Starts access logging on the specified container. When you enable access logging on a container, MediaStore
     * delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param startAccessLoggingRequest
     * @return Result of the StartAccessLogging operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.StartAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StartAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    StartAccessLoggingResult startAccessLogging(StartAccessLoggingRequest startAccessLoggingRequest);

    /**
     * <p>
     * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
     * sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
     * </p>
     * 
     * @param stopAccessLoggingRequest
     * @return Result of the StopAccessLogging operation returned by the service.
     * @throws ContainerInUseException
     *         The container that you specified in the request already exists or is being updated.
     * @throws ContainerNotFoundException
     *         The container that you specified in the request does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStore.StopAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StopAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    StopAccessLoggingResult stopAccessLogging(StopAccessLoggingRequest stopAccessLoggingRequest);

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
