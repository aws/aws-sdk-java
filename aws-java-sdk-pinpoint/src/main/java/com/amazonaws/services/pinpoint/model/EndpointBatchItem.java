/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies an endpoint to create or update and the settings and attributes to set or change for the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointBatchItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointBatchItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For a push-notification channel, use the token provided by the push notification service, such as an
     * Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For
     * the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email
     * address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use
     * these attributes as filter criteria when you create segments. Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you
     * define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question
     * mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain
     * these characters. This restriction doesn't apply to attribute values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> attributes;
    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     */
    private String channelType;
    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and platform.
     * </p>
     */
    private EndpointDemographic demographic;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or updated.
     * </p>
     */
    private String effectiveDate;
    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are
     * sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     * endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
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
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * One or more custom user attributes that describe the user who's associated with the endpoint.
     * </p>
     */
    private EndpointUser user;

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For a push-notification channel, use the token provided by the push notification service, such as an
     * Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For
     * the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email
     * address.
     * </p>
     * 
     * @param address
     *        The destination address for messages or push notifications that you send to the endpoint. The address
     *        varies by channel. For a push-notification channel, use the token provided by the push notification
     *        service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging
     *        (FCM) registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100.
     *        For the email channel, use an email address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For a push-notification channel, use the token provided by the push notification service, such as an
     * Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For
     * the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email
     * address.
     * </p>
     * 
     * @return The destination address for messages or push notifications that you send to the endpoint. The address
     *         varies by channel. For a push-notification channel, use the token provided by the push notification
     *         service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging
     *         (FCM) registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100.
     *         For the email channel, use an email address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send to the endpoint. The address varies by
     * channel. For a push-notification channel, use the token provided by the push notification service, such as an
     * Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For
     * the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email
     * address.
     * </p>
     * 
     * @param address
     *        The destination address for messages or push notifications that you send to the endpoint. The address
     *        varies by channel. For a push-notification channel, use the token provided by the push notification
     *        service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging
     *        (FCM) registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100.
     *        For the email channel, use an email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use
     * these attributes as filter criteria when you create segments. Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you
     * define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question
     * mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain
     * these characters. This restriction doesn't apply to attribute values.
     * </p>
     * 
     * @return One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *         For example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"].
     *         You can use these attributes as filter criteria when you create segments. Attribute names are case
     *         sensitive.</p>
     *         <p>
     *         An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters.
     *         When you define the name of a custom attribute, avoid using the following characters: number sign (#),
     *         colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display
     *         attribute names that contain these characters. This restriction doesn't apply to attribute values.
     */

    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use
     * these attributes as filter criteria when you create segments. Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you
     * define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question
     * mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain
     * these characters. This restriction doesn't apply to attribute values.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *        For example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You
     *        can use these attributes as filter criteria when you create segments. Attribute names are case
     *        sensitive.</p>
     *        <p>
     *        An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters.
     *        When you define the name of a custom attribute, avoid using the following characters: number sign (#),
     *        colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display
     *        attribute names that contain these characters. This restriction doesn't apply to attribute values.
     */

    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a name with an array of values. For
     * example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use
     * these attributes as filter criteria when you create segments. Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you
     * define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question
     * mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain
     * these characters. This restriction doesn't apply to attribute values.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes that describe the endpoint by associating a name with an array of values.
     *        For example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You
     *        can use these attributes as filter criteria when you create segments. Attribute names are case
     *        sensitive.</p>
     *        <p>
     *        An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters.
     *        When you define the name of a custom attribute, avoid using the following characters: number sign (#),
     *        colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display
     *        attribute names that contain these characters. This restriction doesn't apply to attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see EndpointBatchItem#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem addAttributesEntry(String key, java.util.List<String> value) {
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

    public EndpointBatchItem clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @return The channel to use when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending messages or push notifications to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointBatchItem withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending messages or push notifications to the endpoint.
     * @see ChannelType
     */

    public void setChannelType(ChannelType channelType) {
        withChannelType(channelType);
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the endpoint.
     * </p>
     * 
     * @param channelType
     *        The channel to use when sending messages or push notifications to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointBatchItem withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
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

    public EndpointBatchItem withDemographic(EndpointDemographic demographic) {
        setDemographic(demographic);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or updated.
     * </p>
     * 
     * @param effectiveDate
     *        The date and time, in ISO 8601 format, when the endpoint was created or updated.
     */

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or updated.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the endpoint was created or updated.
     */

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or updated.
     * </p>
     * 
     * @param effectiveDate
     *        The date and time, in ISO 8601 format, when the endpoint was created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withEffectiveDate(String effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are
     * sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     * endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     * 
     * @param endpointStatus
     *        Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE,
     *        messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.</p>
     *        <p>
     *        Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     *        endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that
     *        has the same address specified by the Address property.
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are
     * sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     * endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     * 
     * @return Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE,
     *         messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.</p>
     *         <p>
     *         Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     *         endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that
     *         has the same address specified by the Address property.
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are
     * sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     * endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     * 
     * @param endpointStatus
     *        Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE,
     *        messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint.</p>
     *        <p>
     *        Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing
     *        endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that
     *        has the same address specified by the Address property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     * 
     * @param id
     *        The unique identifier for the endpoint in the context of the batch.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     * 
     * @return The unique identifier for the endpoint in the context of the batch.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     * 
     * @param id
     *        The unique identifier for the endpoint in the context of the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withId(String id) {
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

    public EndpointBatchItem withLocation(EndpointLocation location) {
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

    public EndpointBatchItem withMetrics(java.util.Map<String, Double> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * Add a single Metrics entry
     *
     * @see EndpointBatchItem#withMetrics
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem addMetricsEntry(String key, Double value) {
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

    public EndpointBatchItem clearMetricsEntries() {
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

    public EndpointBatchItem withOptOut(String optOut) {
        setOptOut(optOut);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the request to create or update the endpoint.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     * 
     * @return The unique identifier for the request to create or update the endpoint.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the request to create or update the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes that describe the user who's associated with the endpoint.
     * </p>
     * 
     * @param user
     *        One or more custom user attributes that describe the user who's associated with the endpoint.
     */

    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * <p>
     * One or more custom user attributes that describe the user who's associated with the endpoint.
     * </p>
     * 
     * @return One or more custom user attributes that describe the user who's associated with the endpoint.
     */

    public EndpointUser getUser() {
        return this.user;
    }

    /**
     * <p>
     * One or more custom user attributes that describe the user who's associated with the endpoint.
     * </p>
     * 
     * @param user
     *        One or more custom user attributes that describe the user who's associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withUser(EndpointUser user) {
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getChannelType() != null)
            sb.append("ChannelType: ").append(getChannelType()).append(",");
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

        if (obj instanceof EndpointBatchItem == false)
            return false;
        EndpointBatchItem other = (EndpointBatchItem) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null && other.getChannelType().equals(this.getChannelType()) == false)
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
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
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
    public EndpointBatchItem clone() {
        try {
            return (EndpointBatchItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointBatchItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
