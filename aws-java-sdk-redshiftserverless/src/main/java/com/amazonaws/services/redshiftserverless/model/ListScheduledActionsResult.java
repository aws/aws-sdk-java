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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListScheduledActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduledActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * All of the returned scheduled action association objects.
     * </p>
     */
    private java.util.List<ScheduledActionAssociation> scheduledActions;

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledActionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * All of the returned scheduled action association objects.
     * </p>
     * 
     * @return All of the returned scheduled action association objects.
     */

    public java.util.List<ScheduledActionAssociation> getScheduledActions() {
        return scheduledActions;
    }

    /**
     * <p>
     * All of the returned scheduled action association objects.
     * </p>
     * 
     * @param scheduledActions
     *        All of the returned scheduled action association objects.
     */

    public void setScheduledActions(java.util.Collection<ScheduledActionAssociation> scheduledActions) {
        if (scheduledActions == null) {
            this.scheduledActions = null;
            return;
        }

        this.scheduledActions = new java.util.ArrayList<ScheduledActionAssociation>(scheduledActions);
    }

    /**
     * <p>
     * All of the returned scheduled action association objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledActions(java.util.Collection)} or {@link #withScheduledActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduledActions
     *        All of the returned scheduled action association objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledActionsResult withScheduledActions(ScheduledActionAssociation... scheduledActions) {
        if (this.scheduledActions == null) {
            setScheduledActions(new java.util.ArrayList<ScheduledActionAssociation>(scheduledActions.length));
        }
        for (ScheduledActionAssociation ele : scheduledActions) {
            this.scheduledActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All of the returned scheduled action association objects.
     * </p>
     * 
     * @param scheduledActions
     *        All of the returned scheduled action association objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledActionsResult withScheduledActions(java.util.Collection<ScheduledActionAssociation> scheduledActions) {
        setScheduledActions(scheduledActions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScheduledActions() != null)
            sb.append("ScheduledActions: ").append(getScheduledActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScheduledActionsResult == false)
            return false;
        ListScheduledActionsResult other = (ListScheduledActionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduledActions() == null ^ this.getScheduledActions() == null)
            return false;
        if (other.getScheduledActions() != null && other.getScheduledActions().equals(this.getScheduledActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScheduledActions() == null) ? 0 : getScheduledActions().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduledActionsResult clone() {
        try {
            return (ListScheduledActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
