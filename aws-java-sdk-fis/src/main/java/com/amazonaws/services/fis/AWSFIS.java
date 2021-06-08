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
package com.amazonaws.services.fis;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.fis.model.*;

/**
 * Interface for accessing FIS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fis.AbstractAWSFIS} instead.
 * </p>
 * <p>
 * <p>
 * AWS Fault Injection Simulator is a managed service that enables you to perform fault injection experiments on your
 * AWS workloads. For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault
 * Injection Simulator User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFIS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "fis";

    /**
     * <p>
     * Creates an experiment template.
     * </p>
     * <p>
     * To create a template, specify the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Targets</b>: A target can be a specific resource in your AWS environment, or one or more resources that match
     * criteria that you specify, for example, resources that have specific tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Actions</b>: The actions to carry out on the target. You can specify multiple actions, the duration of each
     * action, and when to start each action during an experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Stop conditions</b>: If a stop condition is triggered while an experiment is running, the experiment is
     * automatically stopped. You can define a stop condition as a CloudWatch alarm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see the <a href="https://docs.aws.amazon.com/fis/latest/userguide/">AWS Fault Injection
     * Simulator User Guide</a>.
     * </p>
     * 
     * @param createExperimentTemplateRequest
     * @return Result of the CreateExperimentTemplate operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ConflictException
     *         The request could not be processed because of a conflict.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSFIS.CreateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateExperimentTemplateResult createExperimentTemplate(CreateExperimentTemplateRequest createExperimentTemplateRequest);

    /**
     * <p>
     * Deletes the specified experiment template.
     * </p>
     * 
     * @param deleteExperimentTemplateRequest
     * @return Result of the DeleteExperimentTemplate operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @sample AWSFIS.DeleteExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteExperimentTemplateResult deleteExperimentTemplate(DeleteExperimentTemplateRequest deleteExperimentTemplateRequest);

    /**
     * <p>
     * Gets information about the specified AWS FIS action.
     * </p>
     * 
     * @param getActionRequest
     * @return Result of the GetAction operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @sample AWSFIS.GetAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetAction" target="_top">AWS API
     *      Documentation</a>
     */
    GetActionResult getAction(GetActionRequest getActionRequest);

    /**
     * <p>
     * Gets information about the specified experiment.
     * </p>
     * 
     * @param getExperimentRequest
     * @return Result of the GetExperiment operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @sample AWSFIS.GetExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    GetExperimentResult getExperiment(GetExperimentRequest getExperimentRequest);

    /**
     * <p>
     * Gets information about the specified experiment template.
     * </p>
     * 
     * @param getExperimentTemplateRequest
     * @return Result of the GetExperimentTemplate operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @sample AWSFIS.GetExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/GetExperimentTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetExperimentTemplateResult getExperimentTemplate(GetExperimentTemplateRequest getExperimentTemplateRequest);

    /**
     * <p>
     * Lists the available AWS FIS actions.
     * </p>
     * 
     * @param listActionsRequest
     * @return Result of the ListActions operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @sample AWSFIS.ListActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListActions" target="_top">AWS API
     *      Documentation</a>
     */
    ListActionsResult listActions(ListActionsRequest listActionsRequest);

    /**
     * <p>
     * Lists your experiment templates.
     * </p>
     * 
     * @param listExperimentTemplatesRequest
     * @return Result of the ListExperimentTemplates operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @sample AWSFIS.ListExperimentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperimentTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListExperimentTemplatesResult listExperimentTemplates(ListExperimentTemplatesRequest listExperimentTemplatesRequest);

    /**
     * <p>
     * Lists your experiments.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return Result of the ListExperiments operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @sample AWSFIS.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    ListExperimentsResult listExperiments(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSFIS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts running an experiment from the specified experiment template.
     * </p>
     * 
     * @param startExperimentRequest
     * @return Result of the StartExperiment operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ConflictException
     *         The request could not be processed because of a conflict.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSFIS.StartExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    StartExperimentResult startExperiment(StartExperimentRequest startExperimentRequest);

    /**
     * <p>
     * Stops the specified experiment.
     * </p>
     * 
     * @param stopExperimentRequest
     * @return Result of the StopExperiment operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @sample AWSFIS.StopExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StopExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    StopExperimentResult stopExperiment(StopExperimentRequest stopExperimentRequest);

    /**
     * <p>
     * Applies the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSFIS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSFIS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified experiment template.
     * </p>
     * 
     * @param updateExperimentTemplateRequest
     * @return Result of the UpdateExperimentTemplate operation returned by the service.
     * @throws ValidationException
     *         The specified input is not valid, or fails to satisfy the constraints for the request.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSFIS.UpdateExperimentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateExperimentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateExperimentTemplateResult updateExperimentTemplate(UpdateExperimentTemplateRequest updateExperimentTemplateRequest);

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
