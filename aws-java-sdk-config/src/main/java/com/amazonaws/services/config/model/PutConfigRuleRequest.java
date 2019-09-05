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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule that you want to add to your account.
     * </p>
     */
    private ConfigRule configRule;
    /**
     * <p>
     * An array of tag object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The rule that you want to add to your account.
     * </p>
     * 
     * @param configRule
     *        The rule that you want to add to your account.
     */

    public void setConfigRule(ConfigRule configRule) {
        this.configRule = configRule;
    }

    /**
     * <p>
     * The rule that you want to add to your account.
     * </p>
     * 
     * @return The rule that you want to add to your account.
     */

    public ConfigRule getConfigRule() {
        return this.configRule;
    }

    /**
     * <p>
     * The rule that you want to add to your account.
     * </p>
     * 
     * @param configRule
     *        The rule that you want to add to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigRuleRequest withConfigRule(ConfigRule configRule) {
        setConfigRule(configRule);
        return this;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @return An array of tag object.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigRuleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tag object.
     * </p>
     * 
     * @param tags
     *        An array of tag object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConfigRule() != null)
            sb.append("ConfigRule: ").append(getConfigRule()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigRuleRequest == false)
            return false;
        PutConfigRuleRequest other = (PutConfigRuleRequest) obj;
        if (other.getConfigRule() == null ^ this.getConfigRule() == null)
            return false;
        if (other.getConfigRule() != null && other.getConfigRule().equals(this.getConfigRule()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRule() == null) ? 0 : getConfigRule().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigRuleRequest clone() {
        return (PutConfigRuleRequest) super.clone();
    }

}
