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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * </p>
 */
public class DescribeHsmConfigurationsResult implements Serializable {

    /**
     * A marker at which to continue listing HSM configurations in a new
     * request. The response returns a marker if there are more HSM
     * configurations to list than returned in the response.
     */
    private String marker;

    /**
     * A list of Amazon Redshift HSM configurations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration> hsmConfigurations;

    /**
     * A marker at which to continue listing HSM configurations in a new
     * request. The response returns a marker if there are more HSM
     * configurations to list than returned in the response.
     *
     * @return A marker at which to continue listing HSM configurations in a new
     *         request. The response returns a marker if there are more HSM
     *         configurations to list than returned in the response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker at which to continue listing HSM configurations in a new
     * request. The response returns a marker if there are more HSM
     * configurations to list than returned in the response.
     *
     * @param marker A marker at which to continue listing HSM configurations in a new
     *         request. The response returns a marker if there are more HSM
     *         configurations to list than returned in the response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker at which to continue listing HSM configurations in a new
     * request. The response returns a marker if there are more HSM
     * configurations to list than returned in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker at which to continue listing HSM configurations in a new
     *         request. The response returns a marker if there are more HSM
     *         configurations to list than returned in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmConfigurationsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of Amazon Redshift HSM configurations.
     *
     * @return A list of Amazon Redshift HSM configurations.
     */
    public java.util.List<HsmConfiguration> getHsmConfigurations() {
        if (hsmConfigurations == null) {
              hsmConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration>();
              hsmConfigurations.setAutoConstruct(true);
        }
        return hsmConfigurations;
    }
    
    /**
     * A list of Amazon Redshift HSM configurations.
     *
     * @param hsmConfigurations A list of Amazon Redshift HSM configurations.
     */
    public void setHsmConfigurations(java.util.Collection<HsmConfiguration> hsmConfigurations) {
        if (hsmConfigurations == null) {
            this.hsmConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration> hsmConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration>(hsmConfigurations.size());
        hsmConfigurationsCopy.addAll(hsmConfigurations);
        this.hsmConfigurations = hsmConfigurationsCopy;
    }
    
    /**
     * A list of Amazon Redshift HSM configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurations A list of Amazon Redshift HSM configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmConfigurationsResult withHsmConfigurations(HsmConfiguration... hsmConfigurations) {
        if (getHsmConfigurations() == null) setHsmConfigurations(new java.util.ArrayList<HsmConfiguration>(hsmConfigurations.length));
        for (HsmConfiguration value : hsmConfigurations) {
            getHsmConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A list of Amazon Redshift HSM configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurations A list of Amazon Redshift HSM configurations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmConfigurationsResult withHsmConfigurations(java.util.Collection<HsmConfiguration> hsmConfigurations) {
        if (hsmConfigurations == null) {
            this.hsmConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration> hsmConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HsmConfiguration>(hsmConfigurations.size());
            hsmConfigurationsCopy.addAll(hsmConfigurations);
            this.hsmConfigurations = hsmConfigurationsCopy;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getHsmConfigurations() != null) sb.append("HsmConfigurations: " + getHsmConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getHsmConfigurations() == null) ? 0 : getHsmConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHsmConfigurationsResult == false) return false;
        DescribeHsmConfigurationsResult other = (DescribeHsmConfigurationsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getHsmConfigurations() == null ^ this.getHsmConfigurations() == null) return false;
        if (other.getHsmConfigurations() != null && other.getHsmConfigurations().equals(this.getHsmConfigurations()) == false) return false; 
        return true;
    }
    
}
    