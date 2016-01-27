/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;

/**
 * <p>
 * The status and configuration of the domain's availability options.
 * </p>
 * @deprecated Use {@link com.amazonaws.services.cloudsearchv2.model.AvailabilityOptionsStatus} instead.
 */
@Deprecated
public class AvailabilityOptionsStatus implements Serializable {

    /**
     * The availability options configured for the domain.
     */
    private Boolean options;

    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     */
    private OptionStatus status;

    /**
     * The availability options configured for the domain.
     *
     * @return The availability options configured for the domain.
     */
    public Boolean isOptions() {
        return options;
    }
    
    /**
     * The availability options configured for the domain.
     *
     * @param options The availability options configured for the domain.
     */
    public void setOptions(Boolean options) {
        this.options = options;
    }
    
    /**
     * The availability options configured for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The availability options configured for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityOptionsStatus withOptions(Boolean options) {
        this.options = options;
        return this;
    }

    /**
     * The availability options configured for the domain.
     *
     * @return The availability options configured for the domain.
     */
    public Boolean getOptions() {
        return options;
    }

    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @return The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public OptionStatus getStatus() {
        return status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityOptionsStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (isOptions() != null) sb.append("Options: " + isOptions() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isOptions() == null) ? 0 : isOptions().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AvailabilityOptionsStatus == false) return false;
        AvailabilityOptionsStatus other = (AvailabilityOptionsStatus)obj;
        
        if (other.isOptions() == null ^ this.isOptions() == null) return false;
        if (other.isOptions() != null && other.isOptions().equals(this.isOptions()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    