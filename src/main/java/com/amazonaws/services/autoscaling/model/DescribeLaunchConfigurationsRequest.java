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
     * A list of launch configuration names.
     */
    private java.util.List<String> launchConfigurationNames;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of launch configurations. The default is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxRecords;

    /**
     * A list of launch configuration names.
     *
     * @return A list of launch configuration names.
     */
    public java.util.List<String> getLaunchConfigurationNames() {
        
        if (launchConfigurationNames == null) {
            launchConfigurationNames = new java.util.ArrayList<String>();
        }
        return launchConfigurationNames;
    }
    
    /**
     * A list of launch configuration names.
     *
     * @param launchConfigurationNames A list of launch configuration names.
     */
    public void setLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        java.util.List<String> launchConfigurationNamesCopy = new java.util.ArrayList<String>();
        if (launchConfigurationNames != null) {
            launchConfigurationNamesCopy.addAll(launchConfigurationNames);
        }
        this.launchConfigurationNames = launchConfigurationNamesCopy;
    }
    
    /**
     * A list of launch configuration names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames A list of launch configuration names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(String... launchConfigurationNames) {
        if (getLaunchConfigurationNames() == null) setLaunchConfigurationNames(new java.util.ArrayList<String>());
        for (String value : launchConfigurationNames) {
            getLaunchConfigurationNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of launch configuration names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames A list of launch configuration names.
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
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLaunchConfigurationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * The maximum number of launch configurations. The default is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The maximum number of launch configurations. The default is 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of launch configurations. The default is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of launch configurations. The default is 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of launch configurations. The default is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of launch configurations. The default is 100.
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
    