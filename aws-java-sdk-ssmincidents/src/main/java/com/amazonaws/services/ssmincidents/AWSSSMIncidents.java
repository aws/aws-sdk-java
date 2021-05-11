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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.services.ssmincidents.waiters.AWSSSMIncidentsWaiters;

/**
 * Interface for accessing SSM Incidents.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssmincidents.AbstractAWSSSMIncidents} instead.
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
public interface AWSSSMIncidents {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ssm-incidents";

    /**
     * <p>
     * A replication set replicates and encrypts your data to the provided Regions with the provided KMS key.
     * </p>
     * 
     * @param createReplicationSetRequest
     * @return Result of the CreateReplicationSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.CreateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReplicationSetResult createReplicationSet(CreateReplicationSetRequest createReplicationSetRequest);

    /**
     * <p>
     * Creates a response plan that automates the initial response to incidents. A response plan engages contacts,
     * starts chat channel collaboration, and initiates runbooks at the beginning of an incident.
     * </p>
     * 
     * @param createResponsePlanRequest
     * @return Result of the CreateResponsePlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.CreateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResponsePlanResult createResponsePlan(CreateResponsePlanRequest createResponsePlanRequest);

    /**
     * <p>
     * Creates a custom timeline event on the incident details page of an incident record. Timeline events are
     * automatically created by Incident Manager, marking key moment during an incident. You can create custom timeline
     * events to mark important events that are automatically detected by Incident Manager.
     * </p>
     * 
     * @param createTimelineEventRequest
     * @return Result of the CreateTimelineEvent operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.CreateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTimelineEventResult createTimelineEvent(CreateTimelineEventRequest createTimelineEventRequest);

    /**
     * <p>
     * Delete an incident record from Incident Manager.
     * </p>
     * 
     * @param deleteIncidentRecordRequest
     * @return Result of the DeleteIncidentRecord operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.DeleteIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIncidentRecordResult deleteIncidentRecord(DeleteIncidentRecordRequest deleteIncidentRecordRequest);

    /**
     * <p>
     * Deletes all Regions in your replication set. Deleting the replication set deletes all Incident Manager data.
     * </p>
     * 
     * @param deleteReplicationSetRequest
     * @return Result of the DeleteReplicationSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.DeleteReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReplicationSetResult deleteReplicationSet(DeleteReplicationSetRequest deleteReplicationSetRequest);

    /**
     * <p>
     * Deletes the resource policy that AWS Resource Access Manager uses to share your Incident Manager resource.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the specified response plan. Deleting a response plan stops all linked CloudWatch alarms and EventBridge
     * events from creating an incident with this response plan.
     * </p>
     * 
     * @param deleteResponsePlanRequest
     * @return Result of the DeleteResponsePlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.DeleteResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResponsePlanResult deleteResponsePlan(DeleteResponsePlanRequest deleteResponsePlanRequest);

    /**
     * <p>
     * Deletes a timeline event from an incident.
     * </p>
     * 
     * @param deleteTimelineEventRequest
     * @return Result of the DeleteTimelineEvent operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.DeleteTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTimelineEventResult deleteTimelineEvent(DeleteTimelineEventRequest deleteTimelineEventRequest);

    /**
     * <p>
     * Returns the details of the specified incident record.
     * </p>
     * 
     * @param getIncidentRecordRequest
     * @return Result of the GetIncidentRecord operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.GetIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    GetIncidentRecordResult getIncidentRecord(GetIncidentRecordRequest getIncidentRecordRequest);

    /**
     * <p>
     * Retrieve your Incident Manager replication set.
     * </p>
     * 
     * @param getReplicationSetRequest
     * @return Result of the GetReplicationSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.GetReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetReplicationSetResult getReplicationSet(GetReplicationSetRequest getReplicationSetRequest);

    /**
     * <p>
     * Retrieves the resource policies attached to the specified response plan.
     * </p>
     * 
     * @param getResourcePoliciesRequest
     * @return Result of the GetResourcePolicies operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.GetResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResourcePolicies"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePoliciesResult getResourcePolicies(GetResourcePoliciesRequest getResourcePoliciesRequest);

    /**
     * <p>
     * Retrieves the details of the specified response plan.
     * </p>
     * 
     * @param getResponsePlanRequest
     * @return Result of the GetResponsePlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.GetResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetResponsePlan" target="_top">AWS
     *      API Documentation</a>
     */
    GetResponsePlanResult getResponsePlan(GetResponsePlanRequest getResponsePlanRequest);

    /**
     * <p>
     * Retrieves a timeline event based on its ID and incident record.
     * </p>
     * 
     * @param getTimelineEventRequest
     * @return Result of the GetTimelineEvent operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.GetTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/GetTimelineEvent" target="_top">AWS
     *      API Documentation</a>
     */
    GetTimelineEventResult getTimelineEvent(GetTimelineEventRequest getTimelineEventRequest);

    /**
     * <p>
     * Lists all incident records in your account. Use this command to retrieve the Amazon Resource Name (ARN) of the
     * incident record you want to update.
     * </p>
     * 
     * @param listIncidentRecordsRequest
     * @return Result of the ListIncidentRecords operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListIncidentRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListIncidentRecords"
     *      target="_top">AWS API Documentation</a>
     */
    ListIncidentRecordsResult listIncidentRecords(ListIncidentRecordsRequest listIncidentRecordsRequest);

    /**
     * <p>
     * List all related items for an incident record.
     * </p>
     * 
     * @param listRelatedItemsRequest
     * @return Result of the ListRelatedItems operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListRelatedItems" target="_top">AWS
     *      API Documentation</a>
     */
    ListRelatedItemsResult listRelatedItems(ListRelatedItemsRequest listRelatedItemsRequest);

    /**
     * <p>
     * Lists details about the replication set configured in your account.
     * </p>
     * 
     * @param listReplicationSetsRequest
     * @return Result of the ListReplicationSets operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListReplicationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListReplicationSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListReplicationSetsResult listReplicationSets(ListReplicationSetsRequest listReplicationSetsRequest);

    /**
     * <p>
     * Lists all response plans in your account.
     * </p>
     * 
     * @param listResponsePlansRequest
     * @return Result of the ListResponsePlans operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListResponsePlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListResponsePlans"
     *      target="_top">AWS API Documentation</a>
     */
    ListResponsePlansResult listResponsePlans(ListResponsePlansRequest listResponsePlansRequest);

    /**
     * <p>
     * Lists the tags that are attached to the specified response plan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists timeline events of the specified incident record.
     * </p>
     * 
     * @param listTimelineEventsRequest
     * @return Result of the ListTimelineEvents operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.ListTimelineEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTimelineEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListTimelineEventsResult listTimelineEvents(ListTimelineEventsRequest listTimelineEventsRequest);

    /**
     * <p>
     * Adds a resource policy to the specified response plan.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Used to start an incident from CloudWatch alarms, EventBridge events, or manually.
     * </p>
     * 
     * @param startIncidentRequest
     * @return Result of the StartIncident operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.StartIncident
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/StartIncident" target="_top">AWS
     *      API Documentation</a>
     */
    StartIncidentResult startIncident(StartIncidentRequest startIncidentRequest);

    /**
     * <p>
     * Adds a tag to a response plan.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update deletion protection to either allow or deny deletion of the final Region in a replication set.
     * </p>
     * 
     * @param updateDeletionProtectionRequest
     * @return Result of the UpdateDeletionProtection operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateDeletionProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateDeletionProtection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDeletionProtectionResult updateDeletionProtection(UpdateDeletionProtectionRequest updateDeletionProtectionRequest);

    /**
     * <p>
     * Update the details of an incident record. You can use this action to update an incident record from the defined
     * chat channel. For more information about using actions in chat channels, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/chat.html#chat-interact">Interacting through
     * chat</a>.
     * </p>
     * 
     * @param updateIncidentRecordRequest
     * @return Result of the UpdateIncidentRecord operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateIncidentRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateIncidentRecord"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIncidentRecordResult updateIncidentRecord(UpdateIncidentRecordRequest updateIncidentRecordRequest);

    /**
     * <p>
     * Add or remove related items from the related items tab of an incident record.
     * </p>
     * 
     * @param updateRelatedItemsRequest
     * @return Result of the UpdateRelatedItems operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRelatedItemsResult updateRelatedItems(UpdateRelatedItemsRequest updateRelatedItemsRequest);

    /**
     * <p>
     * Add or delete Regions from your replication set.
     * </p>
     * 
     * @param updateReplicationSetRequest
     * @return Result of the UpdateReplicationSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateReplicationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateReplicationSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReplicationSetResult updateReplicationSet(UpdateReplicationSetRequest updateReplicationSetRequest);

    /**
     * <p>
     * Updates the specified response plan.
     * </p>
     * 
     * @param updateResponsePlanRequest
     * @return Result of the UpdateResponsePlan operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateResponsePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateResponsePlan"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResponsePlanResult updateResponsePlan(UpdateResponsePlanRequest updateResponsePlanRequest);

    /**
     * <p>
     * Updates a timeline event. You can update events of type <code>Custom Event</code>.
     * </p>
     * 
     * @param updateTimelineEventRequest
     * @return Result of the UpdateTimelineEvent operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AWSSSMIncidents.UpdateTimelineEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateTimelineEvent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTimelineEventResult updateTimelineEvent(UpdateTimelineEventRequest updateTimelineEventRequest);

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

    AWSSSMIncidentsWaiters waiters();

}
