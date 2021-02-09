/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains I/O usage metrics for a command that was invoked.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/IOUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IOUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of read I/O requests that the command made.
     * </p>
     */
    private Long readIOs;
    /**
     * <p>
     * The number of write I/O requests that the command made.
     * </p>
     */
    private Long writeIOs;

    /**
     * <p>
     * The number of read I/O requests that the command made.
     * </p>
     * 
     * @param readIOs
     *        The number of read I/O requests that the command made.
     */

    public void setReadIOs(Long readIOs) {
        this.readIOs = readIOs;
    }

    /**
     * <p>
     * The number of read I/O requests that the command made.
     * </p>
     * 
     * @return The number of read I/O requests that the command made.
     */

    public Long getReadIOs() {
        return this.readIOs;
    }

    /**
     * <p>
     * The number of read I/O requests that the command made.
     * </p>
     * 
     * @param readIOs
     *        The number of read I/O requests that the command made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOUsage withReadIOs(Long readIOs) {
        setReadIOs(readIOs);
        return this;
    }

    /**
     * <p>
     * The number of write I/O requests that the command made.
     * </p>
     * 
     * @param writeIOs
     *        The number of write I/O requests that the command made.
     */

    public void setWriteIOs(Long writeIOs) {
        this.writeIOs = writeIOs;
    }

    /**
     * <p>
     * The number of write I/O requests that the command made.
     * </p>
     * 
     * @return The number of write I/O requests that the command made.
     */

    public Long getWriteIOs() {
        return this.writeIOs;
    }

    /**
     * <p>
     * The number of write I/O requests that the command made.
     * </p>
     * 
     * @param writeIOs
     *        The number of write I/O requests that the command made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IOUsage withWriteIOs(Long writeIOs) {
        setWriteIOs(writeIOs);
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
        if (getReadIOs() != null)
            sb.append("ReadIOs: ").append(getReadIOs()).append(",");
        if (getWriteIOs() != null)
            sb.append("WriteIOs: ").append(getWriteIOs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IOUsage == false)
            return false;
        IOUsage other = (IOUsage) obj;
        if (other.getReadIOs() == null ^ this.getReadIOs() == null)
            return false;
        if (other.getReadIOs() != null && other.getReadIOs().equals(this.getReadIOs()) == false)
            return false;
        if (other.getWriteIOs() == null ^ this.getWriteIOs() == null)
            return false;
        if (other.getWriteIOs() != null && other.getWriteIOs().equals(this.getWriteIOs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadIOs() == null) ? 0 : getReadIOs().hashCode());
        hashCode = prime * hashCode + ((getWriteIOs() == null) ? 0 : getWriteIOs().hashCode());
        return hashCode;
    }

    @Override
    public IOUsage clone() {
        try {
            return (IOUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.IOUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
