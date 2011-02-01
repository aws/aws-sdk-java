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

/**
 * <p>
 * The PoliciesType data type.
 * </p>
 */
public class DescribePoliciesResult {

    /**
     * A list of scaling policies.
     */
    private java.util.List<ScalingPolicy> scalingPolicies;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list of scaling policies.
     *
     * @return A list of scaling policies.
     */
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        if (scalingPolicies == null) {
            scalingPolicies = new java.util.ArrayList<ScalingPolicy>();
        }
        return scalingPolicies;
    }
    
    /**
     * A list of scaling policies.
     *
     * @param scalingPolicies A list of scaling policies.
     */
    public void setScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        java.util.List<ScalingPolicy> scalingPoliciesCopy = new java.util.ArrayList<ScalingPolicy>();
        if (scalingPolicies != null) {
            scalingPoliciesCopy.addAll(scalingPolicies);
        }
        this.scalingPolicies = scalingPoliciesCopy;
    }
    
    /**
     * A list of scaling policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingPolicies A list of scaling policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePoliciesResult withScalingPolicies(ScalingPolicy... scalingPolicies) {
        for (ScalingPolicy value : scalingPolicies) {
            getScalingPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of scaling policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingPolicies A list of scaling policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePoliciesResult withScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        java.util.List<ScalingPolicy> scalingPoliciesCopy = new java.util.ArrayList<ScalingPolicy>();
        if (scalingPolicies != null) {
            scalingPoliciesCopy.addAll(scalingPolicies);
        }
        this.scalingPolicies = scalingPoliciesCopy;

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
    public DescribePoliciesResult withNextToken(String nextToken) {
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
        sb.append("ScalingPolicies: " + scalingPolicies + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    