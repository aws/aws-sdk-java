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
 * Detaches the specified policy from the specified directory inside a <a>BatchWrite</a> operation. For more
 * information, see <a>DetachPolicy</a> and <a>BatchWriteRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchDetachPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetachPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reference that identifies the policy object.
     * </p>
     */
    private ObjectReference policyReference;
    /**
     * <p>
     * Reference that identifies the object whose policy object will be detached.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * Reference that identifies the policy object.
     * </p>
     * 
     * @param policyReference
     *        Reference that identifies the policy object.
     */

    public void setPolicyReference(ObjectReference policyReference) {
        this.policyReference = policyReference;
    }

    /**
     * <p>
     * Reference that identifies the policy object.
     * </p>
     * 
     * @return Reference that identifies the policy object.
     */

    public ObjectReference getPolicyReference() {
        return this.policyReference;
    }

    /**
     * <p>
     * Reference that identifies the policy object.
     * </p>
     * 
     * @param policyReference
     *        Reference that identifies the policy object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachPolicy withPolicyReference(ObjectReference policyReference) {
        setPolicyReference(policyReference);
        return this;
    }

    /**
     * <p>
     * Reference that identifies the object whose policy object will be detached.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object whose policy object will be detached.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object whose policy object will be detached.
     * </p>
     * 
     * @return Reference that identifies the object whose policy object will be detached.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object whose policy object will be detached.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object whose policy object will be detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachPolicy withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
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
        if (getPolicyReference() != null)
            sb.append("PolicyReference: ").append(getPolicyReference()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetachPolicy == false)
            return false;
        BatchDetachPolicy other = (BatchDetachPolicy) obj;
        if (other.getPolicyReference() == null ^ this.getPolicyReference() == null)
            return false;
        if (other.getPolicyReference() != null && other.getPolicyReference().equals(this.getPolicyReference()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyReference() == null) ? 0 : getPolicyReference().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetachPolicy clone() {
        try {
            return (BatchDetachPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchDetachPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
