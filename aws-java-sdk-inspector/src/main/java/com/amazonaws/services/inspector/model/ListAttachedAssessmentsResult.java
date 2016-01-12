/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAttachedAssessmentsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs specifying the assessments returned by the action.
     * </p>
     */
    private java.util.List<String> assessmentArnList;
    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of ARNs specifying the assessments returned by the action.
     * </p>
     * 
     * @return A list of ARNs specifying the assessments returned by the action.
     */
    public java.util.List<String> getAssessmentArnList() {
        return assessmentArnList;
    }

    /**
     * <p>
     * A list of ARNs specifying the assessments returned by the action.
     * </p>
     * 
     * @param assessmentArnList
     *        A list of ARNs specifying the assessments returned by the action.
     */
    public void setAssessmentArnList(
            java.util.Collection<String> assessmentArnList) {
        if (assessmentArnList == null) {
            this.assessmentArnList = null;
            return;
        }

        this.assessmentArnList = new java.util.ArrayList<String>(
                assessmentArnList);
    }

    /**
     * <p>
     * A list of ARNs specifying the assessments returned by the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAssessmentArnList(java.util.Collection)} or
     * {@link #withAssessmentArnList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assessmentArnList
     *        A list of ARNs specifying the assessments returned by the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedAssessmentsResult withAssessmentArnList(
            String... assessmentArnList) {
        if (this.assessmentArnList == null) {
            setAssessmentArnList(new java.util.ArrayList<String>(
                    assessmentArnList.length));
        }
        for (String ele : assessmentArnList) {
            this.assessmentArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs specifying the assessments returned by the action.
     * </p>
     * 
     * @param assessmentArnList
     *        A list of ARNs specifying the assessments returned by the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedAssessmentsResult withAssessmentArnList(
            java.util.Collection<String> assessmentArnList) {
        setAssessmentArnList(assessmentArnList);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @return When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the <b>nextToken</b> parameter in a subsequent
     *         pagination request. If there is no more data to be listed, this
     *         parameter is set to 'null'.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the <b>nextToken</b> parameter in a subsequent pagination request. If
     * there is no more data to be listed, this parameter is set to 'null'.
     * </p>
     * 
     * @param nextToken
     *        When a response is generated, if there is more data to be listed,
     *        this parameter is present in the response and contains the value
     *        to use for the <b>nextToken</b> parameter in a subsequent
     *        pagination request. If there is no more data to be listed, this
     *        parameter is set to 'null'.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListAttachedAssessmentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssessmentArnList() != null)
            sb.append("AssessmentArnList: " + getAssessmentArnList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttachedAssessmentsResult == false)
            return false;
        ListAttachedAssessmentsResult other = (ListAttachedAssessmentsResult) obj;
        if (other.getAssessmentArnList() == null
                ^ this.getAssessmentArnList() == null)
            return false;
        if (other.getAssessmentArnList() != null
                && other.getAssessmentArnList().equals(
                        this.getAssessmentArnList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentArnList() == null) ? 0
                        : getAssessmentArnList().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachedAssessmentsResult clone() {
        try {
            return (ListAttachedAssessmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}