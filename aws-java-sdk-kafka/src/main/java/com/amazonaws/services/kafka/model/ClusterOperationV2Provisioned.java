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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Returns information about a provisioned cluster operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationV2Provisioned"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationV2Provisioned implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Steps completed during the operation.
     * </p>
     */
    private java.util.List<ClusterOperationStep> operationSteps;
    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     */
    private MutableClusterInfo sourceClusterInfo;
    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     */
    private MutableClusterInfo targetClusterInfo;
    /**
     * <p>
     * Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     * </p>
     */
    private VpcConnectionInfo vpcConnectionInfo;

    /**
     * <p>
     * Steps completed during the operation.
     * </p>
     * 
     * @return <p>
     *         Steps completed during the operation.
     *         </p>
     */

    public java.util.List<ClusterOperationStep> getOperationSteps() {
        return operationSteps;
    }

    /**
     * <p>
     * Steps completed during the operation.
     * </p>
     * 
     * @param operationSteps
     *        <p>
     *        Steps completed during the operation.
     *        </p>
     */

    public void setOperationSteps(java.util.Collection<ClusterOperationStep> operationSteps) {
        if (operationSteps == null) {
            this.operationSteps = null;
            return;
        }

        this.operationSteps = new java.util.ArrayList<ClusterOperationStep>(operationSteps);
    }

    /**
     * <p>
     * Steps completed during the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperationSteps(java.util.Collection)} or {@link #withOperationSteps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param operationSteps
     *        <p>
     *        Steps completed during the operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2Provisioned withOperationSteps(ClusterOperationStep... operationSteps) {
        if (this.operationSteps == null) {
            setOperationSteps(new java.util.ArrayList<ClusterOperationStep>(operationSteps.length));
        }
        for (ClusterOperationStep ele : operationSteps) {
            this.operationSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Steps completed during the operation.
     * </p>
     * 
     * @param operationSteps
     *        <p>
     *        Steps completed during the operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2Provisioned withOperationSteps(java.util.Collection<ClusterOperationStep> operationSteps) {
        setOperationSteps(operationSteps);
        return this;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @param sourceClusterInfo
     *        <p>
     *        Information about cluster attributes before a cluster is updated.
     *        </p>
     */

    public void setSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        this.sourceClusterInfo = sourceClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes before a cluster is updated.
     *         </p>
     */

    public MutableClusterInfo getSourceClusterInfo() {
        return this.sourceClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes before a cluster is updated.
     * </p>
     * 
     * @param sourceClusterInfo
     *        <p>
     *        Information about cluster attributes before a cluster is updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2Provisioned withSourceClusterInfo(MutableClusterInfo sourceClusterInfo) {
        setSourceClusterInfo(sourceClusterInfo);
        return this;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @param targetClusterInfo
     *        <p>
     *        Information about cluster attributes after a cluster is updated.
     *        </p>
     */

    public void setTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        this.targetClusterInfo = targetClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @return <p>
     *         Information about cluster attributes after a cluster is updated.
     *         </p>
     */

    public MutableClusterInfo getTargetClusterInfo() {
        return this.targetClusterInfo;
    }

    /**
     * <p>
     * Information about cluster attributes after a cluster is updated.
     * </p>
     * 
     * @param targetClusterInfo
     *        <p>
     *        Information about cluster attributes after a cluster is updated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2Provisioned withTargetClusterInfo(MutableClusterInfo targetClusterInfo) {
        setTargetClusterInfo(targetClusterInfo);
        return this;
    }

    /**
     * <p>
     * Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     * </p>
     * 
     * @param vpcConnectionInfo
     *        <p>
     *        Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     *        </p>
     */

    public void setVpcConnectionInfo(VpcConnectionInfo vpcConnectionInfo) {
        this.vpcConnectionInfo = vpcConnectionInfo;
    }

    /**
     * <p>
     * Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     * </p>
     * 
     * @return <p>
     *         Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     *         </p>
     */

    public VpcConnectionInfo getVpcConnectionInfo() {
        return this.vpcConnectionInfo;
    }

    /**
     * <p>
     * Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     * </p>
     * 
     * @param vpcConnectionInfo
     *        <p>
     *        Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationV2Provisioned withVpcConnectionInfo(VpcConnectionInfo vpcConnectionInfo) {
        setVpcConnectionInfo(vpcConnectionInfo);
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
        if (getOperationSteps() != null)
            sb.append("OperationSteps: ").append(getOperationSteps()).append(",");
        if (getSourceClusterInfo() != null)
            sb.append("SourceClusterInfo: ").append(getSourceClusterInfo()).append(",");
        if (getTargetClusterInfo() != null)
            sb.append("TargetClusterInfo: ").append(getTargetClusterInfo()).append(",");
        if (getVpcConnectionInfo() != null)
            sb.append("VpcConnectionInfo: ").append(getVpcConnectionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationV2Provisioned == false)
            return false;
        ClusterOperationV2Provisioned other = (ClusterOperationV2Provisioned) obj;
        if (other.getOperationSteps() == null ^ this.getOperationSteps() == null)
            return false;
        if (other.getOperationSteps() != null && other.getOperationSteps().equals(this.getOperationSteps()) == false)
            return false;
        if (other.getSourceClusterInfo() == null ^ this.getSourceClusterInfo() == null)
            return false;
        if (other.getSourceClusterInfo() != null && other.getSourceClusterInfo().equals(this.getSourceClusterInfo()) == false)
            return false;
        if (other.getTargetClusterInfo() == null ^ this.getTargetClusterInfo() == null)
            return false;
        if (other.getTargetClusterInfo() != null && other.getTargetClusterInfo().equals(this.getTargetClusterInfo()) == false)
            return false;
        if (other.getVpcConnectionInfo() == null ^ this.getVpcConnectionInfo() == null)
            return false;
        if (other.getVpcConnectionInfo() != null && other.getVpcConnectionInfo().equals(this.getVpcConnectionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationSteps() == null) ? 0 : getOperationSteps().hashCode());
        hashCode = prime * hashCode + ((getSourceClusterInfo() == null) ? 0 : getSourceClusterInfo().hashCode());
        hashCode = prime * hashCode + ((getTargetClusterInfo() == null) ? 0 : getTargetClusterInfo().hashCode());
        hashCode = prime * hashCode + ((getVpcConnectionInfo() == null) ? 0 : getVpcConnectionInfo().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationV2Provisioned clone() {
        try {
            return (ClusterOperationV2Provisioned) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationV2ProvisionedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
