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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLifecycleHooks(DescribeLifecycleHooksRequest) DescribeLifecycleHooks operation}.
 * <p>
 * Describes the lifecycle hooks for the specified Auto Scaling group.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeLifecycleHooks(DescribeLifecycleHooksRequest)
 */
public class DescribeLifecycleHooksRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The names of one or more lifecycle hooks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> lifecycleHookNames;

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLifecycleHooksRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The names of one or more lifecycle hooks.
     *
     * @return The names of one or more lifecycle hooks.
     */
    public java.util.List<String> getLifecycleHookNames() {
        if (lifecycleHookNames == null) {
              lifecycleHookNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              lifecycleHookNames.setAutoConstruct(true);
        }
        return lifecycleHookNames;
    }
    
    /**
     * The names of one or more lifecycle hooks.
     *
     * @param lifecycleHookNames The names of one or more lifecycle hooks.
     */
    public void setLifecycleHookNames(java.util.Collection<String> lifecycleHookNames) {
        if (lifecycleHookNames == null) {
            this.lifecycleHookNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> lifecycleHookNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(lifecycleHookNames.size());
        lifecycleHookNamesCopy.addAll(lifecycleHookNames);
        this.lifecycleHookNames = lifecycleHookNamesCopy;
    }
    
    /**
     * The names of one or more lifecycle hooks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleHookNames The names of one or more lifecycle hooks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLifecycleHooksRequest withLifecycleHookNames(String... lifecycleHookNames) {
        if (getLifecycleHookNames() == null) setLifecycleHookNames(new java.util.ArrayList<String>(lifecycleHookNames.length));
        for (String value : lifecycleHookNames) {
            getLifecycleHookNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of one or more lifecycle hooks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleHookNames The names of one or more lifecycle hooks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLifecycleHooksRequest withLifecycleHookNames(java.util.Collection<String> lifecycleHookNames) {
        if (lifecycleHookNames == null) {
            this.lifecycleHookNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> lifecycleHookNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(lifecycleHookNames.size());
            lifecycleHookNamesCopy.addAll(lifecycleHookNames);
            this.lifecycleHookNames = lifecycleHookNamesCopy;
        }

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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleHookNames() != null) sb.append("LifecycleHookNames: " + getLifecycleHookNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getLifecycleHookNames() == null) ? 0 : getLifecycleHookNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLifecycleHooksRequest == false) return false;
        DescribeLifecycleHooksRequest other = (DescribeLifecycleHooksRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLifecycleHookNames() == null ^ this.getLifecycleHookNames() == null) return false;
        if (other.getLifecycleHookNames() != null && other.getLifecycleHookNames().equals(this.getLifecycleHookNames()) == false) return false; 
        return true;
    }
    
}
    