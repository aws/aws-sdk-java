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
 * A structure that contains the file groups that are requested for the artifact generation in a
 * <code>StartDashboardSnapshotJob</code> API call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnonymousUserSnapshotJobResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnonymousUserSnapshotJobResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     * requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects contain
     * the location where the snapshot artifacts are stored. If the job fails, the objects contain information about the
     * error that caused the job to fail.
     * </p>
     */
    private java.util.List<SnapshotJobResultFileGroup> fileGroups;

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     * requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects contain
     * the location where the snapshot artifacts are stored. If the job fails, the objects contain information about the
     * error that caused the job to fail.
     * </p>
     * 
     * @return A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     *         requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects
     *         contain the location where the snapshot artifacts are stored. If the job fails, the objects contain
     *         information about the error that caused the job to fail.
     */

    public java.util.List<SnapshotJobResultFileGroup> getFileGroups() {
        return fileGroups;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     * requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects contain
     * the location where the snapshot artifacts are stored. If the job fails, the objects contain information about the
     * error that caused the job to fail.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     *        requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects
     *        contain the location where the snapshot artifacts are stored. If the job fails, the objects contain
     *        information about the error that caused the job to fail.
     */

    public void setFileGroups(java.util.Collection<SnapshotJobResultFileGroup> fileGroups) {
        if (fileGroups == null) {
            this.fileGroups = null;
            return;
        }

        this.fileGroups = new java.util.ArrayList<SnapshotJobResultFileGroup>(fileGroups);
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     * requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects contain
     * the location where the snapshot artifacts are stored. If the job fails, the objects contain information about the
     * error that caused the job to fail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileGroups(java.util.Collection)} or {@link #withFileGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     *        requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects
     *        contain the location where the snapshot artifacts are stored. If the job fails, the objects contain
     *        information about the error that caused the job to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnonymousUserSnapshotJobResult withFileGroups(SnapshotJobResultFileGroup... fileGroups) {
        if (this.fileGroups == null) {
            setFileGroups(new java.util.ArrayList<SnapshotJobResultFileGroup>(fileGroups.length));
        }
        for (SnapshotJobResultFileGroup ele : fileGroups) {
            this.fileGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     * requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects contain
     * the location where the snapshot artifacts are stored. If the job fails, the objects contain information about the
     * error that caused the job to fail.
     * </p>
     * 
     * @param fileGroups
     *        A list of <code>SnapshotJobResultFileGroup</code> objects that contain information on the files that are
     *        requested during a <code>StartDashboardSnapshotJob</code> API call. If the job succeeds, these objects
     *        contain the location where the snapshot artifacts are stored. If the job fails, the objects contain
     *        information about the error that caused the job to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnonymousUserSnapshotJobResult withFileGroups(java.util.Collection<SnapshotJobResultFileGroup> fileGroups) {
        setFileGroups(fileGroups);
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
        if (getFileGroups() != null)
            sb.append("FileGroups: ").append(getFileGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnonymousUserSnapshotJobResult == false)
            return false;
        AnonymousUserSnapshotJobResult other = (AnonymousUserSnapshotJobResult) obj;
        if (other.getFileGroups() == null ^ this.getFileGroups() == null)
            return false;
        if (other.getFileGroups() != null && other.getFileGroups().equals(this.getFileGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileGroups() == null) ? 0 : getFileGroups().hashCode());
        return hashCode;
    }

    @Override
    public AnonymousUserSnapshotJobResult clone() {
        try {
            return (AnonymousUserSnapshotJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnonymousUserSnapshotJobResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
