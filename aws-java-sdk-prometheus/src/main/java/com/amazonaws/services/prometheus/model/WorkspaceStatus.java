/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the status of a workspace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/WorkspaceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status code of this workspace.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * Status code of this workspace.
     * </p>
     * 
     * @param statusCode
     *        Status code of this workspace.
     * @see WorkspaceStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Status code of this workspace.
     * </p>
     * 
     * @return Status code of this workspace.
     * @see WorkspaceStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Status code of this workspace.
     * </p>
     * 
     * @param statusCode
     *        Status code of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceStatusCode
     */

    public WorkspaceStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Status code of this workspace.
     * </p>
     * 
     * @param statusCode
     *        Status code of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceStatusCode
     */

    public WorkspaceStatus withStatusCode(WorkspaceStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceStatus == false)
            return false;
        WorkspaceStatus other = (WorkspaceStatus) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceStatus clone() {
        try {
            return (WorkspaceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.WorkspaceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
