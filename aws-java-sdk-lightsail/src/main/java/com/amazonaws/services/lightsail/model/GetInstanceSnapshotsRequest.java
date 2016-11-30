/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetInstanceSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to the next page of results from your get instance snapshots request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get instance snapshots request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get instance snapshots request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to the next page of results from your get instance snapshots request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceSnapshotsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceSnapshotsRequest == false)
            return false;
        GetInstanceSnapshotsRequest other = (GetInstanceSnapshotsRequest) obj;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceSnapshotsRequest clone() {
        return (GetInstanceSnapshotsRequest) super.clone();
    }
}
