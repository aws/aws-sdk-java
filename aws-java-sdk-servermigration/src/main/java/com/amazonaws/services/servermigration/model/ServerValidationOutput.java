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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains output from validating an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerValidationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerValidationOutput implements Serializable, Cloneable, StructuredPojo {

    private Server server;

    /**
     * @param server
     */

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * @return
     */

    public Server getServer() {
        return this.server;
    }

    /**
     * @param server
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerValidationOutput withServer(Server server) {
        setServer(server);
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerValidationOutput == false)
            return false;
        ServerValidationOutput other = (ServerValidationOutput) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        return hashCode;
    }

    @Override
    public ServerValidationOutput clone() {
        try {
            return (ServerValidationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerValidationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
