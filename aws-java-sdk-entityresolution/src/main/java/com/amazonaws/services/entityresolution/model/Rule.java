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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>RuleName</code>, and <code>MatchingKeys</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     * <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     * <code>MatchingKeys</code> match.
     * </p>
     */
    private java.util.List<String> matchingKeys;
    /**
     * <p>
     * A name for the matching rule.
     * </p>
     */
    private String ruleName;

    /**
     * <p>
     * A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     * <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     * <code>MatchingKeys</code> match.
     * </p>
     * 
     * @return A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     *         <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     *         <code>MatchingKeys</code> match.
     */

    public java.util.List<String> getMatchingKeys() {
        return matchingKeys;
    }

    /**
     * <p>
     * A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     * <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     * <code>MatchingKeys</code> match.
     * </p>
     * 
     * @param matchingKeys
     *        A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     *        <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     *        <code>MatchingKeys</code> match.
     */

    public void setMatchingKeys(java.util.Collection<String> matchingKeys) {
        if (matchingKeys == null) {
            this.matchingKeys = null;
            return;
        }

        this.matchingKeys = new java.util.ArrayList<String>(matchingKeys);
    }

    /**
     * <p>
     * A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     * <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     * <code>MatchingKeys</code> match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingKeys(java.util.Collection)} or {@link #withMatchingKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchingKeys
     *        A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     *        <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     *        <code>MatchingKeys</code> match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withMatchingKeys(String... matchingKeys) {
        if (this.matchingKeys == null) {
            setMatchingKeys(new java.util.ArrayList<String>(matchingKeys.length));
        }
        for (String ele : matchingKeys) {
            this.matchingKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     * <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     * <code>MatchingKeys</code> match.
     * </p>
     * 
     * @param matchingKeys
     *        A list of <code>MatchingKeys</code>. The <code>MatchingKeys</code> must have been defined in the
     *        <code>SchemaMapping</code>. Two records are considered to match according to this rule if all of the
     *        <code>MatchingKeys</code> match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withMatchingKeys(java.util.Collection<String> matchingKeys) {
        setMatchingKeys(matchingKeys);
        return this;
    }

    /**
     * <p>
     * A name for the matching rule.
     * </p>
     * 
     * @param ruleName
     *        A name for the matching rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * A name for the matching rule.
     * </p>
     * 
     * @return A name for the matching rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * A name for the matching rule.
     * </p>
     * 
     * @param ruleName
     *        A name for the matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withRuleName(String ruleName) {
        setRuleName(ruleName);
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
        if (getMatchingKeys() != null)
            sb.append("MatchingKeys: ").append(getMatchingKeys()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getMatchingKeys() == null ^ this.getMatchingKeys() == null)
            return false;
        if (other.getMatchingKeys() != null && other.getMatchingKeys().equals(this.getMatchingKeys()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchingKeys() == null) ? 0 : getMatchingKeys().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
