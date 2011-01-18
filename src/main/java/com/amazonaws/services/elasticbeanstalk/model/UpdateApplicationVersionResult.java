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

/**
 * <p>
 * Result message wrapping a single description of an application
 * version.
 * </p>
 */
public class UpdateApplicationVersionResult {

    /**
     * The <a>ApplicationVersionDescription</a> of the application version.
     */
    private ApplicationVersionDescription applicationVersion;

    /**
     * The <a>ApplicationVersionDescription</a> of the application version.
     *
     * @return The <a>ApplicationVersionDescription</a> of the application version.
     */
    public ApplicationVersionDescription getApplicationVersion() {
        return applicationVersion;
    }
    
    /**
     * The <a>ApplicationVersionDescription</a> of the application version.
     *
     * @param applicationVersion The <a>ApplicationVersionDescription</a> of the application version.
     */
    public void setApplicationVersion(ApplicationVersionDescription applicationVersion) {
        this.applicationVersion = applicationVersion;
    }
    
    /**
     * The <a>ApplicationVersionDescription</a> of the application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationVersion The <a>ApplicationVersionDescription</a> of the application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationVersionResult withApplicationVersion(ApplicationVersionDescription applicationVersion) {
        this.applicationVersion = applicationVersion;
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
        sb.append("ApplicationVersion: " + applicationVersion + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    