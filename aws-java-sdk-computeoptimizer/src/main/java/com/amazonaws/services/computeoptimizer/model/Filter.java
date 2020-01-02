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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter that returns a more specific list of recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to filter the results to a specific findings classification.
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     * <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     * <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an <i>Auto
     * Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values
     * are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to filter the results to a specific findings classification.
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to filter the results to a specific findings classification.
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * @see FilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to filter the results to a specific findings classification.
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * </p>
     * 
     * @return The name of the filter.</p>
     *         <p>
     *         Specify <code>Finding</code> to filter the results to a specific findings classification.
     *         </p>
     *         <p>
     *         Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * @see FilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to filter the results to a specific findings classification.
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to filter the results to a specific findings classification.
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to filter the results to a specific findings classification.
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to filter the results to a specific findings classification.
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to filter the results to a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(FilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     * <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     * <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an <i>Auto
     * Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values
     * are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * </p>
     * 
     * @return The value of the filter.</p>
     *         <p>
     *         If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *         <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     *         <code>NotOptimized</code>, or <code>Optimized</code>.
     *         </p>
     *         <p>
     *         If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *         <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>
     *         .
     *         </p>
     *         <p>
     *         If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid
     *         values are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     * <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     * <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an <i>Auto
     * Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values
     * are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     *        <code>NotOptimized</code>, or <code>Optimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid
     *        values are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     * <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     * <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an <i>Auto
     * Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values
     * are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     *        <code>NotOptimized</code>, or <code>Optimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid
     *        values are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     * <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     * <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an <i>Auto
     * Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * <p>
     * If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid values
     * are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>instance</i>, then the valid values are <code>Underprovisioned</code>, <code>Overprovisioned</code>,
     *        <code>NotOptimized</code>, or <code>Optimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>Finding</code>, and you're recommendations for an
     *        <i>Auto Scaling group</i>, then the valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     *        </p>
     *        <p>
     *        If you specify the <code>name</code> parameter as <code>RecommendationSourceType</code>, then the valid
     *        values are <code>EC2Instance</code>, or <code>AutoScalingGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
