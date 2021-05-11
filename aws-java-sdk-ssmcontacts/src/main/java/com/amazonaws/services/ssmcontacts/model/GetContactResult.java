/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the contact or escalation plan.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The alias of the contact or escalation plan. The alias is unique and identifiable.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The full name of the contact or escalation plan.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     * </p>
     */
    private Plan plan;

    /**
     * <p>
     * The ARN of the contact or escalation plan.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact or escalation plan.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact or escalation plan.
     * </p>
     * 
     * @return The ARN of the contact or escalation plan.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the contact or escalation plan.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact or escalation plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * The alias of the contact or escalation plan. The alias is unique and identifiable.
     * </p>
     * 
     * @param alias
     *        The alias of the contact or escalation plan. The alias is unique and identifiable.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias of the contact or escalation plan. The alias is unique and identifiable.
     * </p>
     * 
     * @return The alias of the contact or escalation plan. The alias is unique and identifiable.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias of the contact or escalation plan. The alias is unique and identifiable.
     * </p>
     * 
     * @param alias
     *        The alias of the contact or escalation plan. The alias is unique and identifiable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The full name of the contact or escalation plan.
     * </p>
     * 
     * @param displayName
     *        The full name of the contact or escalation plan.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The full name of the contact or escalation plan.
     * </p>
     * 
     * @return The full name of the contact or escalation plan.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The full name of the contact or escalation plan.
     * </p>
     * 
     * @param displayName
     *        The full name of the contact or escalation plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * @see ContactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * </p>
     * 
     * @return The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * @see ContactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public GetContactResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * </p>
     * 
     * @param type
     *        The type of contact, either <code>PERSONAL</code> or <code>ESCALATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public GetContactResult withType(ContactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     * </p>
     * 
     * @param plan
     *        Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     */

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * <p>
     * Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     * </p>
     * 
     * @return Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     */

    public Plan getPlan() {
        return this.plan;
    }

    /**
     * <p>
     * Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     * </p>
     * 
     * @param plan
     *        Details about the specific timing or stages and targets of the escalation plan or engagement plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withPlan(Plan plan) {
        setPlan(plan);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPlan() != null)
            sb.append("Plan: ").append(getPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactResult == false)
            return false;
        GetContactResult other = (GetContactResult) obj;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPlan() == null ^ this.getPlan() == null)
            return false;
        if (other.getPlan() != null && other.getPlan().equals(this.getPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPlan() == null) ? 0 : getPlan().hashCode());
        return hashCode;
    }

    @Override
    public GetContactResult clone() {
        try {
            return (GetContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
