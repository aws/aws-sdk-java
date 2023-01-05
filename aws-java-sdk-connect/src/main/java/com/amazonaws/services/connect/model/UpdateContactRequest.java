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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * your contact center.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The name of the contact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the contact.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * your contact center.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with your contact center.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * your contact center.
     * </p>
     * 
     * @return The identifier of the contact. This is the identifier of the contact associated with the first
     *         interaction with your contact center.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * your contact center.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with your contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @param name
     *        The name of the contact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @return The name of the contact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact.
     * </p>
     * 
     * @param name
     *        The name of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @param description
     *        The description of the contact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @return The description of the contact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the contact.
     * </p>
     * 
     * @param description
     *        The description of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     * </p>
     * 
     * @return Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     */

    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     * </p>
     * 
     * @param references
     *        Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     */

    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     * </p>
     * 
     * @param references
     *        Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest withReferences(java.util.Map<String, Reference> references) {
        setReferences(references);
        return this;
    }

    /**
     * Add a single References entry
     *
     * @see UpdateContactRequest#withReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest addReferencesEntry(String key, Reference value) {
        if (null == this.references) {
            this.references = new java.util.HashMap<String, Reference>();
        }
        if (this.references.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.references.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into References.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactRequest clearReferencesEntries() {
        this.references = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences());
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactRequest clone() {
        return (UpdateContactRequest) super.clone();
    }

}
