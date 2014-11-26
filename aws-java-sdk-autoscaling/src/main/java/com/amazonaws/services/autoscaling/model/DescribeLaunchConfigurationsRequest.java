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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest) DescribeLaunchConfigurations operation}.
 * <p>
 * Describes one or more launch configurations. If you omit the list of
 * names, then the call describes all launch configurations.
 * </p>
 * <p>
 * You can specify a maximum number of items to be returned with a single
 * call. If there are more items to return, the call returns a token. To
 * get the next set of items, repeat the call with the returned token in
 * the <code>NextToken</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLaunchConfigurations(DescribeLaunchConfigurationsRequest)
 */
public class DescribeLaunchConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The launch configuration names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> launchConfigurationNames;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of items to return with this call. The default is
     * 100.
     */
    private Integer maxRecords;

    /**
     * The launch configuration names.
     *
     * @return The launch configuration names.
     */
    public java.util.List<String> getLaunchConfigurationNames() {
        if (launchConfigurationNames == null) {
              launchConfigurationNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              launchConfigurationNames.setAutoConstruct(true);
        }
        return launchConfigurationNames;
    }
    
    /**
     * The launch configuration names.
     *
     * @param launchConfigurationNames The launch configuration names.
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
     * The launch configuration names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames The launch configuration names.
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
     * The launch configuration names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchConfigurationNames The launch configuration names.
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
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLaunchConfigurationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of items to return with this call. The default is
     * 100.
     *
     * @return The maximum number of items to return with this call. The default is
     *         100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call. The default is
     * 100.
     *
     * @param maxRecords The maximum number of items to return with this call. The default is
     *         100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call. The default is
     * 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of items to return with this call. The default is
     *         100.
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
    