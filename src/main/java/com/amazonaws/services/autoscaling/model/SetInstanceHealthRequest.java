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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#setInstanceHealth(SetInstanceHealthRequest) SetInstanceHealth operation}.
 * <p>
 * Sets the health status of an instance.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#setInstanceHealth(SetInstanceHealthRequest)
 */
public class SetInstanceHealthRequest extends AmazonWebServiceRequest {

    /**
     * The identifier of the EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The health status of the instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthStatus;

    /**
     * If True, this call should respect the grace period associated with the
     * group.
     */
    private Boolean shouldRespectGracePeriod;

    /**
     * The identifier of the EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the EC2 instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The identifier of the EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The identifier of the EC2 instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The identifier of the EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The identifier of the EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetInstanceHealthRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The health status of the instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The health status of the instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     */
    public String getHealthStatus() {
        return healthStatus;
    }
    
    /**
     * The health status of the instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    /**
     * The health status of the instance. "Healthy" means that the instance
     * is healthy and should remain in service. "Unhealthy" means that the
     * instance is unhealthy. Auto Scaling should terminate and replace it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance. "Healthy" means that the instance
     *         is healthy and should remain in service. "Unhealthy" means that the
     *         instance is unhealthy. Auto Scaling should terminate and replace it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetInstanceHealthRequest withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    
    
    /**
     * If True, this call should respect the grace period associated with the
     * group.
     *
     * @return If True, this call should respect the grace period associated with the
     *         group.
     */
    public Boolean isShouldRespectGracePeriod() {
        return shouldRespectGracePeriod;
    }
    
    /**
     * If True, this call should respect the grace period associated with the
     * group.
     *
     * @param shouldRespectGracePeriod If True, this call should respect the grace period associated with the
     *         group.
     */
    public void setShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
    }
    
    /**
     * If True, this call should respect the grace period associated with the
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shouldRespectGracePeriod If True, this call should respect the grace period associated with the
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetInstanceHealthRequest withShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
        return this;
    }
    
    
    /**
     * If True, this call should respect the grace period associated with the
     * group.
     *
     * @return If True, this call should respect the grace period associated with the
     *         group.
     */
    public Boolean getShouldRespectGracePeriod() {
        return shouldRespectGracePeriod;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("HealthStatus: " + healthStatus + ", ");
        sb.append("ShouldRespectGracePeriod: " + shouldRespectGracePeriod + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    