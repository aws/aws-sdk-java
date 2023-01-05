/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyInstanceMaintenanceOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceMaintenanceOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceMaintenanceOptionsRequest> {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     */
    private String autoRecovery;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceMaintenanceOptionsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @see InstanceAutoRecoveryState
     */

    public void setAutoRecovery(String autoRecovery) {
        this.autoRecovery = autoRecovery;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @return Disables the automatic recovery behavior of your instance or sets it to default.
     * @see InstanceAutoRecoveryState
     */

    public String getAutoRecovery() {
        return this.autoRecovery;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAutoRecoveryState
     */

    public ModifyInstanceMaintenanceOptionsRequest withAutoRecovery(String autoRecovery) {
        setAutoRecovery(autoRecovery);
        return this;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAutoRecoveryState
     */

    public ModifyInstanceMaintenanceOptionsRequest withAutoRecovery(InstanceAutoRecoveryState autoRecovery) {
        this.autoRecovery = autoRecovery.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceMaintenanceOptionsRequest> getDryRunRequest() {
        Request<ModifyInstanceMaintenanceOptionsRequest> request = new ModifyInstanceMaintenanceOptionsRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAutoRecovery() != null)
            sb.append("AutoRecovery: ").append(getAutoRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceMaintenanceOptionsRequest == false)
            return false;
        ModifyInstanceMaintenanceOptionsRequest other = (ModifyInstanceMaintenanceOptionsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAutoRecovery() == null ^ this.getAutoRecovery() == null)
            return false;
        if (other.getAutoRecovery() != null && other.getAutoRecovery().equals(this.getAutoRecovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAutoRecovery() == null) ? 0 : getAutoRecovery().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceMaintenanceOptionsRequest clone() {
        return (ModifyInstanceMaintenanceOptionsRequest) super.clone();
    }
}
