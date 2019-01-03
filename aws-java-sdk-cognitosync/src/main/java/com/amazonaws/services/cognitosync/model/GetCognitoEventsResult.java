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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response from the GetCognitoEvents request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/GetCognitoEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCognitoEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Cognito Events returned from the GetCognitoEvents request
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> events;

    /**
     * <p>
     * The Cognito Events returned from the GetCognitoEvents request
     * </p>
     * 
     * @return The Cognito Events returned from the GetCognitoEvents request
     */

    public java.util.Map<String, String> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return events;
    }

    /**
     * <p>
     * The Cognito Events returned from the GetCognitoEvents request
     * </p>
     * 
     * @param events
     *        The Cognito Events returned from the GetCognitoEvents request
     */

    public void setEvents(java.util.Map<String, String> events) {
        this.events = events == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(events);
    }

    /**
     * <p>
     * The Cognito Events returned from the GetCognitoEvents request
     * </p>
     * 
     * @param events
     *        The Cognito Events returned from the GetCognitoEvents request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCognitoEventsResult withEvents(java.util.Map<String, String> events) {
        setEvents(events);
        return this;
    }

    public GetCognitoEventsResult addEventsEntry(String key, String value) {
        if (null == this.events) {
            this.events = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.events.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.events.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Events.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCognitoEventsResult clearEventsEntries() {
        this.events = null;
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCognitoEventsResult == false)
            return false;
        GetCognitoEventsResult other = (GetCognitoEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public GetCognitoEventsResult clone() {
        try {
            return (GetCognitoEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
