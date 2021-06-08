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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventIntegrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The event integrations.
     * </p>
     */
    private java.util.List<EventIntegration> eventIntegrations;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The event integrations.
     * </p>
     * 
     * @return The event integrations.
     */

    public java.util.List<EventIntegration> getEventIntegrations() {
        return eventIntegrations;
    }

    /**
     * <p>
     * The event integrations.
     * </p>
     * 
     * @param eventIntegrations
     *        The event integrations.
     */

    public void setEventIntegrations(java.util.Collection<EventIntegration> eventIntegrations) {
        if (eventIntegrations == null) {
            this.eventIntegrations = null;
            return;
        }

        this.eventIntegrations = new java.util.ArrayList<EventIntegration>(eventIntegrations);
    }

    /**
     * <p>
     * The event integrations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventIntegrations(java.util.Collection)} or {@link #withEventIntegrations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventIntegrations
     *        The event integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventIntegrationsResult withEventIntegrations(EventIntegration... eventIntegrations) {
        if (this.eventIntegrations == null) {
            setEventIntegrations(new java.util.ArrayList<EventIntegration>(eventIntegrations.length));
        }
        for (EventIntegration ele : eventIntegrations) {
            this.eventIntegrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event integrations.
     * </p>
     * 
     * @param eventIntegrations
     *        The event integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventIntegrationsResult withEventIntegrations(java.util.Collection<EventIntegration> eventIntegrations) {
        setEventIntegrations(eventIntegrations);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventIntegrationsResult withNextToken(String nextToken) {
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
        if (getEventIntegrations() != null)
            sb.append("EventIntegrations: ").append(getEventIntegrations()).append(",");
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

        if (obj instanceof ListEventIntegrationsResult == false)
            return false;
        ListEventIntegrationsResult other = (ListEventIntegrationsResult) obj;
        if (other.getEventIntegrations() == null ^ this.getEventIntegrations() == null)
            return false;
        if (other.getEventIntegrations() != null && other.getEventIntegrations().equals(this.getEventIntegrations()) == false)
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

        hashCode = prime * hashCode + ((getEventIntegrations() == null) ? 0 : getEventIntegrations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventIntegrationsResult clone() {
        try {
            return (ListEventIntegrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
