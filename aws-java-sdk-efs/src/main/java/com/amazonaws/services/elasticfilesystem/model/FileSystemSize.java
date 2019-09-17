/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The latest known metered size (in bytes) of data stored in the file system, in its <code>Value</code> field, and the
 * time at which that size was determined in its <code>Timestamp</code> field. The value doesn't represent the size of a
 * consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system.
 * That is, the value represents the actual size only if the file system is not modified for a period longer than a
 * couple of hours. Otherwise, the value is not necessarily the exact size the file system was at any instant in time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/FileSystemSize" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemSize implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system.
     * </p>
     */
    private Long value;
    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is the
     * integer number of seconds since 1970-01-01T00:00:00Z.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * </p>
     */
    private Long valueInIA;
    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * </p>
     */
    private Long valueInStandard;

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system.
     * </p>
     * 
     * @param value
     *        The latest known metered size (in bytes) of data stored in the file system.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system.
     * </p>
     * 
     * @return The latest known metered size (in bytes) of data stored in the file system.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the file system.
     * </p>
     * 
     * @param value
     *        The latest known metered size (in bytes) of data stored in the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemSize withValue(Long value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is the
     * integer number of seconds since 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @param timestamp
     *        The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is
     *        the integer number of seconds since 1970-01-01T00:00:00Z.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is the
     * integer number of seconds since 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @return The time at which the size of data, returned in the <code>Value</code> field, was determined. The value
     *         is the integer number of seconds since 1970-01-01T00:00:00Z.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is the
     * integer number of seconds since 1970-01-01T00:00:00Z.
     * </p>
     * 
     * @param timestamp
     *        The time at which the size of data, returned in the <code>Value</code> field, was determined. The value is
     *        the integer number of seconds since 1970-01-01T00:00:00Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemSize withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * </p>
     * 
     * @param valueInIA
     *        The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     */

    public void setValueInIA(Long valueInIA) {
        this.valueInIA = valueInIA;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * </p>
     * 
     * @return The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     */

    public Long getValueInIA() {
        return this.valueInIA;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * </p>
     * 
     * @param valueInIA
     *        The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemSize withValueInIA(Long valueInIA) {
        setValueInIA(valueInIA);
        return this;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * </p>
     * 
     * @param valueInStandard
     *        The latest known metered size (in bytes) of data stored in the Standard storage class.
     */

    public void setValueInStandard(Long valueInStandard) {
        this.valueInStandard = valueInStandard;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * </p>
     * 
     * @return The latest known metered size (in bytes) of data stored in the Standard storage class.
     */

    public Long getValueInStandard() {
        return this.valueInStandard;
    }

    /**
     * <p>
     * The latest known metered size (in bytes) of data stored in the Standard storage class.
     * </p>
     * 
     * @param valueInStandard
     *        The latest known metered size (in bytes) of data stored in the Standard storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemSize withValueInStandard(Long valueInStandard) {
        setValueInStandard(valueInStandard);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getValueInIA() != null)
            sb.append("ValueInIA: ").append(getValueInIA()).append(",");
        if (getValueInStandard() != null)
            sb.append("ValueInStandard: ").append(getValueInStandard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemSize == false)
            return false;
        FileSystemSize other = (FileSystemSize) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValueInIA() == null ^ this.getValueInIA() == null)
            return false;
        if (other.getValueInIA() != null && other.getValueInIA().equals(this.getValueInIA()) == false)
            return false;
        if (other.getValueInStandard() == null ^ this.getValueInStandard() == null)
            return false;
        if (other.getValueInStandard() != null && other.getValueInStandard().equals(this.getValueInStandard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValueInIA() == null) ? 0 : getValueInIA().hashCode());
        hashCode = prime * hashCode + ((getValueInStandard() == null) ? 0 : getValueInStandard().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemSize clone() {
        try {
            return (FileSystemSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.FileSystemSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
