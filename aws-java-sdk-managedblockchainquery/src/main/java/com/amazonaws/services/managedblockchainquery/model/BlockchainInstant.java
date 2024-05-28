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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/BlockchainInstant"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockchainInstant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container of the <code>Timestamp</code> of the blockchain instant.
     * </p>
     * <note>
     * <p>
     * This <code>timestamp</code> will only be recorded up to the second.
     * </p>
     * </note>
     */
    private java.util.Date time;

    /**
     * <p>
     * The container of the <code>Timestamp</code> of the blockchain instant.
     * </p>
     * <note>
     * <p>
     * This <code>timestamp</code> will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @param time
     *        The container of the <code>Timestamp</code> of the blockchain instant.</p> <note>
     *        <p>
     *        This <code>timestamp</code> will only be recorded up to the second.
     *        </p>
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The container of the <code>Timestamp</code> of the blockchain instant.
     * </p>
     * <note>
     * <p>
     * This <code>timestamp</code> will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @return The container of the <code>Timestamp</code> of the blockchain instant.</p> <note>
     *         <p>
     *         This <code>timestamp</code> will only be recorded up to the second.
     *         </p>
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The container of the <code>Timestamp</code> of the blockchain instant.
     * </p>
     * <note>
     * <p>
     * This <code>timestamp</code> will only be recorded up to the second.
     * </p>
     * </note>
     * 
     * @param time
     *        The container of the <code>Timestamp</code> of the blockchain instant.</p> <note>
     *        <p>
     *        This <code>timestamp</code> will only be recorded up to the second.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockchainInstant withTime(java.util.Date time) {
        setTime(time);
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
        if (getTime() != null)
            sb.append("Time: ").append(getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockchainInstant == false)
            return false;
        BlockchainInstant other = (BlockchainInstant) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public BlockchainInstant clone() {
        try {
            return (BlockchainInstant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.BlockchainInstantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
