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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The identifier for the snapshot delete.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     * </p>
     */
    private java.util.Date snapshotCreationTimestamp;

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @return The name of an existing application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationSnapshotRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The identifier for the snapshot delete.
     * </p>
     * 
     * @param snapshotName
     *        The identifier for the snapshot delete.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The identifier for the snapshot delete.
     * </p>
     * 
     * @return The identifier for the snapshot delete.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The identifier for the snapshot delete.
     * </p>
     * 
     * @param snapshotName
     *        The identifier for the snapshot delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     * </p>
     * 
     * @param snapshotCreationTimestamp
     *        The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     */

    public void setSnapshotCreationTimestamp(java.util.Date snapshotCreationTimestamp) {
        this.snapshotCreationTimestamp = snapshotCreationTimestamp;
    }

    /**
     * <p>
     * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     * </p>
     * 
     * @return The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     */

    public java.util.Date getSnapshotCreationTimestamp() {
        return this.snapshotCreationTimestamp;
    }

    /**
     * <p>
     * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     * </p>
     * 
     * @param snapshotCreationTimestamp
     *        The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationSnapshotRequest withSnapshotCreationTimestamp(java.util.Date snapshotCreationTimestamp) {
        setSnapshotCreationTimestamp(snapshotCreationTimestamp);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotCreationTimestamp() != null)
            sb.append("SnapshotCreationTimestamp: ").append(getSnapshotCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationSnapshotRequest == false)
            return false;
        DeleteApplicationSnapshotRequest other = (DeleteApplicationSnapshotRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotCreationTimestamp() == null ^ this.getSnapshotCreationTimestamp() == null)
            return false;
        if (other.getSnapshotCreationTimestamp() != null && other.getSnapshotCreationTimestamp().equals(this.getSnapshotCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreationTimestamp() == null) ? 0 : getSnapshotCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationSnapshotRequest clone() {
        return (DeleteApplicationSnapshotRequest) super.clone();
    }

}
