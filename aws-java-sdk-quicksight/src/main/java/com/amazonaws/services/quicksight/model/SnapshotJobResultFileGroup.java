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
 * A structure that contains information on the generated snapshot file groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotJobResultFileGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJobResultFileGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects.
     * </p>
     */
    private java.util.List<SnapshotFile> files;
    /**
     * <p>
     * A list of <code>SnapshotJobS3Result</code> objects.
     * </p>
     */
    private java.util.List<SnapshotJobS3Result> s3Results;

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects.
     * </p>
     * 
     * @return A list of <code>SnapshotFile</code> objects.
     */

    public java.util.List<SnapshotFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * A list of <code>SnapshotFile</code> objects.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects.
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
     * A list of <code>SnapshotFile</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResultFileGroup withFiles(SnapshotFile... files) {
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
     * A list of <code>SnapshotFile</code> objects.
     * </p>
     * 
     * @param files
     *        A list of <code>SnapshotFile</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResultFileGroup withFiles(java.util.Collection<SnapshotFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobS3Result</code> objects.
     * </p>
     * 
     * @return A list of <code>SnapshotJobS3Result</code> objects.
     */

    public java.util.List<SnapshotJobS3Result> getS3Results() {
        return s3Results;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobS3Result</code> objects.
     * </p>
     * 
     * @param s3Results
     *        A list of <code>SnapshotJobS3Result</code> objects.
     */

    public void setS3Results(java.util.Collection<SnapshotJobS3Result> s3Results) {
        if (s3Results == null) {
            this.s3Results = null;
            return;
        }

        this.s3Results = new java.util.ArrayList<SnapshotJobS3Result>(s3Results);
    }

    /**
     * <p>
     * A list of <code>SnapshotJobS3Result</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Results(java.util.Collection)} or {@link #withS3Results(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Results
     *        A list of <code>SnapshotJobS3Result</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResultFileGroup withS3Results(SnapshotJobS3Result... s3Results) {
        if (this.s3Results == null) {
            setS3Results(new java.util.ArrayList<SnapshotJobS3Result>(s3Results.length));
        }
        for (SnapshotJobS3Result ele : s3Results) {
            this.s3Results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobS3Result</code> objects.
     * </p>
     * 
     * @param s3Results
     *        A list of <code>SnapshotJobS3Result</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResultFileGroup withS3Results(java.util.Collection<SnapshotJobS3Result> s3Results) {
        setS3Results(s3Results);
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
            sb.append("Files: ").append(getFiles()).append(",");
        if (getS3Results() != null)
            sb.append("S3Results: ").append(getS3Results());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotJobResultFileGroup == false)
            return false;
        SnapshotJobResultFileGroup other = (SnapshotJobResultFileGroup) obj;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getS3Results() == null ^ this.getS3Results() == null)
            return false;
        if (other.getS3Results() != null && other.getS3Results().equals(this.getS3Results()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getS3Results() == null) ? 0 : getS3Results().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotJobResultFileGroup clone() {
        try {
            return (SnapshotJobResultFileGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotJobResultFileGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
