/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the permissions an account has within Amazon Inspector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Permission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Permission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operations that can be performed with the given permissions.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The services that the permissions allow an account to perform the given operations for.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The operations that can be performed with the given permissions.
     * </p>
     * 
     * @param operation
     *        The operations that can be performed with the given permissions.
     * @see Operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operations that can be performed with the given permissions.
     * </p>
     * 
     * @return The operations that can be performed with the given permissions.
     * @see Operation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operations that can be performed with the given permissions.
     * </p>
     * 
     * @param operation
     *        The operations that can be performed with the given permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public Permission withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The operations that can be performed with the given permissions.
     * </p>
     * 
     * @param operation
     *        The operations that can be performed with the given permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public Permission withOperation(Operation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The services that the permissions allow an account to perform the given operations for.
     * </p>
     * 
     * @param service
     *        The services that the permissions allow an account to perform the given operations for.
     * @see Service
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The services that the permissions allow an account to perform the given operations for.
     * </p>
     * 
     * @return The services that the permissions allow an account to perform the given operations for.
     * @see Service
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The services that the permissions allow an account to perform the given operations for.
     * </p>
     * 
     * @param service
     *        The services that the permissions allow an account to perform the given operations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public Permission withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The services that the permissions allow an account to perform the given operations for.
     * </p>
     * 
     * @param service
     *        The services that the permissions allow an account to perform the given operations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public Permission withService(Service service) {
        this.service = service.toString();
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Permission == false)
            return false;
        Permission other = (Permission) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public Permission clone() {
        try {
            return (Permission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.PermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
