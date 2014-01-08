/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the following objects or data if successful. Otherwise, returns an error.
 * </p>
 */
public class DescribeTrustedAdvisorChecksResult implements Serializable {

    /**
     * Information about all available Trusted Advisor checks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription> checks;

    /**
     * Information about all available Trusted Advisor checks.
     *
     * @return Information about all available Trusted Advisor checks.
     */
    public java.util.List<TrustedAdvisorCheckDescription> getChecks() {
        if (checks == null) {
              checks = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription>();
              checks.setAutoConstruct(true);
        }
        return checks;
    }
    
    /**
     * Information about all available Trusted Advisor checks.
     *
     * @param checks Information about all available Trusted Advisor checks.
     */
    public void setChecks(java.util.Collection<TrustedAdvisorCheckDescription> checks) {
        if (checks == null) {
            this.checks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription> checksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription>(checks.size());
        checksCopy.addAll(checks);
        this.checks = checksCopy;
    }
    
    /**
     * Information about all available Trusted Advisor checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checks Information about all available Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorChecksResult withChecks(TrustedAdvisorCheckDescription... checks) {
        if (getChecks() == null) setChecks(new java.util.ArrayList<TrustedAdvisorCheckDescription>(checks.length));
        for (TrustedAdvisorCheckDescription value : checks) {
            getChecks().add(value);
        }
        return this;
    }
    
    /**
     * Information about all available Trusted Advisor checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checks Information about all available Trusted Advisor checks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorChecksResult withChecks(java.util.Collection<TrustedAdvisorCheckDescription> checks) {
        if (checks == null) {
            this.checks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription> checksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrustedAdvisorCheckDescription>(checks.size());
            checksCopy.addAll(checks);
            this.checks = checksCopy;
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
        if (getChecks() != null) sb.append("Checks: " + getChecks() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getChecks() == null) ? 0 : getChecks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorChecksResult == false) return false;
        DescribeTrustedAdvisorChecksResult other = (DescribeTrustedAdvisorChecksResult)obj;
        
        if (other.getChecks() == null ^ this.getChecks() == null) return false;
        if (other.getChecks() != null && other.getChecks().equals(this.getChecks()) == false) return false; 
        return true;
    }
    
}
    