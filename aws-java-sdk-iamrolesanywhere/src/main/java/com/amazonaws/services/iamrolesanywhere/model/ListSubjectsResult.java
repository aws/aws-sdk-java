/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListSubjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of subjects.
     * </p>
     */
    private java.util.List<SubjectSummary> subjects;

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous operation did not show all
     *         results. To get the next results, call the operation again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubjectsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of subjects.
     * </p>
     * 
     * @return A list of subjects.
     */

    public java.util.List<SubjectSummary> getSubjects() {
        return subjects;
    }

    /**
     * <p>
     * A list of subjects.
     * </p>
     * 
     * @param subjects
     *        A list of subjects.
     */

    public void setSubjects(java.util.Collection<SubjectSummary> subjects) {
        if (subjects == null) {
            this.subjects = null;
            return;
        }

        this.subjects = new java.util.ArrayList<SubjectSummary>(subjects);
    }

    /**
     * <p>
     * A list of subjects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjects(java.util.Collection)} or {@link #withSubjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subjects
     *        A list of subjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubjectsResult withSubjects(SubjectSummary... subjects) {
        if (this.subjects == null) {
            setSubjects(new java.util.ArrayList<SubjectSummary>(subjects.length));
        }
        for (SubjectSummary ele : subjects) {
            this.subjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subjects.
     * </p>
     * 
     * @param subjects
     *        A list of subjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubjectsResult withSubjects(java.util.Collection<SubjectSummary> subjects) {
        setSubjects(subjects);
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
        if (getSubjects() != null)
            sb.append("Subjects: ").append(getSubjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubjectsResult == false)
            return false;
        ListSubjectsResult other = (ListSubjectsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSubjects() == null ^ this.getSubjects() == null)
            return false;
        if (other.getSubjects() != null && other.getSubjects().equals(this.getSubjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSubjects() == null) ? 0 : getSubjects().hashCode());
        return hashCode;
    }

    @Override
    public ListSubjectsResult clone() {
        try {
            return (ListSubjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
