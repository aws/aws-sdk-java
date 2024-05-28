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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One or more actions to update finding fields if a finding matches the defined criteria of the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AutomationRulesAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code> finding
     * field classifies findings in the format of namespace/category/classifier. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies that the automation rule action is an update to a finding field.
     * </p>
     */
    private AutomationRulesFindingFieldsUpdate findingFieldsUpdate;

    /**
     * <p>
     * Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code> finding
     * field classifies findings in the format of namespace/category/classifier. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param type
     *        Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code>
     *        finding field classifies findings in the format of namespace/category/classifier. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * @see AutomationRulesActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code> finding
     * field classifies findings in the format of namespace/category/classifier. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @return Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code>
     *         finding field classifies findings in the format of namespace/category/classifier. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *         >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * @see AutomationRulesActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code> finding
     * field classifies findings in the format of namespace/category/classifier. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param type
     *        Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code>
     *        finding field classifies findings in the format of namespace/category/classifier. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationRulesActionType
     */

    public AutomationRulesAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code> finding
     * field classifies findings in the format of namespace/category/classifier. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     * >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param type
     *        Specifies that the rule action should update the <code>Types</code> finding field. The <code>Types</code>
     *        finding field classifies findings in the format of namespace/category/classifier. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html"
     *        >Types taxonomy for ASFF</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationRulesActionType
     */

    public AutomationRulesAction withType(AutomationRulesActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that the automation rule action is an update to a finding field.
     * </p>
     * 
     * @param findingFieldsUpdate
     *        Specifies that the automation rule action is an update to a finding field.
     */

    public void setFindingFieldsUpdate(AutomationRulesFindingFieldsUpdate findingFieldsUpdate) {
        this.findingFieldsUpdate = findingFieldsUpdate;
    }

    /**
     * <p>
     * Specifies that the automation rule action is an update to a finding field.
     * </p>
     * 
     * @return Specifies that the automation rule action is an update to a finding field.
     */

    public AutomationRulesFindingFieldsUpdate getFindingFieldsUpdate() {
        return this.findingFieldsUpdate;
    }

    /**
     * <p>
     * Specifies that the automation rule action is an update to a finding field.
     * </p>
     * 
     * @param findingFieldsUpdate
     *        Specifies that the automation rule action is an update to a finding field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesAction withFindingFieldsUpdate(AutomationRulesFindingFieldsUpdate findingFieldsUpdate) {
        setFindingFieldsUpdate(findingFieldsUpdate);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getFindingFieldsUpdate() != null)
            sb.append("FindingFieldsUpdate: ").append(getFindingFieldsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationRulesAction == false)
            return false;
        AutomationRulesAction other = (AutomationRulesAction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getFindingFieldsUpdate() == null ^ this.getFindingFieldsUpdate() == null)
            return false;
        if (other.getFindingFieldsUpdate() != null && other.getFindingFieldsUpdate().equals(this.getFindingFieldsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFindingFieldsUpdate() == null) ? 0 : getFindingFieldsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public AutomationRulesAction clone() {
        try {
            return (AutomationRulesAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AutomationRulesActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
