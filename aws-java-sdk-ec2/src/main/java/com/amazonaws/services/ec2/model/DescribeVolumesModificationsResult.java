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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesModificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VolumeModification> volumesModifications;
    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * 
     * @return Information about the volume modifications.
     */

    public java.util.List<VolumeModification> getVolumesModifications() {
        if (volumesModifications == null) {
            volumesModifications = new com.amazonaws.internal.SdkInternalList<VolumeModification>();
        }
        return volumesModifications;
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * 
     * @param volumesModifications
     *        Information about the volume modifications.
     */

    public void setVolumesModifications(java.util.Collection<VolumeModification> volumesModifications) {
        if (volumesModifications == null) {
            this.volumesModifications = null;
            return;
        }

        this.volumesModifications = new com.amazonaws.internal.SdkInternalList<VolumeModification>(volumesModifications);
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumesModifications(java.util.Collection)} or {@link #withVolumesModifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param volumesModifications
     *        Information about the volume modifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsResult withVolumesModifications(VolumeModification... volumesModifications) {
        if (this.volumesModifications == null) {
            setVolumesModifications(new com.amazonaws.internal.SdkInternalList<VolumeModification>(volumesModifications.length));
        }
        for (VolumeModification ele : volumesModifications) {
            this.volumesModifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * 
     * @param volumesModifications
     *        Information about the volume modifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsResult withVolumesModifications(java.util.Collection<VolumeModification> volumesModifications) {
        setVolumesModifications(volumesModifications);
        return this;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     * 
     * @param nextToken
     *        Token for pagination, null if there are no more results
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     * 
     * @return Token for pagination, null if there are no more results
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     * 
     * @param nextToken
     *        Token for pagination, null if there are no more results
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsResult withNextToken(String nextToken) {
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
        if (getVolumesModifications() != null)
            sb.append("VolumesModifications: ").append(getVolumesModifications()).append(",");
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

        if (obj instanceof DescribeVolumesModificationsResult == false)
            return false;
        DescribeVolumesModificationsResult other = (DescribeVolumesModificationsResult) obj;
        if (other.getVolumesModifications() == null ^ this.getVolumesModifications() == null)
            return false;
        if (other.getVolumesModifications() != null && other.getVolumesModifications().equals(this.getVolumesModifications()) == false)
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

        hashCode = prime * hashCode + ((getVolumesModifications() == null) ? 0 : getVolumesModifications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesModificationsResult clone() {
        try {
            return (DescribeVolumesModificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
