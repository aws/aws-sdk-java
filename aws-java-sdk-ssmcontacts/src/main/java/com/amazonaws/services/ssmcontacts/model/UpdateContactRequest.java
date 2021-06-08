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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The full name of the contact or escalation plan.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages for specified contact channels. An escalation plan
     * uses these stages to contact specified contacts.
     * </p>
     */
    private Plan plan;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withContactId(String contactId) {
        setContactId(contactId);
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

    public UpdateContactRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages for specified contact channels. An escalation plan
     * uses these stages to contact specified contacts.
     * </p>
     * 
     * @param plan
     *        A list of stages. A contact has an engagement plan with stages for specified contact channels. An
     *        escalation plan uses these stages to contact specified contacts.
     */

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages for specified contact channels. An escalation plan
     * uses these stages to contact specified contacts.
     * </p>
     * 
     * @return A list of stages. A contact has an engagement plan with stages for specified contact channels. An
     *         escalation plan uses these stages to contact specified contacts.
     */

    public Plan getPlan() {
        return this.plan;
    }

    /**
     * <p>
     * A list of stages. A contact has an engagement plan with stages for specified contact channels. An escalation plan
     * uses these stages to contact specified contacts.
     * </p>
     * 
     * @param plan
     *        A list of stages. A contact has an engagement plan with stages for specified contact channels. An
     *        escalation plan uses these stages to contact specified contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withPlan(Plan plan) {
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
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

        if (obj instanceof UpdateContactRequest == false)
            return false;
        UpdateContactRequest other = (UpdateContactRequest) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
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

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPlan() == null) ? 0 : getPlan().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactRequest clone() {
        return (UpdateContactRequest) super.clone();
    }

}
