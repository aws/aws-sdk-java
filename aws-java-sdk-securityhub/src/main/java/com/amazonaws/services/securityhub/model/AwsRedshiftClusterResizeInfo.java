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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the resize operation for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterResizeInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterResizeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the resize operation can be canceled.
     * </p>
     */
    private Boolean allowCancelResize;
    /**
     * <p>
     * The type of resize operation.
     * </p>
     * <p>
     * Valid values: <code>ClassicResize</code>
     * </p>
     */
    private String resizeType;

    /**
     * <p>
     * Indicates whether the resize operation can be canceled.
     * </p>
     * 
     * @param allowCancelResize
     *        Indicates whether the resize operation can be canceled.
     */

    public void setAllowCancelResize(Boolean allowCancelResize) {
        this.allowCancelResize = allowCancelResize;
    }

    /**
     * <p>
     * Indicates whether the resize operation can be canceled.
     * </p>
     * 
     * @return Indicates whether the resize operation can be canceled.
     */

    public Boolean getAllowCancelResize() {
        return this.allowCancelResize;
    }

    /**
     * <p>
     * Indicates whether the resize operation can be canceled.
     * </p>
     * 
     * @param allowCancelResize
     *        Indicates whether the resize operation can be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterResizeInfo withAllowCancelResize(Boolean allowCancelResize) {
        setAllowCancelResize(allowCancelResize);
        return this;
    }

    /**
     * <p>
     * Indicates whether the resize operation can be canceled.
     * </p>
     * 
     * @return Indicates whether the resize operation can be canceled.
     */

    public Boolean isAllowCancelResize() {
        return this.allowCancelResize;
    }

    /**
     * <p>
     * The type of resize operation.
     * </p>
     * <p>
     * Valid values: <code>ClassicResize</code>
     * </p>
     * 
     * @param resizeType
     *        The type of resize operation.</p>
     *        <p>
     *        Valid values: <code>ClassicResize</code>
     */

    public void setResizeType(String resizeType) {
        this.resizeType = resizeType;
    }

    /**
     * <p>
     * The type of resize operation.
     * </p>
     * <p>
     * Valid values: <code>ClassicResize</code>
     * </p>
     * 
     * @return The type of resize operation.</p>
     *         <p>
     *         Valid values: <code>ClassicResize</code>
     */

    public String getResizeType() {
        return this.resizeType;
    }

    /**
     * <p>
     * The type of resize operation.
     * </p>
     * <p>
     * Valid values: <code>ClassicResize</code>
     * </p>
     * 
     * @param resizeType
     *        The type of resize operation.</p>
     *        <p>
     *        Valid values: <code>ClassicResize</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterResizeInfo withResizeType(String resizeType) {
        setResizeType(resizeType);
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
        if (getAllowCancelResize() != null)
            sb.append("AllowCancelResize: ").append(getAllowCancelResize()).append(",");
        if (getResizeType() != null)
            sb.append("ResizeType: ").append(getResizeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterResizeInfo == false)
            return false;
        AwsRedshiftClusterResizeInfo other = (AwsRedshiftClusterResizeInfo) obj;
        if (other.getAllowCancelResize() == null ^ this.getAllowCancelResize() == null)
            return false;
        if (other.getAllowCancelResize() != null && other.getAllowCancelResize().equals(this.getAllowCancelResize()) == false)
            return false;
        if (other.getResizeType() == null ^ this.getResizeType() == null)
            return false;
        if (other.getResizeType() != null && other.getResizeType().equals(this.getResizeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowCancelResize() == null) ? 0 : getAllowCancelResize().hashCode());
        hashCode = prime * hashCode + ((getResizeType() == null) ? 0 : getResizeType().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterResizeInfo clone() {
        try {
            return (AwsRedshiftClusterResizeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterResizeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
