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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information used to update an attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/FacetAttributeUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttributeUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute to update.
     * </p>
     */
    private FacetAttribute attribute;
    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The attribute to update.
     * </p>
     * 
     * @param attribute
     *        The attribute to update.
     */

    public void setAttribute(FacetAttribute attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute to update.
     * </p>
     * 
     * @return The attribute to update.
     */

    public FacetAttribute getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute to update.
     * </p>
     * 
     * @param attribute
     *        The attribute to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeUpdate withAttribute(FacetAttribute attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     * 
     * @param action
     *        The action to perform when updating the attribute.
     * @see UpdateActionType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     * 
     * @return The action to perform when updating the attribute.
     * @see UpdateActionType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     * 
     * @param action
     *        The action to perform when updating the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public FacetAttributeUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     * 
     * @param action
     *        The action to perform when updating the attribute.
     * @see UpdateActionType
     */

    public void setAction(UpdateActionType action) {
        withAction(action);
    }

    /**
     * <p>
     * The action to perform when updating the attribute.
     * </p>
     * 
     * @param action
     *        The action to perform when updating the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionType
     */

    public FacetAttributeUpdate withAction(UpdateActionType action) {
        this.action = action.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetAttributeUpdate == false)
            return false;
        FacetAttributeUpdate other = (FacetAttributeUpdate) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public FacetAttributeUpdate clone() {
        try {
            return (FacetAttributeUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.FacetAttributeUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
