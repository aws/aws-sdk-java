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

import com.amazonaws.services.cloudtraildata.model.*;

/**
 * Interface for accessing AWS CloudTrail Data Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudtraildata.AbstractAWSCloudTrailDataAsync} instead.
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
public interface AWSCloudTrailDataAsync extends AWSCloudTrailData {

    /**
     * <p>
     * Ingests your application events into CloudTrail Lake. A required parameter, <code>auditEvents</code>, accepts the
     * JSON records (also called <i>payload</i>) of events that you want CloudTrail to ingest. You can add up to 100 of
     * these events (or up to 1 MB) per <code>PutAuditEvents</code> request.
     * </p>
     * 
     * @param putAuditEventsRequest
     * @return A Java Future containing the result of the PutAuditEvents operation returned by the service.
     * @sample AWSCloudTrailDataAsync.PutAuditEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/PutAuditEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAuditEventsResult> putAuditEventsAsync(PutAuditEventsRequest putAuditEventsRequest);

    /**
     * <p>
     * Ingests your application events into CloudTrail Lake. A required parameter, <code>auditEvents</code>, accepts the
     * JSON records (also called <i>payload</i>) of events that you want CloudTrail to ingest. You can add up to 100 of
     * these events (or up to 1 MB) per <code>PutAuditEvents</code> request.
     * </p>
     * 
     * @param putAuditEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAuditEvents operation returned by the service.
     * @sample AWSCloudTrailDataAsyncHandler.PutAuditEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/PutAuditEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAuditEventsResult> putAuditEventsAsync(PutAuditEventsRequest putAuditEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutAuditEventsRequest, PutAuditEventsResult> asyncHandler);

}
