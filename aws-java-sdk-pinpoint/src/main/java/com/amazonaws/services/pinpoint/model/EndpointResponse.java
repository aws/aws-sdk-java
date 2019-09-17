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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the channel type and other settings for an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For example, the address for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud
     * Messaging (FCM) registration token. The address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The unique identifier for the application that's associated with the endpoint.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> attributes;
    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     */
    private String channelType;
    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     * cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application. Amazon
     * Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     * </p>
     */
    private String cohortId;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and platform.
     * </p>
     */
    private EndpointDemographic demographic;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last updated.
     * </p>
     */
    private String effectiveDate;
    /**
     * <p>
     * Not used.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier should be a globally unique identifier
     * (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     */
    private EndpointLocation location;
    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     * </p>
     */
    private java.util.Map<String, Double> metrics;
    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     * notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages
     * or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push
     * notifications.
     * </p>
     */
    private String optOut;
    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with
     * the endpoint.
     * </p>
     */
    private EndpointUser user;

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For example, the address for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud
     * Messaging (FCM) registration token. The address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     * 
     * @param address
     *        The destination address for messages or push notifications that you send to the endpoint. The address
     *        varies by channel. For example, the address for a push-notification channel is typically the token
     *        provided by a push notification service, such as an Apple Push Notification service (APNs) device token or
     *        a Firebase Cloud Messaging (FCM) registration token. The address for the SMS channel is a phone number in
     *        E.164 format, such as +12065550100. The address for the email channel is an email address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For example, the address for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud
     * Messaging (FCM) registration token. The address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     * 
     * @return The destination address for messages or push notifications that you send to the endpoint. The address
     *         varies by channel. For example, the address for a push-notification channel is typically the token
     *         provided by a push notification service, such as an Apple Push Notification service (APNs) device token
     *         or a Firebase Cloud Messaging (FCM) registration token. The address for the SMS channel is a phone number
     *         in E.164 format, such as +12065550100. The address for the email channel is an email address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For example, the address for a push-notification channel is typically the token provided by a push
     * notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud
     * Messaging (FCM) registration token. The address for the SMS channel is a phone number in E.164 format, such as
     * +12065550100. The address for the email channel is an email address.
     * </p>
     * 
     * @param address
     *        The destination address for messages or push notifications that you send to the endpoint. The address
     *        varies by channel. For example, the address for a push-notification channel is typically the token
     *        provided by a push notification service, such as an Apple Push Notification service (APNs) device token or
     *        a Firebase Cloud Messaging (FCM) registration token. The address for the SMS channel is a phone number in
     *        E.164 format, such as +12065550100. The address for the email channel is an email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the endpoint.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that's associated with the endpoint.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the endpoint.
     * </p>
     * 
     * @return The unique identifier for the application that's associated with the endpoint.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that's associated with the endpoint.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that's associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * 
     * @return One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *         For example, the value of a custom attribute named Interests might be: ["science", "music", "travel"].
     *         You can use these attributes as filter criteria when you create segments.
     */

    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *        For example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You
     *        can use these attributes as filter criteria when you create segments.
     */

    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *        For example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You
     *        can use these attributes as filter criteria when you create segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        setAttributes(attributes);
        return this;
    }

    public EndpointResponse addAttributesEntry(String key, java.util.List<String> value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel that's used when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @return The channel that's used when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel that's used when sending messages or push notifications to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointResponse withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel that's used when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public void setChannelType(ChannelType channelType) {
        withChannelType(channelType);
    }

    /**
     * <p>
     * The channel that's used when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel that's used when sending messages or push notifications to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointResponse withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     * cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application. Amazon
     * Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     * </p>
     * 
     * @param cohortId
     *        A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     *        cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application.
     *        Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     */

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     * cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application. Amazon
     * Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     * </p>
     * 
     * @return A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped
     *         into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an
     *         application. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     */

    public String getCohortId() {
        return this.cohortId;
    }

    /**
     * <p>
     * A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     * cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application. Amazon
     * Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     * </p>
     * 
     * @param cohortId
     *        A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into
     *        cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application.
     *        Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withCohortId(String cohortId) {
        setCohortId(cohortId);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the endpoint was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the endpoint was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and platform.
     * </p>
     * 
     * @param demographic
     *        The demographic information for the endpoint, such as the time zone and platform.
     */

    public void setDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and platform.
     * </p>
     * 
     * @return The demographic information for the endpoint, such as the time zone and platform.
     */

    public EndpointDemographic getDemographic() {
        return this.demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and platform.
     * </p>
     * 
     * @param demographic
     *        The demographic information for the endpoint, such as the time zone and platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withDemographic(EndpointDemographic demographic) {
        setDemographic(demographic);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last updated.
     * </p>
     * 
     * @param effectiveDate
     *        The date and time, in ISO 8601 format, when the endpoint was last updated.
     */

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last updated.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the endpoint was last updated.
     */

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was last updated.
     * </p>
     * 
     * @param effectiveDate
     *        The date and time, in ISO 8601 format, when the endpoint was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withEffectiveDate(String effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @param endpointStatus
     *        Not used.
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @return Not used.
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * Not used.
     * </p>
     * 
     * @param endpointStatus
     *        Not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier should be a globally unique identifier
     * (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     * 
     * @param id
     *        The unique identifier that you assigned to the endpoint. The identifier should be a globally unique
     *        identifier (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated
     *        with the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier should be a globally unique identifier
     * (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     * 
     * @return The unique identifier that you assigned to the endpoint. The identifier should be a globally unique
     *         identifier (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated
     *         with the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier that you assigned to the endpoint. The identifier should be a globally unique identifier
     * (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated with the
     * application.
     * </p>
     * 
     * @param id
     *        The unique identifier that you assigned to the endpoint. The identifier should be a globally unique
     *        identifier (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated
     *        with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     * 
     * @param location
     *        The geographic information for the endpoint.
     */

    public void setLocation(EndpointLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     * 
     * @return The geographic information for the endpoint.
     */

    public EndpointLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     * 
     * @param location
     *        The geographic information for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withLocation(EndpointLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     * </p>
     * 
     * @return One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     */

    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     * </p>
     * 
     * @param metrics
     *        One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     */

    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     * </p>
     * 
     * @param metrics
     *        One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withMetrics(java.util.Map<String, Double> metrics) {
        setMetrics(metrics);
        return this;
    }

    public EndpointResponse addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     * notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages
     * or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push
     * notifications.
     * </p>
     * 
     * @param optOut
     *        Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     *        notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any
     *        messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and
     *        push notifications.
     */

    public void setOptOut(String optOut) {
        this.optOut = optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     * notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages
     * or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push
     * notifications.
     * </p>
     * 
     * @return Specifies whether the user who's associated with the endpoint has opted out of receiving messages and
     *         push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive
     *         any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all
     *         messages and push notifications.
     */

    public String getOptOut() {
        return this.optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     * notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages
     * or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push
     * notifications.
     * </p>
     * 
     * @param optOut
     *        Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push
     *        notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any
     *        messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and
     *        push notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withOptOut(String optOut) {
        setOptOut(optOut);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the most recent request to update the endpoint.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     * 
     * @return The unique identifier for the most recent request to update the endpoint.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier for the most recent request to update the endpoint.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the most recent request to update the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with
     * the endpoint.
     * </p>
     * 
     * @param user
     *        One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated
     *        with the endpoint.
     */

    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with
     * the endpoint.
     * </p>
     * 
     * @return One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated
     *         with the endpoint.
     */

    public EndpointUser getUser() {
        return this.user;
    }

    /**
     * <p>
     * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with
     * the endpoint.
     * </p>
     * 
     * @param user
     *        One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated
     *        with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withUser(EndpointUser user) {
        setUser(user);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
        if (getCohortId() != null)
            sb.append("CohortId: ").append(getCohortId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDemographic() != null)
            sb.append("Demographic: ").append(getDemographic()).append(",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: ").append(getEffectiveDate()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getOptOut() != null)
            sb.append("OptOut: ").append(getOptOut()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointResponse == false)
            return false;
        EndpointResponse other = (EndpointResponse) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getCohortId() == null ^ this.getCohortId() == null)
            return false;
        if (other.getCohortId() != null && other.getCohortId().equals(this.getCohortId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOptOut() == null ^ this.getOptOut() == null)
            return false;
        if (other.getOptOut() != null && other.getOptOut().equals(this.getOptOut()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode + ((getCohortId() == null) ? 0 : getCohortId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOptOut() == null) ? 0 : getOptOut().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public EndpointResponse clone() {
        try {
            return (EndpointResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
