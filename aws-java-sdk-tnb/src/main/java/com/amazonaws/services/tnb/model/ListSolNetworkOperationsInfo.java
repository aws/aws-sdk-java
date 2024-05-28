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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information parameters for a network operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperationsInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkOperationsInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Network operation ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Error related to this specific network operation.
     * </p>
     */
    private ProblemDetails error;
    /**
     * <p>
     * ID of this network operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Type of lifecycle management network operation.
     * </p>
     */
    private String lcmOperationType;
    /**
     * <p>
     * Metadata related to this network operation.
     * </p>
     */
    private ListSolNetworkOperationsMetadata metadata;
    /**
     * <p>
     * ID of the network instance related to this operation.
     * </p>
     */
    private String nsInstanceId;
    /**
     * <p>
     * The state of the network operation.
     * </p>
     */
    private String operationState;

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @param arn
     *        Network operation ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @return Network operation ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network operation ARN.
     * </p>
     * 
     * @param arn
     *        Network operation ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Error related to this specific network operation.
     * </p>
     * 
     * @param error
     *        Error related to this specific network operation.
     */

    public void setError(ProblemDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * Error related to this specific network operation.
     * </p>
     * 
     * @return Error related to this specific network operation.
     */

    public ProblemDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * Error related to this specific network operation.
     * </p>
     * 
     * @param error
     *        Error related to this specific network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsInfo withError(ProblemDetails error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * ID of this network operation.
     * </p>
     * 
     * @param id
     *        ID of this network operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of this network operation.
     * </p>
     * 
     * @return ID of this network operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of this network operation.
     * </p>
     * 
     * @param id
     *        ID of this network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Type of lifecycle management network operation.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of lifecycle management network operation.
     * @see LcmOperationType
     */

    public void setLcmOperationType(String lcmOperationType) {
        this.lcmOperationType = lcmOperationType;
    }

    /**
     * <p>
     * Type of lifecycle management network operation.
     * </p>
     * 
     * @return Type of lifecycle management network operation.
     * @see LcmOperationType
     */

    public String getLcmOperationType() {
        return this.lcmOperationType;
    }

    /**
     * <p>
     * Type of lifecycle management network operation.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of lifecycle management network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LcmOperationType
     */

    public ListSolNetworkOperationsInfo withLcmOperationType(String lcmOperationType) {
        setLcmOperationType(lcmOperationType);
        return this;
    }

    /**
     * <p>
     * Type of lifecycle management network operation.
     * </p>
     * 
     * @param lcmOperationType
     *        Type of lifecycle management network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LcmOperationType
     */

    public ListSolNetworkOperationsInfo withLcmOperationType(LcmOperationType lcmOperationType) {
        this.lcmOperationType = lcmOperationType.toString();
        return this;
    }

    /**
     * <p>
     * Metadata related to this network operation.
     * </p>
     * 
     * @param metadata
     *        Metadata related to this network operation.
     */

    public void setMetadata(ListSolNetworkOperationsMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata related to this network operation.
     * </p>
     * 
     * @return Metadata related to this network operation.
     */

    public ListSolNetworkOperationsMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata related to this network operation.
     * </p>
     * 
     * @param metadata
     *        Metadata related to this network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsInfo withMetadata(ListSolNetworkOperationsMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * ID of the network instance related to this operation.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance related to this operation.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance related to this operation.
     * </p>
     * 
     * @return ID of the network instance related to this operation.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance related to this operation.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance related to this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsInfo withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
        return this;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @see NsLcmOperationState
     */

    public void setOperationState(String operationState) {
        this.operationState = operationState;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @return The state of the network operation.
     * @see NsLcmOperationState
     */

    public String getOperationState() {
        return this.operationState;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsLcmOperationState
     */

    public ListSolNetworkOperationsInfo withOperationState(String operationState) {
        setOperationState(operationState);
        return this;
    }

    /**
     * <p>
     * The state of the network operation.
     * </p>
     * 
     * @param operationState
     *        The state of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsLcmOperationState
     */

    public ListSolNetworkOperationsInfo withOperationState(NsLcmOperationState operationState) {
        this.operationState = operationState.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLcmOperationType() != null)
            sb.append("LcmOperationType: ").append(getLcmOperationType()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId()).append(",");
        if (getOperationState() != null)
            sb.append("OperationState: ").append(getOperationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolNetworkOperationsInfo == false)
            return false;
        ListSolNetworkOperationsInfo other = (ListSolNetworkOperationsInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLcmOperationType() == null ^ this.getLcmOperationType() == null)
            return false;
        if (other.getLcmOperationType() != null && other.getLcmOperationType().equals(this.getLcmOperationType()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        if (other.getOperationState() == null ^ this.getOperationState() == null)
            return false;
        if (other.getOperationState() != null && other.getOperationState().equals(this.getOperationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLcmOperationType() == null) ? 0 : getLcmOperationType().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        hashCode = prime * hashCode + ((getOperationState() == null) ? 0 : getOperationState().hashCode());
        return hashCode;
    }

    @Override
    public ListSolNetworkOperationsInfo clone() {
        try {
            return (ListSolNetworkOperationsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ListSolNetworkOperationsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
