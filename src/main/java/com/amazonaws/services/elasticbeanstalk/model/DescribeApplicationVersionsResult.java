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
 * Result message wrapping a list of application version descriptions.
 * </p>
 */
public class DescribeApplicationVersionsResult implements Serializable {

    /**
     * A list of <a>ApplicationVersionDescription</a> .
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription> applicationVersions;

    /**
     * A list of <a>ApplicationVersionDescription</a> .
     *
     * @return A list of <a>ApplicationVersionDescription</a> .
     */
    public java.util.List<ApplicationVersionDescription> getApplicationVersions() {
        if (applicationVersions == null) {
              applicationVersions = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription>();
              applicationVersions.setAutoConstruct(true);
        }
        return applicationVersions;
    }
    
    /**
     * A list of <a>ApplicationVersionDescription</a> .
     *
     * @param applicationVersions A list of <a>ApplicationVersionDescription</a> .
     */
    public void setApplicationVersions(java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        if (applicationVersions == null) {
            this.applicationVersions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription> applicationVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription>(applicationVersions.size());
        applicationVersionsCopy.addAll(applicationVersions);
        this.applicationVersions = applicationVersionsCopy;
    }
    
    /**
     * A list of <a>ApplicationVersionDescription</a> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationVersions A list of <a>ApplicationVersionDescription</a> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeApplicationVersionsResult withApplicationVersions(ApplicationVersionDescription... applicationVersions) {
        if (getApplicationVersions() == null) setApplicationVersions(new java.util.ArrayList<ApplicationVersionDescription>(applicationVersions.length));
        for (ApplicationVersionDescription value : applicationVersions) {
            getApplicationVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ApplicationVersionDescription</a> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationVersions A list of <a>ApplicationVersionDescription</a> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeApplicationVersionsResult withApplicationVersions(java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        if (applicationVersions == null) {
            this.applicationVersions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription> applicationVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ApplicationVersionDescription>(applicationVersions.size());
            applicationVersionsCopy.addAll(applicationVersions);
            this.applicationVersions = applicationVersionsCopy;
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
        if (getApplicationVersions() != null) sb.append("ApplicationVersions: " + getApplicationVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationVersions() == null) ? 0 : getApplicationVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeApplicationVersionsResult == false) return false;
        DescribeApplicationVersionsResult other = (DescribeApplicationVersionsResult)obj;
        
        if (other.getApplicationVersions() == null ^ this.getApplicationVersions() == null) return false;
        if (other.getApplicationVersions() != null && other.getApplicationVersions().equals(this.getApplicationVersions()) == false) return false; 
        return true;
    }
    
}
    