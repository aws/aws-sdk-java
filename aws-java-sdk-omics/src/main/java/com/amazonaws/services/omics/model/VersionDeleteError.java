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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The error preventing deletion of the annotation store version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/VersionDeleteError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionDeleteError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name given to an annotation store version.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The message explaining the error in annotation store deletion.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The name given to an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version.
     * </p>
     * 
     * @return The name given to an annotation store version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionDeleteError withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The message explaining the error in annotation store deletion.
     * </p>
     * 
     * @param message
     *        The message explaining the error in annotation store deletion.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message explaining the error in annotation store deletion.
     * </p>
     * 
     * @return The message explaining the error in annotation store deletion.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message explaining the error in annotation store deletion.
     * </p>
     * 
     * @param message
     *        The message explaining the error in annotation store deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionDeleteError withMessage(String message) {
        setMessage(message);
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
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionDeleteError == false)
            return false;
        VersionDeleteError other = (VersionDeleteError) obj;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public VersionDeleteError clone() {
        try {
            return (VersionDeleteError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.VersionDeleteErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
