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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains total number of infected files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ThreatsDetectedItemCount" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThreatsDetectedItemCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of infected files.
     * </p>
     */
    private Integer files;

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @param files
     *        Total number of infected files.
     */

    public void setFiles(Integer files) {
        this.files = files;
    }

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @return Total number of infected files.
     */

    public Integer getFiles() {
        return this.files;
    }

    /**
     * <p>
     * Total number of infected files.
     * </p>
     * 
     * @param files
     *        Total number of infected files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatsDetectedItemCount withFiles(Integer files) {
        setFiles(files);
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
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatsDetectedItemCount == false)
            return false;
        ThreatsDetectedItemCount other = (ThreatsDetectedItemCount) obj;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        return hashCode;
    }

    @Override
    public ThreatsDetectedItemCount clone() {
        try {
            return (ThreatsDetectedItemCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ThreatsDetectedItemCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
