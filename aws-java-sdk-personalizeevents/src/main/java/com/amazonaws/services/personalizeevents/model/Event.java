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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents user interaction event information sent using the <code>PutEvents</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions schema.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your
     * site, you might send the movie ID and rating, and the number of movie ratings made by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"itemId": "movie1"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code> and
     * <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code> fields. In the
     * above example, the <code>eventType</code> might be 'MovieRating' with <code>eventValue</code> being the rating.
     * The <code>numberOfRatings</code> would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     * </p>
     */
    private String properties;
    /**
     * <p>
     * The timestamp on the client side when the event occurred.
     * </p>
     */
    private java.util.Date sentAt;

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @param eventId
     *        An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *        for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *        distinquish unique events. Any subsequent events after the first with the same event ID are not used in
     *        model training.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @return An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *         for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *         distinquish unique events. Any subsequent events after the first with the same event ID are not used in
     *         model training.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @param eventId
     *        An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *        for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *        distinquish unique events. Any subsequent events after the first with the same event ID are not used in
     *        model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions schema.
     * </p>
     * 
     * @param eventType
     *        The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions
     *        schema.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions schema.
     * </p>
     * 
     * @return The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions
     *         schema.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions schema.
     * </p>
     * 
     * @param eventType
     *        The type of event. This property corresponds to the <code>EVENT_TYPE</code> field of the Interactions
     *        schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your
     * site, you might send the movie ID and rating, and the number of movie ratings made by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"itemId": "movie1"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code> and
     * <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code> fields. In the
     * above example, the <code>eventType</code> might be 'MovieRating' with <code>eventValue</code> being the rating.
     * The <code>numberOfRatings</code> would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of event-specific data that you might choose to record. For example, if a user rates a movie
     *        on your site, you might send the movie ID and rating, and the number of movie ratings made by the
     *        user.</p>
     *        <p>
     *        Each item in the map consists of a key-value pair. For example,
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie1"}</code>
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     *        </p>
     *        <p>
     *        The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code>
     *        and <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code>
     *        fields. In the above example, the <code>eventType</code> might be 'MovieRating' with
     *        <code>eventValue</code> being the rating. The <code>numberOfRatings</code> would match the
     *        'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your
     * site, you might send the movie ID and rating, and the number of movie ratings made by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"itemId": "movie1"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code> and
     * <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code> fields. In the
     * above example, the <code>eventType</code> might be 'MovieRating' with <code>eventValue</code> being the rating.
     * The <code>numberOfRatings</code> would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A string map of event-specific data that you might choose to record. For example, if a user rates a movie
     *         on your site, you might send the movie ID and rating, and the number of movie ratings made by the
     *         user.</p>
     *         <p>
     *         Each item in the map consists of a key-value pair. For example,
     *         </p>
     *         <p>
     *         <code>{"itemId": "movie1"}</code>
     *         </p>
     *         <p>
     *         <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     *         </p>
     *         <p>
     *         <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     *         </p>
     *         <p>
     *         The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code>
     *         and <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code>
     *         fields. In the above example, the <code>eventType</code> might be 'MovieRating' with
     *         <code>eventValue</code> being the rating. The <code>numberOfRatings</code> would match the
     *         'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your
     * site, you might send the movie ID and rating, and the number of movie ratings made by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"itemId": "movie1"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     * </p>
     * <p>
     * <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code> and
     * <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code> fields. In the
     * above example, the <code>eventType</code> might be 'MovieRating' with <code>eventValue</code> being the rating.
     * The <code>numberOfRatings</code> would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of event-specific data that you might choose to record. For example, if a user rates a movie
     *        on your site, you might send the movie ID and rating, and the number of movie ratings made by the
     *        user.</p>
     *        <p>
     *        Each item in the map consists of a key-value pair. For example,
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie1"}</code>
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie2", "eventValue": "4.5"}</code>
     *        </p>
     *        <p>
     *        <code>{"itemId": "movie3", "eventValue": "3", "numberOfRatings": "12"}</code>
     *        </p>
     *        <p>
     *        The keys use camel case names that match the fields in the Interactions schema. The <code>itemId</code>
     *        and <code>eventValue</code> keys correspond to the <code>ITEM_ID</code> and <code>EVENT_VALUE</code>
     *        fields. In the above example, the <code>eventType</code> might be 'MovieRating' with
     *        <code>eventValue</code> being the rating. The <code>numberOfRatings</code> would match the
     *        'NUMBER_OF_RATINGS' field defined in the Interactions schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withProperties(String properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * The timestamp on the client side when the event occurred.
     * </p>
     * 
     * @param sentAt
     *        The timestamp on the client side when the event occurred.
     */

    public void setSentAt(java.util.Date sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * <p>
     * The timestamp on the client side when the event occurred.
     * </p>
     * 
     * @return The timestamp on the client side when the event occurred.
     */

    public java.util.Date getSentAt() {
        return this.sentAt;
    }

    /**
     * <p>
     * The timestamp on the client side when the event occurred.
     * </p>
     * 
     * @param sentAt
     *        The timestamp on the client side when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSentAt(java.util.Date sentAt) {
        setSentAt(sentAt);
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getSentAt() != null)
            sb.append("SentAt: ").append(getSentAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getSentAt() == null ^ this.getSentAt() == null)
            return false;
        if (other.getSentAt() != null && other.getSentAt().equals(this.getSentAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getSentAt() == null) ? 0 : getSentAt().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeevents.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
