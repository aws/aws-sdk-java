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
import com.amazonaws.services.ec2.model.transform.DescribeRegionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeRegionsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The names of the regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regionNames;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>endpoint</code> - The endpoint of the region (for example, <code>ec2.us-east-1.amazonaws.com</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region-name</code> - The name of the region (for example, <code>us-east-1</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The names of the regions.
     * </p>
     * 
     * @return The names of the regions.
     */

    public java.util.List<String> getRegionNames() {
        if (regionNames == null) {
            regionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regionNames;
    }

    /**
     * <p>
     * The names of the regions.
     * </p>
     * 
     * @param regionNames
     *        The names of the regions.
     */

    public void setRegionNames(java.util.Collection<String> regionNames) {
        if (regionNames == null) {
            this.regionNames = null;
            return;
        }

        this.regionNames = new com.amazonaws.internal.SdkInternalList<String>(regionNames);
    }

    /**
     * <p>
     * The names of the regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionNames(java.util.Collection)} or {@link #withRegionNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param regionNames
     *        The names of the regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsRequest withRegionNames(String... regionNames) {
        if (this.regionNames == null) {
            setRegionNames(new com.amazonaws.internal.SdkInternalList<String>(regionNames.length));
        }
        for (String ele : regionNames) {
            this.regionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the regions.
     * </p>
     * 
     * @param regionNames
     *        The names of the regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegionsRequest withRegionNames(java.util.Collection<String> regionNames) {
        setRegionNames(regionNames);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeRegionsRequest> getDryRunRequest() {
        Request<DescribeRegionsRequest> request = new DescribeRegionsRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getRegionNames() != null)
            sb.append("RegionNames: ").append(getRegionNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegionsRequest == false)
            return false;
        DescribeRegionsRequest other = (DescribeRegionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getRegionNames() == null ^ this.getRegionNames() == null)
            return false;
        if (other.getRegionNames() != null && other.getRegionNames().equals(this.getRegionNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getRegionNames() == null) ? 0 : getRegionNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegionsRequest clone() {
        return (DescribeRegionsRequest) super.clone();
    }
}
