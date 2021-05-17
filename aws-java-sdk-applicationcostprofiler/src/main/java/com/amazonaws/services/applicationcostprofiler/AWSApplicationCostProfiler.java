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
package com.amazonaws.services.applicationcostprofiler;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationcostprofiler.model.*;

/**
 * Interface for accessing AWS Application Cost Profiler.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationcostprofiler.AbstractAWSApplicationCostProfiler} instead.
 * </p>
 * <p>
 * <p>
 * This reference provides descriptions of the AWS Application Cost Profiler API.
 * </p>
 * <p>
 * The AWS Application Cost Profiler API provides programmatic access to view, create, update, and delete application
 * cost report definitions, as well as to import your usage data into the Application Cost Profiler service.
 * </p>
 * <p>
 * For more information about using this service, see the <a
 * href="https://docs.aws.amazon.com/application-cost-profiler/latest/userguide/introduction.html">AWS Application Cost
 * Profiler User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSApplicationCostProfiler {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "application-cost-profiler";

    /**
     * <p>
     * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being
     * generated.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     * @return Result of the DeleteReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.DeleteReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/DeleteReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReportDefinitionResult deleteReportDefinition(DeleteReportDefinitionRequest deleteReportDefinitionRequest);

    /**
     * <p>
     * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
     * </p>
     * 
     * @param getReportDefinitionRequest
     * @return Result of the GetReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.GetReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/GetReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    GetReportDefinitionResult getReportDefinition(GetReportDefinitionRequest getReportDefinitionRequest);

    /**
     * <p>
     * Ingests application usage data from Amazon Simple Storage Service (Amazon S3).
     * </p>
     * <p>
     * The data must already exist in the S3 location. As part of the action, AWS Application Cost Profiler copies the
     * object from your S3 bucket to an S3 bucket owned by Amazon for processing asynchronously.
     * </p>
     * 
     * @param importApplicationUsageRequest
     * @return Result of the ImportApplicationUsage operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.ImportApplicationUsage
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ImportApplicationUsage"
     *      target="_top">AWS API Documentation</a>
     */
    ImportApplicationUsageResult importApplicationUsage(ImportApplicationUsageRequest importApplicationUsageRequest);

    /**
     * <p>
     * Retrieves a list of all reports and their configurations for your AWS account.
     * </p>
     * <p>
     * The maximum number of reports is one.
     * </p>
     * 
     * @param listReportDefinitionsRequest
     * @return Result of the ListReportDefinitions operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.ListReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ListReportDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListReportDefinitionsResult listReportDefinitions(ListReportDefinitionsRequest listReportDefinitionsRequest);

    /**
     * <p>
     * Creates the report definition for a report in Application Cost Profiler.
     * </p>
     * 
     * @param putReportDefinitionRequest
     * @return Result of the PutReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @throws ServiceQuotaExceededException
     *         Your request exceeds one or more of the service quotas.
     * @sample AWSApplicationCostProfiler.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/PutReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    PutReportDefinitionResult putReportDefinition(PutReportDefinitionRequest putReportDefinitionRequest);

    /**
     * <p>
     * Updates existing report in AWS Application Cost Profiler.
     * </p>
     * 
     * @param updateReportDefinitionRequest
     * @return Result of the UpdateReportDefinition operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The calls to AWS Application Cost Profiler API are throttled. The request was denied.
     * @throws ValidationException
     *         The input fails to satisfy the constraints for the API.
     * @throws AccessDeniedException
     *         You do not have permission to perform this action.
     * @sample AWSApplicationCostProfiler.UpdateReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/UpdateReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReportDefinitionResult updateReportDefinition(UpdateReportDefinitionRequest updateReportDefinitionRequest);

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
