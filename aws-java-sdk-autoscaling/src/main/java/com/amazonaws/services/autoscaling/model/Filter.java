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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a filter that is used to return a more specific list of results from a describe operation.
 * </p>
 * <p>
 * If you specify multiple filters, the filters are automatically logically joined with an <code>AND</code>, and the
 * request returns only the results that match all of the specified filters.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html">Tag Auto Scaling groups
 * and instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on which API operation you're using with the filter
     * (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     * </p>
     * <p>
     * <b>DescribeAutoScalingGroups</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling groups
     * associated with these tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling groups
     * associated with these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter name
     * and the tag value as the filter value. The results only include information about the Auto Scaling groups
     * associated with the specified key/value combination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>DescribeTags</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include information
     * about the tags associated with these Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - Accepts tag keys. The results only include information about the tags associated with these
     * tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - Accepts tag values. The results only include information about the tags associated with
     * these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to instances
     * at launch. The results only include information about the tags associated with the specified Boolean value.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * If you specify multiple values for a filter, the values are automatically logically joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values. For example, specify
     * "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling
     * groups with the tag "environment=production" or "environment=development".
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on which API operation you're using with the filter
     * (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     * </p>
     * <p>
     * <b>DescribeAutoScalingGroups</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling groups
     * associated with these tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling groups
     * associated with these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter name
     * and the tag value as the filter value. The results only include information about the Auto Scaling groups
     * associated with the specified key/value combination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>DescribeTags</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include information
     * about the tags associated with these Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - Accepts tag keys. The results only include information about the tags associated with these
     * tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - Accepts tag values. The results only include information about the tags associated with
     * these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to instances
     * at launch. The results only include information about the tags associated with the specified Boolean value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        The valid values for <code>Name</code> depend on which API operation you're using with the filter
     *        (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     *        </p>
     *        <p>
     *        <b>DescribeAutoScalingGroups</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling
     *        groups associated with these tag keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling
     *        groups associated with these tag values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter
     *        name and the tag value as the filter value. The results only include information about the Auto Scaling
     *        groups associated with the specified key/value combination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>DescribeTags</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include
     *        information about the tags associated with these Auto Scaling groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key</code> - Accepts tag keys. The results only include information about the tags associated with
     *        these tag keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - Accepts tag values. The results only include information about the tags associated
     *        with these tag values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to
     *        instances at launch. The results only include information about the tags associated with the specified
     *        Boolean value.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on which API operation you're using with the filter
     * (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     * </p>
     * <p>
     * <b>DescribeAutoScalingGroups</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling groups
     * associated with these tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling groups
     * associated with these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter name
     * and the tag value as the filter value. The results only include information about the Auto Scaling groups
     * associated with the specified key/value combination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>DescribeTags</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include information
     * about the tags associated with these Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - Accepts tag keys. The results only include information about the tags associated with these
     * tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - Accepts tag values. The results only include information about the tags associated with
     * these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to instances
     * at launch. The results only include information about the tags associated with the specified Boolean value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the filter.</p>
     *         <p>
     *         The valid values for <code>Name</code> depend on which API operation you're using with the filter
     *         (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     *         </p>
     *         <p>
     *         <b>DescribeAutoScalingGroups</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling
     *         groups associated with these tag keys.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling
     *         groups associated with these tag values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the
     *         filter name and the tag value as the filter value. The results only include information about the Auto
     *         Scaling groups associated with the specified key/value combination.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>DescribeTags</b>
     *         </p>
     *         <p>
     *         Valid values for <code>Name</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include
     *         information about the tags associated with these Auto Scaling groups.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key</code> - Accepts tag keys. The results only include information about the tags associated with
     *         these tag keys.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>value</code> - Accepts tag values. The results only include information about the tags associated
     *         with these tag values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to
     *         instances at launch. The results only include information about the tags associated with the specified
     *         Boolean value.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * The valid values for <code>Name</code> depend on which API operation you're using with the filter
     * (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     * </p>
     * <p>
     * <b>DescribeAutoScalingGroups</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling groups
     * associated with these tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling groups
     * associated with these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter name
     * and the tag value as the filter value. The results only include information about the Auto Scaling groups
     * associated with the specified key/value combination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>DescribeTags</b>
     * </p>
     * <p>
     * Valid values for <code>Name</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include information
     * about the tags associated with these Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - Accepts tag keys. The results only include information about the tags associated with these
     * tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - Accepts tag values. The results only include information about the tags associated with
     * these tag values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to instances
     * at launch. The results only include information about the tags associated with the specified Boolean value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        The valid values for <code>Name</code> depend on which API operation you're using with the filter
     *        (<a>DescribeAutoScalingGroups</a> or <a>DescribeTags</a>).
     *        </p>
     *        <p>
     *        <b>DescribeAutoScalingGroups</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - Accepts tag keys. The results only include information about the Auto Scaling
     *        groups associated with these tag keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - Accepts tag values. The results only include information about the Auto Scaling
     *        groups associated with these tag values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag:&lt;key&gt;</code> - Accepts the key/value combination of the tag. Use the tag key in the filter
     *        name and the tag value as the filter value. The results only include information about the Auto Scaling
     *        groups associated with the specified key/value combination.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>DescribeTags</b>
     *        </p>
     *        <p>
     *        Valid values for <code>Name</code> include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-scaling-group</code> - Accepts the names of Auto Scaling groups. The results only include
     *        information about the tags associated with these Auto Scaling groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key</code> - Accepts tag keys. The results only include information about the tags associated with
     *        these tag keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - Accepts tag values. The results only include information about the tags associated
     *        with these tag values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>propagate-at-launch</code> - Accepts a Boolean value, which specifies whether tags propagate to
     *        instances at launch. The results only include information about the tags associated with the specified
     *        Boolean value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * If you specify multiple values for a filter, the values are automatically logically joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values. For example, specify
     * "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling
     * groups with the tag "environment=production" or "environment=development".
     * </p>
     * 
     * @return One or more filter values. Filter values are case-sensitive. </p>
     *         <p>
     *         If you specify multiple values for a filter, the values are automatically logically joined with an
     *         <code>OR</code>, and the request returns all results that match any of the specified values. For example,
     *         specify "tag:environment" for the filter name and "production,development" for the filter values to find
     *         Auto Scaling groups with the tag "environment=production" or "environment=development".
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * If you specify multiple values for a filter, the values are automatically logically joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values. For example, specify
     * "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling
     * groups with the tag "environment=production" or "environment=development".
     * </p>
     * 
     * @param values
     *        One or more filter values. Filter values are case-sensitive. </p>
     *        <p>
     *        If you specify multiple values for a filter, the values are automatically logically joined with an
     *        <code>OR</code>, and the request returns all results that match any of the specified values. For example,
     *        specify "tag:environment" for the filter name and "production,development" for the filter values to find
     *        Auto Scaling groups with the tag "environment=production" or "environment=development".
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * If you specify multiple values for a filter, the values are automatically logically joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values. For example, specify
     * "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling
     * groups with the tag "environment=production" or "environment=development".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more filter values. Filter values are case-sensitive. </p>
     *        <p>
     *        If you specify multiple values for a filter, the values are automatically logically joined with an
     *        <code>OR</code>, and the request returns all results that match any of the specified values. For example,
     *        specify "tag:environment" for the filter name and "production,development" for the filter values to find
     *        Auto Scaling groups with the tag "environment=production" or "environment=development".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * If you specify multiple values for a filter, the values are automatically logically joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values. For example, specify
     * "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling
     * groups with the tag "environment=production" or "environment=development".
     * </p>
     * 
     * @param values
     *        One or more filter values. Filter values are case-sensitive. </p>
     *        <p>
     *        If you specify multiple values for a filter, the values are automatically logically joined with an
     *        <code>OR</code>, and the request returns all results that match any of the specified values. For example,
     *        specify "tag:environment" for the filter name and "production,development" for the filter values to find
     *        Auto Scaling groups with the tag "environment=production" or "environment=development".
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

}
