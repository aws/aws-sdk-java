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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SCTE configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/Scte" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     */
    private java.util.List<String> scteFilter;

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     * 
     * @return The SCTE-35 message types that you want to be treated as ad markers in the output.
     * @see ScteFilter
     */

    public java.util.List<String> getScteFilter() {
        return scteFilter;
    }

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     * 
     * @param scteFilter
     *        The SCTE-35 message types that you want to be treated as ad markers in the output.
     * @see ScteFilter
     */

    public void setScteFilter(java.util.Collection<String> scteFilter) {
        if (scteFilter == null) {
            this.scteFilter = null;
            return;
        }

        this.scteFilter = new java.util.ArrayList<String>(scteFilter);
    }

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScteFilter(java.util.Collection)} or {@link #withScteFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param scteFilter
     *        The SCTE-35 message types that you want to be treated as ad markers in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScteFilter
     */

    public Scte withScteFilter(String... scteFilter) {
        if (this.scteFilter == null) {
            setScteFilter(new java.util.ArrayList<String>(scteFilter.length));
        }
        for (String ele : scteFilter) {
            this.scteFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     * 
     * @param scteFilter
     *        The SCTE-35 message types that you want to be treated as ad markers in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScteFilter
     */

    public Scte withScteFilter(java.util.Collection<String> scteFilter) {
        setScteFilter(scteFilter);
        return this;
    }

    /**
     * <p>
     * The SCTE-35 message types that you want to be treated as ad markers in the output.
     * </p>
     * 
     * @param scteFilter
     *        The SCTE-35 message types that you want to be treated as ad markers in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScteFilter
     */

    public Scte withScteFilter(ScteFilter... scteFilter) {
        java.util.ArrayList<String> scteFilterCopy = new java.util.ArrayList<String>(scteFilter.length);
        for (ScteFilter value : scteFilter) {
            scteFilterCopy.add(value.toString());
        }
        if (getScteFilter() == null) {
            setScteFilter(scteFilterCopy);
        } else {
            getScteFilter().addAll(scteFilterCopy);
        }
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
        if (getScteFilter() != null)
            sb.append("ScteFilter: ").append(getScteFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte == false)
            return false;
        Scte other = (Scte) obj;
        if (other.getScteFilter() == null ^ this.getScteFilter() == null)
            return false;
        if (other.getScteFilter() != null && other.getScteFilter().equals(this.getScteFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScteFilter() == null) ? 0 : getScteFilter().hashCode());
        return hashCode;
    }

    @Override
    public Scte clone() {
        try {
            return (Scte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ScteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
