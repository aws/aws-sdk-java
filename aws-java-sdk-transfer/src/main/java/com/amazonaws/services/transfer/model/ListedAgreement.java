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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of an agreement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedAgreement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedAgreement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified agreement.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     * operation and providing a new description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The unique identifier for the agreement.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     */
    private String localProfileId;
    /**
     * <p>
     * A unique identifier for the partner profile.
     * </p>
     */
    private String partnerProfileId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified agreement.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified agreement.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified agreement.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified agreement.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified agreement.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @return A unique identifier for the agreement. This identifier is returned when you create an agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * </p>
     * 
     * @param agreementId
     *        A unique identifier for the agreement. This identifier is returned when you create an agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     * operation and providing a new description.
     * </p>
     * 
     * @param description
     *        The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     *        operation and providing a new description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     * operation and providing a new description.
     * </p>
     * 
     * @return The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     *         operation and providing a new description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     * operation and providing a new description.
     * </p>
     * 
     * @param description
     *        The current description for the agreement. You can change it by calling the <code>UpdateAgreement</code>
     *        operation and providing a new description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see AgreementStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @return The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see AgreementStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatusType
     */

    public ListedAgreement withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The agreement can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatusType
     */

    public ListedAgreement withStatus(AgreementStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the agreement.
     * </p>
     * 
     * @param serverId
     *        The unique identifier for the agreement.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The unique identifier for the agreement.
     * </p>
     * 
     * @return The unique identifier for the agreement.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The unique identifier for the agreement.
     * </p>
     * 
     * @param serverId
     *        The unique identifier for the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.
     */

    public void setLocalProfileId(String localProfileId) {
        this.localProfileId = localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @return A unique identifier for the AS2 local profile.
     */

    public String getLocalProfileId() {
        return this.localProfileId;
    }

    /**
     * <p>
     * A unique identifier for the AS2 local profile.
     * </p>
     * 
     * @param localProfileId
     *        A unique identifier for the AS2 local profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withLocalProfileId(String localProfileId) {
        setLocalProfileId(localProfileId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the partner profile.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile.
     */

    public void setPartnerProfileId(String partnerProfileId) {
        this.partnerProfileId = partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile.
     * </p>
     * 
     * @return A unique identifier for the partner profile.
     */

    public String getPartnerProfileId() {
        return this.partnerProfileId;
    }

    /**
     * <p>
     * A unique identifier for the partner profile.
     * </p>
     * 
     * @param partnerProfileId
     *        A unique identifier for the partner profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedAgreement withPartnerProfileId(String partnerProfileId) {
        setPartnerProfileId(partnerProfileId);
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getLocalProfileId() != null)
            sb.append("LocalProfileId: ").append(getLocalProfileId()).append(",");
        if (getPartnerProfileId() != null)
            sb.append("PartnerProfileId: ").append(getPartnerProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedAgreement == false)
            return false;
        ListedAgreement other = (ListedAgreement) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getLocalProfileId() == null ^ this.getLocalProfileId() == null)
            return false;
        if (other.getLocalProfileId() != null && other.getLocalProfileId().equals(this.getLocalProfileId()) == false)
            return false;
        if (other.getPartnerProfileId() == null ^ this.getPartnerProfileId() == null)
            return false;
        if (other.getPartnerProfileId() != null && other.getPartnerProfileId().equals(this.getPartnerProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getLocalProfileId() == null) ? 0 : getLocalProfileId().hashCode());
        hashCode = prime * hashCode + ((getPartnerProfileId() == null) ? 0 : getPartnerProfileId().hashCode());
        return hashCode;
    }

    @Override
    public ListedAgreement clone() {
        try {
            return (ListedAgreement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedAgreementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
