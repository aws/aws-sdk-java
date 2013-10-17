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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest) DeleteEnvironmentConfiguration operation}.
 * <p>
 * Deletes the draft configuration associated with the running environment.
 * </p>
 * <p>
 * Updating a running environment with any configuration changes creates a draft configuration set. You can get the draft configuration using
 * DescribeConfigurationSettings while the update is in progress or if the update fails. The <code>DeploymentStatus</code> for the draft configuration
 * indicates whether the deployment is in process or has failed. The draft configuration remains in existence until it is deleted with this action.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest)
 */
public class DeleteEnvironmentConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application the environment is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the environment to delete the draft configuration from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * Default constructor for a new DeleteEnvironmentConfigurationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteEnvironmentConfigurationRequest() {}
    
    /**
     * Constructs a new DeleteEnvironmentConfigurationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application the environment is
     * associated with.
     * @param environmentName The name of the environment to delete the draft
     * configuration from.
     */
    public DeleteEnvironmentConfigurationRequest(String applicationName, String environmentName) {
        setApplicationName(applicationName);
        setEnvironmentName(environmentName);
    }

    /**
     * The name of the application the environment is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application the environment is associated with.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application the environment is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application the environment is associated with.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application the environment is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application the environment is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteEnvironmentConfigurationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of the environment to delete the draft configuration from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to delete the draft configuration from.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to delete the draft configuration from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to delete the draft configuration from.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to delete the draft configuration from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to delete the draft configuration from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteEnvironmentConfigurationRequest withEnvironmentName(String environmentName) {
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteEnvironmentConfigurationRequest == false) return false;
        DeleteEnvironmentConfigurationRequest other = (DeleteEnvironmentConfigurationRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        return true;
    }
    
}
    