/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunScheduledInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RunScheduledInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunScheduledInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RunScheduledInstancesRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The launch specification. You must match the instance type, Availability Zone, network, and platform of the
     * schedule that you purchased.
     * </p>
     */
    private ScheduledInstancesLaunchSpecification launchSpecification;
    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     */
    private String scheduledInstanceId;

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The number of instances.</p>
     *        <p>
     *        Default: 1
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The number of instances.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param instanceCount
     *        The number of instances.</p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability Zone, network, and platform of the
     * schedule that you purchased.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification. You must match the instance type, Availability Zone, network, and platform of
     *        the schedule that you purchased.
     */

    public void setLaunchSpecification(ScheduledInstancesLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability Zone, network, and platform of the
     * schedule that you purchased.
     * </p>
     * 
     * @return The launch specification. You must match the instance type, Availability Zone, network, and platform of
     *         the schedule that you purchased.
     */

    public ScheduledInstancesLaunchSpecification getLaunchSpecification() {
        return this.launchSpecification;
    }

    /**
     * <p>
     * The launch specification. You must match the instance type, Availability Zone, network, and platform of the
     * schedule that you purchased.
     * </p>
     * 
     * @param launchSpecification
     *        The launch specification. You must match the instance type, Availability Zone, network, and platform of
     *        the schedule that you purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesRequest withLaunchSpecification(ScheduledInstancesLaunchSpecification launchSpecification) {
        setLaunchSpecification(launchSpecification);
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @param scheduledInstanceId
     *        The Scheduled Instance ID.
     */

    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @return The Scheduled Instance ID.
     */

    public String getScheduledInstanceId() {
        return this.scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * 
     * @param scheduledInstanceId
     *        The Scheduled Instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunScheduledInstancesRequest withScheduledInstanceId(String scheduledInstanceId) {
        setScheduledInstanceId(scheduledInstanceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RunScheduledInstancesRequest> getDryRunRequest() {
        Request<RunScheduledInstancesRequest> request = new RunScheduledInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: ").append(getLaunchSpecification()).append(",");
        if (getScheduledInstanceId() != null)
            sb.append("ScheduledInstanceId: ").append(getScheduledInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunScheduledInstancesRequest == false)
            return false;
        RunScheduledInstancesRequest other = (RunScheduledInstancesRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null)
            return false;
        if (other.getScheduledInstanceId() != null && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public RunScheduledInstancesRequest clone() {
        return (RunScheduledInstancesRequest) super.clone();
    }
}
