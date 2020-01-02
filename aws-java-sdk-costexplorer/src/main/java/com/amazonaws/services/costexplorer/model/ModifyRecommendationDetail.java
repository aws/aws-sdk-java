/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details on the modification recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ModifyRecommendationDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyRecommendationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default recommendation.
     * </p>
     */
    private java.util.List<TargetInstance> targetInstances;

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default recommendation.
     * </p>
     * 
     * @return Identifies whether this instance type is the Amazon Web Services default recommendation.
     */

    public java.util.List<TargetInstance> getTargetInstances() {
        return targetInstances;
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default recommendation.
     * </p>
     * 
     * @param targetInstances
     *        Identifies whether this instance type is the Amazon Web Services default recommendation.
     */

    public void setTargetInstances(java.util.Collection<TargetInstance> targetInstances) {
        if (targetInstances == null) {
            this.targetInstances = null;
            return;
        }

        this.targetInstances = new java.util.ArrayList<TargetInstance>(targetInstances);
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default recommendation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetInstances(java.util.Collection)} or {@link #withTargetInstances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetInstances
     *        Identifies whether this instance type is the Amazon Web Services default recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyRecommendationDetail withTargetInstances(TargetInstance... targetInstances) {
        if (this.targetInstances == null) {
            setTargetInstances(new java.util.ArrayList<TargetInstance>(targetInstances.length));
        }
        for (TargetInstance ele : targetInstances) {
            this.targetInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default recommendation.
     * </p>
     * 
     * @param targetInstances
     *        Identifies whether this instance type is the Amazon Web Services default recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyRecommendationDetail withTargetInstances(java.util.Collection<TargetInstance> targetInstances) {
        setTargetInstances(targetInstances);
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
        if (getTargetInstances() != null)
            sb.append("TargetInstances: ").append(getTargetInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyRecommendationDetail == false)
            return false;
        ModifyRecommendationDetail other = (ModifyRecommendationDetail) obj;
        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null && other.getTargetInstances().equals(this.getTargetInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        return hashCode;
    }

    @Override
    public ModifyRecommendationDetail clone() {
        try {
            return (ModifyRecommendationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ModifyRecommendationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
