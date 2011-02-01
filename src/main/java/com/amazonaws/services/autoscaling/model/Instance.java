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
 * The Instance data type.
 * </p>
 */
public class Instance {

    /**
     * Specifies the EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * Availability zones associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String availabilityZone;

    /**
     * Contains a description of the current <i>lifecycle</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lifecycleState;

    /**
     * The instance's health status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String healthStatus;

    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * Specifies the EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the EC2 instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Specifies the EC2 instance ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId Specifies the EC2 instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Specifies the EC2 instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceId Specifies the EC2 instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Availability zones associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Availability zones associated with this instance.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Availability zones associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone Availability zones associated with this instance.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Availability zones associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone Availability zones associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Contains a description of the current <i>lifecycle</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains a description of the current <i>lifecycle</i> state.
     */
    public String getLifecycleState() {
        return lifecycleState;
    }
    
    /**
     * Contains a description of the current <i>lifecycle</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lifecycleState Contains a description of the current <i>lifecycle</i> state.
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }
    
    /**
     * Contains a description of the current <i>lifecycle</i> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lifecycleState Contains a description of the current <i>lifecycle</i> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }
    
    
    /**
     * The instance's health status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The instance's health status.
     */
    public String getHealthStatus() {
        return healthStatus;
    }
    
    /**
     * The instance's health status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The instance's health status.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    /**
     * The instance's health status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The instance's health status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The launch configuration associated with this instance.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with this instance.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("LifecycleState: " + lifecycleState + ", ");
        sb.append("HealthStatus: " + healthStatus + ", ");
        sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    