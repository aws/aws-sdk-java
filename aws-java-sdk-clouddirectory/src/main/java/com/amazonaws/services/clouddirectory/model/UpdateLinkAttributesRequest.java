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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpdateLinkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLinkAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For
     * more information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     */
    private TypedLinkSpecifier typedLinkSpecifier;
    /**
     * <p>
     * The attributes update structure.
     * </p>
     */
    private java.util.List<LinkAttributeUpdate> attributeUpdates;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For
     * more information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides.
     *        For more information, see <a>arns</a> or <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For
     * more information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link
     *         resides. For more information, see <a>arns</a> or <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For
     * more information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides.
     *        For more information, see <a>arns</a> or <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkAttributesRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     */

    public void setTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        this.typedLinkSpecifier = typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @return Allows a typed link specifier to be accepted as input.
     */

    public TypedLinkSpecifier getTypedLinkSpecifier() {
        return this.typedLinkSpecifier;
    }

    /**
     * <p>
     * Allows a typed link specifier to be accepted as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Allows a typed link specifier to be accepted as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkAttributesRequest withTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        setTypedLinkSpecifier(typedLinkSpecifier);
        return this;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @return The attributes update structure.
     */

    public java.util.List<LinkAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     */

    public void setAttributeUpdates(java.util.Collection<LinkAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<LinkAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkAttributesRequest withAttributeUpdates(LinkAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<LinkAttributeUpdate>(attributeUpdates.length));
        }
        for (LinkAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        The attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkAttributesRequest withAttributeUpdates(java.util.Collection<LinkAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getTypedLinkSpecifier() != null)
            sb.append("TypedLinkSpecifier: ").append(getTypedLinkSpecifier()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLinkAttributesRequest == false)
            return false;
        UpdateLinkAttributesRequest other = (UpdateLinkAttributesRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getTypedLinkSpecifier() == null ^ this.getTypedLinkSpecifier() == null)
            return false;
        if (other.getTypedLinkSpecifier() != null && other.getTypedLinkSpecifier().equals(this.getTypedLinkSpecifier()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getTypedLinkSpecifier() == null) ? 0 : getTypedLinkSpecifier().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLinkAttributesRequest clone() {
        return (UpdateLinkAttributesRequest) super.clone();
    }

}
