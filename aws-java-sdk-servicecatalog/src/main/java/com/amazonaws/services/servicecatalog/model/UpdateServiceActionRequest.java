/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateServiceAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The self-service action name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     */
    private java.util.Map<String, String> definition;
    /**
     * <p>
     * The self-service action description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @param id
     *        The self-service action identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @return The self-service action identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * 
     * @param id
     *        The self-service action identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @return The self-service action name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * 
     * @param name
     *        The self-service action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     * 
     * @return A map that defines the self-service action.
     */

    public java.util.Map<String, String> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     * 
     * @param definition
     *        A map that defines the self-service action.
     */

    public void setDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     * 
     * @param definition
     *        A map that defines the self-service action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest withDefinition(java.util.Map<String, String> definition) {
        setDefinition(definition);
        return this;
    }

    public UpdateServiceActionRequest addDefinitionEntry(String key, String value) {
        if (null == this.definition) {
            this.definition = new java.util.HashMap<String, String>();
        }
        if (this.definition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.definition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Definition.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest clearDefinitionEntries() {
        this.definition = null;
        return this;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @return The self-service action description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * 
     * @param description
     *        The self-service action description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceActionRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceActionRequest == false)
            return false;
        UpdateServiceActionRequest other = (UpdateServiceActionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceActionRequest clone() {
        return (UpdateServiceActionRequest) super.clone();
    }

}
