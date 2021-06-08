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
package com.amazonaws.services.iotdeviceadvisor;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotdeviceadvisor.model.*;

/**
 * Interface for accessing AWSIoTDeviceAdvisor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotdeviceadvisor.AbstractAWSIoTDeviceAdvisor} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Core Device Advisor is a cloud-based, fully managed test capability for validating IoT devices during device
 * software development. Device Advisor provides pre-built tests that you can use to validate IoT devices for reliable
 * and secure connectivity with AWS IoT Core before deploying devices to production. By using Device Advisor, you can
 * confirm that your devices can connect to AWS IoT Core, follow security best practices and, if applicable, receive
 * software updates from IoT Device Management. You can also download signed qualification reports to submit to the AWS
 * Partner Network to get your device qualified for the AWS Partner Device Catalog without the need to send your device
 * in and wait for it to be tested.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTDeviceAdvisor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.iotdeviceadvisor";

    /**
     * <p>
     * Creates a Device Advisor test suite.
     * </p>
     * 
     * @param createSuiteDefinitionRequest
     * @return Result of the CreateSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.CreateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSuiteDefinitionResult createSuiteDefinition(CreateSuiteDefinitionRequest createSuiteDefinitionRequest);

    /**
     * <p>
     * Deletes a Device Advisor test suite.
     * </p>
     * 
     * @param deleteSuiteDefinitionRequest
     * @return Result of the DeleteSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.DeleteSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/DeleteSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSuiteDefinitionResult deleteSuiteDefinition(DeleteSuiteDefinitionRequest deleteSuiteDefinitionRequest);

    /**
     * <p>
     * Gets information about a Device Advisor test suite.
     * </p>
     * 
     * @param getSuiteDefinitionRequest
     * @return Result of the GetSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetSuiteDefinitionResult getSuiteDefinition(GetSuiteDefinitionRequest getSuiteDefinitionRequest);

    /**
     * <p>
     * Gets information about a Device Advisor test suite run.
     * </p>
     * 
     * @param getSuiteRunRequest
     * @return Result of the GetSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    GetSuiteRunResult getSuiteRun(GetSuiteRunRequest getSuiteRunRequest);

    /**
     * <p>
     * Gets a report download link for a successful Device Advisor qualifying test suite run.
     * </p>
     * 
     * @param getSuiteRunReportRequest
     * @return Result of the GetSuiteRunReport operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.GetSuiteRunReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRunReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetSuiteRunReportResult getSuiteRunReport(GetSuiteRunReportRequest getSuiteRunReportRequest);

    /**
     * <p>
     * Lists the Device Advisor test suites you have created.
     * </p>
     * 
     * @param listSuiteDefinitionsRequest
     * @return Result of the ListSuiteDefinitions operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.ListSuiteDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListSuiteDefinitionsResult listSuiteDefinitions(ListSuiteDefinitionsRequest listSuiteDefinitionsRequest);

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs
     * of a specific version of the test suite.
     * </p>
     * 
     * @param listSuiteRunsRequest
     * @return Result of the ListSuiteRuns operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.ListSuiteRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS
     *      API Documentation</a>
     */
    ListSuiteRunsResult listSuiteRuns(ListSuiteRunsRequest listSuiteRunsRequest);

    /**
     * <p>
     * Lists the tags attached to an IoT Device Advisor resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a Device Advisor test suite run.
     * </p>
     * 
     * @param startSuiteRunRequest
     * @return Result of the StartSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ConflictException
     *         Sends Conflict Exception.
     * @sample AWSIoTDeviceAdvisor.StartSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    StartSuiteRunResult startSuiteRun(StartSuiteRunRequest startSuiteRunRequest);

    /**
     * <p>
     * Stops a Device Advisor test suite run that is currently running.
     * </p>
     * 
     * @param stopSuiteRunRequest
     * @return Result of the StopSuiteRun operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.StopSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StopSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    StopSuiteRunResult stopSuiteRun(StopSuiteRunRequest stopSuiteRunRequest);

    /**
     * <p>
     * Adds to and modifies existing tags of an IoT Device Advisor resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from an IoT Device Advisor resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws ResourceNotFoundException
     *         Sends Resource Not Found Exception.
     * @sample AWSIoTDeviceAdvisor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a Device Advisor test suite.
     * </p>
     * 
     * @param updateSuiteDefinitionRequest
     * @return Result of the UpdateSuiteDefinition operation returned by the service.
     * @throws ValidationException
     *         Sends invalid request exception.
     * @throws InternalServerException
     *         Sends Internal Failure Exception.
     * @sample AWSIoTDeviceAdvisor.UpdateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSuiteDefinitionResult updateSuiteDefinition(UpdateSuiteDefinitionRequest updateSuiteDefinitionRequest);

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
