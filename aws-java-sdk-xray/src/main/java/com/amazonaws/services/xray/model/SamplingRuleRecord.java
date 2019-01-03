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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <a>SamplingRule</a> and its metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/SamplingRuleRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingRuleRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sampling rule.
     * </p>
     */
    private SamplingRule samplingRule;
    /**
     * <p>
     * When the rule was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * When the rule was last modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * The sampling rule.
     * </p>
     * 
     * @param samplingRule
     *        The sampling rule.
     */

    public void setSamplingRule(SamplingRule samplingRule) {
        this.samplingRule = samplingRule;
    }

    /**
     * <p>
     * The sampling rule.
     * </p>
     * 
     * @return The sampling rule.
     */

    public SamplingRule getSamplingRule() {
        return this.samplingRule;
    }

    /**
     * <p>
     * The sampling rule.
     * </p>
     * 
     * @param samplingRule
     *        The sampling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleRecord withSamplingRule(SamplingRule samplingRule) {
        setSamplingRule(samplingRule);
        return this;
    }

    /**
     * <p>
     * When the rule was created.
     * </p>
     * 
     * @param createdAt
     *        When the rule was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the rule was created.
     * </p>
     * 
     * @return When the rule was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the rule was created.
     * </p>
     * 
     * @param createdAt
     *        When the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleRecord withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * When the rule was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        When the rule was last modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * When the rule was last modified.
     * </p>
     * 
     * @return When the rule was last modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * When the rule was last modified.
     * </p>
     * 
     * @param modifiedAt
     *        When the rule was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleRecord withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getSamplingRule() != null)
            sb.append("SamplingRule: ").append(getSamplingRule()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamplingRuleRecord == false)
            return false;
        SamplingRuleRecord other = (SamplingRuleRecord) obj;
        if (other.getSamplingRule() == null ^ this.getSamplingRule() == null)
            return false;
        if (other.getSamplingRule() != null && other.getSamplingRule().equals(this.getSamplingRule()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingRule() == null) ? 0 : getSamplingRule().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public SamplingRuleRecord clone() {
        try {
            return (SamplingRuleRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.SamplingRuleRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
