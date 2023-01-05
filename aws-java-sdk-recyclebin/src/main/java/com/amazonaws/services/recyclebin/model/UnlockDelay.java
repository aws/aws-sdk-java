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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the retention rule unlock delay. The unlock delay is the period after which a retention rule can be
 * modified or edited after it has been unlocked by a user with the required permissions. The retention rule can't be
 * modified or deleted during the unlock delay.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/UnlockDelay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnlockDelay implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     * </p>
     */
    private Integer unlockDelayValue;
    /**
     * <p>
     * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
     * </p>
     */
    private String unlockDelayUnit;

    /**
     * <p>
     * The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     * </p>
     * 
     * @param unlockDelayValue
     *        The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     */

    public void setUnlockDelayValue(Integer unlockDelayValue) {
        this.unlockDelayValue = unlockDelayValue;
    }

    /**
     * <p>
     * The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     * </p>
     * 
     * @return The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     */

    public Integer getUnlockDelayValue() {
        return this.unlockDelayValue;
    }

    /**
     * <p>
     * The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     * </p>
     * 
     * @param unlockDelayValue
     *        The unlock delay period, measured in the unit specified for <b> UnlockDelayUnit</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlockDelay withUnlockDelayValue(Integer unlockDelayValue) {
        setUnlockDelayValue(unlockDelayValue);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
     * </p>
     * 
     * @param unlockDelayUnit
     *        The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in
     *        days.
     * @see UnlockDelayUnit
     */

    public void setUnlockDelayUnit(String unlockDelayUnit) {
        this.unlockDelayUnit = unlockDelayUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
     * </p>
     * 
     * @return The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in
     *         days.
     * @see UnlockDelayUnit
     */

    public String getUnlockDelayUnit() {
        return this.unlockDelayUnit;
    }

    /**
     * <p>
     * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
     * </p>
     * 
     * @param unlockDelayUnit
     *        The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlockDelayUnit
     */

    public UnlockDelay withUnlockDelayUnit(String unlockDelayUnit) {
        setUnlockDelayUnit(unlockDelayUnit);
        return this;
    }

    /**
     * <p>
     * The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in days.
     * </p>
     * 
     * @param unlockDelayUnit
     *        The unit of time in which to measure the unlock delay. Currently, the unlock delay can be measure only in
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlockDelayUnit
     */

    public UnlockDelay withUnlockDelayUnit(UnlockDelayUnit unlockDelayUnit) {
        this.unlockDelayUnit = unlockDelayUnit.toString();
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
        if (getUnlockDelayValue() != null)
            sb.append("UnlockDelayValue: ").append(getUnlockDelayValue()).append(",");
        if (getUnlockDelayUnit() != null)
            sb.append("UnlockDelayUnit: ").append(getUnlockDelayUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlockDelay == false)
            return false;
        UnlockDelay other = (UnlockDelay) obj;
        if (other.getUnlockDelayValue() == null ^ this.getUnlockDelayValue() == null)
            return false;
        if (other.getUnlockDelayValue() != null && other.getUnlockDelayValue().equals(this.getUnlockDelayValue()) == false)
            return false;
        if (other.getUnlockDelayUnit() == null ^ this.getUnlockDelayUnit() == null)
            return false;
        if (other.getUnlockDelayUnit() != null && other.getUnlockDelayUnit().equals(this.getUnlockDelayUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnlockDelayValue() == null) ? 0 : getUnlockDelayValue().hashCode());
        hashCode = prime * hashCode + ((getUnlockDelayUnit() == null) ? 0 : getUnlockDelayUnit().hashCode());
        return hashCode;
    }

    @Override
    public UnlockDelay clone() {
        try {
            return (UnlockDelay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.recyclebin.model.transform.UnlockDelayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
