/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccessPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessPointDescription> accessPoints;
    /**
     * <p>
     * Present if there are more access points than returned in the response. You can use the NextMarker in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * 
     * @return An array of access point descriptions.
     */

    public java.util.List<AccessPointDescription> getAccessPoints() {
        if (accessPoints == null) {
            accessPoints = new com.amazonaws.internal.SdkInternalList<AccessPointDescription>();
        }
        return accessPoints;
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * 
     * @param accessPoints
     *        An array of access point descriptions.
     */

    public void setAccessPoints(java.util.Collection<AccessPointDescription> accessPoints) {
        if (accessPoints == null) {
            this.accessPoints = null;
            return;
        }

        this.accessPoints = new com.amazonaws.internal.SdkInternalList<AccessPointDescription>(accessPoints);
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessPoints(java.util.Collection)} or {@link #withAccessPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessPoints
     *        An array of access point descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsResult withAccessPoints(AccessPointDescription... accessPoints) {
        if (this.accessPoints == null) {
            setAccessPoints(new com.amazonaws.internal.SdkInternalList<AccessPointDescription>(accessPoints.length));
        }
        for (AccessPointDescription ele : accessPoints) {
            this.accessPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of access point descriptions.
     * </p>
     * 
     * @param accessPoints
     *        An array of access point descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsResult withAccessPoints(java.util.Collection<AccessPointDescription> accessPoints) {
        setAccessPoints(accessPoints);
        return this;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response. You can use the NextMarker in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more access points than returned in the response. You can use the NextMarker in the
     *        subsequent request to fetch the additional descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response. You can use the NextMarker in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @return Present if there are more access points than returned in the response. You can use the NextMarker in the
     *         subsequent request to fetch the additional descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Present if there are more access points than returned in the response. You can use the NextMarker in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more access points than returned in the response. You can use the NextMarker in the
     *        subsequent request to fetch the additional descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsResult withNextToken(String nextToken) {
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
        if (getAccessPoints() != null)
            sb.append("AccessPoints: ").append(getAccessPoints()).append(",");
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

        if (obj instanceof DescribeAccessPointsResult == false)
            return false;
        DescribeAccessPointsResult other = (DescribeAccessPointsResult) obj;
        if (other.getAccessPoints() == null ^ this.getAccessPoints() == null)
            return false;
        if (other.getAccessPoints() != null && other.getAccessPoints().equals(this.getAccessPoints()) == false)
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

        hashCode = prime * hashCode + ((getAccessPoints() == null) ? 0 : getAccessPoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessPointsResult clone() {
        try {
            return (DescribeAccessPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
