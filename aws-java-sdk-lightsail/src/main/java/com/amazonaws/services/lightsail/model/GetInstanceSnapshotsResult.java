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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get instance snapshots request.
     * </p>
     */
    private java.util.List<InstanceSnapshot> instanceSnapshots;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get instance snapshots request.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the results of your get instance snapshots
     *         request.
     */

    public java.util.List<InstanceSnapshot> getInstanceSnapshots() {
        return instanceSnapshots;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get instance snapshots request.
     * </p>
     * 
     * @param instanceSnapshots
     *        An array of key-value pairs containing information about the results of your get instance snapshots
     *        request.
     */

    public void setInstanceSnapshots(java.util.Collection<InstanceSnapshot> instanceSnapshots) {
        if (instanceSnapshots == null) {
            this.instanceSnapshots = null;
            return;
        }

        this.instanceSnapshots = new java.util.ArrayList<InstanceSnapshot>(instanceSnapshots);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get instance snapshots request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceSnapshots(java.util.Collection)} or {@link #withInstanceSnapshots(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceSnapshots
     *        An array of key-value pairs containing information about the results of your get instance snapshots
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceSnapshotsResult withInstanceSnapshots(InstanceSnapshot... instanceSnapshots) {
        if (this.instanceSnapshots == null) {
            setInstanceSnapshots(new java.util.ArrayList<InstanceSnapshot>(instanceSnapshots.length));
        }
        for (InstanceSnapshot ele : instanceSnapshots) {
            this.instanceSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of your get instance snapshots request.
     * </p>
     * 
     * @param instanceSnapshots
     *        An array of key-value pairs containing information about the results of your get instance snapshots
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceSnapshotsResult withInstanceSnapshots(java.util.Collection<InstanceSnapshot> instanceSnapshots) {
        setInstanceSnapshots(instanceSnapshots);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get instance snapshots request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get instance snapshots request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get instance snapshots request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceSnapshotsResult withNextPageToken(String nextPageToken) {
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
        if (getInstanceSnapshots() != null)
            sb.append("InstanceSnapshots: ").append(getInstanceSnapshots()).append(",");
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

        if (obj instanceof GetInstanceSnapshotsResult == false)
            return false;
        GetInstanceSnapshotsResult other = (GetInstanceSnapshotsResult) obj;
        if (other.getInstanceSnapshots() == null ^ this.getInstanceSnapshots() == null)
            return false;
        if (other.getInstanceSnapshots() != null && other.getInstanceSnapshots().equals(this.getInstanceSnapshots()) == false)
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

        hashCode = prime * hashCode + ((getInstanceSnapshots() == null) ? 0 : getInstanceSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceSnapshotsResult clone() {
        try {
            return (GetInstanceSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
