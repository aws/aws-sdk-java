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


/**
 * <p>
 * Result message containing a single description of an application.
 * </p>
 */
public class UpdateApplicationResult implements Serializable {

    /**
     * The <a>ApplicationDescription</a> of the application.
     */
    private ApplicationDescription application;

    /**
     * The <a>ApplicationDescription</a> of the application.
     *
     * @return The <a>ApplicationDescription</a> of the application.
     */
    public ApplicationDescription getApplication() {
        return application;
    }
    
    /**
     * The <a>ApplicationDescription</a> of the application.
     *
     * @param application The <a>ApplicationDescription</a> of the application.
     */
    public void setApplication(ApplicationDescription application) {
        this.application = application;
    }
    
    /**
     * The <a>ApplicationDescription</a> of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param application The <a>ApplicationDescription</a> of the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateApplicationResult withApplication(ApplicationDescription application) {
        this.application = application;
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
        if (getApplication() != null) sb.append("Application: " + getApplication() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateApplicationResult == false) return false;
        UpdateApplicationResult other = (UpdateApplicationResult)obj;
        
        if (other.getApplication() == null ^ this.getApplication() == null) return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false) return false; 
        return true;
    }
    
}
    