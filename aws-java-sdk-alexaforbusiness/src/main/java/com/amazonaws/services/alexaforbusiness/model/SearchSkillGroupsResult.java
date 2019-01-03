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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSkillGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     */
    private java.util.List<SkillGroupData> skillGroups;
    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * 
     * @return The skill groups that meet the filter criteria, in sort order.
     */

    public java.util.List<SkillGroupData> getSkillGroups() {
        return skillGroups;
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * 
     * @param skillGroups
     *        The skill groups that meet the filter criteria, in sort order.
     */

    public void setSkillGroups(java.util.Collection<SkillGroupData> skillGroups) {
        if (skillGroups == null) {
            this.skillGroups = null;
            return;
        }

        this.skillGroups = new java.util.ArrayList<SkillGroupData>(skillGroups);
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkillGroups(java.util.Collection)} or {@link #withSkillGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param skillGroups
     *        The skill groups that meet the filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSkillGroupsResult withSkillGroups(SkillGroupData... skillGroups) {
        if (this.skillGroups == null) {
            setSkillGroups(new java.util.ArrayList<SkillGroupData>(skillGroups.length));
        }
        for (SkillGroupData ele : skillGroups) {
            this.skillGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The skill groups that meet the filter criteria, in sort order.
     * </p>
     * 
     * @param skillGroups
     *        The skill groups that meet the filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSkillGroupsResult withSkillGroups(java.util.Collection<SkillGroupData> skillGroups) {
        setSkillGroups(skillGroups);
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

    public SearchSkillGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of skill groups returned.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     * 
     * @return The total number of skill groups returned.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of skill groups returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of skill groups returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSkillGroupsResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
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
        if (getSkillGroups() != null)
            sb.append("SkillGroups: ").append(getSkillGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSkillGroupsResult == false)
            return false;
        SearchSkillGroupsResult other = (SearchSkillGroupsResult) obj;
        if (other.getSkillGroups() == null ^ this.getSkillGroups() == null)
            return false;
        if (other.getSkillGroups() != null && other.getSkillGroups().equals(this.getSkillGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroups() == null) ? 0 : getSkillGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchSkillGroupsResult clone() {
        try {
            return (SearchSkillGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
