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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest) DescribeLaunchConfigurations operation}.
 * <p>
 * Returns a full description of the launch configurations given the
 * specified names.
 * </p>
 * <p>
 * If no names are specified, then the full details of all launch
 * configurations are returned.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest)
 */
public class DescribeLaunchConfigurationsRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private java.util.List<String> launchConfigurationNames;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     */
    private Integer maxRecords;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<String> getLaunchConfigurationNames() {
        if (launchConfigurationNames == null) {
            launchConfigurationNames = new java.util.ArrayList<String>();
        }
        return launchConfigurationNames;
    }
    
    /**
     * 
     *
     * @param launchConfigurationNames 
     */
    public void setLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        java.util.List<String> launchConfigurationNamesCopy = new java.util.ArrayList<String>();
        if (launchConfigurationNames != null) {
            launchConfigurationNamesCopy.addAll(launchConfigurationNames);
        }
        this.launchConfigurationNames = launchConfigurationNamesCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(String... launchConfigurationNames) {
        for (String value : launchConfigurationNames) {
            getLaunchConfigurationNames().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        java.util.List<String> launchConfigurationNamesCopy = new java.util.ArrayList<String>();
        if (launchConfigurationNames != null) {
            launchConfigurationNamesCopy.addAll(launchConfigurationNames);
        }
        this.launchConfigurationNames = launchConfigurationNamesCopy;

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
    public DescribeLaunchConfigurationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @return 
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @param maxRecords 
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @param maxRecords 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        
        sb.append("LaunchConfigurationNames: " + launchConfigurationNames + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    