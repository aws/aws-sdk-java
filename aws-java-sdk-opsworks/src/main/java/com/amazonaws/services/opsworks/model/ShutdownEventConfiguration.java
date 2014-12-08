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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * The Shutdown event configuration.
 * </p>
 */
public class ShutdownEventConfiguration implements Serializable {

    /**
     * The time, in seconds, that AWS OpsWorks will wait after triggering a
     * Shutdown event before shutting down an instance.
     */
    private Integer executionTimeout;

    /**
     * Whether to enable Elastic Load Balancing connection draining. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     * Draining</a>
     */
    private Boolean delayUntilElbConnectionsDrained;

    /**
     * The time, in seconds, that AWS OpsWorks will wait after triggering a
     * Shutdown event before shutting down an instance.
     *
     * @return The time, in seconds, that AWS OpsWorks will wait after triggering a
     *         Shutdown event before shutting down an instance.
     */
    public Integer getExecutionTimeout() {
        return executionTimeout;
    }
    
    /**
     * The time, in seconds, that AWS OpsWorks will wait after triggering a
     * Shutdown event before shutting down an instance.
     *
     * @param executionTimeout The time, in seconds, that AWS OpsWorks will wait after triggering a
     *         Shutdown event before shutting down an instance.
     */
    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }
    
    /**
     * The time, in seconds, that AWS OpsWorks will wait after triggering a
     * Shutdown event before shutting down an instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionTimeout The time, in seconds, that AWS OpsWorks will wait after triggering a
     *         Shutdown event before shutting down an instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ShutdownEventConfiguration withExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
        return this;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     * Draining</a>
     *
     * @return Whether to enable Elastic Load Balancing connection draining. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     *         Draining</a>
     */
    public Boolean isDelayUntilElbConnectionsDrained() {
        return delayUntilElbConnectionsDrained;
    }
    
    /**
     * Whether to enable Elastic Load Balancing connection draining. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     * Draining</a>
     *
     * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection draining. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     *         Draining</a>
     */
    public void setDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
    }
    
    /**
     * Whether to enable Elastic Load Balancing connection draining. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     * Draining</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delayUntilElbConnectionsDrained Whether to enable Elastic Load Balancing connection draining. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     *         Draining</a>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ShutdownEventConfiguration withDelayUntilElbConnectionsDrained(Boolean delayUntilElbConnectionsDrained) {
        this.delayUntilElbConnectionsDrained = delayUntilElbConnectionsDrained;
        return this;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     * Draining</a>
     *
     * @return Whether to enable Elastic Load Balancing connection draining. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#conn-drain">Connection
     *         Draining</a>
     */
    public Boolean getDelayUntilElbConnectionsDrained() {
        return delayUntilElbConnectionsDrained;
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
        if (getExecutionTimeout() != null) sb.append("ExecutionTimeout: " + getExecutionTimeout() + ",");
        if (isDelayUntilElbConnectionsDrained() != null) sb.append("DelayUntilElbConnectionsDrained: " + isDelayUntilElbConnectionsDrained() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExecutionTimeout() == null) ? 0 : getExecutionTimeout().hashCode()); 
        hashCode = prime * hashCode + ((isDelayUntilElbConnectionsDrained() == null) ? 0 : isDelayUntilElbConnectionsDrained().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ShutdownEventConfiguration == false) return false;
        ShutdownEventConfiguration other = (ShutdownEventConfiguration)obj;
        
        if (other.getExecutionTimeout() == null ^ this.getExecutionTimeout() == null) return false;
        if (other.getExecutionTimeout() != null && other.getExecutionTimeout().equals(this.getExecutionTimeout()) == false) return false; 
        if (other.isDelayUntilElbConnectionsDrained() == null ^ this.isDelayUntilElbConnectionsDrained() == null) return false;
        if (other.isDelayUntilElbConnectionsDrained() != null && other.isDelayUntilElbConnectionsDrained().equals(this.isDelayUntilElbConnectionsDrained()) == false) return false; 
        return true;
    }
    
}
    