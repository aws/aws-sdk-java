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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information on the snapshot files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotFileGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotFileGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need to be
     * generated. This structure can hold 1 configuration at a time.
     * </p>
     */
    private java.util.List<SnapshotFile> files;

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need to be
     * generated. This structure can hold 1 configuration at a time.
     * </p>
     * 
     * @return A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need
     *         to be generated. This structure can hold 1 configuration at a time.
     */

    public java.util.List<SnapshotFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need to be
     * generated. This structure can hold 1 configuration at a time.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need
     *        to be generated. This structure can hold 1 configuration at a time.
     */

    public void setFiles(java.util.Collection<SnapshotFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<SnapshotFile>(files);
    }

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need to be
     * generated. This structure can hold 1 configuration at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need
     *        to be generated. This structure can hold 1 configuration at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFileGroup withFiles(SnapshotFile... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<SnapshotFile>(files.length));
        }
        for (SnapshotFile ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need to be
     * generated. This structure can hold 1 configuration at a time.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects that contain the information on the snapshot files that need
     *        to be generated. This structure can hold 1 configuration at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFileGroup withFiles(java.util.Collection<SnapshotFile> files) {
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

        if (obj instanceof SnapshotFileGroup == false)
            return false;
        SnapshotFileGroup other = (SnapshotFileGroup) obj;
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
    public SnapshotFileGroup clone() {
        try {
            return (SnapshotFileGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotFileGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
