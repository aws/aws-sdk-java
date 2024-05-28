/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet that contains the instance you want to access. You can request access to
     * instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     * <code>ERROR</code>. Use either a fleet ID or an ARN value.
     * </p>
     * <note>
     * <p>
     * You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift deletes
     * them.
     * </p>
     * </note>
     */
    private String fleetId;
    /**
     * <p>
     * A unique identifier for the instance you want to access. You can access an instance in any status.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * A unique identifier for the fleet that contains the instance you want to access. You can request access to
     * instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     * <code>ERROR</code>. Use either a fleet ID or an ARN value.
     * </p>
     * <note>
     * <p>
     * You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift deletes
     * them.
     * </p>
     * </note>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that contains the instance you want to access. You can request access to
     *        instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     *        <code>ERROR</code>. Use either a fleet ID or an ARN value. </p> <note>
     *        <p>
     *        You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift
     *        deletes them.
     *        </p>
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that contains the instance you want to access. You can request access to
     * instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     * <code>ERROR</code>. Use either a fleet ID or an ARN value.
     * </p>
     * <note>
     * <p>
     * You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift deletes
     * them.
     * </p>
     * </note>
     * 
     * @return A unique identifier for the fleet that contains the instance you want to access. You can request access
     *         to instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     *         <code>ERROR</code>. Use either a fleet ID or an ARN value. </p> <note>
     *         <p>
     *         You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift
     *         deletes them.
     *         </p>
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that contains the instance you want to access. You can request access to
     * instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     * <code>ERROR</code>. Use either a fleet ID or an ARN value.
     * </p>
     * <note>
     * <p>
     * You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift deletes
     * them.
     * </p>
     * </note>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that contains the instance you want to access. You can request access to
     *        instances in EC2 fleets with the following statuses: <code>ACTIVATING</code>, <code>ACTIVE</code>, or
     *        <code>ERROR</code>. Use either a fleet ID or an ARN value. </p> <note>
     *        <p>
     *        You can access fleets in <code>ERROR</code> status for a short period of time before Amazon GameLift
     *        deletes them.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the instance you want to access. You can access an instance in any status.
     * </p>
     * 
     * @param instanceId
     *        A unique identifier for the instance you want to access. You can access an instance in any status.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * A unique identifier for the instance you want to access. You can access an instance in any status.
     * </p>
     * 
     * @return A unique identifier for the instance you want to access. You can access an instance in any status.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * A unique identifier for the instance you want to access. You can access an instance in any status.
     * </p>
     * 
     * @param instanceId
     *        A unique identifier for the instance you want to access. You can access an instance in any status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessRequest == false)
            return false;
        GetInstanceAccessRequest other = (GetInstanceAccessRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceAccessRequest clone() {
        return (GetInstanceAccessRequest) super.clone();
    }

}
