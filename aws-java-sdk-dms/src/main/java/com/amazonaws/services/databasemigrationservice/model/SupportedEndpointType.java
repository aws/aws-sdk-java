/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class SupportedEndpointType implements Serializable, Cloneable {

    /**
     * <p>
     * The database engine name.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     */
    private Boolean supportsCDC;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @param engineName
     *        The database engine name.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @return The database engine name.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The database engine name.
     * </p>
     * 
     * @param engineName
     *        The database engine name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if Change Data Capture (CDC) is supported.
     */

    public void setSupportsCDC(Boolean supportsCDC) {
        this.supportsCDC = supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if Change Data Capture (CDC) is supported.
     */

    public Boolean getSupportsCDC() {
        return this.supportsCDC;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @param supportsCDC
     *        Indicates if Change Data Capture (CDC) is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedEndpointType withSupportsCDC(Boolean supportsCDC) {
        setSupportsCDC(supportsCDC);
        return this;
    }

    /**
     * <p>
     * Indicates if Change Data Capture (CDC) is supported.
     * </p>
     * 
     * @return Indicates if Change Data Capture (CDC) is supported.
     */

    public Boolean isSupportsCDC() {
        return this.supportsCDC;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public SupportedEndpointType withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public SupportedEndpointType withEndpointType(ReplicationEndpointTypeValue endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEngineName() != null)
            sb.append("EngineName: " + getEngineName() + ",");
        if (getSupportsCDC() != null)
            sb.append("SupportsCDC: " + getSupportsCDC() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedEndpointType == false)
            return false;
        SupportedEndpointType other = (SupportedEndpointType) obj;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getSupportsCDC() == null ^ this.getSupportsCDC() == null)
            return false;
        if (other.getSupportsCDC() != null && other.getSupportsCDC().equals(this.getSupportsCDC()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getSupportsCDC() == null) ? 0 : getSupportsCDC().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        return hashCode;
    }

    @Override
    public SupportedEndpointType clone() {
        try {
            return (SupportedEndpointType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
