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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A package summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/PackageListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the package was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The package's ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * The package's name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The package's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @param arn
     *        The package's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @return The package's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @param arn
     *        The package's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the package was created.
     * </p>
     * 
     * @param createdTime
     *        When the package was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the package was created.
     * </p>
     * 
     * @return When the package was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the package was created.
     * </p>
     * 
     * @param createdTime
     *        When the package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @return The package's ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * The package's name.
     * </p>
     * 
     * @param packageName
     *        The package's name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The package's name.
     * </p>
     * 
     * @return The package's name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The package's name.
     * </p>
     * 
     * @param packageName
     *        The package's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The package's tags.
     * </p>
     * 
     * @return The package's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The package's tags.
     * </p>
     * 
     * @param tags
     *        The package's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The package's tags.
     * </p>
     * 
     * @param tags
     *        The package's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PackageListItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageListItem clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageListItem == false)
            return false;
        PackageListItem other = (PackageListItem) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PackageListItem clone() {
        try {
            return (PackageListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.PackageListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
