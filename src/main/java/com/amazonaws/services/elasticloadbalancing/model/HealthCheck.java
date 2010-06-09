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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Health Check
 */
public class HealthCheck {

    private String target;

    private Integer interval;

    private Integer timeout;

    private Integer unhealthyThreshold;

    private Integer healthyThreshold;

    /**
     * Returns the value of the Target property for this object.
     *
     * @return The value of the Target property for this object.
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * Sets the value of the Target property for this object.
     *
     * @param target The new value for the Target property for this object.
     */
    public void setTarget(String target) {
        this.target = target;
    }
    
    /**
     * Sets the value of the Target property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param target The new value for the Target property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HealthCheck withTarget(String target) {
        this.target = target;
        return this;
    }
    
    
    /**
     * Returns the value of the Interval property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return The value of the Interval property for this object.
     */
    public Integer getInterval() {
        return interval;
    }
    
    /**
     * Sets the value of the Interval property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval The new value for the Interval property for this object.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }
    
    /**
     * Sets the value of the Interval property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval The new value for the Interval property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    
    
    /**
     * Returns the value of the Timeout property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return The value of the Timeout property for this object.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * Sets the value of the Timeout property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout The new value for the Timeout property for this object.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * Sets the value of the Timeout property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout The new value for the Timeout property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    
    
    /**
     * Returns the value of the UnhealthyThreshold property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return The value of the UnhealthyThreshold property for this object.
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }
    
    /**
     * Sets the value of the UnhealthyThreshold property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold The new value for the UnhealthyThreshold property for this object.
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }
    
    /**
     * Sets the value of the UnhealthyThreshold property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold The new value for the UnhealthyThreshold property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    
    
    /**
     * Returns the value of the HealthyThreshold property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return The value of the HealthyThreshold property for this object.
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }
    
    /**
     * Sets the value of the HealthyThreshold property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold The new value for the HealthyThreshold property for this object.
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }
    
    /**
     * Sets the value of the HealthyThreshold property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold The new value for the HealthyThreshold property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HealthCheck withHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
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
        
        sb.append("Target: " + target + ", ");
        sb.append("Interval: " + interval + ", ");
        sb.append("Timeout: " + timeout + ", ");
        sb.append("UnhealthyThreshold: " + unhealthyThreshold + ", ");
        sb.append("HealthyThreshold: " + healthyThreshold + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    