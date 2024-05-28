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
 * <p>
 * You can use the Amazon Web Services Cost and Usage Report API to programmatically create, query, and delete Amazon
 * Web Services Cost and Usage Report definitions.
 * </p>
 * <p>
 * Amazon Web Services Cost and Usage Report track the monthly Amazon Web Services costs and usage associated with your
 * Amazon Web Services account. The report contains line items for each unique combination of Amazon Web Services
 * product, usage type, and operation that your Amazon Web Services account uses. You can configure the Amazon Web
 * Services Cost and Usage Report to show only the data that you want, using the Amazon Web Services Cost and Usage
 * Report API.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Amazon Web Services Cost and Usage Report API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * cur.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCostAndUsageReportAsync extends AWSCostAndUsageReport {

    /**
     * <p>
     * Deletes the specified report. Any tags associated with the report are also deleted.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     *        Deletes the specified report.
     * @return A Java Future containing the result of the DeleteReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.DeleteReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DeleteReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportDefinitionResult> deleteReportDefinitionAsync(DeleteReportDefinitionRequest deleteReportDefinitionRequest);

    /**
     * <p>
     * Deletes the specified report. Any tags associated with the report are also deleted.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     *        Deletes the specified report.
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
     * <p>
     * Lists the Amazon Web Services Cost and Usage Report available to this account.
     * </p>
     * 
     * @param describeReportDefinitionsRequest
     *        Requests a Amazon Web Services Cost and Usage Report list owned by the account.
     * @return A Java Future containing the result of the DescribeReportDefinitions operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.DescribeReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DescribeReportDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReportDefinitionsResult> describeReportDefinitionsAsync(
            DescribeReportDefinitionsRequest describeReportDefinitionsRequest);

    /**
     * <p>
     * Lists the Amazon Web Services Cost and Usage Report available to this account.
     * </p>
     * 
     * @param describeReportDefinitionsRequest
     *        Requests a Amazon Web Services Cost and Usage Report list owned by the account.
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
     * <p>
     * Lists the tags associated with the specified report definition.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags associated with the specified report definition.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Allows you to programmatically update your report preferences.
     * </p>
     * 
     * @param modifyReportDefinitionRequest
     * @return A Java Future containing the result of the ModifyReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.ModifyReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ModifyReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyReportDefinitionResult> modifyReportDefinitionAsync(ModifyReportDefinitionRequest modifyReportDefinitionRequest);

    /**
     * <p>
     * Allows you to programmatically update your report preferences.
     * </p>
     * 
     * @param modifyReportDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.ModifyReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ModifyReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyReportDefinitionResult> modifyReportDefinitionAsync(ModifyReportDefinitionRequest modifyReportDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReportDefinitionRequest, ModifyReportDefinitionResult> asyncHandler);

    /**
     * <p>
     * Creates a new report using the description that you provide.
     * </p>
     * 
     * @param putReportDefinitionRequest
     *        Creates a Cost and Usage Report.
     * @return A Java Future containing the result of the PutReportDefinition operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/PutReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutReportDefinitionResult> putReportDefinitionAsync(PutReportDefinitionRequest putReportDefinitionRequest);

    /**
     * <p>
     * Creates a new report using the description that you provide.
     * </p>
     * 
     * @param putReportDefinitionRequest
     *        Creates a Cost and Usage Report.
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

    /**
     * <p>
     * Associates a set of tags with a report definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of tags with a report definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates a set of tags from a report definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Disassociates a set of tags from a report definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCostAndUsageReportAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
