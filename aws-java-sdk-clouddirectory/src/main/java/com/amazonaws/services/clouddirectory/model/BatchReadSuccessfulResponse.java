/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a <code>BatchRead</code> success response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchReadSuccessfulResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchReadSuccessfulResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists all attributes associated with an object.
     * </p>
     */
    private BatchListObjectAttributesResponse listObjectAttributes;
    /**
     * <p>
     * Returns a paginated list of child objects associated with a given object.
     * </p>
     */
    private BatchListObjectChildrenResponse listObjectChildren;

    /**
     * <p>
     * Lists all attributes associated with an object.
     * </p>
     * 
     * @param listObjectAttributes
     *        Lists all attributes associated with an object.
     */

    public void setListObjectAttributes(BatchListObjectAttributesResponse listObjectAttributes) {
        this.listObjectAttributes = listObjectAttributes;
    }

    /**
     * <p>
     * Lists all attributes associated with an object.
     * </p>
     * 
     * @return Lists all attributes associated with an object.
     */

    public BatchListObjectAttributesResponse getListObjectAttributes() {
        return this.listObjectAttributes;
    }

    /**
     * <p>
     * Lists all attributes associated with an object.
     * </p>
     * 
     * @param listObjectAttributes
     *        Lists all attributes associated with an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadSuccessfulResponse withListObjectAttributes(BatchListObjectAttributesResponse listObjectAttributes) {
        setListObjectAttributes(listObjectAttributes);
        return this;
    }

    /**
     * <p>
     * Returns a paginated list of child objects associated with a given object.
     * </p>
     * 
     * @param listObjectChildren
     *        Returns a paginated list of child objects associated with a given object.
     */

    public void setListObjectChildren(BatchListObjectChildrenResponse listObjectChildren) {
        this.listObjectChildren = listObjectChildren;
    }

    /**
     * <p>
     * Returns a paginated list of child objects associated with a given object.
     * </p>
     * 
     * @return Returns a paginated list of child objects associated with a given object.
     */

    public BatchListObjectChildrenResponse getListObjectChildren() {
        return this.listObjectChildren;
    }

    /**
     * <p>
     * Returns a paginated list of child objects associated with a given object.
     * </p>
     * 
     * @param listObjectChildren
     *        Returns a paginated list of child objects associated with a given object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchReadSuccessfulResponse withListObjectChildren(BatchListObjectChildrenResponse listObjectChildren) {
        setListObjectChildren(listObjectChildren);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getListObjectAttributes() != null)
            sb.append("ListObjectAttributes: ").append(getListObjectAttributes()).append(",");
        if (getListObjectChildren() != null)
            sb.append("ListObjectChildren: ").append(getListObjectChildren());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchReadSuccessfulResponse == false)
            return false;
        BatchReadSuccessfulResponse other = (BatchReadSuccessfulResponse) obj;
        if (other.getListObjectAttributes() == null ^ this.getListObjectAttributes() == null)
            return false;
        if (other.getListObjectAttributes() != null && other.getListObjectAttributes().equals(this.getListObjectAttributes()) == false)
            return false;
        if (other.getListObjectChildren() == null ^ this.getListObjectChildren() == null)
            return false;
        if (other.getListObjectChildren() != null && other.getListObjectChildren().equals(this.getListObjectChildren()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListObjectAttributes() == null) ? 0 : getListObjectAttributes().hashCode());
        hashCode = prime * hashCode + ((getListObjectChildren() == null) ? 0 : getListObjectChildren().hashCode());
        return hashCode;
    }

    @Override
    public BatchReadSuccessfulResponse clone() {
        try {
            return (BatchReadSuccessfulResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchReadSuccessfulResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
