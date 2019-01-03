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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeDhcpOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeDhcpOptionsRequest> {

    /**
     * <p>
     * The IDs of one or more DHCP options sets.
     * </p>
     * <p>
     * Default: Describes all your DHCP options sets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dhcpOptionsIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The value for one of the options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The IDs of one or more DHCP options sets.
     * </p>
     * <p>
     * Default: Describes all your DHCP options sets.
     * </p>
     * 
     * @return The IDs of one or more DHCP options sets.</p>
     *         <p>
     *         Default: Describes all your DHCP options sets.
     */

    public java.util.List<String> getDhcpOptionsIds() {
        if (dhcpOptionsIds == null) {
            dhcpOptionsIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dhcpOptionsIds;
    }

    /**
     * <p>
     * The IDs of one or more DHCP options sets.
     * </p>
     * <p>
     * Default: Describes all your DHCP options sets.
     * </p>
     * 
     * @param dhcpOptionsIds
     *        The IDs of one or more DHCP options sets.</p>
     *        <p>
     *        Default: Describes all your DHCP options sets.
     */

    public void setDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        if (dhcpOptionsIds == null) {
            this.dhcpOptionsIds = null;
            return;
        }

        this.dhcpOptionsIds = new com.amazonaws.internal.SdkInternalList<String>(dhcpOptionsIds);
    }

    /**
     * <p>
     * The IDs of one or more DHCP options sets.
     * </p>
     * <p>
     * Default: Describes all your DHCP options sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDhcpOptionsIds(java.util.Collection)} or {@link #withDhcpOptionsIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dhcpOptionsIds
     *        The IDs of one or more DHCP options sets.</p>
     *        <p>
     *        Default: Describes all your DHCP options sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsRequest withDhcpOptionsIds(String... dhcpOptionsIds) {
        if (this.dhcpOptionsIds == null) {
            setDhcpOptionsIds(new com.amazonaws.internal.SdkInternalList<String>(dhcpOptionsIds.length));
        }
        for (String ele : dhcpOptionsIds) {
            this.dhcpOptionsIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more DHCP options sets.
     * </p>
     * <p>
     * Default: Describes all your DHCP options sets.
     * </p>
     * 
     * @param dhcpOptionsIds
     *        The IDs of one or more DHCP options sets.</p>
     *        <p>
     *        Default: Describes all your DHCP options sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsRequest withDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        setDhcpOptionsIds(dhcpOptionsIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The value for one of the options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>dhcp-options-id</code> - The ID of a DHCP options set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>value</code> - The value for one of the options.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The value for one of the options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The value for one of the options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The value for one of the options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The value for one of the options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The value for one of the options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>key</code> - The key for one of the options (for example, <code>domain-name</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The value for one of the options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the DHCP options set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDhcpOptionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeDhcpOptionsRequest> getDryRunRequest() {
        Request<DescribeDhcpOptionsRequest> request = new DescribeDhcpOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDhcpOptionsIds() != null)
            sb.append("DhcpOptionsIds: ").append(getDhcpOptionsIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDhcpOptionsRequest == false)
            return false;
        DescribeDhcpOptionsRequest other = (DescribeDhcpOptionsRequest) obj;
        if (other.getDhcpOptionsIds() == null ^ this.getDhcpOptionsIds() == null)
            return false;
        if (other.getDhcpOptionsIds() != null && other.getDhcpOptionsIds().equals(this.getDhcpOptionsIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDhcpOptionsIds() == null) ? 0 : getDhcpOptionsIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDhcpOptionsRequest clone() {
        return (DescribeDhcpOptionsRequest) super.clone();
    }
}
