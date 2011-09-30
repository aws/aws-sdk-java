/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Result message containing a list of application descriptions.
 * </p>
 */
public class DescribeApplicationsResult {

    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     */
    private java.util.List<ApplicationDescription> applications;

    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @return This parameter contains a list of <a>ApplicationDescription</a>.
     */
    public java.util.List<ApplicationDescription> getApplications() {
        
        if (applications == null) {
            applications = new java.util.ArrayList<ApplicationDescription>();
        }
        return applications;
    }
    
    /**
     * This parameter contains a list of <a>ApplicationDescription</a>.
     *
     * @param applications This parameter contains a list of <a>ApplicationDescription</a>.
     */
    public void setApplications(java.util.Collection<ApplicationDescription> applications) {
        java.util.List<ApplicationDescription> applicationsCopy = new java.util.ArrayList<ApplicationDescription>();
        if (applications != null) {
            applicationsCopy.addAll(applications);
        }
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
        if (getApplications() == null) setApplications(new java.util.ArrayList<ApplicationDescription>());
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
        java.util.List<ApplicationDescription> applicationsCopy = new java.util.ArrayList<ApplicationDescription>();
        if (applications != null) {
            applicationsCopy.addAll(applications);
        }
        this.applications = applicationsCopy;

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
        sb.append("Applications: " + applications + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    