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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListMultiRegionAccessPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultiRegionAccessPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Multi-Region Access Points associated with the user.
     * </p>
     */
    private java.util.List<MultiRegionAccessPointReport> accessPoints;
    /**
     * <p>
     * If the specified bucket has more Multi-Region Access Points than can be returned in one call to this action, this
     * field contains a continuation token. You can use this token tin subsequent calls to this action to retrieve
     * additional Multi-Region Access Points.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of Multi-Region Access Points associated with the user.
     * </p>
     * 
     * @return The list of Multi-Region Access Points associated with the user.
     */

    public java.util.List<MultiRegionAccessPointReport> getAccessPoints() {
        return accessPoints;
    }

    /**
     * <p>
     * The list of Multi-Region Access Points associated with the user.
     * </p>
     * 
     * @param accessPoints
     *        The list of Multi-Region Access Points associated with the user.
     */

    public void setAccessPoints(java.util.Collection<MultiRegionAccessPointReport> accessPoints) {
        if (accessPoints == null) {
            this.accessPoints = null;
            return;
        }

        this.accessPoints = new java.util.ArrayList<MultiRegionAccessPointReport>(accessPoints);
    }

    /**
     * <p>
     * The list of Multi-Region Access Points associated with the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessPoints(java.util.Collection)} or {@link #withAccessPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessPoints
     *        The list of Multi-Region Access Points associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiRegionAccessPointsResult withAccessPoints(MultiRegionAccessPointReport... accessPoints) {
        if (this.accessPoints == null) {
            setAccessPoints(new java.util.ArrayList<MultiRegionAccessPointReport>(accessPoints.length));
        }
        for (MultiRegionAccessPointReport ele : accessPoints) {
            this.accessPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Multi-Region Access Points associated with the user.
     * </p>
     * 
     * @param accessPoints
     *        The list of Multi-Region Access Points associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiRegionAccessPointsResult withAccessPoints(java.util.Collection<MultiRegionAccessPointReport> accessPoints) {
        setAccessPoints(accessPoints);
        return this;
    }

    /**
     * <p>
     * If the specified bucket has more Multi-Region Access Points than can be returned in one call to this action, this
     * field contains a continuation token. You can use this token tin subsequent calls to this action to retrieve
     * additional Multi-Region Access Points.
     * </p>
     * 
     * @param nextToken
     *        If the specified bucket has more Multi-Region Access Points than can be returned in one call to this
     *        action, this field contains a continuation token. You can use this token tin subsequent calls to this
     *        action to retrieve additional Multi-Region Access Points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the specified bucket has more Multi-Region Access Points than can be returned in one call to this action, this
     * field contains a continuation token. You can use this token tin subsequent calls to this action to retrieve
     * additional Multi-Region Access Points.
     * </p>
     * 
     * @return If the specified bucket has more Multi-Region Access Points than can be returned in one call to this
     *         action, this field contains a continuation token. You can use this token tin subsequent calls to this
     *         action to retrieve additional Multi-Region Access Points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the specified bucket has more Multi-Region Access Points than can be returned in one call to this action, this
     * field contains a continuation token. You can use this token tin subsequent calls to this action to retrieve
     * additional Multi-Region Access Points.
     * </p>
     * 
     * @param nextToken
     *        If the specified bucket has more Multi-Region Access Points than can be returned in one call to this
     *        action, this field contains a continuation token. You can use this token tin subsequent calls to this
     *        action to retrieve additional Multi-Region Access Points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiRegionAccessPointsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListMultiRegionAccessPointsResult == false)
            return false;
        ListMultiRegionAccessPointsResult other = (ListMultiRegionAccessPointsResult) obj;
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
    public ListMultiRegionAccessPointsResult clone() {
        try {
            return (ListMultiRegionAccessPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
