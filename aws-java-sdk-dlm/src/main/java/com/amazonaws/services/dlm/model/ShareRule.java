/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a rule for sharing snapshots across AWS accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/ShareRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs of the AWS accounts with which to share the snapshots.
     * </p>
     */
    private java.util.List<String> targetAccounts;
    /**
     * <p>
     * The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     * </p>
     */
    private Integer unshareInterval;
    /**
     * <p>
     * The unit of time for the automatic unsharing interval.
     * </p>
     */
    private String unshareIntervalUnit;

    /**
     * <p>
     * The IDs of the AWS accounts with which to share the snapshots.
     * </p>
     * 
     * @return The IDs of the AWS accounts with which to share the snapshots.
     */

    public java.util.List<String> getTargetAccounts() {
        return targetAccounts;
    }

    /**
     * <p>
     * The IDs of the AWS accounts with which to share the snapshots.
     * </p>
     * 
     * @param targetAccounts
     *        The IDs of the AWS accounts with which to share the snapshots.
     */

    public void setTargetAccounts(java.util.Collection<String> targetAccounts) {
        if (targetAccounts == null) {
            this.targetAccounts = null;
            return;
        }

        this.targetAccounts = new java.util.ArrayList<String>(targetAccounts);
    }

    /**
     * <p>
     * The IDs of the AWS accounts with which to share the snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetAccounts(java.util.Collection)} or {@link #withTargetAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetAccounts
     *        The IDs of the AWS accounts with which to share the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareRule withTargetAccounts(String... targetAccounts) {
        if (this.targetAccounts == null) {
            setTargetAccounts(new java.util.ArrayList<String>(targetAccounts.length));
        }
        for (String ele : targetAccounts) {
            this.targetAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts with which to share the snapshots.
     * </p>
     * 
     * @param targetAccounts
     *        The IDs of the AWS accounts with which to share the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareRule withTargetAccounts(java.util.Collection<String> targetAccounts) {
        setTargetAccounts(targetAccounts);
        return this;
    }

    /**
     * <p>
     * The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     * </p>
     * 
     * @param unshareInterval
     *        The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     */

    public void setUnshareInterval(Integer unshareInterval) {
        this.unshareInterval = unshareInterval;
    }

    /**
     * <p>
     * The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     * </p>
     * 
     * @return The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     */

    public Integer getUnshareInterval() {
        return this.unshareInterval;
    }

    /**
     * <p>
     * The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     * </p>
     * 
     * @param unshareInterval
     *        The period after which snapshots that are shared with other AWS accounts are automatically unshared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareRule withUnshareInterval(Integer unshareInterval) {
        setUnshareInterval(unshareInterval);
        return this;
    }

    /**
     * <p>
     * The unit of time for the automatic unsharing interval.
     * </p>
     * 
     * @param unshareIntervalUnit
     *        The unit of time for the automatic unsharing interval.
     * @see RetentionIntervalUnitValues
     */

    public void setUnshareIntervalUnit(String unshareIntervalUnit) {
        this.unshareIntervalUnit = unshareIntervalUnit;
    }

    /**
     * <p>
     * The unit of time for the automatic unsharing interval.
     * </p>
     * 
     * @return The unit of time for the automatic unsharing interval.
     * @see RetentionIntervalUnitValues
     */

    public String getUnshareIntervalUnit() {
        return this.unshareIntervalUnit;
    }

    /**
     * <p>
     * The unit of time for the automatic unsharing interval.
     * </p>
     * 
     * @param unshareIntervalUnit
     *        The unit of time for the automatic unsharing interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public ShareRule withUnshareIntervalUnit(String unshareIntervalUnit) {
        setUnshareIntervalUnit(unshareIntervalUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time for the automatic unsharing interval.
     * </p>
     * 
     * @param unshareIntervalUnit
     *        The unit of time for the automatic unsharing interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionIntervalUnitValues
     */

    public ShareRule withUnshareIntervalUnit(RetentionIntervalUnitValues unshareIntervalUnit) {
        this.unshareIntervalUnit = unshareIntervalUnit.toString();
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
        if (getTargetAccounts() != null)
            sb.append("TargetAccounts: ").append(getTargetAccounts()).append(",");
        if (getUnshareInterval() != null)
            sb.append("UnshareInterval: ").append(getUnshareInterval()).append(",");
        if (getUnshareIntervalUnit() != null)
            sb.append("UnshareIntervalUnit: ").append(getUnshareIntervalUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareRule == false)
            return false;
        ShareRule other = (ShareRule) obj;
        if (other.getTargetAccounts() == null ^ this.getTargetAccounts() == null)
            return false;
        if (other.getTargetAccounts() != null && other.getTargetAccounts().equals(this.getTargetAccounts()) == false)
            return false;
        if (other.getUnshareInterval() == null ^ this.getUnshareInterval() == null)
            return false;
        if (other.getUnshareInterval() != null && other.getUnshareInterval().equals(this.getUnshareInterval()) == false)
            return false;
        if (other.getUnshareIntervalUnit() == null ^ this.getUnshareIntervalUnit() == null)
            return false;
        if (other.getUnshareIntervalUnit() != null && other.getUnshareIntervalUnit().equals(this.getUnshareIntervalUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAccounts() == null) ? 0 : getTargetAccounts().hashCode());
        hashCode = prime * hashCode + ((getUnshareInterval() == null) ? 0 : getUnshareInterval().hashCode());
        hashCode = prime * hashCode + ((getUnshareIntervalUnit() == null) ? 0 : getUnshareIntervalUnit().hashCode());
        return hashCode;
    }

    @Override
    public ShareRule clone() {
        try {
            return (ShareRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ShareRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
