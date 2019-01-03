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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a resize operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResizeInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     */
    private String resizeType;
    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     */
    private Boolean allowCancelResize;

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     * 
     * @param resizeType
     *        Returns the value <code>ClassicResize</code>.
     */

    public void setResizeType(String resizeType) {
        this.resizeType = resizeType;
    }

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     * 
     * @return Returns the value <code>ClassicResize</code>.
     */

    public String getResizeType() {
        return this.resizeType;
    }

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     * 
     * @param resizeType
     *        Returns the value <code>ClassicResize</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeInfo withResizeType(String resizeType) {
        setResizeType(resizeType);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     * 
     * @param allowCancelResize
     *        A boolean value indicating if the resize operation can be cancelled.
     */

    public void setAllowCancelResize(Boolean allowCancelResize) {
        this.allowCancelResize = allowCancelResize;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     * 
     * @return A boolean value indicating if the resize operation can be cancelled.
     */

    public Boolean getAllowCancelResize() {
        return this.allowCancelResize;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     * 
     * @param allowCancelResize
     *        A boolean value indicating if the resize operation can be cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeInfo withAllowCancelResize(Boolean allowCancelResize) {
        setAllowCancelResize(allowCancelResize);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     * 
     * @return A boolean value indicating if the resize operation can be cancelled.
     */

    public Boolean isAllowCancelResize() {
        return this.allowCancelResize;
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
        if (getResizeType() != null)
            sb.append("ResizeType: ").append(getResizeType()).append(",");
        if (getAllowCancelResize() != null)
            sb.append("AllowCancelResize: ").append(getAllowCancelResize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResizeInfo == false)
            return false;
        ResizeInfo other = (ResizeInfo) obj;
        if (other.getResizeType() == null ^ this.getResizeType() == null)
            return false;
        if (other.getResizeType() != null && other.getResizeType().equals(this.getResizeType()) == false)
            return false;
        if (other.getAllowCancelResize() == null ^ this.getAllowCancelResize() == null)
            return false;
        if (other.getAllowCancelResize() != null && other.getAllowCancelResize().equals(this.getAllowCancelResize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResizeType() == null) ? 0 : getResizeType().hashCode());
        hashCode = prime * hashCode + ((getAllowCancelResize() == null) ? 0 : getAllowCancelResize().hashCode());
        return hashCode;
    }

    @Override
    public ResizeInfo clone() {
        try {
            return (ResizeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
