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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiskSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects containing information about all block storage disk snapshots.
     * </p>
     */
    private java.util.List<DiskSnapshot> diskSnapshots;
    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDiskSnapshots request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects containing information about all block storage disk snapshots.
     * </p>
     * 
     * @return An array of objects containing information about all block storage disk snapshots.
     */

    public java.util.List<DiskSnapshot> getDiskSnapshots() {
        return diskSnapshots;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk snapshots.
     * </p>
     * 
     * @param diskSnapshots
     *        An array of objects containing information about all block storage disk snapshots.
     */

    public void setDiskSnapshots(java.util.Collection<DiskSnapshot> diskSnapshots) {
        if (diskSnapshots == null) {
            this.diskSnapshots = null;
            return;
        }

        this.diskSnapshots = new java.util.ArrayList<DiskSnapshot>(diskSnapshots);
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskSnapshots(java.util.Collection)} or {@link #withDiskSnapshots(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param diskSnapshots
     *        An array of objects containing information about all block storage disk snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskSnapshotsResult withDiskSnapshots(DiskSnapshot... diskSnapshots) {
        if (this.diskSnapshots == null) {
            setDiskSnapshots(new java.util.ArrayList<DiskSnapshot>(diskSnapshots.length));
        }
        for (DiskSnapshot ele : diskSnapshots) {
            this.diskSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disk snapshots.
     * </p>
     * 
     * @param diskSnapshots
     *        An array of objects containing information about all block storage disk snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskSnapshotsResult withDiskSnapshots(java.util.Collection<DiskSnapshot> diskSnapshots) {
        setDiskSnapshots(diskSnapshots);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDiskSnapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetDiskSnapshots request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDiskSnapshots request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your GetDiskSnapshots request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDiskSnapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetDiskSnapshots request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskSnapshotsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getDiskSnapshots() != null)
            sb.append("DiskSnapshots: ").append(getDiskSnapshots()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskSnapshotsResult == false)
            return false;
        GetDiskSnapshotsResult other = (GetDiskSnapshotsResult) obj;
        if (other.getDiskSnapshots() == null ^ this.getDiskSnapshots() == null)
            return false;
        if (other.getDiskSnapshots() != null && other.getDiskSnapshots().equals(this.getDiskSnapshots()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskSnapshots() == null) ? 0 : getDiskSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDiskSnapshotsResult clone() {
        try {
            return (GetDiskSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
