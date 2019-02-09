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
package com.amazonaws.services.dlm;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.dlm.model.*;

/**
 * Interface for accessing Amazon DLM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dlm.AbstractAmazonDLM} instead.
 * </p>
 * <p>
 * <fullname>Amazon Data Lifecycle Manager</fullname>
 * <p>
 * With Amazon Data Lifecycle Manager, you can manage the lifecycle of your AWS resources. You create lifecycle
 * policies, which are used to automate operations on the specified resources.
 * </p>
 * <p>
 * Amazon DLM supports Amazon EBS volumes and snapshots. For information about using Amazon DLM with Amazon EBS, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html">Automating the Amazon EBS Snapshot
 * Lifecycle</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDLM {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dlm";

    /**
     * <p>
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
     * policies.
     * </p>
     * 
     * @param createLifecyclePolicyRequest
     * @return Result of the CreateLifecyclePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @sample AmazonDLM.CreateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLifecyclePolicyResult createLifecyclePolicy(CreateLifecyclePolicyRequest createLifecyclePolicyRequest);

    /**
     * <p>
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return Result of the DeleteLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Gets summary information about all or the specified data lifecycle policies.
     * </p>
     * <p>
     * To get complete information about a policy, use <a>GetLifecyclePolicy</a>.
     * </p>
     * 
     * @param getLifecyclePoliciesRequest
     * @return Result of the GetLifecyclePolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.GetLifecyclePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    GetLifecyclePoliciesResult getLifecyclePolicies(GetLifecyclePoliciesRequest getLifecyclePoliciesRequest);

    /**
     * <p>
     * Gets detailed information about the specified lifecycle policy.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return Result of the GetLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Updates the specified lifecycle policy.
     * </p>
     * 
     * @param updateLifecyclePolicyRequest
     * @return Result of the UpdateLifecyclePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A requested resource was not found.
     * @throws InvalidRequestException
     *         Bad request. The request is missing required parameters or has invalid parameters.
     * @throws InternalServerException
     *         The service failed in an unexpected way.
     * @throws LimitExceededException
     *         The request failed because a limit was exceeded.
     * @sample AmazonDLM.UpdateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/UpdateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLifecyclePolicyResult updateLifecyclePolicy(UpdateLifecyclePolicyRequest updateLifecyclePolicyRequest);

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
