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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * </p>
     */
    private java.util.List<Volume> volumes;

    private String nextToken;

    /**
     * <p>
     * Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * </p>
     * 
     * @return Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     */

    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * </p>
     * 
     * @param volumes
     *        Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * </p>
     * 
     * @param volumes
     *        Returned after a successful <code>DescribeVolumes</code> operation, describing each volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumesResult == false)
            return false;
        DescribeVolumesResult other = (DescribeVolumesResult) obj;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesResult clone() {
        try {
            return (DescribeVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
