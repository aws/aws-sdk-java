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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves the Logs status for the Amazon Security Lake account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeSourceStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeSourceStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @param resource
     *        Defines path the stored logs are available which has information on your systems, applications, and
     *        services.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @return Defines path the stored logs are available which has information on your systems, applications, and
     *         services.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Defines path the stored logs are available which has information on your systems, applications, and services.
     * </p>
     * 
     * @param resource
     *        Defines path the stored logs are available which has information on your systems, applications, and
     *        services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSourceStatus withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param status
     *        The health status of services, including error codes and patterns.
     * @see SourceCollectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @return The health status of services, including error codes and patterns.
     * @see SourceCollectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param status
     *        The health status of services, including error codes and patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCollectionStatus
     */

    public DataLakeSourceStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The health status of services, including error codes and patterns.
     * </p>
     * 
     * @param status
     *        The health status of services, including error codes and patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCollectionStatus
     */

    public DataLakeSourceStatus withStatus(SourceCollectionStatus status) {
        this.status = status.toString();
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeSourceStatus == false)
            return false;
        DataLakeSourceStatus other = (DataLakeSourceStatus) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeSourceStatus clone() {
        try {
            return (DataLakeSourceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeSourceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
