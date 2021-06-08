/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPointsForObjectLambdaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * Returns list of Object Lambda Access Points.
     * </p>
     */
    private java.util.List<ObjectLambdaAccessPoint> objectLambdaAccessPointList;
    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns list of Object Lambda Access Points.
     * </p>
     * 
     * @return Returns list of Object Lambda Access Points.
     */

    public java.util.List<ObjectLambdaAccessPoint> getObjectLambdaAccessPointList() {
        return objectLambdaAccessPointList;
    }

    /**
     * <p>
     * Returns list of Object Lambda Access Points.
     * </p>
     * 
     * @param objectLambdaAccessPointList
     *        Returns list of Object Lambda Access Points.
     */

    public void setObjectLambdaAccessPointList(java.util.Collection<ObjectLambdaAccessPoint> objectLambdaAccessPointList) {
        if (objectLambdaAccessPointList == null) {
            this.objectLambdaAccessPointList = null;
            return;
        }

        this.objectLambdaAccessPointList = new java.util.ArrayList<ObjectLambdaAccessPoint>(objectLambdaAccessPointList);
    }

    /**
     * <p>
     * Returns list of Object Lambda Access Points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectLambdaAccessPointList(java.util.Collection)} or
     * {@link #withObjectLambdaAccessPointList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param objectLambdaAccessPointList
     *        Returns list of Object Lambda Access Points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaResult withObjectLambdaAccessPointList(ObjectLambdaAccessPoint... objectLambdaAccessPointList) {
        if (this.objectLambdaAccessPointList == null) {
            setObjectLambdaAccessPointList(new java.util.ArrayList<ObjectLambdaAccessPoint>(objectLambdaAccessPointList.length));
        }
        for (ObjectLambdaAccessPoint ele : objectLambdaAccessPointList) {
            this.objectLambdaAccessPointList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns list of Object Lambda Access Points.
     * </p>
     * 
     * @param objectLambdaAccessPointList
     *        Returns list of Object Lambda Access Points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaResult withObjectLambdaAccessPointList(java.util.Collection<ObjectLambdaAccessPoint> objectLambdaAccessPointList) {
        setObjectLambdaAccessPointList(objectLambdaAccessPointList);
        return this;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @param nextToken
     *        If the list has more access points than can be returned in one call to this API, this field contains a
     *        continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *        points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @return If the list has more access points than can be returned in one call to this API, this field contains a
     *         continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *         points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the list has more access points than can be returned in one call to this API, this field contains a
     * continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
     * </p>
     * 
     * @param nextToken
     *        If the list has more access points than can be returned in one call to this API, this field contains a
     *        continuation token that you can provide in subsequent calls to this API to retrieve additional access
     *        points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPointsForObjectLambdaResult withNextToken(String nextToken) {
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
        if (getObjectLambdaAccessPointList() != null)
            sb.append("ObjectLambdaAccessPointList: ").append(getObjectLambdaAccessPointList()).append(",");
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

        if (obj instanceof ListAccessPointsForObjectLambdaResult == false)
            return false;
        ListAccessPointsForObjectLambdaResult other = (ListAccessPointsForObjectLambdaResult) obj;
        if (other.getObjectLambdaAccessPointList() == null ^ this.getObjectLambdaAccessPointList() == null)
            return false;
        if (other.getObjectLambdaAccessPointList() != null && other.getObjectLambdaAccessPointList().equals(this.getObjectLambdaAccessPointList()) == false)
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

        hashCode = prime * hashCode + ((getObjectLambdaAccessPointList() == null) ? 0 : getObjectLambdaAccessPointList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPointsForObjectLambdaResult clone() {
        try {
            return (ListAccessPointsForObjectLambdaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
