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
 * Returns information about a serverless cluster operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationV2Serverless" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationV2Serverless implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Description of the VPC connection for CreateVpcConnection and DeleteVpcConnection operations.
     * </p>
     */
    private VpcConnectionInfoServerless vpcConnectionInfo;

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

    public void setVpcConnectionInfo(VpcConnectionInfoServerless vpcConnectionInfo) {
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

    public VpcConnectionInfoServerless getVpcConnectionInfo() {
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

    public ClusterOperationV2Serverless withVpcConnectionInfo(VpcConnectionInfoServerless vpcConnectionInfo) {
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

        if (obj instanceof ClusterOperationV2Serverless == false)
            return false;
        ClusterOperationV2Serverless other = (ClusterOperationV2Serverless) obj;
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

        hashCode = prime * hashCode + ((getVpcConnectionInfo() == null) ? 0 : getVpcConnectionInfo().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationV2Serverless clone() {
        try {
            return (ClusterOperationV2Serverless) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationV2ServerlessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
