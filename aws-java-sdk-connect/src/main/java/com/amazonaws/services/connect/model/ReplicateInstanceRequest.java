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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You can
     * provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect instance.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     * </p>
     */
    private String replicaAlias;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You can
     * provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You
     *        can provide the <code>InstanceId</code>, or the entire ARN.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You can
     * provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     *         You can provide the <code>InstanceId</code>, or the entire ARN.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You can
     * provide the <code>InstanceId</code>, or the entire ARN.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance. You
     *        can provide the <code>InstanceId</code>, or the entire ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect instance.
     * </p>
     * 
     * @param replicaRegion
     *        The Amazon Web Services Region where to replicate the Amazon Connect instance.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect instance.
     * </p>
     * 
     * @return The Amazon Web Services Region where to replicate the Amazon Connect instance.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where to replicate the Amazon Connect instance.
     * </p>
     * 
     * @param replicaRegion
     *        The Amazon Web Services Region where to replicate the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceRequest withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     * </p>
     * 
     * @param replicaAlias
     *        The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     */

    public void setReplicaAlias(String replicaAlias) {
        this.replicaAlias = replicaAlias;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     * </p>
     * 
     * @return The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     */

    public String getReplicaAlias() {
        return this.replicaAlias;
    }

    /**
     * <p>
     * The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     * </p>
     * 
     * @param replicaAlias
     *        The alias for the replicated instance. The <code>ReplicaAlias</code> must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateInstanceRequest withReplicaAlias(String replicaAlias) {
        setReplicaAlias(replicaAlias);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getReplicaAlias() != null)
            sb.append("ReplicaAlias: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicateInstanceRequest == false)
            return false;
        ReplicateInstanceRequest other = (ReplicateInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getReplicaAlias() == null ^ this.getReplicaAlias() == null)
            return false;
        if (other.getReplicaAlias() != null && other.getReplicaAlias().equals(this.getReplicaAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getReplicaAlias() == null) ? 0 : getReplicaAlias().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateInstanceRequest clone() {
        return (ReplicateInstanceRequest) super.clone();
    }

}
