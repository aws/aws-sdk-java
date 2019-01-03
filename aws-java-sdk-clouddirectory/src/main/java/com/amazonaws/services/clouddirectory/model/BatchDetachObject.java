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
 * Represents the output of a <a>DetachObject</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchDetachObject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetachObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parent reference from which the object with the specified link name is detached.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The name of the link.
     * </p>
     */
    private String linkName;
    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     */
    private String batchReferenceName;

    /**
     * <p>
     * Parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @param parentReference
     *        Parent reference from which the object with the specified link name is detached.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * Parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @return Parent reference from which the object with the specified link name is detached.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * Parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @param parentReference
     *        Parent reference from which the object with the specified link name is detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachObject withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @return The name of the link.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachObject withLinkName(String linkName) {
        setLinkName(linkName);
        return this;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @param batchReferenceName
     *        The batch reference name. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *        >Transaction Support</a> for more information.
     */

    public void setBatchReferenceName(String batchReferenceName) {
        this.batchReferenceName = batchReferenceName;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @return The batch reference name. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *         >Transaction Support</a> for more information.
     */

    public String getBatchReferenceName() {
        return this.batchReferenceName;
    }

    /**
     * <p>
     * The batch reference name. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html">Transaction
     * Support</a> for more information.
     * </p>
     * 
     * @param batchReferenceName
     *        The batch reference name. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/transaction_support.html"
     *        >Transaction Support</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachObject withBatchReferenceName(String batchReferenceName) {
        setBatchReferenceName(batchReferenceName);
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
        if (getParentReference() != null)
            sb.append("ParentReference: ").append(getParentReference()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName()).append(",");
        if (getBatchReferenceName() != null)
            sb.append("BatchReferenceName: ").append(getBatchReferenceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetachObject == false)
            return false;
        BatchDetachObject other = (BatchDetachObject) obj;
        if (other.getParentReference() == null ^ this.getParentReference() == null)
            return false;
        if (other.getParentReference() != null && other.getParentReference().equals(this.getParentReference()) == false)
            return false;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        if (other.getBatchReferenceName() == null ^ this.getBatchReferenceName() == null)
            return false;
        if (other.getBatchReferenceName() != null && other.getBatchReferenceName().equals(this.getBatchReferenceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        hashCode = prime * hashCode + ((getBatchReferenceName() == null) ? 0 : getBatchReferenceName().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetachObject clone() {
        try {
            return (BatchDetachObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchDetachObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
