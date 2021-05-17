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

import com.amazonaws.services.applicationcostprofiler.model.*;

/**
 * Interface for accessing AWS Application Cost Profiler asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationcostprofiler.AbstractAWSApplicationCostProfilerAsync} instead.
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
public interface AWSApplicationCostProfilerAsync extends AWSApplicationCostProfiler {

    /**
     * <p>
     * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being
     * generated.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     * @return A Java Future containing the result of the DeleteReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.DeleteReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/DeleteReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest deleteReportDefinitionRequest);

    /**
     * <p>
     * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being
     * generated.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.DeleteReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/DeleteReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest deleteReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReportDefinitionRequest, DeleteReportDefinitionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
     * </p>
     * 
     * @param getReportDefinitionRequest
     * @return A Java Future containing the result of the GetReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.GetReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/GetReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(GetReportDefinitionRequest getReportDefinitionRequest);

    /**
     * <p>
     * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
     * </p>
     * 
     * @param getReportDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.GetReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/GetReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReportDefinitionResult> getReportDefinitionAsync(GetReportDefinitionRequest getReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetReportDefinitionRequest, GetReportDefinitionResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportApplicationUsage operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.ImportApplicationUsage
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ImportApplicationUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(ImportApplicationUsageRequest importApplicationUsageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportApplicationUsage operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.ImportApplicationUsage
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ImportApplicationUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportApplicationUsageResult> importApplicationUsageAsync(ImportApplicationUsageRequest importApplicationUsageRequest,
            com.amazonaws.handlers.AsyncHandler<ImportApplicationUsageRequest, ImportApplicationUsageResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all reports and their configurations for your AWS account.
     * </p>
     * <p>
     * The maximum number of reports is one.
     * </p>
     * 
     * @param listReportDefinitionsRequest
     * @return A Java Future containing the result of the ListReportDefinitions operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.ListReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ListReportDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(ListReportDefinitionsRequest listReportDefinitionsRequest);

    /**
     * <p>
     * Retrieves a list of all reports and their configurations for your AWS account.
     * </p>
     * <p>
     * The maximum number of reports is one.
     * </p>
     * 
     * @param listReportDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReportDefinitions operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.ListReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ListReportDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReportDefinitionsResult> listReportDefinitionsAsync(ListReportDefinitionsRequest listReportDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReportDefinitionsRequest, ListReportDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Creates the report definition for a report in Application Cost Profiler.
     * </p>
     * 
     * @param putReportDefinitionRequest
     * @return A Java Future containing the result of the PutReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/PutReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest putReportDefinitionRequest);

    /**
     * <p>
     * Creates the report definition for a report in Application Cost Profiler.
     * </p>
     * 
     * @param putReportDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/PutReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest putReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<PutReportDefinitionRequest, PutReportDefinitionResult> asyncHandler);

    /**
     * <p>
     * Updates existing report in AWS Application Cost Profiler.
     * </p>
     * 
     * @param updateReportDefinitionRequest
     * @return A Java Future containing the result of the UpdateReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsync.UpdateReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/UpdateReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(UpdateReportDefinitionRequest updateReportDefinitionRequest);

    /**
     * <p>
     * Updates existing report in AWS Application Cost Profiler.
     * </p>
     * 
     * @param updateReportDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReportDefinition operation returned by the service.
     * @sample AWSApplicationCostProfilerAsyncHandler.UpdateReportDefinition
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/UpdateReportDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReportDefinitionResult> updateReportDefinitionAsync(UpdateReportDefinitionRequest updateReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReportDefinitionRequest, UpdateReportDefinitionResult> asyncHandler);

}
