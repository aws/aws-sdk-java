/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A key group.
 * </p>
 * <p>
 * A key group contains a list of public keys that you can use with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed URLs
 * and signed cookies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the key group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time when the key group was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The key group configuration.
     * </p>
     */
    private KeyGroupConfig keyGroupConfig;

    /**
     * <p>
     * The identifier for the key group.
     * </p>
     * 
     * @param id
     *        The identifier for the key group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the key group.
     * </p>
     * 
     * @return The identifier for the key group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the key group.
     * </p>
     * 
     * @param id
     *        The identifier for the key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time when the key group was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the key group was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the key group was last modified.
     * </p>
     * 
     * @return The date and time when the key group was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the key group was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the key group was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroup withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @param keyGroupConfig
     *        The key group configuration.
     */

    public void setKeyGroupConfig(KeyGroupConfig keyGroupConfig) {
        this.keyGroupConfig = keyGroupConfig;
    }

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @return The key group configuration.
     */

    public KeyGroupConfig getKeyGroupConfig() {
        return this.keyGroupConfig;
    }

    /**
     * <p>
     * The key group configuration.
     * </p>
     * 
     * @param keyGroupConfig
     *        The key group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroup withKeyGroupConfig(KeyGroupConfig keyGroupConfig) {
        setKeyGroupConfig(keyGroupConfig);
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
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getKeyGroupConfig() != null)
            sb.append("KeyGroupConfig: ").append(getKeyGroupConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyGroup == false)
            return false;
        KeyGroup other = (KeyGroup) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getKeyGroupConfig() == null ^ this.getKeyGroupConfig() == null)
            return false;
        if (other.getKeyGroupConfig() != null && other.getKeyGroupConfig().equals(this.getKeyGroupConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getKeyGroupConfig() == null) ? 0 : getKeyGroupConfig().hashCode());
        return hashCode;
    }

    @Override
    public KeyGroup clone() {
        try {
            return (KeyGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
