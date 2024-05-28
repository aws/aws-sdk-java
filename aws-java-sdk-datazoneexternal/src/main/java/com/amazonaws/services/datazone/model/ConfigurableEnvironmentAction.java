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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurable action of a Amazon DataZone environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ConfigurableEnvironmentAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurableEnvironmentAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication type of a configurable action of a Amazon DataZone environment.
     * </p>
     */
    private String auth;
    /**
     * <p>
     * The parameters of a configurable action in a Amazon DataZone environment.
     * </p>
     */
    private java.util.List<ConfigurableActionParameter> parameters;
    /**
     * <p>
     * The type of a configurable action in a Amazon DataZone environment.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The authentication type of a configurable action of a Amazon DataZone environment.
     * </p>
     * 
     * @param auth
     *        The authentication type of a configurable action of a Amazon DataZone environment.
     * @see ConfigurableActionTypeAuthorization
     */

    public void setAuth(String auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * The authentication type of a configurable action of a Amazon DataZone environment.
     * </p>
     * 
     * @return The authentication type of a configurable action of a Amazon DataZone environment.
     * @see ConfigurableActionTypeAuthorization
     */

    public String getAuth() {
        return this.auth;
    }

    /**
     * <p>
     * The authentication type of a configurable action of a Amazon DataZone environment.
     * </p>
     * 
     * @param auth
     *        The authentication type of a configurable action of a Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurableActionTypeAuthorization
     */

    public ConfigurableEnvironmentAction withAuth(String auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * The authentication type of a configurable action of a Amazon DataZone environment.
     * </p>
     * 
     * @param auth
     *        The authentication type of a configurable action of a Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurableActionTypeAuthorization
     */

    public ConfigurableEnvironmentAction withAuth(ConfigurableActionTypeAuthorization auth) {
        this.auth = auth.toString();
        return this;
    }

    /**
     * <p>
     * The parameters of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @return The parameters of a configurable action in a Amazon DataZone environment.
     */

    public java.util.List<ConfigurableActionParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @param parameters
     *        The parameters of a configurable action in a Amazon DataZone environment.
     */

    public void setParameters(java.util.Collection<ConfigurableActionParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ConfigurableActionParameter>(parameters);
    }

    /**
     * <p>
     * The parameters of a configurable action in a Amazon DataZone environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters of a configurable action in a Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableEnvironmentAction withParameters(ConfigurableActionParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<ConfigurableActionParameter>(parameters.length));
        }
        for (ConfigurableActionParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @param parameters
     *        The parameters of a configurable action in a Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableEnvironmentAction withParameters(java.util.Collection<ConfigurableActionParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The type of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @param type
     *        The type of a configurable action in a Amazon DataZone environment.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @return The type of a configurable action in a Amazon DataZone environment.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a configurable action in a Amazon DataZone environment.
     * </p>
     * 
     * @param type
     *        The type of a configurable action in a Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableEnvironmentAction withType(String type) {
        setType(type);
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
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurableEnvironmentAction == false)
            return false;
        ConfigurableEnvironmentAction other = (ConfigurableEnvironmentAction) obj;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurableEnvironmentAction clone() {
        try {
            return (ConfigurableEnvironmentAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ConfigurableEnvironmentActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
