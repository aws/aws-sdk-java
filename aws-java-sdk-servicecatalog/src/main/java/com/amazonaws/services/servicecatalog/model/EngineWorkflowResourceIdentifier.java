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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ID for the provisioned product resources that are part of a resource group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/EngineWorkflowResourceIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineWorkflowResourceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique key-value pair for a tag that identifies provisioned product resources.
     * </p>
     */
    private UniqueTagResourceIdentifier uniqueTag;

    /**
     * <p>
     * The unique key-value pair for a tag that identifies provisioned product resources.
     * </p>
     * 
     * @param uniqueTag
     *        The unique key-value pair for a tag that identifies provisioned product resources.
     */

    public void setUniqueTag(UniqueTagResourceIdentifier uniqueTag) {
        this.uniqueTag = uniqueTag;
    }

    /**
     * <p>
     * The unique key-value pair for a tag that identifies provisioned product resources.
     * </p>
     * 
     * @return The unique key-value pair for a tag that identifies provisioned product resources.
     */

    public UniqueTagResourceIdentifier getUniqueTag() {
        return this.uniqueTag;
    }

    /**
     * <p>
     * The unique key-value pair for a tag that identifies provisioned product resources.
     * </p>
     * 
     * @param uniqueTag
     *        The unique key-value pair for a tag that identifies provisioned product resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineWorkflowResourceIdentifier withUniqueTag(UniqueTagResourceIdentifier uniqueTag) {
        setUniqueTag(uniqueTag);
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
        if (getUniqueTag() != null)
            sb.append("UniqueTag: ").append(getUniqueTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineWorkflowResourceIdentifier == false)
            return false;
        EngineWorkflowResourceIdentifier other = (EngineWorkflowResourceIdentifier) obj;
        if (other.getUniqueTag() == null ^ this.getUniqueTag() == null)
            return false;
        if (other.getUniqueTag() != null && other.getUniqueTag().equals(this.getUniqueTag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUniqueTag() == null) ? 0 : getUniqueTag().hashCode());
        return hashCode;
    }

    @Override
    public EngineWorkflowResourceIdentifier clone() {
        try {
            return (EngineWorkflowResourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.EngineWorkflowResourceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
