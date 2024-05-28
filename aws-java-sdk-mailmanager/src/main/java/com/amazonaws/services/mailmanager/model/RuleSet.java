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
 * A rule set contains a list of rules that are evaluated in order. Each rule is evaluated sequentially for each email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The last modification date of the rule set.
     * </p>
     */
    private java.util.Date lastModificationDate;
    /**
     * <p>
     * The identifier of the rule set.
     * </p>
     */
    private String ruleSetId;
    /**
     * <p>
     * A user-friendly name for the rule set.
     * </p>
     */
    private String ruleSetName;

    /**
     * <p>
     * The last modification date of the rule set.
     * </p>
     * 
     * @param lastModificationDate
     *        The last modification date of the rule set.
     */

    public void setLastModificationDate(java.util.Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    /**
     * <p>
     * The last modification date of the rule set.
     * </p>
     * 
     * @return The last modification date of the rule set.
     */

    public java.util.Date getLastModificationDate() {
        return this.lastModificationDate;
    }

    /**
     * <p>
     * The last modification date of the rule set.
     * </p>
     * 
     * @param lastModificationDate
     *        The last modification date of the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSet withLastModificationDate(java.util.Date lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the rule set.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of the rule set.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of the rule set.
     * </p>
     * 
     * @return The identifier of the rule set.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of the rule set.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSet withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the rule set.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set.
     * </p>
     * 
     * @return A user-friendly name for the rule set.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * A user-friendly name for the rule set.
     * </p>
     * 
     * @param ruleSetName
     *        A user-friendly name for the rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSet withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
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
        if (getLastModificationDate() != null)
            sb.append("LastModificationDate: ").append(getLastModificationDate()).append(",");
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getRuleSetName() != null)
            sb.append("RuleSetName: ").append(getRuleSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleSet == false)
            return false;
        RuleSet other = (RuleSet) obj;
        if (other.getLastModificationDate() == null ^ this.getLastModificationDate() == null)
            return false;
        if (other.getLastModificationDate() != null && other.getLastModificationDate().equals(this.getLastModificationDate()) == false)
            return false;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModificationDate() == null) ? 0 : getLastModificationDate().hashCode());
        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        return hashCode;
    }

    @Override
    public RuleSet clone() {
        try {
            return (RuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
