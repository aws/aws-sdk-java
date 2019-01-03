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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing information about the error, along with identifying information about the self-service action
 * and its associations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/FailedServiceActionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedServiceActionAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     */
    private String serviceActionId;
    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A text description of the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public void setServiceActionId(String serviceActionId) {
        this.serviceActionId = serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @return The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public String getServiceActionId() {
        return this.serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedServiceActionAssociation withServiceActionId(String serviceActionId) {
        setServiceActionId(serviceActionId);
        return this;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @param productId
     *        The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @return The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @param productId
     *        The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedServiceActionAssociation withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @return The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedServiceActionAssociation withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * 
     * @param errorCode
     *        The error code. Valid values are listed below.
     * @see ServiceActionAssociationErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * 
     * @return The error code. Valid values are listed below.
     * @see ServiceActionAssociationErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * 
     * @param errorCode
     *        The error code. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionAssociationErrorCode
     */

    public FailedServiceActionAssociation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * 
     * @param errorCode
     *        The error code. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceActionAssociationErrorCode
     */

    public FailedServiceActionAssociation withErrorCode(ServiceActionAssociationErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A text description of the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @return A text description of the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * 
     * @param errorMessage
     *        A text description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedServiceActionAssociation withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getServiceActionId() != null)
            sb.append("ServiceActionId: ").append(getServiceActionId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedServiceActionAssociation == false)
            return false;
        FailedServiceActionAssociation other = (FailedServiceActionAssociation) obj;
        if (other.getServiceActionId() == null ^ this.getServiceActionId() == null)
            return false;
        if (other.getServiceActionId() != null && other.getServiceActionId().equals(this.getServiceActionId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceActionId() == null) ? 0 : getServiceActionId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedServiceActionAssociation clone() {
        try {
            return (FailedServiceActionAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.FailedServiceActionAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
