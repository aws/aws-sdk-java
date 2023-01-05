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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about a dimension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DimensionDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a dimension.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The identifier of a dimension.
     * </p>
     * 
     * @param identifier
     *        The identifier of a dimension.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of a dimension.
     * </p>
     * 
     * @return The identifier of a dimension.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of a dimension.
     * </p>
     * 
     * @param identifier
     *        The identifier of a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionDetail withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionDetail == false)
            return false;
        DimensionDetail other = (DimensionDetail) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DimensionDetail clone() {
        try {
            return (DimensionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DimensionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
