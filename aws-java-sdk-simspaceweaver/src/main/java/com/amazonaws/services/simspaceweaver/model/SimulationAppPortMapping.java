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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of TCP/UDP ports for a custom or service app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/SimulationAppPortMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationAppPortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the app
     * starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients connect to
     * the app using the app's IP address and the <code>Actual</code> port number.
     * </p>
     */
    private Integer actual;
    /**
     * <p>
     * The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     * <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     * <code>Declared</code> port.
     * </p>
     */
    private Integer declared;

    /**
     * <p>
     * The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the app
     * starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients connect to
     * the app using the app's IP address and the <code>Actual</code> port number.
     * </p>
     * 
     * @param actual
     *        The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the
     *        app starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients
     *        connect to the app using the app's IP address and the <code>Actual</code> port number.
     */

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    /**
     * <p>
     * The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the app
     * starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients connect to
     * the app using the app's IP address and the <code>Actual</code> port number.
     * </p>
     * 
     * @return The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the
     *         app starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients
     *         connect to the app using the app's IP address and the <code>Actual</code> port number.
     */

    public Integer getActual() {
        return this.actual;
    }

    /**
     * <p>
     * The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the app
     * starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients connect to
     * the app using the app's IP address and the <code>Actual</code> port number.
     * </p>
     * 
     * @param actual
     *        The TCP/UDP port number of the running app. SimSpace Weaver dynamically assigns this port number when the
     *        app starts. SimSpace Weaver maps the <code>Declared</code> port to the <code>Actual</code> port. Clients
     *        connect to the app using the app's IP address and the <code>Actual</code> port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppPortMapping withActual(Integer actual) {
        setActual(actual);
        return this;
    }

    /**
     * <p>
     * The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     * <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     * <code>Declared</code> port.
     * </p>
     * 
     * @param declared
     *        The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     *        <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     *        <code>Declared</code> port.
     */

    public void setDeclared(Integer declared) {
        this.declared = declared;
    }

    /**
     * <p>
     * The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     * <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     * <code>Declared</code> port.
     * </p>
     * 
     * @return The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     *         <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to
     *         the <code>Declared</code> port.
     */

    public Integer getDeclared() {
        return this.declared;
    }

    /**
     * <p>
     * The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     * <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     * <code>Declared</code> port.
     * </p>
     * 
     * @param declared
     *        The TCP/UDP port number of the app, declared in the simulation schema. SimSpace Weaver maps the
     *        <code>Declared</code> port to the <code>Actual</code> port. The source code for the app should bind to the
     *        <code>Declared</code> port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppPortMapping withDeclared(Integer declared) {
        setDeclared(declared);
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
        if (getActual() != null)
            sb.append("Actual: ").append(getActual()).append(",");
        if (getDeclared() != null)
            sb.append("Declared: ").append(getDeclared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationAppPortMapping == false)
            return false;
        SimulationAppPortMapping other = (SimulationAppPortMapping) obj;
        if (other.getActual() == null ^ this.getActual() == null)
            return false;
        if (other.getActual() != null && other.getActual().equals(this.getActual()) == false)
            return false;
        if (other.getDeclared() == null ^ this.getDeclared() == null)
            return false;
        if (other.getDeclared() != null && other.getDeclared().equals(this.getDeclared()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActual() == null) ? 0 : getActual().hashCode());
        hashCode = prime * hashCode + ((getDeclared() == null) ? 0 : getDeclared().hashCode());
        return hashCode;
    }

    @Override
    public SimulationAppPortMapping clone() {
        try {
            return (SimulationAppPortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.SimulationAppPortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
