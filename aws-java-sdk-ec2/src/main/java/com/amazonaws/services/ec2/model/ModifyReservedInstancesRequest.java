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
import com.amazonaws.services.ec2.model.transform.ModifyReservedInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyReservedInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyReservedInstancesRequest> {

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> reservedInstancesIds;
    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration> targetConfigurations;

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * 
     * @return The IDs of the Reserved Instances to modify.
     */

    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return reservedInstancesIds;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances to modify.
     */

    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds);
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesIds(java.util.Collection)} or {@link #withReservedInstancesIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (this.reservedInstancesIds == null) {
            setReservedInstancesIds(new com.amazonaws.internal.SdkInternalList<String>(reservedInstancesIds.length));
        }
        for (String ele : reservedInstancesIds) {
            this.reservedInstancesIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * 
     * @param reservedInstancesIds
     *        The IDs of the Reserved Instances to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * 
     * @return The configuration settings for the Reserved Instances to modify.
     */

    public java.util.List<ReservedInstancesConfiguration> getTargetConfigurations() {
        if (targetConfigurations == null) {
            targetConfigurations = new com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration>();
        }
        return targetConfigurations;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration settings for the Reserved Instances to modify.
     */

    public void setTargetConfigurations(java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
            return;
        }

        this.targetConfigurations = new com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration>(targetConfigurations);
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetConfigurations(java.util.Collection)} or {@link #withTargetConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration settings for the Reserved Instances to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesRequest withTargetConfigurations(ReservedInstancesConfiguration... targetConfigurations) {
        if (this.targetConfigurations == null) {
            setTargetConfigurations(new com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration>(targetConfigurations.length));
        }
        for (ReservedInstancesConfiguration ele : targetConfigurations) {
            this.targetConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * 
     * @param targetConfigurations
     *        The configuration settings for the Reserved Instances to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReservedInstancesRequest withTargetConfigurations(java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        setTargetConfigurations(targetConfigurations);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyReservedInstancesRequest> getDryRunRequest() {
        Request<ModifyReservedInstancesRequest> request = new ModifyReservedInstancesRequestMarshaller().marshall(this);
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
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: ").append(getReservedInstancesIds()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTargetConfigurations() != null)
            sb.append("TargetConfigurations: ").append(getTargetConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReservedInstancesRequest == false)
            return false;
        ModifyReservedInstancesRequest other = (ModifyReservedInstancesRequest) obj;
        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTargetConfigurations() == null ^ this.getTargetConfigurations() == null)
            return false;
        if (other.getTargetConfigurations() != null && other.getTargetConfigurations().equals(this.getTargetConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTargetConfigurations() == null) ? 0 : getTargetConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReservedInstancesRequest clone() {
        return (ModifyReservedInstancesRequest) super.clone();
    }
}
