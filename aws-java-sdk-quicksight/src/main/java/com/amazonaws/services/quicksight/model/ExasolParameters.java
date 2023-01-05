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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The required parameters for connecting to an Exasol data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ExasolParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExasolParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hostname or IP address of the Exasol data source.
     * </p>
     */
    private String host;
    /**
     * <p>
     * The port for the Exasol data source.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The hostname or IP address of the Exasol data source.
     * </p>
     * 
     * @param host
     *        The hostname or IP address of the Exasol data source.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The hostname or IP address of the Exasol data source.
     * </p>
     * 
     * @return The hostname or IP address of the Exasol data source.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The hostname or IP address of the Exasol data source.
     * </p>
     * 
     * @param host
     *        The hostname or IP address of the Exasol data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExasolParameters withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The port for the Exasol data source.
     * </p>
     * 
     * @param port
     *        The port for the Exasol data source.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port for the Exasol data source.
     * </p>
     * 
     * @return The port for the Exasol data source.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port for the Exasol data source.
     * </p>
     * 
     * @param port
     *        The port for the Exasol data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExasolParameters withPort(Integer port) {
        setPort(port);
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExasolParameters == false)
            return false;
        ExasolParameters other = (ExasolParameters) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public ExasolParameters clone() {
        try {
            return (ExasolParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ExasolParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
