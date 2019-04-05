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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/ExportServerEngineAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportServerEngineAttributeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested engine attribute pair with attribute name and value.
     * </p>
     */
    private EngineAttribute engineAttribute;
    /**
     * <p>
     * The server name used in the request.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The requested engine attribute pair with attribute name and value.
     * </p>
     * 
     * @param engineAttribute
     *        The requested engine attribute pair with attribute name and value.
     */

    public void setEngineAttribute(EngineAttribute engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    /**
     * <p>
     * The requested engine attribute pair with attribute name and value.
     * </p>
     * 
     * @return The requested engine attribute pair with attribute name and value.
     */

    public EngineAttribute getEngineAttribute() {
        return this.engineAttribute;
    }

    /**
     * <p>
     * The requested engine attribute pair with attribute name and value.
     * </p>
     * 
     * @param engineAttribute
     *        The requested engine attribute pair with attribute name and value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeResult withEngineAttribute(EngineAttribute engineAttribute) {
        setEngineAttribute(engineAttribute);
        return this;
    }

    /**
     * <p>
     * The server name used in the request.
     * </p>
     * 
     * @param serverName
     *        The server name used in the request.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The server name used in the request.
     * </p>
     * 
     * @return The server name used in the request.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The server name used in the request.
     * </p>
     * 
     * @param serverName
     *        The server name used in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeResult withServerName(String serverName) {
        setServerName(serverName);
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
        if (getEngineAttribute() != null)
            sb.append("EngineAttribute: ").append(getEngineAttribute()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerEngineAttributeResult == false)
            return false;
        ExportServerEngineAttributeResult other = (ExportServerEngineAttributeResult) obj;
        if (other.getEngineAttribute() == null ^ this.getEngineAttribute() == null)
            return false;
        if (other.getEngineAttribute() != null && other.getEngineAttribute().equals(this.getEngineAttribute()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineAttribute() == null) ? 0 : getEngineAttribute().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public ExportServerEngineAttributeResult clone() {
        try {
            return (ExportServerEngineAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
