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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the engagement resolution steps. The resolution starts from the first contact, which can be an
 * escalation plan, then resolves to an on-call rotation, and finally to a personal contact.
 * </p>
 * <p>
 * The <code>ResolutionContact</code> structure describes the information for each node or step in that process. It
 * contains information about different contact types, such as the escalation, rotation, and personal contacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ResolutionContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolutionContact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The type of contact for a resolution step.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The stage in the escalation plan that resolves to this contact.
     * </p>
     */
    private Integer stageIndex;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of a contact in the engagement resolution process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolutionContact withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * The type of contact for a resolution step.
     * </p>
     * 
     * @param type
     *        The type of contact for a resolution step.
     * @see ContactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of contact for a resolution step.
     * </p>
     * 
     * @return The type of contact for a resolution step.
     * @see ContactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of contact for a resolution step.
     * </p>
     * 
     * @param type
     *        The type of contact for a resolution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ResolutionContact withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of contact for a resolution step.
     * </p>
     * 
     * @param type
     *        The type of contact for a resolution step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ResolutionContact withType(ContactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The stage in the escalation plan that resolves to this contact.
     * </p>
     * 
     * @param stageIndex
     *        The stage in the escalation plan that resolves to this contact.
     */

    public void setStageIndex(Integer stageIndex) {
        this.stageIndex = stageIndex;
    }

    /**
     * <p>
     * The stage in the escalation plan that resolves to this contact.
     * </p>
     * 
     * @return The stage in the escalation plan that resolves to this contact.
     */

    public Integer getStageIndex() {
        return this.stageIndex;
    }

    /**
     * <p>
     * The stage in the escalation plan that resolves to this contact.
     * </p>
     * 
     * @param stageIndex
     *        The stage in the escalation plan that resolves to this contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolutionContact withStageIndex(Integer stageIndex) {
        setStageIndex(stageIndex);
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
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStageIndex() != null)
            sb.append("StageIndex: ").append(getStageIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolutionContact == false)
            return false;
        ResolutionContact other = (ResolutionContact) obj;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStageIndex() == null ^ this.getStageIndex() == null)
            return false;
        if (other.getStageIndex() != null && other.getStageIndex().equals(this.getStageIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStageIndex() == null) ? 0 : getStageIndex().hashCode());
        return hashCode;
    }

    @Override
    public ResolutionContact clone() {
        try {
            return (ResolutionContact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ResolutionContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
