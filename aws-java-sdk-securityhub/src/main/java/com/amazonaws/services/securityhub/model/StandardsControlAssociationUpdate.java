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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of requested updates to the enablement status of controls in specified standards. The objects in the array
 * include a security control ID, the Amazon Resource Name (ARN) of the standard, the requested enablement status, and
 * the reason for updating the enablement status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsControlAssociationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControlAssociationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement status.
     * </p>
     */
    private String standardsArn;
    /**
     * <p>
     * The unique identifier for the security control whose enablement status you want to update.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The desired enablement status of the control in the standard.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The reason for updating the control's enablement status in the standard.
     * </p>
     */
    private String updatedReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement status.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement
     *        status.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement
     *         status.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement status.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of the standard in which you want to update the control's enablement
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationUpdate withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the security control whose enablement status you want to update.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier for the security control whose enablement status you want to update.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier for the security control whose enablement status you want to update.
     * </p>
     * 
     * @return The unique identifier for the security control whose enablement status you want to update.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier for the security control whose enablement status you want to update.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier for the security control whose enablement status you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationUpdate withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The desired enablement status of the control in the standard.
     * </p>
     * 
     * @param associationStatus
     *        The desired enablement status of the control in the standard.
     * @see AssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * The desired enablement status of the control in the standard.
     * </p>
     * 
     * @return The desired enablement status of the control in the standard.
     * @see AssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * The desired enablement status of the control in the standard.
     * </p>
     * 
     * @param associationStatus
     *        The desired enablement status of the control in the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public StandardsControlAssociationUpdate withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * The desired enablement status of the control in the standard.
     * </p>
     * 
     * @param associationStatus
     *        The desired enablement status of the control in the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public StandardsControlAssociationUpdate withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for updating the control's enablement status in the standard.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the control's enablement status in the standard.
     */

    public void setUpdatedReason(String updatedReason) {
        this.updatedReason = updatedReason;
    }

    /**
     * <p>
     * The reason for updating the control's enablement status in the standard.
     * </p>
     * 
     * @return The reason for updating the control's enablement status in the standard.
     */

    public String getUpdatedReason() {
        return this.updatedReason;
    }

    /**
     * <p>
     * The reason for updating the control's enablement status in the standard.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the control's enablement status in the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationUpdate withUpdatedReason(String updatedReason) {
        setUpdatedReason(updatedReason);
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
        if (getStandardsArn() != null)
            sb.append("StandardsArn: ").append(getStandardsArn()).append(",");
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getUpdatedReason() != null)
            sb.append("UpdatedReason: ").append(getUpdatedReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsControlAssociationUpdate == false)
            return false;
        StandardsControlAssociationUpdate other = (StandardsControlAssociationUpdate) obj;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getUpdatedReason() == null ^ this.getUpdatedReason() == null)
            return false;
        if (other.getUpdatedReason() != null && other.getUpdatedReason().equals(this.getUpdatedReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedReason() == null) ? 0 : getUpdatedReason().hashCode());
        return hashCode;
    }

    @Override
    public StandardsControlAssociationUpdate clone() {
        try {
            return (StandardsControlAssociationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsControlAssociationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
