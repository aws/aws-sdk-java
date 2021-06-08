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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The EBS field that contains a list of EBS metrics associated with the current instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/EBSResourceUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     */
    private String ebsReadOpsPerSecond;
    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     */
    private String ebsWriteOpsPerSecond;
    /**
     * <p>
     * The maximum size of read operations per second
     * </p>
     */
    private String ebsReadBytesPerSecond;
    /**
     * <p>
     * The maximum size of write operations per second.
     * </p>
     */
    private String ebsWriteBytesPerSecond;

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @param ebsReadOpsPerSecond
     *        The maximum number of read operations per second.
     */

    public void setEbsReadOpsPerSecond(String ebsReadOpsPerSecond) {
        this.ebsReadOpsPerSecond = ebsReadOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @return The maximum number of read operations per second.
     */

    public String getEbsReadOpsPerSecond() {
        return this.ebsReadOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @param ebsReadOpsPerSecond
     *        The maximum number of read operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSResourceUtilization withEbsReadOpsPerSecond(String ebsReadOpsPerSecond) {
        setEbsReadOpsPerSecond(ebsReadOpsPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @param ebsWriteOpsPerSecond
     *        The maximum number of write operations per second.
     */

    public void setEbsWriteOpsPerSecond(String ebsWriteOpsPerSecond) {
        this.ebsWriteOpsPerSecond = ebsWriteOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @return The maximum number of write operations per second.
     */

    public String getEbsWriteOpsPerSecond() {
        return this.ebsWriteOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @param ebsWriteOpsPerSecond
     *        The maximum number of write operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSResourceUtilization withEbsWriteOpsPerSecond(String ebsWriteOpsPerSecond) {
        setEbsWriteOpsPerSecond(ebsWriteOpsPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum size of read operations per second
     * </p>
     * 
     * @param ebsReadBytesPerSecond
     *        The maximum size of read operations per second
     */

    public void setEbsReadBytesPerSecond(String ebsReadBytesPerSecond) {
        this.ebsReadBytesPerSecond = ebsReadBytesPerSecond;
    }

    /**
     * <p>
     * The maximum size of read operations per second
     * </p>
     * 
     * @return The maximum size of read operations per second
     */

    public String getEbsReadBytesPerSecond() {
        return this.ebsReadBytesPerSecond;
    }

    /**
     * <p>
     * The maximum size of read operations per second
     * </p>
     * 
     * @param ebsReadBytesPerSecond
     *        The maximum size of read operations per second
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSResourceUtilization withEbsReadBytesPerSecond(String ebsReadBytesPerSecond) {
        setEbsReadBytesPerSecond(ebsReadBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum size of write operations per second.
     * </p>
     * 
     * @param ebsWriteBytesPerSecond
     *        The maximum size of write operations per second.
     */

    public void setEbsWriteBytesPerSecond(String ebsWriteBytesPerSecond) {
        this.ebsWriteBytesPerSecond = ebsWriteBytesPerSecond;
    }

    /**
     * <p>
     * The maximum size of write operations per second.
     * </p>
     * 
     * @return The maximum size of write operations per second.
     */

    public String getEbsWriteBytesPerSecond() {
        return this.ebsWriteBytesPerSecond;
    }

    /**
     * <p>
     * The maximum size of write operations per second.
     * </p>
     * 
     * @param ebsWriteBytesPerSecond
     *        The maximum size of write operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSResourceUtilization withEbsWriteBytesPerSecond(String ebsWriteBytesPerSecond) {
        setEbsWriteBytesPerSecond(ebsWriteBytesPerSecond);
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
        if (getEbsReadOpsPerSecond() != null)
            sb.append("EbsReadOpsPerSecond: ").append(getEbsReadOpsPerSecond()).append(",");
        if (getEbsWriteOpsPerSecond() != null)
            sb.append("EbsWriteOpsPerSecond: ").append(getEbsWriteOpsPerSecond()).append(",");
        if (getEbsReadBytesPerSecond() != null)
            sb.append("EbsReadBytesPerSecond: ").append(getEbsReadBytesPerSecond()).append(",");
        if (getEbsWriteBytesPerSecond() != null)
            sb.append("EbsWriteBytesPerSecond: ").append(getEbsWriteBytesPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSResourceUtilization == false)
            return false;
        EBSResourceUtilization other = (EBSResourceUtilization) obj;
        if (other.getEbsReadOpsPerSecond() == null ^ this.getEbsReadOpsPerSecond() == null)
            return false;
        if (other.getEbsReadOpsPerSecond() != null && other.getEbsReadOpsPerSecond().equals(this.getEbsReadOpsPerSecond()) == false)
            return false;
        if (other.getEbsWriteOpsPerSecond() == null ^ this.getEbsWriteOpsPerSecond() == null)
            return false;
        if (other.getEbsWriteOpsPerSecond() != null && other.getEbsWriteOpsPerSecond().equals(this.getEbsWriteOpsPerSecond()) == false)
            return false;
        if (other.getEbsReadBytesPerSecond() == null ^ this.getEbsReadBytesPerSecond() == null)
            return false;
        if (other.getEbsReadBytesPerSecond() != null && other.getEbsReadBytesPerSecond().equals(this.getEbsReadBytesPerSecond()) == false)
            return false;
        if (other.getEbsWriteBytesPerSecond() == null ^ this.getEbsWriteBytesPerSecond() == null)
            return false;
        if (other.getEbsWriteBytesPerSecond() != null && other.getEbsWriteBytesPerSecond().equals(this.getEbsWriteBytesPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsReadOpsPerSecond() == null) ? 0 : getEbsReadOpsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getEbsWriteOpsPerSecond() == null) ? 0 : getEbsWriteOpsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getEbsReadBytesPerSecond() == null) ? 0 : getEbsReadBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getEbsWriteBytesPerSecond() == null) ? 0 : getEbsWriteBytesPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public EBSResourceUtilization clone() {
        try {
            return (EBSResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.EBSResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
