/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#updateApplication(UpdateApplicationRequest) UpdateApplication operation}.
 * <p>
 * Changes an existing application's name.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#updateApplication(UpdateApplicationRequest)
 */
public class UpdateApplicationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The current name of the application that you want to change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The new name that you want to change the application to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String newApplicationName;

    /**
     * The current name of the application that you want to change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The current name of the application that you want to change.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The current name of the application that you want to change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The current name of the application that you want to change.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The current name of the application that you want to change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The current name of the application that you want to change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The new name that you want to change the application to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The new name that you want to change the application to.
     */
    public String getNewApplicationName() {
        return newApplicationName;
    }
    
    /**
     * The new name that you want to change the application to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newApplicationName The new name that you want to change the application to.
     */
    public void setNewApplicationName(String newApplicationName) {
        this.newApplicationName = newApplicationName;
    }
    
    /**
     * The new name that you want to change the application to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newApplicationName The new name that you want to change the application to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateApplicationRequest withNewApplicationName(String newApplicationName) {
        this.newApplicationName = newApplicationName;
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
        if (getNewApplicationName() != null) sb.append("NewApplicationName: " + getNewApplicationName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getNewApplicationName() == null) ? 0 : getNewApplicationName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateApplicationRequest == false) return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getNewApplicationName() == null ^ this.getNewApplicationName() == null) return false;
        if (other.getNewApplicationName() != null && other.getNewApplicationName().equals(this.getNewApplicationName()) == false) return false; 
        return true;
    }
    
}
    