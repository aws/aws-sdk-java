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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the domain in which the environment is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The identifier of the environment that is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @return The description to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param description
     *        The description to be updated as part of the <code>UpdateEnvironment</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain in which the environment is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the domain in which the environment is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the domain in which the environment is to be updated.
     * </p>
     * 
     * @return The identifier of the domain in which the environment is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the domain in which the environment is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the domain in which the environment is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @return The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p>
     * The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms to be updated as part of the <code>UpdateEnvironment</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the environment that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the environment that is to be updated.
     * </p>
     * 
     * @return The identifier of the environment that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the environment that is to be updated.
     * </p>
     * 
     * @param identifier
     *        The identifier of the environment that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateEnvironment</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateEnvironment</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateEnvironment</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
