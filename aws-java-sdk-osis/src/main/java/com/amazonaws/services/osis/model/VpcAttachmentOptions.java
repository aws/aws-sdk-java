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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options for attaching a VPC to pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/VpcAttachmentOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcAttachmentOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether a VPC is attached to the pipeline.
     * </p>
     */
    private Boolean attachToVpc;
    /**
     * <p>
     * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * Whether a VPC is attached to the pipeline.
     * </p>
     * 
     * @param attachToVpc
     *        Whether a VPC is attached to the pipeline.
     */

    public void setAttachToVpc(Boolean attachToVpc) {
        this.attachToVpc = attachToVpc;
    }

    /**
     * <p>
     * Whether a VPC is attached to the pipeline.
     * </p>
     * 
     * @return Whether a VPC is attached to the pipeline.
     */

    public Boolean getAttachToVpc() {
        return this.attachToVpc;
    }

    /**
     * <p>
     * Whether a VPC is attached to the pipeline.
     * </p>
     * 
     * @param attachToVpc
     *        Whether a VPC is attached to the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachmentOptions withAttachToVpc(Boolean attachToVpc) {
        setAttachToVpc(attachToVpc);
        return this;
    }

    /**
     * <p>
     * Whether a VPC is attached to the pipeline.
     * </p>
     * 
     * @return Whether a VPC is attached to the pipeline.
     */

    public Boolean isAttachToVpc() {
        return this.attachToVpc;
    }

    /**
     * <p>
     * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     * </p>
     * 
     * @return The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block to be reserved for OpenSearch Ingestion to create elastic network interfaces (ENIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcAttachmentOptions withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
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
        if (getAttachToVpc() != null)
            sb.append("AttachToVpc: ").append(getAttachToVpc()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcAttachmentOptions == false)
            return false;
        VpcAttachmentOptions other = (VpcAttachmentOptions) obj;
        if (other.getAttachToVpc() == null ^ this.getAttachToVpc() == null)
            return false;
        if (other.getAttachToVpc() != null && other.getAttachToVpc().equals(this.getAttachToVpc()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachToVpc() == null) ? 0 : getAttachToVpc().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public VpcAttachmentOptions clone() {
        try {
            return (VpcAttachmentOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.VpcAttachmentOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
