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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data retrieval policy rule.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRetrievalRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data retrieval policy to set.
     * </p>
     * <p>
     * Valid values: BytesPerHour|FreeTier|None
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The maximum number of bytes that can be retrieved in an hour.
     * </p>
     * <p>
     * This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation
     * will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.
     * </p>
     */
    private Long bytesPerHour;

    /**
     * <p>
     * The type of data retrieval policy to set.
     * </p>
     * <p>
     * Valid values: BytesPerHour|FreeTier|None
     * </p>
     * 
     * @param strategy
     *        The type of data retrieval policy to set.</p>
     *        <p>
     *        Valid values: BytesPerHour|FreeTier|None
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The type of data retrieval policy to set.
     * </p>
     * <p>
     * Valid values: BytesPerHour|FreeTier|None
     * </p>
     * 
     * @return The type of data retrieval policy to set.</p>
     *         <p>
     *         Valid values: BytesPerHour|FreeTier|None
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The type of data retrieval policy to set.
     * </p>
     * <p>
     * Valid values: BytesPerHour|FreeTier|None
     * </p>
     * 
     * @param strategy
     *        The type of data retrieval policy to set.</p>
     *        <p>
     *        Valid values: BytesPerHour|FreeTier|None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRetrievalRule withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The maximum number of bytes that can be retrieved in an hour.
     * </p>
     * <p>
     * This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation
     * will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.
     * </p>
     * 
     * @param bytesPerHour
     *        The maximum number of bytes that can be retrieved in an hour.</p>
     *        <p>
     *        This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT
     *        operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this
     *        field.
     */

    public void setBytesPerHour(Long bytesPerHour) {
        this.bytesPerHour = bytesPerHour;
    }

    /**
     * <p>
     * The maximum number of bytes that can be retrieved in an hour.
     * </p>
     * <p>
     * This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation
     * will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.
     * </p>
     * 
     * @return The maximum number of bytes that can be retrieved in an hour.</p>
     *         <p>
     *         This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT
     *         operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this
     *         field.
     */

    public Long getBytesPerHour() {
        return this.bytesPerHour;
    }

    /**
     * <p>
     * The maximum number of bytes that can be retrieved in an hour.
     * </p>
     * <p>
     * This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT operation
     * will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this field.
     * </p>
     * 
     * @param bytesPerHour
     *        The maximum number of bytes that can be retrieved in an hour.</p>
     *        <p>
     *        This field is required only if the value of the Strategy field is <code>BytesPerHour</code>. Your PUT
     *        operation will be rejected if the Strategy field is not set to <code>BytesPerHour</code> and you set this
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRetrievalRule withBytesPerHour(Long bytesPerHour) {
        setBytesPerHour(bytesPerHour);
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
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getBytesPerHour() != null)
            sb.append("BytesPerHour: ").append(getBytesPerHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRetrievalRule == false)
            return false;
        DataRetrievalRule other = (DataRetrievalRule) obj;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getBytesPerHour() == null ^ this.getBytesPerHour() == null)
            return false;
        if (other.getBytesPerHour() != null && other.getBytesPerHour().equals(this.getBytesPerHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getBytesPerHour() == null) ? 0 : getBytesPerHour().hashCode());
        return hashCode;
    }

    @Override
    public DataRetrievalRule clone() {
        try {
            return (DataRetrievalRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.DataRetrievalRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
