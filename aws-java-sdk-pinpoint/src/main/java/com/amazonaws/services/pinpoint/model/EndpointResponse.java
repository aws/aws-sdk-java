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
 * Endpoint response
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointResponse implements Serializable, Cloneable, StructuredPojo {

    /** The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId. */
    private String address;
    /** The ID of the application that is associated with the endpoint. */
    private String applicationId;
    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these
     * attributes as selection criteria when you create segments.
     * 
     * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign
     * (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using
     * these characters in the names of custom attributes.
     */
    private java.util.Map<String, java.util.List<String>> attributes;
    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     */
    private String channelType;
    /**
     * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts
     * randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns
     * cohorts to the holdout or treatment allocations for a campaign.
     */
    private String cohortId;
    /** The date and time when the endpoint was created, shown in ISO 8601 format. */
    private String creationDate;
    /** The endpoint demographic attributes. */
    private EndpointDemographic demographic;
    /** The date and time when the endpoint was last updated, shown in ISO 8601 format. */
    private String effectiveDate;
    /** Unused. */
    private String endpointStatus;
    /**
     * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure
     * that it doesn't conflict with other endpoint IDs associated with the application.
     */
    private String id;
    /** The endpoint location attributes. */
    private EndpointLocation location;
    /** Custom metrics that your app reports to Amazon Pinpoint. */
    private java.util.Map<String, Double> metrics;
    /**
     * Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     * ALL - User has opted out of all messages.
     * 
     * NONE - Users has not opted out and receives all messages.
     */
    private String optOut;
    /** The unique ID for the most recent request to update the endpoint. */
    private String requestId;
    /** Custom user-specific attributes that your app reports to Amazon Pinpoint. */
    private EndpointUser user;

    /**
     * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
     * 
     * @param address
     *        The address of the endpoint as provided by your push provider. For example, the DeviceToken or
     *        RegistrationId.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
     * 
     * @return The address of the endpoint as provided by your push provider. For example, the DeviceToken or
     *         RegistrationId.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
     * 
     * @param address
     *        The address of the endpoint as provided by your push provider. For example, the DeviceToken or
     *        RegistrationId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * The ID of the application that is associated with the endpoint.
     * 
     * @param applicationId
     *        The ID of the application that is associated with the endpoint.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application that is associated with the endpoint.
     * 
     * @return The ID of the application that is associated with the endpoint.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application that is associated with the endpoint.
     * 
     * @param applicationId
     *        The ID of the application that is associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these
     * attributes as selection criteria when you create segments.
     * 
     * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign
     * (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using
     * these characters in the names of custom attributes.
     * 
     * @return Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *         an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You
     *         can use these attributes as selection criteria when you create segments.
     * 
     *         The Amazon Pinpoint console can't display attribute names that include the following characters:
     *         hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason,
     *         you should avoid using these characters in the names of custom attributes.
     */

    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these
     * attributes as selection criteria when you create segments.
     * 
     * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign
     * (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using
     * these characters in the names of custom attributes.
     * 
     * @param attributes
     *        Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *        an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can
     *        use these attributes as selection criteria when you create segments.
     * 
     *        The Amazon Pinpoint console can't display attribute names that include the following characters:
     *        hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason,
     *        you should avoid using these characters in the names of custom attributes.
     */

    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these
     * attributes as selection criteria when you create segments.
     * 
     * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign
     * (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using
     * these characters in the names of custom attributes.
     * 
     * @param attributes
     *        Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *        an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can
     *        use these attributes as selection criteria when you create segments.
     * 
     *        The Amazon Pinpoint console can't display attribute names that include the following characters:
     *        hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason,
     *        you should avoid using these characters in the names of custom attributes.
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
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * @see ChannelType
     */

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * 
     * @return The channel type.
     * 
     *         Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * @see ChannelType
     */

    public String getChannelType() {
        return this.channelType;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointResponse withChannelType(String channelType) {
        setChannelType(channelType);
        return this;
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * @see ChannelType
     */

    public void setChannelType(ChannelType channelType) {
        withChannelType(channelType);
    }

    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * 
     * @param channelType
     *        The channel type.
     * 
     *        Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public EndpointResponse withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts
     * randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns
     * cohorts to the holdout or treatment allocations for a campaign.
     * 
     * @param cohortId
     *        A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into
     *        cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon
     *        Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
     */

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    /**
     * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts
     * randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns
     * cohorts to the holdout or treatment allocations for a campaign.
     * 
     * @return A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into
     *         cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon
     *         Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
     */

    public String getCohortId() {
        return this.cohortId;
    }

    /**
     * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts
     * randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns
     * cohorts to the holdout or treatment allocations for a campaign.
     * 
     * @param cohortId
     *        A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into
     *        cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon
     *        Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withCohortId(String cohortId) {
        setCohortId(cohortId);
        return this;
    }

    /**
     * The date and time when the endpoint was created, shown in ISO 8601 format.
     * 
     * @param creationDate
     *        The date and time when the endpoint was created, shown in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date and time when the endpoint was created, shown in ISO 8601 format.
     * 
     * @return The date and time when the endpoint was created, shown in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date and time when the endpoint was created, shown in ISO 8601 format.
     * 
     * @param creationDate
     *        The date and time when the endpoint was created, shown in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * The endpoint demographic attributes.
     * 
     * @param demographic
     *        The endpoint demographic attributes.
     */

    public void setDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * The endpoint demographic attributes.
     * 
     * @return The endpoint demographic attributes.
     */

    public EndpointDemographic getDemographic() {
        return this.demographic;
    }

    /**
     * The endpoint demographic attributes.
     * 
     * @param demographic
     *        The endpoint demographic attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withDemographic(EndpointDemographic demographic) {
        setDemographic(demographic);
        return this;
    }

    /**
     * The date and time when the endpoint was last updated, shown in ISO 8601 format.
     * 
     * @param effectiveDate
     *        The date and time when the endpoint was last updated, shown in ISO 8601 format.
     */

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * The date and time when the endpoint was last updated, shown in ISO 8601 format.
     * 
     * @return The date and time when the endpoint was last updated, shown in ISO 8601 format.
     */

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * The date and time when the endpoint was last updated, shown in ISO 8601 format.
     * 
     * @param effectiveDate
     *        The date and time when the endpoint was last updated, shown in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withEffectiveDate(String effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * Unused.
     * 
     * @param endpointStatus
     *        Unused.
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * Unused.
     * 
     * @return Unused.
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * Unused.
     * 
     * @param endpointStatus
     *        Unused.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure
     * that it doesn't conflict with other endpoint IDs associated with the application.
     * 
     * @param id
     *        The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to
     *        ensure that it doesn't conflict with other endpoint IDs associated with the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure
     * that it doesn't conflict with other endpoint IDs associated with the application.
     * 
     * @return The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to
     *         ensure that it doesn't conflict with other endpoint IDs associated with the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure
     * that it doesn't conflict with other endpoint IDs associated with the application.
     * 
     * @param id
     *        The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to
     *        ensure that it doesn't conflict with other endpoint IDs associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The endpoint location attributes.
     * 
     * @param location
     *        The endpoint location attributes.
     */

    public void setLocation(EndpointLocation location) {
        this.location = location;
    }

    /**
     * The endpoint location attributes.
     * 
     * @return The endpoint location attributes.
     */

    public EndpointLocation getLocation() {
        return this.location;
    }

    /**
     * The endpoint location attributes.
     * 
     * @param location
     *        The endpoint location attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withLocation(EndpointLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     * 
     * @return Custom metrics that your app reports to Amazon Pinpoint.
     */

    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     * 
     * @param metrics
     *        Custom metrics that your app reports to Amazon Pinpoint.
     */

    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint.
     * 
     * @param metrics
     *        Custom metrics that your app reports to Amazon Pinpoint.
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
     * Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     * ALL - User has opted out of all messages.
     * 
     * NONE - Users has not opted out and receives all messages.
     * 
     * @param optOut
     *        Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     *        ALL - User has opted out of all messages.
     * 
     *        NONE - Users has not opted out and receives all messages.
     */

    public void setOptOut(String optOut) {
        this.optOut = optOut;
    }

    /**
     * Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     * ALL - User has opted out of all messages.
     * 
     * NONE - Users has not opted out and receives all messages.
     * 
     * @return Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     *         ALL - User has opted out of all messages.
     * 
     *         NONE - Users has not opted out and receives all messages.
     */

    public String getOptOut() {
        return this.optOut;
    }

    /**
     * Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     * ALL - User has opted out of all messages.
     * 
     * NONE - Users has not opted out and receives all messages.
     * 
     * @param optOut
     *        Indicates whether a user has opted out of receiving messages with one of the following values:
     * 
     *        ALL - User has opted out of all messages.
     * 
     *        NONE - Users has not opted out and receives all messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withOptOut(String optOut) {
        setOptOut(optOut);
        return this;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     * 
     * @param requestId
     *        The unique ID for the most recent request to update the endpoint.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     * 
     * @return The unique ID for the most recent request to update the endpoint.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * The unique ID for the most recent request to update the endpoint.
     * 
     * @param requestId
     *        The unique ID for the most recent request to update the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointResponse withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     * 
     * @param user
     *        Custom user-specific attributes that your app reports to Amazon Pinpoint.
     */

    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     * 
     * @return Custom user-specific attributes that your app reports to Amazon Pinpoint.
     */

    public EndpointUser getUser() {
        return this.user;
    }

    /**
     * Custom user-specific attributes that your app reports to Amazon Pinpoint.
     * 
     * @param user
     *        Custom user-specific attributes that your app reports to Amazon Pinpoint.
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
