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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for document attributes. Document attributes are metadata or fields associated with your
 * documents. For example, the company department name associated with each document.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes.html">Understanding document
 * attributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentAttributeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentAttributeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the document attribute.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of document attribute.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about whether the document attribute can be used by an end user to search for information on their
     * web experience.
     * </p>
     */
    private String search;

    /**
     * <p>
     * The name of the document attribute.
     * </p>
     * 
     * @param name
     *        The name of the document attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document attribute.
     * </p>
     * 
     * @return The name of the document attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document attribute.
     * </p>
     * 
     * @param name
     *        The name of the document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentAttributeConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of document attribute.
     * </p>
     * 
     * @param type
     *        The type of document attribute.
     * @see AttributeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document attribute.
     * </p>
     * 
     * @return The type of document attribute.
     * @see AttributeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of document attribute.
     * </p>
     * 
     * @param type
     *        The type of document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public DocumentAttributeConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of document attribute.
     * </p>
     * 
     * @param type
     *        The type of document attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeType
     */

    public DocumentAttributeConfiguration withType(AttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about whether the document attribute can be used by an end user to search for information on their
     * web experience.
     * </p>
     * 
     * @param search
     *        Information about whether the document attribute can be used by an end user to search for information on
     *        their web experience.
     * @see Status
     */

    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * <p>
     * Information about whether the document attribute can be used by an end user to search for information on their
     * web experience.
     * </p>
     * 
     * @return Information about whether the document attribute can be used by an end user to search for information on
     *         their web experience.
     * @see Status
     */

    public String getSearch() {
        return this.search;
    }

    /**
     * <p>
     * Information about whether the document attribute can be used by an end user to search for information on their
     * web experience.
     * </p>
     * 
     * @param search
     *        Information about whether the document attribute can be used by an end user to search for information on
     *        their web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DocumentAttributeConfiguration withSearch(String search) {
        setSearch(search);
        return this;
    }

    /**
     * <p>
     * Information about whether the document attribute can be used by an end user to search for information on their
     * web experience.
     * </p>
     * 
     * @param search
     *        Information about whether the document attribute can be used by an end user to search for information on
     *        their web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DocumentAttributeConfiguration withSearch(Status search) {
        this.search = search.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSearch() != null)
            sb.append("Search: ").append(getSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeConfiguration == false)
            return false;
        DocumentAttributeConfiguration other = (DocumentAttributeConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSearch() == null ^ this.getSearch() == null)
            return false;
        if (other.getSearch() != null && other.getSearch().equals(this.getSearch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSearch() == null) ? 0 : getSearch().hashCode());
        return hashCode;
    }

    @Override
    public DocumentAttributeConfiguration clone() {
        try {
            return (DocumentAttributeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentAttributeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
