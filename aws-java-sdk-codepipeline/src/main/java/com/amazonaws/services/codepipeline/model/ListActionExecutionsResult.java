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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListActionExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details for a list of recent executions, such as action execution ID.
     * </p>
     */
    private java.util.List<ActionExecutionDetail> actionExecutionDetails;
    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListActionExecutions call to return the next set of action executions in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details for a list of recent executions, such as action execution ID.
     * </p>
     * 
     * @return The details for a list of recent executions, such as action execution ID.
     */

    public java.util.List<ActionExecutionDetail> getActionExecutionDetails() {
        return actionExecutionDetails;
    }

    /**
     * <p>
     * The details for a list of recent executions, such as action execution ID.
     * </p>
     * 
     * @param actionExecutionDetails
     *        The details for a list of recent executions, such as action execution ID.
     */

    public void setActionExecutionDetails(java.util.Collection<ActionExecutionDetail> actionExecutionDetails) {
        if (actionExecutionDetails == null) {
            this.actionExecutionDetails = null;
            return;
        }

        this.actionExecutionDetails = new java.util.ArrayList<ActionExecutionDetail>(actionExecutionDetails);
    }

    /**
     * <p>
     * The details for a list of recent executions, such as action execution ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionExecutionDetails(java.util.Collection)} or
     * {@link #withActionExecutionDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param actionExecutionDetails
     *        The details for a list of recent executions, such as action execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActionExecutionsResult withActionExecutionDetails(ActionExecutionDetail... actionExecutionDetails) {
        if (this.actionExecutionDetails == null) {
            setActionExecutionDetails(new java.util.ArrayList<ActionExecutionDetail>(actionExecutionDetails.length));
        }
        for (ActionExecutionDetail ele : actionExecutionDetails) {
            this.actionExecutionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details for a list of recent executions, such as action execution ID.
     * </p>
     * 
     * @param actionExecutionDetails
     *        The details for a list of recent executions, such as action execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActionExecutionsResult withActionExecutionDetails(java.util.Collection<ActionExecutionDetail> actionExecutionDetails) {
        setActionExecutionDetails(actionExecutionDetails);
        return this;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListActionExecutions call to return the next set of action executions in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned and can be
     *        used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListActionExecutions call to return the next set of action executions in the list.
     * </p>
     * 
     * @return If the amount of returned information is significantly large, an identifier is also returned and can be
     *         used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListActionExecutions call to return the next set of action executions in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned and can be
     *        used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActionExecutionsResult withNextToken(String nextToken) {
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
        if (getActionExecutionDetails() != null)
            sb.append("ActionExecutionDetails: ").append(getActionExecutionDetails()).append(",");
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

        if (obj instanceof ListActionExecutionsResult == false)
            return false;
        ListActionExecutionsResult other = (ListActionExecutionsResult) obj;
        if (other.getActionExecutionDetails() == null ^ this.getActionExecutionDetails() == null)
            return false;
        if (other.getActionExecutionDetails() != null && other.getActionExecutionDetails().equals(this.getActionExecutionDetails()) == false)
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

        hashCode = prime * hashCode + ((getActionExecutionDetails() == null) ? 0 : getActionExecutionDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListActionExecutionsResult clone() {
        try {
            return (ListActionExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
