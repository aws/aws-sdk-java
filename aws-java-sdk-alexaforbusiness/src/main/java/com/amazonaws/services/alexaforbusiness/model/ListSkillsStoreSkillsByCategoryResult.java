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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSkillsStoreSkillsByCategoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The skill store skills.
     * </p>
     */
    private java.util.List<SkillsStoreSkill> skillsStoreSkills;
    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The skill store skills.
     * </p>
     * 
     * @return The skill store skills.
     */

    public java.util.List<SkillsStoreSkill> getSkillsStoreSkills() {
        return skillsStoreSkills;
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     * 
     * @param skillsStoreSkills
     *        The skill store skills.
     */

    public void setSkillsStoreSkills(java.util.Collection<SkillsStoreSkill> skillsStoreSkills) {
        if (skillsStoreSkills == null) {
            this.skillsStoreSkills = null;
            return;
        }

        this.skillsStoreSkills = new java.util.ArrayList<SkillsStoreSkill>(skillsStoreSkills);
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkillsStoreSkills(java.util.Collection)} or {@link #withSkillsStoreSkills(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param skillsStoreSkills
     *        The skill store skills.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreSkillsByCategoryResult withSkillsStoreSkills(SkillsStoreSkill... skillsStoreSkills) {
        if (this.skillsStoreSkills == null) {
            setSkillsStoreSkills(new java.util.ArrayList<SkillsStoreSkill>(skillsStoreSkills.length));
        }
        for (SkillsStoreSkill ele : skillsStoreSkills) {
            this.skillsStoreSkills.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The skill store skills.
     * </p>
     * 
     * @param skillsStoreSkills
     *        The skill store skills.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreSkillsByCategoryResult withSkillsStoreSkills(java.util.Collection<SkillsStoreSkill> skillsStoreSkills) {
        setSkillsStoreSkills(skillsStoreSkills);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @return The tokens used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsStoreSkillsByCategoryResult withNextToken(String nextToken) {
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
        if (getSkillsStoreSkills() != null)
            sb.append("SkillsStoreSkills: ").append(getSkillsStoreSkills()).append(",");
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

        if (obj instanceof ListSkillsStoreSkillsByCategoryResult == false)
            return false;
        ListSkillsStoreSkillsByCategoryResult other = (ListSkillsStoreSkillsByCategoryResult) obj;
        if (other.getSkillsStoreSkills() == null ^ this.getSkillsStoreSkills() == null)
            return false;
        if (other.getSkillsStoreSkills() != null && other.getSkillsStoreSkills().equals(this.getSkillsStoreSkills()) == false)
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

        hashCode = prime * hashCode + ((getSkillsStoreSkills() == null) ? 0 : getSkillsStoreSkills().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSkillsStoreSkillsByCategoryResult clone() {
        try {
            return (ListSkillsStoreSkillsByCategoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
