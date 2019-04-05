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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInterconnectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The interconnects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Interconnect> interconnects;

    /**
     * <p>
     * The interconnects.
     * </p>
     * 
     * @return The interconnects.
     */

    public java.util.List<Interconnect> getInterconnects() {
        if (interconnects == null) {
            interconnects = new com.amazonaws.internal.SdkInternalList<Interconnect>();
        }
        return interconnects;
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     * 
     * @param interconnects
     *        The interconnects.
     */

    public void setInterconnects(java.util.Collection<Interconnect> interconnects) {
        if (interconnects == null) {
            this.interconnects = null;
            return;
        }

        this.interconnects = new com.amazonaws.internal.SdkInternalList<Interconnect>(interconnects);
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInterconnects(java.util.Collection)} or {@link #withInterconnects(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param interconnects
     *        The interconnects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInterconnectsResult withInterconnects(Interconnect... interconnects) {
        if (this.interconnects == null) {
            setInterconnects(new com.amazonaws.internal.SdkInternalList<Interconnect>(interconnects.length));
        }
        for (Interconnect ele : interconnects) {
            this.interconnects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The interconnects.
     * </p>
     * 
     * @param interconnects
     *        The interconnects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInterconnectsResult withInterconnects(java.util.Collection<Interconnect> interconnects) {
        setInterconnects(interconnects);
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
        if (getInterconnects() != null)
            sb.append("Interconnects: ").append(getInterconnects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInterconnectsResult == false)
            return false;
        DescribeInterconnectsResult other = (DescribeInterconnectsResult) obj;
        if (other.getInterconnects() == null ^ this.getInterconnects() == null)
            return false;
        if (other.getInterconnects() != null && other.getInterconnects().equals(this.getInterconnects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnects() == null) ? 0 : getInterconnects().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInterconnectsResult clone() {
        try {
            return (DescribeInterconnectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
