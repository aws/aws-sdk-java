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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for users or groups in your IAM Identity Center identity source. This applies to users and groups
 * with specific permissions that define their level of access to your Amazon Kendra experience. You can create an
 * Amazon Kendra experience such as a search application. For more information on creating a search application
 * experience, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
 * experience with no code</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PersonasSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PersonasSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity
     * source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     * information on these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     */
    private String persona;
    /**
     * <p>
     * The date-time the summary information was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date-time the summary information was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @return The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *         could be an email.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonasSummary withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity
     * source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     * information on these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @param persona
     *        The persona that defines the specific permissions of the user or group in your IAM Identity Center
     *        identity source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>.
     *        For more information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     * @see Persona
     */

    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * <p>
     * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity
     * source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     * information on these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @return The persona that defines the specific permissions of the user or group in your IAM Identity Center
     *         identity source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>.
     *         For more information on these personas, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *         >Providing access to your search page</a>.
     * @see Persona
     */

    public String getPersona() {
        return this.persona;
    }

    /**
     * <p>
     * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity
     * source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     * information on these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @param persona
     *        The persona that defines the specific permissions of the user or group in your IAM Identity Center
     *        identity source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>.
     *        For more information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Persona
     */

    public PersonasSummary withPersona(String persona) {
        setPersona(persona);
        return this;
    }

    /**
     * <p>
     * The persona that defines the specific permissions of the user or group in your IAM Identity Center identity
     * source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     * information on these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @param persona
     *        The persona that defines the specific permissions of the user or group in your IAM Identity Center
     *        identity source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>.
     *        For more information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Persona
     */

    public PersonasSummary withPersona(Persona persona) {
        this.persona = persona.toString();
        return this;
    }

    /**
     * <p>
     * The date-time the summary information was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time the summary information was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date-time the summary information was created.
     * </p>
     * 
     * @return The date-time the summary information was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date-time the summary information was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time the summary information was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonasSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date-time the summary information was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time the summary information was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date-time the summary information was last updated.
     * </p>
     * 
     * @return The date-time the summary information was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date-time the summary information was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time the summary information was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonasSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getPersona() != null)
            sb.append("Persona: ").append(getPersona()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonasSummary == false)
            return false;
        PersonasSummary other = (PersonasSummary) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getPersona() == null ^ this.getPersona() == null)
            return false;
        if (other.getPersona() != null && other.getPersona().equals(this.getPersona()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getPersona() == null) ? 0 : getPersona().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public PersonasSummary clone() {
        try {
            return (PersonasSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.PersonasSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
