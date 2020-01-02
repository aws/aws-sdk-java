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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Contains identification and configuration information for one or more access points associated with the specified
     * bucket.
     * </p>
     */
    private java.util.List<AccessPoint> accessPointList;
    /**
     * <p>
     * If the specified bucket has more access points than can be returned in one call to this API, then this field
     * contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access
     * points.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains identification and configuration information for one or more access points associated with the specified
     * bucket.
     * </p>
     * 
     * @return Contains identification and configuration information for one or more access points associated with the
     *         specified bucket.
     */

    public java.util.List<AccessPoint> getAccessPointList() {
        return accessPointList;
    }

    /**
     * <p>
     * Contains identification and configuration information for one or more access points associated with the specified
     * bucket.
     * </p>
     * 
     * @param accessPointList
     *        Contains identification and configuration information for one or more access points associated with the
     *        specified bucket.
     */

    public void setAccessPointList(java.util.Collection<AccessPoint> accessPointList) {
        if (accessPointList == null) {
            this.accessPointList = null;
            return;
        }

        this.accessPointList = new java.util.ArrayList<AccessPoint>(accessPointList);
    }

    /**
     * <p>
     * Contains identification and configuration information for one or more access points associated with the specified
     * bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessPointList(java.util.Collection)} or {@link #withAccessPointList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accessPointList
     *        Contains identification and configuration information for one or more access points associated with the
     *        specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsResult withAccessPointList(AccessPoint... accessPointList) {
        if (this.accessPointList == null) {
            setAccessPointList(new java.util.ArrayList<AccessPoint>(accessPointList.length));
        }
        for (AccessPoint ele : accessPointList) {
            this.accessPointList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains identification and configuration information for one or more access points associated with the specified
     * bucket.
     * </p>
     * 
     * @param accessPointList
     *        Contains identification and configuration information for one or more access points associated with the
     *        specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsResult withAccessPointList(java.util.Collection<AccessPoint> accessPointList) {
        setAccessPointList(accessPointList);
        return this;
    }

    /**
     * <p>
     * If the specified bucket has more access points than can be returned in one call to this API, then this field
     * contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access
     * points.
     * </p>
     * 
     * @param nextToken
     *        If the specified bucket has more access points than can be returned in one call to this API, then this
     *        field contains a continuation token that you can provide in subsequent calls to this API to retrieve
     *        additional access points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the specified bucket has more access points than can be returned in one call to this API, then this field
     * contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access
     * points.
     * </p>
     * 
     * @return If the specified bucket has more access points than can be returned in one call to this API, then this
     *         field contains a continuation token that you can provide in subsequent calls to this API to retrieve
     *         additional access points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the specified bucket has more access points than can be returned in one call to this API, then this field
     * contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access
     * points.
     * </p>
     * 
     * @param nextToken
     *        If the specified bucket has more access points than can be returned in one call to this API, then this
     *        field contains a continuation token that you can provide in subsequent calls to this API to retrieve
     *        additional access points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsResult withNextToken(String nextToken) {
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
        if (getAccessPointList() != null)
            sb.append("AccessPointList: ").append(getAccessPointList()).append(",");
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

        if (obj instanceof ListAccessPointsResult == false)
            return false;
        ListAccessPointsResult other = (ListAccessPointsResult) obj;
        if (other.getAccessPointList() == null ^ this.getAccessPointList() == null)
            return false;
        if (other.getAccessPointList() != null && other.getAccessPointList().equals(this.getAccessPointList()) == false)
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

        hashCode = prime * hashCode + ((getAccessPointList() == null) ? 0 : getAccessPointList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPointsResult clone() {
        try {
            return (ListAccessPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
