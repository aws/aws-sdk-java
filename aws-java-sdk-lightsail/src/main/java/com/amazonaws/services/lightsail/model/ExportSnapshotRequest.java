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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     */
    private String sourceSnapshotName;

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of the instance or disk snapshot to be exported to Amazon EC2.
     */

    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * 
     * @return The name of the instance or disk snapshot to be exported to Amazon EC2.
     */

    public String getSourceSnapshotName() {
        return this.sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance or disk snapshot to be exported to Amazon EC2.
     * </p>
     * 
     * @param sourceSnapshotName
     *        The name of the instance or disk snapshot to be exported to Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        setSourceSnapshotName(sourceSnapshotName);
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
        if (getSourceSnapshotName() != null)
            sb.append("SourceSnapshotName: ").append(getSourceSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRequest == false)
            return false;
        ExportSnapshotRequest other = (ExportSnapshotRequest) obj;
        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public ExportSnapshotRequest clone() {
        return (ExportSnapshotRequest) super.clone();
    }

}
