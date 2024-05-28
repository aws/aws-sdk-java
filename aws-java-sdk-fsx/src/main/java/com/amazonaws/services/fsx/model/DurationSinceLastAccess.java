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
 * Defines the minimum amount of time since last access for a file to be eligible for release. Only files that have been
 * exported to S3 and that were last accessed or modified before this point-in-time are eligible to be released from the
 * Amazon FSx for Lustre file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DurationSinceLastAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DurationSinceLastAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on when
     * it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     * system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this amount
     * of time in the past (relative to the task create time) will be released. The default of <code>Value</code> is
     * <code>0</code>. This is a required parameter.
     * </p>
     * <note>
     * <p>
     * If an exported file meets the last accessed time criteria, its file or directory path must also be specified in
     * the <code>Paths</code> parameter of the operation in order for the file to be released.
     * </p>
     * </note>
     */
    private Long value;

    /**
     * <p>
     * The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on when
     * it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * </p>
     * 
     * @param unit
     *        The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on
     *        when it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on when
     * it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * </p>
     * 
     * @return The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based
     *         on when it was last accessed. <code>DAYS</code> is the only supported value. This is a required
     *         parameter.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on when
     * it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * </p>
     * 
     * @param unit
     *        The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on
     *        when it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public DurationSinceLastAccess withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on when
     * it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * </p>
     * 
     * @param unit
     *        The unit of time used by the <code>Value</code> parameter to determine if a file can be released, based on
     *        when it was last accessed. <code>DAYS</code> is the only supported value. This is a required parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public DurationSinceLastAccess withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     * system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this amount
     * of time in the past (relative to the task create time) will be released. The default of <code>Value</code> is
     * <code>0</code>. This is a required parameter.
     * </p>
     * <note>
     * <p>
     * If an exported file meets the last accessed time criteria, its file or directory path must also be specified in
     * the <code>Paths</code> parameter of the operation in order for the file to be released.
     * </p>
     * </note>
     * 
     * @param value
     *        An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     *        system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this
     *        amount of time in the past (relative to the task create time) will be released. The default of
     *        <code>Value</code> is <code>0</code>. This is a required parameter.</p> <note>
     *        <p>
     *        If an exported file meets the last accessed time criteria, its file or directory path must also be
     *        specified in the <code>Paths</code> parameter of the operation in order for the file to be released.
     *        </p>
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     * system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this amount
     * of time in the past (relative to the task create time) will be released. The default of <code>Value</code> is
     * <code>0</code>. This is a required parameter.
     * </p>
     * <note>
     * <p>
     * If an exported file meets the last accessed time criteria, its file or directory path must also be specified in
     * the <code>Paths</code> parameter of the operation in order for the file to be released.
     * </p>
     * </note>
     * 
     * @return An integer that represents the minimum amount of time (in days) since a file was last accessed in the
     *         file system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than
     *         this amount of time in the past (relative to the task create time) will be released. The default of
     *         <code>Value</code> is <code>0</code>. This is a required parameter.</p> <note>
     *         <p>
     *         If an exported file meets the last accessed time criteria, its file or directory path must also be
     *         specified in the <code>Paths</code> parameter of the operation in order for the file to be released.
     *         </p>
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     * system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this amount
     * of time in the past (relative to the task create time) will be released. The default of <code>Value</code> is
     * <code>0</code>. This is a required parameter.
     * </p>
     * <note>
     * <p>
     * If an exported file meets the last accessed time criteria, its file or directory path must also be specified in
     * the <code>Paths</code> parameter of the operation in order for the file to be released.
     * </p>
     * </note>
     * 
     * @param value
     *        An integer that represents the minimum amount of time (in days) since a file was last accessed in the file
     *        system. Only exported files with a <code>MAX(atime, ctime, mtime)</code> timestamp that is more than this
     *        amount of time in the past (relative to the task create time) will be released. The default of
     *        <code>Value</code> is <code>0</code>. This is a required parameter.</p> <note>
     *        <p>
     *        If an exported file meets the last accessed time criteria, its file or directory path must also be
     *        specified in the <code>Paths</code> parameter of the operation in order for the file to be released.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DurationSinceLastAccess withValue(Long value) {
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
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
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

        if (obj instanceof DurationSinceLastAccess == false)
            return false;
        DurationSinceLastAccess other = (DurationSinceLastAccess) obj;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
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

        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DurationSinceLastAccess clone() {
        try {
            return (DurationSinceLastAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DurationSinceLastAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
