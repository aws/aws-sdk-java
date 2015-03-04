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
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#putConfigurationRecorder(PutConfigurationRecorderRequest) PutConfigurationRecorder operation}.
 * <p>
 * Creates a new configuration recorder to record the resource
 * configurations.
 * </p>
 * <p>
 * You can use this action to change the role ( <code>roleARN</code> ) of
 * an existing recorder. To change the role, call the action on the
 * existing configuration recorder and specify a role.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, you can specify only one configuration
 * recorder per account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#putConfigurationRecorder(PutConfigurationRecorderRequest)
 */
public class PutConfigurationRecorderRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The configuration recorder object that records each configuration
     * change made to the resources.
     */
    private ConfigurationRecorder configurationRecorder;

    /**
     * The configuration recorder object that records each configuration
     * change made to the resources.
     *
     * @return The configuration recorder object that records each configuration
     *         change made to the resources.
     */
    public ConfigurationRecorder getConfigurationRecorder() {
        return configurationRecorder;
    }
    
    /**
     * The configuration recorder object that records each configuration
     * change made to the resources.
     *
     * @param configurationRecorder The configuration recorder object that records each configuration
     *         change made to the resources.
     */
    public void setConfigurationRecorder(ConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
    }
    
    /**
     * The configuration recorder object that records each configuration
     * change made to the resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationRecorder The configuration recorder object that records each configuration
     *         change made to the resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutConfigurationRecorderRequest withConfigurationRecorder(ConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
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
        if (getConfigurationRecorder() != null) sb.append("ConfigurationRecorder: " + getConfigurationRecorder() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationRecorder() == null) ? 0 : getConfigurationRecorder().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutConfigurationRecorderRequest == false) return false;
        PutConfigurationRecorderRequest other = (PutConfigurationRecorderRequest)obj;
        
        if (other.getConfigurationRecorder() == null ^ this.getConfigurationRecorder() == null) return false;
        if (other.getConfigurationRecorder() != null && other.getConfigurationRecorder().equals(this.getConfigurationRecorder()) == false) return false; 
        return true;
    }
    
    @Override
    public PutConfigurationRecorderRequest clone() {
        
            return (PutConfigurationRecorderRequest) super.clone();
    }

}
    