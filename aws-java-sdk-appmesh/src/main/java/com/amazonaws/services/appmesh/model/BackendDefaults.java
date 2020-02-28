/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the default properties for a backend.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/BackendDefaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendDefaults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents a client policy.
     * </p>
     */
    private ClientPolicy clientPolicy;

    /**
     * <p>
     * A reference to an object that represents a client policy.
     * </p>
     * 
     * @param clientPolicy
     *        A reference to an object that represents a client policy.
     */

    public void setClientPolicy(ClientPolicy clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    /**
     * <p>
     * A reference to an object that represents a client policy.
     * </p>
     * 
     * @return A reference to an object that represents a client policy.
     */

    public ClientPolicy getClientPolicy() {
        return this.clientPolicy;
    }

    /**
     * <p>
     * A reference to an object that represents a client policy.
     * </p>
     * 
     * @param clientPolicy
     *        A reference to an object that represents a client policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendDefaults withClientPolicy(ClientPolicy clientPolicy) {
        setClientPolicy(clientPolicy);
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
        if (getClientPolicy() != null)
            sb.append("ClientPolicy: ").append(getClientPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendDefaults == false)
            return false;
        BackendDefaults other = (BackendDefaults) obj;
        if (other.getClientPolicy() == null ^ this.getClientPolicy() == null)
            return false;
        if (other.getClientPolicy() != null && other.getClientPolicy().equals(this.getClientPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientPolicy() == null) ? 0 : getClientPolicy().hashCode());
        return hashCode;
    }

    @Override
    public BackendDefaults clone() {
        try {
            return (BackendDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.BackendDefaultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
