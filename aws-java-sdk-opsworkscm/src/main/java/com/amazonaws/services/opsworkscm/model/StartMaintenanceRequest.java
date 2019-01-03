/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/StartMaintenance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMaintenanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * Engine attributes that are specific to the server on which you want to run maintenance.
     * </p>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @param serverName
     *        The name of the server on which to run maintenance.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @return The name of the server on which to run maintenance.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server on which to run maintenance.
     * </p>
     * 
     * @param serverName
     *        The name of the server on which to run maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMaintenanceRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * Engine attributes that are specific to the server on which you want to run maintenance.
     * </p>
     * 
     * @return Engine attributes that are specific to the server on which you want to run maintenance.
     */

    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>
     * Engine attributes that are specific to the server on which you want to run maintenance.
     * </p>
     * 
     * @param engineAttributes
     *        Engine attributes that are specific to the server on which you want to run maintenance.
     */

    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>
     * Engine attributes that are specific to the server on which you want to run maintenance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngineAttributes(java.util.Collection)} or {@link #withEngineAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param engineAttributes
     *        Engine attributes that are specific to the server on which you want to run maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMaintenanceRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (this.engineAttributes == null) {
            setEngineAttributes(new java.util.ArrayList<EngineAttribute>(engineAttributes.length));
        }
        for (EngineAttribute ele : engineAttributes) {
            this.engineAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Engine attributes that are specific to the server on which you want to run maintenance.
     * </p>
     * 
     * @param engineAttributes
     *        Engine attributes that are specific to the server on which you want to run maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMaintenanceRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getEngineAttributes() != null)
            sb.append("EngineAttributes: ").append(getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMaintenanceRequest == false)
            return false;
        StartMaintenanceRequest other = (StartMaintenanceRequest) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null)
            return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StartMaintenanceRequest clone() {
        return (StartMaintenanceRequest) super.clone();
    }

}
