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
package com.amazonaws.services.iotfleethub;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotfleethub.model.*;

/**
 * Interface for accessing AWS IoT Fleet Hub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotfleethub.AbstractAWSIoTFleetHub} instead.
 * </p>
 * <p>
 * <p>
 * With Fleet Hub for AWS IoT Device Management you can build stand-alone web applications for monitoring the health of
 * your device fleets.
 * </p>
 * <note>
 * <p>
 * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTFleetHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.fleethub.iot";

    /**
     * <p>
     * Creates a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws LimitExceededException
     *         A limit has been exceeded.
     * @sample AWSIoTFleetHub.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Deletes a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIoTFleetHub.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Gets information about a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIoTFleetHub.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationResult describeApplication(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Gets a list of Fleet Hub for AWS IoT Device Management web applications for the current account.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIoTFleetHub.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListApplications" target="_top">AWS
     *      API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIoTFleetHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the specified resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIoTFleetHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags (metadata) from the resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIoTFleetHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates information about a Fleet Hub for a AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ConflictException
     *         The request conflicts with the current state of the resource.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIoTFleetHub.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

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
