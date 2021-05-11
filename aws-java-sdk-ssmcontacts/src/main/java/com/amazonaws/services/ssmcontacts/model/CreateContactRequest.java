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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     * identifiable.
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
     * To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     * </p>
     */
    private Plan plan;
    /**
     * <p>
     * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     * identifiable.
     * </p>
     * 
     * @param alias
     *        The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     *        identifiable.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     * identifiable.
     * </p>
     * 
     * @return The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     *         identifiable.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     * identifiable.
     * </p>
     * 
     * @param alias
     *        The short name to quickly identify a contact or escalation plan. The contact alias must be unique and
     *        identifiable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withAlias(String alias) {
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

    public CreateContactRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * </p>
     * 
     * @param type
     *        To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * @see ContactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * </p>
     * 
     * @return To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * @see ContactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * </p>
     * 
     * @param type
     *        To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public CreateContactRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * </p>
     * 
     * @param type
     *        To create an escalation plan use <code>ESCALATION</code>. To create a contact use <code>PERSONAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public CreateContactRequest withType(ContactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     * </p>
     * 
     * @param plan
     *        A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     *        escalation plan uses stages that contact specified contacts.
     */

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     * </p>
     * 
     * @return A list of stages. A contact has an engagement plan with stages that contact specified contact channels.
     *         An escalation plan uses stages that contact specified contacts.
     */

    public Plan getPlan() {
        return this.plan;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     * escalation plan uses stages that contact specified contacts.
     * </p>
     * 
     * @param plan
     *        A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An
     *        escalation plan uses stages that contact specified contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withPlan(Plan plan) {
        setPlan(plan);
        return this;
    }

    /**
     * <p>
     * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * </p>
     * 
     * @return Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * </p>
     * 
     * @param tags
     *        Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * </p>
     * 
     * @param tags
     *        Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPlan() != null)
            sb.append("Plan: ").append(getPlan()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactRequest == false)
            return false;
        CreateContactRequest other = (CreateContactRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPlan() == null) ? 0 : getPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactRequest clone() {
        return (CreateContactRequest) super.clone();
    }

}
