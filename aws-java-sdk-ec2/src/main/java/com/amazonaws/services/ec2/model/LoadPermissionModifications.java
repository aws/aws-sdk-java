/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes modifications to the load permissions of an Amazon FPGA image (AFI).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LoadPermissionModifications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadPermissionModifications implements Serializable, Cloneable {

    /**
     * <p>
     * The load permissions to add.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadPermissionRequest> add;
    /**
     * <p>
     * The load permissions to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadPermissionRequest> remove;

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * 
     * @return The load permissions to add.
     */

    public java.util.List<LoadPermissionRequest> getAdd() {
        if (add == null) {
            add = new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>();
        }
        return add;
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * 
     * @param add
     *        The load permissions to add.
     */

    public void setAdd(java.util.Collection<LoadPermissionRequest> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>(add);
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdd(java.util.Collection)} or {@link #withAdd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param add
     *        The load permissions to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadPermissionModifications withAdd(LoadPermissionRequest... add) {
        if (this.add == null) {
            setAdd(new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>(add.length));
        }
        for (LoadPermissionRequest ele : add) {
            this.add.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The load permissions to add.
     * </p>
     * 
     * @param add
     *        The load permissions to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadPermissionModifications withAdd(java.util.Collection<LoadPermissionRequest> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * 
     * @return The load permissions to remove.
     */

    public java.util.List<LoadPermissionRequest> getRemove() {
        if (remove == null) {
            remove = new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>();
        }
        return remove;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * 
     * @param remove
     *        The load permissions to remove.
     */

    public void setRemove(java.util.Collection<LoadPermissionRequest> remove) {
        if (remove == null) {
            this.remove = null;
            return;
        }

        this.remove = new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>(remove);
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemove(java.util.Collection)} or {@link #withRemove(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param remove
     *        The load permissions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadPermissionModifications withRemove(LoadPermissionRequest... remove) {
        if (this.remove == null) {
            setRemove(new com.amazonaws.internal.SdkInternalList<LoadPermissionRequest>(remove.length));
        }
        for (LoadPermissionRequest ele : remove) {
            this.remove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The load permissions to remove.
     * </p>
     * 
     * @param remove
     *        The load permissions to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadPermissionModifications withRemove(java.util.Collection<LoadPermissionRequest> remove) {
        setRemove(remove);
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
        if (getAdd() != null)
            sb.append("Add: ").append(getAdd()).append(",");
        if (getRemove() != null)
            sb.append("Remove: ").append(getRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadPermissionModifications == false)
            return false;
        LoadPermissionModifications other = (LoadPermissionModifications) obj;
        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getRemove() == null ^ this.getRemove() == null)
            return false;
        if (other.getRemove() != null && other.getRemove().equals(this.getRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getRemove() == null) ? 0 : getRemove().hashCode());
        return hashCode;
    }

    @Override
    public LoadPermissionModifications clone() {
        try {
            return (LoadPermissionModifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
