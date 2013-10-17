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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Result message containing a list of application descriptions.
 * </p>
 */
public class DescribeApplicationsResult implements Serializable {

    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription> applications;

    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @return This parameter contains a list of <a>ApplicationDescription</a>.
     */
    public java.util.List<ApplicationDescription> getApplications() {
        if (applications == null) {
              applications = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription>();
              applications.setAutoConstruct(true);
        }
        return applications;
    }
    
    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @param applications This parameter contains a list of <a>ApplicationDescription</a>.
     */
    public void setApplications(java.util.Collection<ApplicationDescription> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription>(applications.size());
        applicationsCopy.addAll(applications);
        this.applications = applicationsCopy;
    }
    
    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeApplicationsResult withApplications(ApplicationDescription... applications) {
        if (getApplications() == null) setApplications(new java.util.ArrayList<ApplicationDescription>(applications.length));
        for (ApplicationDescription value : applications) {
            getApplications().add(value);
        }
        return this;
    }
    
    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeApplicationsResult withApplications(java.util.Collection<ApplicationDescription> applications) {
        if (applications == null) {
            this.applications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationDescription>(applications.size());
            applicationsCopy.addAll(applications);
            this.applications = applicationsCopy;
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
        if (getApplications() != null) sb.append("Applications: " + getApplications() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeApplicationsResult == false) return false;
        DescribeApplicationsResult other = (DescribeApplicationsResult)obj;
        
        if (other.getApplications() == null ^ this.getApplications() == null) return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false) return false; 
        return true;
    }
    
}
    