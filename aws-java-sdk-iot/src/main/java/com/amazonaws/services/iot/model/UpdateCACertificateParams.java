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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCACertificateParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that you want to apply to the CA cerrtificate. The only supported value is <code>DEACTIVATE</code>.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The action that you want to apply to the CA cerrtificate. The only supported value is <code>DEACTIVATE</code>.
     * </p>
     * 
     * @param action
     *        The action that you want to apply to the CA cerrtificate. The only supported value is
     *        <code>DEACTIVATE</code>.
     * @see CACertificateUpdateAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that you want to apply to the CA cerrtificate. The only supported value is <code>DEACTIVATE</code>.
     * </p>
     * 
     * @return The action that you want to apply to the CA cerrtificate. The only supported value is
     *         <code>DEACTIVATE</code>.
     * @see CACertificateUpdateAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that you want to apply to the CA cerrtificate. The only supported value is <code>DEACTIVATE</code>.
     * </p>
     * 
     * @param action
     *        The action that you want to apply to the CA cerrtificate. The only supported value is
     *        <code>DEACTIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CACertificateUpdateAction
     */

    public UpdateCACertificateParams withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that you want to apply to the CA cerrtificate. The only supported value is <code>DEACTIVATE</code>.
     * </p>
     * 
     * @param action
     *        The action that you want to apply to the CA cerrtificate. The only supported value is
     *        <code>DEACTIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CACertificateUpdateAction
     */

    public UpdateCACertificateParams withAction(CACertificateUpdateAction action) {
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

        if (obj instanceof UpdateCACertificateParams == false)
            return false;
        UpdateCACertificateParams other = (UpdateCACertificateParams) obj;
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCACertificateParams clone() {
        try {
            return (UpdateCACertificateParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.UpdateCACertificateParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
