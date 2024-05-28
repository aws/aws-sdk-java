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
 * Provides details about a control's enablement status in a specified standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StandardsControlAssociationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardsControlAssociationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a security standard.
     * </p>
     */
    private String standardsArn;
    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The ARN of a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     */
    private String securityControlArn;
    /**
     * <p>
     * Specifies whether a control is enabled or disabled in a specified standard.
     * </p>
     */
    private String associationStatus;
    /**
     * <p>
     * The requirement that underlies a control in the compliance framework related to the standard.
     * </p>
     */
    private java.util.List<String> relatedRequirements;
    /**
     * <p>
     * The time at which the enablement status of the control in the specified standard was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The reason for updating the enablement status of a control in a specified standard.
     * </p>
     */
    private String updatedReason;
    /**
     * <p>
     * The title of a control. This field may reference a specific standard.
     * </p>
     */
    private String standardsControlTitle;
    /**
     * <p>
     * The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions
     * under which it produces a failed finding. This parameter may reference a specific standard.
     * </p>
     */
    private String standardsControlDescription;
    /**
     * <p>
     * Provides the input parameter that Security Hub uses to call the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     * >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified standard.
     * </p>
     */
    private java.util.List<String> standardsControlArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a security standard.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of a security standard.
     */

    public void setStandardsArn(String standardsArn) {
        this.standardsArn = standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a security standard.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a security standard.
     */

    public String getStandardsArn() {
        return this.standardsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a security standard.
     * </p>
     * 
     * @param standardsArn
     *        The Amazon Resource Name (ARN) of a security standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withStandardsArn(String standardsArn) {
        setStandardsArn(standardsArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number, such as APIGateway.3.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @return The unique identifier of a security control across standards. Values for this field typically consist of
     *         an Amazon Web Service name and a number, such as APIGateway.3.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number, such as APIGateway.3.
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number, such as APIGateway.3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The ARN of a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @param securityControlArn
     *        The ARN of a security control across standards, such as
     *        <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *        mention a specific standard.
     */

    public void setSecurityControlArn(String securityControlArn) {
        this.securityControlArn = securityControlArn;
    }

    /**
     * <p>
     * The ARN of a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @return The ARN of a security control across standards, such as
     *         <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *         mention a specific standard.
     */

    public String getSecurityControlArn() {
        return this.securityControlArn;
    }

    /**
     * <p>
     * The ARN of a security control across standards, such as
     * <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't mention
     * a specific standard.
     * </p>
     * 
     * @param securityControlArn
     *        The ARN of a security control across standards, such as
     *        <code>arn:aws:securityhub:eu-central-1:123456789012:security-control/S3.1</code>. This parameter doesn't
     *        mention a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withSecurityControlArn(String securityControlArn) {
        setSecurityControlArn(securityControlArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether a control is enabled or disabled in a specified standard.
     * </p>
     * 
     * @param associationStatus
     *        Specifies whether a control is enabled or disabled in a specified standard.
     * @see AssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * Specifies whether a control is enabled or disabled in a specified standard.
     * </p>
     * 
     * @return Specifies whether a control is enabled or disabled in a specified standard.
     * @see AssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * Specifies whether a control is enabled or disabled in a specified standard.
     * </p>
     * 
     * @param associationStatus
     *        Specifies whether a control is enabled or disabled in a specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public StandardsControlAssociationDetail withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether a control is enabled or disabled in a specified standard.
     * </p>
     * 
     * @param associationStatus
     *        Specifies whether a control is enabled or disabled in a specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public StandardsControlAssociationDetail withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The requirement that underlies a control in the compliance framework related to the standard.
     * </p>
     * 
     * @return The requirement that underlies a control in the compliance framework related to the standard.
     */

    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * The requirement that underlies a control in the compliance framework related to the standard.
     * </p>
     * 
     * @param relatedRequirements
     *        The requirement that underlies a control in the compliance framework related to the standard.
     */

    public void setRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        if (relatedRequirements == null) {
            this.relatedRequirements = null;
            return;
        }

        this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements);
    }

    /**
     * <p>
     * The requirement that underlies a control in the compliance framework related to the standard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedRequirements(java.util.Collection)} or {@link #withRelatedRequirements(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param relatedRequirements
     *        The requirement that underlies a control in the compliance framework related to the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withRelatedRequirements(String... relatedRequirements) {
        if (this.relatedRequirements == null) {
            setRelatedRequirements(new java.util.ArrayList<String>(relatedRequirements.length));
        }
        for (String ele : relatedRequirements) {
            this.relatedRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requirement that underlies a control in the compliance framework related to the standard.
     * </p>
     * 
     * @param relatedRequirements
     *        The requirement that underlies a control in the compliance framework related to the standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
        return this;
    }

    /**
     * <p>
     * The time at which the enablement status of the control in the specified standard was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the enablement status of the control in the specified standard was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the enablement status of the control in the specified standard was last updated.
     * </p>
     * 
     * @return The time at which the enablement status of the control in the specified standard was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the enablement status of the control in the specified standard was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the enablement status of the control in the specified standard was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The reason for updating the enablement status of a control in a specified standard.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the enablement status of a control in a specified standard.
     */

    public void setUpdatedReason(String updatedReason) {
        this.updatedReason = updatedReason;
    }

    /**
     * <p>
     * The reason for updating the enablement status of a control in a specified standard.
     * </p>
     * 
     * @return The reason for updating the enablement status of a control in a specified standard.
     */

    public String getUpdatedReason() {
        return this.updatedReason;
    }

    /**
     * <p>
     * The reason for updating the enablement status of a control in a specified standard.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the enablement status of a control in a specified standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withUpdatedReason(String updatedReason) {
        setUpdatedReason(updatedReason);
        return this;
    }

    /**
     * <p>
     * The title of a control. This field may reference a specific standard.
     * </p>
     * 
     * @param standardsControlTitle
     *        The title of a control. This field may reference a specific standard.
     */

    public void setStandardsControlTitle(String standardsControlTitle) {
        this.standardsControlTitle = standardsControlTitle;
    }

    /**
     * <p>
     * The title of a control. This field may reference a specific standard.
     * </p>
     * 
     * @return The title of a control. This field may reference a specific standard.
     */

    public String getStandardsControlTitle() {
        return this.standardsControlTitle;
    }

    /**
     * <p>
     * The title of a control. This field may reference a specific standard.
     * </p>
     * 
     * @param standardsControlTitle
     *        The title of a control. This field may reference a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withStandardsControlTitle(String standardsControlTitle) {
        setStandardsControlTitle(standardsControlTitle);
        return this;
    }

    /**
     * <p>
     * The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions
     * under which it produces a failed finding. This parameter may reference a specific standard.
     * </p>
     * 
     * @param standardsControlDescription
     *        The description of a control. This typically summarizes how Security Hub evaluates the control and the
     *        conditions under which it produces a failed finding. This parameter may reference a specific standard.
     */

    public void setStandardsControlDescription(String standardsControlDescription) {
        this.standardsControlDescription = standardsControlDescription;
    }

    /**
     * <p>
     * The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions
     * under which it produces a failed finding. This parameter may reference a specific standard.
     * </p>
     * 
     * @return The description of a control. This typically summarizes how Security Hub evaluates the control and the
     *         conditions under which it produces a failed finding. This parameter may reference a specific standard.
     */

    public String getStandardsControlDescription() {
        return this.standardsControlDescription;
    }

    /**
     * <p>
     * The description of a control. This typically summarizes how Security Hub evaluates the control and the conditions
     * under which it produces a failed finding. This parameter may reference a specific standard.
     * </p>
     * 
     * @param standardsControlDescription
     *        The description of a control. This typically summarizes how Security Hub evaluates the control and the
     *        conditions under which it produces a failed finding. This parameter may reference a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withStandardsControlDescription(String standardsControlDescription) {
        setStandardsControlDescription(standardsControlDescription);
        return this;
    }

    /**
     * <p>
     * Provides the input parameter that Security Hub uses to call the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     * >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified standard.
     * </p>
     * 
     * @return Provides the input parameter that Security Hub uses to call the <a
     *         href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     *         >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified
     *         standard.
     */

    public java.util.List<String> getStandardsControlArns() {
        return standardsControlArns;
    }

    /**
     * <p>
     * Provides the input parameter that Security Hub uses to call the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     * >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified standard.
     * </p>
     * 
     * @param standardsControlArns
     *        Provides the input parameter that Security Hub uses to call the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     *        >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified
     *        standard.
     */

    public void setStandardsControlArns(java.util.Collection<String> standardsControlArns) {
        if (standardsControlArns == null) {
            this.standardsControlArns = null;
            return;
        }

        this.standardsControlArns = new java.util.ArrayList<String>(standardsControlArns);
    }

    /**
     * <p>
     * Provides the input parameter that Security Hub uses to call the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     * >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified standard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsControlArns(java.util.Collection)} or {@link #withStandardsControlArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param standardsControlArns
     *        Provides the input parameter that Security Hub uses to call the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     *        >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified
     *        standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withStandardsControlArns(String... standardsControlArns) {
        if (this.standardsControlArns == null) {
            setStandardsControlArns(new java.util.ArrayList<String>(standardsControlArns.length));
        }
        for (String ele : standardsControlArns) {
            this.standardsControlArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the input parameter that Security Hub uses to call the <a
     * href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     * >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified standard.
     * </p>
     * 
     * @param standardsControlArns
     *        Provides the input parameter that Security Hub uses to call the <a
     *        href="https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_UpdateStandardsControl.html"
     *        >UpdateStandardsControl</a> API. This API can be used to enable or disable a control in a specified
     *        standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardsControlAssociationDetail withStandardsControlArns(java.util.Collection<String> standardsControlArns) {
        setStandardsControlArns(standardsControlArns);
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
        if (getSecurityControlArn() != null)
            sb.append("SecurityControlArn: ").append(getSecurityControlArn()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: ").append(getRelatedRequirements()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedReason() != null)
            sb.append("UpdatedReason: ").append(getUpdatedReason()).append(",");
        if (getStandardsControlTitle() != null)
            sb.append("StandardsControlTitle: ").append(getStandardsControlTitle()).append(",");
        if (getStandardsControlDescription() != null)
            sb.append("StandardsControlDescription: ").append(getStandardsControlDescription()).append(",");
        if (getStandardsControlArns() != null)
            sb.append("StandardsControlArns: ").append(getStandardsControlArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsControlAssociationDetail == false)
            return false;
        StandardsControlAssociationDetail other = (StandardsControlAssociationDetail) obj;
        if (other.getStandardsArn() == null ^ this.getStandardsArn() == null)
            return false;
        if (other.getStandardsArn() != null && other.getStandardsArn().equals(this.getStandardsArn()) == false)
            return false;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getSecurityControlArn() == null ^ this.getSecurityControlArn() == null)
            return false;
        if (other.getSecurityControlArn() != null && other.getSecurityControlArn().equals(this.getSecurityControlArn()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedReason() == null ^ this.getUpdatedReason() == null)
            return false;
        if (other.getUpdatedReason() != null && other.getUpdatedReason().equals(this.getUpdatedReason()) == false)
            return false;
        if (other.getStandardsControlTitle() == null ^ this.getStandardsControlTitle() == null)
            return false;
        if (other.getStandardsControlTitle() != null && other.getStandardsControlTitle().equals(this.getStandardsControlTitle()) == false)
            return false;
        if (other.getStandardsControlDescription() == null ^ this.getStandardsControlDescription() == null)
            return false;
        if (other.getStandardsControlDescription() != null && other.getStandardsControlDescription().equals(this.getStandardsControlDescription()) == false)
            return false;
        if (other.getStandardsControlArns() == null ^ this.getStandardsControlArns() == null)
            return false;
        if (other.getStandardsControlArns() != null && other.getStandardsControlArns().equals(this.getStandardsControlArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsArn() == null) ? 0 : getStandardsArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlArn() == null) ? 0 : getSecurityControlArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedReason() == null) ? 0 : getUpdatedReason().hashCode());
        hashCode = prime * hashCode + ((getStandardsControlTitle() == null) ? 0 : getStandardsControlTitle().hashCode());
        hashCode = prime * hashCode + ((getStandardsControlDescription() == null) ? 0 : getStandardsControlDescription().hashCode());
        hashCode = prime * hashCode + ((getStandardsControlArns() == null) ? 0 : getStandardsControlArns().hashCode());
        return hashCode;
    }

    @Override
    public StandardsControlAssociationDetail clone() {
        try {
            return (StandardsControlAssociationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StandardsControlAssociationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
