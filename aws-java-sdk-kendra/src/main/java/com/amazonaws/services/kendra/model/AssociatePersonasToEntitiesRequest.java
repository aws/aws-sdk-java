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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AssociatePersonasToEntities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatePersonasToEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source.
     * The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more information on
     * these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     */
    private java.util.List<EntityPersonaConfiguration> personas;

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of your Amazon Kendra experience.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePersonasToEntitiesRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePersonasToEntitiesRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source.
     * The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more information on
     * these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @return The personas that define the specific permissions of users or groups in your IAM Identity Center identity
     *         source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     *         information on these personas, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *         >Providing access to your search page</a>.
     */

    public java.util.List<EntityPersonaConfiguration> getPersonas() {
        return personas;
    }

    /**
     * <p>
     * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source.
     * The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more information on
     * these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @param personas
     *        The personas that define the specific permissions of users or groups in your IAM Identity Center identity
     *        source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     *        information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     */

    public void setPersonas(java.util.Collection<EntityPersonaConfiguration> personas) {
        if (personas == null) {
            this.personas = null;
            return;
        }

        this.personas = new java.util.ArrayList<EntityPersonaConfiguration>(personas);
    }

    /**
     * <p>
     * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source.
     * The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more information on
     * these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersonas(java.util.Collection)} or {@link #withPersonas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param personas
     *        The personas that define the specific permissions of users or groups in your IAM Identity Center identity
     *        source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     *        information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePersonasToEntitiesRequest withPersonas(EntityPersonaConfiguration... personas) {
        if (this.personas == null) {
            setPersonas(new java.util.ArrayList<EntityPersonaConfiguration>(personas.length));
        }
        for (EntityPersonaConfiguration ele : personas) {
            this.personas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The personas that define the specific permissions of users or groups in your IAM Identity Center identity source.
     * The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more information on
     * these personas, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     * >Providing access to your search page</a>.
     * </p>
     * 
     * @param personas
     *        The personas that define the specific permissions of users or groups in your IAM Identity Center identity
     *        source. The available personas or access roles are <code>Owner</code> and <code>Viewer</code>. For more
     *        information on these personas, see <a href=
     *        "https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html#access-search-experience"
     *        >Providing access to your search page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatePersonasToEntitiesRequest withPersonas(java.util.Collection<EntityPersonaConfiguration> personas) {
        setPersonas(personas);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getPersonas() != null)
            sb.append("Personas: ").append(getPersonas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatePersonasToEntitiesRequest == false)
            return false;
        AssociatePersonasToEntitiesRequest other = (AssociatePersonasToEntitiesRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getPersonas() == null ^ this.getPersonas() == null)
            return false;
        if (other.getPersonas() != null && other.getPersonas().equals(this.getPersonas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getPersonas() == null) ? 0 : getPersonas().hashCode());
        return hashCode;
    }

    @Override
    public AssociatePersonasToEntitiesRequest clone() {
        return (AssociatePersonasToEntitiesRequest) super.clone();
    }

}
