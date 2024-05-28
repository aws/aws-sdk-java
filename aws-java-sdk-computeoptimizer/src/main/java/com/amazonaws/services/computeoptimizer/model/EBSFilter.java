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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter that returns a more specific list of Amazon Elastic Block Store (Amazon EBS) volume
 * recommendations. Use this filter with the <a>GetEBSVolumeRecommendations</a> action.
 * </p>
 * <p>
 * You can use <code>LambdaFunctionRecommendationFilter</code> with the <a>GetLambdaFunctionRecommendations</a> action,
 * <code>JobFilter</code> with the <a>DescribeRecommendationExportJobs</a> action, and <code>Filter</code> with the
 * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/EBSFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>NotOptimized</code>).
     * </p>
     * <p>
     * You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code> tags.
     * </p>
     * <p>
     * A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     * recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find
     * all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the value of
     * <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter
     * value.
     * </p>
     * <p>
     * A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to
     * find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the
     * tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of
     * <code>Owner</code> or without any tag keys assigned.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>NotOptimized</code>).
     * </p>
     * <p>
     * You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code> tags.
     * </p>
     * <p>
     * A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     * recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find
     * all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the value of
     * <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter
     * value.
     * </p>
     * <p>
     * A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to
     * find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the
     * tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of
     * <code>Owner</code> or without any tag keys assigned.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>NotOptimized</code>).
     *        </p>
     *        <p>
     *        You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code>
     *        tags.
     *        </p>
     *        <p>
     *        A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     *        recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to
     *        find all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the
     *        value of <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for
     *        the filter value.
     *        </p>
     *        <p>
     *        A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this
     *        filter to find all of your Amazon EBS volume recommendations that have a tag with a specific key. This
     *        doesn’t consider the tag value. For example, you can find your Amazon EBS volume recommendations with a
     *        tag key value of <code>Owner</code> or without any tag keys assigned.
     * @see EBSFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>NotOptimized</code>).
     * </p>
     * <p>
     * You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code> tags.
     * </p>
     * <p>
     * A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     * recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find
     * all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the value of
     * <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter
     * value.
     * </p>
     * <p>
     * A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to
     * find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the
     * tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of
     * <code>Owner</code> or without any tag keys assigned.
     * </p>
     * 
     * @return The name of the filter.</p>
     *         <p>
     *         Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *         example, <code>NotOptimized</code>).
     *         </p>
     *         <p>
     *         You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code>
     *         tags.
     *         </p>
     *         <p>
     *         A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     *         recommendations. Use the tag key in the filter name and the tag value as the filter value. For example,
     *         to find all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the
     *         value of <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     *         for the filter value.
     *         </p>
     *         <p>
     *         A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this
     *         filter to find all of your Amazon EBS volume recommendations that have a tag with a specific key. This
     *         doesn’t consider the tag value. For example, you can find your Amazon EBS volume recommendations with a
     *         tag key value of <code>Owner</code> or without any tag keys assigned.
     * @see EBSFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>NotOptimized</code>).
     * </p>
     * <p>
     * You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code> tags.
     * </p>
     * <p>
     * A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     * recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find
     * all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the value of
     * <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter
     * value.
     * </p>
     * <p>
     * A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to
     * find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the
     * tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of
     * <code>Owner</code> or without any tag keys assigned.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>NotOptimized</code>).
     *        </p>
     *        <p>
     *        You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code>
     *        tags.
     *        </p>
     *        <p>
     *        A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     *        recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to
     *        find all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the
     *        value of <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for
     *        the filter value.
     *        </p>
     *        <p>
     *        A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this
     *        filter to find all of your Amazon EBS volume recommendations that have a tag with a specific key. This
     *        doesn’t consider the tag value. For example, you can find your Amazon EBS volume recommendations with a
     *        tag key value of <code>Owner</code> or without any tag keys assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSFilterName
     */

    public EBSFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>NotOptimized</code>).
     * </p>
     * <p>
     * You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code> tags.
     * </p>
     * <p>
     * A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     * recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to find
     * all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the value of
     * <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter
     * value.
     * </p>
     * <p>
     * A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this filter to
     * find all of your Amazon EBS volume recommendations that have a tag with a specific key. This doesn’t consider the
     * tag value. For example, you can find your Amazon EBS volume recommendations with a tag key value of
     * <code>Owner</code> or without any tag keys assigned.
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>NotOptimized</code>).
     *        </p>
     *        <p>
     *        You can filter your Amazon EBS volume recommendations by <code>tag:key</code> and <code>tag-key</code>
     *        tags.
     *        </p>
     *        <p>
     *        A <code>tag:key</code> is a key and value combination of a tag assigned to your Amazon EBS volume
     *        recommendations. Use the tag key in the filter name and the tag value as the filter value. For example, to
     *        find all Amazon EBS volume recommendations that have a tag with the key of <code>Owner</code> and the
     *        value of <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name and <code>TeamA</code> for
     *        the filter value.
     *        </p>
     *        <p>
     *        A <code>tag-key</code> is the key of a tag assigned to your Amazon EBS volume recommendations. Use this
     *        filter to find all of your Amazon EBS volume recommendations that have a tag with a specific key. This
     *        doesn’t consider the tag value. For example, you can find your Amazon EBS volume recommendations with a
     *        tag key value of <code>Owner</code> or without any tag keys assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EBSFilterName
     */

    public EBSFilter withName(EBSFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * 
     * @return The value of the filter.</p>
     *         <p>
     *         The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
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
     * The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
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
     *        The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSFilter withValues(String... values) {
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
     * The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values are <code>Optimized</code>, or <code>NotOptimized</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof EBSFilter == false)
            return false;
        EBSFilter other = (EBSFilter) obj;
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
    public EBSFilter clone() {
        try {
            return (EBSFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.EBSFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
