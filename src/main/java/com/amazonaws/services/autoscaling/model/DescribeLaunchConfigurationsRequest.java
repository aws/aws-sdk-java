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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest) DescribeLaunchConfigurations operation}.
 * <p>
 * Returns a full description of the launch configurations, or the specified launch configurations, if they exist.
 * </p>
 * <p>
 * If no name is specified, then the full details of all launch configurations are returned.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest)
 */
public class DescribeLaunchConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of launch configuration names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> launchConfigurationNames;

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
              launchConfigurationNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              launchConfigurationNames.setAutoConstruct(true);
        }
        return launchConfigurationNames;
    }
    
    /**
     * A list of launch configuration names.
     *
     * @param launchConfigurationNames A list of launch configuration names.
     */
    public void setLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        if (launchConfigurationNames == null) {
            this.launchConfigurationNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> launchConfigurationNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(launchConfigurationNames.size());
        launchConfigurationNamesCopy.addAll(launchConfigurationNames);
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
        if (getLaunchConfigurationNames() == null) setLaunchConfigurationNames(new java.util.ArrayList<String>(launchConfigurationNames.length));
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
        if (launchConfigurationNames == null) {
            this.launchConfigurationNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> launchConfigurationNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(launchConfigurationNames.size());
            launchConfigurationNamesCopy.addAll(launchConfigurationNames);
            this.launchConfigurationNames = launchConfigurationNamesCopy;
        }

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
        if (getLaunchConfigurationNames() != null) sb.append("LaunchConfigurationNames: " + getLaunchConfigurationNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLaunchConfigurationNames() == null) ? 0 : getLaunchConfigurationNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLaunchConfigurationsRequest == false) return false;
        DescribeLaunchConfigurationsRequest other = (DescribeLaunchConfigurationsRequest)obj;
        
        if (other.getLaunchConfigurationNames() == null ^ this.getLaunchConfigurationNames() == null) return false;
        if (other.getLaunchConfigurationNames() != null && other.getLaunchConfigurationNames().equals(this.getLaunchConfigurationNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
}
    