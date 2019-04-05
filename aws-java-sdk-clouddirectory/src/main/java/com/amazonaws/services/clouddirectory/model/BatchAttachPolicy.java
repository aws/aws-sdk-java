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
 * Attaches a policy object to a regular object inside a <a>BatchRead</a> operation. For more information, see
 * <a>AttachPolicy</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchAttachPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAttachPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference that is associated with the policy object.
     * </p>
     */
    private ObjectReference policyReference;
    /**
     * <p>
     * The reference that identifies the object to which the policy will be attached.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * The reference that is associated with the policy object.
     * </p>
     * 
     * @param policyReference
     *        The reference that is associated with the policy object.
     */

    public void setPolicyReference(ObjectReference policyReference) {
        this.policyReference = policyReference;
    }

    /**
     * <p>
     * The reference that is associated with the policy object.
     * </p>
     * 
     * @return The reference that is associated with the policy object.
     */

    public ObjectReference getPolicyReference() {
        return this.policyReference;
    }

    /**
     * <p>
     * The reference that is associated with the policy object.
     * </p>
     * 
     * @param policyReference
     *        The reference that is associated with the policy object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachPolicy withPolicyReference(ObjectReference policyReference) {
        setPolicyReference(policyReference);
        return this;
    }

    /**
     * <p>
     * The reference that identifies the object to which the policy will be attached.
     * </p>
     * 
     * @param objectReference
     *        The reference that identifies the object to which the policy will be attached.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * The reference that identifies the object to which the policy will be attached.
     * </p>
     * 
     * @return The reference that identifies the object to which the policy will be attached.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * The reference that identifies the object to which the policy will be attached.
     * </p>
     * 
     * @param objectReference
     *        The reference that identifies the object to which the policy will be attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAttachPolicy withObjectReference(ObjectReference objectReference) {
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

        if (obj instanceof BatchAttachPolicy == false)
            return false;
        BatchAttachPolicy other = (BatchAttachPolicy) obj;
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
    public BatchAttachPolicy clone() {
        try {
            return (BatchAttachPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchAttachPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
