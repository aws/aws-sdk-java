/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeApplicationVersions(DescribeApplicationVersionsRequest) DescribeApplicationVersions operation}.
 * <p>
 * Returns descriptions for existing application versions.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeApplicationVersions(DescribeApplicationVersionsRequest)
 */
public class DescribeApplicationVersionsRequest extends AmazonWebServiceRequest {

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include ones that are associated with the
     * specified application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * If specified, restricts the returned descriptions to only include ones
     * that have the specified version labels.
     */
    private java.util.List<String> versionLabels;

    /**
     * Default constructor for a new DescribeApplicationVersionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeApplicationVersionsRequest() {}
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include ones that are associated with the
     * specified application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include ones that are associated with the
     *         specified application.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include ones that are associated with the
     * specified application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include ones that are associated with the
     *         specified application.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include ones that are associated with the
     * specified application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include ones that are associated with the
     *         specified application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeApplicationVersionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * If specified, restricts the returned descriptions to only include ones
     * that have the specified version labels.
     *
     * @return If specified, restricts the returned descriptions to only include ones
     *         that have the specified version labels.
     */
    public java.util.List<String> getVersionLabels() {
        
        if (versionLabels == null) {
            versionLabels = new java.util.ArrayList<String>();
        }
        return versionLabels;
    }
    
    /**
     * If specified, restricts the returned descriptions to only include ones
     * that have the specified version labels.
     *
     * @param versionLabels If specified, restricts the returned descriptions to only include ones
     *         that have the specified version labels.
     */
    public void setVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
            return;
        }

        java.util.List<String> versionLabelsCopy = new java.util.ArrayList<String>(versionLabels.size());
        versionLabelsCopy.addAll(versionLabels);
        this.versionLabels = versionLabelsCopy;
    }
    
    /**
     * If specified, restricts the returned descriptions to only include ones
     * that have the specified version labels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionLabels If specified, restricts the returned descriptions to only include ones
     *         that have the specified version labels.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeApplicationVersionsRequest withVersionLabels(String... versionLabels) {
        if (getVersionLabels() == null) setVersionLabels(new java.util.ArrayList<String>(versionLabels.length));
        for (String value : versionLabels) {
            getVersionLabels().add(value);
        }
        return this;
    }
    
    /**
     * If specified, restricts the returned descriptions to only include ones
     * that have the specified version labels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionLabels If specified, restricts the returned descriptions to only include ones
     *         that have the specified version labels.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeApplicationVersionsRequest withVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
        } else {
            java.util.List<String> versionLabelsCopy = new java.util.ArrayList<String>(versionLabels.size());
            versionLabelsCopy.addAll(versionLabels);
            this.versionLabels = versionLabelsCopy;
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
        if (applicationName != null) sb.append("ApplicationName: " + applicationName + ", ");
        if (versionLabels != null) sb.append("VersionLabels: " + versionLabels + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getVersionLabels() == null) ? 0 : getVersionLabels().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeApplicationVersionsRequest == false) return false;
        DescribeApplicationVersionsRequest other = (DescribeApplicationVersionsRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabels() == null ^ this.getVersionLabels() == null) return false;
        if (other.getVersionLabels() != null && other.getVersionLabels().equals(this.getVersionLabels()) == false) return false; 
        return true;
    }
    
}
    