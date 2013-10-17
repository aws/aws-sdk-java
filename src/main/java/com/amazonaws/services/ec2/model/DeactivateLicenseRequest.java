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
import com.amazonaws.services.ec2.model.transform.DeactivateLicenseRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deactivateLicense(DeactivateLicenseRequest) DeactivateLicense operation}.
 * <p>
 * Deactivates a specific number of licenses. Deactivations can be done against a specific license ID after they have persisted for at least a 90-day
 * period.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deactivateLicense(DeactivateLicenseRequest)
 */
public class DeactivateLicenseRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeactivateLicenseRequest> {

    /**
     * Specifies the ID for the specific license to deactivate against.
     */
    private String licenseId;

    /**
     * Specifies the amount of capacity to deactivate against the license.
     */
    private Integer capacity;

    /**
     * Default constructor for a new DeactivateLicenseRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeactivateLicenseRequest() {}
    
    /**
     * Constructs a new DeactivateLicenseRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param licenseId Specifies the ID for the specific license to
     * deactivate against.
     * @param capacity Specifies the amount of capacity to deactivate against
     * the license.
     */
    public DeactivateLicenseRequest(String licenseId, Integer capacity) {
        setLicenseId(licenseId);
        setCapacity(capacity);
    }

    /**
     * Specifies the ID for the specific license to deactivate against.
     *
     * @return Specifies the ID for the specific license to deactivate against.
     */
    public String getLicenseId() {
        return licenseId;
    }
    
    /**
     * Specifies the ID for the specific license to deactivate against.
     *
     * @param licenseId Specifies the ID for the specific license to deactivate against.
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
    
    /**
     * Specifies the ID for the specific license to deactivate against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseId Specifies the ID for the specific license to deactivate against.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeactivateLicenseRequest withLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     * Specifies the amount of capacity to deactivate against the license.
     *
     * @return Specifies the amount of capacity to deactivate against the license.
     */
    public Integer getCapacity() {
        return capacity;
    }
    
    /**
     * Specifies the amount of capacity to deactivate against the license.
     *
     * @param capacity Specifies the amount of capacity to deactivate against the license.
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Specifies the amount of capacity to deactivate against the license.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacity Specifies the amount of capacity to deactivate against the license.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeactivateLicenseRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeactivateLicenseRequest> getDryRunRequest() {
        Request<DeactivateLicenseRequest> request = new DeactivateLicenseRequestMarshaller().marshall(this);
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

        if (obj instanceof DeactivateLicenseRequest == false) return false;
        DeactivateLicenseRequest other = (DeactivateLicenseRequest)obj;
        
        if (other.getLicenseId() == null ^ this.getLicenseId() == null) return false;
        if (other.getLicenseId() != null && other.getLicenseId().equals(this.getLicenseId()) == false) return false; 
        if (other.getCapacity() == null ^ this.getCapacity() == null) return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false) return false; 
        return true;
    }
    
}
    