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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetLinkAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLinkAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more
     * information, see <a>arns</a> or <a href=
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
     * A list of attribute names whose values will be retrieved.
     * </p>
     */
    private java.util.List<String> attributeNames;
    /**
     * <p>
     * The consistency level at which to retrieve the attributes on a typed link.
     * </p>
     */
    private String consistencyLevel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more
     * information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For
     *        more information, see <a>arns</a> or <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more
     * information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For
     *         more information, see <a>arns</a> or <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more
     * information, see <a>arns</a> or <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For
     *        more information, see <a>arns</a> or <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinkAttributesRequest withDirectoryArn(String directoryArn) {
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

    public GetLinkAttributesRequest withTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        setTypedLinkSpecifier(typedLinkSpecifier);
        return this;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @return A list of attribute names whose values will be retrieved.
     */

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinkAttributesRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute names whose values will be retrieved.
     * </p>
     * 
     * @param attributeNames
     *        A list of attribute names whose values will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLinkAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * The consistency level at which to retrieve the attributes on a typed link.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level at which to retrieve the attributes on a typed link.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * <p>
     * The consistency level at which to retrieve the attributes on a typed link.
     * </p>
     * 
     * @return The consistency level at which to retrieve the attributes on a typed link.
     * @see ConsistencyLevel
     */

    public String getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * <p>
     * The consistency level at which to retrieve the attributes on a typed link.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level at which to retrieve the attributes on a typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public GetLinkAttributesRequest withConsistencyLevel(String consistencyLevel) {
        setConsistencyLevel(consistencyLevel);
        return this;
    }

    /**
     * <p>
     * The consistency level at which to retrieve the attributes on a typed link.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level at which to retrieve the attributes on a typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public GetLinkAttributesRequest withConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel.toString();
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
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames()).append(",");
        if (getConsistencyLevel() != null)
            sb.append("ConsistencyLevel: ").append(getConsistencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLinkAttributesRequest == false)
            return false;
        GetLinkAttributesRequest other = (GetLinkAttributesRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getTypedLinkSpecifier() == null ^ this.getTypedLinkSpecifier() == null)
            return false;
        if (other.getTypedLinkSpecifier() != null && other.getTypedLinkSpecifier().equals(this.getTypedLinkSpecifier()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getConsistencyLevel() == null ^ this.getConsistencyLevel() == null)
            return false;
        if (other.getConsistencyLevel() != null && other.getConsistencyLevel().equals(this.getConsistencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getTypedLinkSpecifier() == null) ? 0 : getTypedLinkSpecifier().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getConsistencyLevel() == null) ? 0 : getConsistencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public GetLinkAttributesRequest clone() {
        return (GetLinkAttributesRequest) super.clone();
    }

}
