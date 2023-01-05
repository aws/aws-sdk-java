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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the field.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Defines the data type, some system constraints, and default display of the field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @param description
     *        The description of the field.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @return The description of the field.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * 
     * @param description
     *        The description of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @return The name of the field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Defines the data type, some system constraints, and default display of the field.
     * </p>
     * 
     * @param type
     *        Defines the data type, some system constraints, and default display of the field.
     * @see FieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Defines the data type, some system constraints, and default display of the field.
     * </p>
     * 
     * @return Defines the data type, some system constraints, and default display of the field.
     * @see FieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Defines the data type, some system constraints, and default display of the field.
     * </p>
     * 
     * @param type
     *        Defines the data type, some system constraints, and default display of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public CreateFieldRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Defines the data type, some system constraints, and default display of the field.
     * </p>
     * 
     * @param type
     *        Defines the data type, some system constraints, and default display of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldType
     */

    public CreateFieldRequest withType(FieldType type) {
        this.type = type.toString();
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldRequest == false)
            return false;
        CreateFieldRequest other = (CreateFieldRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateFieldRequest clone() {
        return (CreateFieldRequest) super.clone();
    }

}
