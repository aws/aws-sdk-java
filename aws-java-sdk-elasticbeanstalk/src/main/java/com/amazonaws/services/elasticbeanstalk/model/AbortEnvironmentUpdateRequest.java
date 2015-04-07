/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#abortEnvironmentUpdate(AbortEnvironmentUpdateRequest) AbortEnvironmentUpdate operation}.
 * <p>
 * Cancels in-progress environment configuration update or application
 * version deployment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#abortEnvironmentUpdate(AbortEnvironmentUpdateRequest)
 */
public class AbortEnvironmentUpdateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * This specifies the ID of the environment with the in-progress update
     * that you want to cancel.
     */
    private String environmentId;

    /**
     * This specifies the name of the environment with the in-progress update
     * that you want to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * This specifies the ID of the environment with the in-progress update
     * that you want to cancel.
     *
     * @return This specifies the ID of the environment with the in-progress update
     *         that you want to cancel.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * This specifies the ID of the environment with the in-progress update
     * that you want to cancel.
     *
     * @param environmentId This specifies the ID of the environment with the in-progress update
     *         that you want to cancel.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * This specifies the ID of the environment with the in-progress update
     * that you want to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId This specifies the ID of the environment with the in-progress update
     *         that you want to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AbortEnvironmentUpdateRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * This specifies the name of the environment with the in-progress update
     * that you want to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return This specifies the name of the environment with the in-progress update
     *         that you want to cancel.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * This specifies the name of the environment with the in-progress update
     * that you want to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName This specifies the name of the environment with the in-progress update
     *         that you want to cancel.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * This specifies the name of the environment with the in-progress update
     * that you want to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName This specifies the name of the environment with the in-progress update
     *         that you want to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AbortEnvironmentUpdateRequest withEnvironmentName(String environmentName) {
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

        if (obj instanceof AbortEnvironmentUpdateRequest == false) return false;
        AbortEnvironmentUpdateRequest other = (AbortEnvironmentUpdateRequest)obj;
        
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null) return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        return true;
    }
    
    @Override
    public AbortEnvironmentUpdateRequest clone() {
        
            return (AbortEnvironmentUpdateRequest) super.clone();
    }

}
    