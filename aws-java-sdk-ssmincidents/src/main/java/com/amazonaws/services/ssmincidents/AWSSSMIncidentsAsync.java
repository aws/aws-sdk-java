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
package com.amazonaws.services.ssmincidents;

import javax.annotation.Generated;

import com.amazonaws.services.ssmincidents.model.*;

/**
 * Interface for accessing SSM Incidents asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmincidents.AbstractAWSSSMIncidentsAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Systems Manager Incident Manager is an incident management console designed to help users mitigate and recover
 * from incidents affecting their AWS-hosted applications. An incident is any unplanned interruption or reduction in
 * quality of services.
 * </p>
 * <p>
 * Incident Manager increases incident resolution by notifying responders of impact, highlighting relevant
 * troubleshooting data, and providing collaboration tools to get services back up and running. To achieve the primary
 * goal of reducing the time-to-resolution of critical incidents, Incident Manager automates response plans and enables
 * responder team escalation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSMIncidentsAsync extends AWSSSMIncidents {

    /**
     * <p>
     * A replication set replicates and encrypts your data to the provided Regions with the provided KMS key.
     * </p>
     * 
     * @param createReplicationSetRequest
     * @return A Java Future containing the result of the CreateReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsync.CreateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationSetResult> createReplicationSetAsync(CreateReplicationSetRequest createReplicationSetRequest);

    /**
     * <p>
     * A replication set replicates and encrypts your data to the provided Regions with the provided KMS key.
     * </p>
     * 
     * @param createReplicationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.CreateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationSetResult> createReplicationSetAsync(CreateReplicationSetRequest createReplicationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationSetRequest, CreateReplicationSetResult> asyncHandler);

    /**
     * <p>
     * Creates a response plan that automates the initial response to incidents. A response plan engages contacts,
     * starts chat channel collaboration, and initiates runbooks at the beginning of an incident.
     * </p>
     * 
     * @param createResponsePlanRequest
     * @return A Java Future containing the result of the CreateResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsync.CreateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResponsePlanResult> createResponsePlanAsync(CreateResponsePlanRequest createResponsePlanRequest);

    /**
     * <p>
     * Creates a response plan that automates the initial response to incidents. A response plan engages contacts,
     * starts chat channel collaboration, and initiates runbooks at the beginning of an incident.
     * </p>
     * 
     * @param createResponsePlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.CreateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResponsePlanResult> createResponsePlanAsync(CreateResponsePlanRequest createResponsePlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResponsePlanRequest, CreateResponsePlanResult> asyncHandler);

    /**
     * <p>
     * Creates a custom timeline event on the incident details page of an incident record. Timeline events are
     * automatically created by Incident Manager, marking key moment during an incident. You can create custom timeline
     * events to mark important events that are automatically detected by Incident Manager.
     * </p>
     * 
     * @param createTimelineEventRequest
     * @return A Java Future containing the result of the CreateTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsync.CreateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTimelineEventResult> createTimelineEventAsync(CreateTimelineEventRequest createTimelineEventRequest);

    /**
     * <p>
     * Creates a custom timeline event on the incident details page of an incident record. Timeline events are
     * automatically created by Incident Manager, marking key moment during an incident. You can create custom timeline
     * events to mark important events that are automatically detected by Incident Manager.
     * </p>
     * 
     * @param createTimelineEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.CreateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTimelineEventResult> createTimelineEventAsync(CreateTimelineEventRequest createTimelineEventRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTimelineEventRequest, CreateTimelineEventResult> asyncHandler);

    /**
     * <p>
     * Delete an incident record from Incident Manager.
     * </p>
     * 
     * @param deleteIncidentRecordRequest
     * @return A Java Future containing the result of the DeleteIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsync.DeleteIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIncidentRecordResult> deleteIncidentRecordAsync(DeleteIncidentRecordRequest deleteIncidentRecordRequest);

    /**
     * <p>
     * Delete an incident record from Incident Manager.
     * </p>
     * 
     * @param deleteIncidentRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.DeleteIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIncidentRecordResult> deleteIncidentRecordAsync(DeleteIncidentRecordRequest deleteIncidentRecordRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIncidentRecordRequest, DeleteIncidentRecordResult> asyncHandler);

    /**
     * <p>
     * Deletes all Regions in your replication set. Deleting the replication set deletes all Incident Manager data.
     * </p>
     * 
     * @param deleteReplicationSetRequest
     * @return A Java Future containing the result of the DeleteReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsync.DeleteReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationSetResult> deleteReplicationSetAsync(DeleteReplicationSetRequest deleteReplicationSetRequest);

    /**
     * <p>
     * Deletes all Regions in your replication set. Deleting the replication set deletes all Incident Manager data.
     * </p>
     * 
     * @param deleteReplicationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.DeleteReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationSetResult> deleteReplicationSetAsync(DeleteReplicationSetRequest deleteReplicationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationSetRequest, DeleteReplicationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource policy that AWS Resource Access Manager uses to share your Incident Manager resource.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSSMIncidentsAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the resource policy that AWS Resource Access Manager uses to share your Incident Manager resource.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified response plan. Deleting a response plan stops all linked CloudWatch alarms and EventBridge
     * events from creating an incident with this response plan.
     * </p>
     * 
     * @param deleteResponsePlanRequest
     * @return A Java Future containing the result of the DeleteResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsync.DeleteResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResponsePlanResult> deleteResponsePlanAsync(DeleteResponsePlanRequest deleteResponsePlanRequest);

    /**
     * <p>
     * Deletes the specified response plan. Deleting a response plan stops all linked CloudWatch alarms and EventBridge
     * events from creating an incident with this response plan.
     * </p>
     * 
     * @param deleteResponsePlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.DeleteResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResponsePlanResult> deleteResponsePlanAsync(DeleteResponsePlanRequest deleteResponsePlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResponsePlanRequest, DeleteResponsePlanResult> asyncHandler);

    /**
     * <p>
     * Deletes a timeline event from an incident.
     * </p>
     * 
     * @param deleteTimelineEventRequest
     * @return A Java Future containing the result of the DeleteTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsync.DeleteTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTimelineEventResult> deleteTimelineEventAsync(DeleteTimelineEventRequest deleteTimelineEventRequest);

    /**
     * <p>
     * Deletes a timeline event from an incident.
     * </p>
     * 
     * @param deleteTimelineEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.DeleteTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTimelineEventResult> deleteTimelineEventAsync(DeleteTimelineEventRequest deleteTimelineEventRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTimelineEventRequest, DeleteTimelineEventResult> asyncHandler);

    /**
     * <p>
     * Returns the details of the specified incident record.
     * </p>
     * 
     * @param getIncidentRecordRequest
     * @return A Java Future containing the result of the GetIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsync.GetIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIncidentRecordResult> getIncidentRecordAsync(GetIncidentRecordRequest getIncidentRecordRequest);

    /**
     * <p>
     * Returns the details of the specified incident record.
     * </p>
     * 
     * @param getIncidentRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.GetIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIncidentRecordResult> getIncidentRecordAsync(GetIncidentRecordRequest getIncidentRecordRequest,
            com.amazonaws.handlers.AsyncHandler<GetIncidentRecordRequest, GetIncidentRecordResult> asyncHandler);

    /**
     * <p>
     * Retrieve your Incident Manager replication set.
     * </p>
     * 
     * @param getReplicationSetRequest
     * @return A Java Future containing the result of the GetReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsync.GetReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationSetResult> getReplicationSetAsync(GetReplicationSetRequest getReplicationSetRequest);

    /**
     * <p>
     * Retrieve your Incident Manager replication set.
     * </p>
     * 
     * @param getReplicationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.GetReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationSetResult> getReplicationSetAsync(GetReplicationSetRequest getReplicationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationSetRequest, GetReplicationSetResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified response plan.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return A Java Future containing the result of the GetResourcePolicies operation returned by the service.
     * @sample AWSSSMIncidentsAsync.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResourcePolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified response plan.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicies operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResourcePolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest getResourcePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of the specified response plan.
     * </p>
     * 
     * @param getResponsePlanRequest
     * @return A Java Future containing the result of the GetResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsync.GetResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResponsePlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResponsePlanResult> getResponsePlanAsync(GetResponsePlanRequest getResponsePlanRequest);

    /**
     * <p>
     * Retrieves the details of the specified response plan.
     * </p>
     * 
     * @param getResponsePlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.GetResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResponsePlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResponsePlanResult> getResponsePlanAsync(GetResponsePlanRequest getResponsePlanRequest,
            com.amazonaws.handlers.AsyncHandler<GetResponsePlanRequest, GetResponsePlanResult> asyncHandler);

    /**
     * <p>
     * Retrieves a timeline event based on its ID and incident record.
     * </p>
     * 
     * @param getTimelineEventRequest
     * @return A Java Future containing the result of the GetTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsync.GetTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetTimelineEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTimelineEventResult> getTimelineEventAsync(GetTimelineEventRequest getTimelineEventRequest);

    /**
     * <p>
     * Retrieves a timeline event based on its ID and incident record.
     * </p>
     * 
     * @param getTimelineEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.GetTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetTimelineEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTimelineEventResult> getTimelineEventAsync(GetTimelineEventRequest getTimelineEventRequest,
            com.amazonaws.handlers.AsyncHandler<GetTimelineEventRequest, GetTimelineEventResult> asyncHandler);

    /**
     * <p>
     * Lists all incident records in your account. Use this command to retrieve the Amazon Resource Name (ARN) of the
     * incident record you want to update.
     * </p>
     * 
     * @param listIncidentRecordsRequest
     * @return A Java Future containing the result of the ListIncidentRecords operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListIncidentRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListIncidentRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIncidentRecordsResult> listIncidentRecordsAsync(ListIncidentRecordsRequest listIncidentRecordsRequest);

    /**
     * <p>
     * Lists all incident records in your account. Use this command to retrieve the Amazon Resource Name (ARN) of the
     * incident record you want to update.
     * </p>
     * 
     * @param listIncidentRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIncidentRecords operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListIncidentRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListIncidentRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIncidentRecordsResult> listIncidentRecordsAsync(ListIncidentRecordsRequest listIncidentRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIncidentRecordsRequest, ListIncidentRecordsResult> asyncHandler);

    /**
     * <p>
     * List all related items for an incident record.
     * </p>
     * 
     * @param listRelatedItemsRequest
     * @return A Java Future containing the result of the ListRelatedItems operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListRelatedItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRelatedItemsResult> listRelatedItemsAsync(ListRelatedItemsRequest listRelatedItemsRequest);

    /**
     * <p>
     * List all related items for an incident record.
     * </p>
     * 
     * @param listRelatedItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRelatedItems operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListRelatedItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRelatedItemsResult> listRelatedItemsAsync(ListRelatedItemsRequest listRelatedItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRelatedItemsRequest, ListRelatedItemsResult> asyncHandler);

    /**
     * <p>
     * Lists details about the replication set configured in your account.
     * </p>
     * 
     * @param listReplicationSetsRequest
     * @return A Java Future containing the result of the ListReplicationSets operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListReplicationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListReplicationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReplicationSetsResult> listReplicationSetsAsync(ListReplicationSetsRequest listReplicationSetsRequest);

    /**
     * <p>
     * Lists details about the replication set configured in your account.
     * </p>
     * 
     * @param listReplicationSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReplicationSets operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListReplicationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListReplicationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReplicationSetsResult> listReplicationSetsAsync(ListReplicationSetsRequest listReplicationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReplicationSetsRequest, ListReplicationSetsResult> asyncHandler);

    /**
     * <p>
     * Lists all response plans in your account.
     * </p>
     * 
     * @param listResponsePlansRequest
     * @return A Java Future containing the result of the ListResponsePlans operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListResponsePlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListResponsePlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResponsePlansResult> listResponsePlansAsync(ListResponsePlansRequest listResponsePlansRequest);

    /**
     * <p>
     * Lists all response plans in your account.
     * </p>
     * 
     * @param listResponsePlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResponsePlans operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListResponsePlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListResponsePlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResponsePlansResult> listResponsePlansAsync(ListResponsePlansRequest listResponsePlansRequest,
            com.amazonaws.handlers.AsyncHandler<ListResponsePlansRequest, ListResponsePlansResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that are attached to the specified response plan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that are attached to the specified response plan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists timeline events of the specified incident record.
     * </p>
     * 
     * @param listTimelineEventsRequest
     * @return A Java Future containing the result of the ListTimelineEvents operation returned by the service.
     * @sample AWSSSMIncidentsAsync.ListTimelineEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTimelineEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTimelineEventsResult> listTimelineEventsAsync(ListTimelineEventsRequest listTimelineEventsRequest);

    /**
     * <p>
     * Lists timeline events of the specified incident record.
     * </p>
     * 
     * @param listTimelineEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTimelineEvents operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.ListTimelineEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTimelineEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTimelineEventsResult> listTimelineEventsAsync(ListTimelineEventsRequest listTimelineEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTimelineEventsRequest, ListTimelineEventsResult> asyncHandler);

    /**
     * <p>
     * Adds a resource policy to the specified response plan.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSSMIncidentsAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Adds a resource policy to the specified response plan.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Used to start an incident from CloudWatch alarms, EventBridge events, or manually.
     * </p>
     * 
     * @param startIncidentRequest
     * @return A Java Future containing the result of the StartIncident operation returned by the service.
     * @sample AWSSSMIncidentsAsync.StartIncident
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/StartIncident" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartIncidentResult> startIncidentAsync(StartIncidentRequest startIncidentRequest);

    /**
     * <p>
     * Used to start an incident from CloudWatch alarms, EventBridge events, or manually.
     * </p>
     * 
     * @param startIncidentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartIncident operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.StartIncident
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/StartIncident" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartIncidentResult> startIncidentAsync(StartIncidentRequest startIncidentRequest,
            com.amazonaws.handlers.AsyncHandler<StartIncidentRequest, StartIncidentResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a response plan.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSMIncidentsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a response plan.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update deletion protection to either allow or deny deletion of the final Region in a replication set.
     * </p>
     * 
     * @param updateDeletionProtectionRequest
     * @return A Java Future containing the result of the UpdateDeletionProtection operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateDeletionProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateDeletionProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeletionProtectionResult> updateDeletionProtectionAsync(UpdateDeletionProtectionRequest updateDeletionProtectionRequest);

    /**
     * <p>
     * Update deletion protection to either allow or deny deletion of the final Region in a replication set.
     * </p>
     * 
     * @param updateDeletionProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeletionProtection operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateDeletionProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateDeletionProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeletionProtectionResult> updateDeletionProtectionAsync(UpdateDeletionProtectionRequest updateDeletionProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeletionProtectionRequest, UpdateDeletionProtectionResult> asyncHandler);

    /**
     * <p>
     * Update the details of an incident record. You can use this action to update an incident record from the defined
     * chat channel. For more information about using actions in chat channels, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/chat.html#chat-interact">Interacting through
     * chat</a>.
     * </p>
     * 
     * @param updateIncidentRecordRequest
     * @return A Java Future containing the result of the UpdateIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIncidentRecordResult> updateIncidentRecordAsync(UpdateIncidentRecordRequest updateIncidentRecordRequest);

    /**
     * <p>
     * Update the details of an incident record. You can use this action to update an incident record from the defined
     * chat channel. For more information about using actions in chat channels, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/chat.html#chat-interact">Interacting through
     * chat</a>.
     * </p>
     * 
     * @param updateIncidentRecordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIncidentRecord operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIncidentRecordResult> updateIncidentRecordAsync(UpdateIncidentRecordRequest updateIncidentRecordRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIncidentRecordRequest, UpdateIncidentRecordResult> asyncHandler);

    /**
     * <p>
     * Add or remove related items from the related items tab of an incident record.
     * </p>
     * 
     * @param updateRelatedItemsRequest
     * @return A Java Future containing the result of the UpdateRelatedItems operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelatedItemsResult> updateRelatedItemsAsync(UpdateRelatedItemsRequest updateRelatedItemsRequest);

    /**
     * <p>
     * Add or remove related items from the related items tab of an incident record.
     * </p>
     * 
     * @param updateRelatedItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRelatedItems operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRelatedItemsResult> updateRelatedItemsAsync(UpdateRelatedItemsRequest updateRelatedItemsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRelatedItemsRequest, UpdateRelatedItemsResult> asyncHandler);

    /**
     * <p>
     * Add or delete Regions from your replication set.
     * </p>
     * 
     * @param updateReplicationSetRequest
     * @return A Java Future containing the result of the UpdateReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationSetResult> updateReplicationSetAsync(UpdateReplicationSetRequest updateReplicationSetRequest);

    /**
     * <p>
     * Add or delete Regions from your replication set.
     * </p>
     * 
     * @param updateReplicationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationSet operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationSetResult> updateReplicationSetAsync(UpdateReplicationSetRequest updateReplicationSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationSetRequest, UpdateReplicationSetResult> asyncHandler);

    /**
     * <p>
     * Updates the specified response plan.
     * </p>
     * 
     * @param updateResponsePlanRequest
     * @return A Java Future containing the result of the UpdateResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResponsePlanResult> updateResponsePlanAsync(UpdateResponsePlanRequest updateResponsePlanRequest);

    /**
     * <p>
     * Updates the specified response plan.
     * </p>
     * 
     * @param updateResponsePlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResponsePlan operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResponsePlanResult> updateResponsePlanAsync(UpdateResponsePlanRequest updateResponsePlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResponsePlanRequest, UpdateResponsePlanResult> asyncHandler);

    /**
     * <p>
     * Updates a timeline event. You can update events of type <code>Custom Event</code>.
     * </p>
     * 
     * @param updateTimelineEventRequest
     * @return A Java Future containing the result of the UpdateTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsync.UpdateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTimelineEventResult> updateTimelineEventAsync(UpdateTimelineEventRequest updateTimelineEventRequest);

    /**
     * <p>
     * Updates a timeline event. You can update events of type <code>Custom Event</code>.
     * </p>
     * 
     * @param updateTimelineEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTimelineEvent operation returned by the service.
     * @sample AWSSSMIncidentsAsyncHandler.UpdateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTimelineEventResult> updateTimelineEventAsync(UpdateTimelineEventRequest updateTimelineEventRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTimelineEventRequest, UpdateTimelineEventResult> asyncHandler);

}
