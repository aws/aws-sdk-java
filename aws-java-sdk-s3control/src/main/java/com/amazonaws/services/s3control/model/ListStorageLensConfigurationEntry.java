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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Part of <code>ListStorageLensConfigurationResult</code>. Each entry includes the description of the S3 Storage Lens
 * configuration, its home Region, whether it is enabled, its Amazon Resource Name (ARN), and config ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurationEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageLensConfigurationEntry implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the S3 Storage Lens configuration ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the S3 Storage Lens configuration. This property is read-only.
     * </p>
     */
    private String storageLensArn;
    /**
     * <p>
     * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3
     * Storage Lens home Region.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * </p>
     */
    private Boolean isEnabled;

    /**
     * <p>
     * A container for the S3 Storage Lens configuration ID.
     * </p>
     * 
     * @param id
     *        A container for the S3 Storage Lens configuration ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens configuration ID.
     * </p>
     * 
     * @return A container for the S3 Storage Lens configuration ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens configuration ID.
     * </p>
     * 
     * @param id
     *        A container for the S3 Storage Lens configuration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the S3 Storage Lens configuration. This property is read-only.
     * </p>
     * 
     * @param storageLensArn
     *        The ARN of the S3 Storage Lens configuration. This property is read-only.
     */

    public void setStorageLensArn(String storageLensArn) {
        this.storageLensArn = storageLensArn;
    }

    /**
     * <p>
     * The ARN of the S3 Storage Lens configuration. This property is read-only.
     * </p>
     * 
     * @return The ARN of the S3 Storage Lens configuration. This property is read-only.
     */

    public String getStorageLensArn() {
        return this.storageLensArn;
    }

    /**
     * <p>
     * The ARN of the S3 Storage Lens configuration. This property is read-only.
     * </p>
     * 
     * @param storageLensArn
     *        The ARN of the S3 Storage Lens configuration. This property is read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationEntry withStorageLensArn(String storageLensArn) {
        setStorageLensArn(storageLensArn);
        return this;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3
     * Storage Lens home Region.
     * </p>
     * 
     * @param homeRegion
     *        A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your
     *        designated S3 Storage Lens home Region.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3
     * Storage Lens home Region.
     * </p>
     * 
     * @return A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your
     *         designated S3 Storage Lens home Region.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your designated S3
     * Storage Lens home Region.
     * </p>
     * 
     * @param homeRegion
     *        A container for the S3 Storage Lens home Region. Your metrics data is stored and retained in your
     *        designated S3 Storage Lens home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationEntry withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * </p>
     * 
     * @return A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensConfigurationEntry withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     * </p>
     * 
     * @return A container for whether the S3 Storage Lens configuration is enabled. This property is required.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
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
        if (getStorageLensArn() != null)
            sb.append("StorageLensArn: ").append(getStorageLensArn()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStorageLensConfigurationEntry == false)
            return false;
        ListStorageLensConfigurationEntry other = (ListStorageLensConfigurationEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStorageLensArn() == null ^ this.getStorageLensArn() == null)
            return false;
        if (other.getStorageLensArn() != null && other.getStorageLensArn().equals(this.getStorageLensArn()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStorageLensArn() == null) ? 0 : getStorageLensArn().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageLensConfigurationEntry clone() {
        try {
            return (ListStorageLensConfigurationEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
