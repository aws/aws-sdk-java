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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A key-value pair you set that identifies a property of the authenticating instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/InstanceProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     */
    private Boolean failed;
    /**
     * <p>
     * A list of instanceProperty objects.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     */
    private java.util.Date seenAt;

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @param failed
     *        Indicates whether the <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation was successful.
     */

    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @return Indicates whether the <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation was successful.
     */

    public Boolean getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @param failed
     *        Indicates whether the <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation was successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withFailed(Boolean failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation was successful.
     * </p>
     * 
     * @return Indicates whether the <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation was successful.
     */

    public Boolean isFailed() {
        return this.failed;
    }

    /**
     * <p>
     * A list of instanceProperty objects.
     * </p>
     * 
     * @return A list of instanceProperty objects.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of instanceProperty objects.
     * </p>
     * 
     * @param properties
     *        A list of instanceProperty objects.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of instanceProperty objects.
     * </p>
     * 
     * @param properties
     *        A list of instanceProperty objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see InstanceProperty#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param seenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     */

    public void setSeenAt(java.util.Date seenAt) {
        this.seenAt = seenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @return The ISO-8601 time stamp of when the certificate was last used in a <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation.
     */

    public java.util.Date getSeenAt() {
        return this.seenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param seenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProperty withSeenAt(java.util.Date seenAt) {
        setSeenAt(seenAt);
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
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getSeenAt() != null)
            sb.append("SeenAt: ").append(getSeenAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceProperty == false)
            return false;
        InstanceProperty other = (InstanceProperty) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getSeenAt() == null ^ this.getSeenAt() == null)
            return false;
        if (other.getSeenAt() != null && other.getSeenAt().equals(this.getSeenAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getSeenAt() == null) ? 0 : getSeenAt().hashCode());
        return hashCode;
    }

    @Override
    public InstanceProperty clone() {
        try {
            return (InstanceProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.InstancePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
