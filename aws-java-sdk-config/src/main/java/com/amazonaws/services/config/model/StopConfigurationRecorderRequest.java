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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#stopConfigurationRecorder(StopConfigurationRecorderRequest) StopConfigurationRecorder operation}.
 * <p>
 * Stops recording configurations of all the resources associated with
 * the account.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#stopConfigurationRecorder(StopConfigurationRecorderRequest)
 */
public class StopConfigurationRecorderRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String configurationRecorderName;

    /**
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the recorder object that records each configuration change
     *         made to the resources.
     */
    public String getConfigurationRecorderName() {
        return configurationRecorderName;
    }
    
    /**
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param configurationRecorderName The name of the recorder object that records each configuration change
     *         made to the resources.
     */
    public void setConfigurationRecorderName(String configurationRecorderName) {
        this.configurationRecorderName = configurationRecorderName;
    }
    
    /**
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param configurationRecorderName The name of the recorder object that records each configuration change
     *         made to the resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StopConfigurationRecorderRequest withConfigurationRecorderName(String configurationRecorderName) {
        this.configurationRecorderName = configurationRecorderName;
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
        if (getConfigurationRecorderName() != null) sb.append("ConfigurationRecorderName: " + getConfigurationRecorderName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigurationRecorderName() == null) ? 0 : getConfigurationRecorderName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StopConfigurationRecorderRequest == false) return false;
        StopConfigurationRecorderRequest other = (StopConfigurationRecorderRequest)obj;
        
        if (other.getConfigurationRecorderName() == null ^ this.getConfigurationRecorderName() == null) return false;
        if (other.getConfigurationRecorderName() != null && other.getConfigurationRecorderName().equals(this.getConfigurationRecorderName()) == false) return false; 
        return true;
    }
    
    @Override
    public StopConfigurationRecorderRequest clone() {
        
            return (StopConfigurationRecorderRequest) super.clone();
    }

}
    