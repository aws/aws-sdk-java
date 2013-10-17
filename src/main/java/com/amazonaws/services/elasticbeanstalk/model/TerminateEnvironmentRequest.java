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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#terminateEnvironment(TerminateEnvironmentRequest) TerminateEnvironment operation}.
 * <p>
 * Terminates the specified environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#terminateEnvironment(TerminateEnvironmentRequest)
 */
public class TerminateEnvironmentRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentName, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     */
    private String environmentId;

    /**
     * The name of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentId, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * Indicates whether the associated AWS resources should shut down when
     * the environment is terminated: <enumValues> <value name="true"> <p>
     * <code>true</code>: (default) The user AWS resources (for example, the
     * Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     * environment. </value> <value name="false"> <p> <code>false</code>: The
     * environment is removed from the AWS Elastic Beanstalk but the AWS
     * resources continue to operate. </value> </enumValues> <ul> <li>
     * <code>true</code>: The specified environment as well as the associated
     * AWS resources, such as Auto Scaling group and LoadBalancer, are
     * terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     * resource management is removed from the environment, but the AWS
     * resources continue to operate. </li> </ul> <p> For more information,
     * see the <a
     * href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     * AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     * <p> Valid Values: <code>true</code> | <code>false</code>
     */
    private Boolean terminateResources;

    /**
     * Default constructor for a new TerminateEnvironmentRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public TerminateEnvironmentRequest() {}
    
    /**
     * The ID of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentName, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     *
     * @return The ID of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentName, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentName, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     *
     * @param environmentId The ID of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentName, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentName, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentName, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * The name of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentId, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentId, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentId, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentId, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to terminate. <p> Condition: You must
     * specify either this or an EnvironmentId, or both. If you do not
     * specify either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to terminate. <p> Condition: You must
     *         specify either this or an EnvironmentId, or both. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * Indicates whether the associated AWS resources should shut down when
     * the environment is terminated: <enumValues> <value name="true"> <p>
     * <code>true</code>: (default) The user AWS resources (for example, the
     * Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     * environment. </value> <value name="false"> <p> <code>false</code>: The
     * environment is removed from the AWS Elastic Beanstalk but the AWS
     * resources continue to operate. </value> </enumValues> <ul> <li>
     * <code>true</code>: The specified environment as well as the associated
     * AWS resources, such as Auto Scaling group and LoadBalancer, are
     * terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     * resource management is removed from the environment, but the AWS
     * resources continue to operate. </li> </ul> <p> For more information,
     * see the <a
     * href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     * AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     * <p> Valid Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether the associated AWS resources should shut down when
     *         the environment is terminated: <enumValues> <value name="true"> <p>
     *         <code>true</code>: (default) The user AWS resources (for example, the
     *         Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     *         environment. </value> <value name="false"> <p> <code>false</code>: The
     *         environment is removed from the AWS Elastic Beanstalk but the AWS
     *         resources continue to operate. </value> </enumValues> <ul> <li>
     *         <code>true</code>: The specified environment as well as the associated
     *         AWS resources, such as Auto Scaling group and LoadBalancer, are
     *         terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     *         resource management is removed from the environment, but the AWS
     *         resources continue to operate. </li> </ul> <p> For more information,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     *         AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     *         <p> Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTerminateResources() {
        return terminateResources;
    }
    
    /**
     * Indicates whether the associated AWS resources should shut down when
     * the environment is terminated: <enumValues> <value name="true"> <p>
     * <code>true</code>: (default) The user AWS resources (for example, the
     * Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     * environment. </value> <value name="false"> <p> <code>false</code>: The
     * environment is removed from the AWS Elastic Beanstalk but the AWS
     * resources continue to operate. </value> </enumValues> <ul> <li>
     * <code>true</code>: The specified environment as well as the associated
     * AWS resources, such as Auto Scaling group and LoadBalancer, are
     * terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     * resource management is removed from the environment, but the AWS
     * resources continue to operate. </li> </ul> <p> For more information,
     * see the <a
     * href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     * AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     * <p> Valid Values: <code>true</code> | <code>false</code>
     *
     * @param terminateResources Indicates whether the associated AWS resources should shut down when
     *         the environment is terminated: <enumValues> <value name="true"> <p>
     *         <code>true</code>: (default) The user AWS resources (for example, the
     *         Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     *         environment. </value> <value name="false"> <p> <code>false</code>: The
     *         environment is removed from the AWS Elastic Beanstalk but the AWS
     *         resources continue to operate. </value> </enumValues> <ul> <li>
     *         <code>true</code>: The specified environment as well as the associated
     *         AWS resources, such as Auto Scaling group and LoadBalancer, are
     *         terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     *         resource management is removed from the environment, but the AWS
     *         resources continue to operate. </li> </ul> <p> For more information,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     *         AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     *         <p> Valid Values: <code>true</code> | <code>false</code>
     */
    public void setTerminateResources(Boolean terminateResources) {
        this.terminateResources = terminateResources;
    }
    
    /**
     * Indicates whether the associated AWS resources should shut down when
     * the environment is terminated: <enumValues> <value name="true"> <p>
     * <code>true</code>: (default) The user AWS resources (for example, the
     * Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     * environment. </value> <value name="false"> <p> <code>false</code>: The
     * environment is removed from the AWS Elastic Beanstalk but the AWS
     * resources continue to operate. </value> </enumValues> <ul> <li>
     * <code>true</code>: The specified environment as well as the associated
     * AWS resources, such as Auto Scaling group and LoadBalancer, are
     * terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     * resource management is removed from the environment, but the AWS
     * resources continue to operate. </li> </ul> <p> For more information,
     * see the <a
     * href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     * AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     * <p> Valid Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminateResources Indicates whether the associated AWS resources should shut down when
     *         the environment is terminated: <enumValues> <value name="true"> <p>
     *         <code>true</code>: (default) The user AWS resources (for example, the
     *         Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     *         environment. </value> <value name="false"> <p> <code>false</code>: The
     *         environment is removed from the AWS Elastic Beanstalk but the AWS
     *         resources continue to operate. </value> </enumValues> <ul> <li>
     *         <code>true</code>: The specified environment as well as the associated
     *         AWS resources, such as Auto Scaling group and LoadBalancer, are
     *         terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     *         resource management is removed from the environment, but the AWS
     *         resources continue to operate. </li> </ul> <p> For more information,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     *         AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     *         <p> Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateEnvironmentRequest withTerminateResources(Boolean terminateResources) {
        this.terminateResources = terminateResources;
        return this;
    }

    /**
     * Indicates whether the associated AWS resources should shut down when
     * the environment is terminated: <enumValues> <value name="true"> <p>
     * <code>true</code>: (default) The user AWS resources (for example, the
     * Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     * environment. </value> <value name="false"> <p> <code>false</code>: The
     * environment is removed from the AWS Elastic Beanstalk but the AWS
     * resources continue to operate. </value> </enumValues> <ul> <li>
     * <code>true</code>: The specified environment as well as the associated
     * AWS resources, such as Auto Scaling group and LoadBalancer, are
     * terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     * resource management is removed from the environment, but the AWS
     * resources continue to operate. </li> </ul> <p> For more information,
     * see the <a
     * href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     * AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     * <p> Valid Values: <code>true</code> | <code>false</code>
     *
     * @return Indicates whether the associated AWS resources should shut down when
     *         the environment is terminated: <enumValues> <value name="true"> <p>
     *         <code>true</code>: (default) The user AWS resources (for example, the
     *         Auto Scaling group, LoadBalancer, etc.) are terminated along with the
     *         environment. </value> <value name="false"> <p> <code>false</code>: The
     *         environment is removed from the AWS Elastic Beanstalk but the AWS
     *         resources continue to operate. </value> </enumValues> <ul> <li>
     *         <code>true</code>: The specified environment as well as the associated
     *         AWS resources, such as Auto Scaling group and LoadBalancer, are
     *         terminated. </li> <li> <code>false</code>: AWS Elastic Beanstalk
     *         resource management is removed from the environment, but the AWS
     *         resources continue to operate. </li> </ul> <p> For more information,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/elasticbeanstalk/latest/ug/">
     *         AWS Elastic Beanstalk User Guide. </a> <p> Default: <code>true</code>
     *         <p> Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getTerminateResources() {
        return terminateResources;
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
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (isTerminateResources() != null) sb.append("TerminateResources: " + isTerminateResources() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        hashCode = prime * hashCode + ((isTerminateResources() == null) ? 0 : isTerminateResources().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateEnvironmentRequest == false) return false;
        TerminateEnvironmentRequest other = (TerminateEnvironmentRequest)obj;
        
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null) return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        if (other.isTerminateResources() == null ^ this.isTerminateResources() == null) return false;
        if (other.isTerminateResources() != null && other.isTerminateResources().equals(this.isTerminateResources()) == false) return false; 
        return true;
    }
    
}
    