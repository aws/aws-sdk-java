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
import com.amazonaws.services.ec2.model.transform.DescribeAvailabilityZonesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeAvailabilityZones(DescribeAvailabilityZonesRequest) DescribeAvailabilityZones operation}.
 * <p>
 * Describes one or more of the Availability Zones that are available to
 * you. The results include zones only for the region you're currently
 * using. If there is an event impacting an Availability Zone, you can
 * use this request to view the state and any provided message for that
 * Availability Zone.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"> Regions and Availability Zones </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeAvailabilityZones(DescribeAvailabilityZonesRequest)
 */
public class DescribeAvailabilityZonesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeAvailabilityZonesRequest> {

    /**
     * The names of one or more Availability Zones.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> zoneNames;

    /**
     * One or more filters. <ul> <li> <p><code>message</code> - Information
     * about the Availability Zone. </li> <li> <p><code>region-name</code> -
     * The name of the region for the Availability Zone (for example,
     * <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     * of the Availability Zone (<code>available</code> |
     * <code>impaired</code> | <code>unavailable</code>). </li> <li>
     * <p><code>zone-name</code> - The name of the Availability Zone (for
     * example, <code>us-east-1a</code>). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The names of one or more Availability Zones.
     *
     * @return The names of one or more Availability Zones.
     */
    public java.util.List<String> getZoneNames() {
        if (zoneNames == null) {
              zoneNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              zoneNames.setAutoConstruct(true);
        }
        return zoneNames;
    }
    
    /**
     * The names of one or more Availability Zones.
     *
     * @param zoneNames The names of one or more Availability Zones.
     */
    public void setZoneNames(java.util.Collection<String> zoneNames) {
        if (zoneNames == null) {
            this.zoneNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> zoneNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(zoneNames.size());
        zoneNamesCopy.addAll(zoneNames);
        this.zoneNames = zoneNamesCopy;
    }
    
    /**
     * The names of one or more Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zoneNames The names of one or more Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesRequest withZoneNames(String... zoneNames) {
        if (getZoneNames() == null) setZoneNames(new java.util.ArrayList<String>(zoneNames.length));
        for (String value : zoneNames) {
            getZoneNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of one or more Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zoneNames The names of one or more Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesRequest withZoneNames(java.util.Collection<String> zoneNames) {
        if (zoneNames == null) {
            this.zoneNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> zoneNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(zoneNames.size());
            zoneNamesCopy.addAll(zoneNames);
            this.zoneNames = zoneNamesCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>message</code> - Information
     * about the Availability Zone. </li> <li> <p><code>region-name</code> -
     * The name of the region for the Availability Zone (for example,
     * <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     * of the Availability Zone (<code>available</code> |
     * <code>impaired</code> | <code>unavailable</code>). </li> <li>
     * <p><code>zone-name</code> - The name of the Availability Zone (for
     * example, <code>us-east-1a</code>). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>message</code> - Information
     *         about the Availability Zone. </li> <li> <p><code>region-name</code> -
     *         The name of the region for the Availability Zone (for example,
     *         <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     *         of the Availability Zone (<code>available</code> |
     *         <code>impaired</code> | <code>unavailable</code>). </li> <li>
     *         <p><code>zone-name</code> - The name of the Availability Zone (for
     *         example, <code>us-east-1a</code>). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>message</code> - Information
     * about the Availability Zone. </li> <li> <p><code>region-name</code> -
     * The name of the region for the Availability Zone (for example,
     * <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     * of the Availability Zone (<code>available</code> |
     * <code>impaired</code> | <code>unavailable</code>). </li> <li>
     * <p><code>zone-name</code> - The name of the Availability Zone (for
     * example, <code>us-east-1a</code>). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>message</code> - Information
     *         about the Availability Zone. </li> <li> <p><code>region-name</code> -
     *         The name of the region for the Availability Zone (for example,
     *         <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     *         of the Availability Zone (<code>available</code> |
     *         <code>impaired</code> | <code>unavailable</code>). </li> <li>
     *         <p><code>zone-name</code> - The name of the Availability Zone (for
     *         example, <code>us-east-1a</code>). </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>message</code> - Information
     * about the Availability Zone. </li> <li> <p><code>region-name</code> -
     * The name of the region for the Availability Zone (for example,
     * <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     * of the Availability Zone (<code>available</code> |
     * <code>impaired</code> | <code>unavailable</code>). </li> <li>
     * <p><code>zone-name</code> - The name of the Availability Zone (for
     * example, <code>us-east-1a</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>message</code> - Information
     *         about the Availability Zone. </li> <li> <p><code>region-name</code> -
     *         The name of the region for the Availability Zone (for example,
     *         <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     *         of the Availability Zone (<code>available</code> |
     *         <code>impaired</code> | <code>unavailable</code>). </li> <li>
     *         <p><code>zone-name</code> - The name of the Availability Zone (for
     *         example, <code>us-east-1a</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>message</code> - Information
     * about the Availability Zone. </li> <li> <p><code>region-name</code> -
     * The name of the region for the Availability Zone (for example,
     * <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     * of the Availability Zone (<code>available</code> |
     * <code>impaired</code> | <code>unavailable</code>). </li> <li>
     * <p><code>zone-name</code> - The name of the Availability Zone (for
     * example, <code>us-east-1a</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>message</code> - Information
     *         about the Availability Zone. </li> <li> <p><code>region-name</code> -
     *         The name of the region for the Availability Zone (for example,
     *         <code>us-east-1</code>). </li> <li> <p><code>state</code> - The state
     *         of the Availability Zone (<code>available</code> |
     *         <code>impaired</code> | <code>unavailable</code>). </li> <li>
     *         <p><code>zone-name</code> - The name of the Availability Zone (for
     *         example, <code>us-east-1a</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityZonesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeAvailabilityZonesRequest> getDryRunRequest() {
        Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesRequestMarshaller().marshall(this);
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
        if (getZoneNames() != null) sb.append("ZoneNames: " + getZoneNames() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getZoneNames() == null) ? 0 : getZoneNames().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAvailabilityZonesRequest == false) return false;
        DescribeAvailabilityZonesRequest other = (DescribeAvailabilityZonesRequest)obj;
        
        if (other.getZoneNames() == null ^ this.getZoneNames() == null) return false;
        if (other.getZoneNames() != null && other.getZoneNames().equals(this.getZoneNames()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    