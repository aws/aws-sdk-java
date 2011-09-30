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
 * Result message wrapping a list of application version descriptions.
 * </p>
 */
public class DescribeApplicationVersionsResult {

    /**
     * A list of <a>ApplicationVersionDescription</a> .
     */
    private java.util.List<ApplicationVersionDescription> applicationVersions;

    /**
     * A list of <a>ApplicationVersionDescription</a> .
     *
     * @return A list of <a>ApplicationVersionDescription</a> .
     */
    public java.util.List<ApplicationVersionDescription> getApplicationVersions() {
        
        if (applicationVersions == null) {
            applicationVersions = new java.util.ArrayList<ApplicationVersionDescription>();
        }
        return applicationVersions;
    }
    
    /**
     * A list of <a>ApplicationVersionDescription</a> .
     *
     * @param applicationVersions A list of <a>ApplicationVersionDescription</a> .
     */
    public void setApplicationVersions(java.util.Collection<ApplicationVersionDescription> applicationVersions) {
        java.util.List<ApplicationVersionDescription> applicationVersionsCopy = new java.util.ArrayList<ApplicationVersionDescription>();
        if (applicationVersions != null) {
            applicationVersionsCopy.addAll(applicationVersions);
        }
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
        if (getApplicationVersions() == null) setApplicationVersions(new java.util.ArrayList<ApplicationVersionDescription>());
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
        java.util.List<ApplicationVersionDescription> applicationVersionsCopy = new java.util.ArrayList<ApplicationVersionDescription>();
        if (applicationVersions != null) {
            applicationVersionsCopy.addAll(applicationVersions);
        }
        this.applicationVersions = applicationVersionsCopy;

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
        sb.append("ApplicationVersions: " + applicationVersions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    