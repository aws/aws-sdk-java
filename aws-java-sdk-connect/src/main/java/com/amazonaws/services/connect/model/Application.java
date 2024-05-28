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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * A third-party application's metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     * supported.
     * </p>
     */
    private java.util.List<String> applicationPermissions;

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * 
     * @param namespace
     *        Namespace of the application that you want to give access to.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * 
     * @return Namespace of the application that you want to give access to.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * 
     * @param namespace
     *        Namespace of the application that you want to give access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     * supported.
     * </p>
     * 
     * @return The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     *         supported.
     */

    public java.util.List<String> getApplicationPermissions() {
        return applicationPermissions;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     * supported.
     * </p>
     * 
     * @param applicationPermissions
     *        The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     *        supported.
     */

    public void setApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        if (applicationPermissions == null) {
            this.applicationPermissions = null;
            return;
        }

        this.applicationPermissions = new java.util.ArrayList<String>(applicationPermissions);
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     * supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationPermissions(java.util.Collection)} or
     * {@link #withApplicationPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationPermissions
     *        The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationPermissions(String... applicationPermissions) {
        if (this.applicationPermissions == null) {
            setApplicationPermissions(new java.util.ArrayList<String>(applicationPermissions.length));
        }
        for (String ele : applicationPermissions) {
            this.applicationPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     * supported.
     * </p>
     * 
     * @param applicationPermissions
     *        The permissions that the agent is granted on the application. Only the <code>ACCESS</code> permission is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        setApplicationPermissions(applicationPermissions);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getApplicationPermissions() != null)
            sb.append("ApplicationPermissions: ").append(getApplicationPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getApplicationPermissions() == null ^ this.getApplicationPermissions() == null)
            return false;
        if (other.getApplicationPermissions() != null && other.getApplicationPermissions().equals(this.getApplicationPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getApplicationPermissions() == null) ? 0 : getApplicationPermissions().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
