/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeDhcpOptionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeDhcpOptions(DescribeDhcpOptionsRequest) DescribeDhcpOptions operation}.
 * <p>
 * Describes one or more of your DHCP options sets.
 * </p>
 * <p>
 * For more information about DHCP options sets, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeDhcpOptions(DescribeDhcpOptionsRequest)
 */
public class DescribeDhcpOptionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeDhcpOptionsRequest> {

    /**
     * The IDs of one or more DHCP options sets. <p>Default: Describes all
     * your DHCP options sets.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIds;

    /**
     * One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     * ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     * for one of the options (for example, <code>domain-name</code>). </li>
     * <li> <p><code>value</code> - The value for one of the options. </li>
     * <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The IDs of one or more DHCP options sets. <p>Default: Describes all
     * your DHCP options sets.
     *
     * @return The IDs of one or more DHCP options sets. <p>Default: Describes all
     *         your DHCP options sets.
     */
    public java.util.List<String> getDhcpOptionsIds() {
        if (dhcpOptionsIds == null) {
              dhcpOptionsIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dhcpOptionsIds.setAutoConstruct(true);
        }
        return dhcpOptionsIds;
    }
    
    /**
     * The IDs of one or more DHCP options sets. <p>Default: Describes all
     * your DHCP options sets.
     *
     * @param dhcpOptionsIds The IDs of one or more DHCP options sets. <p>Default: Describes all
     *         your DHCP options sets.
     */
    public void setDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        if (dhcpOptionsIds == null) {
            this.dhcpOptionsIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dhcpOptionsIds.size());
        dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
        this.dhcpOptionsIds = dhcpOptionsIdsCopy;
    }
    
    /**
     * The IDs of one or more DHCP options sets. <p>Default: Describes all
     * your DHCP options sets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The IDs of one or more DHCP options sets. <p>Default: Describes all
     *         your DHCP options sets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(String... dhcpOptionsIds) {
        if (getDhcpOptionsIds() == null) setDhcpOptionsIds(new java.util.ArrayList<String>(dhcpOptionsIds.length));
        for (String value : dhcpOptionsIds) {
            getDhcpOptionsIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of one or more DHCP options sets. <p>Default: Describes all
     * your DHCP options sets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsIds The IDs of one or more DHCP options sets. <p>Default: Describes all
     *         your DHCP options sets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDhcpOptionsRequest withDhcpOptionsIds(java.util.Collection<String> dhcpOptionsIds) {
        if (dhcpOptionsIds == null) {
            this.dhcpOptionsIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dhcpOptionsIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dhcpOptionsIds.size());
            dhcpOptionsIdsCopy.addAll(dhcpOptionsIds);
            this.dhcpOptionsIds = dhcpOptionsIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     * ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     * for one of the options (for example, <code>domain-name</code>). </li>
     * <li> <p><code>value</code> - The value for one of the options. </li>
     * <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     *         ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     *         for one of the options (for example, <code>domain-name</code>). </li>
     *         <li> <p><code>value</code> - The value for one of the options. </li>
     *         <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     * ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     * for one of the options (for example, <code>domain-name</code>). </li>
     * <li> <p><code>value</code> - The value for one of the options. </li>
     * <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     *         ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     *         for one of the options (for example, <code>domain-name</code>). </li>
     *         <li> <p><code>value</code> - The value for one of the options. </li>
     *         <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     * ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     * for one of the options (for example, <code>domain-name</code>). </li>
     * <li> <p><code>value</code> - The value for one of the options. </li>
     * <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     *         ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     *         for one of the options (for example, <code>domain-name</code>). </li>
     *         <li> <p><code>value</code> - The value for one of the options. </li>
     *         <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDhcpOptionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     * ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     * for one of the options (for example, <code>domain-name</code>). </li>
     * <li> <p><code>value</code> - The value for one of the options. </li>
     * <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>dhcp-options-id</code> - The
     *         ID of a set of DHCP options. </li> <li> <p><code>key</code> - The key
     *         for one of the options (for example, <code>domain-name</code>). </li>
     *         <li> <p><code>value</code> - The value for one of the options. </li>
     *         <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDhcpOptionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeDhcpOptionsRequest> getDryRunRequest() {
        Request<DescribeDhcpOptionsRequest> request = new DescribeDhcpOptionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDhcpOptionsIds() != null) sb.append("DhcpOptionsIds: " + getDhcpOptionsIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDhcpOptionsRequest == false) return false;
        DescribeDhcpOptionsRequest other = (DescribeDhcpOptionsRequest)obj;
        
        if (other.getDhcpOptionsIds() == null ^ this.getDhcpOptionsIds() == null) return false;
        if (other.getDhcpOptionsIds() != null && other.getDhcpOptionsIds().equals(this.getDhcpOptionsIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    