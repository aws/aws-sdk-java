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
 * Endpoint update request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointBatchItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointBatchItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push
     * channels, use the token provided by the push notification service, such as the APNs device token or the FCM
     * registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     */
    private String address;
    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes
     * as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not
     * display attributes that include these characters in the name. This limitation does not apply to attribute values.
     */
    private java.util.Map<String, java.util.List<String>> attributes;
    /**
     * The channel type.
     * 
     * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
     */
    private String channelType;
    /** The endpoint demographic attributes. */
    private EndpointDemographic demographic;
    /** The last time the endpoint was updated. Provided in ISO 8601 format. */
    private String effectiveDate;
    /** Unused. */
    private String endpointStatus;
    /** The unique Id for the Endpoint in the batch. */
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
     * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push
     * channels, use the token provided by the push notification service, such as the APNs device token or the FCM
     * registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * 
     * @param address
     *        The destination for messages that you send to this endpoint. The address varies by channel. For mobile
     *        push channels, use the token provided by the push notification service, such as the APNs device token or
     *        the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100.
     *        For the email channel, use an email address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push
     * channels, use the token provided by the push notification service, such as the APNs device token or the FCM
     * registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * 
     * @return The destination for messages that you send to this endpoint. The address varies by channel. For mobile
     *         push channels, use the token provided by the push notification service, such as the APNs device token or
     *         the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as
     *         +12065550100. For the email channel, use an email address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push
     * channels, use the token provided by the push notification service, such as the APNs device token or the FCM
     * registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * 
     * @param address
     *        The destination for messages that you send to this endpoint. The address varies by channel. For mobile
     *        push channels, use the token provided by the push notification service, such as the APNs device token or
     *        the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100.
     *        For the email channel, use an email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes
     * as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not
     * display attributes that include these characters in the name. This limitation does not apply to attribute values.
     * 
     * @return Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *         an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these
     *         attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     *         The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console
     *         does not display attributes that include these characters in the name. This limitation does not apply to
     *         attribute values.
     */

    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes
     * as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not
     * display attributes that include these characters in the name. This limitation does not apply to attribute values.
     * 
     * @param attributes
     *        Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *        an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these
     *        attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     *        The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console
     *        does not display attributes that include these characters in the name. This limitation does not apply to
     *        attribute values.
     */

    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an
     * attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes
     * as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not
     * display attributes that include these characters in the name. This limitation does not apply to attribute values.
     * 
     * @param attributes
     *        Custom attributes that describe the endpoint by associating a name with an array of values. For example,
     *        an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these
     *        attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
     * 
     *        The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console
     *        does not display attributes that include these characters in the name. This limitation does not apply to
     *        attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        setAttributes(attributes);
        return this;
    }

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

    public EndpointBatchItem withChannelType(String channelType) {
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

    public EndpointBatchItem withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
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

    public EndpointBatchItem withDemographic(EndpointDemographic demographic) {
        setDemographic(demographic);
        return this;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     * 
     * @param effectiveDate
     *        The last time the endpoint was updated. Provided in ISO 8601 format.
     */

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     * 
     * @return The last time the endpoint was updated. Provided in ISO 8601 format.
     */

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * The last time the endpoint was updated. Provided in ISO 8601 format.
     * 
     * @param effectiveDate
     *        The last time the endpoint was updated. Provided in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withEffectiveDate(String effectiveDate) {
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

    public EndpointBatchItem withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     * 
     * @param id
     *        The unique Id for the Endpoint in the batch.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     * 
     * @return The unique Id for the Endpoint in the batch.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique Id for the Endpoint in the batch.
     * 
     * @param id
     *        The unique Id for the Endpoint in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointBatchItem withId(String id) {
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

    public EndpointBatchItem withLocation(EndpointLocation location) {
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

    public EndpointBatchItem withMetrics(java.util.Map<String, Double> metrics) {
        setMetrics(metrics);
        return this;
    }

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

    public EndpointBatchItem withOptOut(String optOut) {
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

    public EndpointBatchItem withRequestId(String requestId) {
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
