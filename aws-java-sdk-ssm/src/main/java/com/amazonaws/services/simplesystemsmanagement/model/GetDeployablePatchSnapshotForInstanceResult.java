/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeployablePatchSnapshotForInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     * </p>
     */
    private String snapshotDownloadUrl;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeployablePatchSnapshotForInstanceResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * 
     * @param snapshotId
     *        The user-defined snapshot ID.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * 
     * @return The user-defined snapshot ID.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The user-defined snapshot ID.
     * </p>
     * 
     * @param snapshotId
     *        The user-defined snapshot ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeployablePatchSnapshotForInstanceResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     * </p>
     * 
     * @param snapshotDownloadUrl
     *        A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     */

    public void setSnapshotDownloadUrl(String snapshotDownloadUrl) {
        this.snapshotDownloadUrl = snapshotDownloadUrl;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     * </p>
     * 
     * @return A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     */

    public String getSnapshotDownloadUrl() {
        return this.snapshotDownloadUrl;
    }

    /**
     * <p>
     * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     * </p>
     * 
     * @param snapshotDownloadUrl
     *        A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeployablePatchSnapshotForInstanceResult withSnapshotDownloadUrl(String snapshotDownloadUrl) {
        setSnapshotDownloadUrl(snapshotDownloadUrl);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getSnapshotDownloadUrl() != null)
            sb.append("SnapshotDownloadUrl: ").append(getSnapshotDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeployablePatchSnapshotForInstanceResult == false)
            return false;
        GetDeployablePatchSnapshotForInstanceResult other = (GetDeployablePatchSnapshotForInstanceResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getSnapshotDownloadUrl() == null ^ this.getSnapshotDownloadUrl() == null)
            return false;
        if (other.getSnapshotDownloadUrl() != null && other.getSnapshotDownloadUrl().equals(this.getSnapshotDownloadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotDownloadUrl() == null) ? 0 : getSnapshotDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetDeployablePatchSnapshotForInstanceResult clone() {
        try {
            return (GetDeployablePatchSnapshotForInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
