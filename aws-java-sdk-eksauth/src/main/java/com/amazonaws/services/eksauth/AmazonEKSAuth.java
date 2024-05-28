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
package com.amazonaws.services.eksauth;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.eksauth.model.*;

/**
 * Interface for accessing Amazon EKS Auth.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.eksauth.AbstractAmazonEKSAuth} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon EKS Auth API and the <code>AssumeRoleForPodIdentity</code> action are only used by the EKS Pod Identity
 * Agent.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEKSAuth {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "eks-auth";

    /**
     * <p>
     * The Amazon EKS Auth API and the <code>AssumeRoleForPodIdentity</code> action are only used by the EKS Pod
     * Identity Agent.
     * </p>
     * <p>
     * We recommend that applications use the Amazon Web Services SDKs to connect to Amazon Web Services services; if
     * credentials from an EKS Pod Identity association are available in the pod, the latest versions of the SDKs use
     * them automatically.
     * </p>
     * 
     * @param assumeRoleForPodIdentityRequest
     * @return Result of the AssumeRoleForPodIdentity operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because your request rate is too high. Reduce the frequency of requests.
     * @throws InvalidRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The IAM principal making the request must
     *         have at least one IAM permissions policy attached that grants the required permissions. For more
     *         information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     *         management</a> in the <i>IAM User Guide</i>.
     * @throws InternalServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidTokenException
     *         The specified Kubernetes service account token is invalid.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ExpiredTokenException
     *         The specified Kubernetes service account token is expired.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKSAuth.AssumeRoleForPodIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-auth-2023-11-26/AssumeRoleForPodIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeRoleForPodIdentityResult assumeRoleForPodIdentity(AssumeRoleForPodIdentityRequest assumeRoleForPodIdentityRequest);

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
