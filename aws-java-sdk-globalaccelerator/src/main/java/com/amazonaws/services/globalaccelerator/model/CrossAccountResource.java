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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An endpoint (Amazon Web Services resource) or an IP address range, in CIDR format, that is listed in a cross-account
 * attachment. A cross-account resource can be added to an accelerator by specified principals, which are also listed in
 * the attachment.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/cross-account-resources.html"> Working with
 * cross-account attachments and resources in Global Accelerator</a> in the <i> Global Accelerator Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CrossAccountResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossAccountResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address must be
     * provisioned and advertised in Global Accelerator by following the bring your own IP address (BYOIP) process for
     * Global Accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the Global Accelerator Developer Guide.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or CIDR
     * range) that can be added to accelerators and principals that have permission to add them.
     * </p>
     */
    private String attachmentArn;

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @param endpointId
     *        The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *        accelerator by specified principals.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @return The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *         accelerator by specified principals.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @param endpointId
     *        The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *        accelerator by specified principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossAccountResource withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address must be
     * provisioned and advertised in Global Accelerator by following the bring your own IP address (BYOIP) process for
     * Global Accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the Global Accelerator Developer Guide.
     * </p>
     * 
     * @param cidr
     *        An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address
     *        must be provisioned and advertised in Global Accelerator by following the bring your own IP address
     *        (BYOIP) process for Global Accelerator.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP
     *        addresses (BYOIP)</a> in the Global Accelerator Developer Guide.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address must be
     * provisioned and advertised in Global Accelerator by following the bring your own IP address (BYOIP) process for
     * Global Accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the Global Accelerator Developer Guide.
     * </p>
     * 
     * @return An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address
     *         must be provisioned and advertised in Global Accelerator by following the bring your own IP address
     *         (BYOIP) process for Global Accelerator.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP
     *         addresses (BYOIP)</a> in the Global Accelerator Developer Guide.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address must be
     * provisioned and advertised in Global Accelerator by following the bring your own IP address (BYOIP) process for
     * Global Accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the Global Accelerator Developer Guide.
     * </p>
     * 
     * @param cidr
     *        An IP address range, in CIDR format, that is specified as an Amazon Web Services resource. The address
     *        must be provisioned and advertised in Global Accelerator by following the bring your own IP address
     *        (BYOIP) process for Global Accelerator.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP
     *        addresses (BYOIP)</a> in the Global Accelerator Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossAccountResource withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or CIDR
     * range) that can be added to accelerators and principals that have permission to add them.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or
     *        CIDR range) that can be added to accelerators and principals that have permission to add them.
     */

    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or CIDR
     * range) that can be added to accelerators and principals that have permission to add them.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or
     *         CIDR range) that can be added to accelerators and principals that have permission to add them.
     */

    public String getAttachmentArn() {
        return this.attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or CIDR
     * range) that can be added to accelerators and principals that have permission to add them.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment that specifies the resources (endpoints or
     *        CIDR range) that can be added to accelerators and principals that have permission to add them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossAccountResource withAttachmentArn(String attachmentArn) {
        setAttachmentArn(attachmentArn);
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getAttachmentArn() != null)
            sb.append("AttachmentArn: ").append(getAttachmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossAccountResource == false)
            return false;
        CrossAccountResource other = (CrossAccountResource) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        return hashCode;
    }

    @Override
    public CrossAccountResource clone() {
        try {
            return (CrossAccountResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.CrossAccountResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
