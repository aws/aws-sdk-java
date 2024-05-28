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
 * Specifies the retention period of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. Files can't
 * be deleted or modified during the retention period.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-retention.html">Working
 * with the retention period in SnapLock</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RetentionPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of the valid
     * types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     * <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a value
     * for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Seconds</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minutes</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 0 - 24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 0 - 365
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 0 - 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 0 - 100
     * </p>
     * </li>
     * </ul>
     */
    private Integer value;

    /**
     * <p>
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of the valid
     * types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     * <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of
     *        the valid types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     *        <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * @see RetentionPeriodType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of the valid
     * types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     * <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * </p>
     * 
     * @return Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of
     *         the valid types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     *         <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * @see RetentionPeriodType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of the valid
     * types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     * <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of
     *        the valid types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     *        <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriodType
     */

    public RetentionPeriod withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of the valid
     * types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     * <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * </p>
     * 
     * @param type
     *        Defines the type of time for the retention period of an FSx for ONTAP SnapLock volume. Set it to one of
     *        the valid types. If you set it to <code>INFINITE</code>, the files are retained forever. If you set it to
     *        <code>UNSPECIFIED</code>, the files are retained until you set an explicit retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetentionPeriodType
     */

    public RetentionPeriod withType(RetentionPeriodType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a value
     * for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Seconds</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minutes</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 0 - 24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 0 - 365
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 0 - 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 0 - 100
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a
     *        value for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges
     *        are valid: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Seconds</code>: 0 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minutes</code>: 0 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Hours</code>: 0 - 24
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code>: 0 - 365
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Months</code>: 0 - 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Years</code>: 0 - 100
     *        </p>
     *        </li>
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a value
     * for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Seconds</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minutes</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 0 - 24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 0 - 365
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 0 - 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 0 - 100
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a
     *         value for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges
     *         are valid: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Seconds</code>: 0 - 65,535
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Minutes</code>: 0 - 65,535
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Hours</code>: 0 - 24
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Days</code>: 0 - 365
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Months</code>: 0 - 12
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Years</code>: 0 - 100
     *         </p>
     *         </li>
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a value
     * for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Seconds</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minutes</code>: 0 - 65,535
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Hours</code>: 0 - 24
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Days</code>: 0 - 365
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Months</code>: 0 - 12
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Years</code>: 0 - 100
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        Defines the amount of time for the retention period of an FSx for ONTAP SnapLock volume. You can't set a
     *        value for <code>INFINITE</code> or <code>UNSPECIFIED</code>. For all other options, the following ranges
     *        are valid: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Seconds</code>: 0 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minutes</code>: 0 - 65,535
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Hours</code>: 0 - 24
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Days</code>: 0 - 365
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Months</code>: 0 - 12
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Years</code>: 0 - 100
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionPeriod withValue(Integer value) {
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

        if (obj instanceof RetentionPeriod == false)
            return false;
        RetentionPeriod other = (RetentionPeriod) obj;
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
    public RetentionPeriod clone() {
        try {
            return (RetentionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.RetentionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
