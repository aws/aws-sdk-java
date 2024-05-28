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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the settings for a keyword match task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KeywordMatchConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeywordMatchConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the keyword match rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The keywords or phrases that you want to match.
     * </p>
     */
    private java.util.List<String> keywords;
    /**
     * <p>
     * Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches when all
     * the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * The name of the keyword match rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the keyword match rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the keyword match rule.
     * </p>
     * 
     * @return The name of the keyword match rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the keyword match rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the keyword match rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordMatchConfiguration withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The keywords or phrases that you want to match.
     * </p>
     * 
     * @return The keywords or phrases that you want to match.
     */

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * The keywords or phrases that you want to match.
     * </p>
     * 
     * @param keywords
     *        The keywords or phrases that you want to match.
     */

    public void setKeywords(java.util.Collection<String> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<String>(keywords);
    }

    /**
     * <p>
     * The keywords or phrases that you want to match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        The keywords or phrases that you want to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordMatchConfiguration withKeywords(String... keywords) {
        if (this.keywords == null) {
            setKeywords(new java.util.ArrayList<String>(keywords.length));
        }
        for (String ele : keywords) {
            this.keywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keywords or phrases that you want to match.
     * </p>
     * 
     * @param keywords
     *        The keywords or phrases that you want to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordMatchConfiguration withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches when all
     * the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * </p>
     * 
     * @param negate
     *        Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches
     *        when all the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches when all
     * the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * </p>
     * 
     * @return Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches
     *         when all the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches when all
     * the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * </p>
     * 
     * @param negate
     *        Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches
     *        when all the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordMatchConfiguration withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches when all
     * the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     * </p>
     * 
     * @return Matches keywords or phrases on their presence or absence. If set to <code>TRUE</code>, the rule matches
     *         when all the specified keywords or phrases are absent. Default: <code>FALSE</code>.
     */

    public Boolean isNegate() {
        return this.negate;
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeywordMatchConfiguration == false)
            return false;
        KeywordMatchConfiguration other = (KeywordMatchConfiguration) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public KeywordMatchConfiguration clone() {
        try {
            return (KeywordMatchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KeywordMatchConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
