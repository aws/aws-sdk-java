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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Serverless cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/Serverless" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Serverless implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the Amazon VPCs for the cluster.
     * </p>
     */
    private java.util.List<VpcConfig> vpcConfigs;
    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     */
    private ServerlessClientAuthentication clientAuthentication;

    /**
     * <p>
     * The configuration of the Amazon VPCs for the cluster.
     * </p>
     * 
     * @return <p>
     *         The configuration of the Amazon VPCs for the cluster.
     *         </p>
     */

    public java.util.List<VpcConfig> getVpcConfigs() {
        return vpcConfigs;
    }

    /**
     * <p>
     * The configuration of the Amazon VPCs for the cluster.
     * </p>
     * 
     * @param vpcConfigs
     *        <p>
     *        The configuration of the Amazon VPCs for the cluster.
     *        </p>
     */

    public void setVpcConfigs(java.util.Collection<VpcConfig> vpcConfigs) {
        if (vpcConfigs == null) {
            this.vpcConfigs = null;
            return;
        }

        this.vpcConfigs = new java.util.ArrayList<VpcConfig>(vpcConfigs);
    }

    /**
     * <p>
     * The configuration of the Amazon VPCs for the cluster.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcConfigs(java.util.Collection)} or {@link #withVpcConfigs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcConfigs
     *        <p>
     *        The configuration of the Amazon VPCs for the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Serverless withVpcConfigs(VpcConfig... vpcConfigs) {
        if (this.vpcConfigs == null) {
            setVpcConfigs(new java.util.ArrayList<VpcConfig>(vpcConfigs.length));
        }
        for (VpcConfig ele : vpcConfigs) {
            this.vpcConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of the Amazon VPCs for the cluster.
     * </p>
     * 
     * @param vpcConfigs
     *        <p>
     *        The configuration of the Amazon VPCs for the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Serverless withVpcConfigs(java.util.Collection<VpcConfig> vpcConfigs) {
        setVpcConfigs(vpcConfigs);
        return this;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information.
     *        </p>
     */

    public void setClientAuthentication(ServerlessClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication information.
     *         </p>
     */

    public ServerlessClientAuthentication getClientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Serverless withClientAuthentication(ServerlessClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
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
        if (getVpcConfigs() != null)
            sb.append("VpcConfigs: ").append(getVpcConfigs()).append(",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Serverless == false)
            return false;
        Serverless other = (Serverless) obj;
        if (other.getVpcConfigs() == null ^ this.getVpcConfigs() == null)
            return false;
        if (other.getVpcConfigs() != null && other.getVpcConfigs().equals(this.getVpcConfigs()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConfigs() == null) ? 0 : getVpcConfigs().hashCode());
        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public Serverless clone() {
        try {
            return (Serverless) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ServerlessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
