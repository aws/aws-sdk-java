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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets the autocommit period of files in an FSx for ONTAP SnapLock volume, which determines how long the files must
 * remain unmodified before they're automatically transitioned to the write once, read many (WORM) state.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-autocommit">Autocommit</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AutocommitPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutocommitPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this
     * value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The following
     * ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minutes</code>: 5 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 1 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 1 - 3,650
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 1 - 120
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 1 - 10
     * </p>
     * </li>
     * </ul>
     */
    private Integer value;

    /**
     * <p>
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this
     * value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting
     *        this value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * @see AutocommitPeriodType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this
     * value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * </p>
     * 
     * @return Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting
     *         this value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * @see AutocommitPeriodType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this
     * value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting
     *        this value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutocommitPeriodType
     */

    public AutocommitPeriod withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this
     * value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting
     *        this value to <code>NONE</code> disables autocommit. The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutocommitPeriodType
     */

    public AutocommitPeriod withType(AutocommitPeriodType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The following
     * ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minutes</code>: 5 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 1 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 1 - 3,650
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 1 - 120
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 1 - 10
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The
     *        following ranges are valid: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minutes</code>: 5 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Hours</code>: 1 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code>: 1 - 3,650
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Months</code>: 1 - 120
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Years</code>: 1 - 10
     *        </p>
     *        </li>
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The following
     * ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minutes</code>: 5 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 1 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 1 - 3,650
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 1 - 120
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 1 - 10
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The
     *         following ranges are valid: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minutes</code>: 5 - 65,535
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Hours</code>: 1 - 65,535
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Days</code>: 1 - 3,650
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Months</code>: 1 - 120
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Years</code>: 1 - 10
     *         </p>
     *         </li>
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The following
     * ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minutes</code>: 5 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 1 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 1 - 3,650
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 1 - 120
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 1 - 10
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        Defines the amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. The
     *        following ranges are valid: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minutes</code>: 5 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Hours</code>: 1 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code>: 1 - 3,650
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Months</code>: 1 - 120
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Years</code>: 1 - 10
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutocommitPeriod withValue(Integer value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutocommitPeriod == false)
            return false;
        AutocommitPeriod other = (AutocommitPeriod) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AutocommitPeriod clone() {
        try {
            return (AutocommitPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AutocommitPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
