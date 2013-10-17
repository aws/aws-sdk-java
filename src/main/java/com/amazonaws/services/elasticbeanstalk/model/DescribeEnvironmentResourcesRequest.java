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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironmentResources(DescribeEnvironmentResourcesRequest) DescribeEnvironmentResources operation}.
 * <p>
 * Returns AWS resources for this environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#describeEnvironmentResources(DescribeEnvironmentResourcesRequest)
 */
public class DescribeEnvironmentResourcesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentName, or
     * both. If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     */
    private String environmentId;

    /**
     * The name of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentId, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * Default constructor for a new DescribeEnvironmentResourcesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeEnvironmentResourcesRequest() {}
    
    /**
     * The ID of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentName, or
     * both. If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     *
     * @return The ID of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentName, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentName, or
     * both. If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     *
     * @param environmentId The ID of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentName, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentName, or
     * both. If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentName, or
     *         both. If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEnvironmentResourcesRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * The name of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentId, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentId, or both.
     *         If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentId, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentId, or both.
     *         If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to retrieve AWS resource usage data. <p>
     * Condition: You must specify either this or an EnvironmentId, or both.
     * If you do not specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to retrieve AWS resource usage data. <p>
     *         Condition: You must specify either this or an EnvironmentId, or both.
     *         If you do not specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEnvironmentResourcesRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
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
        if (getEnvironmentId() != null) sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEnvironmentResourcesRequest == false) return false;
        DescribeEnvironmentResourcesRequest other = (DescribeEnvironmentResourcesRequest)obj;
        
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null) return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        return true;
    }
    
}
    