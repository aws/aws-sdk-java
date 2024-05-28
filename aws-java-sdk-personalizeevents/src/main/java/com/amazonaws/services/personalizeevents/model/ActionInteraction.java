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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an action interaction event sent using the <code>PutActionInteractions</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/ActionInteraction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionInteraction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the Action
     * interaction schema.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of the
     * Action interaction schema.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a user
     * first visits your website or uses your application.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time format, in
     * seconds.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     * <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event type
     * data</a>.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinguish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The ID of the list of recommendations that contains the action the user interacted with.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * A list of action IDs that represents the sequence of actions you have shown the user. For example,
     * <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from action
     * interaction events. Instead, record multiple events for each action and use the <code>Viewed</code> event type.
     * </p>
     */
    private java.util.List<String> impression;
    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user takes an action,
     * other than the action ID, you might also send the number of actions taken by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"numberOfActions": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Action interactions schema. In the above example, the
     * <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action interactions schema.
     * </p>
     * <p>
     * The following can't be included as a keyword for properties (case insensitive).
     * </p>
     * <ul>
     * <li>
     * <p>
     * userId
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionId
     * </p>
     * </li>
     * <li>
     * <p>
     * eventType
     * </p>
     * </li>
     * <li>
     * <p>
     * timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * recommendationId
     * </p>
     * </li>
     * <li>
     * <p>
     * impression
     * </p>
     * </li>
     * </ul>
     */
    private String properties;

    /**
     * <p>
     * The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the Action
     * interaction schema.
     * </p>
     * 
     * @param actionId
     *        The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the
     *        Action interaction schema.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the Action
     * interaction schema.
     * </p>
     * 
     * @return The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of
     *         the Action interaction schema.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the Action
     * interaction schema.
     * </p>
     * 
     * @param actionId
     *        The ID of the action the user interacted with. This corresponds to the <code>ACTION_ID</code> field of the
     *        Action interaction schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of the
     * Action interaction schema.
     * </p>
     * 
     * @param userId
     *        The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of
     *        the Action interaction schema.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of the
     * Action interaction schema.
     * </p>
     * 
     * @return The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of
     *         the Action interaction schema.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of the
     * Action interaction schema.
     * </p>
     * 
     * @param userId
     *        The ID of the user who interacted with the action. This corresponds to the <code>USER_ID</code> field of
     *        the Action interaction schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a user
     * first visits your website or uses your application.
     * </p>
     * 
     * @param sessionId
     *        The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a
     *        user first visits your website or uses your application.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a user
     * first visits your website or uses your application.
     * </p>
     * 
     * @return The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when
     *         a user first visits your website or uses your application.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a user
     * first visits your website or uses your application.
     * </p>
     * 
     * @param sessionId
     *        The ID associated with the user's visit. Your application generates a unique <code>sessionId</code> when a
     *        user first visits your website or uses your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time format, in
     * seconds.
     * </p>
     * 
     * @param timestamp
     *        The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time
     *        format, in seconds.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time format, in
     * seconds.
     * </p>
     * 
     * @return The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time
     *         format, in seconds.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time format, in
     * seconds.
     * </p>
     * 
     * @param timestamp
     *        The timestamp for when the action interaction event occurred. Timestamps must be in Unix epoch time
     *        format, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     * <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event type
     * data</a>.
     * </p>
     * 
     * @param eventType
     *        The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     *        <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event
     *        type data</a>.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     * <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event type
     * data</a>.
     * </p>
     * 
     * @return The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     *         <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event
     *         type data</a>.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     * <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event type
     * data</a>.
     * </p>
     * 
     * @param eventType
     *        The type of action interaction event. You can specify <code>Viewed</code>, <code>Taken</code>, and
     *        <code>Not Taken</code> event types. For more information about action interaction event type data, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-event-type-data.html">Event
     *        type data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinguish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @param eventId
     *        An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *        for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *        distinguish unique events. Any subsequent events after the first with the same event ID are not used in
     *        model training.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinguish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @return An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *         for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *         distinguish unique events. Any subsequent events after the first with the same event ID are not used in
     *         model training.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the
     * event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinguish
     * unique events. Any subsequent events after the first with the same event ID are not used in model training.
     * </p>
     * 
     * @param eventId
     *        An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID
     *        for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to
     *        distinguish unique events. Any subsequent events after the first with the same event ID are not used in
     *        model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The ID of the list of recommendations that contains the action the user interacted with.
     * </p>
     * 
     * @param recommendationId
     *        The ID of the list of recommendations that contains the action the user interacted with.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The ID of the list of recommendations that contains the action the user interacted with.
     * </p>
     * 
     * @return The ID of the list of recommendations that contains the action the user interacted with.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The ID of the list of recommendations that contains the action the user interacted with.
     * </p>
     * 
     * @param recommendationId
     *        The ID of the list of recommendations that contains the action the user interacted with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * A list of action IDs that represents the sequence of actions you have shown the user. For example,
     * <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from action
     * interaction events. Instead, record multiple events for each action and use the <code>Viewed</code> event type.
     * </p>
     * 
     * @return A list of action IDs that represents the sequence of actions you have shown the user. For example,
     *         <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data
     *         from action interaction events. Instead, record multiple events for each action and use the
     *         <code>Viewed</code> event type.
     */

    public java.util.List<String> getImpression() {
        return impression;
    }

    /**
     * <p>
     * A list of action IDs that represents the sequence of actions you have shown the user. For example,
     * <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from action
     * interaction events. Instead, record multiple events for each action and use the <code>Viewed</code> event type.
     * </p>
     * 
     * @param impression
     *        A list of action IDs that represents the sequence of actions you have shown the user. For example,
     *        <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from
     *        action interaction events. Instead, record multiple events for each action and use the <code>Viewed</code>
     *        event type.
     */

    public void setImpression(java.util.Collection<String> impression) {
        if (impression == null) {
            this.impression = null;
            return;
        }

        this.impression = new java.util.ArrayList<String>(impression);
    }

    /**
     * <p>
     * A list of action IDs that represents the sequence of actions you have shown the user. For example,
     * <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from action
     * interaction events. Instead, record multiple events for each action and use the <code>Viewed</code> event type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImpression(java.util.Collection)} or {@link #withImpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param impression
     *        A list of action IDs that represents the sequence of actions you have shown the user. For example,
     *        <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from
     *        action interaction events. Instead, record multiple events for each action and use the <code>Viewed</code>
     *        event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withImpression(String... impression) {
        if (this.impression == null) {
            setImpression(new java.util.ArrayList<String>(impression.length));
        }
        for (String ele : impression) {
            this.impression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of action IDs that represents the sequence of actions you have shown the user. For example,
     * <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from action
     * interaction events. Instead, record multiple events for each action and use the <code>Viewed</code> event type.
     * </p>
     * 
     * @param impression
     *        A list of action IDs that represents the sequence of actions you have shown the user. For example,
     *        <code>["actionId1", "actionId2", "actionId3"]</code>. Amazon Personalize doesn't use impressions data from
     *        action interaction events. Instead, record multiple events for each action and use the <code>Viewed</code>
     *        event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withImpression(java.util.Collection<String> impression) {
        setImpression(impression);
        return this;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user takes an action,
     * other than the action ID, you might also send the number of actions taken by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"numberOfActions": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Action interactions schema. In the above example, the
     * <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action interactions schema.
     * </p>
     * <p>
     * The following can't be included as a keyword for properties (case insensitive).
     * </p>
     * <ul>
     * <li>
     * <p>
     * userId
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionId
     * </p>
     * </li>
     * <li>
     * <p>
     * eventType
     * </p>
     * </li>
     * <li>
     * <p>
     * timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * recommendationId
     * </p>
     * </li>
     * <li>
     * <p>
     * impression
     * </p>
     * </li>
     * </ul>
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
     *        A string map of event-specific data that you might choose to record. For example, if a user takes an
     *        action, other than the action ID, you might also send the number of actions taken by the user.</p>
     *        <p>
     *        Each item in the map consists of a key-value pair. For example,
     *        </p>
     *        <p>
     *        <code>{"numberOfActions": "12"}</code>
     *        </p>
     *        <p>
     *        The keys use camel case names that match the fields in the Action interactions schema. In the above
     *        example, the <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action
     *        interactions schema.
     *        </p>
     *        <p>
     *        The following can't be included as a keyword for properties (case insensitive).
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        userId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        sessionId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        eventType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        recommendationId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        impression
     *        </p>
     *        </li>
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user takes an action,
     * other than the action ID, you might also send the number of actions taken by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"numberOfActions": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Action interactions schema. In the above example, the
     * <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action interactions schema.
     * </p>
     * <p>
     * The following can't be included as a keyword for properties (case insensitive).
     * </p>
     * <ul>
     * <li>
     * <p>
     * userId
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionId
     * </p>
     * </li>
     * <li>
     * <p>
     * eventType
     * </p>
     * </li>
     * <li>
     * <p>
     * timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * recommendationId
     * </p>
     * </li>
     * <li>
     * <p>
     * impression
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A string map of event-specific data that you might choose to record. For example, if a user takes an
     *         action, other than the action ID, you might also send the number of actions taken by the user.</p>
     *         <p>
     *         Each item in the map consists of a key-value pair. For example,
     *         </p>
     *         <p>
     *         <code>{"numberOfActions": "12"}</code>
     *         </p>
     *         <p>
     *         The keys use camel case names that match the fields in the Action interactions schema. In the above
     *         example, the <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action
     *         interactions schema.
     *         </p>
     *         <p>
     *         The following can't be included as a keyword for properties (case insensitive).
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         userId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         sessionId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         eventType
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         timestamp
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         recommendationId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         impression
     *         </p>
     *         </li>
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A string map of event-specific data that you might choose to record. For example, if a user takes an action,
     * other than the action ID, you might also send the number of actions taken by the user.
     * </p>
     * <p>
     * Each item in the map consists of a key-value pair. For example,
     * </p>
     * <p>
     * <code>{"numberOfActions": "12"}</code>
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the Action interactions schema. In the above example, the
     * <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action interactions schema.
     * </p>
     * <p>
     * The following can't be included as a keyword for properties (case insensitive).
     * </p>
     * <ul>
     * <li>
     * <p>
     * userId
     * </p>
     * </li>
     * <li>
     * <p>
     * sessionId
     * </p>
     * </li>
     * <li>
     * <p>
     * eventType
     * </p>
     * </li>
     * <li>
     * <p>
     * timestamp
     * </p>
     * </li>
     * <li>
     * <p>
     * recommendationId
     * </p>
     * </li>
     * <li>
     * <p>
     * impression
     * </p>
     * </li>
     * </ul>
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
     *        A string map of event-specific data that you might choose to record. For example, if a user takes an
     *        action, other than the action ID, you might also send the number of actions taken by the user.</p>
     *        <p>
     *        Each item in the map consists of a key-value pair. For example,
     *        </p>
     *        <p>
     *        <code>{"numberOfActions": "12"}</code>
     *        </p>
     *        <p>
     *        The keys use camel case names that match the fields in the Action interactions schema. In the above
     *        example, the <code>numberOfActions</code> would match the 'NUMBER_OF_ACTIONS' field defined in the Action
     *        interactions schema.
     *        </p>
     *        <p>
     *        The following can't be included as a keyword for properties (case insensitive).
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        userId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        sessionId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        eventType
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        timestamp
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        recommendationId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        impression
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInteraction withProperties(String properties) {
        setProperties(properties);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getImpression() != null)
            sb.append("Impression: ").append("***Sensitive Data Redacted***").append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionInteraction == false)
            return false;
        ActionInteraction other = (ActionInteraction) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getImpression() == null ^ this.getImpression() == null)
            return false;
        if (other.getImpression() != null && other.getImpression().equals(this.getImpression()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getImpression() == null) ? 0 : getImpression().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public ActionInteraction clone() {
        try {
            return (ActionInteraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeevents.model.transform.ActionInteractionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
