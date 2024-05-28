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
package com.amazonaws.services.cloudtraildata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudtraildata.model.*;

/**
 * Interface for accessing AWS CloudTrail Data Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudtraildata.AbstractAWSCloudTrailData} instead.
 * </p>
 * <p>
 * <p>
 * The CloudTrail Data Service lets you ingest events into CloudTrail from any source in your hybrid environments, such
 * as in-house or SaaS applications hosted on-premises or in the cloud, virtual machines, or containers. You can store,
 * access, analyze, troubleshoot and take action on this data without maintaining multiple log aggregators and reporting
 * tools. After you run <code>PutAuditEvents</code> to ingest your application activity into CloudTrail, you can use
 * CloudTrail Lake to search, query, and analyze the data that is logged from your applications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudTrailData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudtrail-data";

    /**
     * <p>
     * Ingests your application events into CloudTrail Lake. A required parameter, <code>auditEvents</code>, accepts the
     * JSON records (also called <i>payload</i>) of events that you want CloudTrail to ingest. You can add up to 100 of
     * these events (or up to 1 MB) per <code>PutAuditEvents</code> request.
     * </p>
     * 
     * @param putAuditEventsRequest
     * @return Result of the PutAuditEvents operation returned by the service.
     * @throws ChannelInsufficientPermissionException
     *         The caller's account ID must be the same as the channel owner's account ID.
     * @throws ChannelNotFoundException
     *         The channel could not be found.
     * @throws InvalidChannelARNException
     *         The specified channel ARN is not a valid channel ARN.
     * @throws ChannelUnsupportedSchemaException
     *         The schema type of the event is not supported.
     * @throws DuplicatedAuditEventIdException
     *         Two or more entries in the request have the same event ID.
     * @throws UnsupportedOperationException
     *         The operation requested is not supported in this region or account.
     * @sample AWSCloudTrailData.PutAuditEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/PutAuditEvents" target="_top">AWS
     *      API Documentation</a>
     */
    PutAuditEventsResult putAuditEvents(PutAuditEventsRequest putAuditEventsRequest);

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
