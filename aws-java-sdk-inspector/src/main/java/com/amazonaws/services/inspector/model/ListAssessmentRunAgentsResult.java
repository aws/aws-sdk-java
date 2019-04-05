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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ListAssessmentRunAgents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssessmentRunAgentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs that specifies the agents returned by the action.
     * </p>
     */
    private java.util.List<AssessmentRunAgent> assessmentRunAgents;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ARNs that specifies the agents returned by the action.
     * </p>
     * 
     * @return A list of ARNs that specifies the agents returned by the action.
     */

    public java.util.List<AssessmentRunAgent> getAssessmentRunAgents() {
        return assessmentRunAgents;
    }

    /**
     * <p>
     * A list of ARNs that specifies the agents returned by the action.
     * </p>
     * 
     * @param assessmentRunAgents
     *        A list of ARNs that specifies the agents returned by the action.
     */

    public void setAssessmentRunAgents(java.util.Collection<AssessmentRunAgent> assessmentRunAgents) {
        if (assessmentRunAgents == null) {
            this.assessmentRunAgents = null;
            return;
        }

        this.assessmentRunAgents = new java.util.ArrayList<AssessmentRunAgent>(assessmentRunAgents);
    }

    /**
     * <p>
     * A list of ARNs that specifies the agents returned by the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentRunAgents(java.util.Collection)} or {@link #withAssessmentRunAgents(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assessmentRunAgents
     *        A list of ARNs that specifies the agents returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentRunAgentsResult withAssessmentRunAgents(AssessmentRunAgent... assessmentRunAgents) {
        if (this.assessmentRunAgents == null) {
            setAssessmentRunAgents(new java.util.ArrayList<AssessmentRunAgent>(assessmentRunAgents.length));
        }
        for (AssessmentRunAgent ele : assessmentRunAgents) {
            this.assessmentRunAgents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs that specifies the agents returned by the action.
     * </p>
     * 
     * @param assessmentRunAgents
     *        A list of ARNs that specifies the agents returned by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentRunAgentsResult withAssessmentRunAgents(java.util.Collection<AssessmentRunAgent> assessmentRunAgents) {
        setAssessmentRunAgents(assessmentRunAgents);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed, this parameter is present in the
     *         response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *         request. If there is no more data to be listed, this parameter is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this parameter is present in the response and
     * contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination request. If there is no
     * more data to be listed, this parameter is set to null.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed, this parameter is present in the
     *        response and contains the value to use for the <b>nextToken</b> parameter in a subsequent pagination
     *        request. If there is no more data to be listed, this parameter is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssessmentRunAgentsResult withNextToken(String nextToken) {
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
        if (getAssessmentRunAgents() != null)
            sb.append("AssessmentRunAgents: ").append(getAssessmentRunAgents()).append(",");
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

        if (obj instanceof ListAssessmentRunAgentsResult == false)
            return false;
        ListAssessmentRunAgentsResult other = (ListAssessmentRunAgentsResult) obj;
        if (other.getAssessmentRunAgents() == null ^ this.getAssessmentRunAgents() == null)
            return false;
        if (other.getAssessmentRunAgents() != null && other.getAssessmentRunAgents().equals(this.getAssessmentRunAgents()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentRunAgents() == null) ? 0 : getAssessmentRunAgents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssessmentRunAgentsResult clone() {
        try {
            return (ListAssessmentRunAgentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
