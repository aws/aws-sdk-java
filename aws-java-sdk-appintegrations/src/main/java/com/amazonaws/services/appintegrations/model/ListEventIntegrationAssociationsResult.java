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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrationAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventIntegrationAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The event integration associations.
     * </p>
     */
    private java.util.List<EventIntegrationAssociation> eventIntegrationAssociations;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The event integration associations.
     * </p>
     * 
     * @return The event integration associations.
     */

    public java.util.List<EventIntegrationAssociation> getEventIntegrationAssociations() {
        return eventIntegrationAssociations;
    }

    /**
     * <p>
     * The event integration associations.
     * </p>
     * 
     * @param eventIntegrationAssociations
     *        The event integration associations.
     */

    public void setEventIntegrationAssociations(java.util.Collection<EventIntegrationAssociation> eventIntegrationAssociations) {
        if (eventIntegrationAssociations == null) {
            this.eventIntegrationAssociations = null;
            return;
        }

        this.eventIntegrationAssociations = new java.util.ArrayList<EventIntegrationAssociation>(eventIntegrationAssociations);
    }

    /**
     * <p>
     * The event integration associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventIntegrationAssociations(java.util.Collection)} or
     * {@link #withEventIntegrationAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventIntegrationAssociations
     *        The event integration associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventIntegrationAssociationsResult withEventIntegrationAssociations(EventIntegrationAssociation... eventIntegrationAssociations) {
        if (this.eventIntegrationAssociations == null) {
            setEventIntegrationAssociations(new java.util.ArrayList<EventIntegrationAssociation>(eventIntegrationAssociations.length));
        }
        for (EventIntegrationAssociation ele : eventIntegrationAssociations) {
            this.eventIntegrationAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event integration associations.
     * </p>
     * 
     * @param eventIntegrationAssociations
     *        The event integration associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventIntegrationAssociationsResult withEventIntegrationAssociations(
            java.util.Collection<EventIntegrationAssociation> eventIntegrationAssociations) {
        setEventIntegrationAssociations(eventIntegrationAssociations);
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

    public ListEventIntegrationAssociationsResult withNextToken(String nextToken) {
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
        if (getEventIntegrationAssociations() != null)
            sb.append("EventIntegrationAssociations: ").append(getEventIntegrationAssociations()).append(",");
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

        if (obj instanceof ListEventIntegrationAssociationsResult == false)
            return false;
        ListEventIntegrationAssociationsResult other = (ListEventIntegrationAssociationsResult) obj;
        if (other.getEventIntegrationAssociations() == null ^ this.getEventIntegrationAssociations() == null)
            return false;
        if (other.getEventIntegrationAssociations() != null && other.getEventIntegrationAssociations().equals(this.getEventIntegrationAssociations()) == false)
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

        hashCode = prime * hashCode + ((getEventIntegrationAssociations() == null) ? 0 : getEventIntegrationAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventIntegrationAssociationsResult clone() {
        try {
            return (ListEventIntegrationAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
