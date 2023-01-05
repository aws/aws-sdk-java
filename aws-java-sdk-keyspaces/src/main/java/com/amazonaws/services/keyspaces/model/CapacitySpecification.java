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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Keyspaces has two read/write capacity modes for processing reads and writes on your tables:
 * </p>
 * <p>
 * • On-demand (default)
 * </p>
 * <p>
 * • Provisioned
 * </p>
 * <p>
 * The read/write capacity mode that you choose controls how you are charged for read and write throughput and how table
 * throughput capacity is managed.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity modes</a>
 * in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CapacitySpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacitySpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * The throughput capacity specified for <code>read</code> operations defined in <code>read capacity units</code>
     * <code>(RCUs)</code>.
     * </p>
     */
    private Long readCapacityUnits;
    /**
     * <p>
     * The throughput capacity specified for <code>write</code> operations defined in <code>write capacity units</code>
     * <code>(WCUs)</code>.
     * </p>
     */
    private Long writeCapacityUnits;

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param throughputMode
     *        The read/write throughput capacity mode for a table. The options are:</p>
     *        <p>
     *        • <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        <p>
     *        • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return The read/write throughput capacity mode for a table. The options are:</p>
     *         <p>
     *         • <code>throughputMode:PAY_PER_REQUEST</code> and
     *         </p>
     *         <p>
     *         • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *         <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *         </p>
     *         <p>
     *         The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *         capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param throughputMode
     *        The read/write throughput capacity mode for a table. The options are:</p>
     *        <p>
     *        • <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        <p>
     *        • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public CapacitySpecification withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * The read/write throughput capacity mode for a table. The options are:
     * </p>
     * <p>
     * • <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * <p>
     * • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires <code>readCapacityUnits</code> and
     * <code>writeCapacityUnits</code> as input.
     * </p>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param throughputMode
     *        The read/write throughput capacity mode for a table. The options are:</p>
     *        <p>
     *        • <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        <p>
     *        • <code>throughputMode:PROVISIONED</code> - Provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as input.
     *        </p>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public CapacitySpecification withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>read</code> operations defined in <code>read capacity units</code>
     * <code>(RCUs)</code>.
     * </p>
     * 
     * @param readCapacityUnits
     *        The throughput capacity specified for <code>read</code> operations defined in
     *        <code>read capacity units</code> <code>(RCUs)</code>.
     */

    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>read</code> operations defined in <code>read capacity units</code>
     * <code>(RCUs)</code>.
     * </p>
     * 
     * @return The throughput capacity specified for <code>read</code> operations defined in
     *         <code>read capacity units</code> <code>(RCUs)</code>.
     */

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>read</code> operations defined in <code>read capacity units</code>
     * <code>(RCUs)</code>.
     * </p>
     * 
     * @param readCapacityUnits
     *        The throughput capacity specified for <code>read</code> operations defined in
     *        <code>read capacity units</code> <code>(RCUs)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacitySpecification withReadCapacityUnits(Long readCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>write</code> operations defined in <code>write capacity units</code>
     * <code>(WCUs)</code>.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The throughput capacity specified for <code>write</code> operations defined in
     *        <code>write capacity units</code> <code>(WCUs)</code>.
     */

    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>write</code> operations defined in <code>write capacity units</code>
     * <code>(WCUs)</code>.
     * </p>
     * 
     * @return The throughput capacity specified for <code>write</code> operations defined in
     *         <code>write capacity units</code> <code>(WCUs)</code>.
     */

    public Long getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    /**
     * <p>
     * The throughput capacity specified for <code>write</code> operations defined in <code>write capacity units</code>
     * <code>(WCUs)</code>.
     * </p>
     * 
     * @param writeCapacityUnits
     *        The throughput capacity specified for <code>write</code> operations defined in
     *        <code>write capacity units</code> <code>(WCUs)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacitySpecification withWriteCapacityUnits(Long writeCapacityUnits) {
        setWriteCapacityUnits(writeCapacityUnits);
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
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: ").append(getReadCapacityUnits()).append(",");
        if (getWriteCapacityUnits() != null)
            sb.append("WriteCapacityUnits: ").append(getWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacitySpecification == false)
            return false;
        CapacitySpecification other = (CapacitySpecification) obj;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null)
            return false;
        if (other.getWriteCapacityUnits() != null && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public CapacitySpecification clone() {
        try {
            return (CapacitySpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.CapacitySpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
