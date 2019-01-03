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
package com.amazonaws.services.costandusagereport;

import javax.annotation.Generated;

import com.amazonaws.services.costandusagereport.model.*;

/**
 * Interface for accessing AWS Cost and Usage Report Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costandusagereport.AbstractAWSCostAndUsageReportAsync} instead.
 * </p>
 * <p>
 * All public APIs for AWS Cost and Usage Report service
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCostAndUsageReportAsync extends AWSCostAndUsageReport {

    /**
     * Delete a specified report definition
     * 
     * @param deleteReportDefinitionRequest
     *        Request of DeleteReportDefinition
     * @return A Java Future containing the result of the DeleteReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.DeleteReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DeleteReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest deleteReportDefinitionRequest);

    /**
     * Delete a specified report definition
     * 
     * @param deleteReportDefinitionRequest
     *        Request of DeleteReportDefinition
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.DeleteReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DeleteReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest deleteReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReportDefinitionRequest, DeleteReportDefinitionResult> asyncHandler);

    /**
     * Describe a list of report definitions owned by the account
     * 
     * @param describeReportDefinitionsRequest
     *        Request of DescribeReportDefinitions
     * @return A Java Future containing the result of the DescribeReportDefinitions operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.DescribeReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DescribeReportDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReportDefinitionsResult> describeReportDefinitionsAsync(
            DescribeReportDefinitionsRequest describeReportDefinitionsRequest);

    /**
     * Describe a list of report definitions owned by the account
     * 
     * @param describeReportDefinitionsRequest
     *        Request of DescribeReportDefinitions
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReportDefinitions operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.DescribeReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DescribeReportDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReportDefinitionsResult> describeReportDefinitionsAsync(
            DescribeReportDefinitionsRequest describeReportDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReportDefinitionsRequest, DescribeReportDefinitionsResult> asyncHandler);

    /**
     * Create a new report definition
     * 
     * @param putReportDefinitionRequest
     *        Request of PutReportDefinition
     * @return A Java Future containing the result of the PutReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/PutReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest putReportDefinitionRequest);

    /**
     * Create a new report definition
     * 
     * @param putReportDefinitionRequest
     *        Request of PutReportDefinition
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/PutReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest putReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<PutReportDefinitionRequest, PutReportDefinitionResult> asyncHandler);

}
