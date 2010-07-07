/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeLaunchConfigurationsResult {

    /**
     * 
     */
    private java.util.List<LaunchConfiguration> launchConfigurations;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        if (launchConfigurations == null) {
            launchConfigurations = new java.util.ArrayList<LaunchConfiguration>();
        }
        return launchConfigurations;
    }
    
    /**
     * 
     *
     * @param launchConfigurations 
     */
    public void setLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        java.util.List<LaunchConfiguration> launchConfigurationsCopy = new java.util.ArrayList<LaunchConfiguration>();
        if (launchConfigurations != null) {
            launchConfigurationsCopy.addAll(launchConfigurations);
        }
        this.launchConfigurations = launchConfigurationsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurations 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsResult withLaunchConfigurations(LaunchConfiguration... launchConfigurations) {
        for (LaunchConfiguration value : launchConfigurations) {
            getLaunchConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurations 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsResult withLaunchConfigurations(java.util.Collection<LaunchConfiguration> launchConfigurations) {
        java.util.List<LaunchConfiguration> launchConfigurationsCopy = new java.util.ArrayList<LaunchConfiguration>();
        if (launchConfigurations != null) {
            launchConfigurationsCopy.addAll(launchConfigurations);
        }
        this.launchConfigurations = launchConfigurationsCopy;

        return this;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return 
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken 
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("LaunchConfigurations: " + launchConfigurations + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    