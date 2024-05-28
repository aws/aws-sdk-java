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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The conditional expression used to evaluate an email for determining if a rule action should be taken.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition applies to a boolean expression passed in this field.
     * </p>
     */
    private RuleBooleanExpression booleanExpression;
    /**
     * <p>
     * The condition applies to a DMARC policy expression passed in this field.
     * </p>
     */
    private RuleDmarcExpression dmarcExpression;
    /**
     * <p>
     * The condition applies to an IP address expression passed in this field.
     * </p>
     */
    private RuleIpExpression ipExpression;
    /**
     * <p>
     * The condition applies to a number expression passed in this field.
     * </p>
     */
    private RuleNumberExpression numberExpression;
    /**
     * <p>
     * The condition applies to a string expression passed in this field.
     * </p>
     */
    private RuleStringExpression stringExpression;
    /**
     * <p>
     * The condition applies to a verdict expression passed in this field.
     * </p>
     */
    private RuleVerdictExpression verdictExpression;

    /**
     * <p>
     * The condition applies to a boolean expression passed in this field.
     * </p>
     * 
     * @param booleanExpression
     *        The condition applies to a boolean expression passed in this field.
     */

    public void setBooleanExpression(RuleBooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

    /**
     * <p>
     * The condition applies to a boolean expression passed in this field.
     * </p>
     * 
     * @return The condition applies to a boolean expression passed in this field.
     */

    public RuleBooleanExpression getBooleanExpression() {
        return this.booleanExpression;
    }

    /**
     * <p>
     * The condition applies to a boolean expression passed in this field.
     * </p>
     * 
     * @param booleanExpression
     *        The condition applies to a boolean expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withBooleanExpression(RuleBooleanExpression booleanExpression) {
        setBooleanExpression(booleanExpression);
        return this;
    }

    /**
     * <p>
     * The condition applies to a DMARC policy expression passed in this field.
     * </p>
     * 
     * @param dmarcExpression
     *        The condition applies to a DMARC policy expression passed in this field.
     */

    public void setDmarcExpression(RuleDmarcExpression dmarcExpression) {
        this.dmarcExpression = dmarcExpression;
    }

    /**
     * <p>
     * The condition applies to a DMARC policy expression passed in this field.
     * </p>
     * 
     * @return The condition applies to a DMARC policy expression passed in this field.
     */

    public RuleDmarcExpression getDmarcExpression() {
        return this.dmarcExpression;
    }

    /**
     * <p>
     * The condition applies to a DMARC policy expression passed in this field.
     * </p>
     * 
     * @param dmarcExpression
     *        The condition applies to a DMARC policy expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withDmarcExpression(RuleDmarcExpression dmarcExpression) {
        setDmarcExpression(dmarcExpression);
        return this;
    }

    /**
     * <p>
     * The condition applies to an IP address expression passed in this field.
     * </p>
     * 
     * @param ipExpression
     *        The condition applies to an IP address expression passed in this field.
     */

    public void setIpExpression(RuleIpExpression ipExpression) {
        this.ipExpression = ipExpression;
    }

    /**
     * <p>
     * The condition applies to an IP address expression passed in this field.
     * </p>
     * 
     * @return The condition applies to an IP address expression passed in this field.
     */

    public RuleIpExpression getIpExpression() {
        return this.ipExpression;
    }

    /**
     * <p>
     * The condition applies to an IP address expression passed in this field.
     * </p>
     * 
     * @param ipExpression
     *        The condition applies to an IP address expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withIpExpression(RuleIpExpression ipExpression) {
        setIpExpression(ipExpression);
        return this;
    }

    /**
     * <p>
     * The condition applies to a number expression passed in this field.
     * </p>
     * 
     * @param numberExpression
     *        The condition applies to a number expression passed in this field.
     */

    public void setNumberExpression(RuleNumberExpression numberExpression) {
        this.numberExpression = numberExpression;
    }

    /**
     * <p>
     * The condition applies to a number expression passed in this field.
     * </p>
     * 
     * @return The condition applies to a number expression passed in this field.
     */

    public RuleNumberExpression getNumberExpression() {
        return this.numberExpression;
    }

    /**
     * <p>
     * The condition applies to a number expression passed in this field.
     * </p>
     * 
     * @param numberExpression
     *        The condition applies to a number expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withNumberExpression(RuleNumberExpression numberExpression) {
        setNumberExpression(numberExpression);
        return this;
    }

    /**
     * <p>
     * The condition applies to a string expression passed in this field.
     * </p>
     * 
     * @param stringExpression
     *        The condition applies to a string expression passed in this field.
     */

    public void setStringExpression(RuleStringExpression stringExpression) {
        this.stringExpression = stringExpression;
    }

    /**
     * <p>
     * The condition applies to a string expression passed in this field.
     * </p>
     * 
     * @return The condition applies to a string expression passed in this field.
     */

    public RuleStringExpression getStringExpression() {
        return this.stringExpression;
    }

    /**
     * <p>
     * The condition applies to a string expression passed in this field.
     * </p>
     * 
     * @param stringExpression
     *        The condition applies to a string expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withStringExpression(RuleStringExpression stringExpression) {
        setStringExpression(stringExpression);
        return this;
    }

    /**
     * <p>
     * The condition applies to a verdict expression passed in this field.
     * </p>
     * 
     * @param verdictExpression
     *        The condition applies to a verdict expression passed in this field.
     */

    public void setVerdictExpression(RuleVerdictExpression verdictExpression) {
        this.verdictExpression = verdictExpression;
    }

    /**
     * <p>
     * The condition applies to a verdict expression passed in this field.
     * </p>
     * 
     * @return The condition applies to a verdict expression passed in this field.
     */

    public RuleVerdictExpression getVerdictExpression() {
        return this.verdictExpression;
    }

    /**
     * <p>
     * The condition applies to a verdict expression passed in this field.
     * </p>
     * 
     * @param verdictExpression
     *        The condition applies to a verdict expression passed in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withVerdictExpression(RuleVerdictExpression verdictExpression) {
        setVerdictExpression(verdictExpression);
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
        if (getBooleanExpression() != null)
            sb.append("BooleanExpression: ").append(getBooleanExpression()).append(",");
        if (getDmarcExpression() != null)
            sb.append("DmarcExpression: ").append(getDmarcExpression()).append(",");
        if (getIpExpression() != null)
            sb.append("IpExpression: ").append(getIpExpression()).append(",");
        if (getNumberExpression() != null)
            sb.append("NumberExpression: ").append(getNumberExpression()).append(",");
        if (getStringExpression() != null)
            sb.append("StringExpression: ").append(getStringExpression()).append(",");
        if (getVerdictExpression() != null)
            sb.append("VerdictExpression: ").append(getVerdictExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleCondition == false)
            return false;
        RuleCondition other = (RuleCondition) obj;
        if (other.getBooleanExpression() == null ^ this.getBooleanExpression() == null)
            return false;
        if (other.getBooleanExpression() != null && other.getBooleanExpression().equals(this.getBooleanExpression()) == false)
            return false;
        if (other.getDmarcExpression() == null ^ this.getDmarcExpression() == null)
            return false;
        if (other.getDmarcExpression() != null && other.getDmarcExpression().equals(this.getDmarcExpression()) == false)
            return false;
        if (other.getIpExpression() == null ^ this.getIpExpression() == null)
            return false;
        if (other.getIpExpression() != null && other.getIpExpression().equals(this.getIpExpression()) == false)
            return false;
        if (other.getNumberExpression() == null ^ this.getNumberExpression() == null)
            return false;
        if (other.getNumberExpression() != null && other.getNumberExpression().equals(this.getNumberExpression()) == false)
            return false;
        if (other.getStringExpression() == null ^ this.getStringExpression() == null)
            return false;
        if (other.getStringExpression() != null && other.getStringExpression().equals(this.getStringExpression()) == false)
            return false;
        if (other.getVerdictExpression() == null ^ this.getVerdictExpression() == null)
            return false;
        if (other.getVerdictExpression() != null && other.getVerdictExpression().equals(this.getVerdictExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBooleanExpression() == null) ? 0 : getBooleanExpression().hashCode());
        hashCode = prime * hashCode + ((getDmarcExpression() == null) ? 0 : getDmarcExpression().hashCode());
        hashCode = prime * hashCode + ((getIpExpression() == null) ? 0 : getIpExpression().hashCode());
        hashCode = prime * hashCode + ((getNumberExpression() == null) ? 0 : getNumberExpression().hashCode());
        hashCode = prime * hashCode + ((getStringExpression() == null) ? 0 : getStringExpression().hashCode());
        hashCode = prime * hashCode + ((getVerdictExpression() == null) ? 0 : getVerdictExpression().hashCode());
        return hashCode;
    }

    @Override
    public RuleCondition clone() {
        try {
            return (RuleCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
