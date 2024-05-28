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
 * A custom grouping of objects that include filters for prefixes, suffixes, object tags, object size, or object age.
 * You can create an S3 Storage Lens group that includes a single filter or multiple filter conditions. To specify
 * multiple filter conditions, you use <code>AND</code> or <code>OR</code> logical operators.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroup implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the name of the Storage Lens group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     * <code>AND</code> or <code>OR</code> logical operator is used.
     * </p>
     */
    private StorageLensGroupFilter filter;
    /**
     * <p>
     * Contains the Amazon Resource Name (ARN) of the Storage Lens group. This property is read-only.
     * </p>
     */
    private String storageLensGroupArn;

    /**
     * <p>
     * Contains the name of the Storage Lens group.
     * </p>
     * 
     * @param name
     *        Contains the name of the Storage Lens group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Contains the name of the Storage Lens group.
     * </p>
     * 
     * @return Contains the name of the Storage Lens group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Contains the name of the Storage Lens group.
     * </p>
     * 
     * @param name
     *        Contains the name of the Storage Lens group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     * <code>AND</code> or <code>OR</code> logical operator is used.
     * </p>
     * 
     * @param filter
     *        Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     *        <code>AND</code> or <code>OR</code> logical operator is used.
     */

    public void setFilter(StorageLensGroupFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     * <code>AND</code> or <code>OR</code> logical operator is used.
     * </p>
     * 
     * @return Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     *         <code>AND</code> or <code>OR</code> logical operator is used.
     */

    public StorageLensGroupFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     * <code>AND</code> or <code>OR</code> logical operator is used.
     * </p>
     * 
     * @param filter
     *        Sets the criteria for the Storage Lens group data that is displayed. For multiple filter conditions, the
     *        <code>AND</code> or <code>OR</code> logical operator is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroup withFilter(StorageLensGroupFilter filter) {
        setFilter(filter);
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

    public StorageLensGroup withStorageLensGroupArn(String storageLensGroupArn) {
        setStorageLensGroupArn(storageLensGroupArn);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getStorageLensGroupArn() != null)
            sb.append("StorageLensGroupArn: ").append(getStorageLensGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensGroup == false)
            return false;
        StorageLensGroup other = (StorageLensGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStorageLensGroupArn() == null ^ this.getStorageLensGroupArn() == null)
            return false;
        if (other.getStorageLensGroupArn() != null && other.getStorageLensGroupArn().equals(this.getStorageLensGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getStorageLensGroupArn() == null) ? 0 : getStorageLensGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensGroup clone() {
        try {
            return (StorageLensGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
