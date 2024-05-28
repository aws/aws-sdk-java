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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The access configuration information for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateAccessConfigRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired authentication mode for the cluster.
     * </p>
     */
    private String authenticationMode;

    /**
     * <p>
     * The desired authentication mode for the cluster.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster.
     * @see AuthenticationMode
     */

    public void setAuthenticationMode(String authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster.
     * </p>
     * 
     * @return The desired authentication mode for the cluster.
     * @see AuthenticationMode
     */

    public String getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMode
     */

    public UpdateAccessConfigRequest withAuthenticationMode(String authenticationMode) {
        setAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * <p>
     * The desired authentication mode for the cluster.
     * </p>
     * 
     * @param authenticationMode
     *        The desired authentication mode for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMode
     */

    public UpdateAccessConfigRequest withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode.toString();
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
        if (getAuthenticationMode() != null)
            sb.append("AuthenticationMode: ").append(getAuthenticationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessConfigRequest == false)
            return false;
        UpdateAccessConfigRequest other = (UpdateAccessConfigRequest) obj;
        if (other.getAuthenticationMode() == null ^ this.getAuthenticationMode() == null)
            return false;
        if (other.getAuthenticationMode() != null && other.getAuthenticationMode().equals(this.getAuthenticationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationMode() == null) ? 0 : getAuthenticationMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccessConfigRequest clone() {
        try {
            return (UpdateAccessConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpdateAccessConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
