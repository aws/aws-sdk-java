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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListEventBridgeRuleTemplateGroupsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListEventBridgeRuleTemplateGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventBridgeRuleTemplateGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private java.util.List<EventBridgeRuleTemplateGroupSummary> eventBridgeRuleTemplateGroups;
    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;

    /**
     * @return
     */

    public java.util.List<EventBridgeRuleTemplateGroupSummary> getEventBridgeRuleTemplateGroups() {
        return eventBridgeRuleTemplateGroups;
    }

    /**
     * @param eventBridgeRuleTemplateGroups
     */

    public void setEventBridgeRuleTemplateGroups(java.util.Collection<EventBridgeRuleTemplateGroupSummary> eventBridgeRuleTemplateGroups) {
        if (eventBridgeRuleTemplateGroups == null) {
            this.eventBridgeRuleTemplateGroups = null;
            return;
        }

        this.eventBridgeRuleTemplateGroups = new java.util.ArrayList<EventBridgeRuleTemplateGroupSummary>(eventBridgeRuleTemplateGroups);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBridgeRuleTemplateGroups(java.util.Collection)} or
     * {@link #withEventBridgeRuleTemplateGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventBridgeRuleTemplateGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplateGroupsResult withEventBridgeRuleTemplateGroups(EventBridgeRuleTemplateGroupSummary... eventBridgeRuleTemplateGroups) {
        if (this.eventBridgeRuleTemplateGroups == null) {
            setEventBridgeRuleTemplateGroups(new java.util.ArrayList<EventBridgeRuleTemplateGroupSummary>(eventBridgeRuleTemplateGroups.length));
        }
        for (EventBridgeRuleTemplateGroupSummary ele : eventBridgeRuleTemplateGroups) {
            this.eventBridgeRuleTemplateGroups.add(ele);
        }
        return this;
    }

    /**
     * @param eventBridgeRuleTemplateGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplateGroupsResult withEventBridgeRuleTemplateGroups(
            java.util.Collection<EventBridgeRuleTemplateGroupSummary> eventBridgeRuleTemplateGroups) {
        setEventBridgeRuleTemplateGroups(eventBridgeRuleTemplateGroups);
        return this;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @return A token used to retrieve the next set of results in paginated list responses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventBridgeRuleTemplateGroupsResult withNextToken(String nextToken) {
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
        if (getEventBridgeRuleTemplateGroups() != null)
            sb.append("EventBridgeRuleTemplateGroups: ").append(getEventBridgeRuleTemplateGroups()).append(",");
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

        if (obj instanceof ListEventBridgeRuleTemplateGroupsResult == false)
            return false;
        ListEventBridgeRuleTemplateGroupsResult other = (ListEventBridgeRuleTemplateGroupsResult) obj;
        if (other.getEventBridgeRuleTemplateGroups() == null ^ this.getEventBridgeRuleTemplateGroups() == null)
            return false;
        if (other.getEventBridgeRuleTemplateGroups() != null
                && other.getEventBridgeRuleTemplateGroups().equals(this.getEventBridgeRuleTemplateGroups()) == false)
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

        hashCode = prime * hashCode + ((getEventBridgeRuleTemplateGroups() == null) ? 0 : getEventBridgeRuleTemplateGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventBridgeRuleTemplateGroupsResult clone() {
        try {
            return (ListEventBridgeRuleTemplateGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
