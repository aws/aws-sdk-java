/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeLicensesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeLicenses(DescribeLicensesRequest) DescribeLicenses operation}.
 * <p>
 * Provides details of a user's registered licenses. Zero or more IDs may be specified on the call. When one or more license IDs are specified, only
 * data for the specified IDs are returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeLicenses(DescribeLicensesRequest)
 */
public class DescribeLicensesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeLicensesRequest> {

    /**
     * Specifies the license registration for which details are to be
     * returned.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> licenseIds;

    /**
     * A list of filters used to match properties for Licenses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Specifies the license registration for which details are to be
     * returned.
     *
     * @return Specifies the license registration for which details are to be
     *         returned.
     */
    public java.util.List<String> getLicenseIds() {
        if (licenseIds == null) {
              licenseIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              licenseIds.setAutoConstruct(true);
        }
        return licenseIds;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     */
    public void setLicenseIds(java.util.Collection<String> licenseIds) {
        if (licenseIds == null) {
            this.licenseIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> licenseIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(licenseIds.size());
        licenseIdsCopy.addAll(licenseIds);
        this.licenseIds = licenseIdsCopy;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesRequest withLicenseIds(String... licenseIds) {
        if (getLicenseIds() == null) setLicenseIds(new java.util.ArrayList<String>(licenseIds.length));
        for (String value : licenseIds) {
            getLicenseIds().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesRequest withLicenseIds(java.util.Collection<String> licenseIds) {
        if (licenseIds == null) {
            this.licenseIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> licenseIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(licenseIds.size());
            licenseIdsCopy.addAll(licenseIds);
            this.licenseIds = licenseIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Licenses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Licenses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Licenses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Licenses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for Licenses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Licenses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Licenses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Licenses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeLicensesRequest> getDryRunRequest() {
        Request<DescribeLicensesRequest> request = new DescribeLicensesRequestMarshaller().marshall(this);
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
        if (getLicenseIds() != null) sb.append("LicenseIds: " + getLicenseIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLicenseIds() == null) ? 0 : getLicenseIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLicensesRequest == false) return false;
        DescribeLicensesRequest other = (DescribeLicensesRequest)obj;
        
        if (other.getLicenseIds() == null ^ this.getLicenseIds() == null) return false;
        if (other.getLicenseIds() != null && other.getLicenseIds().equals(this.getLicenseIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    