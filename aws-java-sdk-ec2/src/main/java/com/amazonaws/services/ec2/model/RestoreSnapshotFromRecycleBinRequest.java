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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RestoreSnapshotFromRecycleBinRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSnapshotFromRecycleBinRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RestoreSnapshotFromRecycleBinRequest> {

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to restore.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @return The ID of the snapshot to restore.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotFromRecycleBinRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RestoreSnapshotFromRecycleBinRequest> getDryRunRequest() {
        Request<RestoreSnapshotFromRecycleBinRequest> request = new RestoreSnapshotFromRecycleBinRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSnapshotFromRecycleBinRequest == false)
            return false;
        RestoreSnapshotFromRecycleBinRequest other = (RestoreSnapshotFromRecycleBinRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public RestoreSnapshotFromRecycleBinRequest clone() {
        return (RestoreSnapshotFromRecycleBinRequest) super.clone();
    }
}
