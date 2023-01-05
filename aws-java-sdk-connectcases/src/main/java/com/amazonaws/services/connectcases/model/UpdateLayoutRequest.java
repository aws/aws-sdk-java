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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateLayout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLayoutRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and a read-only attribute
     * of the field.
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
     * The unique identifier of the layout.
     * </p>
     */
    private String layoutId;
    /**
     * <p>
     * The name of the layout. It must be unique per domain.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and a read-only attribute
     * of the field.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, the order of the fields, and a read-only
     *        attribute of the field.
     */

    public void setContent(LayoutContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and a read-only attribute
     * of the field.
     * </p>
     * 
     * @return Information about which fields will be present in the layout, the order of the fields, and a read-only
     *         attribute of the field.
     */

    public LayoutContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and a read-only attribute
     * of the field.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, the order of the fields, and a read-only
     *        attribute of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayoutRequest withContent(LayoutContent content) {
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

    public UpdateLayoutRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     */

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @return The unique identifier of the layout.
     */

    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayoutRequest withLayoutId(String layoutId) {
        setLayoutId(layoutId);
        return this;
    }

    /**
     * <p>
     * The name of the layout. It must be unique per domain.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique per domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique per domain.
     * </p>
     * 
     * @return The name of the layout. It must be unique per domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique per domain.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique per domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLayoutRequest withName(String name) {
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
        if (getLayoutId() != null)
            sb.append("LayoutId: ").append(getLayoutId()).append(",");
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

        if (obj instanceof UpdateLayoutRequest == false)
            return false;
        UpdateLayoutRequest other = (UpdateLayoutRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getLayoutId() == null ^ this.getLayoutId() == null)
            return false;
        if (other.getLayoutId() != null && other.getLayoutId().equals(this.getLayoutId()) == false)
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
        hashCode = prime * hashCode + ((getLayoutId() == null) ? 0 : getLayoutId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLayoutRequest clone() {
        return (UpdateLayoutRequest) super.clone();
    }

}
