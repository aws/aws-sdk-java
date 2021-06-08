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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The access log configuration for a virtual gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayAccessLog" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayAccessLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file object to send virtual gateway access logs to.
     * </p>
     */
    private VirtualGatewayFileAccessLog file;

    /**
     * <p>
     * The file object to send virtual gateway access logs to.
     * </p>
     * 
     * @param file
     *        The file object to send virtual gateway access logs to.
     */

    public void setFile(VirtualGatewayFileAccessLog file) {
        this.file = file;
    }

    /**
     * <p>
     * The file object to send virtual gateway access logs to.
     * </p>
     * 
     * @return The file object to send virtual gateway access logs to.
     */

    public VirtualGatewayFileAccessLog getFile() {
        return this.file;
    }

    /**
     * <p>
     * The file object to send virtual gateway access logs to.
     * </p>
     * 
     * @param file
     *        The file object to send virtual gateway access logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayAccessLog withFile(VirtualGatewayFileAccessLog file) {
        setFile(file);
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
        if (getFile() != null)
            sb.append("File: ").append(getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayAccessLog == false)
            return false;
        VirtualGatewayAccessLog other = (VirtualGatewayAccessLog) obj;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayAccessLog clone() {
        try {
            return (VirtualGatewayAccessLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayAccessLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
