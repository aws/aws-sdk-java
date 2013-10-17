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


/**
 * <p>
 * </p>
 */
public class DescribeLicensesResult implements Serializable {

    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<License> licenses;

    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     *
     * @return Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     */
    public java.util.List<License> getLicenses() {
        if (licenses == null) {
              licenses = new com.amazonaws.internal.ListWithAutoConstructFlag<License>();
              licenses.setAutoConstruct(true);
        }
        return licenses;
    }
    
    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     *
     * @param licenses Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     */
    public void setLicenses(java.util.Collection<License> licenses) {
        if (licenses == null) {
            this.licenses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<License> licensesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<License>(licenses.size());
        licensesCopy.addAll(licenses);
        this.licenses = licensesCopy;
    }
    
    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenses Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesResult withLicenses(License... licenses) {
        if (getLicenses() == null) setLicenses(new java.util.ArrayList<License>(licenses.length));
        for (License value : licenses) {
            getLicenses().add(value);
        }
        return this;
    }
    
    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenses Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLicensesResult withLicenses(java.util.Collection<License> licenses) {
        if (licenses == null) {
            this.licenses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<License> licensesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<License>(licenses.size());
            licensesCopy.addAll(licenses);
            this.licenses = licensesCopy;
        }

        return this;
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
        if (getLicenses() != null) sb.append("Licenses: " + getLicenses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLicenses() == null) ? 0 : getLicenses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLicensesResult == false) return false;
        DescribeLicensesResult other = (DescribeLicensesResult)obj;
        
        if (other.getLicenses() == null ^ this.getLicenses() == null) return false;
        if (other.getLicenses() != null && other.getLicenses().equals(this.getLicenses()) == false) return false; 
        return true;
    }
    
}
    