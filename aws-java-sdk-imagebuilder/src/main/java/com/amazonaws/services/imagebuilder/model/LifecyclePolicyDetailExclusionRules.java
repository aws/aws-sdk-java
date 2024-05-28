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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies resources that lifecycle policy actions should not apply to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetailExclusionRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetailExclusionRules implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image resources that
     * have them.
     * </p>
     */
    private java.util.Map<String, String> tagMap;
    /**
     * <p>
     * Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     * </p>
     */
    private LifecyclePolicyDetailExclusionRulesAmis amis;

    /**
     * <p>
     * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image resources that
     * have them.
     * </p>
     * 
     * @return Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image
     *         resources that have them.
     */

    public java.util.Map<String, String> getTagMap() {
        return tagMap;
    }

    /**
     * <p>
     * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image resources that
     * have them.
     * </p>
     * 
     * @param tagMap
     *        Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image
     *        resources that have them.
     */

    public void setTagMap(java.util.Map<String, String> tagMap) {
        this.tagMap = tagMap;
    }

    /**
     * <p>
     * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image resources that
     * have them.
     * </p>
     * 
     * @param tagMap
     *        Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder image
     *        resources that have them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRules withTagMap(java.util.Map<String, String> tagMap) {
        setTagMap(tagMap);
        return this;
    }

    /**
     * Add a single TagMap entry
     *
     * @see LifecyclePolicyDetailExclusionRules#withTagMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRules addTagMapEntry(String key, String value) {
        if (null == this.tagMap) {
            this.tagMap = new java.util.HashMap<String, String>();
        }
        if (this.tagMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRules clearTagMapEntries() {
        this.tagMap = null;
        return this;
    }

    /**
     * <p>
     * Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     * </p>
     * 
     * @param amis
     *        Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     */

    public void setAmis(LifecyclePolicyDetailExclusionRulesAmis amis) {
        this.amis = amis;
    }

    /**
     * <p>
     * Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     * </p>
     * 
     * @return Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle
     *         action.
     */

    public LifecyclePolicyDetailExclusionRulesAmis getAmis() {
        return this.amis;
    }

    /**
     * <p>
     * Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     * </p>
     * 
     * @param amis
     *        Lists configuration values that apply to AMIs that Image Builder should exclude from the lifecycle action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRules withAmis(LifecyclePolicyDetailExclusionRulesAmis amis) {
        setAmis(amis);
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
        if (getTagMap() != null)
            sb.append("TagMap: ").append(getTagMap()).append(",");
        if (getAmis() != null)
            sb.append("Amis: ").append(getAmis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetailExclusionRules == false)
            return false;
        LifecyclePolicyDetailExclusionRules other = (LifecyclePolicyDetailExclusionRules) obj;
        if (other.getTagMap() == null ^ this.getTagMap() == null)
            return false;
        if (other.getTagMap() != null && other.getTagMap().equals(this.getTagMap()) == false)
            return false;
        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagMap() == null) ? 0 : getTagMap().hashCode());
        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetailExclusionRules clone() {
        try {
            return (LifecyclePolicyDetailExclusionRules) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailExclusionRulesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
