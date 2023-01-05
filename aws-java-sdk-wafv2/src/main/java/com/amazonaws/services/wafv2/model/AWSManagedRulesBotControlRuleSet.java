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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for your use of the Bot Control managed rule group, used in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AWSManagedRulesBotControlRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSManagedRulesBotControlRuleSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted
     * level includes all common level rules and adds rules with more advanced inspection criteria. For details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a>.
     * </p>
     */
    private String inspectionLevel;

    /**
     * <p>
     * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted
     * level includes all common level rules and adds rules with more advanced inspection criteria. For details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a>.
     * </p>
     * 
     * @param inspectionLevel
     *        The inspection level to use for the Bot Control rule group. The common level is the least expensive. The
     *        targeted level includes all common level rules and adds rules with more advanced inspection criteria. For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *        Control rule group</a>.
     * @see InspectionLevel
     */

    public void setInspectionLevel(String inspectionLevel) {
        this.inspectionLevel = inspectionLevel;
    }

    /**
     * <p>
     * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted
     * level includes all common level rules and adds rules with more advanced inspection criteria. For details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a>.
     * </p>
     * 
     * @return The inspection level to use for the Bot Control rule group. The common level is the least expensive. The
     *         targeted level includes all common level rules and adds rules with more advanced inspection criteria. For
     *         details, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *         Control rule group</a>.
     * @see InspectionLevel
     */

    public String getInspectionLevel() {
        return this.inspectionLevel;
    }

    /**
     * <p>
     * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted
     * level includes all common level rules and adds rules with more advanced inspection criteria. For details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a>.
     * </p>
     * 
     * @param inspectionLevel
     *        The inspection level to use for the Bot Control rule group. The common level is the least expensive. The
     *        targeted level includes all common level rules and adds rules with more advanced inspection criteria. For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *        Control rule group</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectionLevel
     */

    public AWSManagedRulesBotControlRuleSet withInspectionLevel(String inspectionLevel) {
        setInspectionLevel(inspectionLevel);
        return this;
    }

    /**
     * <p>
     * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted
     * level includes all common level rules and adds rules with more advanced inspection criteria. For details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a>.
     * </p>
     * 
     * @param inspectionLevel
     *        The inspection level to use for the Bot Control rule group. The common level is the least expensive. The
     *        targeted level includes all common level rules and adds rules with more advanced inspection criteria. For
     *        details, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *        Control rule group</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectionLevel
     */

    public AWSManagedRulesBotControlRuleSet withInspectionLevel(InspectionLevel inspectionLevel) {
        this.inspectionLevel = inspectionLevel.toString();
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
        if (getInspectionLevel() != null)
            sb.append("InspectionLevel: ").append(getInspectionLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AWSManagedRulesBotControlRuleSet == false)
            return false;
        AWSManagedRulesBotControlRuleSet other = (AWSManagedRulesBotControlRuleSet) obj;
        if (other.getInspectionLevel() == null ^ this.getInspectionLevel() == null)
            return false;
        if (other.getInspectionLevel() != null && other.getInspectionLevel().equals(this.getInspectionLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInspectionLevel() == null) ? 0 : getInspectionLevel().hashCode());
        return hashCode;
    }

    @Override
    public AWSManagedRulesBotControlRuleSet clone() {
        try {
            return (AWSManagedRulesBotControlRuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AWSManagedRulesBotControlRuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
