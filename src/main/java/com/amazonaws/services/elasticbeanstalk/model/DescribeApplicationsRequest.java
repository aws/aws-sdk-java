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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeApplications(DescribeApplicationsRequest) DescribeApplications operation}.
 * <p>
 * Returns the descriptions of existing applications.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeApplications(DescribeApplicationsRequest)
 */
public class DescribeApplicationsRequest extends AmazonWebServiceRequest {

    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include those with the specified names.
     */
    private java.util.List<String> applicationNames;

    /**
     * Default constructor for a new DescribeApplicationsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeApplicationsRequest() {}
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include those with the specified names.
     *
     * @return If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include those with the specified names.
     */
    public java.util.List<String> getApplicationNames() {
        if (applicationNames == null) {
            applicationNames = new java.util.ArrayList<String>();
        }
        return applicationNames;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include those with the specified names.
     *
     * @param applicationNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include those with the specified names.
     */
    public void setApplicationNames(java.util.Collection<String> applicationNames) {
        java.util.List<String> applicationNamesCopy = new java.util.ArrayList<String>();
        if (applicationNames != null) {
            applicationNamesCopy.addAll(applicationNames);
        }
        this.applicationNames = applicationNamesCopy;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include those with the specified names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include those with the specified names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeApplicationsRequest withApplicationNames(String... applicationNames) {
        for (String value : applicationNames) {
            getApplicationNames().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk restricts the returned
     * descriptions to only include those with the specified names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationNames If specified, AWS Elastic Beanstalk restricts the returned
     *         descriptions to only include those with the specified names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeApplicationsRequest withApplicationNames(java.util.Collection<String> applicationNames) {
        java.util.List<String> applicationNamesCopy = new java.util.ArrayList<String>();
        if (applicationNames != null) {
            applicationNamesCopy.addAll(applicationNames);
        }
        this.applicationNames = applicationNamesCopy;

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
        sb.append("ApplicationNames: " + applicationNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    