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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Each entry contains a Storage Lens group that exists in the specified home Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensGroupEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageLensGroupEntry implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the name of the Storage Lens group that exists in the specified home Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * </p>
     */
    private String storageLensGroupArn;
    /**
     * <p>
     * Contains the Amazon Web Services Region where the Storage Lens group was created.
     * </p>
     */
    private String homeRegion;

    /**
     * <p>
     * Contains the name of the Storage Lens group that exists in the specified home Region.
     * </p>
     * 
     * @param name
     *        Contains the name of the Storage Lens group that exists in the specified home Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Contains the name of the Storage Lens group that exists in the specified home Region.
     * </p>
     * 
     * @return Contains the name of the Storage Lens group that exists in the specified home Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Contains the name of the Storage Lens group that exists in the specified home Region.
     * </p>
     * 
     * @param name
     *        Contains the name of the Storage Lens group that exists in the specified home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * </p>
     * 
     * @param storageLensGroupArn
     *        Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     */

    public void setStorageLensGroupArn(String storageLensGroupArn) {
        this.storageLensGroupArn = storageLensGroupArn;
    }

    /**
     * <p>
     * Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * </p>
     * 
     * @return Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     */

    public String getStorageLensGroupArn() {
        return this.storageLensGroupArn;
    }

    /**
     * <p>
     * Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * </p>
     * 
     * @param storageLensGroupArn
     *        Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupEntry withStorageLensGroupArn(String storageLensGroupArn) {
        setStorageLensGroupArn(storageLensGroupArn);
        return this;
    }

    /**
     * <p>
     * Contains the Amazon Web Services Region where the Storage Lens group was created.
     * </p>
     * 
     * @param homeRegion
     *        Contains the Amazon Web Services Region where the Storage Lens group was created.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * Contains the Amazon Web Services Region where the Storage Lens group was created.
     * </p>
     * 
     * @return Contains the Amazon Web Services Region where the Storage Lens group was created.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * Contains the Amazon Web Services Region where the Storage Lens group was created.
     * </p>
     * 
     * @param homeRegion
     *        Contains the Amazon Web Services Region where the Storage Lens group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageLensGroupEntry withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStorageLensGroupArn() != null)
            sb.append("StorageLensGroupArn: ").append(getStorageLensGroupArn()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStorageLensGroupEntry == false)
            return false;
        ListStorageLensGroupEntry other = (ListStorageLensGroupEntry) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStorageLensGroupArn() == null ^ this.getStorageLensGroupArn() == null)
            return false;
        if (other.getStorageLensGroupArn() != null && other.getStorageLensGroupArn().equals(this.getStorageLensGroupArn()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStorageLensGroupArn() == null) ? 0 : getStorageLensGroupArn().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageLensGroupEntry clone() {
        try {
            return (ListStorageLensGroupEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
