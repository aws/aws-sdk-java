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
import com.amazonaws.services.ec2.model.transform.ActivateLicenseRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#activateLicense(ActivateLicenseRequest) ActivateLicense operation}.
 * <p>
 * Activates a specific number of licenses for a 90-day period. Activations can be done against a specific license ID.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#activateLicense(ActivateLicenseRequest)
 */
public class ActivateLicenseRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ActivateLicenseRequest> {

    /**
     * Specifies the ID for the specific license to activate against.
     */
    private String licenseId;

    /**
     * Specifies the additional number of licenses to activate.
     */
    private Integer capacity;

    /**
     * Default constructor for a new ActivateLicenseRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ActivateLicenseRequest() {}
    
    /**
     * Constructs a new ActivateLicenseRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param licenseId Specifies the ID for the specific license to activate
     * against.
     * @param capacity Specifies the additional number of licenses to
     * activate.
     */
    public ActivateLicenseRequest(String licenseId, Integer capacity) {
        setLicenseId(licenseId);
        setCapacity(capacity);
    }

    /**
     * Specifies the ID for the specific license to activate against.
     *
     * @return Specifies the ID for the specific license to activate against.
     */
    public String getLicenseId() {
        return licenseId;
    }
    
    /**
     * Specifies the ID for the specific license to activate against.
     *
     * @param licenseId Specifies the ID for the specific license to activate against.
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
    
    /**
     * Specifies the ID for the specific license to activate against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseId Specifies the ID for the specific license to activate against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateLicenseRequest withLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     * Specifies the additional number of licenses to activate.
     *
     * @return Specifies the additional number of licenses to activate.
     */
    public Integer getCapacity() {
        return capacity;
    }
    
    /**
     * Specifies the additional number of licenses to activate.
     *
     * @param capacity Specifies the additional number of licenses to activate.
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Specifies the additional number of licenses to activate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacity Specifies the additional number of licenses to activate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivateLicenseRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ActivateLicenseRequest> getDryRunRequest() {
        Request<ActivateLicenseRequest> request = new ActivateLicenseRequestMarshaller().marshall(this);
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
        if (getLicenseId() != null) sb.append("LicenseId: " + getLicenseId() + ",");
        if (getCapacity() != null) sb.append("Capacity: " + getCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLicenseId() == null) ? 0 : getLicenseId().hashCode()); 
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivateLicenseRequest == false) return false;
        ActivateLicenseRequest other = (ActivateLicenseRequest)obj;
        
        if (other.getLicenseId() == null ^ this.getLicenseId() == null) return false;
        if (other.getLicenseId() != null && other.getLicenseId().equals(this.getLicenseId()) == false) return false; 
        if (other.getCapacity() == null ^ this.getCapacity() == null) return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false) return false; 
        return true;
    }
    
}
    