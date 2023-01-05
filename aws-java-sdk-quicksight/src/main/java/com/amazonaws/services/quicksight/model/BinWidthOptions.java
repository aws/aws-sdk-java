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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options that determine the bin width of a histogram.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BinWidthOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BinWidthOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the bin width value.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The options that determine the bin count limit.
     * </p>
     */
    private Long binCountLimit;

    /**
     * <p>
     * The options that determine the bin width value.
     * </p>
     * 
     * @param value
     *        The options that determine the bin width value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The options that determine the bin width value.
     * </p>
     * 
     * @return The options that determine the bin width value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The options that determine the bin width value.
     * </p>
     * 
     * @param value
     *        The options that determine the bin width value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BinWidthOptions withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The options that determine the bin count limit.
     * </p>
     * 
     * @param binCountLimit
     *        The options that determine the bin count limit.
     */

    public void setBinCountLimit(Long binCountLimit) {
        this.binCountLimit = binCountLimit;
    }

    /**
     * <p>
     * The options that determine the bin count limit.
     * </p>
     * 
     * @return The options that determine the bin count limit.
     */

    public Long getBinCountLimit() {
        return this.binCountLimit;
    }

    /**
     * <p>
     * The options that determine the bin count limit.
     * </p>
     * 
     * @param binCountLimit
     *        The options that determine the bin count limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BinWidthOptions withBinCountLimit(Long binCountLimit) {
        setBinCountLimit(binCountLimit);
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
        if (getBinCountLimit() != null)
            sb.append("BinCountLimit: ").append(getBinCountLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BinWidthOptions == false)
            return false;
        BinWidthOptions other = (BinWidthOptions) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getBinCountLimit() == null ^ this.getBinCountLimit() == null)
            return false;
        if (other.getBinCountLimit() != null && other.getBinCountLimit().equals(this.getBinCountLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getBinCountLimit() == null) ? 0 : getBinCountLimit().hashCode());
        return hashCode;
    }

    @Override
    public BinWidthOptions clone() {
        try {
            return (BinWidthOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BinWidthOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
