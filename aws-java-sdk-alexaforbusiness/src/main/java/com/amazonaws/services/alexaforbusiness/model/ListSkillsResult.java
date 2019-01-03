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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSkillsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of enabled skills requested. Required.
     * </p>
     */
    private java.util.List<SkillSummary> skillSummaries;
    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of enabled skills requested. Required.
     * </p>
     * 
     * @return The list of enabled skills requested. Required.
     */

    public java.util.List<SkillSummary> getSkillSummaries() {
        return skillSummaries;
    }

    /**
     * <p>
     * The list of enabled skills requested. Required.
     * </p>
     * 
     * @param skillSummaries
     *        The list of enabled skills requested. Required.
     */

    public void setSkillSummaries(java.util.Collection<SkillSummary> skillSummaries) {
        if (skillSummaries == null) {
            this.skillSummaries = null;
            return;
        }

        this.skillSummaries = new java.util.ArrayList<SkillSummary>(skillSummaries);
    }

    /**
     * <p>
     * The list of enabled skills requested. Required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkillSummaries(java.util.Collection)} or {@link #withSkillSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param skillSummaries
     *        The list of enabled skills requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsResult withSkillSummaries(SkillSummary... skillSummaries) {
        if (this.skillSummaries == null) {
            setSkillSummaries(new java.util.ArrayList<SkillSummary>(skillSummaries.length));
        }
        for (SkillSummary ele : skillSummaries) {
            this.skillSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of enabled skills requested. Required.
     * </p>
     * 
     * @param skillSummaries
     *        The list of enabled skills requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsResult withSkillSummaries(java.util.Collection<SkillSummary> skillSummaries) {
        setSkillSummaries(skillSummaries);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsResult withNextToken(String nextToken) {
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
        if (getSkillSummaries() != null)
            sb.append("SkillSummaries: ").append(getSkillSummaries()).append(",");
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

        if (obj instanceof ListSkillsResult == false)
            return false;
        ListSkillsResult other = (ListSkillsResult) obj;
        if (other.getSkillSummaries() == null ^ this.getSkillSummaries() == null)
            return false;
        if (other.getSkillSummaries() != null && other.getSkillSummaries().equals(this.getSkillSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSkillSummaries() == null) ? 0 : getSkillSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSkillsResult clone() {
        try {
            return (ListSkillsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
