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

import com.amazonaws.services.dlm.model.*;

/**
 * Interface for accessing Amazon DLM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dlm.AbstractAmazonDLMAsync} instead.
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
public interface AmazonDLMAsync extends AmazonDLM {

    /**
     * <p>
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
     * policies.
     * </p>
     * 
     * @param createLifecyclePolicyRequest
     * @return A Java Future containing the result of the CreateLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsync.CreateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(CreateLifecyclePolicyRequest createLifecyclePolicyRequest);

    /**
     * <p>
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle
     * policies.
     * </p>
     * 
     * @param createLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsyncHandler.CreateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CreateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(CreateLifecyclePolicyRequest createLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLifecyclePolicyRequest, CreateLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsync.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsyncHandler.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/DeleteLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all or the specified data lifecycle policies.
     * </p>
     * <p>
     * To get complete information about a policy, use <a>GetLifecyclePolicy</a>.
     * </p>
     * 
     * @param getLifecyclePoliciesRequest
     * @return A Java Future containing the result of the GetLifecyclePolicies operation returned by the service.
     * @sample AmazonDLMAsync.GetLifecyclePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(GetLifecyclePoliciesRequest getLifecyclePoliciesRequest);

    /**
     * <p>
     * Gets summary information about all or the specified data lifecycle policies.
     * </p>
     * <p>
     * To get complete information about a policy, use <a>GetLifecyclePolicy</a>.
     * </p>
     * 
     * @param getLifecyclePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLifecyclePolicies operation returned by the service.
     * @sample AmazonDLMAsyncHandler.GetLifecyclePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(GetLifecyclePoliciesRequest getLifecyclePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePoliciesRequest, GetLifecyclePoliciesResult> asyncHandler);

    /**
     * <p>
     * Gets detailed information about the specified lifecycle policy.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsync.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Gets detailed information about the specified lifecycle policy.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsyncHandler.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/GetLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Updates the specified lifecycle policy.
     * </p>
     * 
     * @param updateLifecyclePolicyRequest
     * @return A Java Future containing the result of the UpdateLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsync.UpdateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/UpdateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(UpdateLifecyclePolicyRequest updateLifecyclePolicyRequest);

    /**
     * <p>
     * Updates the specified lifecycle policy.
     * </p>
     * 
     * @param updateLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLifecyclePolicy operation returned by the service.
     * @sample AmazonDLMAsyncHandler.UpdateLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/UpdateLifecyclePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(UpdateLifecyclePolicyRequest updateLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLifecyclePolicyRequest, UpdateLifecyclePolicyResult> asyncHandler);

}
