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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a negative format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NegativeFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NegativeFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The prefix for a negative format.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The suffix for a negative format.
     * </p>
     */
    private String suffix;

    /**
     * <p>
     * The prefix for a negative format.
     * </p>
     * 
     * @param prefix
     *        The prefix for a negative format.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix for a negative format.
     * </p>
     * 
     * @return The prefix for a negative format.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix for a negative format.
     * </p>
     * 
     * @param prefix
     *        The prefix for a negative format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NegativeFormat withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The suffix for a negative format.
     * </p>
     * 
     * @param suffix
     *        The suffix for a negative format.
     */

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * The suffix for a negative format.
     * </p>
     * 
     * @return The suffix for a negative format.
     */

    public String getSuffix() {
        return this.suffix;
    }

    /**
     * <p>
     * The suffix for a negative format.
     * </p>
     * 
     * @param suffix
     *        The suffix for a negative format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NegativeFormat withSuffix(String suffix) {
        setSuffix(suffix);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getSuffix() != null)
            sb.append("Suffix: ").append(getSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NegativeFormat == false)
            return false;
        NegativeFormat other = (NegativeFormat) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        return hashCode;
    }

    @Override
    public NegativeFormat clone() {
        try {
            return (NegativeFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NegativeFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
