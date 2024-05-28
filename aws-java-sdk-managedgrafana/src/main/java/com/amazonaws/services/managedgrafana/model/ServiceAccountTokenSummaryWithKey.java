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
 * <p>
 * This structure is returned when creating the token. It is important to store the <code>key</code> that is returned,
 * as it is not retrievable at a later time.
 * </p>
 * <p>
 * If you lose the key, you can delete and recreate the token, which will create a new key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ServiceAccountTokenSummaryWithKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAccountTokenSummaryWithKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the service account token.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     * authorize the requests.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The name of the service account token.
     * </p>
     */
    private String name;

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

    public ServiceAccountTokenSummaryWithKey withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     * authorize the requests.
     * </p>
     * 
     * @param key
     *        The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     *        authorize the requests.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     * authorize the requests.
     * </p>
     * 
     * @return The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate
     *         and authorize the requests.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     * authorize the requests.
     * </p>
     * 
     * @param key
     *        The key for the service account token. Used when making calls to the Grafana HTTP APIs to authenticate and
     *        authorize the requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountTokenSummaryWithKey withKey(String key) {
        setKey(key);
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

    public ServiceAccountTokenSummaryWithKey withName(String name) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof ServiceAccountTokenSummaryWithKey == false)
            return false;
        ServiceAccountTokenSummaryWithKey other = (ServiceAccountTokenSummaryWithKey) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceAccountTokenSummaryWithKey clone() {
        try {
            return (ServiceAccountTokenSummaryWithKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.ServiceAccountTokenSummaryWithKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
