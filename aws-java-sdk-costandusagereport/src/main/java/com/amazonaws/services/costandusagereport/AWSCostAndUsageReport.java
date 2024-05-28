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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.costandusagereport.model.*;

/**
 * Interface for accessing AWS Cost and Usage Report Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.costandusagereport.AbstractAWSCostAndUsageReport} instead.
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
public interface AWSCostAndUsageReport {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cur";

    /**
     * Overrides the default endpoint for this client ("cur.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cur.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "cur.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cur.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "cur.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCostAndUsageReport#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Deletes the specified report. Any tags associated with the report are also deleted.
     * </p>
     * 
     * @param deleteReportDefinitionRequest
     *        Deletes the specified report.
     * @return Result of the DeleteReportDefinition operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSCostAndUsageReport.DeleteReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DeleteReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReportDefinitionResult deleteReportDefinition(DeleteReportDefinitionRequest deleteReportDefinitionRequest);

    /**
     * <p>
     * Lists the Amazon Web Services Cost and Usage Report available to this account.
     * </p>
     * 
     * @param describeReportDefinitionsRequest
     *        Requests a Amazon Web Services Cost and Usage Report list owned by the account.
     * @return Result of the DescribeReportDefinitions operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @sample AWSCostAndUsageReport.DescribeReportDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DescribeReportDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeReportDefinitionsResult describeReportDefinitions(DescribeReportDefinitionsRequest describeReportDefinitionsRequest);

    /**
     * <p>
     * Lists the tags associated with the specified report definition.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified report (<code>ReportName</code>) in the request doesn't exist.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSCostAndUsageReport.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Allows you to programmatically update your report preferences.
     * </p>
     * 
     * @param modifyReportDefinitionRequest
     * @return Result of the ModifyReportDefinition operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSCostAndUsageReport.ModifyReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ModifyReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyReportDefinitionResult modifyReportDefinition(ModifyReportDefinitionRequest modifyReportDefinitionRequest);

    /**
     * <p>
     * Creates a new report using the description that you provide.
     * </p>
     * 
     * @param putReportDefinitionRequest
     *        Creates a Cost and Usage Report.
     * @return Result of the PutReportDefinition operation returned by the service.
     * @throws DuplicateReportNameException
     *         A report with the specified name already exists in the account. Specify a different report name.
     * @throws ReportLimitReachedException
     *         This account already has five reports defined. To define a new report, you must delete an existing
     *         report.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified report (<code>ReportName</code>) in the request doesn't exist.
     * @sample AWSCostAndUsageReport.PutReportDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/PutReportDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    PutReportDefinitionResult putReportDefinition(PutReportDefinitionRequest putReportDefinitionRequest);

    /**
     * <p>
     * Associates a set of tags with a report definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified report (<code>ReportName</code>) in the request doesn't exist.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSCostAndUsageReport.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates a set of tags from a report definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified report (<code>ReportName</code>) in the request doesn't exist.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSCostAndUsageReport.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/UntagResource" target="_top">AWS API
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
