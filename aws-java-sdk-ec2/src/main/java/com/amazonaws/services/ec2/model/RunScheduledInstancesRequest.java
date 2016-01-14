/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunScheduledInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#runScheduledInstances(RunScheduledInstancesRequest) RunScheduledInstances operation}.
 * <p>
 * Launches the specified Scheduled Instances.
 * </p>
 * <p>
 * Before you can launch a Scheduled Instance, you must purchase it and
 * obtain an identifier using PurchaseScheduledInstances.
 * </p>
 * <p>
 * You must launch a Scheduled Instance during its scheduled time period.
 * You can't stop or reboot a Scheduled Instance, but you can terminate
 * it as needed. If you terminate a Scheduled Instance before the current
 * scheduled time period ends, you can launch it again after a few
 * minutes.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#runScheduledInstances(RunScheduledInstancesRequest)
 */
public class RunScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RunScheduledInstancesRequest> {

    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     */
    private String clientToken;

    /**
     * The number of instances. <p>Default: 1
     */
    private Integer instanceCount;

    /**
     * The Scheduled Instance ID.
     */
    private String scheduledInstanceId;

    /**
     * The launch specification.
     */
    private ScheduledInstancesLaunchSpecification launchSpecification;

    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @return Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     *
     * @param clientToken Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier that ensures the idempotency of the
     *         request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunScheduledInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The number of instances. <p>Default: 1
     *
     * @return The number of instances. <p>Default: 1
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of instances. <p>Default: 1
     *
     * @param instanceCount The number of instances. <p>Default: 1
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of instances. <p>Default: 1
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of instances. <p>Default: 1
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunScheduledInstancesRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * The Scheduled Instance ID.
     *
     * @return The Scheduled Instance ID.
     */
    public String getScheduledInstanceId() {
        return scheduledInstanceId;
    }
    
    /**
     * The Scheduled Instance ID.
     *
     * @param scheduledInstanceId The Scheduled Instance ID.
     */
    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }
    
    /**
     * The Scheduled Instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceId The Scheduled Instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunScheduledInstancesRequest withScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
        return this;
    }

    /**
     * The launch specification.
     *
     * @return The launch specification.
     */
    public ScheduledInstancesLaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * The launch specification.
     *
     * @param launchSpecification The launch specification.
     */
    public void setLaunchSpecification(ScheduledInstancesLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * The launch specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification The launch specification.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunScheduledInstancesRequest withLaunchSpecification(ScheduledInstancesLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RunScheduledInstancesRequest> getDryRunRequest() {
        Request<RunScheduledInstancesRequest> request = new RunScheduledInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getScheduledInstanceId() != null) sb.append("ScheduledInstanceId: " + getScheduledInstanceId() + ",");
        if (getLaunchSpecification() != null) sb.append("LaunchSpecification: " + getLaunchSpecification() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunScheduledInstancesRequest == false) return false;
        RunScheduledInstancesRequest other = (RunScheduledInstancesRequest)obj;
        
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null) return false;
        if (other.getScheduledInstanceId() != null && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false) return false; 
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null) return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false) return false; 
        return true;
    }
    
    @Override
    public RunScheduledInstancesRequest clone() {
        
            return (RunScheduledInstancesRequest) super.clone();
    }

}
    