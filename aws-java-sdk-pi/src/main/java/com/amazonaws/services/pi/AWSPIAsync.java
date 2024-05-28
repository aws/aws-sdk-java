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
package com.amazonaws.services.pi;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;

/**
 * Interface for accessing AWS PI asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pi.AbstractAWSPIAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon RDS Performance Insights</fullname>
 * <p>
 * Amazon RDS Performance Insights enables you to monitor and explore different dimensions of database load based on
 * data captured from a running DB instance. The guide provides detailed information about Performance Insights data
 * types, parameters and errors.
 * </p>
 * <p>
 * When Performance Insights is enabled, the Amazon RDS Performance Insights API provides visibility into the
 * performance of your DB instance. Amazon CloudWatch provides the authoritative source for Amazon Web Services
 * service-vended monitoring metrics. Performance Insights offers a domain-specific view of DB load.
 * </p>
 * <p>
 * DB load is measured as average active sessions. Performance Insights provides the data to API consumers as a
 * two-dimensional time-series dataset. The time dimension provides DB load data for each time point in the queried time
 * range. Each time point decomposes overall load in relation to the requested dimensions, measured at that time point.
 * Examples include SQL, Wait event, User, and Host.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon Aurora DB instances, go to the <i> <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PerfInsights.html"> Amazon Aurora User
 * Guide</a> </i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon RDS DB instances, go to the <i> <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Amazon RDS User Guide</a> </i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * To learn more about Performance Insights and Amazon DocumentDB clusters, go to the <i> <a
 * href="https://docs.aws.amazon.com/documentdb/latest/developerguide/performance-insights.html"> Amazon DocumentDB
 * Developer Guide</a> </i>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPIAsync extends AWSPI {

    /**
     * <p>
     * Creates a new performance analysis report for a specific time period for the DB instance.
     * </p>
     * 
     * @param createPerformanceAnalysisReportRequest
     * @return A Java Future containing the result of the CreatePerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsync.CreatePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/CreatePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePerformanceAnalysisReportResult> createPerformanceAnalysisReportAsync(
            CreatePerformanceAnalysisReportRequest createPerformanceAnalysisReportRequest);

    /**
     * <p>
     * Creates a new performance analysis report for a specific time period for the DB instance.
     * </p>
     * 
     * @param createPerformanceAnalysisReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.CreatePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/CreatePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePerformanceAnalysisReportResult> createPerformanceAnalysisReportAsync(
            CreatePerformanceAnalysisReportRequest createPerformanceAnalysisReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePerformanceAnalysisReportRequest, CreatePerformanceAnalysisReportResult> asyncHandler);

    /**
     * <p>
     * Deletes a performance analysis report.
     * </p>
     * 
     * @param deletePerformanceAnalysisReportRequest
     * @return A Java Future containing the result of the DeletePerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsync.DeletePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DeletePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePerformanceAnalysisReportResult> deletePerformanceAnalysisReportAsync(
            DeletePerformanceAnalysisReportRequest deletePerformanceAnalysisReportRequest);

    /**
     * <p>
     * Deletes a performance analysis report.
     * </p>
     * 
     * @param deletePerformanceAnalysisReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.DeletePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DeletePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePerformanceAnalysisReportResult> deletePerformanceAnalysisReportAsync(
            DeletePerformanceAnalysisReportRequest deletePerformanceAnalysisReportRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePerformanceAnalysisReportRequest, DeletePerformanceAnalysisReportResult> asyncHandler);

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param describeDimensionKeysRequest
     * @return A Java Future containing the result of the DescribeDimensionKeys operation returned by the service.
     * @sample AWSPIAsync.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest describeDimensionKeysRequest);

    /**
     * <p>
     * For a specific time period, retrieve the top <code>N</code> dimension keys for a metric.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param describeDimensionKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDimensionKeys operation returned by the service.
     * @sample AWSPIAsyncHandler.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest describeDimensionKeysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDimensionKeysRequest, DescribeDimensionKeysResult> asyncHandler);

    /**
     * <p>
     * Get the attributes of the specified dimension group for a DB instance or data source. For example, if you specify
     * a SQL ID, <code>GetDimensionKeyDetails</code> retrieves the full text of the dimension
     * <code>db.sql.statement</code> associated with this ID. This operation is useful because
     * <code>GetResourceMetrics</code> and <code>DescribeDimensionKeys</code> don't support retrieval of large SQL
     * statement text.
     * </p>
     * 
     * @param getDimensionKeyDetailsRequest
     * @return A Java Future containing the result of the GetDimensionKeyDetails operation returned by the service.
     * @sample AWSPIAsync.GetDimensionKeyDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetDimensionKeyDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDimensionKeyDetailsResult> getDimensionKeyDetailsAsync(GetDimensionKeyDetailsRequest getDimensionKeyDetailsRequest);

    /**
     * <p>
     * Get the attributes of the specified dimension group for a DB instance or data source. For example, if you specify
     * a SQL ID, <code>GetDimensionKeyDetails</code> retrieves the full text of the dimension
     * <code>db.sql.statement</code> associated with this ID. This operation is useful because
     * <code>GetResourceMetrics</code> and <code>DescribeDimensionKeys</code> don't support retrieval of large SQL
     * statement text.
     * </p>
     * 
     * @param getDimensionKeyDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDimensionKeyDetails operation returned by the service.
     * @sample AWSPIAsyncHandler.GetDimensionKeyDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetDimensionKeyDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDimensionKeyDetailsResult> getDimensionKeyDetailsAsync(GetDimensionKeyDetailsRequest getDimensionKeyDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDimensionKeyDetailsRequest, GetDimensionKeyDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the report including the report ID, status, time details, and the insights with recommendations. The
     * report status can be <code>RUNNING</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>. The insights include
     * the <code>description</code> and <code>recommendation</code> fields.
     * </p>
     * 
     * @param getPerformanceAnalysisReportRequest
     * @return A Java Future containing the result of the GetPerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsync.GetPerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetPerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPerformanceAnalysisReportResult> getPerformanceAnalysisReportAsync(
            GetPerformanceAnalysisReportRequest getPerformanceAnalysisReportRequest);

    /**
     * <p>
     * Retrieves the report including the report ID, status, time details, and the insights with recommendations. The
     * report status can be <code>RUNNING</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>. The insights include
     * the <code>description</code> and <code>recommendation</code> fields.
     * </p>
     * 
     * @param getPerformanceAnalysisReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPerformanceAnalysisReport operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.GetPerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetPerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPerformanceAnalysisReportResult> getPerformanceAnalysisReportAsync(
            GetPerformanceAnalysisReportRequest getPerformanceAnalysisReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetPerformanceAnalysisReportRequest, GetPerformanceAnalysisReportResult> asyncHandler);

    /**
     * <p>
     * Retrieve the metadata for different features. For example, the metadata might indicate that a feature is turned
     * on or off on a specific DB instance.
     * </p>
     * 
     * @param getResourceMetadataRequest
     * @return A Java Future containing the result of the GetResourceMetadata operation returned by the service.
     * @sample AWSPIAsync.GetResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetadataResult> getResourceMetadataAsync(GetResourceMetadataRequest getResourceMetadataRequest);

    /**
     * <p>
     * Retrieve the metadata for different features. For example, the metadata might indicate that a feature is turned
     * on or off on a specific DB instance.
     * </p>
     * 
     * @param getResourceMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceMetadata operation returned by the service.
     * @sample AWSPIAsyncHandler.GetResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetadataResult> getResourceMetadataAsync(GetResourceMetadataRequest getResourceMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceMetadataRequest, GetResourceMetadataResult> asyncHandler);

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources over a time period. You can provide specific
     * dimension groups and dimensions, and provide filtering criteria for each group. You must specify an aggregate
     * function for each metric.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param getResourceMetricsRequest
     * @return A Java Future containing the result of the GetResourceMetrics operation returned by the service.
     * @sample AWSPIAsync.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest getResourceMetricsRequest);

    /**
     * <p>
     * Retrieve Performance Insights metrics for a set of data sources over a time period. You can provide specific
     * dimension groups and dimensions, and provide filtering criteria for each group. You must specify an aggregate
     * function for each metric.
     * </p>
     * <note>
     * <p>
     * Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first
     * 500 bytes are returned.
     * </p>
     * </note>
     * 
     * @param getResourceMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceMetrics operation returned by the service.
     * @sample AWSPIAsyncHandler.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest getResourceMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceMetricsRequest, GetResourceMetricsResult> asyncHandler);

    /**
     * <p>
     * Retrieve the dimensions that can be queried for each specified metric type on a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceDimensionsRequest
     * @return A Java Future containing the result of the ListAvailableResourceDimensions operation returned by the
     *         service.
     * @sample AWSPIAsync.ListAvailableResourceDimensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceDimensions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableResourceDimensionsResult> listAvailableResourceDimensionsAsync(
            ListAvailableResourceDimensionsRequest listAvailableResourceDimensionsRequest);

    /**
     * <p>
     * Retrieve the dimensions that can be queried for each specified metric type on a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceDimensionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableResourceDimensions operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.ListAvailableResourceDimensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceDimensions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableResourceDimensionsResult> listAvailableResourceDimensionsAsync(
            ListAvailableResourceDimensionsRequest listAvailableResourceDimensionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableResourceDimensionsRequest, ListAvailableResourceDimensionsResult> asyncHandler);

    /**
     * <p>
     * Retrieve metrics of the specified types that can be queried for a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceMetricsRequest
     * @return A Java Future containing the result of the ListAvailableResourceMetrics operation returned by the
     *         service.
     * @sample AWSPIAsync.ListAvailableResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableResourceMetricsResult> listAvailableResourceMetricsAsync(
            ListAvailableResourceMetricsRequest listAvailableResourceMetricsRequest);

    /**
     * <p>
     * Retrieve metrics of the specified types that can be queried for a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableResourceMetrics operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.ListAvailableResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableResourceMetricsResult> listAvailableResourceMetricsAsync(
            ListAvailableResourceMetricsRequest listAvailableResourceMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableResourceMetricsRequest, ListAvailableResourceMetricsResult> asyncHandler);

    /**
     * <p>
     * Lists all the analysis reports created for the DB instance. The reports are sorted based on the start time of
     * each report.
     * </p>
     * 
     * @param listPerformanceAnalysisReportsRequest
     * @return A Java Future containing the result of the ListPerformanceAnalysisReports operation returned by the
     *         service.
     * @sample AWSPIAsync.ListPerformanceAnalysisReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListPerformanceAnalysisReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPerformanceAnalysisReportsResult> listPerformanceAnalysisReportsAsync(
            ListPerformanceAnalysisReportsRequest listPerformanceAnalysisReportsRequest);

    /**
     * <p>
     * Lists all the analysis reports created for the DB instance. The reports are sorted based on the start time of
     * each report.
     * </p>
     * 
     * @param listPerformanceAnalysisReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPerformanceAnalysisReports operation returned by the
     *         service.
     * @sample AWSPIAsyncHandler.ListPerformanceAnalysisReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListPerformanceAnalysisReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPerformanceAnalysisReportsResult> listPerformanceAnalysisReportsAsync(
            ListPerformanceAnalysisReportsRequest listPerformanceAnalysisReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPerformanceAnalysisReportsRequest, ListPerformanceAnalysisReportsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all the metadata tags associated with Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPIAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves all the metadata tags associated with Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPIAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPIAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPIAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the metadata tags from the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPIAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the metadata tags from the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPIAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
