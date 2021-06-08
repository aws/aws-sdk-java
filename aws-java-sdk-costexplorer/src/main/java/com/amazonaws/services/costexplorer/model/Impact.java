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
 * The anomaly's dollar value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Impact" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Impact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum dollar value observed for an anomaly.
     * </p>
     */
    private Double maxImpact;
    /**
     * <p>
     * The cumulative dollar value observed for an anomaly.
     * </p>
     */
    private Double totalImpact;

    /**
     * <p>
     * The maximum dollar value observed for an anomaly.
     * </p>
     * 
     * @param maxImpact
     *        The maximum dollar value observed for an anomaly.
     */

    public void setMaxImpact(Double maxImpact) {
        this.maxImpact = maxImpact;
    }

    /**
     * <p>
     * The maximum dollar value observed for an anomaly.
     * </p>
     * 
     * @return The maximum dollar value observed for an anomaly.
     */

    public Double getMaxImpact() {
        return this.maxImpact;
    }

    /**
     * <p>
     * The maximum dollar value observed for an anomaly.
     * </p>
     * 
     * @param maxImpact
     *        The maximum dollar value observed for an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withMaxImpact(Double maxImpact) {
        setMaxImpact(maxImpact);
        return this;
    }

    /**
     * <p>
     * The cumulative dollar value observed for an anomaly.
     * </p>
     * 
     * @param totalImpact
     *        The cumulative dollar value observed for an anomaly.
     */

    public void setTotalImpact(Double totalImpact) {
        this.totalImpact = totalImpact;
    }

    /**
     * <p>
     * The cumulative dollar value observed for an anomaly.
     * </p>
     * 
     * @return The cumulative dollar value observed for an anomaly.
     */

    public Double getTotalImpact() {
        return this.totalImpact;
    }

    /**
     * <p>
     * The cumulative dollar value observed for an anomaly.
     * </p>
     * 
     * @param totalImpact
     *        The cumulative dollar value observed for an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Impact withTotalImpact(Double totalImpact) {
        setTotalImpact(totalImpact);
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
        if (getMaxImpact() != null)
            sb.append("MaxImpact: ").append(getMaxImpact()).append(",");
        if (getTotalImpact() != null)
            sb.append("TotalImpact: ").append(getTotalImpact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Impact == false)
            return false;
        Impact other = (Impact) obj;
        if (other.getMaxImpact() == null ^ this.getMaxImpact() == null)
            return false;
        if (other.getMaxImpact() != null && other.getMaxImpact().equals(this.getMaxImpact()) == false)
            return false;
        if (other.getTotalImpact() == null ^ this.getTotalImpact() == null)
            return false;
        if (other.getTotalImpact() != null && other.getTotalImpact().equals(this.getTotalImpact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxImpact() == null) ? 0 : getMaxImpact().hashCode());
        hashCode = prime * hashCode + ((getTotalImpact() == null) ? 0 : getTotalImpact().hashCode());
        return hashCode;
    }

    @Override
    public Impact clone() {
        try {
            return (Impact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ImpactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
