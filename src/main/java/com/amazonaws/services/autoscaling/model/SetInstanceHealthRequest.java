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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#setInstanceHealth(SetInstanceHealthRequest) SetInstanceHealth operation}.
 * <p>
 * Sets the health status of a specified instance that belongs to any of your Auto Scaling groups.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-configure-healthcheck.html"> Configure Health
 * Checks for Your Auto Scaling group </a> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#setInstanceHealth(SetInstanceHealthRequest)
 */
public class SetInstanceHealthRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The health status of the instance. Set to <code>Healthy</code> if you
     * want the instance to remain in service. Set to <code>Unhealthy</code>
     * if you want the instance to be out of service. Auto Scaling will
     * terminate and replace the unhealthy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthStatus;

    /**
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by
     * default, this call will respect the grace period. Set this to
     * <code>False</code>, if you do not want the call to respect the grace
     * period associated with the group. <p>For more information, see the
     * <code>HealthCheckGracePeriod</code> parameter description in the
     * <a>CreateAutoScalingGroup</a> action.
     */
    private Boolean shouldRespectGracePeriod;

    /**
     * The identifier of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the Amazon EC2 instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The identifier of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The identifier of the Amazon EC2 instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The identifier of the Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The identifier of the Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetInstanceHealthRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The health status of the instance. Set to <code>Healthy</code> if you
     * want the instance to remain in service. Set to <code>Unhealthy</code>
     * if you want the instance to be out of service. Auto Scaling will
     * terminate and replace the unhealthy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The health status of the instance. Set to <code>Healthy</code> if you
     *         want the instance to remain in service. Set to <code>Unhealthy</code>
     *         if you want the instance to be out of service. Auto Scaling will
     *         terminate and replace the unhealthy instance.
     */
    public String getHealthStatus() {
        return healthStatus;
    }
    
    /**
     * The health status of the instance. Set to <code>Healthy</code> if you
     * want the instance to remain in service. Set to <code>Unhealthy</code>
     * if you want the instance to be out of service. Auto Scaling will
     * terminate and replace the unhealthy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance. Set to <code>Healthy</code> if you
     *         want the instance to remain in service. Set to <code>Unhealthy</code>
     *         if you want the instance to be out of service. Auto Scaling will
     *         terminate and replace the unhealthy instance.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    /**
     * The health status of the instance. Set to <code>Healthy</code> if you
     * want the instance to remain in service. Set to <code>Unhealthy</code>
     * if you want the instance to be out of service. Auto Scaling will
     * terminate and replace the unhealthy instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance. Set to <code>Healthy</code> if you
     *         want the instance to remain in service. Set to <code>Unhealthy</code>
     *         if you want the instance to be out of service. Auto Scaling will
     *         terminate and replace the unhealthy instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetInstanceHealthRequest withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by
     * default, this call will respect the grace period. Set this to
     * <code>False</code>, if you do not want the call to respect the grace
     * period associated with the group. <p>For more information, see the
     * <code>HealthCheckGracePeriod</code> parameter description in the
     * <a>CreateAutoScalingGroup</a> action.
     *
     * @return If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call will respect the grace period. Set this to
     *         <code>False</code>, if you do not want the call to respect the grace
     *         period associated with the group. <p>For more information, see the
     *         <code>HealthCheckGracePeriod</code> parameter description in the
     *         <a>CreateAutoScalingGroup</a> action.
     */
    public Boolean isShouldRespectGracePeriod() {
        return shouldRespectGracePeriod;
    }
    
    /**
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by
     * default, this call will respect the grace period. Set this to
     * <code>False</code>, if you do not want the call to respect the grace
     * period associated with the group. <p>For more information, see the
     * <code>HealthCheckGracePeriod</code> parameter description in the
     * <a>CreateAutoScalingGroup</a> action.
     *
     * @param shouldRespectGracePeriod If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call will respect the grace period. Set this to
     *         <code>False</code>, if you do not want the call to respect the grace
     *         period associated with the group. <p>For more information, see the
     *         <code>HealthCheckGracePeriod</code> parameter description in the
     *         <a>CreateAutoScalingGroup</a> action.
     */
    public void setShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
    }
    
    /**
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by
     * default, this call will respect the grace period. Set this to
     * <code>False</code>, if you do not want the call to respect the grace
     * period associated with the group. <p>For more information, see the
     * <code>HealthCheckGracePeriod</code> parameter description in the
     * <a>CreateAutoScalingGroup</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shouldRespectGracePeriod If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call will respect the grace period. Set this to
     *         <code>False</code>, if you do not want the call to respect the grace
     *         period associated with the group. <p>For more information, see the
     *         <code>HealthCheckGracePeriod</code> parameter description in the
     *         <a>CreateAutoScalingGroup</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetInstanceHealthRequest withShouldRespectGracePeriod(Boolean shouldRespectGracePeriod) {
        this.shouldRespectGracePeriod = shouldRespectGracePeriod;
        return this;
    }

    /**
     * If the Auto Scaling group of the specified instance has a
     * <code>HealthCheckGracePeriod</code> specified for the group, by
     * default, this call will respect the grace period. Set this to
     * <code>False</code>, if you do not want the call to respect the grace
     * period associated with the group. <p>For more information, see the
     * <code>HealthCheckGracePeriod</code> parameter description in the
     * <a>CreateAutoScalingGroup</a> action.
     *
     * @return If the Auto Scaling group of the specified instance has a
     *         <code>HealthCheckGracePeriod</code> specified for the group, by
     *         default, this call will respect the grace period. Set this to
     *         <code>False</code>, if you do not want the call to respect the grace
     *         period associated with the group. <p>For more information, see the
     *         <code>HealthCheckGracePeriod</code> parameter description in the
     *         <a>CreateAutoScalingGroup</a> action.
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getHealthStatus() != null) sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (isShouldRespectGracePeriod() != null) sb.append("ShouldRespectGracePeriod: " + isShouldRespectGracePeriod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode()); 
        hashCode = prime * hashCode + ((isShouldRespectGracePeriod() == null) ? 0 : isShouldRespectGracePeriod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetInstanceHealthRequest == false) return false;
        SetInstanceHealthRequest other = (SetInstanceHealthRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null) return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false) return false; 
        if (other.isShouldRespectGracePeriod() == null ^ this.isShouldRespectGracePeriod() == null) return false;
        if (other.isShouldRespectGracePeriod() != null && other.isShouldRespectGracePeriod().equals(this.isShouldRespectGracePeriod()) == false) return false; 
        return true;
    }
    
}
    