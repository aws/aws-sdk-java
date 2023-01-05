/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rule configuration for an assertion rule. That is, the criteria that you set for specific assertion controls
 * (routing controls) that specify how many control states must be ON after a transaction completes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/RuleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * </p>
     */
    private Boolean inverted;
    /**
     * <p>
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be
     * set when you specify an ATLEAST type.
     * </p>
     */
    private Integer threshold;
    /**
     * <p>
     * A rule can be one of the following: ATLEAST, AND, or OR.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * </p>
     * 
     * @param inverted
     *        Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice
     *        versa.
     */

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    /**
     * <p>
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * </p>
     * 
     * @return Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice
     *         versa.
     */

    public Boolean getInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * </p>
     * 
     * @param inverted
     *        Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice
     *        versa.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleConfig withInverted(Boolean inverted) {
        setInverted(inverted);
        return this;
    }

    /**
     * <p>
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * </p>
     * 
     * @return Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice
     *         versa.
     */

    public Boolean isInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be
     * set when you specify an ATLEAST type.
     * </p>
     * 
     * @param threshold
     *        The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that
     *        must be set when you specify an ATLEAST type.
     */

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be
     * set when you specify an ATLEAST type.
     * </p>
     * 
     * @return The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that
     *         must be set when you specify an ATLEAST type.
     */

    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be
     * set when you specify an ATLEAST type.
     * </p>
     * 
     * @param threshold
     *        The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that
     *        must be set when you specify an ATLEAST type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleConfig withThreshold(Integer threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * A rule can be one of the following: ATLEAST, AND, or OR.
     * </p>
     * 
     * @param type
     *        A rule can be one of the following: ATLEAST, AND, or OR.
     * @see RuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A rule can be one of the following: ATLEAST, AND, or OR.
     * </p>
     * 
     * @return A rule can be one of the following: ATLEAST, AND, or OR.
     * @see RuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A rule can be one of the following: ATLEAST, AND, or OR.
     * </p>
     * 
     * @param type
     *        A rule can be one of the following: ATLEAST, AND, or OR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public RuleConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A rule can be one of the following: ATLEAST, AND, or OR.
     * </p>
     * 
     * @param type
     *        A rule can be one of the following: ATLEAST, AND, or OR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public RuleConfig withType(RuleType type) {
        this.type = type.toString();
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
        if (getInverted() != null)
            sb.append("Inverted: ").append(getInverted()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleConfig == false)
            return false;
        RuleConfig other = (RuleConfig) obj;
        if (other.getInverted() == null ^ this.getInverted() == null)
            return false;
        if (other.getInverted() != null && other.getInverted().equals(this.getInverted()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInverted() == null) ? 0 : getInverted().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RuleConfig clone() {
        try {
            return (RuleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.RuleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
