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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information about a service account token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ServiceAccountTokenSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAccountTokenSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the service account token was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * When the service account token will expire.
     * </p>
     */
    private java.util.Date expiresAt;
    /**
     * <p>
     * The unique ID of the service account token.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The last time the token was used to authorize a Grafana HTTP API.
     * </p>
     */
    private java.util.Date lastUsedAt;
    /**
     * <p>
     * The name of the service account token.
     * </p>
     */
    private String name;

    /**
     * <p>
     * When the service account token was created.
     * </p>
     * 
     * @param createdAt
     *        When the service account token was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the service account token was created.
     * </p>
     * 
     * @return When the service account token was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the service account token was created.
     * </p>
     * 
     * @param createdAt
     *        When the service account token was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * When the service account token will expire.
     * </p>
     * 
     * @param expiresAt
     *        When the service account token will expire.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * When the service account token will expire.
     * </p>
     * 
     * @return When the service account token will expire.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * When the service account token will expire.
     * </p>
     * 
     * @param expiresAt
     *        When the service account token will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummary withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
        return this;
    }

    /**
     * <p>
     * The unique ID of the service account token.
     * </p>
     * 
     * @param id
     *        The unique ID of the service account token.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the service account token.
     * </p>
     * 
     * @return The unique ID of the service account token.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the service account token.
     * </p>
     * 
     * @param id
     *        The unique ID of the service account token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The last time the token was used to authorize a Grafana HTTP API.
     * </p>
     * 
     * @param lastUsedAt
     *        The last time the token was used to authorize a Grafana HTTP API.
     */

    public void setLastUsedAt(java.util.Date lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    /**
     * <p>
     * The last time the token was used to authorize a Grafana HTTP API.
     * </p>
     * 
     * @return The last time the token was used to authorize a Grafana HTTP API.
     */

    public java.util.Date getLastUsedAt() {
        return this.lastUsedAt;
    }

    /**
     * <p>
     * The last time the token was used to authorize a Grafana HTTP API.
     * </p>
     * 
     * @param lastUsedAt
     *        The last time the token was used to authorize a Grafana HTTP API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummary withLastUsedAt(java.util.Date lastUsedAt) {
        setLastUsedAt(lastUsedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service account token.
     * </p>
     * 
     * @param name
     *        The name of the service account token.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service account token.
     * </p>
     * 
     * @return The name of the service account token.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service account token.
     * </p>
     * 
     * @param name
     *        The name of the service account token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummary withName(String name) {
        setName(name);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUsedAt() != null)
            sb.append("LastUsedAt: ").append(getLastUsedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceAccountTokenSummary == false)
            return false;
        ServiceAccountTokenSummary other = (ServiceAccountTokenSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUsedAt() == null ^ this.getLastUsedAt() == null)
            return false;
        if (other.getLastUsedAt() != null && other.getLastUsedAt().equals(this.getLastUsedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUsedAt() == null) ? 0 : getLastUsedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceAccountTokenSummary clone() {
        try {
            return (ServiceAccountTokenSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.ServiceAccountTokenSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
