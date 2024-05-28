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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pi.model.*;

/**
 * Interface for accessing AWS PI.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pi.AbstractAWSPI} instead.
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
public interface AWSPI {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pi";

    /**
     * <p>
     * Creates a new performance analysis report for a specific time period for the DB instance.
     * </p>
     * 
     * @param createPerformanceAnalysisReportRequest
     * @return Result of the CreatePerformanceAnalysisReport operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.CreatePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/CreatePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePerformanceAnalysisReportResult createPerformanceAnalysisReport(CreatePerformanceAnalysisReportRequest createPerformanceAnalysisReportRequest);

    /**
     * <p>
     * Deletes a performance analysis report.
     * </p>
     * 
     * @param deletePerformanceAnalysisReportRequest
     * @return Result of the DeletePerformanceAnalysisReport operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.DeletePerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DeletePerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePerformanceAnalysisReportResult deletePerformanceAnalysisReport(DeletePerformanceAnalysisReportRequest deletePerformanceAnalysisReportRequest);

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
     * @return Result of the DescribeDimensionKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.DescribeDimensionKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDimensionKeysResult describeDimensionKeys(DescribeDimensionKeysRequest describeDimensionKeysRequest);

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
     * @return Result of the GetDimensionKeyDetails operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetDimensionKeyDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetDimensionKeyDetails" target="_top">AWS API
     *      Documentation</a>
     */
    GetDimensionKeyDetailsResult getDimensionKeyDetails(GetDimensionKeyDetailsRequest getDimensionKeyDetailsRequest);

    /**
     * <p>
     * Retrieves the report including the report ID, status, time details, and the insights with recommendations. The
     * report status can be <code>RUNNING</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>. The insights include
     * the <code>description</code> and <code>recommendation</code> fields.
     * </p>
     * 
     * @param getPerformanceAnalysisReportRequest
     * @return Result of the GetPerformanceAnalysisReport operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetPerformanceAnalysisReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetPerformanceAnalysisReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetPerformanceAnalysisReportResult getPerformanceAnalysisReport(GetPerformanceAnalysisReportRequest getPerformanceAnalysisReportRequest);

    /**
     * <p>
     * Retrieve the metadata for different features. For example, the metadata might indicate that a feature is turned
     * on or off on a specific DB instance.
     * </p>
     * 
     * @param getResourceMetadataRequest
     * @return Result of the GetResourceMetadata operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceMetadataResult getResourceMetadata(GetResourceMetadataRequest getResourceMetadataRequest);

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
     * @return Result of the GetResourceMetrics operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.GetResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceMetricsResult getResourceMetrics(GetResourceMetricsRequest getResourceMetricsRequest);

    /**
     * <p>
     * Retrieve the dimensions that can be queried for each specified metric type on a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceDimensionsRequest
     * @return Result of the ListAvailableResourceDimensions operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.ListAvailableResourceDimensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceDimensions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableResourceDimensionsResult listAvailableResourceDimensions(ListAvailableResourceDimensionsRequest listAvailableResourceDimensionsRequest);

    /**
     * <p>
     * Retrieve metrics of the specified types that can be queried for a specified DB instance.
     * </p>
     * 
     * @param listAvailableResourceMetricsRequest
     * @return Result of the ListAvailableResourceMetrics operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.ListAvailableResourceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableResourceMetricsResult listAvailableResourceMetrics(ListAvailableResourceMetricsRequest listAvailableResourceMetricsRequest);

    /**
     * <p>
     * Lists all the analysis reports created for the DB instance. The reports are sorted based on the start time of
     * each report.
     * </p>
     * 
     * @param listPerformanceAnalysisReportsRequest
     * @return Result of the ListPerformanceAnalysisReports operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.ListPerformanceAnalysisReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListPerformanceAnalysisReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListPerformanceAnalysisReportsResult listPerformanceAnalysisReports(ListPerformanceAnalysisReportsRequest listPerformanceAnalysisReportsRequest);

    /**
     * <p>
     * Retrieves all the metadata tags associated with Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds metadata tags to the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes the metadata tags from the Amazon RDS Performance Insights resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         One of the arguments provided is invalid for this request.
     * @throws InternalServiceErrorException
     *         The request failed due to an unknown error.
     * @throws NotAuthorizedException
     *         The user is not authorized to perform this request.
     * @sample AWSPI.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
