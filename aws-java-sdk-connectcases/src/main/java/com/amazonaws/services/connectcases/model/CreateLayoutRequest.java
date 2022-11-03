/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLayoutRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about which fields will be present in the layout, and information about the order of the fields.
     * </p>
     */
    private LayoutContent content;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the layout. It must be unique for the Cases domain.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Information about which fields will be present in the layout, and information about the order of the fields.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, and information about the order of the
     *        fields.
     */

    public void setContent(LayoutContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, and information about the order of the fields.
     * </p>
     * 
     * @return Information about which fields will be present in the layout, and information about the order of the
     *         fields.
     */

    public LayoutContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, and information about the order of the fields.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, and information about the order of the
     *        fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLayoutRequest withContent(LayoutContent content) {
        setContent(content);
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

    public CreateLayoutRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the layout. It must be unique for the Cases domain.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique for the Cases domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique for the Cases domain.
     * </p>
     * 
     * @return The name of the layout. It must be unique for the Cases domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique for the Cases domain.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique for the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLayoutRequest withName(String name) {
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
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

        if (obj instanceof CreateLayoutRequest == false)
            return false;
        CreateLayoutRequest other = (CreateLayoutRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
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

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateLayoutRequest clone() {
        return (CreateLayoutRequest) super.clone();
    }

}
