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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseLogEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseLogEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object describing the result of your get relational database log events request.
     * </p>
     */
    private java.util.List<LogEvent> resourceLogEvents;
    /**
     * <p>
     * A token used for advancing to the previous page of results from your get relational database log events request.
     * </p>
     */
    private String nextBackwardToken;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database log events request.
     * </p>
     */
    private String nextForwardToken;

    /**
     * <p>
     * An object describing the result of your get relational database log events request.
     * </p>
     * 
     * @return An object describing the result of your get relational database log events request.
     */

    public java.util.List<LogEvent> getResourceLogEvents() {
        return resourceLogEvents;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log events request.
     * </p>
     * 
     * @param resourceLogEvents
     *        An object describing the result of your get relational database log events request.
     */

    public void setResourceLogEvents(java.util.Collection<LogEvent> resourceLogEvents) {
        if (resourceLogEvents == null) {
            this.resourceLogEvents = null;
            return;
        }

        this.resourceLogEvents = new java.util.ArrayList<LogEvent>(resourceLogEvents);
    }

    /**
     * <p>
     * An object describing the result of your get relational database log events request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceLogEvents(java.util.Collection)} or {@link #withResourceLogEvents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceLogEvents
     *        An object describing the result of your get relational database log events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsResult withResourceLogEvents(LogEvent... resourceLogEvents) {
        if (this.resourceLogEvents == null) {
            setResourceLogEvents(new java.util.ArrayList<LogEvent>(resourceLogEvents.length));
        }
        for (LogEvent ele : resourceLogEvents) {
            this.resourceLogEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log events request.
     * </p>
     * 
     * @param resourceLogEvents
     *        An object describing the result of your get relational database log events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsResult withResourceLogEvents(java.util.Collection<LogEvent> resourceLogEvents) {
        setResourceLogEvents(resourceLogEvents);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get relational database log events request.
     * </p>
     * 
     * @param nextBackwardToken
     *        A token used for advancing to the previous page of results from your get relational database log events
     *        request.
     */

    public void setNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get relational database log events request.
     * </p>
     * 
     * @return A token used for advancing to the previous page of results from your get relational database log events
     *         request.
     */

    public String getNextBackwardToken() {
        return this.nextBackwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get relational database log events request.
     * </p>
     * 
     * @param nextBackwardToken
     *        A token used for advancing to the previous page of results from your get relational database log events
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsResult withNextBackwardToken(String nextBackwardToken) {
        setNextBackwardToken(nextBackwardToken);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database log events request.
     * </p>
     * 
     * @param nextForwardToken
     *        A token used for advancing to the next page of results from your get relational database log events
     *        request.
     */

    public void setNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database log events request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get relational database log events
     *         request.
     */

    public String getNextForwardToken() {
        return this.nextForwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database log events request.
     * </p>
     * 
     * @param nextForwardToken
     *        A token used for advancing to the next page of results from your get relational database log events
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseLogEventsResult withNextForwardToken(String nextForwardToken) {
        setNextForwardToken(nextForwardToken);
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
        if (getResourceLogEvents() != null)
            sb.append("ResourceLogEvents: ").append(getResourceLogEvents()).append(",");
        if (getNextBackwardToken() != null)
            sb.append("NextBackwardToken: ").append(getNextBackwardToken()).append(",");
        if (getNextForwardToken() != null)
            sb.append("NextForwardToken: ").append(getNextForwardToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogEventsResult == false)
            return false;
        GetRelationalDatabaseLogEventsResult other = (GetRelationalDatabaseLogEventsResult) obj;
        if (other.getResourceLogEvents() == null ^ this.getResourceLogEvents() == null)
            return false;
        if (other.getResourceLogEvents() != null && other.getResourceLogEvents().equals(this.getResourceLogEvents()) == false)
            return false;
        if (other.getNextBackwardToken() == null ^ this.getNextBackwardToken() == null)
            return false;
        if (other.getNextBackwardToken() != null && other.getNextBackwardToken().equals(this.getNextBackwardToken()) == false)
            return false;
        if (other.getNextForwardToken() == null ^ this.getNextForwardToken() == null)
            return false;
        if (other.getNextForwardToken() != null && other.getNextForwardToken().equals(this.getNextForwardToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceLogEvents() == null) ? 0 : getResourceLogEvents().hashCode());
        hashCode = prime * hashCode + ((getNextBackwardToken() == null) ? 0 : getNextBackwardToken().hashCode());
        hashCode = prime * hashCode + ((getNextForwardToken() == null) ? 0 : getNextForwardToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseLogEventsResult clone() {
        try {
            return (GetRelationalDatabaseLogEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
