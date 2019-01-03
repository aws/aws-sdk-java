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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDisksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects containing information about all block storage disks.
     * </p>
     */
    private java.util.List<Disk> disks;
    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDisks request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects containing information about all block storage disks.
     * </p>
     * 
     * @return An array of objects containing information about all block storage disks.
     */

    public java.util.List<Disk> getDisks() {
        return disks;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disks.
     * </p>
     * 
     * @param disks
     *        An array of objects containing information about all block storage disks.
     */

    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<Disk>(disks);
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisks(java.util.Collection)} or {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     *        An array of objects containing information about all block storage disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDisksResult withDisks(Disk... disks) {
        if (this.disks == null) {
            setDisks(new java.util.ArrayList<Disk>(disks.length));
        }
        for (Disk ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects containing information about all block storage disks.
     * </p>
     * 
     * @param disks
     *        An array of objects containing information about all block storage disks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDisksResult withDisks(java.util.Collection<Disk> disks) {
        setDisks(disks);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDisks request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetDisks request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDisks request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your GetDisks request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your GetDisks request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your GetDisks request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDisksResult withNextPageToken(String nextPageToken) {
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
        if (getDisks() != null)
            sb.append("Disks: ").append(getDisks()).append(",");
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

        if (obj instanceof GetDisksResult == false)
            return false;
        GetDisksResult other = (GetDisksResult) obj;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
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

        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDisksResult clone() {
        try {
            return (GetDisksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
