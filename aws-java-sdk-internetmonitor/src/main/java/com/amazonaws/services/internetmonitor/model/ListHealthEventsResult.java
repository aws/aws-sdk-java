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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHealthEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of health events.
     * </p>
     */
    private java.util.List<HealthEvent> healthEvents;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of health events.
     * </p>
     * 
     * @return A list of health events.
     */

    public java.util.List<HealthEvent> getHealthEvents() {
        return healthEvents;
    }

    /**
     * <p>
     * A list of health events.
     * </p>
     * 
     * @param healthEvents
     *        A list of health events.
     */

    public void setHealthEvents(java.util.Collection<HealthEvent> healthEvents) {
        if (healthEvents == null) {
            this.healthEvents = null;
            return;
        }

        this.healthEvents = new java.util.ArrayList<HealthEvent>(healthEvents);
    }

    /**
     * <p>
     * A list of health events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHealthEvents(java.util.Collection)} or {@link #withHealthEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param healthEvents
     *        A list of health events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsResult withHealthEvents(HealthEvent... healthEvents) {
        if (this.healthEvents == null) {
            setHealthEvents(new java.util.ArrayList<HealthEvent>(healthEvents.length));
        }
        for (HealthEvent ele : healthEvents) {
            this.healthEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of health events.
     * </p>
     * 
     * @param healthEvents
     *        A list of health events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsResult withHealthEvents(java.util.Collection<HealthEvent> healthEvents) {
        setHealthEvents(healthEvents);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getHealthEvents() != null)
            sb.append("HealthEvents: ").append(getHealthEvents()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHealthEventsResult == false)
            return false;
        ListHealthEventsResult other = (ListHealthEventsResult) obj;
        if (other.getHealthEvents() == null ^ this.getHealthEvents() == null)
            return false;
        if (other.getHealthEvents() != null && other.getHealthEvents().equals(this.getHealthEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthEvents() == null) ? 0 : getHealthEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHealthEventsResult clone() {
        try {
            return (ListHealthEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
