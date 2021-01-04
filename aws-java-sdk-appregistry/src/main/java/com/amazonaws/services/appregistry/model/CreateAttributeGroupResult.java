/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateAttributeGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAttributeGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the attribute group.
     * </p>
     */
    private AttributeGroup attributeGroup;

    /**
     * <p>
     * Information about the attribute group.
     * </p>
     * 
     * @param attributeGroup
     *        Information about the attribute group.
     */

    public void setAttributeGroup(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    /**
     * <p>
     * Information about the attribute group.
     * </p>
     * 
     * @return Information about the attribute group.
     */

    public AttributeGroup getAttributeGroup() {
        return this.attributeGroup;
    }

    /**
     * <p>
     * Information about the attribute group.
     * </p>
     * 
     * @param attributeGroup
     *        Information about the attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttributeGroupResult withAttributeGroup(AttributeGroup attributeGroup) {
        setAttributeGroup(attributeGroup);
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
        if (getAttributeGroup() != null)
            sb.append("AttributeGroup: ").append(getAttributeGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAttributeGroupResult == false)
            return false;
        CreateAttributeGroupResult other = (CreateAttributeGroupResult) obj;
        if (other.getAttributeGroup() == null ^ this.getAttributeGroup() == null)
            return false;
        if (other.getAttributeGroup() != null && other.getAttributeGroup().equals(this.getAttributeGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeGroup() == null) ? 0 : getAttributeGroup().hashCode());
        return hashCode;
    }

    @Override
    public CreateAttributeGroupResult clone() {
        try {
            return (CreateAttributeGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
