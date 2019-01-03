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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a granularity of a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/MetricGranularityType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricGranularityType implements Serializable, Cloneable {

    /**
     * <p>
     * The granularity. The only valid value is <code>1Minute</code>.
     * </p>
     */
    private String granularity;

    /**
     * <p>
     * The granularity. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity. The only valid value is <code>1Minute</code>.
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The granularity. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @return The granularity. The only valid value is <code>1Minute</code>.
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The granularity. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity. The only valid value is <code>1Minute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricGranularityType withGranularity(String granularity) {
        setGranularity(granularity);
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
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricGranularityType == false)
            return false;
        MetricGranularityType other = (MetricGranularityType) obj;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public MetricGranularityType clone() {
        try {
            return (MetricGranularityType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
